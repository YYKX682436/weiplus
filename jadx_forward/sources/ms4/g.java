package ms4;

/* loaded from: classes8.dex */
public final class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ms4.h f412552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f412553b;

    public g(ms4.h hVar, int i17) {
        this.f412552a = hVar;
        this.f412553b = i17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RechargeProductsDialogViewModel", "getWecoinPriceListInfo errorType: " + fVar.f152148a + ", errorCode: " + fVar.f152149b + ", errorMsg: " + fVar.f152150c);
        ms4.h hVar = this.f412552a;
        hVar.f412566i = null;
        os4.a.a(hVar.f412564g, java.lang.Boolean.FALSE);
        boolean h17 = os4.h.h(fVar);
        p012xc85e97e9.p093xedfae76a.j0 j0Var = hVar.f412562e;
        p012xc85e97e9.p093xedfae76a.j0 j0Var2 = hVar.f412565h;
        if (h17) {
            if (j0Var2.mo3195x754a37bb() == null) {
                os4.a.a(j0Var, new ms4.a(fVar.f152148a, fVar.f152149b, fVar.f152150c, null, 8, null));
                hVar.P6();
            }
            hVar.N6(8, 3, fVar.f152149b, fVar.f152150c);
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
            if (fVar2 == null) {
                if (j0Var2.mo3195x754a37bb() == null) {
                    os4.a.a(j0Var, new ms4.a(3, -1, "", null, 8, null));
                    hVar.P6();
                }
                hVar.N6(8, 3, 3, "callback resp is null");
            } else {
                r45.js3 js3Var = (r45.js3) fVar2;
                os4.h.k("MicroMsg.RechargeProductsDialogViewModel", js3Var);
                hVar.f412567m = js3Var.f459621g;
                j0Var2.mo7808x76db6cb1(js3Var);
                pm0.v.K(null, new os4.g(js3Var, this.f412553b));
                hVar.N6(8, 3, 0, "");
            }
        }
        return jz5.f0.f384359a;
    }
}
