package pk2;

/* loaded from: classes3.dex */
public final class n7 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.p7 f437573d;

    public n7(pk2.p7 p7Var) {
        this.f437573d = p7Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7902x5db88677(outRect, view, parent, state);
        int u07 = parent.u0(view);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = parent.mo7946xf939df19();
        int mo1894x7e414b06 = mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 0;
        int i17 = u07 / 5;
        int i18 = u07 % 5;
        pk2.p7 p7Var = this.f437573d;
        int dimension = (int) p7Var.f437693a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        if (i17 < (((mo1894x7e414b06 + 5) - 1) / 5) - 1) {
            outRect.bottom = dimension;
        }
        int dimension2 = (int) p7Var.f437693a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        if (i18 == 0) {
            outRect.left = 0;
            outRect.right = dimension2 / 2;
        } else if (i18 == 4) {
            outRect.left = dimension2 / 2;
            outRect.right = 0;
        } else {
            int i19 = dimension2 / 2;
            outRect.left = i19;
            outRect.right = i19;
        }
    }
}
