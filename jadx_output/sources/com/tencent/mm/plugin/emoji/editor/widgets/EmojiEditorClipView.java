package com.tencent.mm.plugin.emoji.editor.widgets;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001d\u001eB'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0003R0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorClipView;", "Landroid/view/View;", "Landroid/view/ScaleGestureDetector$OnScaleGestureListener;", "Landroid/graphics/Rect;", "getViewportBounds", "bounds", "Ljz5/f0;", "setViewportBounds", "", "isSquare", "setSquared", "clipBounds", "setViewportBoundsFromClip", "Lkotlin/Function1;", "d", "Lyz5/l;", "getOnSurfaceBoundsChanged", "()Lyz5/l;", "setOnSurfaceBoundsChanged", "(Lyz5/l;)V", "onSurfaceBoundsChanged", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "o12/a", "o12/k", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class EmojiEditorClipView extends android.view.View implements android.view.ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: J, reason: collision with root package name */
    public static final o12.a f97451J = new o12.a(null);
    public final int A;
    public final android.graphics.Paint B;
    public final android.graphics.Paint C;
    public final android.graphics.Paint D;
    public final android.graphics.Paint E;
    public float F;
    public float G;
    public float H;
    public final android.graphics.Rect I;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public yz5.l onSurfaceBoundsChanged;

    /* renamed from: e, reason: collision with root package name */
    public boolean f97453e;

    /* renamed from: f, reason: collision with root package name */
    public int f97454f;

    /* renamed from: g, reason: collision with root package name */
    public int f97455g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f97456h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f97457i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Rect f97458m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Rect f97459n;

    /* renamed from: o, reason: collision with root package name */
    public o12.k f97460o;

    /* renamed from: p, reason: collision with root package name */
    public int f97461p;

    /* renamed from: q, reason: collision with root package name */
    public int f97462q;

    /* renamed from: r, reason: collision with root package name */
    public int f97463r;

    /* renamed from: s, reason: collision with root package name */
    public int f97464s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.ScaleGestureDetector f97465t;

    /* renamed from: u, reason: collision with root package name */
    public final int f97466u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f97467v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f97468w;

    /* renamed from: x, reason: collision with root package name */
    public android.animation.ValueAnimator f97469x;

    /* renamed from: y, reason: collision with root package name */
    public android.animation.ValueAnimator f97470y;

    /* renamed from: z, reason: collision with root package name */
    public final int f97471z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiEditorClipView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final jz5.l a(android.graphics.Rect rect, android.graphics.Rect rect2) {
        int i17 = rect.left;
        int i18 = rect2.left;
        int i19 = 0;
        int i27 = (i17 <= i18 && (i17 = rect.right) >= (i18 = rect2.right)) ? 0 : i18 - i17;
        int i28 = rect.top;
        int i29 = rect2.top;
        if (i28 > i29) {
            i19 = i29 - i28;
        } else {
            int i37 = rect.bottom;
            int i38 = rect2.bottom;
            if (i37 < i38) {
                i19 = i38 - i37;
            }
        }
        return new jz5.l(java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i19));
    }

    public final android.graphics.Rect b() {
        android.graphics.Rect rect = this.f97456h;
        if (rect.isEmpty()) {
            return new android.graphics.Rect(0, 0, this.f97454f, this.f97455g);
        }
        android.graphics.Rect rect2 = this.f97457i;
        android.graphics.Rect rect3 = new android.graphics.Rect(java.lang.Math.max(rect2.left, rect.left), java.lang.Math.max(rect2.top, rect.top), java.lang.Math.min(rect2.right, rect.right), java.lang.Math.min(rect2.bottom, rect.bottom));
        rect3.offsetTo(rect3.left - rect2.left, rect3.top - rect2.top);
        float width = rect2.width() / this.f97454f;
        return new android.graphics.Rect((int) (rect3.left / width), (int) (rect3.top / width), (int) (rect3.right / width), (int) (rect3.bottom / width));
    }

    public final void c() {
        yz5.l lVar = this.onSurfaceBoundsChanged;
        if (lVar != null) {
            lVar.invoke(this.f97457i);
        }
    }

    public final void d() {
        android.graphics.Rect rect = this.f97456h;
        boolean isEmpty = rect.isEmpty();
        android.graphics.Rect rect2 = this.f97457i;
        if (isEmpty) {
            e();
            int min = java.lang.Math.min(rect2.width(), rect2.height()) / 2;
            rect.set(rect2.centerX() - min, rect2.centerY() - min, rect2.centerX() + min, rect2.centerY() + min);
            c();
        } else {
            c();
        }
        invalidate();
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorClipView", "reset, viewport: " + rect + ", surface: " + rect2);
    }

    public final void e() {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int paddingLeft = getPaddingLeft() + (width / 2);
        int paddingTop = getPaddingTop() + (height / 2);
        float f17 = width;
        float f18 = height;
        float f19 = f17 / f18;
        int i17 = this.f97454f;
        int i18 = this.f97455g;
        if (f19 <= i17 / i18) {
            height = (int) ((f17 / i17) * i18);
        } else {
            width = (int) (f18 * (i17 / i18));
        }
        int i19 = width / 2;
        int i27 = height / 2;
        this.f97457i.set(paddingLeft - i19, paddingTop - i27, paddingLeft + i19, paddingTop + i27);
    }

    public final yz5.l getOnSurfaceBoundsChanged() {
        return this.onSurfaceBoundsChanged;
    }

    /* renamed from: getViewportBounds, reason: from getter */
    public final android.graphics.Rect getF97456h() {
        return this.f97456h;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth();
        android.graphics.Rect rect = this.f97456h;
        float f17 = rect.top;
        android.graphics.Paint paint2 = this.E;
        canvas.drawRect(0.0f, 0.0f, width, f17, paint2);
        canvas.drawRect(0.0f, rect.bottom, getWidth(), getHeight(), paint2);
        canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom, paint2);
        canvas.drawRect(rect.right, rect.top, getWidth(), rect.bottom, paint2);
        canvas.drawRect(rect, this.C);
        int i17 = 0;
        int i18 = 0;
        while (true) {
            paint = this.B;
            if (i18 >= 2) {
                break;
            }
            int i19 = i18 + 1;
            float f18 = i19;
            canvas.drawLine(rect.left + ((rect.width() / 3.0f) * f18), rect.top, rect.left + ((rect.width() / 3.0f) * f18), rect.bottom, paint);
            i18 = i19;
        }
        while (i17 < 2) {
            i17++;
            float f19 = i17;
            canvas.drawLine(rect.left, ((rect.height() / 3.0f) * f19) + rect.top, rect.right, ((rect.height() / 3.0f) * f19) + rect.top, paint);
        }
        int i27 = rect.left;
        int i28 = this.A;
        float f27 = i28 / 2.0f;
        float f28 = rect.top - f27;
        int i29 = this.f97471z;
        android.graphics.Paint paint3 = this.D;
        canvas.drawLine(i27 - i28, f28, i27 + i29, f28, paint3);
        int i37 = rect.right;
        float f29 = rect.top - f27;
        canvas.drawLine(i37 - i29, f29, i37 + i28, f29, paint3);
        int i38 = rect.left;
        float f37 = rect.bottom + f27;
        canvas.drawLine(i38 - i28, f37, i38 + i29, f37, paint3);
        int i39 = rect.right;
        float f38 = rect.bottom + f27;
        canvas.drawLine(i39 - i29, f38, i39 + i28, f38, paint3);
        float f39 = rect.left - (i28 / 2);
        canvas.drawLine(f39, rect.top, f39, r0 + i29, paint3);
        float f47 = i28 / 2.0f;
        float f48 = rect.right + f47;
        canvas.drawLine(f48, rect.top, f48, r0 + i29, paint3);
        float f49 = rect.left - f47;
        canvas.drawLine(f49, rect.bottom, f49, r0 - i29, paint3);
        float f57 = rect.right + f47;
        canvas.drawLine(f57, rect.bottom, f57, r0 - i29, paint3);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(android.view.ScaleGestureDetector detector) {
        kotlin.jvm.internal.o.g(detector, "detector");
        float currentSpan = detector.getCurrentSpan();
        float focusX = detector.getFocusX();
        float focusY = detector.getFocusY();
        float f17 = currentSpan / this.F;
        android.graphics.Rect rect = this.I;
        float width = rect.width() * f17;
        float height = f17 * rect.height();
        float width2 = (rect.left - (((width - rect.width()) * (this.G - rect.left)) / rect.width())) + (focusX - this.G);
        float height2 = (rect.top - (((height - rect.height()) * (this.H - rect.top)) / rect.height())) + (focusY - this.H);
        android.graphics.Rect rect2 = this.f97457i;
        rect2.set((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
        c();
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorClipView", "onScale, surface: " + rect2 + ", focus at: (" + focusX + ", " + focusY + "), span: " + currentSpan);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(android.view.ScaleGestureDetector detector) {
        kotlin.jvm.internal.o.g(detector, "detector");
        android.animation.ValueAnimator valueAnimator = this.f97469x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimator2 = this.f97470y;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f97468w = true;
        this.f97467v = false;
        this.F = detector.getCurrentSpan();
        this.G = detector.getFocusX();
        this.H = detector.getFocusY();
        this.I.set(this.f97457i);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorClipView", "onScaleBegin, span: " + this.F + ", focus: (" + this.G + ", " + this.H + ')');
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(android.view.ScaleGestureDetector detector) {
        kotlin.jvm.internal.o.g(detector, "detector");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorClipView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setOnSurfaceBoundsChanged(yz5.l lVar) {
        this.onSurfaceBoundsChanged = lVar;
    }

    public final void setSquared(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorClipView", "setSquared, isSquare: " + z17);
        this.f97453e = z17;
        if (z17) {
            android.graphics.Rect rect = this.f97456h;
            int min = java.lang.Math.min(rect.width(), rect.height());
            int i17 = min / 2;
            int paddingLeft = (getPaddingLeft() + (((getWidth() - getPaddingLeft()) - getPaddingRight()) / 2)) - i17;
            int paddingTop = (getPaddingTop() + (((getHeight() - getPaddingTop()) - getPaddingBottom()) / 2)) - i17;
            rect.set(paddingLeft, paddingTop, paddingLeft + min, min + paddingTop);
        }
        invalidate();
    }

    public final void setViewportBounds(android.graphics.Rect bounds) {
        kotlin.jvm.internal.o.g(bounds, "bounds");
        this.f97456h.set(bounds);
        invalidate();
    }

    public final void setViewportBoundsFromClip(android.graphics.Rect clipBounds) {
        kotlin.jvm.internal.o.g(clipBounds, "clipBounds");
        if (this.f97454f > 0) {
            android.graphics.Rect rect = this.f97457i;
            if (rect.isEmpty()) {
                return;
            }
            float width = rect.width() / this.f97454f;
            int i17 = rect.left;
            int i18 = ((int) (clipBounds.left * width)) + i17;
            int i19 = rect.top;
            int i27 = ((int) (clipBounds.top * width)) + i19;
            int i28 = i17 + ((int) (clipBounds.right * width));
            int i29 = i19 + ((int) (clipBounds.bottom * width));
            android.graphics.Rect rect2 = this.f97456h;
            rect2.set(i18, i27, i28, i29);
            c();
            invalidate();
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorClipView", "setViewportBoundsFromClip, clip: " + clipBounds + ", viewport: " + rect2 + ", surface: " + rect);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiEditorClipView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f97456h = new android.graphics.Rect();
        this.f97457i = new android.graphics.Rect();
        this.f97458m = new android.graphics.Rect();
        this.f97459n = new android.graphics.Rect();
        this.f97460o = o12.f.f342147b;
        this.f97465t = new android.view.ScaleGestureDetector(context, this);
        this.f97466u = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.f97471z = ym5.x.a(context, 20.0f);
        int a17 = ym5.x.a(context, 3.0f);
        this.A = a17;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(-1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        this.B = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setColor(-1);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeWidth(ym5.x.a(context, 1.0f));
        this.C = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setColor(-1);
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        paint3.setStrokeWidth(a17);
        this.D = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        paint4.setColor(-872415232);
        paint4.setStyle(android.graphics.Paint.Style.FILL);
        this.E = paint4;
        this.I = new android.graphics.Rect();
    }
}
