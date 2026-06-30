package rc5;

/* loaded from: classes3.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc5.m f475700d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(rc5.m mVar) {
        super(1);
        this.f475700d = mVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.animation.ValueAnimator anim = (android.animation.ValueAnimator) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anim, "anim");
        rc5.m mVar = this.f475700d;
        android.view.ViewGroup.LayoutParams layoutParams = mVar.getLayoutParams();
        java.lang.Object animatedValue = anim.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.height = ((java.lang.Integer) animatedValue).intValue();
        mVar.setLayoutParams(mVar.getLayoutParams());
        return jz5.f0.f384359a;
    }
}
