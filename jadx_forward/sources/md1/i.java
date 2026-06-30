package md1;

/* loaded from: classes7.dex */
public class i implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f407275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ md1.s f407276e;

    public i(md1.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        this.f407276e = sVar;
        this.f407275d = c0Var;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(p0Var.U);
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: is1V1:%b, isIsVoIPTalking:%b", valueOf, java.lang.Boolean.valueOf(p0Var.T));
        if (bVar == u81.b.DESTROYED && this.f407276e.f407332v.equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: appbrand change to destroy");
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
            p0Var.j(new md1.h(this), dz.k.ReasonWeappEnterBackground);
            if (this.f407275d.t3() != null && this.f407275d.t3().N != null) {
                this.f407275d.t3().N.c(this.f407276e.f407329s);
            }
            md1.m1.a(str);
            return;
        }
        if (bVar == u81.b.BACKGROUND && this.f407276e.f407332v.equals(str)) {
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
            boolean z17 = p0Var.Z1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: isInterrupted:%b", java.lang.Boolean.valueOf(z17));
            md1.s sVar = this.f407276e;
            if (sVar.f407335y && !z17) {
                md1.m1.c(sVar.f407332v);
            }
            this.f407276e.f407335y = false;
        }
    }
}
