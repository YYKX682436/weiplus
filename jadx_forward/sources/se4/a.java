package se4;

/* loaded from: classes9.dex */
public class a implements eu5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ se4.b f488452a;

    public a(se4.b bVar) {
        this.f488452a = bVar;
    }

    @Override // eu5.b
    public void a(eu5.e eVar) {
        android.content.SharedPreferences d17;
        eu5.d dVar = (eu5.d) eVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterInitFunc", "SoterInitFunc onResult errCode: %d, errMsg: %s", java.lang.Integer.valueOf(dVar.f557138a), dVar.f557139b);
        boolean a17 = dVar.a();
        se4.b bVar = this.f488452a;
        if (a17) {
            java.lang.System.currentTimeMillis();
            se4.h.f488458a = true;
            bVar.getClass();
            android.content.SharedPreferences d18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();
            if (d18 != null) {
                bVar.f488454b = 1;
                d18.edit().putBoolean("init_success", true).commit();
            }
            bVar.f488453a.mo143715xc84dc82d();
            return;
        }
        re4.n.c(0, dVar.f557138a, 0L);
        if (bVar.f488454b <= 0 && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d()) != null) {
            bVar.f488454b = d17.getBoolean("init_success", false) ? 1 : 2;
        }
        if (bVar.f488454b == 2 && dVar.f557138a == 2 && wo.v1.f529361h.f529343a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 3);
            m05.i.f404103a.a("5", "1", "9999", "ever init success");
        }
        int i17 = dVar.f557138a;
        if (i17 != 1028) {
            se4.h.f488458a = false;
        }
        se4.h.f488459b = i17;
        bVar.f488453a.a(nm5.j.c(java.lang.Integer.valueOf(i17), dVar.f557139b));
    }
}
