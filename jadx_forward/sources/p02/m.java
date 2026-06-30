package p02;

/* loaded from: classes2.dex */
public class m extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.res.Resources f431954d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f431955e;

    /* renamed from: f, reason: collision with root package name */
    public final int f431956f;

    public m(android.content.res.Resources resources) {
        this.f431954d = resources;
        this.f431955e = new android.graphics.drawable.ColorDrawable(resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560430k6));
        this.f431956f = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562075a36);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect rect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        rect.set(0, 0, 0, this.f431956f);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int paddingLeft = c1163xf1deaba4.getPaddingLeft();
        int width = c1163xf1deaba4.getWidth() - c1163xf1deaba4.getPaddingRight();
        int childCount = c1163xf1deaba4.getChildCount();
        for (int i17 = 0; i17 < childCount - 1; i17++) {
            android.view.View childAt = c1163xf1deaba4.getChildAt(i17);
            android.view.View findViewById = childAt.findViewById(com.p314xaae8f345.mm.R.id.f568299me4);
            android.view.View findViewById2 = childAt.findViewById(com.p314xaae8f345.mm.R.id.me8);
            android.view.View findViewById3 = childAt.findViewById(com.p314xaae8f345.mm.R.id.mfe);
            if (childAt.getVisibility() == 8) {
                super.mo8166xc398a7c3(canvas, c1163xf1deaba4, h3Var);
            } else {
                int bottom = childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) childAt.getLayoutParams())).bottomMargin;
                int i18 = this.f431956f + bottom;
                int visibility = findViewById.getVisibility();
                android.graphics.drawable.Drawable drawable = this.f431955e;
                if (visibility == 0) {
                    drawable.setBounds(paddingLeft, bottom, width, i18);
                    drawable.draw(canvas);
                } else {
                    int visibility2 = findViewById2.getVisibility();
                    android.content.res.Resources resources = this.f431954d;
                    if (visibility2 == 0) {
                        drawable.setBounds(resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a9k) + paddingLeft, bottom, width, i18);
                        drawable.draw(canvas);
                    } else if (findViewById3.getVisibility() == 0) {
                        drawable.setBounds(resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a9j) + paddingLeft, bottom, width, i18);
                        drawable.draw(canvas);
                    }
                }
            }
        }
    }
}
