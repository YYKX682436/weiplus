package i13;

/* loaded from: classes5.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i13.c f368806d;

    public b(i13.c cVar) {
        this.f368806d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id=");
        i13.c cVar = this.f368806d;
        sb6.append(cVar.f368808d);
        sb6.append(" timeout, removeSelf!");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyMsgItem", sb6.toString());
        ((k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi()).l(cVar.f368808d);
    }
}
