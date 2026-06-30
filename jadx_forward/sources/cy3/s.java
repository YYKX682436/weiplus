package cy3;

/* loaded from: classes2.dex */
public final class s extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f306376d;

    /* renamed from: e, reason: collision with root package name */
    public final int f306377e;

    /* renamed from: f, reason: collision with root package name */
    public final int f306378f;

    /* renamed from: g, reason: collision with root package name */
    public final int f306379g;

    public s(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f306376d = paint;
        this.f306377e = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561175bh);
        this.f306378f = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561196c1);
        this.f306379g = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        paint.setAntiAlias(true);
        paint.setColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7902x5db88677(outRect, view, parent, state);
        outRect.bottom = this.f306377e;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDrawOver */
    public void mo7903x73cebf37(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7903x73cebf37(c17, parent, state);
        int childCount = parent.getChildCount() - 1;
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = parent.getChildAt(i17);
            android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int bottom = childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams)).bottomMargin;
            c17.drawRect(childAt.getLeft() + this.f306378f, bottom, (childAt.getLeft() + childAt.getWidth()) - this.f306379g, this.f306377e + bottom, this.f306376d);
        }
    }
}
