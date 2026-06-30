package e34;

/* loaded from: classes11.dex */
public class m extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public m() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf c5720xee9b9abf = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf) abstractC20979x809547d1;
        if (!(c5720xee9b9abf instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf)) {
            return false;
        }
        am.gk gkVar = c5720xee9b9abf.f136042g;
        int i17 = gkVar.f88303a;
        am.hk hkVar = c5720xee9b9abf.f136043h;
        if (i17 != -4) {
            if (i17 != 12) {
                return false;
            }
            hkVar.f88374e = i34.d.b(gkVar.f88309g);
            return false;
        }
        android.database.Cursor m145256x1d3f4980 = c34.h0.Ni().m145256x1d3f4980("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? order by shakeItemID desc ", "4");
        hkVar.f88372c = new java.util.ArrayList();
        while (m145256x1d3f4980 != null && m145256x1d3f4980.moveToNext()) {
            c34.r rVar = new c34.r();
            rVar.mo9015xbf5d97fd(m145256x1d3f4980);
            ((java.util.ArrayList) hkVar.f88372c).add(h34.v.b(rVar.f66430xbcdbef, 0L));
        }
        if (m145256x1d3f4980 == null) {
            return false;
        }
        m145256x1d3f4980.close();
        return false;
    }
}
