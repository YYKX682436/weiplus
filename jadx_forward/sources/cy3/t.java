package cy3;

/* loaded from: classes2.dex */
public final class t extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f306380d;

    /* renamed from: e, reason: collision with root package name */
    public final int f306381e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.drawable.ColorDrawable f306382f;

    public t(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f306380d = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        int dimension = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561175bh);
        this.f306381e = dimension;
        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        this.f306382f = colorDrawable;
        colorDrawable.setBounds(0, 0, 0, dimension);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        outRect.left = 0;
        outRect.right = 0;
        outRect.top = 0;
        outRect.bottom = this.f306381e;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int childCount = parent.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = parent.getChildAt(i17);
            android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams;
            int left = childAt.getLeft() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
            int bottom = childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
            int i18 = this.f306380d + left;
            android.graphics.drawable.ColorDrawable colorDrawable = this.f306382f;
            colorDrawable.setBounds(left, bottom, i18, colorDrawable.getBounds().height() + bottom);
            colorDrawable.draw(c17);
        }
    }
}
