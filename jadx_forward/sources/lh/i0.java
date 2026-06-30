package lh;

/* loaded from: classes12.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lh.l0 f400137d;

    public i0(lh.l0 l0Var) {
        this.f400137d = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lh.l0 l0Var = this.f400137d;
        synchronized (l0Var.f400147a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PowerAccMonitor", "#dumping, size=" + ((java.util.HashMap) l0Var.f400147a).size());
            java.util.Iterator it = ((java.util.HashMap) l0Var.f400147a).values().iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4627xadd9bddb) it.next()).m40778x2f39f4();
            }
        }
    }
}
