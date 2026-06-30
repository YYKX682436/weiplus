package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes11.dex */
public final class cl extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public ob0.s2 f215557d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        e42.c0 c0Var = e42.c0.clicfg_matrix_biz_memory_stat_report_sample_rate;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        this.f215557d = ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).Ai("finder_home", ih.a.c(c0Var, z65.c.a() ? 1L : -1L));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        this.f215557d = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FinderHomeMemoryStatUIC] onStart ");
        ob0.s2 s2Var = this.f215557d;
        sb6.append(s2Var != null ? s2Var.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHomeMemoryStatUIC", sb6.toString());
        ob0.s2 s2Var2 = this.f215557d;
        if (s2Var2 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.i) s2Var2).a();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FinderHomeMemoryStatUIC] onStop ");
        ob0.s2 s2Var = this.f215557d;
        sb6.append(s2Var != null ? s2Var.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHomeMemoryStatUIC", sb6.toString());
        ob0.s2 s2Var2 = this.f215557d;
        if (s2Var2 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.i) s2Var2).b();
        }
    }
}
