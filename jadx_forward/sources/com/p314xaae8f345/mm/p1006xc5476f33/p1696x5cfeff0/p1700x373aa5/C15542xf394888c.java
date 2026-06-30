package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5;

/* renamed from: com.tencent.mm.plugin.flash.view.FaceReflectMask */
/* loaded from: classes14.dex */
public class C15542xf394888c extends com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.ui.C27951x55de44ec {

    /* renamed from: q, reason: collision with root package name */
    public static final int f218809q = i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f218810d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f218811e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.ColorMatrixColorFilter f218812f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.PorterDuffXfermode f218813g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f218814h;

    /* renamed from: i, reason: collision with root package name */
    public float f218815i;

    /* renamed from: m, reason: collision with root package name */
    public yz2.d f218816m;

    /* renamed from: n, reason: collision with root package name */
    public float f218817n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f218818o;

    /* renamed from: p, reason: collision with root package name */
    public float f218819p;

    public C15542xf394888c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f218814h = new android.graphics.Rect();
        this.f218815i = 0.0f;
        this.f218817n = 0.0f;
        this.f218819p = 0.0f;
        setLayerType(1, null);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f218810d = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f218811e = paint2;
        paint2.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.f218818o = paint3;
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        paint3.setStrokeWidth(f218809q);
        paint3.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        setWillNotDraw(false);
        this.f218813g = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR);
    }

    /* renamed from: getCircleMarginY */
    public float m63495x618bdc5() {
        return this.f218819p;
    }

    /* renamed from: getCircleY */
    public float m63496x6c781953() {
        return this.f218815i;
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.ui.C27951x55de44ec, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        canvas.save();
        float min = java.lang.Math.min(getWidth(), getHeight()) * 0.27f;
        float width = (float) (getWidth() * 0.5d);
        float f17 = this.f218819p;
        if (f17 != 0.0f) {
            this.f218815i = f17 + min;
        } else {
            this.f218815i = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561929wr) + min;
        }
        android.graphics.Rect rect = this.f218814h;
        rect.left = 0;
        rect.right = getWidth();
        rect.top = 0;
        rect.bottom = getHeight();
        android.graphics.Paint paint = this.f218810d;
        paint.setColor(-1);
        android.graphics.ColorMatrixColorFilter colorMatrixColorFilter = this.f218812f;
        if (colorMatrixColorFilter != null) {
            paint.setColorFilter(colorMatrixColorFilter);
        }
        canvas.drawARGB(255, 0, 0, 0);
        canvas.drawRect(rect, paint);
        setAlpha(0.998f);
        android.graphics.Paint paint2 = this.f218811e;
        paint2.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint2.setXfermode(this.f218813g);
        canvas.drawCircle(width, this.f218815i, min, paint2);
        float f18 = this.f218817n * 360.0f;
        int i17 = f218809q;
        float f19 = this.f218815i;
        canvas.drawArc((width - min) + (i17 >> 1), (i17 >> 1) + (f19 - min), (width + min) - (i17 >> 1), (f19 + min) - (i17 >> 1), -90.0f, f18, false, this.f218818o);
        canvas.restore();
        yz2.d dVar = this.f218816m;
        if (dVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.t) dVar;
            tVar.getClass();
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809.f218596l1;
            tVar.f218714a.e();
            this.f218816m = null;
        }
    }

    /* renamed from: setCallback */
    public void m63497x6c4ebec7(yz2.d dVar) {
        this.f218816m = dVar;
    }

    /* renamed from: setCircleMarginY */
    public void m63498x98ef2439(float f17) {
        this.f218819p = f17;
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.ui.C27951x55de44ec
    /* renamed from: setColorMatrixColorFilter */
    public void mo63489x83f16419(android.graphics.ColorMatrixColorFilter colorMatrixColorFilter) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectMask", "setColorMatrixColorFilter");
        this.f218812f = colorMatrixColorFilter;
        postInvalidate();
    }

    /* renamed from: setProgress */
    public void m63499x3ae760af(float f17) {
        if (f17 <= 0.0f) {
            this.f218817n = 0.0f;
        } else if (f17 <= 1.0f) {
            this.f218817n = f17;
        } else if (f17 > 1.05d) {
            return;
        } else {
            this.f218817n = 1.0f;
        }
        postInvalidate();
    }
}
