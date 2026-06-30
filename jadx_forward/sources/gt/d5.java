package gt;

/* loaded from: classes7.dex */
public class d5 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public d5() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10 c5691xc916fb10 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10) abstractC20979x809547d1;
        if (!gm0.j1.a()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreAppBrand", "logoutListener.callback(event.data.reason=%d)", java.lang.Integer.valueOf(c5691xc916fb10.f136017g.f88369a));
        int i17 = c5691xc916fb10.f136017g.f88369a;
        if (i17 == 1 || i17 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C().q(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.c.f129164e);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C().q(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.c.f129166g);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2.f156622d.Ni("WxLogout");
        return true;
    }
}
