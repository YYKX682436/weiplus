package bb0;

/* loaded from: classes4.dex */
public class q0 implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        java.lang.String str2;
        try {
            str2 = p0Var.f70726a.f377558e.f372756d;
        } catch (java.lang.Throwable unused) {
            str2 = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginOpenIM", "OpenIMArchivePopUp fromUser:%s newxml:%s", str2, map);
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.privacy_agreement_url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            return;
        }
        ((i41.l) i95.n0.c(i41.l.class)).Bi().replace(new u41.e(str2, str3));
    }
}
