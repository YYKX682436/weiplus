package yo3;

/* loaded from: classes9.dex */
public class j implements c01.qa {
    @Override // c01.qa
    public void a(com.p314xaae8f345.mm.p971x6de15a2e.s sVar) {
        if (sVar == null || sVar.G() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletOfflineUtil", "doLocalProxyScene dispatcher == null || dispatcher.getAccInfo() == null");
            return;
        }
        byte[] v17 = sVar.G().v("offline_token");
        if (v17 != null) {
            yo3.m.f545687a = new java.lang.String(v17);
        }
        byte[] v18 = sVar.G().v("offline_token_V2");
        if (v18 != null) {
            yo3.m.f545688b = new java.lang.String(v18);
        }
        byte[] v19 = sVar.G().v("offline_key_list");
        if (v19 != null) {
            yo3.m.f545690d = new java.lang.String(v19);
        }
    }
}
