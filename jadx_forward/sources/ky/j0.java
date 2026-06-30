package ky;

/* loaded from: classes14.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f394905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f394906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ky.h0 f394907f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f394908g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(android.view.Window window, android.view.View view, ky.h0 h0Var, boolean z17) {
        super(1);
        this.f394905d = window;
        this.f394906e = view;
        this.f394907f = h0Var;
        this.f394908g = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(DisposableEffect, "$this$DisposableEffect");
        android.view.Window window = this.f394905d;
        n3.m3 m3Var = new n3.m3(window, this.f394906e);
        int ordinal = this.f394907f.ordinal();
        if (ordinal == 0) {
            m3Var.c(!this.f394908g);
        } else if (ordinal == 1) {
            m3Var.c(true);
        } else if (ordinal == 2) {
            m3Var.c(false);
        }
        window.setStatusBarColor(0);
        return new ky.i0();
    }
}
