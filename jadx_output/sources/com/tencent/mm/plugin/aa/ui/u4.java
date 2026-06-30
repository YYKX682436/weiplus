package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class u4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72834d;

    public u4(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI) {
        this.f72834d = launchAAUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = this.f72834d;
        android.graphics.Bitmap L = com.tencent.mm.sdk.platformtools.x.L(launchAAUI.f72522x1, launchAAUI.A.getWidth(), launchAAUI.A.getHeight());
        int orientationInDegree = com.tencent.mm.compatible.util.Exif.fromFile(launchAAUI.f72522x1).getOrientationInDegree();
        android.graphics.Bitmap w07 = com.tencent.mm.sdk.platformtools.x.w0(L, orientationInDegree);
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "exifPath : %s degree : %d", launchAAUI.f72522x1, java.lang.Integer.valueOf(orientationInDegree));
        launchAAUI.A.setImageBitmap(w07);
        launchAAUI.A.sendAccessibilityEvent(128);
    }
}
