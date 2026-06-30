package md3;

/* loaded from: classes7.dex */
public final class s extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f407394f = "MBJsApiOpenGameLiteApp";

    @Override // lc3.c0
    public java.lang.String f() {
        return "openGameLiteApp";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407394f, "url:" + optString);
        java.lang.String optString2 = data.optString("preInjectData");
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
            hashMap.put("preInjectData", optString2);
        }
        cl0.g gVar = new cl0.g(hashMap);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        lc3.e eVar = this.f399423a;
        android.content.Context B0 = eVar != null ? eVar.B0() : null;
        java.lang.String obj = data.toString();
        java.lang.String gVar2 = gVar.toString();
        md3.r rVar = new md3.r(this);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).getClass();
        if (B0 == null) {
            B0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r0 r0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r0();
        r0Var.f221963e = optString;
        r0Var.f36743xf0cd21de = optString;
        r53.f.s(B0, r0Var, obj, gVar2, rVar);
    }
}
