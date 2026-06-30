package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui;

/* renamed from: com.tencent.mm.plugin.location.ui.PoiPoint */
/* loaded from: classes15.dex */
public class C16286x1df9f586 extends android.view.View {
    public final android.graphics.RectF A;
    public za3.w B;
    public za3.v C;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f226162d;

    /* renamed from: e, reason: collision with root package name */
    public final ab3.h f226163e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f226164f;

    /* renamed from: g, reason: collision with root package name */
    public int f226165g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Paint f226166h;

    /* renamed from: i, reason: collision with root package name */
    public int f226167i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Paint f226168m;

    /* renamed from: n, reason: collision with root package name */
    public int f226169n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Paint f226170o;

    /* renamed from: p, reason: collision with root package name */
    public int f226171p;

    /* renamed from: q, reason: collision with root package name */
    public android.animation.ValueAnimator f226172q;

    /* renamed from: r, reason: collision with root package name */
    public android.animation.ValueAnimator f226173r;

    /* renamed from: s, reason: collision with root package name */
    public android.animation.ValueAnimator f226174s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f226175t;

    /* renamed from: u, reason: collision with root package name */
    public double f226176u;

    /* renamed from: v, reason: collision with root package name */
    public double f226177v;

    /* renamed from: w, reason: collision with root package name */
    public int f226178w;

    /* renamed from: x, reason: collision with root package name */
    public int f226179x;

    /* renamed from: y, reason: collision with root package name */
    public float f226180y;

    /* renamed from: z, reason: collision with root package name */
    public int f226181z;

    public C16286x1df9f586(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f226175t = false;
        this.A = new android.graphics.RectF();
        this.B = za3.w.SIT;
        a(context);
    }

    public final void a(android.content.Context context) {
        setLayerType(1, null);
        this.f226162d = context;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f226164f = paint;
        paint.setColor(-1);
        this.f226165g = com.p314xaae8f345.mm.ui.zk.a(context, 12);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f226166h = paint2;
        paint2.setColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq));
        int a17 = com.p314xaae8f345.mm.ui.zk.a(context, 8);
        int a18 = com.p314xaae8f345.mm.ui.zk.a(context, 16);
        this.f226167i = a17;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.f226168m = paint3;
        paint3.setColor(-1);
        int a19 = com.p314xaae8f345.mm.ui.zk.a(context, 7);
        this.f226169n = 0;
        android.graphics.Paint paint4 = new android.graphics.Paint(1);
        this.f226170o = paint4;
        paint4.setColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq));
        this.f226170o.setStrokeWidth(com.p314xaae8f345.mm.ui.zk.a(context, 4));
        int a27 = com.p314xaae8f345.mm.ui.zk.a(context, 20);
        za3.t tVar = new za3.t(this);
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(a17, a18);
        this.f226172q = ofInt;
        ofInt.setDuration(300L);
        this.f226172q.addUpdateListener(tVar);
        android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(0, a19);
        this.f226173r = ofInt2;
        ofInt2.setDuration(300L);
        this.f226173r.addUpdateListener(tVar);
        android.animation.ValueAnimator ofInt3 = android.animation.ValueAnimator.ofInt(0, a27);
        this.f226174s = ofInt3;
        ofInt3.setDuration(300L);
        this.f226174s.addUpdateListener(tVar);
        this.f226174s.setStartDelay(100L);
        this.f226178w = com.p314xaae8f345.mm.ui.zk.a(context, 1);
        this.f226179x = com.p314xaae8f345.mm.ui.zk.a(context, 4);
        this.f226180y = com.p314xaae8f345.mm.ui.zk.f(context) * 2.5f;
    }

    public void b(double d17, double d18, boolean z17) {
        if (this.f226175t) {
            return;
        }
        this.f226175t = true;
        this.f226176u = d17;
        this.f226177v = d18;
        this.f226163e.mo993x4fdae5f9(this, d17, d18);
        this.f226163e.mo1017x715a4c80(this, new za3.u(this));
        if (z17) {
            c();
        }
    }

    public void c() {
        if (za3.w.SIT == this.B) {
            this.B = za3.w.STAND;
            this.f226172q.start();
            this.f226173r.start();
            this.f226174s.start();
        }
    }

    /* renamed from: getLat */
    public double m65942xb5885269() {
        return this.f226176u;
    }

    /* renamed from: getLng */
    public double m65943xb58853ef() {
        return this.f226177v;
    }

    /* renamed from: getPosition */
    public int m65944xa86cd69f() {
        return this.f226181z;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        float height = (getHeight() - (getWidth() / 2)) - this.f226171p;
        if (za3.w.SIT == this.B && 0.0f == this.f226172q.getAnimatedFraction()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PoiPoint", "draw shade.");
            this.f226164f.setShadowLayer(com.p314xaae8f345.mm.ui.zk.a(this.f226162d, 1), 0.0f, this.f226178w, this.f226162d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
        }
        float f17 = width;
        canvas.drawCircle(f17, height, this.f226165g, this.f226164f);
        canvas.drawCircle(f17, height, this.f226167i, this.f226166h);
        canvas.drawCircle(f17, height, this.f226169n, this.f226168m);
        int i17 = this.f226179x;
        int i18 = this.f226167i;
        android.graphics.RectF rectF = this.A;
        rectF.set(f17 - (i17 / 2.0f), (i18 + height) - this.f226180y, f17 + (i17 / 2.0f), height + i18 + this.f226171p);
        float f18 = this.f226180y;
        canvas.drawRoundRect(rectF, f18, f18, this.f226170o);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        setMeasuredDimension(com.p314xaae8f345.mm.ui.zk.a(this.f226162d, 32), com.p314xaae8f345.mm.ui.zk.a(this.f226162d, 52));
    }

    /* renamed from: setOnPointClick */
    public void m65945xa8446699(za3.v vVar) {
        this.C = vVar;
    }

    /* renamed from: setPosition */
    public void m65946xa32537ab(int i17) {
        this.f226181z = i17;
    }

    public C16286x1df9f586(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f226175t = false;
        this.A = new android.graphics.RectF();
        this.B = za3.w.SIT;
        a(context);
    }

    public C16286x1df9f586(android.content.Context context, ab3.h hVar) {
        super(context);
        this.f226175t = false;
        this.A = new android.graphics.RectF();
        this.B = za3.w.SIT;
        this.f226163e = hVar;
        a(context);
    }
}
