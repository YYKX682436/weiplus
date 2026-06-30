package com.tencent.mm.plugin.downloader_app.ui;

/* loaded from: classes2.dex */
public class DownloadStateView extends androidx.appcompat.widget.AppCompatImageView {

    /* renamed from: f, reason: collision with root package name */
    public int f97384f;

    public DownloadStateView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f97384f < 0) {
            return;
        }
        i65.a.b(getContext(), 2);
        getWidth();
        getWidth();
        getWidth();
        getHeight();
        getWidth();
        b3.l.getColor(getContext(), com.tencent.mm.R.color.BW_0_Alpha_0_1);
        throw null;
    }

    public void setProgress(int i17) {
        this.f97384f = i17;
        postInvalidate();
    }

    public void setProgressColor(int i17) {
    }
}
