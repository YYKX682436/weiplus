package com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B%\b\u0016\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0018J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/thumbplayer/view/MMThumbPlayerTextureView;", "Lcom/tencent/mm/plugin/thumbplayer/view/MMTextureView;", "Lpk4/b;", "Landroid/graphics/Rect;", "cropRect", "Ljz5/f0;", "setCropRect", "", "scaleType", "setScaleType", "getScaleType", "", "isOpaque", "setOpaqueInfo", "Landroid/view/TextureView$SurfaceTextureListener;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "setTextureListenerCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-thumbplayer_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView */
/* loaded from: classes14.dex */
public final class C18693x84c11749 extends com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18692xd171d8a0 implements pk4.b {

    /* renamed from: h, reason: collision with root package name */
    public int f256089h;

    /* renamed from: i, reason: collision with root package name */
    public int f256090i;

    /* renamed from: m, reason: collision with root package name */
    public int f256091m;

    /* renamed from: n, reason: collision with root package name */
    public float f256092n;

    /* renamed from: o, reason: collision with root package name */
    public float f256093o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Rect f256094p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.TextureView.SurfaceTextureListener f256095q;

    /* renamed from: r, reason: collision with root package name */
    public final pk4.s f256096r;

    public C18693x84c11749(android.content.Context context) {
        super(context);
        this.f256094p = new android.graphics.Rect();
        this.f256096r = new pk4.s(this);
        l();
    }

    @Override // pk4.b
    /* renamed from: getScaleType, reason: from getter */
    public int getF256089h() {
        return this.f256089h;
    }

    public final void k(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TP.MMThumbPlayerTextureView", "centerCrop, container:[" + i17 + ", " + i18 + ']');
        float f17 = (float) i17;
        float f18 = f17 / ((float) this.f256090i);
        float f19 = (float) i18;
        float f27 = f19 / ((float) this.f256091m);
        float max = java.lang.Math.max(f18, f27);
        float f28 = max / f18;
        float f29 = max / f27;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(f28, f29, f17 / 2.0f, f19 / 2.0f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TP.MMThumbPlayerTextureView", "centerCrop matrix:" + matrix);
        setTransform(matrix);
    }

    public final void l() {
        setOpaque(false);
        setAlpha(0.0f);
        setScaleX(1.0001f);
        setScaleY(1.0001f);
        setSurfaceTextureListener(this.f256096r);
    }

    public void m(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TP.MMThumbPlayerTextureView", "setVideoWidthAndHeight videoWidth:" + this.f256090i + ", videoHeight:" + this.f256091m + ", width:" + i17 + ", height:" + i18 + " scaleType:" + this.f256089h);
        if (this.f256090i == i17 && this.f256091m == i18) {
            this.f256090i = i17;
            this.f256091m = i18;
        } else {
            this.f256090i = i17;
            this.f256091m = i18;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f256090i == 0 || this.f256091m == 0) {
            setMeasuredDimension(1, 1);
            return;
        }
        int defaultSize = android.view.View.getDefaultSize(1, i17);
        int defaultSize2 = android.view.View.getDefaultSize(1, i18);
        int i19 = this.f256090i;
        int i27 = this.f256091m;
        float f17 = defaultSize;
        float f18 = defaultSize2;
        int i28 = this.f256089h;
        if (i28 == 0) {
            k(defaultSize, defaultSize2);
        } else if (i28 == 1) {
            float f19 = f17 / i19;
            float f27 = f18 / i27;
            float min = java.lang.Math.min(f19, f27);
            float f28 = min / f19;
            float f29 = min / f27;
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.setScale(f28, f29, f17 / 2.0f, f18 / 2.0f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TP.MMThumbPlayerTextureView", "centerFit, container:[" + defaultSize + ", " + defaultSize2 + "] matrix:" + matrix);
            setTransform(matrix);
        } else if (i28 != 3) {
            setTransform(new android.graphics.Matrix());
        } else if (this.f256094p.isEmpty()) {
            k(defaultSize, defaultSize2);
        } else {
            android.graphics.Rect rect = this.f256094p;
            if (!(this.f256092n == 0.0f)) {
                if (!(this.f256093o == 0.0f) && !rect.isEmpty()) {
                    float f37 = f17 / this.f256092n;
                    float f38 = f18 / this.f256093o;
                    float max = java.lang.Math.max(f37, f38);
                    float centerX = ((this.f256092n / 2.0f) - rect.centerX()) * (f17 / rect.width());
                    float centerY = ((this.f256093o / 2.0f) - rect.centerY()) * (f18 / rect.height());
                    android.graphics.Matrix matrix2 = new android.graphics.Matrix();
                    matrix2.setScale(max / f37, max / f38, f17 / 2.0f, f18 / 2.0f);
                    matrix2.postTranslate(centerX, centerY);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TP.MMThumbPlayerTextureView", "cropRect(), containerWidth:" + defaultSize + " containerHeight:" + defaultSize2 + ' ' + matrix2);
                    setTransform(matrix2);
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TP.MMThumbPlayerTextureView", "onMeasure#handleOnMeasureLikeMM video size[" + this.f256090i + ' ' + this.f256091m + "] spec[" + android.view.View.getDefaultSize(1, i17) + ", " + android.view.View.getDefaultSize(1, i18) + "] result=" + defaultSize + ',' + defaultSize2);
    }

    @Override // pk4.b
    /* renamed from: setCropRect */
    public void mo71997xf4e85f16(android.graphics.Rect cropRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cropRect, "cropRect");
        this.f256094p = cropRect;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TP.MMThumbPlayerTextureView", "setCropRect, cropRect:" + cropRect);
    }

    @Override // pk4.b
    /* renamed from: setOpaqueInfo */
    public void mo71998x6978ea71(boolean z17) {
        if (z17) {
            setOpaque(true);
            setAlpha(1.0f);
        } else {
            setOpaque(false);
            setAlpha(0.0f);
        }
    }

    @Override // pk4.b
    /* renamed from: setScaleType */
    public void mo71999xebd28962(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TP.MMThumbPlayerTextureView", "setScaleType, scaleType:" + i17);
        this.f256089h = i17;
    }

    @Override // pk4.b
    /* renamed from: setTextureListenerCallback */
    public void mo72000x90002592(android.view.TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f256095q = surfaceTextureListener;
    }

    public C18693x84c11749(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f256094p = new android.graphics.Rect();
        this.f256096r = new pk4.s(this);
        l();
    }

    public C18693x84c11749(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f256094p = new android.graphics.Rect();
        this.f256096r = new pk4.s(this);
        l();
    }
}
