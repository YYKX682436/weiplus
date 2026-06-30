package lp2;

/* loaded from: classes2.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public long f401810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1578x2ff5b9.C14515x36e97cca f401811e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1578x2ff5b9.C14515x36e97cca c14515x36e97cca) {
        this.f401811e = c14515x36e97cca;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        oa.i k17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageFragment$onCreateView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z17 = currentTimeMillis - this.f401810d < ((long) 500);
        this.f401810d = currentTimeMillis;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareFragment", "fast click, too fast guys.");
            yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageFragment$onCreateView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1578x2ff5b9.C14515x36e97cca c14515x36e97cca = this.f401811e;
        c14515x36e97cca.A0();
        if (c14515x36e97cca.mo7430x19263085() != null) {
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(c14515x36e97cca).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
            cl0.g gVar = new cl0.g();
            android.view.View view2 = c14515x36e97cca.f287834h;
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = view2 != null ? (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) view2.findViewById(com.p314xaae8f345.mm.R.id.nv8) : null;
            java.lang.Object obj = (c2718xca2902ff == null || (k17 = c2718xca2902ff.k(c2718xca2902ff != null ? c2718xca2902ff.m20352xe06bcb0d() : 0)) == null) ? null : k17.f425311a;
            qp2.i iVar = obj instanceof qp2.i ? (qp2.i) obj : null;
            gVar.s("tab_id", java.lang.Integer.valueOf(iVar != null ? iVar.f447319c : 0));
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6463x6ead4318 c6463x6ead4318 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6463x6ead4318();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            c6463x6ead4318.f138055d = java.lang.System.currentTimeMillis();
            c6463x6ead4318.u("");
            c6463x6ead4318.p("");
            c6463x6ead4318.B("");
            c6463x6ead4318.y("");
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            if (Ri == null) {
                Ri = "";
            }
            c6463x6ead4318.w(Ri);
            java.lang.String m75945x2fec8307 = V6.m75945x2fec8307(1);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            c6463x6ead4318.r(m75945x2fec8307);
            c6463x6ead4318.q("94");
            c6463x6ead4318.A("");
            c6463x6ead4318.x("");
            c6463x6ead4318.v("");
            c6463x6ead4318.s("more_page_star_live");
            c6463x6ead4318.t(gVar.toString());
            c6463x6ead4318.z(((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
            c6463x6ead4318.k();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageFragment$onCreateView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
