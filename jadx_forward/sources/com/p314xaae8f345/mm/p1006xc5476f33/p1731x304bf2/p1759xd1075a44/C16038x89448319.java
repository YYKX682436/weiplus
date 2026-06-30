package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44;

/* renamed from: com.tencent.mm.plugin.game.widget.TextProgressBar */
/* loaded from: classes4.dex */
public class C16038x89448319 extends android.widget.ProgressBar {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f223495d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f223496e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f223497f;

    /* renamed from: g, reason: collision with root package name */
    public int f223498g;

    /* renamed from: h, reason: collision with root package name */
    public int f223499h;

    public C16038x89448319(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f223497f = context;
    }

    /* renamed from: setText */
    private void m64851x765074af(int i17) {
        this.f223498g = i17;
        this.f223495d = java.lang.String.valueOf(i17) + "%";
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f223496e = paint;
        paint.setAntiAlias(true);
        this.f223496e.setColor(android.graphics.Color.rgb(69, 192, 26));
        this.f223496e.setTextSize(this.f223499h);
        android.graphics.Rect rect = new android.graphics.Rect();
        android.graphics.Paint paint2 = this.f223496e;
        java.lang.String str = this.f223495d;
        paint2.getTextBounds(str, 0, str.length(), rect);
        float width = (getWidth() / 2) - rect.centerX();
        float height = (getHeight() / 2) - rect.centerY();
        canvas.drawText(this.f223495d, width, height, this.f223496e);
        float width2 = (this.f223498g / 100.0f) * getWidth();
        if (width2 > width) {
            android.graphics.Paint paint3 = new android.graphics.Paint();
            paint3.setColor(-1);
            paint3.setAntiAlias(true);
            paint3.setTextSize(this.f223499h);
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, width2, getHeight());
            canvas.save();
            canvas.clipRect(rectF);
            canvas.drawText(this.f223495d, width, height, paint3);
            canvas.restore();
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i17) {
        m64851x765074af(i17);
        super.setProgress(i17);
    }

    /* renamed from: setTextSize */
    public void m64852x3abfd950(int i17) {
        this.f223499h = i65.a.b(this.f223497f, i17);
    }
}
