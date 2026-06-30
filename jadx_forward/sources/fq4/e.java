package fq4;

/* loaded from: classes4.dex */
public class e extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f347120d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f347121e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f347122f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f347123g = 0;

    public e(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.cr3();
        lVar.f152198b = new r45.dr3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getvoiceprintresource";
        lVar.f152200d = 611;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f347121e = a17;
        r45.cr3 cr3Var = (r45.cr3) a17.f152243a.f152217a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetVoicePrintResource", "sceneType %d %s", java.lang.Integer.valueOf(i17), str);
        cr3Var.f453331d = i17;
        cr3Var.f453332e = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f347120d = u0Var;
        return mo9409x10f9447a(sVar, this.f347121e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 611;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.dr3 dr3Var = (r45.dr3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i18 != 0 && i19 != 0) {
            this.f347120d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        r45.wr5 wr5Var = dr3Var.f454232d;
        if (wr5Var != null) {
            this.f347122f = new java.lang.String(wr5Var.f470936e.f453374f.f273689a);
            this.f347123g = dr3Var.f454232d.f470935d;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetVoicePrintResource", "resp ResourceData null ");
        }
        this.f347120d.mo815x76e0bfae(i18, i19, str, this);
    }
}
