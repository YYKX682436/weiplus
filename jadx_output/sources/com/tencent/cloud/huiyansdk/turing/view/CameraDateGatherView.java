package com.tencent.cloud.huiyansdk.turing.view;

/* loaded from: classes14.dex */
public class CameraDateGatherView extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback, oc.a {

    /* renamed from: d, reason: collision with root package name */
    public int f45927d;

    /* renamed from: e, reason: collision with root package name */
    public int f45928e;

    /* renamed from: f, reason: collision with root package name */
    public int f45929f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Point f45930g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Path f45931h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.SurfaceHolder f45932i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.cloud.aicamare.CameraHolder f45933m;

    public CameraDateGatherView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            canvas.clipPath(this.f45931h);
        } else {
            canvas.clipPath(this.f45931h, android.graphics.Region.Op.REPLACE);
        }
        super.draw(canvas);
    }

    public int getViewHeight() {
        return this.f45928e;
    }

    public int getViewWidth() {
        return this.f45927d;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.f45927d = android.view.View.MeasureSpec.getSize(i17);
        int size = android.view.View.MeasureSpec.getSize(i18);
        this.f45928e = size;
        android.graphics.Point point = this.f45930g;
        int i19 = this.f45927d >> 1;
        point.x = i19;
        int i27 = size >> 1;
        point.y = i27;
        if (i19 > i27) {
            i19 = i27;
        }
        this.f45929f = i19;
        this.f45931h.reset();
        android.graphics.Path path = this.f45931h;
        android.graphics.Point point2 = this.f45930g;
        path.addCircle(point2.x, point2.y, this.f45929f, android.graphics.Path.Direction.CCW);
        this.f45929f -= java.lang.Math.round(getResources().getDisplayMetrics().density * 1.9f);
        setMeasuredDimension(this.f45927d, this.f45928e);
    }

    @Override // oc.a
    public void setCameraHolder(com.tencent.cloud.aicamare.CameraHolder cameraHolder) {
        this.f45933m = cameraHolder;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        this.f45932i = surfaceHolder;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
    }

    public CameraDateGatherView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.view.SurfaceHolder holder = getHolder();
        this.f45932i = holder;
        holder.addCallback(this);
        this.f45930g = new android.graphics.Point();
        this.f45931h = new android.graphics.Path();
    }
}
