package id2;

/* loaded from: classes3.dex */
public final class e0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f372078d;

    public e0(id2.v1 v1Var) {
        this.f372078d = v1Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int u07 = parent.u0(view);
        int i17 = u07 % 4;
        id2.v1 v1Var = this.f372078d;
        if (i17 == 0) {
            outRect.left = ((java.lang.Number) ((jz5.n) v1Var.f372385y).mo141623x754a37bb()).intValue();
            outRect.right = id2.v1.O6(v1Var);
        } else if (i17 != 3) {
            outRect.left = id2.v1.O6(v1Var);
            outRect.right = id2.v1.O6(v1Var);
        } else {
            outRect.left = id2.v1.O6(v1Var);
            outRect.right = ((java.lang.Number) ((jz5.n) v1Var.f372385y).mo141623x754a37bb()).intValue();
        }
        if (u07 >= 4) {
            outRect.top = ((java.lang.Number) ((jz5.n) v1Var.A).mo141623x754a37bb()).intValue();
        }
    }
}
