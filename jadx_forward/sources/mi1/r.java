package mi1;

/* loaded from: classes7.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi1.v f408202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(mi1.v vVar) {
        super(0);
        this.f408202d = vVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mi1.u0 u0Var = this.f408202d.f408243i;
        if (u0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blinkWrapper");
            throw null;
        }
        android.animation.Animator animator = u0Var.f408230f;
        if (animator != null) {
            animator.pause();
        }
        return jz5.f0.f384359a;
    }
}
