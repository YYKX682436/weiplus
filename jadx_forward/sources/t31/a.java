package t31;

/* loaded from: classes4.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f496932f = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f496933d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f496934e;

    public a() {
        this.f496933d = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 6238;
        lVar.f152199c = "/cgi-bin/micromsg-bin/getnetworkinfo";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152208l = 0;
        lVar.f152210n = null;
        lVar.f152197a = new r45.lj3();
        lVar.f152198b = new r45.mj3();
        lVar.f152210n = null;
        this.f496933d = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        java.lang.String[] P0;
        this.f496934e = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f496933d;
        r45.lj3 lj3Var = (r45.lj3) oVar.f152243a.f152217a;
        try {
            P0 = gm0.j1.n().f354821b.f152297d.P0("newdns");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMNetIdRequest", e17.getLocalizedMessage());
            lj3Var.f461050d = "";
            lj3Var.f461051e = "";
            lj3Var.f461052f = "";
        }
        if (P0 != null && P0.length == 3) {
            lj3Var.f461050d = android.text.TextUtils.isEmpty(P0[0]) ? "" : P0[0];
            lj3Var.f461051e = android.text.TextUtils.isEmpty(P0[1]) ? "" : P0[1];
            lj3Var.f461052f = android.text.TextUtils.isEmpty(P0[2]) ? "" : P0[2];
            f496932f.set(true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNetIdRequest", "net id from newdns " + lj3Var.f461050d + " client ip " + lj3Var.f461052f);
            return mo9409x10f9447a(sVar, oVar, this);
        }
        lj3Var.f461050d = "";
        lj3Var.f461051e = "";
        lj3Var.f461052f = "";
        f496932f.set(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNetIdRequest", "net id from newdns " + lj3Var.f461050d + " client ip " + lj3Var.f461052f);
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 6238;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNetIdRequest", "ErrType:" + i18 + "   errCode:" + i19 + " error msg " + str);
        f496932f.set(false);
        if (i19 == 0 && i18 == 0) {
            r45.mj3 mj3Var = (r45.mj3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            try {
                com.p314xaae8f345.mm.p971x6de15a2e.s sVar = gm0.j1.n().f354821b.f152297d;
                if (sVar != null && mj3Var != null) {
                    sVar.q1(mj3Var.f462091d, java.lang.String.valueOf(mj3Var.f462093f), mj3Var.f462094g);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMNetIdRequest", e17.getLocalizedMessage());
            }
        }
        this.f496934e.mo815x76e0bfae(i18, i19, str, this);
    }
}
