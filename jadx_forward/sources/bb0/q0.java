package bb0;

/* loaded from: classes4.dex */
public class q0 implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        java.lang.String str2;
        try {
            str2 = p0Var.f152259a.f459091e.f454289d;
        } catch (java.lang.Throwable unused) {
            str2 = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginOpenIM", "OpenIMArchivePopUp fromUser:%s newxml:%s", str2, map);
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.privacy_agreement_url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            return;
        }
        ((i41.l) i95.n0.c(i41.l.class)).Bi().mo11260x413cb2b4(new u41.e(str2, str3));
    }
}
