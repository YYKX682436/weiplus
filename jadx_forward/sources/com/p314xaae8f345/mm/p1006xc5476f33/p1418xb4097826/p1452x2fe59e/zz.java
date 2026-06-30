package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class zz implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 f192843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rz f192844b;

    public zz(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 g00Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rz rzVar) {
        this.f192843a = g00Var;
        this.f192844b = rzVar;
    }

    @Override // d85.k0
    /* renamed from: onOp */
    public final void mo14305x341c20(java.lang.Boolean bool) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rz rzVar = this.f192844b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 g00Var = this.f192843a;
        if (!booleanValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(g00Var.f188334f, "checkAndShowBusinessPermissionDialog, no poi permission,loadType=" + rzVar);
            g00Var.l(-3, so2.g5.f491896e);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00.a(g00Var);
        g00Var.f188330b.i1(-3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(g00Var.f188334f, "checkAndShowBusinessPermissionDialog grant permission,loadType=" + rzVar);
        int ordinal = rzVar.ordinal();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar = g00Var.f188331c;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2 && ctVar != null) {
                    com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 l17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).l();
                    int i17 = com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.f294960y1;
                    l17.L(false);
                }
            } else if (ctVar != null) {
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.K(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).l(), false, 1, null);
            }
        } else if (ctVar != null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 l18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).l();
            int i18 = com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.f294960y1;
            l18.L(false);
        }
        if (ctVar != null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 l19 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).l();
            if (l19.getEnableLoadMore()) {
                return;
            }
            l19.m82688x390c1d00(true);
            if (l19.getF294968x() == null) {
                android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(g00Var.f188329a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dxa, (android.view.ViewGroup) null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
                l19.m82697xe136b7d8(inflate);
            }
        }
    }
}
