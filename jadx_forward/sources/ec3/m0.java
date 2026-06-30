package ec3;

/* loaded from: classes2.dex */
public final class m0 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f332589d;

    public m0(ec3.g1 g1Var) {
        this.f332589d = g1Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        ec3.g1 g1Var = this.f332589d;
        android.widget.LinearLayout Y6 = g1Var.Y6();
        if (Y6 != null) {
            Y6.setPressed(true);
        }
        android.widget.LinearLayout Y62 = g1Var.Y6();
        if (Y62 != null) {
            Y62.performClick();
        }
        android.widget.LinearLayout Y63 = g1Var.Y6();
        if (Y63 != null) {
            Y63.postDelayed(new ec3.l0(g1Var), 120L);
        }
    }
}
