package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes8.dex */
public class x4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f274615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.z4 f274616e;

    public x4(com.p314xaae8f345.mm.sdk.p2603x2137b148.z4 z4Var, boolean z17, android.net.Uri uri) {
        this.f274616e = z4Var;
        this.f274615d = uri;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.net.Uri uri = this.f274615d;
        uri.toString();
        try {
            java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273991f;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.z4 z4Var = this.f274616e;
            if (weakReference != null && weakReference.get() != null) {
                java.lang.String uri2 = uri.toString();
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273988c;
                if (uri2.matches(str) || uri.toString().contains(str)) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.z4.a(z4Var, z4Var.f274666d, uri);
                    return;
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "summerscreenshot unregisterContentObserver callback is null 1 mCallbackWeakRef[%s]", com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273991f);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273990e != null) {
                z4Var.f274666d.getContentResolver().unregisterContentObserver(com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273990e);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273990e = null;
            }
            java.lang.ref.WeakReference weakReference2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273991f;
            if (weakReference2 != null) {
                weakReference2.clear();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273991f = null;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScreenShotUtil", "summerscreenshot fail e:" + th6.getMessage());
        }
    }
}
