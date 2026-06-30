package lr1;

/* loaded from: classes4.dex */
public class e0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f402187d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f402188e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f402189f;

    public e0() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.c93();
        lVar.f152198b = new r45.d93();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getapplist";
        lVar.f152200d = 387;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f402188e = a17;
        this.f402189f = new java.util.LinkedList();
        r45.c93 c93Var = (r45.c93) a17.f152243a.f152217a;
        gm0.j1.i();
        java.lang.Object l17 = gm0.j1.u().c().l(196610, null);
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = 196610;
        objArr[1] = l17 == null ? "null" : l17.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.BrandServiceApplication", "get config, key[%d], value[%s]", objArr);
        int j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) l17, 0);
        c93Var.f452915d = j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.NetSceneGetAppList", "info: request hash code %d", java.lang.Integer.valueOf(j17));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f402187d = u0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.NetSceneGetAppList", "do scene");
        return mo9409x10f9447a(sVar, this.f402188e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 387;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BrandService.NetSceneGetAppList", "on scene end code(%d, %d)", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 == 0 && i19 == 0) {
            r45.d93 d93Var = (r45.d93) this.f402188e.f152244b.f152233a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.NetSceneGetAppList", "ok, hash code is %d, count is %d", java.lang.Integer.valueOf(d93Var.f453784f), java.lang.Integer.valueOf(d93Var.f453782d));
            yq1.n.b(196610, java.lang.Integer.valueOf(d93Var.f453784f));
            java.util.Iterator it = d93Var.f453783e.iterator();
            while (it.hasNext()) {
                this.f402189f.add(((r45.r0) it.next()).f465926d);
            }
        }
        this.f402187d.mo815x76e0bfae(i18, i19, str, this);
    }
}
