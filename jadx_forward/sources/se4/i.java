package se4;

/* loaded from: classes9.dex */
public class i implements eu5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nm5.b f488461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ se4.j f488462b;

    public i(se4.j jVar, nm5.b bVar) {
        this.f488462b = jVar;
        this.f488461a = bVar;
    }

    @Override // eu5.b
    public void a(eu5.e eVar) {
        eu5.c cVar = (eu5.c) eVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterPrepareAskFunc", "SoterPrepareAskFunc onResult errCode: %d, errMsg: %s", java.lang.Integer.valueOf(cVar.f557138a), cVar.f557139b);
        boolean a17 = cVar.a();
        se4.j jVar = this.f488462b;
        if (a17) {
            jVar.f488463a.c(this.f488461a.a(1));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv.wallet").getBoolean("MMKV_KEY_SOTER_IS_LAST_UPLOAD_ASK_SUCCESS", false)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 29);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv.wallet").getBoolean("MMKV_KEY_SOTER_IS_LAST_GEN_ASK_SUCCESS", false)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 30);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv.wallet").putBoolean("MMKV_KEY_SOTER_IS_LAST_GEN_ASK_SUCCESS", true);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv.wallet").putBoolean("MMKV_KEY_SOTER_IS_LAST_UPLOAD_ASK_SUCCESS", true);
        } else {
            if (cVar.f557138a == 1003) {
                jVar.getClass();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv.wallet").putBoolean("MMKV_KEY_SOTER_IS_LAST_UPLOAD_ASK_SUCCESS", false);
            }
            if (cVar.f557138a == 4) {
                jVar.getClass();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv.wallet").putBoolean("MMKV_KEY_SOTER_IS_LAST_GEN_ASK_SUCCESS", false);
            }
            re4.n.c(1, cVar.f557138a, 1L);
            jVar.f488463a.a(nm5.j.c(java.lang.Integer.valueOf(cVar.f557138a), cVar.f557139b));
        }
        if (wt5.a.g() == 1) {
            re4.n.c(1, -2, 1L);
        } else {
            re4.n.c(1, -3, 1L);
        }
    }
}
