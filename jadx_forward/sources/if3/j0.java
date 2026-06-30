package if3;

/* loaded from: classes.dex */
public final class j0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public j0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        if (!"clicfg_masssend_image_migration_enabled".equals(((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5281xaccc9f21) abstractC20979x809547d1).f135605g.f88659a)) {
            return false;
        }
        if (if3.k0.Ni()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreMassSend", "Enable MassSend image migration");
            if3.f0.c(false);
        }
        return true;
    }
}
