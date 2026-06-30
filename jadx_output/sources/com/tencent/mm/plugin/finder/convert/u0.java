package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f104657e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.b1 f104658f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(in5.s0 s0Var, so2.u1 u1Var, com.tencent.mm.plugin.finder.convert.b1 b1Var) {
        super(2);
        this.f104656d = s0Var;
        this.f104657e = u1Var;
        this.f104658f = b1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator alpha2;
        android.view.ViewPropertyAnimator duration2;
        android.view.ViewPropertyAnimator listener2;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        in5.s0 s0Var = this.f104656d;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
        if (finderVideoLayout != null) {
            com.tencent.mm.plugin.finder.video.FinderVideoLayout.X(finderVideoLayout, hc2.o0.s(this.f104657e), false, false, 0, 12, null);
        }
        this.f104658f.getClass();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(com.tencent.mm.R.id.g99);
        if (booleanValue) {
            android.view.ViewPropertyAnimator animate = weImageView.animate();
            if (animate != null) {
                animate.cancel();
            }
            weImageView.setVisibility(0);
            weImageView.setAlpha(0.0f);
            android.view.ViewPropertyAnimator animate2 = weImageView.animate();
            if (animate2 != null && (alpha2 = animate2.alpha(1.0f)) != null && (duration2 = alpha2.setDuration(200L)) != null && (listener2 = duration2.setListener(null)) != null) {
                listener2.start();
            }
        } else if (weImageView.getVisibility() == 0) {
            android.view.ViewPropertyAnimator animate3 = weImageView.animate();
            if (animate3 != null) {
                animate3.cancel();
            }
            weImageView.setAlpha(1.0f);
            android.view.ViewPropertyAnimator animate4 = weImageView.animate();
            if (animate4 != null && (alpha = animate4.alpha(0.0f)) != null && (duration = alpha.setDuration(200L)) != null && (listener = duration.setListener(new com.tencent.mm.plugin.finder.convert.a1(weImageView))) != null) {
                listener.start();
            }
        } else {
            weImageView.setVisibility(4);
        }
        return jz5.f0.f302826a;
    }
}
