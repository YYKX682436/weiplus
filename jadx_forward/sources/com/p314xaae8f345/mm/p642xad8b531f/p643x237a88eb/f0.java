package com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb;

/* loaded from: classes11.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f145013d;

    public f0(int i17) {
        this.f145013d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f145013d;
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("package", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
            bundle.putString("class", com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class.getName());
            bundle.putInt("badgenumber", i17);
            com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.h0.f145021d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().call(android.net.Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (java.lang.String) null, bundle) != null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BusinessNotification", "huawei badge: %d, %b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.h0.f145021d));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BusinessNotification", "no huawei badge");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BusinessNotification", "no badge" + e17.toString());
            com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.h0.f145021d = false;
        }
    }
}
