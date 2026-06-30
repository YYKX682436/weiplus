package fa1;

/* loaded from: classes7.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fa1.a f342220d;

    public g(fa1.a aVar) {
        this.f342220d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        fa1.a aVar = this.f342220d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(aVar.N(), true);
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandGameServiceLogicImpWC", "get session failed for appid: %s", aVar.N());
            return;
        }
        java.lang.String str = b17.f169667d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandGameServiceLogicImpWC", "provide instanceId: %s", str);
        aVar.O().f128931a.m43156xbd4c49c9(str);
    }
}
