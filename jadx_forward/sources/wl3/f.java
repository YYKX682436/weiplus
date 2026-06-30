package wl3;

/* loaded from: classes4.dex */
public final class f extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final float f528597d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f528598e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f528599f;

    public f(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f528598e = paint;
        this.f528599f = new java.util.ArrayList();
        paint.setColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
        paint.setTextSize(i65.a.b(context, 10));
        this.f528597d = paint.measureText("00:00");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDrawOver */
    public void mo7903x73cebf37(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int childCount = parent.getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = parent.getChildAt(i18);
            int u07 = parent.u0(childAt);
            float bottom = childAt.getBottom();
            android.graphics.Paint paint = this.f528598e;
            float f17 = bottom - paint.getFontMetrics().descent;
            int left = childAt.getLeft();
            int right = childAt.getRight();
            float f18 = left;
            float f19 = this.f528597d;
            float f27 = 2;
            float f28 = (-f19) / f27;
            java.util.ArrayList arrayList = this.f528599f;
            if (f18 > f28) {
                c17.drawText((java.lang.String) arrayList.get(u07), f18 - (f19 / f27), f17, paint);
            }
            if (i18 == childCount - 1 && (i17 = u07 + 1) < arrayList.size()) {
                float f29 = right;
                if (f29 < parent.getWidth() + (f19 / f27)) {
                    c17.drawText((java.lang.String) arrayList.get(i17), f29 - (f19 / f27), f17 - paint.getFontMetrics().descent, paint);
                }
            }
        }
        super.mo7903x73cebf37(c17, parent, state);
    }
}
