package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class g5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.k5 f194167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f194168e;

    public g5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.k5 k5Var, android.view.ViewGroup viewGroup) {
        this.f194167d = k5Var;
        this.f194168e = viewGroup;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.k5 k5Var = this.f194167d;
        if (itemId == 0) {
            if (!k5Var.f194727s) {
                k5Var.t1();
                return;
            }
            android.view.ViewGroup viewGroup = k5Var.f446856d;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(viewGroup.getContext());
            u1Var.g(viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ceb));
            u1Var.a(true);
            u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.gdu);
            u1Var.k(android.graphics.Color.parseColor("#FF6146"));
            u1Var.j(viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ecb));
            u1Var.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h5(k5Var));
            u1Var.q(false);
            return;
        }
        if (itemId == 2) {
            if (!((mm2.c1) k5Var.P0(mm2.c1.class)).Y4) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("PARAM_FINDER_LIVE_LIVE_FINISH_MANUAL", true);
                bundle.putBoolean("PARAM_FINDER_LIVE_LIVE_FINISH_IF_CLOSE_LIVE", false);
                k5Var.f194724p.mo46557x60d69242(qo0.b.H, bundle);
                return;
            }
            h63.s1 s1Var = (h63.s1) i95.n0.c(h63.s1.class);
            android.view.ViewGroup viewGroup2 = this.f194168e;
            android.content.Context context = viewGroup2.getContext();
            java.lang.String str = ((mm2.c1) k5Var.P0(mm2.c1.class)).f410316b5;
            if (str == null && (str = ((mm2.e1) k5Var.P0(mm2.e1.class)).f410521r.m75945x2fec8307(22)) == null) {
                str = "";
            }
            int i18 = ((mm2.c1) k5Var.P0(mm2.c1.class)).f410321c5;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            ((h63.g1) s1Var).Di(context, str, i18, bool, bool, java.lang.Long.valueOf(((mm2.e1) k5Var.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
            android.content.Context context2 = viewGroup2.getContext();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2 : null;
            if (activityC0065xcd7aa112 != null) {
                activityC0065xcd7aa112.finish();
            }
        }
    }
}
