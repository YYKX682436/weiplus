package az;

/* loaded from: classes7.dex */
public class a implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        java.lang.String g17 = x51.j1.g(p0Var.f70726a.f377561h);
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
            com.tencent.mars.xlog.Log.w("CheckResUpdateSysCmdMsgListener", "msg content is null");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
            return;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(g17, "sysmsg", null);
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(0L, 0L);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = d17 == null ? "null" : java.lang.String.valueOf(d17.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckResUpdateNewXmlParser", "parsed values.size = %s", objArr);
        if (d17 == null) {
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(0L, 30L);
        } else {
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(0L, 31L);
        }
        if (d17 == null || d17.size() <= 0) {
            return;
        }
        java.lang.String str = (java.lang.String) d17.get(".sysmsg.$type");
        if (str == null) {
            str = "";
        }
        if (str.equalsIgnoreCase("resourcemgr")) {
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.v.c(".sysmsg", "delete", d17, true);
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.v.c(".sysmsg", "cache", d17, true);
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.v.c(".sysmsg", "decrypt", d17, true);
        }
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
