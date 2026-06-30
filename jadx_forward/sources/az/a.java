package az;

/* loaded from: classes7.dex */
public class a implements c01.yc {
    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        java.lang.String g17 = x51.j1.g(p0Var.f152259a.f459094h);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("CheckResUpdateSysCmdMsgListener", "msg content is null");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
            return;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g17, "sysmsg", null);
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(0L, 0L);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = d17 == null ? "null" : java.lang.String.valueOf(d17.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckResUpdateNewXmlParser", "parsed values.size = %s", objArr);
        if (d17 == null) {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(0L, 30L);
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(0L, 31L);
        }
        if (d17 == null || d17.size() <= 0) {
            return;
        }
        java.lang.String str = (java.lang.String) d17.get(".sysmsg.$type");
        if (str == null) {
            str = "";
        }
        if (str.equalsIgnoreCase("resourcemgr")) {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.v.c(".sysmsg", "delete", d17, true);
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.v.c(".sysmsg", "cache", d17, true);
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.v.c(".sysmsg", "decrypt", d17, true);
        }
    }

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}
