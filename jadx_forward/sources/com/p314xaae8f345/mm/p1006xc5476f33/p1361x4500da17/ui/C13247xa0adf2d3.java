package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.ProgressImageView */
/* loaded from: classes8.dex */
public class C13247xa0adf2d3 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd {

    /* renamed from: f, reason: collision with root package name */
    public int f178923f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f178924g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f178925h;

    /* renamed from: i, reason: collision with root package name */
    public int f178926i;

    public C13247xa0adf2d3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f178923f = -1;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f178924g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f178925h || this.f178923f == -1 || this.f178926i == 0) {
            return;
        }
        float b17 = i65.a.b(getContext(), 2);
        android.graphics.Paint paint = this.f178924g;
        paint.setStrokeWidth(b17);
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        float width2 = (getWidth() / 2) - (b17 / 2.0f);
        paint.setColor(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835));
        canvas.drawCircle(width, height, width2, paint);
        paint.setColor(b3.l.m9702x7444d5ad(getContext(), this.f178926i));
        canvas.drawArc(width - width2, height - width2, width + width2, height + width2, -90.0f, (this.f178923f / 100.0f) * 360.0f, false, paint);
    }

    /* renamed from: setImageResource */
    public void m54717x8d516947(java.lang.String str) {
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            str = str + "_dark";
        }
        setImageResource(getResources().getIdentifier(str, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55633x65da3463, getContext().getPackageName()));
    }

    /* renamed from: setProgress */
    public void m54718x3ae760af(int i17) {
        this.f178923f = i17;
        this.f178925h = false;
        postInvalidate();
    }

    /* renamed from: setProgressColor */
    public void m54719x7d38f3f4(int i17) {
        this.f178926i = i17;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd, android.widget.ImageView
    public void setImageResource(int i17) {
        super.setImageResource(i17);
    }
}
