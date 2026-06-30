package lr;

/* loaded from: classes10.dex */
public final class a0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final lr.o0 f402024d;

    public a0(lr.o0 sizeResolver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sizeResolver, "sizeResolver");
        this.f402024d = sizeResolver;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        int u07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = parent.mo7946xf939df19();
        if (mo7946xf939df19 == null || (u07 = parent.u0(view)) == -1) {
            return;
        }
        int mo863xcdaf1228 = mo7946xf939df19.mo863xcdaf1228(u07);
        int i17 = this.f402024d.f402097e;
        if (mo863xcdaf1228 == 2) {
            outRect.set(i17, 0, i17, 0);
        }
    }
}
