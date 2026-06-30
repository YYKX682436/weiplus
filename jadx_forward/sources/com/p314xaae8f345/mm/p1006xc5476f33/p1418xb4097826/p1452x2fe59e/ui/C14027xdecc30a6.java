package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLivePurchaseMicListUI;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePurchaseMicListUI */
/* loaded from: classes3.dex */
public final class C14027xdecc30a6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 {

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f190941t;

    public C14027xdecc30a6(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        this.f190941t = c19786x6a1e2862;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: l0 */
    public java.util.Set getF204828n() {
        return kz5.o1.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.jo.class);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityCreated */
    public void mo7495x78cb4fa(android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String m75945x2fec8307;
        super.mo7495x78cb4fa(bundle);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 jumpInfo = this.f190941t;
        if (jumpInfo != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.jo joVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.jo) pf5.z.f435481a.b(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.jo.class);
            joVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
            android.os.SystemClock.elapsedRealtime();
            new java.util.ArrayList();
            new java.util.HashMap();
            new java.util.HashMap();
            new java.util.HashMap();
            new java.util.HashMap();
            new java.util.ArrayList();
            new java.util.ArrayList();
            new java.util.ArrayList();
            r45.k74 m76504xa819f0c7 = jumpInfo.m76504xa819f0c7();
            java.lang.String m75945x2fec83072 = m76504xa819f0c7 != null ? m76504xa819f0c7.m75945x2fec8307(0) : null;
            android.os.Bundle bundle2 = new android.os.Bundle();
            java.lang.String str3 = "";
            if (m76504xa819f0c7 == null || (str = m76504xa819f0c7.m75945x2fec8307(1)) == null) {
                str = "";
            }
            if (m76504xa819f0c7 == null || (str2 = m76504xa819f0c7.m75945x2fec8307(2)) == null) {
                str2 = "";
            }
            if (m76504xa819f0c7 != null && (m75945x2fec8307 = m76504xa819f0c7.m75945x2fec8307(10)) != null) {
                str3 = m75945x2fec8307;
            }
            bundle2.putString("appId", m75945x2fec83072);
            bundle2.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str);
            bundle2.putString("query", str2);
            bundle2.putString("minVersion", str3);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).qk(joVar.f216408f, bundle2, true, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.io(joVar));
        }
    }
}
