package b44;

/* loaded from: classes5.dex */
public final class b extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f17819a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17820b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17821c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17822d;

    /* renamed from: e, reason: collision with root package name */
    public final android.text.TextPaint f17823e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f17824f;

    public b(java.lang.String text, int i17, int i18, float f17, float f18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        f18 = (i27 & 16) != 0 ? 0.0f : f18;
        i19 = (i27 & 32) != 0 ? 10 : i19;
        kotlin.jvm.internal.o.g(text, "text");
        this.f17819a = text;
        this.f17820b = f17;
        this.f17821c = f18;
        this.f17822d = i19;
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setTextSize(i17 * 1.0f);
        textPaint.setColor(i18);
        textPaint.setAntiAlias(true);
        this.f17823e = textPaint;
        this.f17824f = jz5.h.b(new b44.a(this));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("draw", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
        kotlin.jvm.internal.o.g(canvas, "canvas");
        int i17 = this.f17822d;
        if (i17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("draw", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
            return;
        }
        float width = getBounds().width();
        float hypot = (float) java.lang.Math.hypot(width * 1.0d, getBounds().height() * 1.0d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTextBound", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
        jz5.g gVar = this.f17824f;
        android.graphics.Rect rect = (android.graphics.Rect) ((jz5.n) gVar).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextBound", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
        float width2 = rect.width();
        canvas.save();
        canvas.rotate(this.f17820b);
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
                    canvas.drawText(this.f17819a, f19, f18, this.f17823e);
                    f27 = (2 * width2) + this.f17821c;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTextBound", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
            android.graphics.Rect rect2 = (android.graphics.Rect) ((jz5.n) gVar).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextBound", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
            f18 += rect2.height() + f17;
            i18 = i19;
        }
        canvas.restore();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("draw", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOpacity", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpacity", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAlpha", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAlpha", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setColorFilter", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setColorFilter", "com.tencent.mm.plugin.sns.ad.drawable.WaterMarkDrawable");
    }
}
