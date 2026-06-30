package nl5;

/* loaded from: classes5.dex */
public final class l0 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl5.s0 f419859d;

    public l0(nl5.s0 s0Var) {
        this.f419859d = s0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onViewDetachedFromWindow:");
        nl5.s0 s0Var = this.f419859d;
        sb6.append(s0Var.M);
        com.p314xaae8f345.mm.ui.yk.a("SelectableEditTextHelper", sb6.toString(), new java.lang.Object[0]);
        if (s0Var.M) {
            return;
        }
        s0Var.b();
    }
}
