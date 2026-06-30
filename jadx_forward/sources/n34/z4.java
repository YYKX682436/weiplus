package n34;

/* loaded from: classes4.dex */
public final class z4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f416333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f416334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n34.d5 f416335f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f416336g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f416337h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, android.content.Context context, n34.d5 d5Var, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f416333d = u3Var;
        this.f416334e = context;
        this.f416335f = d5Var;
        this.f416336g = view;
        this.f416337h = c17933xe8d1b226;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1$1");
        n34.z4 z4Var = new n34.z4(this.f416333d, this.f416334e, this.f416335f, this.f416336g, this.f416337h, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1$1");
        return z4Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1$1");
        n34.z4 z4Var = (n34.z4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        z4Var.mo150x989b7ca4(f0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1$1");
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1$1");
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f416333d.dismiss();
        android.content.Context context = this.f416334e;
        db5.t7.e(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jey), com.p314xaae8f345.mm.R.raw.f81100xc230f9d4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$doScaleGoneAni", "com.tencent.mm.plugin.sns.TimelineStarHelper");
        this.f416335f.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScaleGoneAni", "com.tencent.mm.plugin.sns.TimelineStarHelper");
        android.view.View view = this.f416336g;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new android.view.animation.LinearInterpolator());
        animatorSet.addListener(new n34.c5(view));
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScaleGoneAni", "com.tencent.mm.plugin.sns.TimelineStarHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$doScaleGoneAni", "com.tencent.mm.plugin.sns.TimelineStarHelper");
        ta4.g1 g1Var = ta4.g1.f498280a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEntranceType", "com.tencent.mm.plugin.sns.report.SnsStarActionReporter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarActionReporter", "setEntranceType >> 3");
        ta4.g1.f498281b = 3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEntranceType", "com.tencent.mm.plugin.sns.report.SnsStarActionReporter");
        g1Var.a(2, 4, this.f416337h);
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1$1");
        return f0Var;
    }
}
