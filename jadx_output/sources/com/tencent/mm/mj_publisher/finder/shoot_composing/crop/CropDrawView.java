package com.tencent.mm.mj_publisher.finder.shoot_composing.crop;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/shoot_composing/crop/CropDrawView;", "Landroid/view/View;", "Landroid/graphics/RectF;", "i", "Landroid/graphics/RectF;", "getClipRect", "()Landroid/graphics/RectF;", "clipRect", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CropDrawView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f69617d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f69618e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f69619f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f69620g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f69621h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final android.graphics.RectF clipRect;

    /* renamed from: m, reason: collision with root package name */
    public boolean f69623m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f69624n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f69625o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f69626p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f69627q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f69628r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f69629s;

    /* renamed from: t, reason: collision with root package name */
    public final float f69630t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CropDrawView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final android.graphics.RectF getClipRect() {
        return this.clipRect;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        boolean z17 = this.f69625o;
        android.graphics.RectF rectF = this.clipRect;
        if (z17) {
            float width = getWidth();
            float f17 = rectF.top;
            android.graphics.Paint paint = this.f69619f;
            canvas.drawRect(0.0f, 0.0f, width, f17, paint);
            canvas.drawRect(0.0f, rectF.top, rectF.left, rectF.bottom, paint);
            canvas.drawRect(0.0f, rectF.bottom, getWidth(), getHeight(), paint);
            canvas.drawRect(rectF.right, rectF.top, getWidth(), rectF.bottom, paint);
        }
        canvas.drawRect(rectF, this.f69617d);
        boolean z18 = this.f69627q;
        android.graphics.Paint paint2 = this.f69620g;
        float f18 = this.f69630t;
        if (z18) {
            float f19 = rectF.left;
            float f27 = rectF.top;
            canvas.drawRect(f19, f27, rectF.right, f27 + f18, paint2);
        }
        if (this.f69628r) {
            float f28 = rectF.right;
            canvas.drawRect(f28 - f18, rectF.top, f28, rectF.bottom, paint2);
        }
        if (this.f69629s) {
            float f29 = rectF.left;
            float f37 = rectF.bottom;
            canvas.drawRect(f29, f37 - f18, rectF.right, f37, paint2);
        }
        if (this.f69626p) {
            float f38 = rectF.left;
            canvas.drawRect(f38, rectF.top, f38 + f18, rectF.bottom, paint2);
        }
        boolean z19 = this.f69623m;
        android.graphics.Paint paint3 = this.f69618e;
        if (z19) {
            float f39 = (rectF.top + rectF.bottom) / 2.0f;
            canvas.drawLine(rectF.left, f39, rectF.right, f39, paint3);
        }
        if (this.f69624n) {
            float f47 = (rectF.left + rectF.right) / 2.0f;
            canvas.drawLine(f47, rectF.top, f47, rectF.bottom, paint3);
        }
        java.lang.String string = j65.q.a(getContext()).getString(com.tencent.mm.R.string.oik);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.graphics.Rect rect = new android.graphics.Rect();
        android.graphics.Paint paint4 = this.f69621h;
        paint4.getTextBounds(string, 0, string.length(), rect);
        canvas.drawText(string, (rectF.right + rectF.left) / 2, (rectF.top - (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 10.0f)) - paint4.getFontMetricsInt().descent, paint4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropDrawView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(5.0f);
        paint.setPathEffect(null);
        this.f69617d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(-1);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeWidth(5.0f);
        float f17 = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 5);
        paint2.setPathEffect(new android.graphics.DashPathEffect(new float[]{f17, f17}, 0.0f));
        this.f69618e = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setColor(j65.q.a(context).getColor(com.tencent.mm.R.color.afm, null));
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        this.f69619f = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        paint4.setColor(-1);
        paint4.setStyle(android.graphics.Paint.Style.FILL);
        this.f69620g = paint4;
        android.graphics.Paint paint5 = new android.graphics.Paint();
        paint5.setAntiAlias(true);
        paint5.setColor(-1);
        paint5.setStrokeWidth(2.0f);
        paint5.setTextSize((int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 12));
        paint5.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.f69621h = paint5;
        this.clipRect = new android.graphics.RectF();
        this.f69625o = true;
        this.f69630t = 10.0f;
    }
}
