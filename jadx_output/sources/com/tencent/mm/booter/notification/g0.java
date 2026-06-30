package com.tencent.mm.booter.notification;

/* loaded from: classes11.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f63482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f63483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f63484f;

    public g0(android.content.Context context, java.lang.String str, int i17) {
        this.f63482d = context;
        this.f63483e = str;
        this.f63484f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f63482d;
        int i17 = this.f63484f;
        if (!com.tencent.mm.booter.notification.h0.f63495k) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BusinessNotification", "doNormalNotification: isSupportBadgeSDK is false ");
            return;
        }
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            java.lang.String str = this.f63483e;
            if (str != null) {
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
                arrayList.add(str);
                bundle.putStringArrayList("app_shortcut_custom_id", arrayList);
            } else {
                bundle.putStringArrayList("app_shortcut_custom_id", null);
            }
            bundle.putInt("app_badge_count", i17);
            bundle.putString("app_shortcut_class_name", "com.tencent.mm.ui.LauncherUI");
            android.content.ContentResolver contentResolver = context.getContentResolver();
            com.tencent.mars.xlog.Log.i("MicroMsg.BusinessNotification", "shortcutId: %s, normalNotification badge count: %d, result: %b", str, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf((contentResolver == null || contentResolver.call(com.tencent.mm.booter.notification.h0.f63496l, "setAppBadgeCount", (java.lang.String) null, bundle) == null) ? false : true));
        } catch (java.lang.Exception unused) {
            com.tencent.mm.booter.notification.h0.f63495k = false;
            com.tencent.mars.xlog.Log.e("MicroMsg.BusinessNotification", "no support normal badge");
        }
    }
}
