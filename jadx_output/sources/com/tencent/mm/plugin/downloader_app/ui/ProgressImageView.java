package com.tencent.mm.plugin.downloader_app.ui;

/* loaded from: classes8.dex */
public class ProgressImageView extends androidx.appcompat.widget.AppCompatImageView {

    /* renamed from: f, reason: collision with root package name */
    public int f97390f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f97391g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f97392h;

    /* renamed from: i, reason: collision with root package name */
    public int f97393i;

    public ProgressImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f97390f = -1;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f97391g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f97392h || this.f97390f == -1 || this.f97393i == 0) {
            return;
        }
        float b17 = i65.a.b(getContext(), 2);
        android.graphics.Paint paint = this.f97391g;
        paint.setStrokeWidth(b17);
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        float width2 = (getWidth() / 2) - (b17 / 2.0f);
        paint.setColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.FG_3));
        canvas.drawCircle(width, height, width2, paint);
        paint.setColor(b3.l.getColor(getContext(), this.f97393i));
        canvas.drawArc(width - width2, height - width2, width + width2, height + width2, -90.0f, (this.f97390f / 100.0f) * 360.0f, false, paint);
    }

    public void setImageResource(java.lang.String str) {
        if (com.tencent.mm.ui.bk.C()) {
            str = str + "_dark";
        }
        setImageResource(getResources().getIdentifier(str, com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW, getContext().getPackageName()));
    }

    public void setProgress(int i17) {
        this.f97390f = i17;
        this.f97392h = false;
        postInvalidate();
    }

    public void setProgressColor(int i17) {
        this.f97393i = i17;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i17) {
        super.setImageResource(i17);
    }
}
