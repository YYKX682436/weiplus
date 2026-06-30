package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dB%\b\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001c\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000e\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001b\u0010\u0011\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\nR\u001b\u0010\u0014\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\nR\u001b\u0010\u0017\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0016\u0010\n¨\u0006!"}, d2 = {"Lcom/tencent/mm/ui/widget/cropview/BorderView;", "Landroid/view/View;", "Landroid/graphics/Rect;", "rect", "Ljz5/f0;", "setBorderRect", "", "d", "Ljz5/g;", "getBOX_LINE_WIDTH", "()F", "BOX_LINE_WIDTH", "e", "getBOX_GIRD_WIDTH", "BOX_GIRD_WIDTH", "f", "getCORNER_WIDTH", "CORNER_WIDTH", "g", "getBOX_PADDING", "BOX_PADDING", "h", "getCORNER_LENGTH", "CORNER_LENGTH", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.widget.cropview.BorderView */
/* loaded from: classes5.dex */
public final class C22677xe3990911 extends android.view.View {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g BOX_LINE_WIDTH;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g BOX_GIRD_WIDTH;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g CORNER_WIDTH;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g BOX_PADDING;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g CORNER_LENGTH;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Path f293175i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f293176m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Paint f293177n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f293178o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f293179p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Rect f293180q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Rect f293181r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.Rect f293182s;

    public C22677xe3990911(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.BOX_LINE_WIDTH = jz5.h.b(new ml5.c(this));
        this.BOX_GIRD_WIDTH = jz5.h.b(new ml5.b(this));
        this.CORNER_WIDTH = jz5.h.b(new ml5.f(this));
        this.BOX_PADDING = jz5.h.b(new ml5.d(this));
        this.CORNER_LENGTH = jz5.h.b(new ml5.e(this));
        this.f293175i = new android.graphics.Path();
        this.f293176m = new android.graphics.Paint();
        this.f293177n = new android.graphics.Paint();
        this.f293178o = new android.graphics.Paint();
        this.f293180q = new android.graphics.Rect();
        this.f293182s = new android.graphics.Rect();
    }

    /* renamed from: getBOX_GIRD_WIDTH */
    private final float m81872xe80fe825() {
        return ((java.lang.Number) this.BOX_GIRD_WIDTH.mo141623x754a37bb()).floatValue();
    }

    /* renamed from: getBOX_LINE_WIDTH */
    private final float m81873x42e0a585() {
        return ((java.lang.Number) this.BOX_LINE_WIDTH.mo141623x754a37bb()).floatValue();
    }

    /* renamed from: getBOX_PADDING */
    private final float m81874xbade3447() {
        return ((java.lang.Number) this.BOX_PADDING.mo141623x754a37bb()).floatValue();
    }

    /* renamed from: getCORNER_LENGTH */
    private final float m81875xdd22787a() {
        return ((java.lang.Number) this.CORNER_LENGTH.mo141623x754a37bb()).floatValue();
    }

    /* renamed from: getCORNER_WIDTH */
    private final float m81876x52116992() {
        return ((java.lang.Number) this.CORNER_WIDTH.mo141623x754a37bb()).floatValue();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Rect rect = this.f293181r;
        if (rect == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentRect");
            throw null;
        }
        android.graphics.Rect rect2 = this.f293182s;
        boolean equals = rect.equals(rect2);
        android.graphics.Path path = this.f293175i;
        android.graphics.Rect rect3 = this.f293180q;
        if (!equals) {
            android.graphics.Rect rect4 = this.f293181r;
            if (rect4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentRect");
                throw null;
            }
            rect2.set(rect4);
            android.graphics.Rect rect5 = this.f293181r;
            if (rect5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentRect");
                throw null;
            }
            int m81874xbade3447 = rect5.left + ((int) m81874xbade3447());
            android.graphics.Rect rect6 = this.f293181r;
            if (rect6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentRect");
                throw null;
            }
            int m81874xbade34472 = rect6.top + ((int) m81874xbade3447());
            android.graphics.Rect rect7 = this.f293181r;
            if (rect7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentRect");
                throw null;
            }
            int m81874xbade34473 = rect7.right - ((int) m81874xbade3447());
            android.graphics.Rect rect8 = this.f293181r;
            if (rect8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentRect");
                throw null;
            }
            rect3.set(m81874xbade3447, m81874xbade34472, m81874xbade34473, rect8.bottom - ((int) m81874xbade3447()));
            path.reset();
            for (int i17 = 1; i17 < 3; i17++) {
                path.moveTo(rect3.left + ((rect3.width() / 3) * i17), rect3.top);
                path.lineTo(rect3.left + ((rect3.width() / 3) * i17), rect3.bottom);
                path.moveTo(rect3.left, rect3.top + ((rect3.height() / 3) * i17));
                path.lineTo(rect3.right, rect3.top + ((rect3.height() / 3) * i17));
            }
        }
        canvas.drawPath(path, this.f293177n);
        canvas.drawRect(rect3, this.f293176m);
        float f17 = 2;
        canvas.drawLine(rect3.left - m81876x52116992(), rect3.top - (m81876x52116992() / f17), rect3.left + m81875xdd22787a(), rect3.top - (m81876x52116992() / f17), this.f293178o);
        canvas.drawLine((rect3.right - m81875xdd22787a()) + (m81876x52116992() / f17), rect3.top - (m81876x52116992() / f17), rect3.right + m81876x52116992(), rect3.top - (m81876x52116992() / f17), this.f293178o);
        canvas.drawLine(rect3.left - (m81876x52116992() / f17), rect3.top - (m81876x52116992() / f17), rect3.left - (m81876x52116992() / f17), rect3.top + m81875xdd22787a(), this.f293178o);
        canvas.drawLine(rect3.left - (m81876x52116992() / f17), (rect3.bottom - m81875xdd22787a()) + (m81876x52116992() / f17), rect3.left - (m81876x52116992() / f17), rect3.bottom + (m81876x52116992() / f17), this.f293178o);
        canvas.drawLine(rect3.right + (m81876x52116992() / f17), rect3.top, rect3.right + (m81876x52116992() / f17), rect3.top + m81875xdd22787a(), this.f293178o);
        canvas.drawLine(rect3.right + (m81876x52116992() / f17), (rect3.bottom - m81875xdd22787a()) + (m81876x52116992() / f17), rect3.right + (m81876x52116992() / f17), rect3.bottom + (m81876x52116992() / f17), this.f293178o);
        canvas.drawLine(rect3.left - m81876x52116992(), rect3.bottom + (m81876x52116992() / f17), rect3.left + m81875xdd22787a(), rect3.bottom + (m81876x52116992() / f17), this.f293178o);
        canvas.drawLine(rect3.right - m81875xdd22787a(), rect3.bottom + (m81876x52116992() / f17), rect3.right + m81876x52116992(), rect3.bottom + (m81876x52116992() / f17), this.f293178o);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        if (this.f293179p) {
            return;
        }
        this.f293179p = true;
        android.graphics.Paint paint = this.f293176m;
        paint.setColor(-1);
        paint.setStrokeWidth(m81873x42e0a585());
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setAntiAlias(true);
        android.graphics.Paint paint2 = this.f293177n;
        paint2.set(paint);
        paint2.setStrokeWidth(m81872xe80fe825());
        android.graphics.Paint paint3 = this.f293178o;
        paint3.set(paint);
        paint3.setStrokeWidth(m81876x52116992());
    }

    /* renamed from: setBorderRect */
    public final void m81877x892a5232(android.graphics.Rect rect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        this.f293181r = rect;
    }

    public C22677xe3990911(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.BOX_LINE_WIDTH = jz5.h.b(new ml5.c(this));
        this.BOX_GIRD_WIDTH = jz5.h.b(new ml5.b(this));
        this.CORNER_WIDTH = jz5.h.b(new ml5.f(this));
        this.BOX_PADDING = jz5.h.b(new ml5.d(this));
        this.CORNER_LENGTH = jz5.h.b(new ml5.e(this));
        this.f293175i = new android.graphics.Path();
        this.f293176m = new android.graphics.Paint();
        this.f293177n = new android.graphics.Paint();
        this.f293178o = new android.graphics.Paint();
        this.f293180q = new android.graphics.Rect();
        this.f293182s = new android.graphics.Rect();
    }
}
