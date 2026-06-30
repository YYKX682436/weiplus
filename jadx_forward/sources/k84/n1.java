package k84;

/* loaded from: classes4.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f386673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f386674e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f386675f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f386676g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f386677h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f386678i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ mb4.p f386679m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(android.content.Context context, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, k84.q1 q1Var, int i18, mb4.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f386674e = context;
        this.f386675f = i17;
        this.f386676g = f0Var;
        this.f386677h = q1Var;
        this.f386678i = i18;
        this.f386679m = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1");
        k84.n1 n1Var = new k84.n1(this.f386674e, this.f386675f, this.f386676g, this.f386677h, this.f386678i, this.f386679m, interfaceC29045xdcb5ca57);
        n1Var.f386673d = obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1");
        return n1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1");
        k84.n1 n1Var = (k84.n1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        n1Var.mo150x989b7ca4(f0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1");
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1");
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f386673d;
        android.widget.ImageView imageView = new android.widget.ImageView(this.f386674e);
        imageView.setPivotX(0.0f);
        imageView.setPivotY(0.0f);
        imageView.setRotation(15.0f);
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        int i17 = this.f386675f;
        imageView.setTranslationX((float) (i17 + k84.q1.Y.b()));
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f386676g;
        imageView.setTranslationY(f0Var.f391649d);
        k84.q1 q1Var = this.f386677h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q1Var.j(), "triggerNumAnim add view " + imageView.getTranslationX() + ' ' + imageView.getTranslationY());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17780x7da32526 K = q1Var.K();
        if (K != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBarW", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getBarW$cp", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getBarW$cp", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
            int i18 = k84.q1.Z;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBarW", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBarH", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getBarH$cp", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getBarH$cp", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
            int i19 = k84.q1.f386719a0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBarH", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
            K.addView(imageView, i18, i19);
        }
        java.util.Map y17 = k84.q1.y(q1Var);
        int i27 = this.f386678i;
        if (((java.util.LinkedHashMap) y17).get(new java.lang.Integer(i27)) != null) {
            imageView.setImageBitmap((android.graphics.Bitmap) ((java.util.LinkedHashMap) k84.q1.y(q1Var)).get(new java.lang.Integer(i27)));
        } else {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, ((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h, null, new k84.k1(this.f386679m, this.f386678i, this.f386677h, imageView, null), 2, null);
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(2000L);
        ofFloat.addUpdateListener(new k84.l1(imageView, i17, f0Var));
        ofFloat.addListener(new k84.m1(q1Var, imageView));
        k84.q1.B(q1Var, k84.q1.A(q1Var) + 1);
        ofFloat.start();
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1");
        return f0Var2;
    }
}
