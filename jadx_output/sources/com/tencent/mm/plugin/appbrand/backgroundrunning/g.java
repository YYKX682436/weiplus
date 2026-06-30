package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes7.dex */
public class g implements com.tencent.mm.plugin.appbrand.utils.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic f76972a;

    public g(com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic) {
        this.f76972a = appBrandAudioOfVideoBackgroundPlayNotificationLogic;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.c0
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "loadAlbum, localPath: " + str);
        android.graphics.Bitmap g17 = this.f76972a.g(com.tencent.mm.sdk.platformtools.x.j0(str, com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic.f76909q, com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic.f76910r, 0.0f));
        if (g17 == null) {
            com.tencent.mars.xlog.Log.w("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "loadAlbum, albumBitmap is null");
            return;
        }
        this.f76972a.f76919o = g17;
        com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic = this.f76972a;
        if (appBrandAudioOfVideoBackgroundPlayNotificationLogic.f76916i) {
            com.tencent.mars.xlog.Log.i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "refreshNotification, isCanceled");
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.backgroundrunning.f(appBrandAudioOfVideoBackgroundPlayNotificationLogic, g17));
    }
}
