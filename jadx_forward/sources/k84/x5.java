package k84;

/* loaded from: classes4.dex */
public final class x5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f386865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f386866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c84.d f386867f;

    public x5(long j17, k84.c6 c6Var, c84.d dVar) {
        this.f386865d = j17;
        this.f386866e = c6Var;
        this.f386867f = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        float f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adsocial/AdSocialPatComponent$startFullScreenPag$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long abs = java.lang.Math.abs(java.lang.System.currentTimeMillis() - this.f386865d);
        k84.c6 c6Var = this.f386866e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c6Var.j(), "pagView click!, timeInterval is " + abs);
        float f18 = (float) abs;
        mb4.a z17 = k84.c6.z(c6Var);
        if (z17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFullScreenCanCloseDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.AdPatInfo");
            f17 = z17.f406894f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFullScreenCanCloseDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.AdPatInfo");
        } else {
            f17 = 0.0f;
        }
        if (f18 > f17) {
            java.lang.String str = c6Var.j() + "dialog_dismiss";
            try {
                this.f386867f.dismiss();
            } catch (java.lang.Throwable th6) {
                ca4.q.c(str, th6);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdSocialPatComponent$startFullScreenPag$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$2");
    }
}
