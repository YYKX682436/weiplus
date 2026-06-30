package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui;

/* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyAvatarParticleView */
/* loaded from: classes3.dex */
public class C16329x11df872c extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f226597d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f226598e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f226599f;

    /* renamed from: g, reason: collision with root package name */
    public long f226600g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f226601h;

    public C16329x11df872c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f226597d = new java.util.ArrayList();
        this.f226598e = new java.util.ArrayList();
        this.f226599f = new java.util.ArrayList();
        this.f226601h = new android.graphics.Paint();
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16329x11df872c c16329x11df872c, int i17) {
        c16329x11df872c.getClass();
        int i18 = i17 / 2;
        for (int i19 = 0; i19 < i18; i19++) {
            int random = (int) (java.lang.Math.random() * c16329x11df872c.getHeight());
            int m66052x46f92a89 = c16329x11df872c.m66052x46f92a89();
            ((java.util.ArrayList) c16329x11df872c.f226597d).add(new android.graphics.Rect(0, random, m66052x46f92a89, random + m66052x46f92a89));
            ((java.util.ArrayList) c16329x11df872c.f226598e).add(java.lang.Integer.valueOf(c16329x11df872c.m66053xeab7dfb6()));
            int abs = (int) ((((r4 * 1.0f) * java.lang.Math.abs(random - 0)) / java.lang.Math.abs(0)) + 0.5d);
            if (abs == 0) {
                abs = 1;
            }
            ((java.util.ArrayList) c16329x11df872c.f226599f).add(java.lang.Integer.valueOf(abs));
        }
        if (i18 >= i17) {
            return;
        }
        java.lang.Math.random();
        c16329x11df872c.getHeight();
        c16329x11df872c.m66052x46f92a89();
        throw null;
    }

    /* renamed from: getRandomRectWidth */
    private int m66052x46f92a89() {
        return 0 + ((int) (java.lang.Math.random() * 0));
    }

    /* renamed from: getRandomVelocity */
    private int m66053xeab7dfb6() {
        return 0 + ((int) (java.lang.Math.random() * 0));
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int i17 = 0;
        while (true) {
            java.util.List list = this.f226597d;
            if (i17 >= ((java.util.ArrayList) list).size()) {
                return;
            }
            canvas.drawRect((android.graphics.Rect) ((java.util.ArrayList) list).get(i17), this.f226601h);
            i17++;
        }
    }

    /* renamed from: setColor */
    public void m66054x52d2f021(int i17) {
        android.graphics.Paint paint = this.f226601h;
        paint.setColor(i17);
        paint.setStyle(android.graphics.Paint.Style.FILL);
    }

    /* renamed from: setDuration */
    public void m66055xffd6ec16(long j17) {
        this.f226600g = j17;
        android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.f226600g).addUpdateListener(new ub3.a(this));
    }
}
