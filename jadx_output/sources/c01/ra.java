package c01;

/* loaded from: classes11.dex */
public class ra extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final c01.qa f37427d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f37428e;

    public ra(c01.qa qaVar) {
        this(qaVar, null);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        prepareDispatcher(sVar);
        this.f37428e = u0Var;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        gm0.j1.e().j(new c01.pa(this));
        return 0;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 0;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        c01.qa qaVar = this.f37427d;
        if (qaVar != null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            android.os.SystemClock.elapsedRealtime();
            qaVar.a(super.dispatcher());
        }
        this.f37428e.onSceneEnd(0, 0, null, this);
    }

    public ra(c01.qa qaVar, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLocalProxy", "init LocalProxy task:%s", str);
        this.f37427d = qaVar;
    }
}
