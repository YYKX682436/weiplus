package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

@j95.b
/* loaded from: classes7.dex */
public final class v extends i95.w implements l75.l0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5 {

    /* renamed from: e, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.v f158116e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f158117d = new java.util.concurrent.atomic.AtomicBoolean(false);

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.q(null);
    }

    public static final void wi(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.v vVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4) {
        vVar.getClass();
        java.lang.String z07 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ui().z0(k91.o1.a(c11714x918fd2e4.f157895e), "true");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z07);
        if (java.lang.Boolean.parseBoolean(z07)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ui().d(k91.o1.a(c11714x918fd2e4.f157895e));
    }

    public final boolean Ai(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r rVar, boolean z17) {
        if (list == null) {
            if (!z65.c.a()) {
                return false;
            }
            iz5.a.g("reorderList is NULL", false);
        }
        this.f158117d.set(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.u uVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.u(this, list, z17, rVar);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            ((ku5.t0) ku5.t0.f394148d).b(uVar, "MicroMsg.AppBrandCollectionStorageExport[collection]");
        } else {
            uVar.run();
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5
    public int Dc(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2 w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        return w2Var.m0(str, i17, true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5
    public boolean Lg(java.util.List list, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCollectionStorageExport[collection]", "reorder reason = " + i17);
        return Ai(list, i17 != 0 ? i17 != 1 ? null : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.s(this) : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.t(this), true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5
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

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5
    public int ce(java.lang.String str, int i17, boolean z17) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2 w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        return w2Var.m0(str, i17, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5
    /* renamed from: getCount */
    public int mo49831x7444f759() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2 w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class);
        if (w2Var != null) {
            return w2Var.s0();
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5
    public boolean m2(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2 w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        return w2Var.z0(str, i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5
    public boolean nh(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2 w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        return w2Var.D0(str, i17, true);
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.wi().getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.mj();
        f158116e = this;
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        f158116e = null;
    }

    @Override // l75.l0
    /* renamed from: remove */
    public void mo49775xc84af884(l75.q0 q0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2 w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class);
        if (w2Var != null) {
            w2Var.mo49775xc84af884(q0Var);
        }
        k91.m4 ij6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij();
        if (ij6 != null) {
            ij6.mo49775xc84af884(q0Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5
    public java.util.List xi(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.y5 y5Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2 w2Var;
        if (i17 > 0 && (w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class)) != null) {
            return w2Var.u0(i17, y5Var);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5
    public int y7() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.x2.h();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5
    public java.util.List ye(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.y5 y5Var, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2 w2Var;
        if (i17 > 0 && (w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class)) != null) {
            return w2Var.y0(i17, y5Var, i18);
        }
        return null;
    }

    @Override // l75.l0
    public void add(l75.q0 q0Var, android.os.Looper looper) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2 w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class);
        if (w2Var != null) {
            w2Var.add(q0Var, looper);
        }
        k91.m4 ij6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij();
        if (ij6 != null) {
            ij6.add(q0Var, looper);
        }
    }

    @Override // l75.l0
    public void add(java.lang.String str, l75.q0 q0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2 w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class);
        if (w2Var != null) {
            w2Var.add(str, q0Var);
        }
        k91.m4 ij6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij();
        if (ij6 != null) {
            ij6.add(str, q0Var);
        }
    }
}
