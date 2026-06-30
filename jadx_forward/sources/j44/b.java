package j44;

/* loaded from: classes4.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j44.j f379208d;

    public b(j44.j jVar) {
        this.f379208d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper$initContentView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/halfscreen/service/HalfScreenDownloadHelper$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        j44.j jVar = this.f379208d;
        jVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMCurrentDownloadStatus", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        int i17 = jVar.f379239x;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMCurrentDownloadStatus", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        if (i17 == 0) {
            ca4.d e17 = jVar.e();
            java.util.ArrayList arrayList2 = l44.z.f397961a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportHalfScreenBtnClick", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            try {
                ca4.f fVar = new ca4.f();
                fVar.m(4001070);
                fVar.o(e17.f121384a);
                fVar.f(e17.f121385b);
                fVar.l(e17.f121386c);
                fVar.c(e17.f121387d);
                fVar.p(e17.f121389f);
                fVar.n(e17.f121390g);
                fVar.q(e17.f121391h);
                fVar.k(5);
                a84.t0.a(fVar.a());
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportHalfScreenBtnClick, exp is " + th6.toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportHalfScreenBtnClick", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        }
        j44.a j17 = jVar.j();
        if (j17 != null) {
            j44.a.a(j17, false, 1, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/halfscreen/service/HalfScreenDownloadHelper$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper$initContentView$1");
    }
}
