package ed5;

/* loaded from: classes3.dex */
public final class a extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f332866d;

    /* renamed from: e, reason: collision with root package name */
    public final int f332867e;

    /* renamed from: f, reason: collision with root package name */
    public final int f332868f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Paint f332869g;

    public a(int i17, int i18, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i19 = (i27 & 4) != 0 ? 0 : i19;
        this.f332866d = i17;
        this.f332867e = i18;
        this.f332868f = i19;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        int u07;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        int mo863xcdaf1228;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        outRect.set(0, 0, 0, 0);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams) layoutParams : null;
        if (layoutParams2 == null || (u07 = parent.u0(view)) == -1 || (mo7946xf939df19 = parent.mo7946xf939df19()) == null || (mo863xcdaf1228 = mo7946xf939df19.mo863xcdaf1228(u07)) == this.f332868f || mo863xcdaf1228 == -2 || layoutParams2.f93399i != 1) {
            return;
        }
        int i17 = layoutParams2.f93398h;
        int i18 = this.f332866d;
        int f17 = e06.p.f(i17, 0, i18 - 1);
        int i19 = this.f332867e;
        outRect.left = (i19 * f17) / i18;
        outRect.right = i19 - (((f17 + 1) * i19) / i18);
        outRect.bottom = i19;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        android.graphics.Paint paint = this.f332869g;
        if (paint == null) {
            paint = new android.graphics.Paint();
            paint.setColor(i65.a.d(parent.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
            paint.setStyle(android.graphics.Paint.Style.FILL);
            this.f332869g = paint;
        }
        float width = parent.getWidth();
        int childCount = parent.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = parent.getChildAt(i17);
            if (childAt != null) {
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    c17.drawRect(0.0f, childAt.getTop() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin, width, childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + (layoutParams2.f93399i == 1 ? this.f332867e : 0), paint);
                }
            }
        }
    }
}
