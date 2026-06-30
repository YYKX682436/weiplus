package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public abstract class m1 {
    private static final long DEFAULT_RETURN_TIMEOUT = 600000;
    private static final int LIMIT_NOT_INITIALIZED = -99;
    private static final java.lang.String TAG = "MicroMsg.NetSceneBase";
    private com.tencent.mm.network.s dispatcher;
    private boolean hasCallbackToQueue;
    private com.tencent.mm.network.v0 irr;
    private boolean isCanceled;
    private boolean isCgiProfilerEnable;
    private boolean isKinda;
    private boolean isProfileEnable;
    private long lastDispatchTimestamp;
    protected long lastdispatch;
    private int limit;
    private c01.k8 mDispatchInterceptor;
    private q01.o0 mState;
    private int netId;
    private int priority = 0;
    private com.tencent.mm.modelbase.u0 queueCallback;
    private com.tencent.mm.modelbase.q2 remoteCB;

    public m1() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.lastdispatch = android.os.SystemClock.elapsedRealtime();
        this.netId = -1;
        this.limit = -99;
        this.isCanceled = false;
        this.mState = null;
        this.isKinda = false;
        this.isCgiProfilerEnable = false;
        this.isProfileEnable = false;
        q01.o0 trackState = trackState();
        if (trackState.c()) {
            synchronized (trackState.e()) {
                trackState.e().clear();
            }
            trackState.g(0);
        }
    }

    public static /* synthetic */ void F(com.tencent.mm.modelbase.m1 m1Var, com.tencent.mm.network.l0 l0Var, int i17, com.tencent.mm.network.v0 v0Var, int i18) {
        m1Var.getClass();
        try {
            l0Var.onGYNetEnd(-1, 3, i17, "dispatch intercept", v0Var, null);
            com.tencent.mars.xlog.Log.i(TAG, "dispatcher intercept send, %s, ThreadID:%s, getType:%s", java.lang.Integer.valueOf(m1Var.netId), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), java.lang.Integer.valueOf(i18));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "callbackWrapper intercept onGYNetEnd err", new java.lang.Object[0]);
        }
    }

    public static /* synthetic */ void G(com.tencent.mm.modelbase.m1 m1Var, com.tencent.mm.network.l0 l0Var, com.tencent.mm.network.v0 v0Var, int i17) {
        m1Var.getClass();
        l0Var.onGYNetEnd(-1, 3, -1, "send to network failed", v0Var, null);
        q01.a1.f359259a.d(m1Var);
        com.tencent.mars.xlog.Log.i(TAG, "dispatcher send, %s, ThreadID:%s, getType:%s", java.lang.Integer.valueOf(m1Var.netId), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), java.lang.Integer.valueOf(i17));
    }

    public boolean accept(com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }

    public boolean acceptConcurrent(com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }

    public void callbackErrorIfNeed(int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.i(TAG, "callbackErrorIfNeed: %d, hash:%d, type:%d, errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(this.netId), java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(getType()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
    }

    public void cancel() {
        com.tencent.mm.network.s sVar;
        com.tencent.mars.xlog.Log.i(TAG, "cancel: %d, hash:%d, type:%d", java.lang.Integer.valueOf(this.netId), java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(getType()));
        this.isCanceled = true;
        com.tencent.mm.modelbase.q2 q2Var = this.remoteCB;
        if (q2Var != null) {
            q2Var.f70751g = true;
            q2Var.f70750f.removeCallbacks(q2Var.f70756o);
            q01.a1.f359259a.d(q2Var.f70752h);
        }
        int i17 = this.netId;
        if (i17 == -1 || (sVar = this.dispatcher) == null) {
            return;
        }
        this.netId = -1;
        sVar.i1(i17);
    }

    public int dispatch(com.tencent.mm.network.s sVar, final com.tencent.mm.network.v0 v0Var, com.tencent.mm.network.l0 l0Var) {
        java.util.ArrayList arrayList;
        final com.tencent.mm.network.l0 l0Var2;
        java.util.ArrayList arrayList2;
        prepareDispatcher(sVar);
        this.irr = v0Var;
        final int type = v0Var.getType();
        java.lang.String uri = v0Var.getUri();
        java.util.List list = c01.na.f37350a;
        fs.i f17 = fs.g.f(c01.ma.class);
        java.util.List list2 = c01.na.f37350a;
        if (((java.util.ArrayList) list2).size() > 0 || ((fs.f) ((fs.e) ((fs.c) f17).all()).iterator()).hasNext()) {
            synchronized (list2) {
                arrayList = new java.util.ArrayList(list2);
            }
            java.util.Iterator it = arrayList.iterator();
            final com.tencent.mm.network.l0 l0Var3 = l0Var;
            while (it.hasNext()) {
                final fz1.a aVar = (fz1.a) ((c01.la) it.next());
                aVar.getClass();
                l0Var3 = new com.tencent.mm.network.l0() { // from class: fz1.a$$b
                    @Override // com.tencent.mm.network.l0
                    public final void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var2, byte[] bArr) {
                        java.util.Map map;
                        fz1.a aVar2 = fz1.a.this;
                        aVar2.getClass();
                        com.tencent.mm.network.l0 l0Var4 = l0Var3;
                        if (l0Var4 != null) {
                            l0Var4.onGYNetEnd(i17, i18, i19, str, v0Var2, bArr);
                        }
                        if (v0Var2 == null || !cy1.a.Ui().oj() || sz1.g.i("cgi_resp", cy1.a.Ui().hj(v0Var2))) {
                            return;
                        }
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        if (currentTimeMillis - cy1.a.Ui().Vi(v0Var2, "cgi_resp") < cy1.a.Ui().fj(v0Var2, "cgi_resp")) {
                            return;
                        }
                        cy1.a.Ui().Yj(v0Var2, "cgi_resp", currentTimeMillis);
                        vy1.a h17 = uy1.a.h(v0Var2, false);
                        if (h17 == null) {
                            return;
                        }
                        java.lang.String[] split = v0Var2.getUri().split("/");
                        java.lang.String str2 = (split == null || split.length <= 0) ? null : split[split.length - 1];
                        if (u46.l.e(str2)) {
                            return;
                        }
                        java.util.HashMap hashMap = new java.util.HashMap();
                        java.util.Map map2 = h17.f441416a;
                        if (map2 != null) {
                            hashMap.putAll(map2);
                        }
                        java.util.Map map3 = h17.f441417b;
                        if (map3 != null && (map = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) map3).get("cgi_resp")) != null && map.size() > 0) {
                            hashMap.putAll(map);
                        }
                        java.util.Map i27 = uy1.a.i(v0Var2, "cgi_resp");
                        if (i27 != null && ((java.util.HashMap) i27).size() > 0) {
                            hashMap.putAll(i27);
                        }
                        com.tencent.mm.sdk.platformtools.n3 n3Var = aVar2.f267288e;
                        android.os.Message obtainMessage = n3Var.obtainMessage(1014);
                        obtainMessage.obj = nm5.j.g(str2, java.lang.Integer.valueOf(i19), str, hashMap, cy1.a.Ui().ij(v0Var2, "cgi_resp"), java.lang.Long.valueOf(currentTimeMillis));
                        n3Var.sendMessage(obtainMessage);
                    }
                };
            }
            java.util.Iterator it6 = ((fs.e) ((fs.c) f17).all()).iterator();
            while (true) {
                fs.f fVar = (fs.f) it6;
                if (!fVar.hasNext()) {
                    break;
                }
                ((m05.k) ((c01.ma) ((fs.q) fVar.next()).get())).getClass();
                l0Var3 = new m05.j(l0Var3, this);
            }
            l0Var2 = l0Var3;
        } else {
            l0Var2 = l0Var;
        }
        java.util.List list3 = c01.na.f37350a;
        if (((java.util.ArrayList) list3).size() > 0) {
            synchronized (list3) {
                arrayList2 = new java.util.ArrayList(list3);
            }
            java.util.Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                c01.la laVar = (c01.la) it7.next();
                try {
                    ((fz1.a) laVar).c(this);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetWarpGate", "[intercept] interceptor : " + laVar + ", throw Exception : " + e17.getMessage());
                }
            }
        }
        java.util.Iterator it8 = ((fs.e) ((fs.c) fs.g.f(c01.ma.class)).all()).iterator();
        while (true) {
            fs.f fVar2 = (fs.f) it8;
            if (!fVar2.hasNext()) {
                break;
            }
            c01.ma maVar = (c01.ma) ((fs.q) fVar2.next()).get();
            try {
                maVar.getClass();
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetWarpGate", "[intercept] interceptor : " + maVar + ", throw Exception : " + e18.getMessage());
            }
        }
        final int dispatchInterceptRet = getDispatchInterceptRet(sVar, v0Var, l0Var);
        if (dispatchInterceptRet != 0) {
            new com.tencent.mm.sdk.platformtools.n3().post(new java.lang.Runnable() { // from class: com.tencent.mm.modelbase.m1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.modelbase.m1.F(com.tencent.mm.modelbase.m1.this, l0Var2, dispatchInterceptRet, v0Var, type);
                }
            });
            return dispatchInterceptRet;
        }
        if (this.limit == -99) {
            this.limit = securityLimitCount();
            com.tencent.mars.xlog.Log.i(TAG, "initilized security limit count to " + this.limit);
        }
        if (securityLimitCount() > 1) {
            int ordinal = securityVerificationChecked(v0Var).ordinal();
            if (ordinal == 0) {
                iz5.a.g("scene security verification not passed, type=" + type + ", uri=" + uri + ", CHECK NOW", false);
            } else if (ordinal != 1) {
                if (ordinal == 2) {
                    com.tencent.mars.xlog.Log.e(TAG, "scene security verification not passed, type=" + type + ", uri=" + uri);
                    this.limit = this.limit - 1;
                    setSecurityCheckError(com.tencent.mm.modelbase.n1.EStatusCheckFailed);
                    this.netId = -1;
                    return -1;
                }
                iz5.a.g("invalid security verification status", false);
            }
        }
        if (securityLimitCountReach()) {
            com.tencent.mars.xlog.Log.e(TAG, "dispatch failed, scene limited for security, current limit=" + securityLimitCount());
            setSecurityCheckError(com.tencent.mm.modelbase.n1.EReachMaxLimit);
            this.netId = -1;
            return -1;
        }
        this.limit--;
        com.tencent.mm.modelbase.v2 v2Var = new com.tencent.mm.modelbase.v2(v0Var, android.os.Looper.myLooper() == null ? new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()) : new com.tencent.mm.sdk.platformtools.n3(), trackState());
        if (this.remoteCB != null && !isSupportConcurrent()) {
            com.tencent.mm.modelbase.q2 q2Var = this.remoteCB;
            q2Var.f70751g = true;
            q2Var.f70750f.removeCallbacks(q2Var.f70756o);
            q01.a1.f359259a.d(q2Var.f70752h);
        }
        this.remoteCB = new com.tencent.mm.modelbase.q2(v0Var, l0Var2, this, this.queueCallback, sVar);
        q01.a1 a1Var = q01.a1.f359259a;
        if (a1Var.b()) {
            trackState().g(230);
            synchronized (q01.a1.f359261c) {
                q01.s0 c17 = a1Var.c(this);
                int hashCode = hashCode();
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTracker", "#onDispatchNetScene: " + c17 + '@' + hashCode);
                ((java.util.Map) q01.a1.f359263e.getValue()).put(java.lang.Integer.valueOf(hashCode), c17);
                hr0.k0 k0Var = (hr0.k0) ((q01.q0) i95.n0.c(q01.q0.class));
                k0Var.getClass();
                ((ku5.t0) ku5.t0.f312615d).h(new hr0.i0(k0Var, c17), "MicroMsg.NetSceneTrackFeatureService");
            }
        }
        int J2 = sVar.J(v2Var, this.remoteCB, type);
        this.netId = J2;
        onDispatched(J2);
        com.tencent.mars.xlog.Log.i(TAG, "dispatcher send, %s", java.lang.Integer.valueOf(this.netId));
        if (this.netId < 0) {
            new com.tencent.mm.sdk.platformtools.n3().post(new java.lang.Runnable() { // from class: com.tencent.mm.modelbase.m1$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.modelbase.m1.G(com.tencent.mm.modelbase.m1.this, l0Var2, v0Var, type);
                }
            });
            return 99999999;
        }
        com.tencent.mm.modelbase.q2 q2Var2 = this.remoteCB;
        q2Var2.f70750f.postDelayed(q2Var2.f70756o, 330000L);
        return this.netId;
    }

    public com.tencent.mm.network.s dispatcher() {
        return this.dispatcher;
    }

    public abstract int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var);

    public int getDispatchInterceptRet(com.tencent.mm.network.s sVar, com.tencent.mm.network.v0 v0Var, com.tencent.mm.network.l0 l0Var) {
        return 0;
    }

    public java.lang.String getInfo() {
        return "";
    }

    public boolean getIsKinda() {
        return this.isKinda;
    }

    public long getLastDispatchTimestamp() {
        return this.lastDispatchTimestamp;
    }

    public int getMMReqRespHash() {
        com.tencent.mm.network.v0 v0Var = this.irr;
        if (v0Var == null) {
            return 0;
        }
        return v0Var.hashCode();
    }

    public int getPriority() {
        return this.priority;
    }

    public com.tencent.mm.modelbase.u0 getQueueCallback() {
        return this.queueCallback;
    }

    public com.tencent.mm.network.v0 getReqResp() {
        return this.irr;
    }

    public long getReturnTimeout() {
        return DEFAULT_RETURN_TIMEOUT;
    }

    public abstract int getType();

    public boolean hasCallBackToQueue() {
        return this.hasCallbackToQueue;
    }

    public boolean hasSpecificQueueBucket() {
        return false;
    }

    public boolean isCanceled() {
        return this.isCanceled;
    }

    public boolean isCgiProfilerEnable() {
        return this.isCgiProfilerEnable;
    }

    public boolean isSupportConcurrent() {
        return false;
    }

    public boolean needCheckCallback() {
        return securityLimitCount() == 1;
    }

    public void onDispatched(int i17) {
        com.tencent.mm.modelbase.u0 queueCallback = getQueueCallback();
        if (queueCallback instanceof q01.x) {
            q01.x xVar = (q01.x) queueCallback;
            ((java.util.concurrent.atomic.AtomicInteger) ((jz5.n) xVar.f359348h).getValue()).getAndIncrement();
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueueTracker", "#onDispatched: " + xVar.e() + ", netId=" + i17);
        }
    }

    public void prepareDispatcher(com.tencent.mm.network.s sVar) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.lastdispatch = android.os.SystemClock.elapsedRealtime();
        this.lastDispatchTimestamp = java.lang.System.currentTimeMillis();
        this.dispatcher = sVar;
    }

    public boolean profileEnabled() {
        return this.isProfileEnable;
    }

    public void reset() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.lastdispatch = android.os.SystemClock.elapsedRealtime();
        this.lastDispatchTimestamp = java.lang.System.currentTimeMillis();
        this.netId = -1;
        this.limit = -99;
    }

    public int securityLimitCount() {
        return 1;
    }

    public boolean securityLimitCountReach() {
        return this.limit <= 0;
    }

    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EUnchecked;
    }

    public void setCgiProfilerEnable(boolean z17) {
        this.isCgiProfilerEnable = z17;
    }

    public void setDispatchInterceptor(c01.k8 k8Var) {
    }

    public void setHasCallbackToQueue(boolean z17) {
        this.hasCallbackToQueue = z17;
    }

    public void setIsKinda(boolean z17) {
        this.isKinda = z17;
    }

    public void setOnSceneEnd(com.tencent.mm.modelbase.u0 u0Var) {
        this.queueCallback = u0Var;
    }

    public void setPriority(int i17) {
        this.priority = i17;
    }

    public void setProfileEnable(boolean z17) {
        this.isProfileEnable = z17;
    }

    public void setSecurityCheckError(com.tencent.mm.modelbase.n1 n1Var) {
    }

    public q01.o0 trackState() {
        synchronized (this) {
            if (this.mState == null) {
                this.mState = new q01.o0(this);
            }
        }
        return this.mState;
    }

    public boolean uniqueInNetsceneQueue() {
        return false;
    }

    @java.lang.Deprecated
    public void updateDispatchId(int i17) {
    }

    public void updateDispatchIdNew(int i17) {
        this.netId = i17;
    }
}
