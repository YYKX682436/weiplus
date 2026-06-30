package d04;

/* loaded from: classes8.dex */
public final class f2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7902x5db88677(outRect, view, parent, state);
        int u07 = parent.u0(view);
        if (u07 == 0) {
            outRect.left = 0;
            outRect.right = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10.C;
            return;
        }
        if (u07 == 1) {
            outRect.left = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10.B;
            outRect.right = 0;
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = parent.mo7946xf939df19();
        if (u07 == (mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 0) - 1) {
            outRect.left = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10.C;
            outRect.right = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10.B;
        } else {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10.B;
            outRect.left = i17;
            outRect.right = i17;
        }
    }
}
