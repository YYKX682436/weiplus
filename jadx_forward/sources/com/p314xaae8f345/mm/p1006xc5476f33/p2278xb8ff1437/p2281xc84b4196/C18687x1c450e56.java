package com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2281xc84b4196;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-B#\b\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\u0006\u0010.\u001a\u00020\r¢\u0006\u0004\b,\u0010/J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016R\"\u0010\u001c\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010'\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00060"}, d2 = {"Lcom/tencent/mm/plugin/thumbplayer/render/MMTextureViewRender;", "Landroid/view/TextureView;", "Lmk4/b;", "", "getTagPrefix", "Landroid/view/Surface;", "getSurface", "tag", "Ljz5/f0;", "setTagPrefix", "Lmk4/a;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "setSurfaceListener", "", "type", "setScaleType", "getScaleType", "Landroid/graphics/Rect;", "cropRect", "setCropRect", "", "isOpaque", "setOpaqueInfo", "getVideoWidth", "getVideoHeight", "getLogTag", "h", "Z", "isPreloadMode", "()Z", "setPreloadMode", "(Z)V", "value", "i", "I", "getVideoDegree", "()I", "setVideoDegree", "(I)V", "videoDegree", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "thumbplayer-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.thumbplayer.render.MMTextureViewRender */
/* loaded from: classes14.dex */
public final class C18687x1c450e56 extends android.view.TextureView implements mk4.b {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f256037d;

    /* renamed from: e, reason: collision with root package name */
    public mk4.a f256038e;

    /* renamed from: f, reason: collision with root package name */
    public int f256039f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Rect f256040g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean isPreloadMode;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int videoDegree;

    /* renamed from: m, reason: collision with root package name */
    public int f256043m;

    /* renamed from: n, reason: collision with root package name */
    public int f256044n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18687x1c450e56(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f256037d = "PREFIX";
        this.f256040g = new android.graphics.Rect();
        setSurfaceTextureListener(new mk4.i(this));
    }

    /* renamed from: getTagPrefix, reason: from getter */
    private final java.lang.String getF256037d() {
        return this.f256037d;
    }

    @Override // mk4.b
    public void a(int i17, int i18) {
        if (this.f256043m == i17 && this.f256044n == i18) {
            this.f256043m = i17;
            this.f256044n = i18;
        } else {
            this.f256043m = i17;
            this.f256044n = i18;
            requestLayout();
        }
    }

    public final void b(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m71933x23aed0ac(), "centerCrop, container:[" + i17 + ", " + i18 + ']');
        float f17 = ((float) i17) / ((float) this.f256043m);
        float f18 = ((float) i18) / ((float) this.f256044n);
        float max = java.lang.Math.max(f17, f18);
        float f19 = max / f17;
        float f27 = max / f18;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(f19, f27, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m71933x23aed0ac(), "centerCrop sx:" + f19 + " sy:" + f27 + " px:" + (getMeasuredWidth() / 2.0f) + " py:" + (getMeasuredHeight() / 2.0f) + " matrix:" + matrix);
        setTransform(matrix);
    }

    /* renamed from: getLogTag */
    public java.lang.String m71933x23aed0ac() {
        return getF256037d() + "_MMTextureViewRender";
    }

    @Override // mk4.b
    /* renamed from: getScaleType, reason: from getter */
    public int getF256039f() {
        return this.f256039f;
    }

    @Override // mk4.b
    /* renamed from: getSurface */
    public android.view.Surface mo71919xcf572877() {
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

    @Override // mk4.b
    /* renamed from: getVideoHeight, reason: from getter */
    public int getF256044n() {
        return this.f256044n;
    }

    @Override // mk4.b
    /* renamed from: getVideoWidth, reason: from getter */
    public int getF256043m() {
        return this.f256043m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0170, code lost:
    
        if ((getScaleY() == 1.0f) == false) goto L47;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2281xc84b4196.C18687x1c450e56.onMeasure(int, int):void");
    }

    @Override // mk4.b
    /* renamed from: reset */
    public void mo71924x6761d4f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m71933x23aed0ac(), "reset cropRect=" + this.f256040g);
        this.f256040g = new android.graphics.Rect();
    }

    @Override // mk4.b
    /* renamed from: setCropRect */
    public void mo71925xf4e85f16(android.graphics.Rect cropRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cropRect, "cropRect");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m71933x23aed0ac(), "setCropRect, cropRect:" + cropRect);
        this.f256040g = cropRect;
    }

    @Override // mk4.b
    /* renamed from: setOpaqueInfo */
    public void mo71926x6978ea71(boolean z17) {
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

    /* renamed from: setPreloadMode */
    public final void m71935x49fca98a(boolean z17) {
        this.isPreloadMode = z17;
    }

    @Override // mk4.b
    /* renamed from: setScaleType */
    public void mo71927xebd28962(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m71933x23aed0ac(), "setScaleType type:" + i17);
        this.f256039f = i17;
    }

    @Override // mk4.b
    /* renamed from: setSurfaceListener */
    public void mo71928xb06c83bf(mk4.a listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f256038e = listener;
    }

    @Override // mk4.b
    /* renamed from: setTagPrefix */
    public void mo71930xbeb0f48a(java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        this.f256037d = tag;
    }

    /* renamed from: setVideoDegree */
    public final void m71936x93f4a165(int i17) {
        this.videoDegree = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m71933x23aed0ac(), "setVideoDegree, videoDegree:" + this.videoDegree);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18687x1c450e56(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f256037d = "PREFIX";
        this.f256040g = new android.graphics.Rect();
        setSurfaceTextureListener(new mk4.i(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18687x1c450e56(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f256037d = "PREFIX";
        this.f256040g = new android.graphics.Rect();
        setSurfaceTextureListener(new mk4.i(this));
    }
}
