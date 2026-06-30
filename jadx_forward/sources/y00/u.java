package y00;

/* loaded from: classes9.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f540082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f540083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y00.t f540084f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f540085g;

    public u(android.widget.LinearLayout linearLayout, long j17, y00.t tVar, java.util.Map map) {
        this.f540082d = linearLayout;
        this.f540083e = j17;
        this.f540084f = tVar;
        this.f540085g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object tag = this.f540082d.getTag();
        boolean z17 = tag instanceof java.lang.Long;
        long j17 = this.f540083e;
        if (!z17 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, java.lang.Long.valueOf(j17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfProductCardUIRefresher", "postToMainAndRefresh: container reused, skip, msgSvrId=" + j17 + ", tag=" + tag);
            return;
        }
        try {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.js) this.f540084f).a(this.f540085g);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EcsKfProductCardUIRefresher", th6, "postToMainAndRefresh onLatestXml fail, msgSvrId=" + j17, new java.lang.Object[0]);
        }
    }
}
