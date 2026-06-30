package g35;

/* loaded from: classes8.dex */
public class c extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f349713d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f349714e;

    /* renamed from: f, reason: collision with root package name */
    public final g35.b f349715f;

    public c(java.lang.String str, r45.z45 z45Var, int i17, byte[] bArr, g35.b bVar, int i18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.x45();
        lVar.f152198b = new r45.y45();
        lVar.f152199c = "/cgi-bin/micromsg-bin/parallelupload";
        lVar.f152200d = 3784;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        if (i18 > 0) {
            lVar.f152205i = i18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCGIParallelUpload", "set timeout %s", java.lang.Integer.valueOf(i18));
        }
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f349714e = a17;
        r45.x45 x45Var = (r45.x45) a17.f152243a.f152217a;
        x45Var.f471305d = str;
        x45Var.f471306e = z45Var;
        x45Var.f471307f = i17;
        x45Var.f471308g = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, 0, bArr.length);
        this.f349715f = bVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f349713d = u0Var;
        return mo9409x10f9447a(sVar, this.f349714e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3784;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f349713d.mo815x76e0bfae(i18, i19, str, this);
        g35.b bVar = this.f349715f;
        if (4 != i18 && (i18 != 0 || i19 != 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneCGIParallelUpload", "onSceneEnd errType = " + i18 + ", errCode = " + i19 + ", errMsg:" + str);
            ((z25.h) bVar).a(false, i19, null);
            return;
        }
        r45.y45 y45Var = (r45.y45) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        r45.ie mo11484xe92ab0a8 = y45Var.mo11484xe92ab0a8();
        if (mo11484xe92ab0a8 != null && mo11484xe92ab0a8.f458492d == 0) {
            ((z25.h) bVar).a(true, 0, y45Var);
            return;
        }
        if (mo11484xe92ab0a8 != null) {
            i19 = mo11484xe92ab0a8.f458492d;
        }
        ((z25.h) bVar).a(false, i19, null);
    }
}
