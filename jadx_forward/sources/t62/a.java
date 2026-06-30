package t62;

/* loaded from: classes12.dex */
public class a implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f497528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t62.b f497529e;

    public a(t62.b bVar, java.lang.String str) {
        this.f497529e = bVar;
        this.f497528d = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlProviderOpenApi", "[handleGetSimpleWxaInfo] errType:%d  errCode:%d  errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        r45.eq3 eq3Var = ((s62.a) m1Var).f484943i;
        t62.b bVar = this.f497529e;
        if (eq3Var == null) {
            bVar.c(v25.a.a(4301));
            return;
        }
        java.util.Iterator it = eq3Var.f455206e.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            r45.rv6 rv6Var = (r45.rv6) it.next();
            if ("snsapi_wxaapp_info".equals(rv6Var.f466761d) && rv6Var.f466762e == 1) {
                z17 = true;
                break;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.ext.p1398xb4b53790.p1399xc52405f1.C13498x68291483 c13498x68291483 = bVar.f497531i;
        java.lang.String[] strArr = com.p314xaae8f345.mm.p1006xc5476f33.ext.p1398xb4b53790.p1399xc52405f1.C13498x68291483.f181392t;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlProviderOpenApi", "[handleGetSimpleWxaInfo] appid:%s  pkgName:%s  signatureMd5:%s hasPermission:%b", c13498x68291483.f181408g, c13498x68291483.d(), this.f497528d, java.lang.Boolean.valueOf(z17));
        if (!z17) {
            bVar.c(v25.a.a(4301));
            return;
        }
        try {
            int parseInt = java.lang.Integer.parseInt(bVar.f497530h[1]);
            bVar.f497530h[1] = java.lang.Math.min(parseInt, eq3Var.f455207f) + "";
        } catch (java.lang.NumberFormatException unused) {
        }
        bVar.c(bVar.f497531i.n(bVar.f497530h, true));
    }
}
