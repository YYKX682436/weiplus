package xt2;

/* loaded from: classes2.dex */
public final class p3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.r3 f538481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f538482e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f538483f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f538484g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(xt2.r3 r3Var, android.graphics.Bitmap bitmap, android.view.View view, boolean z17) {
        super(0);
        this.f538481d = r3Var;
        this.f538482e = bitmap;
        this.f538483f = view;
        this.f538484g = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        xt2.r3 r3Var = this.f538481d;
        r3Var.f538518h.setImageBitmap(this.f538482e);
        r3Var.f538511a.setVisibility(0);
        android.view.View cartIv = r3Var.f538519i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cartIv, "cartIv");
        int[] t17 = pm0.v.t(cartIv);
        java.lang.Integer S = kz5.z.S(t17, 0);
        if (S != null) {
            float intValue = S.intValue();
            java.lang.Integer S2 = kz5.z.S(t17, 1);
            if (S2 != null) {
                float intValue2 = S2.intValue();
                int[] t18 = pm0.v.t(this.f538483f);
                java.lang.Integer S3 = kz5.z.S(t18, 0);
                if (S3 != null) {
                    float intValue3 = S3.intValue();
                    java.lang.Integer S4 = kz5.z.S(t18, 1);
                    if (S4 != null) {
                        float intValue4 = S4.intValue();
                        float width = (intValue + (cartIv.getWidth() / 2)) - (r6.getWidth() / 2);
                        float height = (intValue2 + (cartIv.getHeight() / 2)) - (r6.getHeight() / 2);
                        android.widget.ImageView imageView = r3Var.f538518h;
                        imageView.setTranslationX(intValue3);
                        imageView.setTranslationY(intValue4);
                        android.graphics.Path path = new android.graphics.Path();
                        path.moveTo(0.0f, 0.0f);
                        path.cubicTo(0.15f, 0.0f, 0.58f, 1.0f, 1.0f, 1.0f);
                        android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(path);
                        android.graphics.Path path2 = new android.graphics.Path();
                        path2.moveTo(0.0f, 0.0f);
                        path2.cubicTo(0.2f, 0.0f, 0.2f, 1.0f, 1.0f, 1.0f);
                        android.view.animation.PathInterpolator pathInterpolator2 = new android.view.animation.PathInterpolator(path2);
                        android.graphics.Path path3 = new android.graphics.Path();
                        path3.moveTo(0.0f, 0.0f);
                        path3.cubicTo(0.42f, 0.0f, 0.58f, 1.0f, 1.0f, 1.0f);
                        android.view.animation.PathInterpolator pathInterpolator3 = new android.view.animation.PathInterpolator(path3);
                        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, "translationX", intValue3, width);
                        ofFloat.setInterpolator(pathInterpolator);
                        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(imageView, "translationY", intValue4, height);
                        ofFloat2.setInterpolator(pathInterpolator2);
                        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(imageView, "scaleX", 0.8f, 0.0f);
                        ofFloat3.setInterpolator(pathInterpolator3);
                        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(imageView, "scaleY", 0.8f, 0.0f);
                        ofFloat4.setInterpolator(pathInterpolator3);
                        android.graphics.Path path4 = new android.graphics.Path();
                        path4.moveTo(0.0f, 0.0f);
                        path4.cubicTo(0.0f, 0.0f, 0.58f, 1.0f, 1.0f, 1.0f);
                        android.view.animation.PathInterpolator pathInterpolator4 = new android.view.animation.PathInterpolator(path4);
                        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 0.8f);
                        ofFloat5.setInterpolator(pathInterpolator4);
                        android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(imageView, "scaleY", 1.0f, 0.8f);
                        ofFloat6.setInterpolator(pathInterpolator4);
                        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                        animatorSet.playTogether(ofFloat5, ofFloat6);
                        animatorSet.setDuration(200L);
                        animatorSet.addListener(new xt2.j3(r3Var));
                        animatorSet.addListener(new xt2.i3(r3Var));
                        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
                        animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                        android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
                        animatorSet3.playSequentially(animatorSet, animatorSet2);
                        animatorSet3.setDuration(400L);
                        animatorSet3.addListener(new xt2.h3(r3Var));
                        animatorSet3.start();
                        if (this.f538484g) {
                            if (r3Var.f538517g.length() > 0) {
                                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = r3Var.f538522l;
                                java.lang.Object parent = c22789xd23e9a9b != null ? c22789xd23e9a9b.getParent() : null;
                                android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
                                if (c22789xd23e9a9b == null || view == null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FinderLiveShoppingCartAnimWidget", "playPromotePag skip, pag or pagParent is null");
                                } else {
                                    java.lang.String str = r3Var.f538517g;
                                    p3325xe03a0797.p3326xc267989b.r2 r2Var = r3Var.f538516f;
                                    if (r2Var != null) {
                                        p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                                    }
                                    java.lang.Runnable runnable = r3Var.f538514d;
                                    if (runnable != null) {
                                        r3Var.f538513c.mo50300x3fa464aa(runnable);
                                    }
                                    r3Var.f538516f = p3325xe03a0797.p3326xc267989b.l.d(r3Var.f538515e, null, null, new xt2.n3(str, r3Var, view, c22789xd23e9a9b, null), 3, null);
                                }
                            }
                        }
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
