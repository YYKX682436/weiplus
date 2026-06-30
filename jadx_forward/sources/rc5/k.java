package rc5;

/* loaded from: classes5.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc5.m f475699d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(rc5.m mVar) {
        super(1);
        this.f475699d = mVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.animation.ValueAnimator anim = (android.animation.ValueAnimator) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anim, "anim");
        android.view.Window window = this.f475699d.f475703f.m158354x19263085().getWindow();
        java.lang.Object animatedValue = anim.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        window.setStatusBarColor(((java.lang.Integer) animatedValue).intValue());
        return jz5.f0.f384359a;
    }
}
