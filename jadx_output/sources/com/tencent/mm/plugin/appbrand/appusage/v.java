package com.tencent.mm.plugin.appbrand.appusage;

@j95.b
/* loaded from: classes7.dex */
public final class v extends i95.w implements l75.l0, com.tencent.mm.plugin.appbrand.appusage.z5 {

    /* renamed from: e, reason: collision with root package name */
    public static com.tencent.mm.plugin.appbrand.appusage.v f76583e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f76584d = new java.util.concurrent.atomic.AtomicBoolean(false);

    static {
        new com.tencent.mm.plugin.appbrand.appusage.q(null);
    }

    public static final void wi(com.tencent.mm.plugin.appbrand.appusage.v vVar, com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo) {
        vVar.getClass();
        java.lang.String z07 = com.tencent.mm.plugin.appbrand.app.r9.Ui().z0(k91.o1.a(localUsageInfo.f76362e), "true");
        kotlin.jvm.internal.o.d(z07);
        if (java.lang.Boolean.parseBoolean(z07)) {
            return;
        }
        com.tencent.mm.plugin.appbrand.app.r9.Ui().d(k91.o1.a(localUsageInfo.f76362e));
    }

    public final boolean Ai(java.util.List list, com.tencent.mm.plugin.appbrand.appusage.r rVar, boolean z17) {
        if (list == null) {
            if (!z65.c.a()) {
                return false;
            }
            iz5.a.g("reorderList is NULL", false);
        }
        this.f76584d.set(true);
        com.tencent.mm.plugin.appbrand.appusage.u uVar = new com.tencent.mm.plugin.appbrand.appusage.u(this, list, z17, rVar);
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            ((ku5.t0) ku5.t0.f312615d).b(uVar, "MicroMsg.AppBrandCollectionStorageExport[collection]");
        } else {
            uVar.run();
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public int Dc(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        com.tencent.mm.plugin.appbrand.appusage.w2 w2Var = (com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class);
        kotlin.jvm.internal.o.d(str);
        return w2Var.m0(str, i17, true);
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public boolean Lg(java.util.List list, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCollectionStorageExport[collection]", "reorder reason = " + i17);
        return Ai(list, i17 != 0 ? i17 != 1 ? null : new com.tencent.mm.plugin.appbrand.appusage.s(this) : new com.tencent.mm.plugin.appbrand.appusage.t(this), true);
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public boolean Y1(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return m2(k91.k4.f(str), i17);
    }

    @Override // l75.l0
    public void add(l75.q0 q0Var) {
        add(q0Var, android.os.Looper.getMainLooper());
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public int ce(java.lang.String str, int i17, boolean z17) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        com.tencent.mm.plugin.appbrand.appusage.w2 w2Var = (com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class);
        kotlin.jvm.internal.o.d(str);
        return w2Var.m0(str, i17, z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public int getCount() {
        com.tencent.mm.plugin.appbrand.appusage.w2 w2Var = (com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class);
        if (w2Var != null) {
            return w2Var.s0();
        }
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public boolean m2(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appusage.w2 w2Var = (com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class);
        kotlin.jvm.internal.o.d(str);
        return w2Var.z0(str, i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public boolean nh(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appusage.w2 w2Var = (com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class);
        kotlin.jvm.internal.o.d(str);
        return w2Var.D0(str, i17, true);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.appbrand.app.r9.wi().getClass();
        com.tencent.mm.plugin.appbrand.app.r9.mj();
        f76583e = this;
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        f76583e = null;
    }

    @Override // l75.l0
    public void remove(l75.q0 q0Var) {
        com.tencent.mm.plugin.appbrand.appusage.w2 w2Var = (com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class);
        if (w2Var != null) {
            w2Var.remove(q0Var);
        }
        k91.m4 ij6 = com.tencent.mm.plugin.appbrand.app.r9.ij();
        if (ij6 != null) {
            ij6.remove(q0Var);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public java.util.List xi(int i17, com.tencent.mm.plugin.appbrand.appusage.y5 y5Var) {
        com.tencent.mm.plugin.appbrand.appusage.w2 w2Var;
        if (i17 > 0 && (w2Var = (com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class)) != null) {
            return w2Var.u0(i17, y5Var);
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public int y7() {
        return com.tencent.mm.plugin.appbrand.appusage.x2.h();
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public java.util.List ye(int i17, com.tencent.mm.plugin.appbrand.appusage.y5 y5Var, int i18) {
        com.tencent.mm.plugin.appbrand.appusage.w2 w2Var;
        if (i17 > 0 && (w2Var = (com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class)) != null) {
            return w2Var.y0(i17, y5Var, i18);
        }
        return null;
    }

    @Override // l75.l0
    public void add(l75.q0 q0Var, android.os.Looper looper) {
        com.tencent.mm.plugin.appbrand.appusage.w2 w2Var = (com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class);
        if (w2Var != null) {
            w2Var.add(q0Var, looper);
        }
        k91.m4 ij6 = com.tencent.mm.plugin.appbrand.app.r9.ij();
        if (ij6 != null) {
            ij6.add(q0Var, looper);
        }
    }

    @Override // l75.l0
    public void add(java.lang.String str, l75.q0 q0Var) {
        com.tencent.mm.plugin.appbrand.appusage.w2 w2Var = (com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class);
        if (w2Var != null) {
            w2Var.add(str, q0Var);
        }
        k91.m4 ij6 = com.tencent.mm.plugin.appbrand.app.r9.ij();
        if (ij6 != null) {
            ij6.add(str, q0Var);
        }
    }
}
