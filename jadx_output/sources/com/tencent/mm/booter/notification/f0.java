package com.tencent.mm.booter.notification;

/* loaded from: classes11.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f63480d;

    public f0(int i17) {
        this.f63480d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f63480d;
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("package", com.tencent.mm.sdk.platformtools.x2.f193072b);
            bundle.putString("class", com.tencent.mm.ui.LauncherUI.class.getName());
            bundle.putInt("badgenumber", i17);
            com.tencent.mm.booter.notification.h0.f63488d = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().call(android.net.Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (java.lang.String) null, bundle) != null;
            com.tencent.mars.xlog.Log.i("MicroMsg.BusinessNotification", "huawei badge: %d, %b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(com.tencent.mm.booter.notification.h0.f63488d));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BusinessNotification", "no huawei badge");
            com.tencent.mars.xlog.Log.e("MicroMsg.BusinessNotification", "no badge" + e17.toString());
            com.tencent.mm.booter.notification.h0.f63488d = false;
        }
    }
}
