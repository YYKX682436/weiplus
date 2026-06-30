package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.p2107x3fc6a675;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B#\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0019J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/landingpage/component/view/panorama/PanoramaContainerView;", "Landroid/widget/FrameLayout;", "Landroid/hardware/SensorEventListener;", "", "imageWidth", "Ljz5/f0;", "setImageCenterToViewport", "Landroid/graphics/Bitmap;", "bmp", "setImageBitmap", "", "q", "Z", "getShouldResponseTouchEvent", "()Z", "setShouldResponseTouchEvent", "(Z)V", "shouldResponseTouchEvent", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView */
/* loaded from: classes8.dex */
public final class C17739x2ed29231 extends android.widget.FrameLayout implements android.hardware.SensorEventListener {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f244567d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ProgressBar f244568e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.HorizontalScrollView f244569f;

    /* renamed from: g, reason: collision with root package name */
    public int f244570g;

    /* renamed from: h, reason: collision with root package name */
    public int f244571h;

    /* renamed from: i, reason: collision with root package name */
    public final android.hardware.SensorManager f244572i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f244573m;

    /* renamed from: n, reason: collision with root package name */
    public float[] f244574n;

    /* renamed from: o, reason: collision with root package name */
    public float[] f244575o;

    /* renamed from: p, reason: collision with root package name */
    public int f244576p;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public boolean shouldResponseTouchEvent;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17739x2ed29231(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public static final /* synthetic */ void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.p2107x3fc6a675.C17739x2ed29231 c17739x2ed29231, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setImageCenterToViewport", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        c17739x2ed29231.m69434x2ef41eaf(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setImageCenterToViewport", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
    }

    /* renamed from: setImageCenterToViewport */
    private final void m69434x2ef41eaf(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImageCenterToViewport", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        android.widget.HorizontalScrollView horizontalScrollView = this.f244569f;
        if (horizontalScrollView == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageCenterToViewport", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
            return;
        }
        int i18 = this.f244571h;
        if (i17 > i18) {
            int i19 = (i17 - i18) / 2;
            this.f244576p = i19;
            horizontalScrollView.scrollBy(i19, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageCenterToViewport", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
    }

    public final void b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showLoadingProgress", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        android.widget.ProgressBar progressBar = this.f244568e;
        if (progressBar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showLoadingProgress", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
            return;
        }
        if (z17) {
            progressBar.setVisibility(0);
        } else {
            progressBar.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showLoadingProgress", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
    }

    /* renamed from: getShouldResponseTouchEvent */
    public final boolean m69435xd0952245() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShouldResponseTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        boolean z17 = this.shouldResponseTouchEvent;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShouldResponseTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        return z17;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAccuracyChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.PanoramaView", "the onAccuracyChanged is called, accuracy is " + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAccuracyChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinishInflate", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        super.onFinishInflate();
        this.f244569f = (android.widget.HorizontalScrollView) findViewById(com.p314xaae8f345.mm.R.id.n5c);
        this.f244567d = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.n5a);
        this.f244568e = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.n5b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinishInflate", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        boolean onInterceptTouchEvent = this.shouldResponseTouchEvent ? super.onInterceptTouchEvent(motionEvent) : true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        return onInterceptTouchEvent;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        float[] fArr;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSensorChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        android.widget.HorizontalScrollView horizontalScrollView = this.f244569f;
        if (horizontalScrollView == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSensorChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
            return;
        }
        if ((sensorEvent != null ? sensorEvent.sensor : null) != null) {
            if ((sensorEvent != null ? sensorEvent.values : null) != null) {
                if (sensorEvent.sensor.getType() == 1) {
                    this.f244574n = sensorEvent.values;
                }
                if (sensorEvent.sensor.getType() == 2) {
                    this.f244575o = sensorEvent.values;
                }
                float[] fArr2 = this.f244574n;
                if (fArr2 != null && (fArr = this.f244575o) != null) {
                    float[] fArr3 = new float[9];
                    if (android.hardware.SensorManager.getRotationMatrix(fArr3, new float[9], fArr2, fArr)) {
                        float[] fArr4 = new float[3];
                        android.hardware.SensorManager.getOrientation(fArr3, fArr4);
                        float f17 = fArr4[2];
                        if (this.f244576p != 0) {
                            horizontalScrollView.scrollBy((int) java.lang.Math.rint((this.f244576p * (java.lang.Float.min(java.lang.Math.abs(f17), 10.0f) * java.lang.Math.signum(f17))) / 10.0f), 0);
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSensorChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSensorChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
    }

    /* renamed from: setImageBitmap */
    public final void m69436xd44890a8(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImageBitmap", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        android.widget.ImageView imageView = this.f244567d;
        if (imageView == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageBitmap", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
            return;
        }
        int i17 = this.f244570g;
        jz5.f0 f0Var = null;
        if (bitmap == null) {
            imageView.setImageBitmap(null);
        } else {
            imageView.setImageBitmap(bitmap);
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            f0Var2.f391649d = bitmap.getWidth();
            if (i17 > 0 && bitmap.getHeight() > 0 && bitmap.getHeight() != i17) {
                int ceil = (int) java.lang.Math.ceil(((bitmap.getWidth() * i17) * 1.0f) / bitmap.getHeight());
                android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = i17;
                    layoutParams.width = ceil;
                    imageView.requestLayout();
                    f0Var = jz5.f0.f384359a;
                }
                if (f0Var == null) {
                    imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(ceil, i17));
                }
                f0Var2.f391649d = ceil;
            }
            imageView.addOnLayoutChangeListener(new j54.a(f0Var2, imageView, this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageBitmap", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
    }

    /* renamed from: setShouldResponseTouchEvent */
    public final void m69437x8061eb51(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShouldResponseTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
        this.shouldResponseTouchEvent = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShouldResponseTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17739x2ed29231(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.shouldResponseTouchEvent = true;
        java.lang.Object systemService = context.getSystemService("sensor");
        this.f244572i = systemService instanceof android.hardware.SensorManager ? (android.hardware.SensorManager) systemService : null;
    }
}
