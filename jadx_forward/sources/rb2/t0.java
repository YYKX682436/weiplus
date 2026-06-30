package rb2;

/* loaded from: classes10.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb2.y0 f475294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475295e;

    public t0(rb2.y0 y0Var, in5.s0 s0Var) {
        this.f475294d = y0Var;
        this.f475295e = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View itemView = this.f475295e.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        rb2.y0.n(this.f475294d, itemView);
    }
}
