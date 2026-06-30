package yv1;

/* loaded from: classes12.dex */
public final class a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5156x300e729d event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5156x300e729d) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.l lVar = event.f135505g;
        if ((lVar.f88735a & 8) == 0 || lVar.f88736b) {
            return false;
        }
        ft.w3 w3Var = (ft.w3) i95.n0.c(ft.w3.class);
        w3Var.getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j0) w3Var).wi("ACTION_CLEAN_APPBRAND_COMMON_SPACE", false);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j0) w3Var).wi("ACTION_CLEAN_ALL_APPBRAND_SPACE", false);
        return true;
    }
}
