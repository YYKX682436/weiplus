package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes12.dex */
public abstract class m1 {

    /* renamed from: DEFAULT_RETURN_TIMEOUT */
    private static final long f32543xb069e710 = 600000;

    /* renamed from: LIMIT_NOT_INITIALIZED */
    private static final int f32544xdd5d6684 = -99;
    private static final java.lang.String TAG = "MicroMsg.NetSceneBase";

    /* renamed from: dispatcher */
    private com.p314xaae8f345.mm.p971x6de15a2e.s f32545xb7ba1aa7;

    /* renamed from: hasCallbackToQueue */
    private boolean f32546x266cdd57;
    private com.p314xaae8f345.mm.p971x6de15a2e.v0 irr;

    /* renamed from: isCanceled */
    private boolean f32547xc9602be3;

    /* renamed from: isCgiProfilerEnable */
    private boolean f32548x9bb1d6a7;

    /* renamed from: isKinda */
    private boolean f32549x7afde443;

    /* renamed from: isProfileEnable */
    private boolean f32550x29fa4f82;

    /* renamed from: lastDispatchTimestamp */
    private long f32551xd430d9c6;

    /* renamed from: lastdispatch */
    protected long f32552xa692e110;

    /* renamed from: limit */
    private int f32553x6234bbb;

    /* renamed from: mDispatchInterceptor */
    private c01.k8 f32554x6371c79e;

    /* renamed from: mState */
    private q01.o0 f32555xbec81024;

    /* renamed from: netId */
    private int f32556x63dbf98;

    /* renamed from: priority */
    private int f32557xba8879a4 = 0;

    /* renamed from: queueCallback */
    private com.p314xaae8f345.mm.p944x882e457a.u0 f32558xa867fc76;

    /* renamed from: remoteCB */
    private com.p314xaae8f345.mm.p944x882e457a.q2 f32559xe16e0725;

    public m1() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f32552xa692e110 = android.os.SystemClock.elapsedRealtime();
        this.f32556x63dbf98 = -1;
        this.f32553x6234bbb = -99;
        this.f32547xc9602be3 = false;
        this.f32555xbec81024 = null;
        this.f32549x7afde443 = false;
        this.f32548x9bb1d6a7 = false;
        this.f32550x29fa4f82 = false;
        q01.o0 m48022x4479fa06 = m48022x4479fa06();
        if (m48022x4479fa06.c()) {
            synchronized (m48022x4479fa06.e()) {
                m48022x4479fa06.e().clear();
            }
            m48022x4479fa06.g(0);
        }
    }

    public static /* synthetic */ void F(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var, int i17, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, int i18) {
        m1Var.getClass();
        try {
            l0Var.mo804x5f9cdc6f(-1, 3, i17, "dispatch intercept", v0Var, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "dispatcher intercept send, %s, ThreadID:%s, getType:%s", java.lang.Integer.valueOf(m1Var.f32556x63dbf98), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), java.lang.Integer.valueOf(i18));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "callbackWrapper intercept onGYNetEnd err", new java.lang.Object[0]);
        }
    }

    public static /* synthetic */ void G(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, int i17) {
        m1Var.getClass();
        l0Var.mo804x5f9cdc6f(-1, 3, -1, "send to network failed", v0Var, null);
        q01.a1.f440792a.d(m1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "dispatcher send, %s, ThreadID:%s, getType:%s", java.lang.Integer.valueOf(m1Var.f32556x63dbf98), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), java.lang.Integer.valueOf(i17));
    }

    /* renamed from: accept */
    public boolean mo47993xab27b508(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }

    /* renamed from: acceptConcurrent */
    public boolean mo47994x9ec0ccdf(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }

    /* renamed from: callbackErrorIfNeed */
    public void mo47957xb0a065f6(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "callbackErrorIfNeed: %d, hash:%d, type:%d, errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(this.f32556x63dbf98), java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(mo808xfb85f7b0()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
    }

    /* renamed from: cancel */
    public void mo9408xae7a2e7a() {
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "cancel: %d, hash:%d, type:%d", java.lang.Integer.valueOf(this.f32556x63dbf98), java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(mo808xfb85f7b0()));
        this.f32547xc9602be3 = true;
        com.p314xaae8f345.mm.p944x882e457a.q2 q2Var = this.f32559xe16e0725;
        if (q2Var != null) {
            q2Var.f152284g = true;
            q2Var.f152283f.mo50300x3fa464aa(q2Var.f152289o);
            q01.a1.f440792a.d(q2Var.f152285h);
        }
        int i17 = this.f32556x63dbf98;
        if (i17 == -1 || (sVar = this.f32545xb7ba1aa7) == null) {
            return;
        }
        this.f32556x63dbf98 = -1;
        sVar.i1(i17);
    }

    /* renamed from: dispatch */
    public int mo9409x10f9447a(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, final com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var) {
        java.util.ArrayList arrayList;
        final com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var2;
        java.util.ArrayList arrayList2;
        m48011xbb66a70e(sVar);
        this.irr = v0Var;
        final int mo13822xfb85f7b0 = v0Var.mo13822xfb85f7b0();
        java.lang.String mo13823xb5887636 = v0Var.mo13823xb5887636();
        java.util.List list = c01.na.f118883a;
        fs.i f17 = fs.g.f(c01.ma.class);
        java.util.List list2 = c01.na.f118883a;
        if (((java.util.ArrayList) list2).size() > 0 || ((fs.f) ((fs.e) ((fs.c) f17).all()).iterator()).hasNext()) {
            synchronized (list2) {
                arrayList = new java.util.ArrayList(list2);
            }
            java.util.Iterator it = arrayList.iterator();
            final com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var3 = l0Var;
            while (it.hasNext()) {
                final fz1.a aVar = (fz1.a) ((c01.la) it.next());
                aVar.getClass();
                l0Var3 = new com.p314xaae8f345.mm.p971x6de15a2e.l0() { // from class: fz1.a$$b
                    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
                    /* renamed from: onGYNetEnd */
                    public final void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var2, byte[] bArr) {
                        java.util.Map map;
                        fz1.a aVar2 = fz1.a.this;
                        aVar2.getClass();
                        com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var4 = l0Var3;
                        if (l0Var4 != null) {
                            l0Var4.mo804x5f9cdc6f(i17, i18, i19, str, v0Var2, bArr);
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
                        java.lang.String[] split = v0Var2.mo13823xb5887636().split("/");
                        java.lang.String str2 = (split == null || split.length <= 0) ? null : split[split.length - 1];
                        if (u46.l.e(str2)) {
                            return;
                        }
                        java.util.HashMap hashMap = new java.util.HashMap();
                        java.util.Map map2 = h17.f522949a;
                        if (map2 != null) {
                            hashMap.putAll(map2);
                        }
                        java.util.Map map3 = h17.f522950b;
                        if (map3 != null && (map = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) map3).get("cgi_resp")) != null && map.size() > 0) {
                            hashMap.putAll(map);
                        }
                        java.util.Map i27 = uy1.a.i(v0Var2, "cgi_resp");
                        if (i27 != null && ((java.util.HashMap) i27).size() > 0) {
                            hashMap.putAll(i27);
                        }
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = aVar2.f348821e;
                        android.os.Message mo50289x733c63a2 = n3Var.mo50289x733c63a2(1014);
                        mo50289x733c63a2.obj = nm5.j.g(str2, java.lang.Integer.valueOf(i19), str, hashMap, cy1.a.Ui().ij(v0Var2, "cgi_resp"), java.lang.Long.valueOf(currentTimeMillis));
                        n3Var.mo50308x2936bf5f(mo50289x733c63a2);
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
        java.util.List list3 = c01.na.f118883a;
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
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetWarpGate", "[intercept] interceptor : " + laVar + ", throw Exception : " + e17.getMessage());
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetWarpGate", "[intercept] interceptor : " + maVar + ", throw Exception : " + e18.getMessage());
            }
        }
        final int mo47996x4facbe8f = mo47996x4facbe8f(sVar, v0Var, l0Var);
        if (mo47996x4facbe8f != 0) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.mm.modelbase.m1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p944x882e457a.m1.F(com.p314xaae8f345.mm.p944x882e457a.m1.this, l0Var2, mo47996x4facbe8f, v0Var, mo13822xfb85f7b0);
                }
            });
            return mo47996x4facbe8f;
        }
        if (this.f32553x6234bbb == -99) {
            this.f32553x6234bbb = mo11249xbf5a7574();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "initilized security limit count to " + this.f32553x6234bbb);
        }
        if (mo11249xbf5a7574() > 1) {
            int ordinal = mo11250x9215ac(v0Var).ordinal();
            if (ordinal == 0) {
                iz5.a.g("scene security verification not passed, type=" + mo13822xfb85f7b0 + ", uri=" + mo13823xb5887636 + ", CHECK NOW", false);
            } else if (ordinal != 1) {
                if (ordinal == 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "scene security verification not passed, type=" + mo13822xfb85f7b0 + ", uri=" + mo13823xb5887636);
                    this.f32553x6234bbb = this.f32553x6234bbb - 1;
                    mo14485xb35c0942(com.p314xaae8f345.mm.p944x882e457a.n1.EStatusCheckFailed);
                    this.f32556x63dbf98 = -1;
                    return -1;
                }
                iz5.a.g("invalid security verification status", false);
            }
        }
        if (mo48014x3a8bbc5f()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "dispatch failed, scene limited for security, current limit=" + mo11249xbf5a7574());
            mo14485xb35c0942(com.p314xaae8f345.mm.p944x882e457a.n1.EReachMaxLimit);
            this.f32556x63dbf98 = -1;
            return -1;
        }
        this.f32553x6234bbb--;
        com.p314xaae8f345.mm.p944x882e457a.v2 v2Var = new com.p314xaae8f345.mm.p944x882e457a.v2(v0Var, android.os.Looper.myLooper() == null ? new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()) : new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(), m48022x4479fa06());
        if (this.f32559xe16e0725 != null && !mo48008x768cf6dc()) {
            com.p314xaae8f345.mm.p944x882e457a.q2 q2Var = this.f32559xe16e0725;
            q2Var.f152284g = true;
            q2Var.f152283f.mo50300x3fa464aa(q2Var.f152289o);
            q01.a1.f440792a.d(q2Var.f152285h);
        }
        this.f32559xe16e0725 = new com.p314xaae8f345.mm.p944x882e457a.q2(v0Var, l0Var2, this, this.f32558xa867fc76, sVar);
        q01.a1 a1Var = q01.a1.f440792a;
        if (a1Var.b()) {
            m48022x4479fa06().g(230);
            synchronized (q01.a1.f440794c) {
                q01.s0 c17 = a1Var.c(this);
                int hashCode = hashCode();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTracker", "#onDispatchNetScene: " + c17 + '@' + hashCode);
                ((java.util.Map) q01.a1.f440796e.mo141623x754a37bb()).put(java.lang.Integer.valueOf(hashCode), c17);
                hr0.k0 k0Var = (hr0.k0) ((q01.q0) i95.n0.c(q01.q0.class));
                k0Var.getClass();
                ((ku5.t0) ku5.t0.f394148d).h(new hr0.i0(k0Var, c17), "MicroMsg.NetSceneTrackFeatureService");
            }
        }
        int J2 = sVar.J(v2Var, this.f32559xe16e0725, mo13822xfb85f7b0);
        this.f32556x63dbf98 = J2;
        m48010x7ed779d8(J2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "dispatcher send, %s", java.lang.Integer.valueOf(this.f32556x63dbf98));
        if (this.f32556x63dbf98 < 0) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.mm.modelbase.m1$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p944x882e457a.m1.G(com.p314xaae8f345.mm.p944x882e457a.m1.this, l0Var2, v0Var, mo13822xfb85f7b0);
                }
            });
            return 99999999;
        }
        com.p314xaae8f345.mm.p944x882e457a.q2 q2Var2 = this.f32559xe16e0725;
        q2Var2.f152283f.mo50297x7c4d7ca2(q2Var2.f152289o, 330000L);
        return this.f32556x63dbf98;
    }

    /* renamed from: dispatcher */
    public com.p314xaae8f345.mm.p971x6de15a2e.s m47995xb7ba1aa7() {
        return this.f32545xb7ba1aa7;
    }

    /* renamed from: doScene */
    public abstract int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var);

    /* renamed from: getDispatchInterceptRet */
    public int mo47996x4facbe8f(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var) {
        return 0;
    }

    /* renamed from: getInfo */
    public java.lang.String mo47997xfb80cd24() {
        return "";
    }

    /* renamed from: getIsKinda */
    public boolean m47998xb8cb200d() {
        return this.f32549x7afde443;
    }

    /* renamed from: getLastDispatchTimestamp */
    public long m47999xdfdcac10() {
        return this.f32551xd430d9c6;
    }

    /* renamed from: getMMReqRespHash */
    public int m48000xf87ae66() {
        com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = this.irr;
        if (v0Var == null) {
            return 0;
        }
        return v0Var.hashCode();
    }

    /* renamed from: getPriority */
    public int mo48001x3662b71a() {
        return this.f32557xba8879a4;
    }

    /* renamed from: getQueueCallback */
    public com.p314xaae8f345.mm.p944x882e457a.u0 m48002x65c7b8c0() {
        return this.f32558xa867fc76;
    }

    /* renamed from: getReqResp */
    public com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558() {
        return this.irr;
    }

    /* renamed from: getReturnTimeout */
    public long mo48003xd8232e5b() {
        return f32543xb069e710;
    }

    /* renamed from: getType */
    public abstract int mo808xfb85f7b0();

    /* renamed from: hasCallBackToQueue */
    public boolean m48004x89d68537() {
        return this.f32546x266cdd57;
    }

    /* renamed from: hasSpecificQueueBucket */
    public boolean m48005xee32d4cf() {
        return false;
    }

    /* renamed from: isCanceled */
    public boolean m48006xc9602be3() {
        return this.f32547xc9602be3;
    }

    /* renamed from: isCgiProfilerEnable */
    public boolean m48007x9bb1d6a7() {
        return this.f32548x9bb1d6a7;
    }

    /* renamed from: isSupportConcurrent */
    public boolean mo48008x768cf6dc() {
        return false;
    }

    /* renamed from: needCheckCallback */
    public boolean mo48009xb05ac77() {
        return mo11249xbf5a7574() == 1;
    }

    /* renamed from: onDispatched */
    public void m48010x7ed779d8(int i17) {
        com.p314xaae8f345.mm.p944x882e457a.u0 m48002x65c7b8c0 = m48002x65c7b8c0();
        if (m48002x65c7b8c0 instanceof q01.x) {
            q01.x xVar = (q01.x) m48002x65c7b8c0;
            ((java.util.concurrent.atomic.AtomicInteger) ((jz5.n) xVar.f440881h).mo141623x754a37bb()).getAndIncrement();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQueueTracker", "#onDispatched: " + xVar.e() + ", netId=" + i17);
        }
    }

    /* renamed from: prepareDispatcher */
    public void m48011xbb66a70e(com.p314xaae8f345.mm.p971x6de15a2e.s sVar) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f32552xa692e110 = android.os.SystemClock.elapsedRealtime();
        this.f32551xd430d9c6 = java.lang.System.currentTimeMillis();
        this.f32545xb7ba1aa7 = sVar;
    }

    /* renamed from: profileEnabled */
    public boolean mo48012x6ea41958() {
        return this.f32550x29fa4f82;
    }

    /* renamed from: reset */
    public void m48013x6761d4f() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f32552xa692e110 = android.os.SystemClock.elapsedRealtime();
        this.f32551xd430d9c6 = java.lang.System.currentTimeMillis();
        this.f32556x63dbf98 = -1;
        this.f32553x6234bbb = -99;
    }

    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 1;
    }

    /* renamed from: securityLimitCountReach */
    public boolean mo48014x3a8bbc5f() {
        return this.f32553x6234bbb <= 0;
    }

    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EUnchecked;
    }

    /* renamed from: setCgiProfilerEnable */
    public void m48015x374d7e6f(boolean z17) {
        this.f32548x9bb1d6a7 = z17;
    }

    /* renamed from: setDispatchInterceptor */
    public void m48016x1f4a5589(c01.k8 k8Var) {
    }

    /* renamed from: setHasCallbackToQueue */
    public void m48017xd0f4c159(boolean z17) {
        this.f32546x266cdd57 = z17;
    }

    /* renamed from: setIsKinda */
    public void m48018x2c3c6d81(boolean z17) {
        this.f32549x7afde443 = z17;
    }

    /* renamed from: setOnSceneEnd */
    public void m48019x9345c5b0(com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f32558xa867fc76 = u0Var;
    }

    /* renamed from: setPriority */
    public void m48020x311b1826(int i17) {
        this.f32557xba8879a4 = i17;
    }

    /* renamed from: setProfileEnable */
    public void m48021xf8f11b4a(boolean z17) {
        this.f32550x29fa4f82 = z17;
    }

    /* renamed from: setSecurityCheckError */
    public void mo14485xb35c0942(com.p314xaae8f345.mm.p944x882e457a.n1 n1Var) {
    }

    /* renamed from: trackState */
    public q01.o0 m48022x4479fa06() {
        synchronized (this) {
            if (this.f32555xbec81024 == null) {
                this.f32555xbec81024 = new q01.o0(this);
            }
        }
        return this.f32555xbec81024;
    }

    /* renamed from: uniqueInNetsceneQueue */
    public boolean mo48023x99a7e80c() {
        return false;
    }

    @java.lang.Deprecated
    /* renamed from: updateDispatchId */
    public void m48024x6b3684de(int i17) {
    }

    /* renamed from: updateDispatchIdNew */
    public void m48025x7d7117e2(int i17) {
        this.f32556x63dbf98 = i17;
    }
}
