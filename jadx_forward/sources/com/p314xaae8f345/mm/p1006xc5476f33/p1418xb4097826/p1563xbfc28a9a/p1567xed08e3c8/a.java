package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8;

/* loaded from: classes2.dex */
public final class a extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f202698d;

    /* renamed from: e, reason: collision with root package name */
    public final int f202699e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f202700f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f202701g;

    /* renamed from: h, reason: collision with root package name */
    public final int f202702h;

    /* renamed from: i, reason: collision with root package name */
    public final int f202703i;

    public a(android.content.Context context, int i17, int i18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f202698d = i17;
        this.f202699e = i18;
        this.f202700f = z17;
        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835));
        this.f202701g = colorDrawable;
        this.f202702h = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561175bh);
        this.f202703i = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561191bv);
        colorDrawable.setBounds(0, 0, 0, ym5.x.a(context, 1.0f));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        android.view.ViewGroup.LayoutParams layoutParams;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = parent.w0(view);
        java.lang.Integer valueOf = w07 != null ? java.lang.Integer.valueOf(w07.m8185xcdaf1228()) : null;
        if (valueOf != null && valueOf.intValue() == this.f202698d && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.width = -1;
        }
        int i17 = this.f202699e;
        outRect.left = i17;
        outRect.right = i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo8166xc398a7c3(c17, parent, state);
        int childCount = parent.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = parent.getChildAt(i17);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = parent.w0(childAt);
            java.lang.Integer valueOf = w07 != null ? java.lang.Integer.valueOf(w07.m8185xcdaf1228()) : null;
            android.graphics.drawable.Drawable drawable = this.f202701g;
            int i18 = this.f202702h;
            if (i17 != 0 && (valueOf == null || valueOf.intValue() != this.f202698d)) {
                drawable.setBounds(childAt.getLeft() + this.f202703i, childAt.getTop(), childAt.getRight(), childAt.getTop() + i18);
                drawable.draw(c17);
            } else if (i17 != 0 || this.f202700f) {
                drawable.setBounds(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getTop() + i18);
                drawable.draw(c17);
            }
        }
    }

    public /* synthetic */ a(android.content.Context context, int i17, int i18, boolean z17, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, i17, i18, (i19 & 8) != 0 ? true : z17);
    }
}
