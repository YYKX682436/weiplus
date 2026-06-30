package kp4;

/* loaded from: classes2.dex */
public final class i extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int b17 = i65.a.b(parent.getContext(), 8);
        int u07 = parent.u0(view);
        boolean z17 = true;
        if (u07 != 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = parent.mo7946xf939df19();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7946xf939df19);
            if (u07 != mo7946xf939df19.mo1894x7e414b06() - 1) {
                z17 = false;
            }
        }
        if (z17) {
            return;
        }
        int i17 = -b17;
        outRect.left = i17;
        outRect.right = i17;
    }
}
