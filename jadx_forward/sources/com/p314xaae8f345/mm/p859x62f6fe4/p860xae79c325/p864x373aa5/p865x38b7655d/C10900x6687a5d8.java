package com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d;

/* renamed from: com.tencent.mm.media.camera.view.control.CameraFocusView */
/* loaded from: classes4.dex */
public class C10900x6687a5d8 extends android.view.View implements cs0.i {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f150434d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f150435e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f150436f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f150437g;

    /* renamed from: h, reason: collision with root package name */
    public long f150438h;

    /* renamed from: i, reason: collision with root package name */
    public int f150439i;

    /* renamed from: m, reason: collision with root package name */
    public int f150440m;

    /* renamed from: n, reason: collision with root package name */
    public int f150441n;

    /* renamed from: o, reason: collision with root package name */
    public int f150442o;

    /* renamed from: p, reason: collision with root package name */
    public int f150443p;

    /* renamed from: q, reason: collision with root package name */
    public int f150444q;

    public C10900x6687a5d8(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f150434d = new android.graphics.Paint();
        this.f150435e = false;
        this.f150436f = false;
        this.f150437g = false;
        this.f150438h = 0L;
        this.f150439i = -12206054;
    }

    @Override // cs0.i
    public void a(float f17, float f18, boolean z17) {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CameraFrontSightView", "LayoutParams is not MarginLayoutParams! use doAimation()");
            return;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = ((int) f17) - (this.f150440m / 2);
        marginLayoutParams.topMargin = ((int) f18) - (this.f150441n / 2);
        setLayoutParams(marginLayoutParams);
        setVisibility(0);
        this.f150435e = true;
        this.f150436f = false;
        this.f150437g = false;
        this.f150438h = java.lang.System.currentTimeMillis();
        invalidate();
    }

    @Override // cs0.i
    public void b(float f17, cs0.h hVar) {
    }

    @Override // cs0.i
    public void c(int i17, int i18) {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i17;
            layoutParams.height = i18;
        }
        this.f150440m = i17;
        this.f150441n = i18;
        this.f150442o = i17 / 2;
        this.f150443p = i18 / 2;
        this.f150444q = i65.a.b(getContext(), 1);
        android.graphics.Paint paint = this.f150434d;
        paint.setColor(this.f150439i);
        paint.setStrokeWidth(this.f150444q);
        setLayerType(1, null);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        canvas.translate(this.f150442o / 2, this.f150443p / 2);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f150438h;
        if (currentTimeMillis > 200) {
            this.f150435e = false;
            this.f150436f = true;
        }
        if (currentTimeMillis > 800) {
            this.f150436f = false;
        }
        if (currentTimeMillis > 1100) {
            this.f150437g = true;
        }
        if (currentTimeMillis > 1300) {
            this.f150437g = false;
            canvas.drawColor(0);
            return;
        }
        boolean z17 = this.f150435e;
        android.graphics.Paint paint = this.f150434d;
        if (z17) {
            float f17 = (((float) (200 - currentTimeMillis)) / 200.0f) + 1.0f;
            canvas.scale(f17, f17, this.f150442o / 2, this.f150443p / 2);
            paint.setAlpha((int) ((2.0f - f17) * 255.0f));
        } else {
            canvas.scale(1.0f, 1.0f);
        }
        if (this.f150436f) {
            float f18 = (((float) ((currentTimeMillis - 200) % 200)) / 200.0f) * 2.0f;
            paint.setAlpha((int) (((f18 > 1.0f ? f18 - 1.0f : 1.0f - f18) * 128.0f) + 127.0f));
        } else {
            paint.setAlpha(255);
        }
        if (this.f150437g) {
            paint.setAlpha((int) ((1.0f - (((float) (currentTimeMillis - 1100)) / 200.0f)) * 255.0f));
        }
        canvas.drawLine(0.0f, 0.0f, this.f150442o, 0.0f, paint);
        canvas.drawLine(0.0f, 0.0f, 0.0f, this.f150443p, paint);
        int i17 = this.f150442o;
        canvas.drawLine(i17, 0.0f, i17, this.f150443p, paint);
        int i18 = this.f150443p;
        canvas.drawLine(0.0f, i18, this.f150442o, i18, paint);
        int i19 = this.f150443p;
        canvas.drawLine(0.0f, i19 / 2, this.f150442o / 10, i19 / 2, paint);
        int i27 = this.f150442o;
        int i28 = this.f150443p;
        canvas.drawLine(i27, i28 / 2, (i27 * 9) / 10, i28 / 2, paint);
        int i29 = this.f150442o;
        canvas.drawLine(i29 / 2, 0.0f, i29 / 2, this.f150443p / 10, paint);
        int i37 = this.f150442o;
        canvas.drawLine(i37 / 2, this.f150443p, i37 / 2, (r3 * 9) / 10, paint);
        invalidate();
    }

    @Override // cs0.i
    /* renamed from: reset */
    public void mo46844x6761d4f() {
    }

    @Override // cs0.i
    /* renamed from: setFocusColor */
    public void mo46845xdcc3376d(int i17) {
        if (i17 != 0) {
            this.f150439i = i17;
            this.f150434d.setColor(i17);
        }
    }

    @Override // cs0.i
    /* renamed from: setOrientation */
    public void mo46846x1a6eb00e(int i17) {
    }

    public C10900x6687a5d8(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150434d = new android.graphics.Paint();
        this.f150435e = false;
        this.f150436f = false;
        this.f150437g = false;
        this.f150438h = 0L;
        this.f150439i = -12206054;
    }

    public C10900x6687a5d8(android.content.Context context) {
        super(context);
        this.f150434d = new android.graphics.Paint();
        this.f150435e = false;
        this.f150436f = false;
        this.f150437g = false;
        this.f150438h = 0L;
        this.f150439i = -12206054;
    }
}
