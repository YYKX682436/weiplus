package md1;

/* loaded from: classes7.dex */
public class g0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fw1.b f407265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f407266b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f407267c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ md1.n0 f407268d;

    public g0(md1.n0 n0Var, fw1.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17) {
        this.f407268d = n0Var;
        this.f407265a = bVar;
        this.f407266b = c0Var;
        this.f407267c = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        long j17 = this.f407268d.f407333w;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "hy: join result result %d, %d, %s, %s, using %d ms", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, arrayList, java.lang.Long.valueOf(elapsedRealtime));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(16092, this.f407268d.f407332v, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(elapsedRealtime));
        if (i17 != 0 || i18 != 0) {
            g0Var.C(935L, 1L, 1L);
            java.util.HashMap hashMap = new java.util.HashMap();
            md1.n0 n0Var = this.f407268d;
            n0Var.C(hashMap, n0Var.D(i17, i18));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f407266b;
            int i19 = this.f407267c;
            md1.n0 n0Var2 = this.f407268d;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
            c0Var.a(i19, n0Var2.p(java.lang.String.format("fail: %d, %d, %s, %d", valueOf, valueOf2, str, java.lang.Long.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE.Y)), hashMap));
            this.f407268d.f407335y = false;
            return;
        }
        this.f407268d.f407333w = android.os.SystemClock.elapsedRealtime();
        md1.j1.b().d(!this.f407265a.f348590k.f348577a);
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE;
        p0Var.s(this.f407265a.f348590k.f348578b, null);
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        p0Var.t(this.f407265a.f348590k.f348577a, null);
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        p0Var.r(this.f407265a.f348590k.f348579c, null);
        g0Var.C(935L, 0L, 1L);
        java.util.Map H = this.f407268d.H(arrayList);
        md1.n0 n0Var3 = this.f407268d;
        n0Var3.C(H, n0Var3.D(i17, i18));
        this.f407266b.a(this.f407267c, this.f407268d.p("ok", H));
        if (!this.f407268d.f407331u) {
            this.f407268d.f407331u = true;
            this.f407266b.l(this.f407268d.f407330t);
        }
        this.f407268d.f407335y = true;
    }
}
