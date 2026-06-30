package m22;

/* loaded from: classes4.dex */
public final class h extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f404580d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f404581e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f404582f;

    /* renamed from: g, reason: collision with root package name */
    public final float f404583g;

    public h(android.content.Context context, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f404580d = i17;
        this.f404581e = new android.graphics.Rect();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f404582f = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560840vn));
        this.f404583g = i65.a.b(context, 64);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDrawOver */
    public void mo7903x73cebf37(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7903x73cebf37(canvas, parent, state);
        canvas.save();
        int childCount = parent.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = parent.getChildAt(i17);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = parent.w0(childAt);
            int m8183xf806b362 = w07.m8183xf806b362();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = parent.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(layoutManager);
            android.graphics.Rect rect = this.f404581e;
            layoutManager.m8011x8b74aca9(childAt, rect);
            int round = rect.bottom + java.lang.Math.round(childAt.getTranslationY());
            int i18 = rect.top;
            childAt.getTranslationY();
            android.graphics.Paint paint = this.f404582f;
            paint.getStrokeWidth();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = parent.mo7946xf939df19();
            if (mo7946xf939df19 == null) {
                return;
            }
            boolean z17 = m8183xf806b362 == (mo7946xf939df19.mo1894x7e414b06() - 1) - this.f404580d;
            if (w07 instanceof m22.o) {
                if (z17) {
                    float f17 = round;
                    canvas.drawLine(0.0f, f17, rect.width(), f17, paint);
                } else {
                    float f18 = round;
                    canvas.drawLine(this.f404583g, f18, rect.width(), f18, paint);
                }
            }
        }
        canvas.restore();
    }
}
