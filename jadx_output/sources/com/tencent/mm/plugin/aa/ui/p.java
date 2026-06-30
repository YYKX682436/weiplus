package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f72762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.q f72763e;

    public p(com.tencent.mm.plugin.aa.ui.q qVar, android.graphics.Bitmap bitmap) {
        this.f72763e = qVar;
        this.f72762d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.aa.ui.q qVar = this.f72763e;
        android.app.Dialog dialog = qVar.f72774b.f72435i;
        if (dialog != null && dialog.isShowing()) {
            qVar.f72774b.f72435i.dismiss();
        }
        android.graphics.Bitmap bitmap = this.f72762d;
        if (bitmap != null) {
            qVar.f72774b.U6(qVar.f72773a, bitmap);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.PreviewHdHeadImg", "showAAImag onLoadImageEnd bm == null");
            qVar.f72774b.finish();
        }
    }
}
