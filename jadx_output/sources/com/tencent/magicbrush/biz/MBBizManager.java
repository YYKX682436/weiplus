package com.tencent.magicbrush.biz;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0082 J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0082 J\u0019\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0082 J\u0019\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0082 J!\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0082 J!\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0082 J+\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0082 J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0007J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\tH\u0007J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0007J\u0018\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0007J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007J\u0018\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0007J\u0018\u0010 \u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0007¨\u0006!"}, d2 = {"Lcom/tencent/magicbrush/biz/MBBizManager;", "", "", "jsEngine", "jsContext", "nativeCreate", "inst", "Ljz5/f0;", "nativeDestroy", "", "bizName", "nativeNotifyBizConnected", "nativeNotifyBizDisconnected", "serviceName", "msg", "nativeOnReceiveMsgFromPublicService", "nativeOnReceiveMsgFromBiz", com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "Ljava/nio/ByteBuffer;", "result", "nativeOnReadFileCallback", "onCreatePublicService", "onDestroyPublicService", "to", "onPostMsgToBiz", "onPostMsgToPublicService", "from", "readFileFromBiz", "alias", "version", "onRequirePlugin", "stack", "onJsException", "lib-magicbrush-nano_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class MBBizManager {

    /* renamed from: a, reason: collision with root package name */
    public final zg.a f48596a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f48597b;

    /* renamed from: c, reason: collision with root package name */
    public long f48598c;

    public MBBizManager(zg.a delegate, java.lang.String bizName) {
        kotlin.jvm.internal.o.g(delegate, "delegate");
        kotlin.jvm.internal.o.g(bizName, "bizName");
        this.f48596a = delegate;
        this.f48597b = bizName;
    }

    private final native long nativeCreate(long jsEngine, long jsContext);

    private final native void nativeDestroy(long j17);

    private final native void nativeNotifyBizConnected(long j17, java.lang.String str);

    private final native void nativeNotifyBizDisconnected(long j17, java.lang.String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeOnReadFileCallback(long j17, java.lang.String str, java.lang.String str2, java.nio.ByteBuffer byteBuffer);

    private final native void nativeOnReceiveMsgFromBiz(long j17, java.lang.String str, java.lang.String str2);

    private final native void nativeOnReceiveMsgFromPublicService(long j17, java.lang.String str, java.lang.String str2);

    public final void b(long j17, long j18) {
        this.f48598c = nativeCreate(j17, j18);
    }

    public final void c() {
        long j17 = this.f48598c;
        if (j17 == 0) {
            return;
        }
        nativeDestroy(j17);
        this.f48598c = 0L;
    }

    public final void d(java.lang.String bizName) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        long j17 = this.f48598c;
        if (j17 == 0) {
            throw new java.lang.IllegalStateException("You forgot to call MBBizManager::bindTo");
        }
        nativeNotifyBizConnected(j17, bizName);
    }

    public final void e(java.lang.String bizName) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        long j17 = this.f48598c;
        if (j17 == 0) {
            throw new java.lang.IllegalStateException("You forgot to call MBBizManager::bindTo");
        }
        nativeNotifyBizDisconnected(j17, bizName);
    }

    public final java.lang.String f(java.lang.String serviceName, boolean z17) {
        oc3.a aVar;
        java.lang.String str;
        kotlin.jvm.internal.o.g(serviceName, "serviceName");
        zg.a aVar2 = this.f48596a;
        java.lang.String from = this.f48597b;
        pc3.t tVar = (pc3.t) aVar2;
        synchronized (tVar) {
            kotlin.jvm.internal.o.g(from, "from");
            sc3.k1 k1Var = (sc3.k1) tVar.f353402h.get(from);
            if (k1Var == null || (aVar = k1Var.N0()) == null) {
                aVar = oc3.a.f344326c;
            }
            oc3.b bVar = (oc3.b) aVar.f344328b.get(serviceName);
            if (bVar != null && (str = bVar.f344330b) != null) {
                com.tencent.mars.xlog.Log.i("MagicBrushServerMgr", "onCreatePublicService: " + serviceName + '(' + str + ") from: " + from);
                sc3.k1 k1Var2 = (sc3.k1) tVar.f353402h.get(str);
                jc3.a0 wi6 = ((com.tencent.mm.plugin.magicbrush.z6) tVar.f353400f).wi(str);
                if (k1Var2 == null) {
                    com.tencent.mars.xlog.Log.i("MagicBrushServerMgr", "no exist public service " + str + " found");
                    com.tencent.mm.plugin.magicbrush.MBBuildConfig b07 = wi6.b0();
                    rc3.f1 f1Var = new rc3.f1(b07, wi6, new pc3.p(tVar));
                    wi6.x0(f1Var);
                    com.tencent.mars.xlog.Log.i("MagicBrushServerMgr", "onCreatePublicService with config done");
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = tVar.f353402h;
                    sc3.q1 q1Var = new sc3.q1(tVar.f353399e, str, new com.tencent.magicbrush.biz.MBBizManager(tVar, str));
                    f1Var.f393990h = q1Var;
                    com.tencent.mars.xlog.Log.i(q1Var.Q, "setLocalMBClient instance:" + q1Var.f406476e + " (heartbeat not started for local client)");
                    q1Var.f406480i = f1Var;
                    if (!z17) {
                        q1Var.w1(from);
                    }
                    q1Var.w3(b07);
                    concurrentHashMap.put(str, q1Var);
                } else if (!(k1Var2 instanceof sc3.q1)) {
                    com.tencent.mars.xlog.Log.e("MagicBrushServerMgr", "onCreatePublicService: server " + str + " not available");
                    str = "";
                } else if (!z17) {
                    ((sc3.q1) k1Var2).w1(from);
                }
            }
            com.tencent.mars.xlog.Log.e("MagicBrushServerMgr", "create public service " + serviceName + " failed, serviceName not found");
            str = "";
        }
        return str;
    }

    public final void g(java.lang.String bizName, java.lang.String msg) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(msg, "msg");
        long j17 = this.f48598c;
        if (j17 == 0) {
            throw new java.lang.IllegalStateException("You forgot to call MBBizManager::bindTo");
        }
        nativeOnReceiveMsgFromBiz(j17, bizName, msg);
    }

    public final void h(java.lang.String serviceName, java.lang.String msg) {
        kotlin.jvm.internal.o.g(serviceName, "serviceName");
        kotlin.jvm.internal.o.g(msg, "msg");
        long j17 = this.f48598c;
        if (j17 == 0) {
            throw new java.lang.IllegalStateException("You forgot to call MBBizManager::bindTo");
        }
        nativeOnReceiveMsgFromPublicService(j17, serviceName, msg);
    }

    public final java.lang.String onCreatePublicService(java.lang.String serviceName) {
        kotlin.jvm.internal.o.g(serviceName, "serviceName");
        return f(serviceName, false);
    }

    public final void onDestroyPublicService(java.lang.String serviceName) {
        sc3.k1 k1Var;
        kotlin.jvm.internal.o.g(serviceName, "serviceName");
        zg.a aVar = this.f48596a;
        java.lang.String from = this.f48597b;
        pc3.t tVar = (pc3.t) aVar;
        synchronized (tVar) {
            kotlin.jvm.internal.o.g(from, "from");
            com.tencent.mars.xlog.Log.i("MagicBrushServerMgr", "onDestroyPublicService: " + serviceName + " from: " + from);
            sc3.k1 k1Var2 = (sc3.k1) tVar.f353402h.get(serviceName);
            if (k1Var2 != null) {
                if (k1Var2 instanceof sc3.q1) {
                    ((sc3.q1) k1Var2).y1(from);
                    if (!(!((sc3.q1) k1Var2).f406526y0.isEmpty()) && (k1Var = (sc3.k1) tVar.f353402h.remove(serviceName)) != null) {
                        k1Var.Oc(1);
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MagicBrushServerMgr", "onDestroyPublicService: server " + serviceName + " unknown");
                }
            }
        }
    }

    public final void onJsException(java.lang.String msg, java.lang.String stack) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(stack, "stack");
        pc3.t tVar = (pc3.t) this.f48596a;
        tVar.getClass();
        java.lang.String from = this.f48597b;
        kotlin.jvm.internal.o.g(from, "from");
        sc3.k1 k1Var = (sc3.k1) tVar.f353402h.get(from);
        if (k1Var != null) {
            k1Var.X0(msg, stack, "BizManager");
        }
    }

    public final void onPostMsgToBiz(java.lang.String to6, java.lang.String msg) {
        kotlin.jvm.internal.o.g(to6, "to");
        kotlin.jvm.internal.o.g(msg, "msg");
        pc3.t tVar = (pc3.t) this.f48596a;
        tVar.getClass();
        java.lang.String from = this.f48597b;
        kotlin.jvm.internal.o.g(from, "from");
        sc3.k1 k1Var = (sc3.k1) tVar.f353402h.get(to6);
        if (k1Var != null) {
            k1Var.M0().post(new sc3.j0(k1Var, from, msg));
        }
    }

    public final void onPostMsgToPublicService(java.lang.String to6, java.lang.String msg) {
        kotlin.jvm.internal.o.g(to6, "to");
        kotlin.jvm.internal.o.g(msg, "msg");
        zg.a aVar = this.f48596a;
        java.lang.String from = this.f48597b;
        pc3.t tVar = (pc3.t) aVar;
        tVar.getClass();
        kotlin.jvm.internal.o.g(from, "from");
        sc3.k1 k1Var = (sc3.k1) tVar.f353402h.get(to6);
        if (k1Var != null) {
            if (!(k1Var instanceof sc3.q1)) {
                com.tencent.mars.xlog.Log.e("MagicBrushServerMgr", "onPostMsgToPublicService: server " + to6 + " unknown");
                return;
            }
            sc3.q1 q1Var = (sc3.q1) k1Var;
            synchronized (q1Var) {
                if (q1Var.f406524p0) {
                    q1Var.M0().post(new sc3.p1(q1Var, from, msg));
                } else {
                    kz5.q qVar = (kz5.q) q1Var.f406525x0.get(from);
                    if (qVar != null) {
                        qVar.addLast(msg);
                    }
                }
            }
        }
    }

    public final java.lang.String onRequirePlugin(java.lang.String alias, java.lang.String version) {
        oc3.a N0;
        java.lang.String str;
        lc3.g0 j0Var;
        kotlin.jvm.internal.o.g(alias, "alias");
        kotlin.jvm.internal.o.g(version, "version");
        pc3.t tVar = (pc3.t) this.f48596a;
        tVar.getClass();
        java.lang.String instanceName = this.f48597b;
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        com.tencent.mars.xlog.Log.i("MagicBrushServerMgr", "onRequirePlugin " + instanceName + ", " + alias + ", " + version);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = tVar.f353402h;
        sc3.k1 k1Var = (sc3.k1) concurrentHashMap.get(instanceName);
        if (k1Var == null || (N0 = k1Var.N0()) == null) {
            com.tencent.mars.xlog.Log.e("MagicBrushServerMgr", "onRequirePlugin failed, bizConfigInfo null");
            return "";
        }
        oc3.b bVar = (oc3.b) N0.f344327a.get(alias);
        if (bVar == null || (str = bVar.f344330b) == null) {
            com.tencent.mars.xlog.Log.e("MagicBrushServerMgr", "onRequirePlugin failed, not find provider");
            return "";
        }
        com.tencent.mm.plugin.magicbrush.o6 o6Var = (com.tencent.mm.plugin.magicbrush.o6) tVar.f353401g;
        o6Var.getClass();
        com.tencent.mars.xlog.Log.i("MagicBrushPluginMgrFeat", "providePlugin by " + str + ", version is " + version);
        jc3.z zVar = (jc3.z) ((java.util.HashMap) ((jz5.n) o6Var.f148089d).getValue()).get(str);
        if (zVar == null || (j0Var = zVar.k0(version)) == null) {
            com.tencent.mars.xlog.Log.e("MagicBrushPluginMgrFeat", "plugin " + str + " not provided");
            j0Var = new lc3.j0(";console.error(\"plugin " + str + " not provided\")");
        } else {
            com.tencent.mars.xlog.Log.i("MagicBrushPluginMgrFeat", "providePlugin done");
        }
        sc3.k1 k1Var2 = (sc3.k1) concurrentHashMap.get(instanceName);
        if (k1Var2 != null) {
            k1Var2.M0().l0(kz5.c0.d(k1Var2.V0(j0Var)), (java.lang.String) ((jz5.n) k1Var2.K).getValue(), null);
        }
        com.tencent.mars.xlog.Log.i("MagicBrushServerMgr", "onRequirePlugin with descriptor " + j0Var);
        return "";
    }

    public final void readFileFromBiz(java.lang.String from, java.lang.String path) {
        kotlin.jvm.internal.o.g(from, "from");
        kotlin.jvm.internal.o.g(path, "path");
        zg.a aVar = this.f48596a;
        java.lang.String serviceName = this.f48597b;
        zg.b bVar = new zg.b(this, from, path);
        pc3.t tVar = (pc3.t) aVar;
        tVar.getClass();
        kotlin.jvm.internal.o.g(serviceName, "serviceName");
        sc3.k1 k1Var = (sc3.k1) tVar.f353402h.get(from);
        if (k1Var != null) {
            ((ku5.t0) ku5.t0.f312615d).q(new sc3.i0(new pc3.r(tVar, serviceName, bVar, from), k1Var, path));
            return;
        }
        com.tencent.mars.xlog.Log.e("MagicBrushServerMgr", "onReadFileFromBiz " + from + " not exist");
    }
}
