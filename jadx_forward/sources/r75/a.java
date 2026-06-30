package r75;

/* loaded from: classes4.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f474784d;

    public a(android.content.Context context) {
        this.f474784d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.net.NetworkInfo m40058x63929c60 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40058x63929c60(this.f474784d);
        r75.d.f474789c = m40058x63929c60;
        if (m40058x63929c60 != null) {
            r75.d.f474790d = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40068xab9ed241(m40058x63929c60);
            r75.d.f474791e = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40063x608a19a0(r75.d.f474789c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetWorkCache", "initCache onReceive, networkType = " + r75.d.f474790d + ", iosNetworkType = " + r75.d.f474791e);
        }
    }
}
