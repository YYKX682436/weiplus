package x61;

/* loaded from: classes11.dex */
public class m0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public m0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        am.au auVar = ((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6005x8a110b2f) abstractC20979x809547d1).f136299g;
        android.content.Intent intent = auVar.f87720a;
        java.lang.String str = auVar.f87721b;
        if (intent == null || str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AccountSyncUtil", "setLocalQQMobile fail, intent = " + intent + ", username = " + str);
            return false;
        }
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        r61.w1 h17 = m61.k.Ri().h(str);
        if (h17 != null) {
            intent.putExtra("Contact_Uin", h17.f474511a);
            intent.putExtra("Contact_QQNick", h17.c());
        }
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        r61.a h18 = m61.k.wi().h(str);
        if (h18 == null) {
            return false;
        }
        intent.putExtra("Contact_Mobile_MD5", h18.e());
        return false;
    }
}
