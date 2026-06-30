package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes8.dex */
public final class n4 implements tj5.m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.u4 f207325d;

    public n4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.u4 u4Var) {
        this.f207325d = u4Var;
    }

    @Override // tj5.m
    public final void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SearchSuggestion", "totalText :" + str + " inEditText:" + str2 + " tagList.size:" + list.size() + " textChangeStatus:" + oVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.u4 u4Var = this.f207325d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u4Var.f207424l) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r26.n0.u0(u4Var.f207424l).toString(), str2)) {
            u4Var.b();
            return;
        }
        u4Var.f207423k = str2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            u4Var.f207422j = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.r4 r4Var = u4Var.f207421i;
            r4Var.f207372d = null;
            r4Var.notifyDataSetChanged();
            u4Var.a();
            return;
        }
        bq.t1 t1Var = u4Var.f207425m;
        if (t1Var != null) {
            t1Var.j();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = u4Var.f207422j;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = u4Var.f207413a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        bq.t1 t1Var2 = new bq.t1(str2, gVar, u4Var.f207415c, nyVar != null ? nyVar.V6() : null);
        u4Var.f207425m = t1Var2;
        pm0.v.T(t1Var2.l(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.m4(u4Var, str2));
    }
}
