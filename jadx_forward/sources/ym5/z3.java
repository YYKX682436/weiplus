package ym5;

/* loaded from: classes10.dex */
public final class z3 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f545123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f545124e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f545125f;

    public z3(com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00, float f17, yz5.a aVar) {
        this.f545123d = c22801x87cbdc00;
        this.f545124e = f17;
        this.f545125f = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f545123d;
        c22801x87cbdc00.C = false;
        c22801x87cbdc00.setTranslationY(this.f545124e);
        c22801x87cbdc00.Q = false;
        this.f545125f.mo152xb9724478();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f545123d.C = true;
    }
}
