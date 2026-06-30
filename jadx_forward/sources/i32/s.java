package i32;

/* loaded from: classes13.dex */
public class s implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: g, reason: collision with root package name */
    public static i32.s f369672g;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f369674e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f369673d = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f369675f = new java.util.HashMap();

    public s() {
        this.f369674e = null;
        this.f369674e = new i32.m(this, gm0.j1.e().a());
    }

    public static i32.s a() {
        i32.s sVar = f369672g;
        if (sVar != null) {
            return sVar;
        }
        i32.s sVar2 = new i32.s();
        f369672g = sVar2;
        return sVar2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "******onSceneEnd******\r\n errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        i32.n nVar = new i32.n(null);
        nVar.f369660a = i18;
        nVar.f369661b = i17;
        nVar.f369662c = str;
        nVar.f369663d = m1Var;
        this.f369674e.mo50292x733c63a2(2, nVar).sendToTarget();
    }
}
