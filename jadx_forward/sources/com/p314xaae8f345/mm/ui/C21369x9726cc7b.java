package com.p314xaae8f345.mm.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010#\u001a\u00020\u000b¢\u0006\u0004\b$\u0010%R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\"\u0010\u001e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011¨\u0006&"}, d2 = {"Lcom/tencent/mm/ui/FrostedContentView;", "Lcom/tencent/mm/ui/LayoutListenerView;", "", "value", "f", "Z", "getFrostedEnabled", "()Z", "setFrostedEnabled", "(Z)V", "frostedEnabled", "", "g", "I", "getBlurRadius", "()I", "setBlurRadius", "(I)V", "blurRadius", "h", "getFrostedColor", "setFrostedColor", "frostedColor", "i", "getTopBlurAreaHeight", "setTopBlurAreaHeight", "topBlurAreaHeight", "m", "getBottomBlurAreaHeight", "setBottomBlurAreaHeight", "bottomBlurAreaHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.FrostedContentView */
/* loaded from: classes14.dex */
public final class C21369x9726cc7b extends com.p314xaae8f345.mm.ui.C21390x7d9495e3 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f278254u = 0;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean frostedEnabled;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int blurRadius;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int frostedColor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int topBlurAreaHeight;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public int bottomBlurAreaHeight;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.RenderNode f278260n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.RenderNode f278261o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.RenderNode f278262p;

    /* renamed from: q, reason: collision with root package name */
    public int f278263q;

    /* renamed from: r, reason: collision with root package name */
    public int f278264r;

    /* renamed from: s, reason: collision with root package name */
    public int f278265s;

    /* renamed from: t, reason: collision with root package name */
    public int f278266t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21369x9726cc7b(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void a(boolean z17, int i17, float f17) {
        int f18;
        m78418xeb8d2860(z17);
        this.blurRadius = 50;
        this.frostedColor = i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.agv);
        this.topBlurAreaHeight = 0;
        if (i17 > 0) {
            f18 = i17 - ((int) (f17 + 0.5f));
        } else {
            f18 = ((int) (i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561160b2) * i65.a.m(getContext()))) + com.p314xaae8f345.mm.ui.bl.c(getContext());
        }
        this.bottomBlurAreaHeight = f18;
        postInvalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        if (android.os.Build.VERSION.SDK_INT < 31 || !this.frostedEnabled || !canvas.isHardwareAccelerated()) {
            this.f278260n = null;
            this.f278261o = null;
            this.f278262p = null;
            super.dispatchDraw(canvas);
            return;
        }
        if (this.f278260n == null || this.f278261o == null || this.f278262p == null || getMeasuredWidth() != this.f278263q || getMeasuredHeight() != this.f278264r || this.topBlurAreaHeight != this.f278265s || this.bottomBlurAreaHeight != this.f278266t) {
            this.f278263q = getMeasuredWidth();
            this.f278264r = getMeasuredHeight();
            this.f278265s = this.topBlurAreaHeight;
            this.f278266t = this.bottomBlurAreaHeight;
            this.f278262p = new android.graphics.RenderNode("content");
            this.f278260n = new android.graphics.RenderNode("topBlur");
            this.f278261o = new android.graphics.RenderNode("bottomBlur");
        }
        android.graphics.RenderNode renderNode = this.f278262p;
        if (renderNode == null) {
            super.dispatchDraw(canvas);
            return;
        }
        android.graphics.RenderNode renderNode2 = this.f278260n;
        if (renderNode2 == null) {
            super.dispatchDraw(canvas);
            return;
        }
        android.graphics.RenderNode renderNode3 = this.f278261o;
        if (renderNode3 == null) {
            super.dispatchDraw(canvas);
            return;
        }
        renderNode.setPosition(0, 0, getMeasuredWidth(), getMeasuredHeight());
        android.graphics.RecordingCanvas beginRecording = renderNode.beginRecording();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(beginRecording, "beginRecording(...)");
        super.dispatchDraw(beginRecording);
        int measuredWidth = getMeasuredWidth();
        int i17 = this.topBlurAreaHeight;
        int measuredHeight = getMeasuredHeight() - this.bottomBlurAreaHeight;
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        beginRecording.save();
        beginRecording.clipRect(0, 0, measuredWidth, i17);
        beginRecording.drawColor(this.frostedColor);
        beginRecording.restore();
        beginRecording.save();
        beginRecording.clipRect(0, measuredHeight, measuredWidth2, measuredHeight2);
        beginRecording.drawColor(this.frostedColor);
        beginRecording.restore();
        renderNode.endRecording();
        canvas.drawRenderNode(renderNode);
        int i18 = this.blurRadius;
        if (i18 > 0) {
            if (this.topBlurAreaHeight > 0) {
                renderNode2.setRenderEffect(android.graphics.RenderEffect.createBlurEffect(i18, i18, android.graphics.Shader.TileMode.CLAMP));
                renderNode2.setPosition(0, 0, measuredWidth, i17);
                android.graphics.RecordingCanvas beginRecording2 = renderNode2.beginRecording();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(beginRecording2, "beginRecording(...)");
                float f17 = 0.0f - 0;
                beginRecording2.translate(f17, f17);
                beginRecording2.drawRenderNode(renderNode);
                renderNode2.endRecording();
                canvas.drawRenderNode(renderNode2);
            }
            if (this.bottomBlurAreaHeight > 0) {
                int i19 = this.blurRadius;
                renderNode3.setRenderEffect(android.graphics.RenderEffect.createBlurEffect(i19, i19, android.graphics.Shader.TileMode.CLAMP));
                renderNode3.setPosition(0, measuredHeight, measuredWidth2, measuredHeight2);
                android.graphics.RecordingCanvas beginRecording3 = renderNode3.beginRecording();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(beginRecording3, "beginRecording(...)");
                beginRecording3.translate(0.0f - 0, 0.0f - measuredHeight);
                beginRecording3.drawRenderNode(renderNode);
                renderNode3.endRecording();
                canvas.drawRenderNode(renderNode3);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.MotionEvent obtain = motionEvent != null && motionEvent.getAction() == 1 ? android.view.MotionEvent.obtain(motionEvent) : null;
        try {
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (dispatchTouchEvent) {
                if ((motionEvent != null && motionEvent.getAction() == 1) && obtain != null) {
                    try {
                        w04.l.INSTANCE.vc(540999748, obtain, getContext().getClass().getName());
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
            return dispatchTouchEvent;
        } finally {
            if (obtain != null) {
                obtain.recycle();
            }
        }
    }

    public final int getBlurRadius() {
        return this.blurRadius;
    }

    public final int getBottomBlurAreaHeight() {
        return this.bottomBlurAreaHeight;
    }

    public final int getFrostedColor() {
        return this.frostedColor;
    }

    public final boolean getFrostedEnabled() {
        return this.frostedEnabled;
    }

    public final int getTopBlurAreaHeight() {
        return this.topBlurAreaHeight;
    }

    @Override // com.p314xaae8f345.mm.ui.C21390x7d9495e3, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f278260n = null;
        this.f278261o = null;
        this.f278262p = null;
        super.onDetachedFromWindow();
    }

    /* renamed from: setBlurRadius */
    public final void m78415xc74465db(int i17) {
        this.blurRadius = i17;
    }

    /* renamed from: setBottomBlurAreaHeight */
    public final void m78416xf1fe9268(int i17) {
        this.bottomBlurAreaHeight = i17;
    }

    /* renamed from: setFrostedColor */
    public final void m78417x1bd78842(int i17) {
        this.frostedColor = i17;
    }

    /* renamed from: setFrostedEnabled */
    public final void m78418xeb8d2860(boolean z17) {
        if (this.frostedEnabled != z17) {
            if (!z17 || android.os.Build.VERSION.SDK_INT >= 31) {
                this.frostedEnabled = z17;
                if (!z17) {
                    this.f278260n = null;
                    this.f278261o = null;
                    this.f278262p = null;
                }
                postInvalidate();
            }
        }
    }

    /* renamed from: setTopBlurAreaHeight */
    public final void m78419x1b4d904e(int i17) {
        this.topBlurAreaHeight = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21369x9726cc7b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
