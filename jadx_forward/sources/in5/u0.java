package in5;

/* loaded from: classes3.dex */
public final class u0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final in5.q f374669d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f374670e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f374671f;

    /* renamed from: g, reason: collision with root package name */
    public final int f374672g;

    /* renamed from: h, reason: collision with root package name */
    public final int f374673h;

    /* renamed from: i, reason: collision with root package name */
    public final int f374674i;

    /* renamed from: m, reason: collision with root package name */
    public final int f374675m;

    public u0(in5.q qVar, int[] iArr, android.graphics.Paint paint, int i17, int i18, int i19, int i27, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f374669d = qVar;
        this.f374670e = iArr;
        this.f374671f = paint;
        this.f374672g = i17;
        this.f374673h = i18;
        this.f374674i = i19;
        this.f374675m = i27;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7902x5db88677(outRect, view, parent, state);
        outRect.bottom = this.f374672g;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        android.graphics.Paint paint;
        int i17;
        float f17;
        float f18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo8166xc398a7c3(c17, parent, state);
        int childCount = parent.getChildCount();
        float paddingLeft = parent.getPaddingLeft();
        float width = parent.getWidth() - parent.getPaddingRight();
        float f19 = paddingLeft + this.f374673h;
        float f27 = width - this.f374674i;
        int ordinal = this.f374669d.ordinal();
        int i18 = 0;
        if (ordinal == 0) {
            paint = new android.graphics.Paint();
            paint.setColor(this.f374670e[0]);
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            paint = new android.graphics.Paint();
            paint.setShader(new android.graphics.LinearGradient(f19, 0.0f, f27, 0.0f, this.f374670e, new float[]{0.0f, 0.5f, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
            paint.setAlpha(255);
        }
        android.graphics.Paint paint2 = paint;
        int i19 = 0;
        while (i19 < childCount) {
            float bottom = parent.getChildAt(i19).getBottom();
            float bottom2 = r1.getBottom() + this.f374672g;
            if (i19 == childCount - 1) {
                i17 = i18;
                f17 = f27;
                c17.drawRect(paddingLeft + this.f374675m, bottom, width - i18, bottom2, this.f374671f);
                f18 = f19;
            } else {
                i17 = i18;
                f17 = f27;
                f18 = f19;
                c17.drawRect(new android.graphics.RectF(f18, bottom, f17, bottom2), paint2);
            }
            i19++;
            f19 = f18;
            f27 = f17;
            i18 = i17;
        }
    }
}
