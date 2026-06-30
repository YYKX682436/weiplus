package s53;

/* loaded from: classes11.dex */
public final class f extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f484713d;

    public f(int i17) {
        this.f484713d = i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7902x5db88677(outRect, view, parent, state);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = parent.mo7946xf939df19();
        if (mo7946xf939df19 instanceof vl1.g) {
            int u07 = parent.u0(view);
            vl1.g gVar = (vl1.g) mo7946xf939df19;
            if (((java.util.LinkedList) gVar.f519330g).size() > 0) {
                if (u07 == 0) {
                    return;
                }
                if (gVar.x() > 0 && u07 > gVar.mo1894x7e414b06()) {
                    return;
                }
            }
            if (gVar.x() > 0 && u07 >= gVar.f519327d.mo1894x7e414b06()) {
                return;
            }
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        boolean z17 = layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams;
        int i17 = this.f484713d;
        if (z17) {
            outRect.left = i17;
            if (((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams).e() == 0) {
                outRect.right = 0;
            } else {
                outRect.right = i17;
            }
        }
        outRect.bottom = i17;
    }
}
