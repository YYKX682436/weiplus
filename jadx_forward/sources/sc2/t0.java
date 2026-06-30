package sc2;

/* loaded from: classes2.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f487787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f487788e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487789f;

    public t0(sc2.h1 h1Var, android.view.ViewGroup viewGroup, in5.s0 s0Var) {
        this.f487787d = h1Var;
        this.f487788e = viewGroup;
        this.f487789f = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sc2.h1 h1Var = this.f487787d;
        h1Var.K(this.f487788e, 0);
        com.p314xaae8f345.mm.ui.xj xjVar = new com.p314xaae8f345.mm.ui.xj(h1Var.T);
        android.view.View view = h1Var.T;
        if (view != null) {
            view.setTouchDelegate(xjVar);
        }
        android.widget.TextView textView = h1Var.K;
        in5.s0 s0Var = this.f487789f;
        if (textView != null) {
            textView.post(new sc2.r0(s0Var, textView, xjVar, h1Var));
        }
        android.view.View view2 = h1Var.R;
        if (view2 != null) {
            view2.post(new sc2.s0(s0Var, view2, xjVar, h1Var));
        }
    }
}
