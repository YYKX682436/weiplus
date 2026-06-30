package n34;

/* loaded from: classes4.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f416168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f416169e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n34.p f416170f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f416171g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f416172h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, int i17, n34.p pVar, int i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f416168d = u3Var;
        this.f416169e = i17;
        this.f416170f = pVar;
        this.f416171g = i18;
        this.f416172h = c17933xe8d1b226;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1$1");
        n34.j jVar = new n34.j(this.f416168d, this.f416169e, this.f416170f, this.f416171g, this.f416172h, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1$1");
        return jVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1$1");
        n34.j jVar = (n34.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        jVar.mo150x989b7ca4(f0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1$1");
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1$1");
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f416168d.dismiss();
        if (this.f416169e == 1) {
            n34.p pVar = this.f416170f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setStarFeed$p", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            pVar.f416239g = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setStarFeed$p", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            db5.t7.e(this.f416170f.c(), this.f416170f.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jf7), com.p314xaae8f345.mm.R.raw.f81099xac84f24);
            ta4.g1.f498280a.a(1, this.f416171g, this.f416172h);
            n34.p pVar2 = this.f416170f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$doScaleVisibleAni", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            pVar2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScaleVisibleAni", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            android.view.View d17 = pVar2.d();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(d17, arrayList.toArray(), "com/tencent/mm/plugin/sns/CommentDetailStarHelper", "doScaleVisibleAni", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(d17, "com/tencent/mm/plugin/sns/CommentDetailStarHelper", "doScaleVisibleAni", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(pVar2.d(), "scaleX", 0.0f, 1.0f);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(pVar2.d(), "scaleY", 0.0f, 1.0f);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.setDuration(200L);
            animatorSet.setInterpolator(new android.view.animation.LinearInterpolator());
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.start();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScaleVisibleAni", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$doScaleVisibleAni", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            n34.p pVar3 = this.f416170f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getClickCallback$p", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            n34.o2 o2Var = pVar3.f416237e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getClickCallback$p", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            if (o2Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18026xb7ebaeb8) o2Var).a();
            }
        } else {
            n34.p pVar4 = this.f416170f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setStarFeed$p", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            pVar4.f416239g = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setStarFeed$p", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            db5.t7.e(this.f416170f.c(), this.f416170f.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jey), com.p314xaae8f345.mm.R.raw.f81100xc230f9d4);
            ta4.g1.f498280a.a(2, this.f416171g, this.f416172h);
            n34.p pVar5 = this.f416170f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$doScaleGoneAni", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            pVar5.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScaleGoneAni", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(pVar5.d(), "scaleX", 1.0f, 0.0f);
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(pVar5.d(), "scaleY", 1.0f, 0.0f);
            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
            animatorSet2.setDuration(200L);
            animatorSet2.setInterpolator(new android.view.animation.LinearInterpolator());
            animatorSet2.addListener(new n34.m(pVar5));
            animatorSet2.play(ofFloat3).with(ofFloat4);
            animatorSet2.start();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScaleGoneAni", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$doScaleGoneAni", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        }
        if (this.f416171g == 1) {
            synchronized (jm0.k.f381803i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
            }
            ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).i7(this.f416172h.f68891x29d1292e, o75.b.f425116d);
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1$1");
        return f0Var;
    }
}
