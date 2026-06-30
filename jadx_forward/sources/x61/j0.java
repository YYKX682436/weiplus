package x61;

/* loaded from: classes12.dex */
public class j0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public j0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5595x1ba86721 c5595x1ba86721 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5595x1ba86721) abstractC20979x809547d1;
        if (c5595x1ba86721 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5595x1ba86721) {
            java.lang.String str = c5595x1ba86721.f135919g.f88956a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GetUsernameByMobileListener", "hy: mobile number is null");
            } else {
                r61.b wi6 = m61.k.wi();
                wi6.getClass();
                android.database.Cursor f17 = wi6.f474352d.f("select addr_upload2.username from addr_upload2 where addr_upload2.moblie = " + str, null, 2);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                while (f17.moveToNext()) {
                    linkedList.add(f17.getString(0));
                }
                f17.close();
                java.lang.String str2 = linkedList.size() == 0 ? "" : (java.lang.String) linkedList.get(0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetUsernameByMobileListener", "hy: username: %s", str2);
                c5595x1ba86721.f135920h.f89064a = str2;
            }
        }
        return false;
    }
}
