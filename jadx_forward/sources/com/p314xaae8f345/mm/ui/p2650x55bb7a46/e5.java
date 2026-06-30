package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes5.dex */
public class e5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21616x2b04f35f f281989d;

    public e5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21616x2b04f35f c21616x2b04f35f) {
        this.f281989d = c21616x2b04f35f;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21616x2b04f35f c21616x2b04f35f = this.f281989d;
        android.graphics.Bitmap bitmap = c21616x2b04f35f.f279753d;
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingImageBGView", "want to reset matrix, but bmp is null");
            return;
        }
        if (bitmap.getWidth() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingImageBGView", "want to reset matrix, but measured width error");
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float measuredWidth = c21616x2b04f35f.getMeasuredWidth() / c21616x2b04f35f.f279753d.getWidth();
        float measuredHeight = c21616x2b04f35f.getMeasuredHeight() / c21616x2b04f35f.f279753d.getHeight();
        c21616x2b04f35f.getMeasuredWidth();
        c21616x2b04f35f.getMeasuredHeight();
        if (measuredWidth > measuredHeight) {
            matrix.setScale(measuredWidth, measuredWidth);
        } else {
            matrix.setScale(measuredHeight, measuredHeight);
            matrix.postTranslate((c21616x2b04f35f.getMeasuredWidth() - (c21616x2b04f35f.f279753d.getWidth() * measuredHeight)) / 2.0f, 0.0f);
        }
        c21616x2b04f35f.setImageMatrix(matrix);
    }
}
