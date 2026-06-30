package m31;

/* loaded from: classes3.dex */
public final class f1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f404676d;

    public f1(m31.p1 p1Var) {
        i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 40);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f404676d = paint;
        paint.setColor(p1Var.f404713d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560424k0));
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setFlags(1);
        paint.setStrokeWidth(2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (parent.u0(view) == 0) {
            outRect.set(0, 2, 0, 2);
        } else {
            outRect.set(0, 0, 0, 2);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo8166xc398a7c3(c17, parent, state);
        float paddingLeft = parent.getPaddingLeft();
        float width = parent.getWidth() - parent.getPaddingRight();
        int childCount = parent.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.ViewGroup.LayoutParams layoutParams = parent.getChildAt(i17).getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams;
            float f17 = 2;
            float bottom = r0.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + f17;
            android.graphics.Paint paint = this.f404676d;
            if (i17 == 0) {
                float top = (r0.getTop() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin) - f17;
                c17.drawLine(paddingLeft, top, width, top, paint);
            }
            c17.drawLine(paddingLeft, bottom, width, bottom, paint);
        }
    }
}
