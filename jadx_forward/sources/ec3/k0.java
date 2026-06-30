package ec3;

/* loaded from: classes2.dex */
public final class k0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f332577d;

    public k0(ec3.g1 g1Var) {
        this.f332577d = g1Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int u07 = parent.u0(view);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = parent.mo7946xf939df19();
        int mo1894x7e414b06 = mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 0;
        if (u07 == -1) {
            return;
        }
        int i17 = mo1894x7e414b06 - 1;
        ec3.g1 g1Var = this.f332577d;
        if (u07 == i17) {
            outRect.right = i65.a.b(g1Var.m80379x76847179(), 0);
        } else {
            outRect.right = i65.a.b(g1Var.m80379x76847179(), 6);
        }
    }
}
