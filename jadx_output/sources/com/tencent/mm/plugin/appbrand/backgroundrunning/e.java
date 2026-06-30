package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic f76965d;

    public e(com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic) {
        this.f76965d = appBrandAudioOfVideoBackgroundPlayNotificationLogic;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f76965d.f76917m = false;
        com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic = this.f76965d;
        appBrandAudioOfVideoBackgroundPlayNotificationLogic.f76914g.cancel(appBrandAudioOfVideoBackgroundPlayNotificationLogic.b());
        try {
            com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic2 = this.f76965d;
            appBrandAudioOfVideoBackgroundPlayNotificationLogic2.f76913f.unregisterReceiver(appBrandAudioOfVideoBackgroundPlayNotificationLogic2.f76920p);
        } catch (java.lang.Exception unused) {
        }
        this.f76965d.f76918n = null;
        this.f76965d.f76919o = null;
    }
}
