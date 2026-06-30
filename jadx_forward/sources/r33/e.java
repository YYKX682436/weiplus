package r33;

/* loaded from: classes8.dex */
public class e implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m33.h1 f450505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f450506b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f450507c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f450508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m53.t3 f450509e;

    public e(r33.f fVar, m33.h1 h1Var, int i17, java.lang.String str, java.lang.String str2, m53.t3 t3Var) {
        this.f450505a = h1Var;
        this.f450506b = i17;
        this.f450507c = str;
        this.f450508d = str2;
        this.f450509e = t3Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        m33.h1 h1Var = this.f450505a;
        if (i17 != 0 || i18 != 0 || oVar.f152244b.f152233a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CgiGetLaunchGameInfo", "ReportDistributeStainId cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, oVar.f152244b.f152233a);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("error", "ReportDistributeStainId cgi failed");
            h1Var.b(hashMap);
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f450506b);
        java.lang.String str2 = this.f450507c;
        java.lang.String str3 = this.f450508d;
        m53.t3 t3Var = this.f450509e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiGetLaunchGameInfo", "ReportDistributeStainId cgi success, actionType = %d, bizAppId = %s, url = %s, gameName = %s, gameAppId = %s, gameIconUrl = %s", valueOf, str2, str3, t3Var.f405606e, t3Var.f405605d, t3Var.f405607f);
        h1Var.a(new java.util.HashMap());
    }
}
