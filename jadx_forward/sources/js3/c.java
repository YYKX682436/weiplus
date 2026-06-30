package js3;

/* loaded from: classes8.dex */
public class c implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_BIND_XMAIL_STRING_SYNC, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetBindMailTask", "last bind xmail %s", str);
        int q17 = gm0.j1.u().c().q(9, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetBindMailTask", "bindXMail %s, bindQQ %d, extUserStatus %d", str, java.lang.Integer.valueOf(q17), java.lang.Integer.valueOf(gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_USER_STATUS_INT_SYNC, 0)));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (q17 != 0) {
                str = q17 + "@qq.com";
            } else {
                str = "";
            }
        }
        return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str);
    }
}
