package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o1 f283812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f283813e;

    public j1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o1 o1Var, java.util.ArrayList arrayList) {
        this.f283812d = o1Var;
        this.f283813e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zb5.e eVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o1 o1Var = this.f283812d;
        if (o1Var.f283926i == null || o1Var.f283927m.get() || (eVar = o1Var.f283926i) == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ActivityC21746xa8e928c2 activityC21746xa8e928c2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ActivityC21746xa8e928c2) eVar;
        java.util.ArrayList appendedData = this.f283813e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appendedData, "appendedData");
        q40.e eVar2 = activityC21746xa8e928c2.f282097f;
        if (eVar2 != null) {
            java.lang.String query = activityC21746xa8e928c2.f282098g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.C15104x4e0baa10 c15104x4e0baa10 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.C15104x4e0baa10) eVar2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ConvSearchFeedFragment", "onSearchResultAppend query=" + query + " size=" + appendedData.size());
            c15104x4e0baa10.f210541y = query;
            c15104x4e0baa10.f210538v.mo7808x76db6cb1(appendedData);
        }
    }
}
