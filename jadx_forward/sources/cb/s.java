package cb;

/* loaded from: classes13.dex */
public final class s extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public cb.r f121713a;

    public s(cb.r rVar) {
        this.f121713a = rVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        cb.r rVar = this.f121713a;
        if (rVar != null && rVar.c()) {
            com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.m();
            cb.r rVar2 = this.f121713a;
            synchronized (com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.class) {
                if (com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.f126181i == null) {
                    com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.f126181i = new java.util.concurrent.ScheduledThreadPoolExecutor(1);
                }
                com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.f126181i.schedule(rVar2, 0L, java.util.concurrent.TimeUnit.SECONDS);
            }
            xa.b bVar = this.f121713a.f121711f.f126182a;
            bVar.d();
            bVar.f534285a.unregisterReceiver(this);
            this.f121713a = null;
        }
    }
}
