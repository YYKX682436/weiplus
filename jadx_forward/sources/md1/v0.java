package md1;

/* loaded from: classes7.dex */
public class v0 implements gp1.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f407342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f407343b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ md1.x0 f407344c;

    public v0(md1.x0 x0Var, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        this.f407344c = x0Var;
        this.f407342a = z17;
        this.f407343b = c0Var;
    }

    @Override // gp1.d0
    public void a(java.util.List list) {
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE.T;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiWaitVoIPChat", "hasVoIPChat:%b, now is voip talking", java.lang.Boolean.valueOf(z17));
            return;
        }
        if (list == null || list.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiWaitVoIPChat", "ballInfoList is empty, hasVoIPChat false!");
            if (!this.f407342a) {
                ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).Ai(false);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiWaitVoIPChat", "show the float ball window");
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).Ai(true);
            md1.x0 x0Var = this.f407344c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f407343b;
            if (x0Var.f407348h == null) {
                x0Var.f407348h = new md1.w0(x0Var, c0Var);
            }
            if (c0Var.t3() != null && c0Var.t3().N != null) {
                c0Var.t3().N.a(x0Var.f407348h);
            }
            if (this.f407344c.f407350m) {
                return;
            }
            this.f407344c.f407350m = true;
            this.f407343b.l(this.f407344c.f407349i);
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it.next()).f174579d;
            if (i17 == 17 || i17 == 19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiWaitVoIPChat", "has appbrand doing voip");
                z17 = true;
                break;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiWaitVoIPChat", "hasVoIPChat:%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiWaitVoIPChat", "hide the float ball window");
            if (this.f407342a || !((cz.e) ((dz.i) i95.n0.c(dz.i.class))).wi()) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiWaitVoIPChat", "close wait voip chat");
            md1.m1.a(this.f407344c.f407347g);
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).Ai(false);
        }
    }
}
