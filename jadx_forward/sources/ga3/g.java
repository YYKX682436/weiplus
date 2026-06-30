package ga3;

/* loaded from: classes15.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ga3.v f351388d;

    public g(ga3.v vVar) {
        this.f351388d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ga3.v vVar = this.f351388d;
        long j17 = vVar.f351424q;
        vVar.l();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "LiteAppRecorderManager startTimer");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new ga3.o(vVar), false);
        vVar.f351422o = b4Var;
        b4Var.c(j17, j17);
    }
}
