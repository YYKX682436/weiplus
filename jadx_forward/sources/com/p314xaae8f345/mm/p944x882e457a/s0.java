package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes11.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f152334a = new java.util.concurrent.ConcurrentHashMap();

    public static com.p314xaae8f345.mm.p944x882e457a.t0 a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.t0 t0Var = (com.p314xaae8f345.mm.p944x882e457a.t0) f152334a.get(obj);
        if (t0Var == null) {
            for (fs.q qVar : ((fs.c) fs.g.f(com.p314xaae8f345.mm.p944x882e457a.i1.class)).all()) {
                if (qVar.mo210xb7045565(obj)) {
                    t0Var = (com.p314xaae8f345.mm.p944x882e457a.t0) qVar.get();
                }
            }
        }
        if (t0Var == null) {
            java.lang.String a17 = bm5.f1.a();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b5 b5Var = bm5.b1.f104069a;
            if (obj != null) {
                try {
                    java.util.Set set = bm5.b1.f104073e;
                    if (!((java.util.HashSet) set).contains(obj)) {
                        synchronized (set) {
                            if (!((java.util.HashSet) set).contains(obj)) {
                                ((java.util.HashSet) set).add(obj);
                                if (bm5.b1.f104069a.b("reportMissingIMessageExtension")) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MissingMessageListenerReporter", java.lang.String.format("%s;%s", "IMessageExtension", obj));
                                }
                            }
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MissingMessageListenerReporter", th6, "fail to call reportMissingIMessageExtension(%s,%s)", a17, obj);
                }
            }
        }
        return t0Var;
    }
}
