package bg2;

/* loaded from: classes2.dex */
public final class y5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.q6 f20672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20673e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(bg2.q6 q6Var, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20672d = q6Var;
        this.f20673e = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.y5(this.f20672d, this.f20673e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bg2.y5 y5Var = (bg2.y5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.convert.view.FinderLiveFeedToastView finderLiveFeedToastView;
        android.content.Context context;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        bg2.q6 q6Var = this.f20672d;
        in5.s0 s0Var = q6Var.f417141d.f417149i;
        if (s0Var == null || (context = s0Var.f293121e) == null) {
            finderLiveFeedToastView = null;
        } else {
            finderLiveFeedToastView = new com.tencent.mm.plugin.finder.live.convert.view.FinderLiveFeedToastView(context);
            finderLiveFeedToastView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -2));
            java.lang.String string = context.getString(com.tencent.mm.R.string.lod);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            finderLiveFeedToastView.setTitle(string);
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.loc);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            finderLiveFeedToastView.setDesc(string2);
            finderLiveFeedToastView.setDescClickListener(new bg2.v5(q6Var, finderLiveFeedToastView, context));
        }
        com.tencent.mm.plugin.finder.live.convert.view.FinderLiveFeedToastView finderLiveFeedToastView2 = finderLiveFeedToastView;
        if (finderLiveFeedToastView2 != null) {
            q6Var.getClass();
            android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(false);
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, ((java.lang.Number) ((jz5.n) q6Var.f20417i).getValue()).intValue(), 0.0f);
            translateAnimation.setDuration(300L);
            translateAnimation.setInterpolator(new android.view.animation.DecelerateInterpolator());
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            android.view.animation.AnimationSet animationSet2 = new android.view.animation.AnimationSet(false);
            android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(300L);
            animationSet2.addAnimation(alphaAnimation2);
            bg2.r4 r4Var = new bg2.r4(finderLiveFeedToastView2, animationSet, animationSet2, q6Var.f20416h, new bg2.x5(q6Var, this.f20673e));
            bg2.a5 a5Var = (bg2.a5) q6Var.N6(bg2.a5.class);
            if (a5Var != null) {
                a5Var.e7(r4Var);
            }
            q6Var.f20418m = true;
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, ml2.u1.G2, kz5.c1.l(new jz5.l("liveId", bg2.q6.Z6(q6Var)), new jz5.l("feedId", bg2.q6.Y6(q6Var)), new jz5.l("panel_sence", "1")), null, null, null, null, false, 124, null);
        }
        return jz5.f0.f302826a;
    }
}
