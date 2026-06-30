package uu0;

/* loaded from: classes5.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uu0.c f512768d;

    public i(uu0.c cVar) {
        this.f512768d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        uu0.c cVar = this.f512768d;
        cVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordMgr", "stopTimer");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = cVar.f512750l;
        if (b4Var != null) {
            b4Var.d();
        }
        cVar.f512750l = null;
    }
}
