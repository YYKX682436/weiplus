package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes13.dex */
public class t4 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.p176xb6135e39.p283xc50a8b8b.t4 f127076b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.t4 f127077c = new com.p176xb6135e39.p283xc50a8b8b.t4(true);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f127078a;

    public t4(com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        if (t4Var == f127077c) {
            this.f127078a = java.util.Collections.emptyMap();
        } else {
            this.f127078a = java.util.Collections.unmodifiableMap(t4Var.f127078a);
        }
    }

    public static com.p176xb6135e39.p283xc50a8b8b.t4 a() {
        com.p176xb6135e39.p283xc50a8b8b.t4 t4Var = f127076b;
        if (t4Var == null) {
            synchronized (com.p176xb6135e39.p283xc50a8b8b.t4.class) {
                t4Var = f127076b;
                if (t4Var == null) {
                    java.lang.Class cls = com.p176xb6135e39.p283xc50a8b8b.r4.f127007a;
                    com.p176xb6135e39.p283xc50a8b8b.t4 t4Var2 = null;
                    if (cls != null) {
                        try {
                            t4Var2 = (com.p176xb6135e39.p283xc50a8b8b.t4) cls.getDeclaredMethod("getEmptyRegistry", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    if (t4Var2 == null) {
                        t4Var2 = f127077c;
                    }
                    f127076b = t4Var2;
                    t4Var = t4Var2;
                }
            }
        }
        return t4Var;
    }

    public t4(boolean z17) {
        this.f127078a = java.util.Collections.emptyMap();
    }
}
