package dx1;

/* loaded from: classes4.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f326020f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentHashMap f326021g;

    public e(java.lang.String str, java.lang.String str2, yz5.a aVar, java.util.concurrent.ConcurrentHashMap concurrentHashMap) {
        this.f326018d = str;
        this.f326019e = str2;
        this.f326020f = aVar;
        this.f326021g = concurrentHashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f326018d;
        java.lang.String str2 = this.f326019e;
        try {
            dx1.g.f326022a.i(str, str2, this.f326020f.mo152xb9724478());
        } catch (java.lang.Exception e17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" report job sessionId:");
            sb6.append(str);
            sb6.append(", key:");
            sb6.append(str2);
            sb6.append(", job:");
            int i17 = p3325xe03a0797.p3326xc267989b.r2.O0;
            sb6.append(p3325xe03a0797.p3326xc267989b.q2.f392104d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.StaticKvStat", e17, sb6.toString(), new java.lang.Object[0]);
        }
        this.f326021g.remove(str2);
    }
}
