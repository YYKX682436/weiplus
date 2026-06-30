package tf5;

/* loaded from: classes11.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 f500550d;

    public w(com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 c22342xca74f598) {
        this.f500550d = c22342xca74f598;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().w("@social.black.android", null, null) > 0) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CHATONLY_ENTRANCE_BOOLEAN, java.lang.Boolean.TRUE);
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 c22342xca74f598 = this.f500550d;
            com.p314xaae8f345.mm.ui.p2690x38b72420.g0 g0Var = c22342xca74f598.f288144x;
            if (g0Var != null) {
                g0Var.post(new tf5.v(c22342xca74f598));
            }
        }
    }
}
