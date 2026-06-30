package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.p1644x5b09653;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/slideprofile/debug/SlideProfileDebugHudView;", "Landroid/view/View;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.slideprofile.debug.SlideProfileDebugHudView */
/* loaded from: classes4.dex */
public final class C15141xed962d61 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f211377d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f211378e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f211379f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f211380g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f211381h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Paint f211382i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f211383m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Paint f211384n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C15141xed962d61(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = bv2.e.f106251a;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = bv2.e.f106251a;
        if (!copyOnWriteArrayList2.contains(this)) {
            copyOnWriteArrayList2.add(this);
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList3 = bv2.e.f106252b;
        if (copyOnWriteArrayList3.contains(this)) {
            return;
        }
        copyOnWriteArrayList3.add(this);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = bv2.e.f106251a;
        bv2.e.f106251a.remove(this);
        bv2.e.f106252b.remove(this);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        float width = (getWidth() - 380.0f) - 16.0f;
        float f17 = 380.0f + width;
        canvas.drawRoundRect(new android.graphics.RectF(width, 76.0f, f17, 502.0f), 14.0f, 14.0f, this.f211377d);
        float f18 = width + 14.0f;
        canvas.drawText("Slide Debug HUD", f18, 112.0f, this.f211378e);
        canvas.drawText("pressing=".concat("no"), f18, 144.0f, this.f211379f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dx=");
        java.lang.String format = java.lang.String.format("%+.1f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(0.0f)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        sb6.append(format);
        sb6.append("px");
        canvas.drawText(sb6.toString(), f18, 174.0f, this.f211379f);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("dy=");
        java.lang.String format2 = java.lang.String.format("%+.1f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(0.0f)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        sb7.append(format2);
        sb7.append("px");
        canvas.drawText(sb7.toString(), f18, 204.0f, this.f211379f);
        float abs = java.lang.Math.abs(0.0f);
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = bv2.e.f106251a;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = bv2.e.f106251a;
        canvas.drawText("|dx|>th? ".concat(abs > ((float) 0) ? "✓" : "✗"), f18, 234.0f, this.f211379f);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("v=");
        java.lang.String format3 = java.lang.String.format("%+.0f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(0.0f)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format3, "format(...)");
        sb8.append(format3);
        sb8.append("px/s");
        canvas.drawText(sb8.toString(), f18, 264.0f, this.f211379f);
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("a=");
        java.lang.String format4 = java.lang.String.format("%+.0f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(0.0f)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format4, "format(...)");
        sb9.append(format4);
        sb9.append("px/s²");
        canvas.drawText(sb9.toString(), f18, 294.0f, this.f211379f);
        canvas.drawLine(f18, 312.0f, f17 - 14.0f, 312.0f, this.f211380g);
        canvas.drawText("Pager 判定", f18, 340.0f, this.f211378e);
        canvas.drawText("(等待手势)", f18, 370.0f, this.f211379f);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    public /* synthetic */ C15141xed962d61(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15141xed962d61(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(-1442840576);
        this.f211377d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setColor(-256);
        paint2.setTextSize(28.0f);
        paint2.setFakeBoldText(true);
        this.f211378e = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        paint3.setColor(-1);
        paint3.setTextSize(26.0f);
        this.f211379f = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint(1);
        paint4.setColor(1442840575);
        paint4.setStrokeWidth(1.0f);
        this.f211380g = paint4;
        android.graphics.Paint paint5 = new android.graphics.Paint(1);
        paint5.setColor(android.graphics.Color.parseColor("#69F0AE"));
        paint5.setTextSize(26.0f);
        paint5.setFakeBoldText(true);
        this.f211381h = paint5;
        android.graphics.Paint paint6 = new android.graphics.Paint(1);
        paint6.setColor(android.graphics.Color.parseColor("#FF8A80"));
        paint6.setTextSize(26.0f);
        paint6.setFakeBoldText(true);
        this.f211382i = paint6;
        android.graphics.Paint paint7 = new android.graphics.Paint(1);
        paint7.setColor(android.graphics.Color.parseColor("#69F0AE"));
        paint7.setTextSize(26.0f);
        this.f211383m = paint7;
        android.graphics.Paint paint8 = new android.graphics.Paint(1);
        paint8.setColor(android.graphics.Color.parseColor("#FF8A80"));
        paint8.setTextSize(26.0f);
        this.f211384n = paint8;
        setClickable(false);
        setFocusable(false);
        setWillNotDraw(false);
    }
}
