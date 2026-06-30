package g84;

/* loaded from: classes4.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2132x9b5650a.C17774xdafbc47 f351083d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2132x9b5650a.C17774xdafbc47 c17774xdafbc47) {
        this.f351083d = c17774xdafbc47;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView$resetUI$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adconsultbar/SnsAdConsultBarView$resetUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mTitle click, current index is ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2132x9b5650a.C17774xdafbc47 c17774xdafbc47 = this.f351083d;
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2132x9b5650a.C17774xdafbc47.c(c17774xdafbc47));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdConsultBarView", sb6.toString());
        s34.g gVar = (s34.g) ((java.util.ArrayList) com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2132x9b5650a.C17774xdafbc47.b(c17774xdafbc47)).get(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2132x9b5650a.C17774xdafbc47.c(c17774xdafbc47));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 b17 = gVar.b();
        if (b17 != null) {
            b17.f244102a = 25;
        }
        w64.n a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2132x9b5650a.C17774xdafbc47.a(c17774xdafbc47);
        if (a17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 b18 = gVar.b();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMSnsInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = c17774xdafbc47.f244817r;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMSnsInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
            a17.p(new w64.c(b18, c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2132x9b5650a.C17774xdafbc47.c(c17774xdafbc47), null, false, 0, false, null, 248, null));
        }
        w64.n a18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2132x9b5650a.C17774xdafbc47.a(c17774xdafbc47);
        if (a18 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMTitleContainer$p", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2132x9b5650a.C17773xe88a2faf c17773xe88a2faf = c17774xdafbc47.f244810h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMTitleContainer$p", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
            a18.k(c17773xe88a2faf);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adconsultbar/SnsAdConsultBarView$resetUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView$resetUI$2");
    }
}
