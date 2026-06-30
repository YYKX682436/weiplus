package v62;

/* loaded from: classes12.dex */
public final class d extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public d() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd) abstractC20979x809547d1;
        am.r2 r2Var = c5255x5f3208fd.f135586g;
        if (r2Var.f89292a != 46 || r2Var.f89293b != 0) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtQbarDataManager", "hy: got ext qrcode config. trigger copy");
        com.p314xaae8f345.mm.vfs.w6.c(c5255x5f3208fd.f135586g.f89294c, v62.e.b());
        v62.e.d();
        return false;
    }
}
