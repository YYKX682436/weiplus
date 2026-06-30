package com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb;

/* loaded from: classes11.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f145015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f145017f;

    public g0(android.content.Context context, java.lang.String str, int i17) {
        this.f145015d = context;
        this.f145016e = str;
        this.f145017f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f145015d;
        int i17 = this.f145017f;
        if (!com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.h0.f145028k) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BusinessNotification", "doNormalNotification: isSupportBadgeSDK is false ");
            return;
        }
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            java.lang.String str = this.f145016e;
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BusinessNotification", "shortcutId: %s, normalNotification badge count: %d, result: %b", str, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf((contentResolver == null || contentResolver.call(com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.h0.f145029l, "setAppBadgeCount", (java.lang.String) null, bundle) == null) ? false : true));
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.h0.f145028k = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BusinessNotification", "no support normal badge");
        }
    }
}
