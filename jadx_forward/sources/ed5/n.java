package ed5;

/* loaded from: classes2.dex */
public final class n extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f332908d;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        android.graphics.Paint paint = this.f332908d;
        if (paint == null) {
            paint = new android.graphics.Paint();
            paint.setColor(i65.a.d(parent.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
            paint.setStyle(android.graphics.Paint.Style.FILL);
            this.f332908d = paint;
        }
        float width = parent.getWidth();
        int childCount = parent.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = parent.getChildAt(i17);
            if (childAt != null) {
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams : null) != null) {
                    c17.drawRect(0.0f, childAt.getTop() - ((android.view.ViewGroup.MarginLayoutParams) r2).topMargin, width, childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) r2).bottomMargin, paint);
                }
            }
        }
    }
}
