package mz2;

/* loaded from: classes9.dex */
public class n1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f414694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pz2.c f414695e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mz2.p1 f414696f;

    public n1(mz2.p1 p1Var, int i17, pz2.c cVar) {
        this.f414696f = p1Var;
        this.f414694d = i17;
        this.f414695e = cVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthMgrImp", "timeout: %s", java.lang.Integer.valueOf(this.f414694d));
        this.f414696f.f414618d.mo150320xae7a2e7a();
        this.f414695e.a(2000, -1, -1, -1);
        return false;
    }
}
