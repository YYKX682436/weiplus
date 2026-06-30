package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes8.dex */
public class y4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f274630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f274632f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f274633g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.z4 f274634h;

    public y4(com.p314xaae8f345.mm.sdk.p2603x2137b148.z4 z4Var, android.content.Context context, java.lang.String str, long j17, long j18) {
        this.f274634h = z4Var;
        this.f274630d = context;
        this.f274631e = str;
        this.f274632f = j17;
        this.f274633g = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f274630d;
        java.lang.String str = this.f274631e;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z4 z4Var = this.f274634h;
        z4Var.getClass();
        long j17 = this.f274633g;
        long j18 = this.f274632f;
        try {
            if (java.lang.Math.abs(j17 - j18) > 10 || j17 - z4Var.f274663a <= 1 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (!(str.toLowerCase().contains("screenshot") || str.contains("截屏") || str.contains("截图")) || str.equals(z4Var.f274664b))) {
                j18 = 0;
                str = null;
            } else {
                z4Var.f274663a = j17;
                z4Var.f274664b = str;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "summerscreenshot added path: " + str + ", time: " + j18);
            java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273991f;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 f7Var = weakReference != null ? (com.p314xaae8f345.mm.sdk.p2603x2137b148.f7) weakReference.get() : null;
            if (f7Var != null) {
                f7Var.z0(str, j18, false);
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273990e != null) {
                context.getContentResolver().unregisterContentObserver(com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273990e);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273990e = null;
            }
            java.lang.ref.WeakReference weakReference2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273991f;
            if (weakReference2 != null) {
                weakReference2.clear();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273991f = null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "summerscreenshot unregisterContentObserver callback is null 2");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScreenShotUtil", "summerscreenshot fail e:" + th6.getMessage());
        }
    }
}
