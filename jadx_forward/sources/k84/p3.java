package k84;

/* loaded from: classes3.dex */
public final class p3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f386712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f386713e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mb4.r f386714f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c84.d f386715g;

    public p3(k84.d4 d4Var, long j17, mb4.r rVar, c84.d dVar) {
        this.f386712d = d4Var;
        this.f386713e = j17;
        this.f386714f = rVar;
        this.f386715g = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startFullScreenPag$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adsocial/AdFireworkCheerComponent$startFullScreenPag$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f386712d.j(), "pagView click!");
        float abs = (float) java.lang.Math.abs(java.lang.System.currentTimeMillis() - this.f386713e);
        mb4.r rVar = this.f386714f;
        rVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFullScreenCanCloseDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        float f17 = rVar.f407001o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFullScreenCanCloseDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        if (abs > f17) {
            this.f386715g.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdFireworkCheerComponent$startFullScreenPag$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startFullScreenPag$2");
    }
}
