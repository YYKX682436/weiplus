package com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"B#\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010#\u001a\u00020\t¢\u0006\u0004\b!\u0010$J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R*\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006%"}, d2 = {"Lcom/tencent/mm/plugin/mmplayer/render/MMTextureViewRender;", "Landroid/view/TextureView;", "Lvh3/b;", "Landroid/view/Surface;", "getSurface", "Lvh3/a;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "Ljz5/f0;", "setSurfaceListener", "", "type", "setScaleType", "getScaleType", "Landroid/graphics/Rect;", "cropRect", "setCropRect", "", "isOpaque", "setOpaqueInfo", "", "getLogTag", "value", "h", "I", "getVideoDegree", "()I", "setVideoDegree", "(I)V", "videoDegree", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "thumbplayer-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender */
/* loaded from: classes14.dex */
public final class C16526x1c450e56 extends android.view.TextureView implements vh3.b {

    /* renamed from: d, reason: collision with root package name */
    public rh3.p f230330d;

    /* renamed from: e, reason: collision with root package name */
    public vh3.a f230331e;

    /* renamed from: f, reason: collision with root package name */
    public int f230332f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Rect f230333g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int videoDegree;

    /* renamed from: i, reason: collision with root package name */
    public int f230335i;

    /* renamed from: m, reason: collision with root package name */
    public int f230336m;

    /* renamed from: n, reason: collision with root package name */
    public int f230337n;

    /* renamed from: o, reason: collision with root package name */
    public int f230338o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16526x1c450e56(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f230333g = new android.graphics.Rect();
        setSurfaceTextureListener(new vh3.e(this));
    }

    @Override // vh3.b
    public void a(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m66769x23aed0ac(), "setVideoWidthAndHeight videoWidth:" + this.f230335i + ", videoHeight:" + this.f230336m + ", width:" + i17 + ", height:" + i18 + " scaleType:" + this.f230332f);
        if (this.f230335i == i17 && this.f230336m == i18) {
            this.f230335i = i17;
            this.f230336m = i18;
        } else {
            this.f230335i = i17;
            this.f230336m = i18;
            requestLayout();
        }
    }

    @Override // vh3.b
    public void b(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m66769x23aed0ac(), "setOriginVideoWidthAndHeight videoWidth:" + this.f230335i + ", videoHeight:" + this.f230336m + ", width:" + i17 + ", height:" + i18 + " scaleType:" + this.f230332f);
        this.f230337n = i17;
        this.f230338o = i18;
    }

    public final void c(int i17, int i18) {
        float f17 = i17 / this.f230335i;
        float f18 = i18 / this.f230336m;
        float max = java.lang.Math.max(f17, f18);
        float f19 = max / f17;
        float f27 = max / f18;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(f19, f27, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m66769x23aed0ac(), "centerCrop container[" + i17 + ' ' + i18 + "] video[" + this.f230335i + ' ' + this.f230336m + "] matrix:" + matrix);
        setTransform(matrix);
    }

    @Override // vh3.b
    public void d(rh3.p onePlayContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onePlayContext, "onePlayContext");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m66769x23aed0ac(), "attach onePlayContext:" + onePlayContext);
        this.f230330d = onePlayContext;
    }

    /* renamed from: getLogTag */
    public java.lang.String m66769x23aed0ac() {
        java.lang.String f17;
        rh3.p pVar = this.f230330d;
        return (pVar == null || (f17 = ((rh3.q) pVar).f("MMTextureViewRender")) == null) ? "MMTextureViewRender" : f17;
    }

    /* renamed from: getScaleType, reason: from getter */
    public int getF230332f() {
        return this.f230332f;
    }

    /* renamed from: getSurface */
    public android.view.Surface m66771xcf572877() {
        if (getSurfaceTexture() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMTextureViewRender", "getSurface return for null");
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT > 26) {
            android.graphics.SurfaceTexture surfaceTexture = getSurfaceTexture();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(surfaceTexture);
            if (surfaceTexture.isReleased()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMTextureViewRender", "getSurface return for Released");
                return null;
            }
        }
        return new android.view.Surface(getSurfaceTexture());
    }

    public final int getVideoDegree() {
        return this.videoDegree;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0159, code lost:
    
        if ((getScaleY() == 1.0f) == false) goto L39;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16526x1c450e56.onMeasure(int, int):void");
    }

    @Override // vh3.b
    /* renamed from: setCropRect */
    public void mo66763xf4e85f16(android.graphics.Rect cropRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cropRect, "cropRect");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m66769x23aed0ac(), "setCropRect, cropRect:" + cropRect);
        this.f230333g = cropRect;
    }

    @Override // vh3.b
    /* renamed from: setOpaqueInfo */
    public void mo66764x6978ea71(boolean z17) {
        float f17;
        if (z17) {
            setOpaque(true);
            f17 = 1.0f;
        } else {
            setOpaque(false);
            f17 = 0.0f;
        }
        setAlpha(f17);
    }

    @Override // vh3.b
    /* renamed from: setScaleType */
    public void mo66765xebd28962(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m66769x23aed0ac(), "setScaleType type:" + i17);
        this.f230332f = i17;
    }

    @Override // vh3.b
    /* renamed from: setSurfaceListener */
    public void mo66766xb06c83bf(vh3.a listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f230331e = listener;
    }

    /* renamed from: setVideoDegree */
    public final void m66773x93f4a165(int i17) {
        this.videoDegree = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m66769x23aed0ac(), "setVideoDegree, videoDegree:" + this.videoDegree);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16526x1c450e56(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f230333g = new android.graphics.Rect();
        setSurfaceTextureListener(new vh3.e(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16526x1c450e56(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f230333g = new android.graphics.Rect();
        setSurfaceTextureListener(new vh3.e(this));
    }
}
