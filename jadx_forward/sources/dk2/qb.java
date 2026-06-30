package dk2;

/* loaded from: classes12.dex */
public final class qb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f315495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.tb f315496e;

    public qb(int i17, dk2.tb tbVar) {
        this.f315495d = i17;
        this.f315496e = tbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopPolling ");
        int i17 = this.f315495d;
        sb6.append(i17);
        sb6.append(' ');
        dk2.tb tbVar = this.f315496e;
        sb6.append(tbVar.c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLivePollingService", sb6.toString());
        tbVar.f315656d.remove(i17);
        ((java.util.LinkedList) tbVar.f315658f).remove(java.lang.Integer.valueOf(i17));
        kz5.h0.A(tbVar.f315653a, new dk2.pb(i17));
        tbVar.f315654b.remove(java.lang.Integer.valueOf(i17));
        dk2.tb.b(tbVar);
    }
}
