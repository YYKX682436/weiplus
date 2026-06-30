package fn2;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f345761a;

    /* renamed from: b, reason: collision with root package name */
    public final int f345762b;

    /* renamed from: c, reason: collision with root package name */
    public android.animation.AnimatorSet f345763c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f345764d;

    public c(android.view.View view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f345761a = view;
        this.f345762b = i17;
    }

    public final void a() {
        this.f345764d = true;
        android.animation.AnimatorSet animatorSet = this.f345763c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f345763c = null;
        this.f345761a.setBackgroundColor(this.f345762b);
    }
}
