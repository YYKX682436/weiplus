package qp2;

/* loaded from: classes2.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qp2.y f447326d;

    public n(qp2.y yVar) {
        this.f447326d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        oa.i k17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/live/square/tab/NearbyLiveSquareTabLayoutUIC$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qp2.y yVar = this.f447326d;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = yVar.m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc6);
        pf5.z zVar = pf5.z.f435481a;
        java.lang.String str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.b(m158358x197d1fc6).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216915p;
        if (str2 == null) {
            str2 = "";
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_context_id", str2);
        intent.putExtra("key_click_tab_context_id", ip2.a.f375147c);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 P6 = yVar.P6();
        if (P6 == null || (str = P6.s0()) == null) {
            str = "";
        }
        intent.putExtra("key_click_sub_tab_context_id", str);
        new jp2.a(yVar.m158354x19263085()).a(intent);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc62 = yVar.m158358x197d1fc6();
        if (m158358x197d1fc62 != null) {
            cl0.g gVar = new cl0.g();
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff R6 = yVar.R6();
            int m20352xe06bcb0d = R6 != null ? R6.m20352xe06bcb0d() : 0;
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff R62 = yVar.R6();
            java.lang.Object obj = (R62 == null || (k17 = R62.k(m20352xe06bcb0d)) == null) ? null : k17.f425311a;
            qp2.i iVar = obj instanceof qp2.i ? (qp2.i) obj : null;
            gVar.s("tab_id", java.lang.Integer.valueOf(iVar != null ? iVar.f447319c : 0));
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.b(m158358x197d1fc62).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6463x6ead4318 c6463x6ead4318 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6463x6ead4318();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
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
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            java.lang.String str3 = a52.a.f83117l;
            if (str3 == null) {
                str3 = "";
            }
            c6463x6ead4318.q(str3);
            c6463x6ead4318.A("");
            c6463x6ead4318.x("");
            c6463x6ead4318.v("");
            c6463x6ead4318.s("more_page_search");
            c6463x6ead4318.t(gVar.toString());
            c6463x6ead4318.z(((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
            c6463x6ead4318.k();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/live/square/tab/NearbyLiveSquareTabLayoutUIC$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
