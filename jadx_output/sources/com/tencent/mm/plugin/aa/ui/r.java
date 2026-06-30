package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MultiTouchImageView f72780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AAImagPreviewUI f72781e;

    public r(com.tencent.mm.plugin.aa.ui.AAImagPreviewUI aAImagPreviewUI, com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView) {
        this.f72781e = aAImagPreviewUI;
        this.f72780d = multiTouchImageView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.aa.ui.AAImagPreviewUI aAImagPreviewUI = this.f72781e;
        java.lang.String str = aAImagPreviewUI.f72433g;
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = this.f72780d;
        android.graphics.Bitmap L = com.tencent.mm.sdk.platformtools.x.L(str, multiTouchImageView.getWidth(), multiTouchImageView.getHeight());
        int orientationInDegree = com.tencent.mm.compatible.util.Exif.fromFile(aAImagPreviewUI.f72433g).getOrientationInDegree();
        android.graphics.Bitmap w07 = com.tencent.mm.sdk.platformtools.x.w0(L, orientationInDegree);
        com.tencent.mars.xlog.Log.i("MicroMsg.PreviewHdHeadImg", "exifPath : %s degree : %d", aAImagPreviewUI.f72433g, java.lang.Integer.valueOf(orientationInDegree));
        aAImagPreviewUI.U6(multiTouchImageView, w07);
    }
}
