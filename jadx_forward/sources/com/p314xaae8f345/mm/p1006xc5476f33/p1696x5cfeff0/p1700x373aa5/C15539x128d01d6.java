package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5;

/* renamed from: com.tencent.mm.plugin.flash.view.FaceFlashReflectMask */
/* loaded from: classes14.dex */
public class C15539x128d01d6 extends com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.ui.C27951x55de44ec {

    /* renamed from: q, reason: collision with root package name */
    public static float f218789q = 0.386f;

    /* renamed from: r, reason: collision with root package name */
    public static final int f218790r = i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f218791d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f218792e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.ColorMatrixColorFilter f218793f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.PorterDuffXfermode f218794g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f218795h;

    /* renamed from: i, reason: collision with root package name */
    public float f218796i;

    /* renamed from: m, reason: collision with root package name */
    public yz2.a f218797m;

    /* renamed from: n, reason: collision with root package name */
    public float f218798n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f218799o;

    /* renamed from: p, reason: collision with root package name */
    public float f218800p;

    public C15539x128d01d6(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f218795h = new android.graphics.Rect();
        this.f218796i = 0.0f;
        this.f218798n = 0.0f;
        this.f218800p = 0.0f;
        setLayerType(1, null);
        float Di = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.d0.clicfg_face_flash_preview_ratio, 0.386f);
        if (Di > 0.1d) {
            f218789q = Di;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectMask", "FACE_FLASH_CIRCLE_RADIUS set value:%f", java.lang.Float.valueOf(Di));
        }
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f218791d = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f218792e = paint2;
        paint2.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.f218799o = paint3;
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        paint3.setStrokeWidth(f218790r);
        paint3.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        setWillNotDraw(false);
        this.f218794g = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR);
    }

    /* renamed from: getCircleMarginY */
    public float m63485x618bdc5() {
        return this.f218800p;
    }

    /* renamed from: getCircleY */
    public float m63486x6c781953() {
        return this.f218796i;
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.ui.C27951x55de44ec, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        canvas.save();
        float min = java.lang.Math.min(getWidth(), getHeight()) * f218789q;
        float width = (float) (getWidth() * 0.5d);
        float f17 = this.f218800p;
        if (f17 != 0.0f) {
            this.f218796i = f17 + min;
        } else {
            this.f218796i = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561929wr) + min;
        }
        android.graphics.Rect rect = this.f218795h;
        rect.left = 0;
        rect.right = getWidth();
        rect.top = 0;
        rect.bottom = getHeight();
        android.graphics.Paint paint = this.f218791d;
        paint.setColor(-1);
        android.graphics.ColorMatrixColorFilter colorMatrixColorFilter = this.f218793f;
        if (colorMatrixColorFilter != null) {
            paint.setColorFilter(colorMatrixColorFilter);
        }
        canvas.drawARGB(255, 0, 0, 0);
        canvas.drawRect(rect, paint);
        setAlpha(0.998f);
        android.graphics.Paint paint2 = this.f218792e;
        paint2.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint2.setXfermode(this.f218794g);
        canvas.drawCircle(width, this.f218796i, min, paint2);
        float f18 = this.f218798n * 360.0f;
        int i17 = f218790r;
        float f19 = this.f218796i;
        canvas.drawArc((width - min) + (i17 >> 1), (i17 >> 1) + (f19 - min), (width + min) - (i17 >> 1), (f19 + min) - (i17 >> 1), -90.0f, f18, false, this.f218799o);
        canvas.restore();
        yz2.a aVar = this.f218797m;
        if (aVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.g gVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.g) aVar;
            gVar.getClass();
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f.P;
            gVar.f218752a.d();
            this.f218797m = null;
        }
    }

    /* renamed from: setCallback */
    public void m63487x6c4ebec7(yz2.a aVar) {
        this.f218797m = aVar;
    }

    /* renamed from: setCircleMarginY */
    public void m63488x98ef2439(float f17) {
        this.f218800p = f17;
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.ui.C27951x55de44ec
    /* renamed from: setColorMatrixColorFilter */
    public void mo63489x83f16419(android.graphics.ColorMatrixColorFilter colorMatrixColorFilter) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectMask", "setColorMatrixColorFilter");
        this.f218793f = colorMatrixColorFilter;
        postInvalidate();
    }

    /* renamed from: setProgress */
    public void m63490x3ae760af(float f17) {
        if (f17 <= 0.0f) {
            this.f218798n = 0.0f;
        } else if (f17 <= 1.0f) {
            this.f218798n = f17;
        } else if (f17 > 1.05d) {
            return;
        } else {
            this.f218798n = 1.0f;
        }
        postInvalidate();
    }
}
