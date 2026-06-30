package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ns implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et f200732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vv1 f200733e;

    public ns(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et etVar, r45.vv1 vv1Var) {
        this.f200732d = etVar;
        this.f200733e = vv1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1000) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et etVar = this.f200732d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et.h0(etVar).a();
            r45.vv1 vv1Var = this.f200733e;
            if (vv1Var.m75939xb282bd08(2) == 1 || vv1Var.m75939xb282bd08(2) == 2) {
                android.content.Context context = etVar.f199716e;
                db5.t7.m(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nwu));
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ms msVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ms(etVar, vv1Var);
            if (etVar.S == null) {
                android.content.Context context2 = etVar.f199716e;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context2, 1, true);
                k0Var.r(context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nua), 17, context2.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja), null);
                k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bt(etVar);
                k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ct(etVar, msVar);
                k0Var.f293387d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dt(etVar);
                etVar.S = k0Var;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = etVar.S;
            if (k0Var2 == null || k0Var2.i()) {
                return;
            }
            k0Var2.v();
        }
    }
}
