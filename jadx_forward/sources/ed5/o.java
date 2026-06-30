package ed5;

/* loaded from: classes2.dex */
public final class o extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        int u07;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams : null;
        if (layoutParams2 == null || (u07 = parent.u0(view)) == -1 || (mo7946xf939df19 = parent.mo7946xf939df19()) == null) {
            return;
        }
        int mo863xcdaf1228 = mo7946xf939df19.mo863xcdaf1228(u07);
        int dimension = (int) view.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        if (mo863xcdaf1228 == -1 || mo863xcdaf1228 == 0) {
            if (mo863xcdaf1228 == 0) {
                boolean z17 = true;
                int i17 = u07 - 1;
                while (true) {
                    if (-1 >= i17) {
                        z17 = false;
                        break;
                    } else if (mo7946xf939df19.mo863xcdaf1228(i17) == 0) {
                        break;
                    } else {
                        i17--;
                    }
                }
                if (z17) {
                    outRect.set(0, dimension, 0, 0);
                    return;
                }
            }
            outRect.set(0, 0, 0, 0);
            return;
        }
        int dimension2 = (int) view.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        int dimension3 = (int) view.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        if (layoutParams2.f93474i) {
            outRect.set(0, 0, 0, 0);
            return;
        }
        if (layoutParams2.e() % 2 == 0) {
            outRect.left = dimension2;
            outRect.right = dimension3;
            outRect.bottom = dimension3;
            outRect.top = dimension3;
            return;
        }
        outRect.left = dimension3;
        outRect.right = dimension2;
        outRect.bottom = dimension3;
        outRect.top = dimension3;
    }
}
