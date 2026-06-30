package fy0;

/* loaded from: classes5.dex */
public final class o extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final e3.d f348752d;

    public o(e3.d insets) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(insets, "insets");
        this.f348752d = insets;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (parent.mo7946xf939df19() == null) {
            return;
        }
        e3.d dVar = this.f348752d;
        outRect.top = dVar.f328578b;
        outRect.bottom = dVar.f328580d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int b17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams).b();
        if (b17 == 0) {
            outRect.left = dVar.f328577a;
        }
        if (b17 == r4.mo1894x7e414b06() - 1) {
            outRect.right = dVar.f328579c;
        }
    }
}
