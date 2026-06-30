package j54;

/* loaded from: classes8.dex */
public final class a implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f379346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f379347e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.p2107x3fc6a675.C17739x2ed29231 f379348f;

    public a(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.p2107x3fc6a675.C17739x2ed29231 c17739x2ed29231) {
        this.f379346d = f0Var;
        this.f379347e = imageView;
        this.f379348f = c17739x2ed29231;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayoutChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView$setImageBitmap$3");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("the new width ");
        int i39 = i19 - i17;
        sb6.append(i39);
        sb6.append(", old width ");
        sb6.append(i37 - i28);
        sb6.append(", imageWidth is ");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f379346d;
        sb6.append(f0Var.f391649d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.PanoramaView", sb6.toString());
        if (i39 == f0Var.f391649d) {
            this.f379347e.removeOnLayoutChangeListener(this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.p2107x3fc6a675.C17739x2ed29231.a(this.f379348f, f0Var.f391649d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayoutChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView$setImageBitmap$3");
    }
}
