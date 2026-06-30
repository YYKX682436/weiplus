package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class e10 implements ym5.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 f188150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f188151e;

    public e10(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 r10Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f188150d = r10Var;
        this.f188151e = abstractActivityC21394xb3d2c0cf;
    }

    @Override // ym5.m1
    /* renamed from: onChanged */
    public void mo56048x7bb163d5() {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 r10Var = this.f188150d;
        java.lang.String str = r10Var.f190398i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onChanged ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = r10Var.f188690f;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = a1Var != null ? a1Var.f187713m : null;
        if (!(c22801x87cbdc002 instanceof com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00)) {
            c22801x87cbdc002 = null;
        }
        sb6.append(c22801x87cbdc002 != null ? java.lang.Integer.valueOf(c22801x87cbdc002.getVisibility()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var2 = r10Var.f188690f;
        if (a1Var2 == null || (c22801x87cbdc00 = a1Var2.f187713m) == null) {
            return;
        }
        c22801x87cbdc00.mo56048x7bb163d5();
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeChanged */
    public void mo56049xa44dd169(int i17, int i18) {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = this.f188150d.f188690f;
        if (a1Var == null || (c22801x87cbdc00 = a1Var.f187713m) == null) {
            return;
        }
        c22801x87cbdc00.mo56049xa44dd169(i17 + (a1Var != null ? a1Var.o().a0() : 0), i18);
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeInserted */
    public void mo56051xb0566d03(int i17, int i18) {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = this.f188150d.f188690f;
        if (a1Var == null || (c22801x87cbdc00 = a1Var.f187713m) == null) {
            return;
        }
        c22801x87cbdc00.mo56051xb0566d03(i17 + (a1Var != null ? a1Var.o().a0() : 0), i18);
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeMoved */
    public void mo56052x5e3cd6a8(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 r10Var = this.f188150d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = r10Var.f188690f;
        if (a1Var == null || (c22801x87cbdc00 = a1Var.f187713m) == null) {
            return;
        }
        int a07 = i17 + (a1Var != null ? a1Var.o().a0() : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var2 = r10Var.f188690f;
        c22801x87cbdc00.mo56052x5e3cd6a8(a07, i18 + (a1Var2 != null ? a1Var2.o().a0() : 0), i19);
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeRemoved */
    public void mo56053xb9568715(int i17, int i18) {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 r10Var = this.f188150d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = r10Var.f188690f;
        if (a1Var != null && (c22801x87cbdc00 = a1Var.f187713m) != null) {
            c22801x87cbdc00.mo56053xb9568715(i17 + (a1Var != null ? a1Var.o().a0() : 0), i18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var2 = r10Var.f188690f;
        if (a1Var2 != null) {
            a1Var2.M();
        }
    }

    @Override // ym5.p1
    /* renamed from: onPreFinishLoadMore */
    public void mo15403x2053b072(ym5.s3 reason) {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 r10Var = this.f188150d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = r10Var.f188690f;
        if (a1Var != null && (c22801x87cbdc00 = a1Var.f187713m) != null) {
            c22801x87cbdc00.O(reason);
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.b10(r10Var, reason));
    }

    @Override // ym5.p1
    /* renamed from: onPreFinishLoadMoreSmooth */
    public void mo56054xc12c74c0(ym5.s3 reason) {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 r10Var = this.f188150d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = r10Var.f188690f;
        if (a1Var != null && (c22801x87cbdc00 = a1Var.f187713m) != null) {
            c22801x87cbdc00.mo56054xc12c74c0(reason);
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c10(r10Var, reason));
    }

    @Override // ym5.p1
    /* renamed from: onPreFinishRefresh */
    public void mo15404x8041b4e4(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.d10(reason, this.f188150d, this.f188151e));
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeChanged */
    public void mo56050xa44dd169(int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = this.f188150d.f188690f;
        if (a1Var == null || (c22801x87cbdc00 = a1Var.f187713m) == null) {
            return;
        }
        c22801x87cbdc00.mo56050xa44dd169(i17 + (a1Var != null ? a1Var.o().a0() : 0), i18, obj);
    }
}
