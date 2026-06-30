package se4;

/* loaded from: classes9.dex */
public class k implements gm5.a {
    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        nm5.b bVar = (nm5.b) obj;
        java.lang.String e17 = re4.g0.e(1);
        java.lang.String d17 = re4.g0.d(1);
        boolean i17 = wt5.a.i(d17);
        boolean i18 = wt5.a.i(e17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterProcessAuthkeyNameFunc", "need change authkey, new:[%s, %s], old:[%s, %s]", d17, java.lang.Boolean.valueOf(i17), e17, java.lang.Boolean.valueOf(i18));
        if (!i17 && i18) {
            fu5.d.b().a().put(1, e17);
        } else if (i17 && i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterProcessAuthkeyNameFunc", "remove old ak");
            wt5.a.s(e17, false);
        }
        wt5.a.s(re4.g0.e(2), false);
        wt5.a.s(re4.g0.e(3), false);
        return bVar;
    }
}
