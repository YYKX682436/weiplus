package b44;

/* loaded from: classes5.dex */
public final class b extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f99352a;

    /* renamed from: b, reason: collision with root package name */
    public final float f99353b;

    /* renamed from: c, reason: collision with root package name */
    public final float f99354c;

    /* renamed from: d, reason: collision with root package name */
    public final int f99355d;

    /* renamed from: e, reason: collision with root package name */
    public final android.text.TextPaint f99356e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f99357f;

    public b(java.lang.String text, int i17, int i18, float f17, float f18, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        f18 = (i27 & 16) != 0 ? 0.0f : f18;
        i19 = (i27 & 32) != 0 ? 10 : i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f99352a = text;
        this.f99353b = f17;
        this.f99354c = f18;
        this.f99355d = i19;
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setTextSize(i17 * 1.0f);
        textPaint.setColor(i18);
        textPaint.setAntiAlias(true);
        this.f99356e = textPaint;
        this.f99357f = jz5.h.b(new b44.a(this));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("draw", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        int i17 = this.f99355d;
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("draw", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
            return;
        }
        float width = getBounds().width();
        float hypot = (float) java.lang.Math.hypot(width * 1.0d, getBounds().height() * 1.0d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTextBound", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
        jz5.g gVar = this.f99357f;
        android.graphics.Rect rect = (android.graphics.Rect) ((jz5.n) gVar).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTextBound", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
        float width2 = rect.width();
        canvas.save();
        canvas.rotate(this.f99353b);
        float f17 = hypot / i17;
        int i18 = 0;
        float f18 = f17;
        while (f18 <= hypot) {
            float f19 = -width;
            int i19 = i18 + 1;
            float f27 = (i18 % 2) * width2;
            while (true) {
                f19 += f27;
                if (f19 < width) {
                    canvas.drawText(this.f99352a, f19, f18, this.f99356e);
                    f27 = (2 * width2) + this.f99354c;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTextBound", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
            android.graphics.Rect rect2 = (android.graphics.Rect) ((jz5.n) gVar).mo141623x754a37bb();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTextBound", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
            f18 += rect2.height() + f17;
            i18 = i19;
        }
        canvas.restore();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("draw", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOpacity", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOpacity", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAlpha", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAlpha", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setColorFilter", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setColorFilter", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
    }
}
