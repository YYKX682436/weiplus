package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.modelbase.k2 f70660a = new com.tencent.mm.modelbase.k2();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f70661b = jz5.h.b(com.tencent.mm.modelbase.i2.f70652d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f70662c = jz5.h.b(com.tencent.mm.modelbase.j2.f70657d);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Set f70663d = kz5.z.D0(new java.lang.Integer[]{522, 175, 110, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.pay.a2.CTRL_INDEX), 6828, 127});

    public final void a() {
        if (d()) {
            synchronized (f()) {
                if (z65.c.a()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueueBuckets", "clear: total=" + f70660a.b() + ">>0");
                }
                f70660a.f().clear();
            }
        }
    }

    public final int b() {
        int I0;
        if (!d()) {
            return 0;
        }
        synchronized (f()) {
            I0 = kz5.n0.I0(f70660a.f().values());
        }
        return I0;
    }

    public final void c(int i17) {
        if (d()) {
            synchronized (f()) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                com.tencent.mm.modelbase.k2 k2Var = f70660a;
                if (k2Var.f().containsKey(valueOf)) {
                    java.lang.Integer num = (java.lang.Integer) k2Var.f().get(java.lang.Integer.valueOf(i17));
                    int intValue = num != null ? num.intValue() : 0;
                    if (z65.c.a()) {
                        int b17 = k2Var.b();
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dec: cgi=");
                        sb6.append(i17);
                        sb6.append(", bucket=");
                        sb6.append(intValue);
                        sb6.append(">>");
                        sb6.append(intValue - 1);
                        sb6.append(", total=");
                        sb6.append(b17);
                        sb6.append(">>");
                        sb6.append(b17 - 1);
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueueBuckets", sb6.toString());
                    }
                    if (intValue >= 0 && intValue <= k2Var.e()) {
                        if (intValue > 1) {
                            k2Var.f().put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(intValue - 1));
                        } else {
                            k2Var.f().remove(java.lang.Integer.valueOf(i17));
                        }
                    } else {
                        throw new java.lang.IllegalStateException("Invalid bucket value to dec: cgiType=" + i17 + ", bucket=" + intValue);
                    }
                }
            }
        }
    }

    public final boolean d() {
        return mm.k.j(mm.k.E1, null, 1, null) && e() > 0;
    }

    public final int e() {
        return ((java.lang.Number) ((jz5.n) f70661b).getValue()).intValue();
    }

    public final java.util.Map f() {
        return (java.util.Map) ((jz5.n) f70662c).getValue();
    }

    public final boolean g(int i17) {
        boolean z17;
        synchronized (f()) {
            com.tencent.mm.modelbase.k2 k2Var = f70660a;
            java.lang.Integer num = (java.lang.Integer) k2Var.f().get(java.lang.Integer.valueOf(i17));
            z17 = (num != null ? num.intValue() : 0) < k2Var.e();
        }
        return z17;
    }

    public final void h(int i17) {
        if (d()) {
            synchronized (f()) {
                com.tencent.mm.modelbase.k2 k2Var = f70660a;
                java.lang.Integer num = (java.lang.Integer) k2Var.f().get(java.lang.Integer.valueOf(i17));
                int intValue = num != null ? num.intValue() : 0;
                if (z65.c.a()) {
                    int b17 = k2Var.b();
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueueBuckets", "inc: cgi=" + i17 + ", bucket=" + intValue + ">>" + (intValue + 1) + ", total=" + b17 + ">>" + (b17 + 1));
                }
                if (intValue < 0 || intValue >= k2Var.e()) {
                    throw new java.lang.IllegalStateException("Invalid bucket value to inc: cgiType=" + i17 + ", bucket=" + intValue);
                }
                k2Var.f().put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(intValue + 1));
            }
        }
    }
}
