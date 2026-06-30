package xt2;

/* loaded from: classes2.dex */
public final class h3 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.r3 f538310d;

    public h3(xt2.r3 r3Var) {
        this.f538310d = r3Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        xt2.r3 r3Var = this.f538310d;
        android.widget.ImageView imageView = r3Var.f538518h;
        imageView.setTranslationX(0.0f);
        imageView.setTranslationY(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        imageView.setAlpha(1.0f);
        imageView.setImageBitmap(null);
        r3Var.f538511a.setVisibility(8);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = r3Var.f538520j;
        if (c22789xd23e9a9b != null) {
            android.content.res.AssetManager assets = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets, "getAssets(...)");
            c22789xd23e9a9b.k(assets, r3Var.f538521k);
            c22789xd23e9a9b.d();
            c22789xd23e9a9b.m82583xcde73672(1);
            c22789xd23e9a9b.m82582x3ae760af(0.0d);
            c22789xd23e9a9b.g();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
