package com.tencent.mm.modelbase;

/* loaded from: classes11.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f70801a = new java.util.concurrent.ConcurrentHashMap();

    public static com.tencent.mm.modelbase.t0 a(java.lang.Object obj) {
        com.tencent.mm.modelbase.t0 t0Var = (com.tencent.mm.modelbase.t0) f70801a.get(obj);
        if (t0Var == null) {
            for (fs.q qVar : ((fs.c) fs.g.f(com.tencent.mm.modelbase.i1.class)).all()) {
                if (qVar.hasKey(obj)) {
                    t0Var = (com.tencent.mm.modelbase.t0) qVar.get();
                }
            }
        }
        if (t0Var == null) {
            java.lang.String a17 = bm5.f1.a();
            com.tencent.mm.sdk.platformtools.b5 b5Var = bm5.b1.f22536a;
            if (obj != null) {
                try {
                    java.util.Set set = bm5.b1.f22540e;
                    if (!((java.util.HashSet) set).contains(obj)) {
                        synchronized (set) {
                            if (!((java.util.HashSet) set).contains(obj)) {
                                ((java.util.HashSet) set).add(obj);
                                if (bm5.b1.f22536a.b("reportMissingIMessageExtension")) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.MissingMessageListenerReporter", java.lang.String.format("%s;%s", "IMessageExtension", obj));
                                }
                            }
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MissingMessageListenerReporter", th6, "fail to call reportMissingIMessageExtension(%s,%s)", a17, obj);
                }
            }
        }
        return t0Var;
    }
}
