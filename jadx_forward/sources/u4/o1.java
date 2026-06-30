package u4;

/* loaded from: classes3.dex */
public class o1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f506055d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f506056e;

    /* renamed from: f, reason: collision with root package name */
    public final int f506057f;

    /* renamed from: g, reason: collision with root package name */
    public final int f506058g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f506059h;

    /* renamed from: i, reason: collision with root package name */
    public float f506060i;

    /* renamed from: m, reason: collision with root package name */
    public float f506061m;

    /* renamed from: n, reason: collision with root package name */
    public final float f506062n;

    /* renamed from: o, reason: collision with root package name */
    public final float f506063o;

    public o1(android.view.View view, android.view.View view2, int i17, int i18, float f17, float f18) {
        this.f506056e = view;
        this.f506055d = view2;
        this.f506057f = i17 - java.lang.Math.round(view.getTranslationX());
        this.f506058g = i18 - java.lang.Math.round(view.getTranslationY());
        this.f506062n = f17;
        this.f506063o = f18;
        int[] iArr = (int[]) view2.getTag(com.p314xaae8f345.mm.R.id.oj7);
        this.f506059h = iArr;
        if (iArr != null) {
            view2.setTag(com.p314xaae8f345.mm.R.id.oj7, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        if (this.f506059h == null) {
            this.f506059h = new int[2];
        }
        int[] iArr = this.f506059h;
        float f17 = this.f506057f;
        android.view.View view = this.f506056e;
        iArr[0] = java.lang.Math.round(f17 + view.getTranslationX());
        this.f506059h[1] = java.lang.Math.round(this.f506058g + view.getTranslationY());
        this.f506055d.setTag(com.p314xaae8f345.mm.R.id.oj7, this.f506059h);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        float f17 = this.f506062n;
        android.view.View view = this.f506056e;
        view.setTranslationX(f17);
        view.setTranslationY(this.f506063o);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(android.animation.Animator animator) {
        android.view.View view = this.f506056e;
        this.f506060i = view.getTranslationX();
        this.f506061m = view.getTranslationY();
        view.setTranslationX(this.f506062n);
        view.setTranslationY(this.f506063o);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationResume(android.animation.Animator animator) {
        float f17 = this.f506060i;
        android.view.View view = this.f506056e;
        view.setTranslationX(f17);
        view.setTranslationY(this.f506061m);
    }
}
