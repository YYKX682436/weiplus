package lv0;

/* loaded from: classes3.dex */
public final class c extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f403013d;

    /* renamed from: e, reason: collision with root package name */
    public final int f403014e;

    /* renamed from: f, reason: collision with root package name */
    public final int f403015f;

    /* renamed from: g, reason: collision with root package name */
    public final int f403016g;

    /* renamed from: h, reason: collision with root package name */
    public final lv0.f f403017h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Paint f403018i;

    public c(int i17, int i18, int i19, int i27, int i28, lv0.f positionType, int i29, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i18 = (i29 & 2) != 0 ? i17 : i18;
        i19 = (i29 & 4) != 0 ? i17 : i19;
        i27 = (i29 & 8) != 0 ? 0 : i27;
        i28 = (i29 & 16) != 0 ? -1 : i28;
        positionType = (i29 & 32) != 0 ? lv0.f.f403021e : positionType;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(positionType, "positionType");
        this.f403013d = i17;
        this.f403014e = i18;
        this.f403015f = i19;
        this.f403016g = i27;
        this.f403017h = positionType;
        if (i28 != -1) {
            android.graphics.Paint paint = new android.graphics.Paint();
            this.f403018i = paint;
            paint.setColor(i28);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (parent.mo7946xf939df19() == null) {
            return;
        }
        int intValue = ((java.lang.Number) this.f403017h.f403024d.mo146xb9724478(view)).intValue();
        if (intValue == 0) {
            outRect.left = this.f403014e;
        }
        if (intValue == r5.mo1894x7e414b06() - 1) {
            outRect.right = this.f403015f;
        } else {
            outRect.right = this.f403013d;
        }
        int i17 = this.f403016g;
        if (i17 > 0) {
            outRect.top = (parent.getHeight() - i17) / 2;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        android.graphics.Paint paint;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo8166xc398a7c3(c17, parent, state);
        if (parent.getChildCount() == 0 || (paint = this.f403018i) == null) {
            return;
        }
        android.view.View childAt = parent.getChildAt(0);
        c17.drawRect(new android.graphics.Rect(0, childAt.getTop(), parent.getWidth(), childAt.getBottom()), paint);
    }
}
