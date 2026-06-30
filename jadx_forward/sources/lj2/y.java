package lj2;

/* loaded from: classes10.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lj2.c0 f400498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f400499e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(lj2.c0 c0Var, yz5.a aVar) {
        super(0);
        this.f400498d = c0Var;
        this.f400499e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        lj2.c0 c0Var = this.f400498d;
        boolean z17 = c0Var.f400370h;
        android.view.View view = c0Var.f400363a;
        c0Var.c().f400480a.animate().translationX(z17 ? -view.getWidth() : view.getWidth()).setInterpolator(new android.view.animation.AccelerateInterpolator()).setListener(new lj2.x(this.f400499e, c0Var)).start();
        return jz5.f0.f384359a;
    }
}
