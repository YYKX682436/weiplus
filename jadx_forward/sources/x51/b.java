package x51;

/* loaded from: classes5.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f533505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y61.f f533506e;

    public b(long j17, y61.f fVar) {
        this.f533505d = j17;
        this.f533506e = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.HashSet hashSet = x51.e.f533522a;
        java.util.HashSet hashSet2 = x51.e.f533522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddrBookSyncHelper", "syncAddrBook running:%b setSize:%d call:%d callback:%s", false, java.lang.Integer.valueOf(hashSet2.size()), java.lang.Long.valueOf(this.f533505d), this.f533506e);
        hashSet2.add(this.f533506e);
        r61.q0.k(true);
        ((ku5.t0) ku5.t0.f394148d).q(new x51.d(null));
    }
}
