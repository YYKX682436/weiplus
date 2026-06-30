package com.google.protobuf;

/* loaded from: classes13.dex */
public class t4 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.google.protobuf.t4 f45543b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.protobuf.t4 f45544c = new com.google.protobuf.t4(true);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f45545a;

    public t4(com.google.protobuf.t4 t4Var) {
        if (t4Var == f45544c) {
            this.f45545a = java.util.Collections.emptyMap();
        } else {
            this.f45545a = java.util.Collections.unmodifiableMap(t4Var.f45545a);
        }
    }

    public static com.google.protobuf.t4 a() {
        com.google.protobuf.t4 t4Var = f45543b;
        if (t4Var == null) {
            synchronized (com.google.protobuf.t4.class) {
                t4Var = f45543b;
                if (t4Var == null) {
                    java.lang.Class cls = com.google.protobuf.r4.f45474a;
                    com.google.protobuf.t4 t4Var2 = null;
                    if (cls != null) {
                        try {
                            t4Var2 = (com.google.protobuf.t4) cls.getDeclaredMethod("getEmptyRegistry", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    if (t4Var2 == null) {
                        t4Var2 = f45544c;
                    }
                    f45543b = t4Var2;
                    t4Var = t4Var2;
                }
            }
        }
        return t4Var;
    }

    public t4(boolean z17) {
        this.f45545a = java.util.Collections.emptyMap();
    }
}
