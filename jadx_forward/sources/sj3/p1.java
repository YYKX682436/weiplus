package sj3;

/* loaded from: classes5.dex */
public final class p1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.u1 f490212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f490213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f490214f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f490215g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f490216h;

    public p1(sj3.u1 u1Var, android.graphics.Bitmap bitmap, int i17, int i18, java.lang.String str) {
        this.f490212d = u1Var;
        this.f490213e = bitmap;
        this.f490214f = i17;
        this.f490215g = i18;
        this.f490216h = str;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        sj3.u1 u1Var = this.f490212d;
        android.widget.ImageView imageView = u1Var.f490291f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        android.widget.TextView textView = u1Var.f490287b;
        if (textView != null) {
            textView.setVisibility(0);
        }
        u1Var.f490306u = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.graphics.Bitmap bitmap = this.f490213e;
        sj3.u1 u1Var = this.f490212d;
        u1Var.d(bitmap, this.f490214f, this.f490215g);
        android.widget.TextView textView = u1Var.f490287b;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (textView != null) {
            textView.setTextSize(1, 10.0f);
        }
        java.lang.String str = this.f490216h;
        if (textView != null) {
            textView.setText(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true).P0());
        }
        u1Var.g(str);
        u1Var.f490301p = str;
        u1Var.f490306u = true;
    }
}
