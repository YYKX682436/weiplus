package ow;

/* loaded from: classes11.dex */
public final class r implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.b {

    /* renamed from: a, reason: collision with root package name */
    public static final ow.r f430796a = new ow.r();

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.b
    /* renamed from: complete */
    public final void mo111146xdc453139(boolean z17) {
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BrandEcsNotifyCacheMgr", "[BRS]cleanUnExpiredNotifyMsg success, starting data fetch.");
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.v.f297582c.f(2147483647L, 100, ow.q.f430795a);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("BrandEcsNotifyCacheMgr", "[BRS]cleanUnExpiredNotifyMsg failed, starting data fetch anyway.");
            ow.t.f430801d = false;
        }
    }
}
