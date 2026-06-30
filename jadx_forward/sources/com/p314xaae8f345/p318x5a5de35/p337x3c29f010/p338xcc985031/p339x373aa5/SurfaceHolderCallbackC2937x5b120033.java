package com.p314xaae8f345.p318x5a5de35.p337x3c29f010.p338xcc985031.p339x373aa5;

/* renamed from: com.tencent.cloud.huiyansdk.turing.view.CameraDateGatherView */
/* loaded from: classes14.dex */
public class SurfaceHolderCallbackC2937x5b120033 extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback, oc.a {

    /* renamed from: d, reason: collision with root package name */
    public int f127460d;

    /* renamed from: e, reason: collision with root package name */
    public int f127461e;

    /* renamed from: f, reason: collision with root package name */
    public int f127462f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Point f127463g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Path f127464h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.SurfaceHolder f127465i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.C2888xbf192151 f127466m;

    public SurfaceHolderCallbackC2937x5b120033(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            canvas.clipPath(this.f127464h);
        } else {
            canvas.clipPath(this.f127464h, android.graphics.Region.Op.REPLACE);
        }
        super.draw(canvas);
    }

    /* renamed from: getViewHeight */
    public int m21969x6ba62022() {
        return this.f127461e;
    }

    /* renamed from: getViewWidth */
    public int m21970xa135536b() {
        return this.f127460d;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.f127460d = android.view.View.MeasureSpec.getSize(i17);
        int size = android.view.View.MeasureSpec.getSize(i18);
        this.f127461e = size;
        android.graphics.Point point = this.f127463g;
        int i19 = this.f127460d >> 1;
        point.x = i19;
        int i27 = size >> 1;
        point.y = i27;
        if (i19 > i27) {
            i19 = i27;
        }
        this.f127462f = i19;
        this.f127464h.reset();
        android.graphics.Path path = this.f127464h;
        android.graphics.Point point2 = this.f127463g;
        path.addCircle(point2.x, point2.y, this.f127462f, android.graphics.Path.Direction.CCW);
        this.f127462f -= java.lang.Math.round(getResources().getDisplayMetrics().density * 1.9f);
        setMeasuredDimension(this.f127460d, this.f127461e);
    }

    @Override // oc.a
    /* renamed from: setCameraHolder */
    public void mo21971x4c895ab3(com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.C2888xbf192151 c2888xbf192151) {
        this.f127466m = c2888xbf192151;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        this.f127465i = surfaceHolder;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
    }

    public SurfaceHolderCallbackC2937x5b120033(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.view.SurfaceHolder holder = getHolder();
        this.f127465i = holder;
        holder.addCallback(this);
        this.f127463g = new android.graphics.Point();
        this.f127464h = new android.graphics.Path();
    }
}
