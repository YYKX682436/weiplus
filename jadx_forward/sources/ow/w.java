package ow;

/* loaded from: classes11.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f430804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f430805e;

    public w(long j17, java.lang.String str) {
        this.f430804d = j17;
        this.f430805e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() + (this.f430804d * 60 * 1000);
        java.lang.String str = this.f430805e;
        if (str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BrandEcsNotifyTimerMgr", "[BRS BSNotifyTimerMgr] Invalid IDs in nativeLocalIdList.");
        } else {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.v.f297582c.x(java.lang.Long.parseLong(str), currentTimeMillis, ow.v.f430803a);
        }
    }
}
