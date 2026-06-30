package md1;

/* loaded from: classes7.dex */
public class m implements com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f407297a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fw1.b f407298b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ md1.s f407299c;

    public m(md1.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, fw1.b bVar) {
        this.f407299c = sVar;
        this.f407297a = c0Var;
        this.f407298b = bVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        dz.k kVar = (dz.k) obj;
        long j17 = this.f407299c.f407333w;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: on call interrupted! %d, %d, %s, %s, in room for %d ms", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, kVar, java.lang.Long.valueOf(elapsedRealtime));
        this.f407299c.f407335y = false;
        if (this.f407297a.t3() != null && this.f407297a.t3().N != null) {
            this.f407297a.t3().N.c(this.f407299c.f407329s);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(16094, this.f407299c.f407332v, java.lang.Integer.valueOf(kVar.f326297d), java.lang.Long.valueOf(elapsedRealtime), java.lang.Integer.valueOf(this.f407299c.f407334x));
        md1.m1.a(this.f407298b.f348581b);
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE.o();
        md1.j1.b().c();
        if (kVar == dz.k.ReasonManual) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: manually exit, ignore");
            return;
        }
        if (kVar == dz.k.ReasonDevice) {
            g0Var.C(935L, 4L, 1L);
        }
        if (kVar == dz.k.ReasonSessionUpdateFailed) {
            g0Var.C(935L, 5L, 1L);
        }
        if (kVar == dz.k.ReasonUnknown) {
            g0Var.C(935L, 6L, 1L);
        }
        if (kVar == dz.k.ReasonInterrupted) {
            g0Var.C(935L, 7L, 1L);
        }
        md1.c1 c1Var = this.f407299c.f407322i;
        c1Var.u(this.f407297a);
        c1Var.x(kVar);
    }
}
