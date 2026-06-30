package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.bag;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBagBgView */
/* loaded from: classes5.dex */
public class C19351x7c5612b9 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f265516d;

    /* renamed from: e, reason: collision with root package name */
    public int f265517e;

    /* renamed from: f, reason: collision with root package name */
    public float f265518f;

    /* renamed from: g, reason: collision with root package name */
    public int f265519g;

    /* renamed from: h, reason: collision with root package name */
    public int f265520h;

    /* renamed from: i, reason: collision with root package name */
    public long f265521i;

    /* renamed from: m, reason: collision with root package name */
    public float f265522m;

    /* renamed from: n, reason: collision with root package name */
    public float f265523n;

    /* renamed from: o, reason: collision with root package name */
    public int f265524o;

    /* renamed from: p, reason: collision with root package name */
    public int f265525p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f265526q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Paint f265527r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.RectF f265528s;

    public C19351x7c5612b9(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f265516d = -7829368;
        this.f265517e = -65536;
        this.f265518f = 0.0f;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f265527r = paint;
        paint.setAntiAlias(true);
        this.f265525p = -1;
    }

    public final void a(long j17) {
        int i17 = this.f265525p;
        if (i17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBagBgView", "doUpdateAngryInfo not measured, mDiameter:%d", java.lang.Integer.valueOf(i17));
            return;
        }
        float f17 = (i17 * 2) / (this.f265520h / this.f265519g);
        this.f265518f = f17;
        if (j17 - this.f265521i <= 0) {
            this.f265522m = i17;
        } else {
            float f18 = i17 - ((((int) (((float) (j17 - r4)) / r3)) + 1) * f17);
            this.f265522m = f18;
            int i18 = this.f265524o;
            if (f18 < (-i18)) {
                f18 = -i18;
            }
            this.f265522m = f18;
        }
        float f19 = this.f265522m;
        float f27 = i17 - f19;
        int i19 = this.f265524o;
        this.f265523n = f27 < ((float) i19) ? i17 : i19 + f19;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        float f17 = this.f265523n;
        float f18 = this.f265522m;
        if (f17 == f18) {
            this.f265522m = f18 - 0.001f;
        }
        this.f265527r.setShader(new android.graphics.LinearGradient(0.0f, this.f265522m, 0.0f, this.f265523n, new int[]{this.f265516d, this.f265517e}, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
        canvas.drawOval(this.f265528s, this.f265527r);
        if (!this.f265526q || this.f265523n <= 0.0f) {
            return;
        }
        float f19 = this.f265522m - this.f265518f;
        this.f265522m = f19;
        int i17 = this.f265524o;
        if (f19 < (-i17)) {
            f19 = -i17;
        }
        this.f265522m = f19;
        int i18 = this.f265525p;
        this.f265523n = ((float) i18) - f19 < ((float) i17) ? i18 : f19 + i17;
        postInvalidateDelayed(this.f265519g);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.f265525p = android.view.View.MeasureSpec.getSize(i17);
        int i19 = this.f265525p;
        this.f265528s = new android.graphics.RectF(0.0f, 0.0f, i19, i19);
        this.f265524o = this.f265525p / 2;
        a(java.lang.System.currentTimeMillis());
    }

    /* renamed from: setAngryColor */
    public void m74425x8e1ea844(int i17) {
        this.f265517e = i17;
    }

    /* renamed from: setStartColor */
    public void m74426xbd13ee23(int i17) {
        this.f265516d = i17;
    }
}
