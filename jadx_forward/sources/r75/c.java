package r75;

/* loaded from: classes4.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f474786d;

    public c(android.content.Context context) {
        this.f474786d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            android.net.NetworkInfo m40058x63929c60 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40058x63929c60(this.f474786d);
            r75.d.f474789c = m40058x63929c60;
            if (m40058x63929c60 != null) {
                r75.d.f474790d = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40068xab9ed241(m40058x63929c60);
                r75.d.f474791e = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40063x608a19a0(r75.d.f474789c);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NetWorkCache", "UpdateNetWorkCache error : " + th6.getMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetWorkCache", "UpdateNetWorkCache updateCache, networkType = " + r75.d.f474790d + ", iosNetworkType = " + r75.d.f474791e);
    }
}
