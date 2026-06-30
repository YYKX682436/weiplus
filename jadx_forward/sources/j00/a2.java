package j00;

/* loaded from: classes9.dex */
public final class a2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j00.d2 f378241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f378242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378243f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(j00.d2 d2Var, boolean z17, java.lang.String str) {
        super(0);
        this.f378241d = d2Var;
        this.f378242e = z17;
        this.f378243f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        j00.d2 d2Var = this.f378241d;
        d2Var.getClass();
        j00.n nVar = j00.n.f378370a;
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) j00.n.f378371b).mo141623x754a37bb()).booleanValue();
        boolean z17 = this.f378242e;
        java.lang.String str = this.f378243f;
        if (booleanValue) {
            c00.e4 wi6 = ((b00.t2) ((c00.f4) i95.n0.c(c00.f4.class))).wi(str, null);
            bw5.x7 wi7 = d2Var.wi(z17);
            if (wi7 != null) {
                pm0.v.L("EcsGiftPreloadNew", true, new j00.f(wi7, z17, str, wi6.f118502c));
            }
        } else {
            c00.j3 j3Var = new c00.j3(str, ((b00.t2) ((c00.f4) i95.n0.c(c00.f4.class))).wi(str, null));
            int wi8 = z17 ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str) : 1;
            b00.d dVar = b00.d.f98181a;
            java.lang.String a17 = dVar.a().a(z17 ? 1 : 0, j3Var.f118525a);
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17);
            j00.x1 x1Var = new j00.x1(d2Var, z17, j3Var, wi8);
            if (!K0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "onExposureEnterSendGift preload directly with ticket: ".concat(a17));
                x1Var.mo146xb9724478(a17);
            }
            dVar.a().c(z17 ? 1 : 0, str, new j00.w1(K0, z17, j3Var, x1Var));
        }
        return jz5.f0.f384359a;
    }
}
