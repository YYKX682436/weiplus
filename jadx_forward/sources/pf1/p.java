package pf1;

/* loaded from: classes7.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pf1.q f435319d;

    public p(pf1.q qVar) {
        this.f435319d = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pf1.q qVar = this.f435319d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HTMLVConsoleViewBase", "destroy hash[%d]", java.lang.Integer.valueOf(qVar.hashCode()));
        qVar.f435324g.getClass();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (context == null) {
            return;
        }
        qVar.getContext().setBaseContext(context);
    }
}
