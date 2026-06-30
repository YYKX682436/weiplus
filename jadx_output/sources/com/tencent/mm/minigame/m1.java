package com.tencent.mm.minigame;

/* loaded from: classes12.dex */
public class m1 implements com.tencent.shadow.core.common.ILoggerFactory {

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.minigame.m1 f69109c = new com.tencent.mm.minigame.m1();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f69110d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentMap f69111a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f69112b = new java.util.ArrayList();

    @Override // com.tencent.shadow.core.common.ILoggerFactory
    public com.tencent.shadow.core.common.Logger getLogger(java.lang.String str) {
        java.util.concurrent.ConcurrentMap concurrentMap = this.f69111a;
        com.tencent.shadow.core.common.Logger logger = (com.tencent.shadow.core.common.Logger) ((java.util.concurrent.ConcurrentHashMap) concurrentMap).get(str);
        if (logger != null) {
            return logger;
        }
        com.tencent.mm.minigame.l1 l1Var = new com.tencent.mm.minigame.l1(this, str);
        com.tencent.shadow.core.common.Logger logger2 = (com.tencent.shadow.core.common.Logger) ((java.util.concurrent.ConcurrentHashMap) concurrentMap).putIfAbsent(str, l1Var);
        return logger2 == null ? l1Var : logger2;
    }

    @Override // com.tencent.shadow.core.common.ILoggerFactory
    public long getNativeLogFunc() {
        return com.tencent.mm.minigame.XLogBridgeNative.getNativeLogFunc();
    }

    @Override // com.tencent.shadow.core.common.ILoggerFactory
    public void init(boolean z17) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f69110d;
        if (!atomicBoolean.get() && z17) {
            fp.d0.o("wechatxlog");
            com.tencent.mars.xlog.MMXlog mMXlog = new com.tencent.mars.xlog.MMXlog(true);
            mMXlog.appenderOpen(2, 0, com.tencent.mm.storage.x3.f196324a, lp0.b.g0(), "WVA_SANDBOX", 3);
            com.tencent.mm.sdk.platformtools.Log.j(mMXlog);
        }
        atomicBoolean.set(true);
        com.tencent.mars.xlog.Log.LogImp impl = com.tencent.mars.xlog.Log.getImpl();
        synchronized (this.f69112b) {
            java.util.Iterator it = this.f69112b.iterator();
            while (it.hasNext()) {
                com.tencent.mm.minigame.k1 k1Var = (com.tencent.mm.minigame.k1) it.next();
                java.lang.Throwable th6 = k1Var.f69094d;
                java.lang.String format = th6 == null ? k1Var.f69093c : java.lang.String.format(k1Var.f69093c, th6);
                if (format == null) {
                    format = "";
                }
                java.lang.String str = format;
                int i17 = k1Var.f69091a;
                if (i17 == 1) {
                    impl.logE(0L, k1Var.f69092b, "", "", 0, k1Var.f69095e, k1Var.f69096f, k1Var.f69097g, str);
                } else if (i17 == 2) {
                    impl.logW(0L, k1Var.f69092b, "", "", 0, k1Var.f69095e, k1Var.f69096f, k1Var.f69097g, str);
                } else if (i17 == 3) {
                    impl.logI(0L, k1Var.f69092b, "", "", 0, k1Var.f69095e, k1Var.f69096f, k1Var.f69097g, str);
                } else if (i17 == 4) {
                    impl.logD(0L, k1Var.f69092b, "", "", 0, k1Var.f69095e, k1Var.f69096f, k1Var.f69097g, str);
                } else if (i17 == 5) {
                    impl.logV(0L, k1Var.f69092b, "", "", 0, k1Var.f69095e, k1Var.f69096f, k1Var.f69097g, str);
                }
            }
            this.f69112b.clear();
        }
    }
}
