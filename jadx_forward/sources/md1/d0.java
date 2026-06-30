package md1;

/* loaded from: classes7.dex */
public class d0 implements gp1.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f407257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f407258b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ md1.e0 f407259c;

    public d0(md1.e0 e0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17) {
        this.f407259c = e0Var;
        this.f407257a = c0Var;
        this.f407258b = i17;
    }

    @Override // gp1.d0
    public void a(java.util.List list) {
        java.util.HashMap hashMap = new java.util.HashMap();
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE.T;
        md1.e0 e0Var = this.f407259c;
        int i17 = this.f407258b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f407257a;
        if (z17) {
            hashMap.put("join", java.lang.Boolean.TRUE);
            c0Var.a(i17, e0Var.p("ok", hashMap));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiHasJoinVoIPChat", "hasVoIPChat:%b, now is voip talking", java.lang.Boolean.valueOf(z17));
            return;
        }
        if (list == null || list.size() == 0) {
            hashMap.put("join", java.lang.Boolean.FALSE);
            c0Var.a(i17, e0Var.p("ok", hashMap));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiHasJoinVoIPChat", "ballInfoList is empty, hasVoIPChat false!");
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it.next()).f174579d;
            if (i18 == 17 || i18 == 19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiHasJoinVoIPChat", "has appbrand doing voip");
                z17 = true;
                break;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiHasJoinVoIPChat", "hasVoIPChat:%b", java.lang.Boolean.valueOf(z17));
        hashMap.put("join", java.lang.Boolean.valueOf(z17));
        c0Var.a(i17, e0Var.p("ok", hashMap));
    }
}
