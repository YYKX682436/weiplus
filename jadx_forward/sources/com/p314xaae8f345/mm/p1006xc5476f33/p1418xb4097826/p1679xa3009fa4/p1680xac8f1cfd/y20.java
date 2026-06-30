package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class y20 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f218052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f218053e;

    public y20(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var) {
        this.f218052d = c19786x6a1e2862;
        this.f218053e = f50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initPosterEntrance$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f218052d;
        r45.k74 m76504xa819f0c7 = c19786x6a1e2862.m76504xa819f0c7();
        java.lang.String m75945x2fec8307 = m76504xa819f0c7 != null ? m76504xa819f0c7.m75945x2fec8307(3) : null;
        boolean z17 = m75945x2fec8307 == null || m75945x2fec8307.length() == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var = this.f218053e;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.SelfUIC", "initPosterEntrance creatorCenterJumpInfo.lite_app_info?.default_url is null or empty");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SelfUIC", "initPosterEntrance default_url:" + m75945x2fec8307);
            r45.k74 m76504xa819f0c72 = c19786x6a1e2862.m76504xa819f0c7();
            if (m76504xa819f0c72 != null) {
                m76504xa819f0c72.set(3, f50Var.Y6(m75945x2fec8307));
            }
        }
        r45.k74 m76504xa819f0c73 = c19786x6a1e2862.m76504xa819f0c7();
        if (m76504xa819f0c73 != null) {
            hc2.i0.a(m76504xa819f0c73, kz5.b1.e(new jz5.l("from_page", 1)));
        }
        f50Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SelfUIC", "openLiteAppCreatorCenter");
        f50Var.R6();
        xc2.y2.i(xc2.y2.f534876a, f50Var.m80379x76847179(), new xc2.p0(c19786x6a1e2862), 0, null, 12, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initPosterEntrance$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
