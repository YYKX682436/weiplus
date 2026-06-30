package ky4;

/* loaded from: classes15.dex */
public class l extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public l() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5971xd6041a28 c5971xd6041a28 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5971xd6041a28) abstractC20979x809547d1;
        if (c5971xd6041a28 == null) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        am.zs zsVar = c5971xd6041a28.f136269g;
        intent.putExtra("intent.key.login.url", zsVar.f90137a);
        intent.putExtra("intent.key.device.name", zsVar.f90138b);
        intent.setFlags(268435456);
        j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "kidswatch", ".ui.login.KidsWatchEntranceUI", intent, null);
        return false;
    }
}
