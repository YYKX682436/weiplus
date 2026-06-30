package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class h5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f145733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f145734b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.x5 f145735c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f145736d;

    public h5(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, android.view.View view, com.p314xaae8f345.mm.p648x55baa833.ui.x5 x5Var, int i17) {
        this.f145733a = u3Var;
        this.f145734b = view;
        this.f145735c = x5Var;
        this.f145736d = i17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f145733a;
        if (u3Var != null && u3Var.isShowing()) {
            u3Var.dismiss();
        }
        tm.a b17 = tm.a.b(fVar.f152150c);
        android.view.View view = this.f145734b;
        if (b17 != null) {
            b17.c(view.getContext(), null, null);
        } else if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p648x55baa833.ui.x5 x5Var = this.f145735c;
            java.util.List list = x5Var.f146181e;
            int i17 = this.f145736d;
            ((dm.w9) list.get(i17)).f69031x29d3a50c = 1;
            ((dm.w9) x5Var.f146181e.get(i17)).m125665xee5c84a2(gm0.j1.u().f354686f, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(219L, 23L, 1L, true);
        } else {
            db5.e1.s(view.getContext(), view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571328bw), view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
        }
        return jz5.f0.f384359a;
    }
}
