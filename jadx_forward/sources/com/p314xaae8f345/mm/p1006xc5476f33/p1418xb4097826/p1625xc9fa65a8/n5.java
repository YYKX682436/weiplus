package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes8.dex */
public final class n5 implements tj5.m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.u5 f207326d;

    public n5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.u5 u5Var) {
        this.f207326d = u5Var;
    }

    @Override // tj5.m
    public final void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SearchSuggestion", "totalText :" + str + " inEditText:" + str2 + " tagList.size:" + list.size() + " textChangeStatus:" + oVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.u5 u5Var = this.f207326d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u5Var.f207433m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r26.n0.u0(u5Var.f207433m).toString(), str2)) {
            u5Var.b();
            return;
        }
        u5Var.f207432i = str2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.r5 r5Var = u5Var.f207431h;
            r5Var.f207374d = null;
            r5Var.notifyDataSetChanged();
            u5Var.a();
            return;
        }
        gm0.j1.d().d(u5Var.f207434n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        u5Var.f207434n = new db2.j6(str2);
        gm0.j1.d().g(u5Var.f207434n);
    }
}
