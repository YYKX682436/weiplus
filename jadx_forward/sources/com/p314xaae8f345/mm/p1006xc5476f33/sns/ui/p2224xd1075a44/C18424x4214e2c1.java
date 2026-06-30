package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar */
/* loaded from: classes4.dex */
public class C18424x4214e2c1 extends android.widget.ProgressBar {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f252449d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f252450e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f252451f;

    /* renamed from: g, reason: collision with root package name */
    public int f252452g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f252453h;

    public C18424x4214e2c1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f252451f = context;
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, n34.w2.f416299c, 0, 0);
        try {
            m71293x3abfd950(obtainStyledAttributes.getInteger(0, 18));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: setText */
    private void m71291x765074af(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setText", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
        this.f252449d = java.lang.String.valueOf(i17) + "%";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setText", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(android.graphics.Canvas canvas) {
        int color;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
        super.onDraw(canvas);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f252450e = paint;
        paint.setAntiAlias(true);
        java.lang.String str = this.f252453h;
        if (str != null && str.length() > 0) {
            color = android.graphics.Color.parseColor(this.f252453h);
            this.f252450e.setColor(color);
            this.f252450e.setTextSize(this.f252452g);
            android.graphics.Rect rect = new android.graphics.Rect();
            android.graphics.Paint paint2 = this.f252450e;
            java.lang.String str2 = this.f252449d;
            paint2.getTextBounds(str2, 0, str2.length(), rect);
            canvas.drawText(this.f252449d, (getWidth() / 2) - rect.centerX(), (getHeight() / 2) - rect.centerY(), this.f252450e);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
        }
        color = this.f252451f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561084ab2);
        this.f252450e.setColor(color);
        this.f252450e.setTextSize(this.f252452g);
        android.graphics.Rect rect2 = new android.graphics.Rect();
        android.graphics.Paint paint22 = this.f252450e;
        java.lang.String str22 = this.f252449d;
        paint22.getTextBounds(str22, 0, str22.length(), rect2);
        canvas.drawText(this.f252449d, (getWidth() / 2) - rect2.centerX(), (getHeight() / 2) - rect2.centerY(), this.f252450e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
    }

    /* renamed from: setPaintColor */
    public void m71292x4a93d7a7(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPaintColor", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
        this.f252453h = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPaintColor", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setProgress", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
        m71291x765074af(i17);
        super.setProgress(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setProgress", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
    }

    /* renamed from: setTextSize */
    public void m71293x3abfd950(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTextSize", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
        this.f252452g = i65.a.b(this.f252451f, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTextSize", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
    }
}
