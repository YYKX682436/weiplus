package su1;

/* loaded from: classes.dex */
public final class l extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public l() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.String str;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5972xef01e283 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5972xef01e283) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!(((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).length() == 0)) {
            if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screen_cast_pc_forbidden, false)) {
                am.at atVar = event.f136270g;
                if (atVar != null && (str = atVar.f87719a) != null) {
                    new uu1.a(str).mo807x6c193ac1(gm0.j1.d().f152297d, new su1.k(this));
                }
                return true;
            }
        }
        j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "cast", ".ui.ScreenCastActivity", new android.content.Intent(), null);
        return true;
    }
}
