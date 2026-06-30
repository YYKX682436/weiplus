package t73;

/* loaded from: classes9.dex */
public class e extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public e() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5878xe4738b6a c5878xe4738b6a = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5878xe4738b6a) abstractC20979x809547d1;
        am.up upVar = c5878xe4738b6a.f136186g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ReceiveHoneyPayAppMsgEventIListener", "receive honey pay msg: %s, %s", upVar.f89655b, java.lang.Long.valueOf(upVar.f89654a));
        am.up upVar2 = c5878xe4738b6a.f136186g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(upVar2.f89655b) || upVar2.f89654a <= -1) {
            return false;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(upVar2.f89657d)) {
            java.lang.String j17 = u73.h.j(upVar2.f89656c, upVar2.f89657d, 6);
            if (j17.equals(upVar2.f89656c)) {
                upVar2.f89656c = null;
            } else {
                upVar2.f89656c = j17;
            }
        }
        u73.b bVar = new u73.b();
        bVar.f67673x297eb4f7 = upVar2.f89654a;
        bVar.f67674x6e706659 = upVar2.f89655b;
        ((u73.c) ((q73.f) i95.n0.c(q73.f.class)).f441914d.a()).mo880xb970c2b9(bVar);
        return false;
    }
}
