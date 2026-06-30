package md1;

/* loaded from: classes7.dex */
public class b implements com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f407248a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407249b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f407250c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f407251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ md1.c f407252e;

    public b(md1.c cVar, long j17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17) {
        this.f407252e = cVar;
        this.f407248a = j17;
        this.f407249b = str;
        this.f407250c = c0Var;
        this.f407251d = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f407248a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceExitVoIPChat", "hy: exit conference result %d, %d, %s, %s, using %d ms", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, (java.lang.String) obj, java.lang.Long.valueOf(elapsedRealtime));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(elapsedRealtime);
        java.lang.String str2 = this.f407249b;
        g0Var.d(16093, str2, valueOf, valueOf2);
        md1.c cVar = this.f407252e;
        int i19 = this.f407251d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f407250c;
        if (i17 == 0 && i18 == 0) {
            g0Var.C(935L, 2L, 1L);
            c0Var.a(i19, cVar.o("ok"));
        } else {
            g0Var.C(935L, 3L, 1L);
            c0Var.a(i19, cVar.o("fail: " + str));
        }
        if (((cz.e) ((dz.i) i95.n0.c(dz.i.class))).wi()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceExitVoIPChat", "close wait voip chat");
            md1.m1.a(str2);
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).Ai(false);
        }
    }
}
