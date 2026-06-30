package w72;

/* loaded from: classes12.dex */
public class l extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public l() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5428xa84a8ad6 c5428xa84a8ad6 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5428xa84a8ad6) abstractC20979x809547d1;
        if (((a82.h2) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).Aj()).f83546f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavNotifyListener", "sending item, do not do sync");
        } else {
            byte[] bArr = c5428xa84a8ad6.f135772g.f89717a;
            ((s72.j0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).sj()).f7(bArr == null ? 5 : kk.u.a(bArr, 0), 4, new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.C10592x57b5d15());
        }
        return false;
    }
}
