package a72;

/* loaded from: classes15.dex */
public class a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5389xc70791db c5389xc70791db = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5389xc70791db) abstractC20979x809547d1;
        if (!(c5389xc70791db instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5389xc70791db)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.ExtCallEventListener", "mismatched event");
            return false;
        }
        am.y7 y7Var = c5389xc70791db.f135723g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1402xa3e55a10.p1403xc52405f1.C13509xc9e1cf84 c13509xc9e1cf84 = new com.p314xaae8f345.mm.p1006xc5476f33.p1402xa3e55a10.p1403xc52405f1.C13509xc9e1cf84(y7Var.f89973c, y7Var.f89971a, y7Var.f89972b);
        am.y7 y7Var2 = c5389xc70791db.f135723g;
        c5389xc70791db.f135724h.f90058a = c13509xc9e1cf84.query(y7Var2.f89974d, null, null, y7Var2.f89975e, null);
        return true;
    }
}
