package cn2;

/* loaded from: classes3.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cn2.y0 f125157d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(cn2.y0 y0Var) {
        super(0);
        this.f125157d = y0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        cn2.y0 y0Var = this.f125157d;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(y0Var.f125174a, "translationX", -500.0f, 0.0f);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofFloat.addListener(new cn2.u0(y0Var));
        return ofFloat;
    }
}
