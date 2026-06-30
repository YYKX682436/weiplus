package ii2;

/* loaded from: classes5.dex */
public final class c extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final ii2.a f373157d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f373158e;

    public c(ii2.a config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f373157d = config;
        this.f373158e = new android.graphics.drawable.ColorDrawable(config.f373150a);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDrawOver */
    public void mo7903x73cebf37(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        int i17;
        int i18;
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int paddingLeft = parent.getPaddingLeft();
        ii2.a aVar = this.f373157d;
        int i27 = paddingLeft + aVar.f373151b.left;
        int width = (parent.getWidth() - parent.getPaddingRight()) - aVar.f373151b.right;
        int childCount = parent.getChildCount();
        for (int i28 = 0; i28 < childCount; i28++) {
            yz5.p pVar = aVar.f373153d;
            if (!(pVar != null && ((java.lang.Boolean) pVar.mo149xb9724478(java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(childCount))).booleanValue())) {
                android.view.View childAt = parent.getChildAt(i28);
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams;
                int ordinal = aVar.f373152c.ordinal();
                if (ordinal == 0) {
                    int top = childAt.getTop() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                    android.graphics.Rect rect = aVar.f373151b;
                    i17 = top + rect.top;
                    i18 = rect.bottom;
                } else if (ordinal != 1) {
                    i17 = 0;
                    i19 = 0;
                    android.graphics.drawable.Drawable drawable = this.f373158e;
                    drawable.setBounds(i27, i17, width, i19);
                    drawable.draw(c17);
                } else {
                    int bottom = childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                    android.graphics.Rect rect2 = aVar.f373151b;
                    i17 = bottom + rect2.top;
                    i18 = rect2.bottom;
                }
                i19 = i18 + i17;
                android.graphics.drawable.Drawable drawable2 = this.f373158e;
                drawable2.setBounds(i27, i17, width, i19);
                drawable2.draw(c17);
            }
        }
    }
}
