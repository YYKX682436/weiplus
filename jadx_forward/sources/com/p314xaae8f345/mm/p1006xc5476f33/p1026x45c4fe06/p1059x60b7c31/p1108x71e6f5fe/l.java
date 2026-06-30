package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12230x653fb2e0 f164495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f164496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164497f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.m f164498g;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.m mVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12230x653fb2e0 c12230x653fb2e0, java.util.HashMap hashMap, java.lang.String str) {
        this.f164498g = mVar;
        this.f164495d = c12230x653fb2e0;
        this.f164496e = hashMap;
        this.f164497f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f164495d.x();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12230x653fb2e0 c12230x653fb2e0 = this.f164495d;
        if (c12230x653fb2e0.f164470g == 26) {
            android.net.Uri parse = android.net.Uri.parse(c12230x653fb2e0.f164471h);
            if (this.f164498g.f164499a.t3().u0().f128811x.equals(parse.getQueryParameter(dm.i4.f66875xa013b0d5))) {
                java.lang.String queryParameter = parse.getQueryParameter(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                java.lang.String decode = java.net.URLDecoder.decode(queryParameter == null ? "" : queryParameter);
                this.f164496e.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, decode);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.m mVar = this.f164498g;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.p pVar = mVar.f164501c;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = mVar.f164499a;
                java.lang.String str = this.f164497f;
                pVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t37 = c0Var.t3();
                if (t37 != null && !android.text.TextUtils.isEmpty(queryParameter) && !android.text.TextUtils.isEmpty(decode) && !android.text.TextUtils.equals(queryParameter, decode)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiScanCode", "checkDecodeError decodePath=%s, doubleDecodePath=%s, result=%s", queryParameter, decode, str);
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7134xbc3bf9f0 c7134xbc3bf9f0 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7134xbc3bf9f0();
                    c7134xbc3bf9f0.f144465d = c7134xbc3bf9f0.b("AppId", t37.f156336n, true);
                    c7134xbc3bf9f0.f144466e = c7134xbc3bf9f0.b("AppUsername", t37.n0(), true);
                    c7134xbc3bf9f0.f144467f = t37.d2();
                    c7134xbc3bf9f0.f144468g = t37.f156338p.f158814g;
                    c7134xbc3bf9f0.f144469h = c7134xbc3bf9f0.b("InstanceId", java.lang.String.valueOf(t37.hashCode()), true);
                    c7134xbc3bf9f0.f144470i = c7134xbc3bf9f0.b("decodePath", queryParameter, true);
                    c7134xbc3bf9f0.f144471j = c7134xbc3bf9f0.b("doubleDecodePath", decode, true);
                    c7134xbc3bf9f0.f144472k = c7134xbc3bf9f0.b("result", str, true);
                    c7134xbc3bf9f0.k();
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.m mVar2 = this.f164498g;
        mVar2.f164499a.a(mVar2.f164500b, mVar2.f164501c.p("ok", this.f164496e));
    }
}
