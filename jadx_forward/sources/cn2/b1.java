package cn2;

/* loaded from: classes3.dex */
public final class b1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cn2.e1 f125010d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(cn2.e1 e1Var) {
        super(0);
        this.f125010d = e1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        cn2.e1 e1Var = this.f125010d;
        e1Var.getClass();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, e1Var.f125033c);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.addUpdateListener(new cn2.z0(e1Var));
        ofFloat.addListener(new cn2.a1(e1Var));
        return ofFloat;
    }
}
