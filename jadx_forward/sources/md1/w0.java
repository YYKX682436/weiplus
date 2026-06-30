package md1;

/* loaded from: classes7.dex */
public class w0 implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f407345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ md1.x0 f407346e;

    public w0(md1.x0 x0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        this.f407346e = x0Var;
        this.f407345d = c0Var;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(bVar.ordinal());
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiWaitVoIPChat", "onRunningStateChanged state:%d, isIsVoIPTalking:%b", valueOf, java.lang.Boolean.valueOf(p0Var.T));
        if (bVar == u81.b.DESTROYED && this.f407346e.f407347g.equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiWaitVoIPChat", "appbrand change to destroy");
            if (this.f407345d.t3() != null && this.f407345d.t3().N != null) {
                this.f407345d.t3().N.c(this.f407346e.f407348h);
            }
            md1.m1.a(str);
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).Ai(false);
            if (!this.f407346e.f407350m || this.f407345d.t3() == null) {
                return;
            }
            this.f407345d.t3().c0(this.f407346e.f407349i);
            this.f407346e.f407350m = false;
            return;
        }
        if (bVar == u81.b.BACKGROUND && this.f407346e.f407347g.equals(str)) {
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
            boolean z17 = p0Var.Z1;
            boolean wi6 = ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).wi();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiWaitVoIPChat", "isInterrupted:%b, isWait:%b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(wi6));
            if (!wi6 || z17) {
                return;
            }
            md1.m1.c(this.f407346e.f407347g);
        }
    }
}
