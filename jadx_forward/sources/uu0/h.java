package uu0;

/* loaded from: classes5.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uu0.c f512767d;

    public h(uu0.c cVar) {
        this.f512767d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        uu0.c cVar = this.f512767d;
        long j17 = cVar.f512752n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordMgr", "stopTimer");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = cVar.f512750l;
        if (b4Var != null) {
            b4Var.d();
        }
        cVar.f512750l = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordMgr", "startTimer");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new uu0.f(cVar), false);
        cVar.f512750l = b4Var2;
        b4Var2.c(j17, j17);
    }
}
