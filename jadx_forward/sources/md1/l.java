package md1;

/* loaded from: classes7.dex */
public class l implements com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fw1.b f407291a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f407292b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f407293c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ md1.s f407294d;

    public l(md1.s sVar, fw1.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17) {
        this.f407294d = sVar;
        this.f407291a = bVar;
        this.f407292b = c0Var;
        this.f407293c = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        long j17 = this.f407294d.f407333w;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: join result result %d, %d, %s, %s, using %d ms", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, arrayList, java.lang.Long.valueOf(elapsedRealtime));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(16092, this.f407294d.f407332v, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(elapsedRealtime));
        if (i17 != 0 || i18 != 0) {
            g0Var.C(935L, 1L, 1L);
            java.util.HashMap hashMap = new java.util.HashMap();
            md1.s sVar = this.f407294d;
            sVar.C(hashMap, sVar.D(i17, i18));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f407292b;
            int i19 = this.f407293c;
            md1.s sVar2 = this.f407294d;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE;
            java.lang.String format = java.lang.String.format("fail: %d, %d, %s, %d", valueOf, valueOf2, str, java.lang.Long.valueOf(p0Var.Y));
            sVar2.getClass();
            if (format == null) {
                format = "fail:internal error";
            }
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 4);
            c0Var.a(i19, sVar2.t(format, hashMap));
            this.f407294d.f407335y = false;
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
            p0Var.o();
            return;
        }
        this.f407294d.f407333w = android.os.SystemClock.elapsedRealtime();
        md1.j1.b().d(!this.f407291a.f348590k.f348577a);
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE;
        p0Var2.t(this.f407291a.f348590k.f348577a, null);
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        p0Var2.s(this.f407291a.f348590k.f348578b, null);
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        p0Var2.r(this.f407291a.f348590k.f348579c, null);
        g0Var.C(935L, 0L, 1L);
        java.util.Map H = this.f407294d.H(arrayList);
        md1.s sVar3 = this.f407294d;
        sVar3.C(H, sVar3.D(i17, i18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var2 = this.f407292b;
        int i27 = this.f407293c;
        md1.s sVar4 = this.f407294d;
        sVar4.getClass();
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        ((java.util.HashMap) H).put("errno", 0);
        c0Var2.a(i27, sVar4.t("ok", H));
        md1.s sVar5 = this.f407294d;
        sVar5.f407335y = true;
        if (sVar5.f407331u) {
            return;
        }
        this.f407294d.f407331u = true;
        this.f407292b.l(this.f407294d.f407330t);
    }
}
