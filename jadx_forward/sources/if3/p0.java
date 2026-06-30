package if3;

/* loaded from: classes8.dex */
public class p0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public p0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.util.List list = ((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6202xc28d6d7d) abstractC20979x809547d1).f136455g.f87736b;
        if (list != null) {
            java.util.LinkedList linkedList = (java.util.LinkedList) list;
            if (linkedList.size() > 0) {
                byte[] d17 = x51.j1.d(((r45.n35) linkedList.get(0)).f462591h);
                if (d17 != null && d17.length != 0) {
                    java.lang.String str = new java.lang.String(d17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateMassSendPlaceTopListener", "MassSendTopConfXml:".concat(str));
                    if3.k0.Bi().d(str);
                }
                return false;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UpdateMassSendPlaceTopListener", "empty mass send top config package");
        return false;
    }
}
