package com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\b¨\u0006 "}, d2 = {"Lcom/tencent/mm/plugin/palm/ui/PalmPrintVerifyMask;", "Landroid/view/View;", "", "d", "F", "getCircleRadius", "()F", "setCircleRadius", "(F)V", "circleRadius", "e", "getCirclePagWidth", "setCirclePagWidth", "circlePagWidth", "f", "getCircleX", "setCircleX", "circleX", "g", "getCircleY", "setCircleY", "circleY", "h", "getTipsLayoutY", "setTipsLayoutY", "tipsLayoutY", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-face_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.palm.ui.PalmPrintVerifyMask */
/* loaded from: classes5.dex */
public final class C16782x4f8f0be0 extends android.view.View {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f234415p = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public float circleRadius;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public float circlePagWidth;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public float circleX;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public float circleY;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public float tipsLayoutY;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Paint f234421i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f234422m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Paint f234423n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f234424o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16782x4f8f0be0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f234421i = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f234422m = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.f234423n = paint3;
        setAlpha(0.998f);
        paint.setColor(android.graphics.Color.parseColor("#80000000"));
        paint2.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        paint2.setColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        paint3.setStrokeWidth(23.0f);
    }

    public final void a(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintVerifyMask", "[showRing] isShow:" + z17 + ", isGreen:" + z18);
        this.f234424o = z17;
        if (this.f234424o) {
            this.f234423n.setColor(z18 ? i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77736x48893d57) : i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77847x35e128be));
        }
        invalidate();
    }

    public final float getCirclePagWidth() {
        return this.circlePagWidth;
    }

    public final float getCircleRadius() {
        return this.circleRadius;
    }

    public final float getCircleX() {
        return this.circleX;
    }

    public final float getCircleY() {
        return this.circleY;
    }

    public final float getTipsLayoutY() {
        return this.tipsLayoutY;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f234421i);
        this.circleRadius = getHeight() * 0.407f;
        this.circleX = getWidth() * 0.5f;
        float height = getHeight() * 0.54f;
        this.circleY = height;
        canvas.drawCircle(this.circleX, height, this.circleRadius, this.f234422m);
        canvas.restoreToCount(saveLayer);
        if (this.f234424o) {
            canvas.drawCircle(this.circleX, this.circleY, this.circleRadius, this.f234423n);
        }
        this.tipsLayoutY = getHeight() * 0.52f;
        this.circlePagWidth = getHeight() * 0.474f * 2;
    }

    /* renamed from: setCirclePagWidth */
    public final void m67502xa8f200c2(float f17) {
        this.circlePagWidth = f17;
    }

    /* renamed from: setCircleRadius */
    public final void m67503x52ec704(float f17) {
        this.circleRadius = f17;
    }

    /* renamed from: setCircleX */
    public final void m67504xdfe966c6(float f17) {
        this.circleX = f17;
    }

    /* renamed from: setCircleY */
    public final void m67505xdfe966c7(float f17) {
        this.circleY = f17;
    }

    /* renamed from: setTipsLayoutY */
    public final void m67506x2d0da55(float f17) {
        this.tipsLayoutY = f17;
    }
}
