package com.p314xaae8f345.p485x5dc4f1ad.biz;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0082 J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0082 J\u0019\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0082 J\u0019\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0082 J!\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0082 J!\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0082 J+\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0082 J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0007J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\tH\u0007J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0007J\u0018\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0007J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007J\u0018\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0007J\u0018\u0010 \u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0007¨\u0006!"}, d2 = {"Lcom/tencent/magicbrush/biz/MBBizManager;", "", "", "jsEngine", "jsContext", "nativeCreate", "inst", "Ljz5/f0;", "nativeDestroy", "", "bizName", "nativeNotifyBizConnected", "nativeNotifyBizDisconnected", "serviceName", "msg", "nativeOnReceiveMsgFromPublicService", "nativeOnReceiveMsgFromBiz", com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "Ljava/nio/ByteBuffer;", "result", "nativeOnReadFileCallback", "onCreatePublicService", "onDestroyPublicService", "to", "onPostMsgToBiz", "onPostMsgToPublicService", "from", "readFileFromBiz", "alias", "version", "onRequirePlugin", "stack", "onJsException", "lib-magicbrush-nano_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: com.tencent.magicbrush.biz.MBBizManager */
/* loaded from: classes7.dex */
public final class C4210x94b68e8f {

    /* renamed from: a, reason: collision with root package name */
    public final zg.a f130129a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f130130b;

    /* renamed from: c, reason: collision with root package name */
    public long f130131c;

    public C4210x94b68e8f(zg.a delegate, java.lang.String bizName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        this.f130129a = delegate;
        this.f130130b = bizName;
    }

    /* renamed from: nativeCreate */
    private final native long m34801x73c02ff3(long jsEngine, long jsContext);

    /* renamed from: nativeDestroy */
    private final native void m34802x23caefe3(long j17);

    /* renamed from: nativeNotifyBizConnected */
    private final native void m34803xe4a0b596(long j17, java.lang.String str);

    /* renamed from: nativeNotifyBizDisconnected */
    private final native void m34804xe533c48e(long j17, java.lang.String str);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeOnReadFileCallback */
    public final native void m34805xe813c30d(long j17, java.lang.String str, java.lang.String str2, java.nio.ByteBuffer byteBuffer);

    /* renamed from: nativeOnReceiveMsgFromBiz */
    private final native void m34806x23ad57d5(long j17, java.lang.String str, java.lang.String str2);

    /* renamed from: nativeOnReceiveMsgFromPublicService */
    private final native void m34807x2120a44e(long j17, java.lang.String str, java.lang.String str2);

    public final void b(long j17, long j18) {
        this.f130131c = m34801x73c02ff3(j17, j18);
    }

    public final void c() {
        long j17 = this.f130131c;
        if (j17 == 0) {
            return;
        }
        m34802x23caefe3(j17);
        this.f130131c = 0L;
    }

    public final void d(java.lang.String bizName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        long j17 = this.f130131c;
        if (j17 == 0) {
            throw new java.lang.IllegalStateException("You forgot to call MBBizManager::bindTo");
        }
        m34803xe4a0b596(j17, bizName);
    }

    public final void e(java.lang.String bizName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        long j17 = this.f130131c;
        if (j17 == 0) {
            throw new java.lang.IllegalStateException("You forgot to call MBBizManager::bindTo");
        }
        m34804xe533c48e(j17, bizName);
    }

    public final java.lang.String f(java.lang.String serviceName, boolean z17) {
        oc3.a aVar;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serviceName, "serviceName");
        zg.a aVar2 = this.f130129a;
        java.lang.String from = this.f130130b;
        pc3.t tVar = (pc3.t) aVar2;
        synchronized (tVar) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
            sc3.k1 k1Var = (sc3.k1) tVar.f434935h.get(from);
            if (k1Var == null || (aVar = k1Var.N0()) == null) {
                aVar = oc3.a.f425859c;
            }
            oc3.b bVar = (oc3.b) aVar.f425861b.get(serviceName);
            if (bVar != null && (str = bVar.f425863b) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushServerMgr", "onCreatePublicService: " + serviceName + '(' + str + ") from: " + from);
                sc3.k1 k1Var2 = (sc3.k1) tVar.f434935h.get(str);
                jc3.a0 wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.z6) tVar.f434933f).wi(str);
                if (k1Var2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushServerMgr", "no exist public service " + str + " found");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b b07 = wi6.b0();
                    rc3.f1 f1Var = new rc3.f1(b07, wi6, new pc3.p(tVar));
                    wi6.x0(f1Var);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushServerMgr", "onCreatePublicService with config done");
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = tVar.f434935h;
                    sc3.q1 q1Var = new sc3.q1(tVar.f434932e, str, new com.p314xaae8f345.p485x5dc4f1ad.biz.C4210x94b68e8f(tVar, str));
                    f1Var.f475523h = q1Var;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q1Var.Q, "setLocalMBClient instance:" + q1Var.f488009e + " (heartbeat not started for local client)");
                    q1Var.f488013i = f1Var;
                    if (!z17) {
                        q1Var.w1(from);
                    }
                    q1Var.w3(b07);
                    concurrentHashMap.put(str, q1Var);
                } else if (!(k1Var2 instanceof sc3.q1)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicBrushServerMgr", "onCreatePublicService: server " + str + " not available");
                    str = "";
                } else if (!z17) {
                    ((sc3.q1) k1Var2).w1(from);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicBrushServerMgr", "create public service " + serviceName + " failed, serviceName not found");
            str = "";
        }
        return str;
    }

    public final void g(java.lang.String bizName, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        long j17 = this.f130131c;
        if (j17 == 0) {
            throw new java.lang.IllegalStateException("You forgot to call MBBizManager::bindTo");
        }
        m34806x23ad57d5(j17, bizName, msg);
    }

    public final void h(java.lang.String serviceName, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serviceName, "serviceName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        long j17 = this.f130131c;
        if (j17 == 0) {
            throw new java.lang.IllegalStateException("You forgot to call MBBizManager::bindTo");
        }
        m34807x2120a44e(j17, serviceName, msg);
    }

    /* renamed from: onCreatePublicService */
    public final java.lang.String m34808x6aee3411(java.lang.String serviceName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serviceName, "serviceName");
        return f(serviceName, false);
    }

    /* renamed from: onDestroyPublicService */
    public final void m34809x5fa546b1(java.lang.String serviceName) {
        sc3.k1 k1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serviceName, "serviceName");
        zg.a aVar = this.f130129a;
        java.lang.String from = this.f130130b;
        pc3.t tVar = (pc3.t) aVar;
        synchronized (tVar) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushServerMgr", "onDestroyPublicService: " + serviceName + " from: " + from);
            sc3.k1 k1Var2 = (sc3.k1) tVar.f434935h.get(serviceName);
            if (k1Var2 != null) {
                if (k1Var2 instanceof sc3.q1) {
                    ((sc3.q1) k1Var2).y1(from);
                    if (!(!((sc3.q1) k1Var2).f488059y0.isEmpty()) && (k1Var = (sc3.k1) tVar.f434935h.remove(serviceName)) != null) {
                        k1Var.Oc(1);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicBrushServerMgr", "onDestroyPublicService: server " + serviceName + " unknown");
                }
            }
        }
    }

    /* renamed from: onJsException */
    public final void m34810x50004da7(java.lang.String msg, java.lang.String stack) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stack, "stack");
        pc3.t tVar = (pc3.t) this.f130129a;
        tVar.getClass();
        java.lang.String from = this.f130130b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        sc3.k1 k1Var = (sc3.k1) tVar.f434935h.get(from);
        if (k1Var != null) {
            k1Var.X0(msg, stack, "BizManager");
        }
    }

    /* renamed from: onPostMsgToBiz */
    public final void m34811x4e1f9d6(java.lang.String to6, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(to6, "to");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        pc3.t tVar = (pc3.t) this.f130129a;
        tVar.getClass();
        java.lang.String from = this.f130130b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        sc3.k1 k1Var = (sc3.k1) tVar.f434935h.get(to6);
        if (k1Var != null) {
            k1Var.M0().mo51545x3498a0(new sc3.j0(k1Var, from, msg));
        }
    }

    /* renamed from: onPostMsgToPublicService */
    public final void m34812x5f57790f(java.lang.String to6, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(to6, "to");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        zg.a aVar = this.f130129a;
        java.lang.String from = this.f130130b;
        pc3.t tVar = (pc3.t) aVar;
        tVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        sc3.k1 k1Var = (sc3.k1) tVar.f434935h.get(to6);
        if (k1Var != null) {
            if (!(k1Var instanceof sc3.q1)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicBrushServerMgr", "onPostMsgToPublicService: server " + to6 + " unknown");
                return;
            }
            sc3.q1 q1Var = (sc3.q1) k1Var;
            synchronized (q1Var) {
                if (q1Var.f488057p0) {
                    q1Var.M0().mo51545x3498a0(new sc3.p1(q1Var, from, msg));
                } else {
                    kz5.q qVar = (kz5.q) q1Var.f488058x0.get(from);
                    if (qVar != null) {
                        qVar.m144678xbb8646d7(msg);
                    }
                }
            }
        }
    }

    /* renamed from: onRequirePlugin */
    public final java.lang.String m34813x50dae159(java.lang.String alias, java.lang.String version) {
        oc3.a N0;
        java.lang.String str;
        lc3.g0 j0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alias, "alias");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(version, "version");
        pc3.t tVar = (pc3.t) this.f130129a;
        tVar.getClass();
        java.lang.String instanceName = this.f130130b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushServerMgr", "onRequirePlugin " + instanceName + ", " + alias + ", " + version);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = tVar.f434935h;
        sc3.k1 k1Var = (sc3.k1) concurrentHashMap.get(instanceName);
        if (k1Var == null || (N0 = k1Var.N0()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicBrushServerMgr", "onRequirePlugin failed, bizConfigInfo null");
            return "";
        }
        oc3.b bVar = (oc3.b) N0.f425860a.get(alias);
        if (bVar == null || (str = bVar.f425863b) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicBrushServerMgr", "onRequirePlugin failed, not find provider");
            return "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o6) tVar.f434934g;
        o6Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushPluginMgrFeat", "providePlugin by " + str + ", version is " + version);
        jc3.z zVar = (jc3.z) ((java.util.HashMap) ((jz5.n) o6Var.f229622d).mo141623x754a37bb()).get(str);
        if (zVar == null || (j0Var = zVar.k0(version)) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicBrushPluginMgrFeat", "plugin " + str + " not provided");
            j0Var = new lc3.j0(";console.error(\"plugin " + str + " not provided\")");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushPluginMgrFeat", "providePlugin done");
        }
        sc3.k1 k1Var2 = (sc3.k1) concurrentHashMap.get(instanceName);
        if (k1Var2 != null) {
            k1Var2.M0().l0(kz5.c0.d(k1Var2.V0(j0Var)), (java.lang.String) ((jz5.n) k1Var2.K).mo141623x754a37bb(), null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushServerMgr", "onRequirePlugin with descriptor " + j0Var);
        return "";
    }

    /* renamed from: readFileFromBiz */
    public final void m34814x32692877(java.lang.String from, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        zg.a aVar = this.f130129a;
        java.lang.String serviceName = this.f130130b;
        zg.b bVar = new zg.b(this, from, path);
        pc3.t tVar = (pc3.t) aVar;
        tVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serviceName, "serviceName");
        sc3.k1 k1Var = (sc3.k1) tVar.f434935h.get(from);
        if (k1Var != null) {
            ((ku5.t0) ku5.t0.f394148d).q(new sc3.i0(new pc3.r(tVar, serviceName, bVar, from), k1Var, path));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicBrushServerMgr", "onReadFileFromBiz " + from + " not exist");
    }
}
