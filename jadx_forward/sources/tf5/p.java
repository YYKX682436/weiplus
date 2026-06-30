package tf5;

/* loaded from: classes11.dex */
public final class p implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final tf5.g f500542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 f500543e;

    public p(com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 c22342xca74f598, tf5.g dataItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataItem, "dataItem");
        this.f500543e = c22342xca74f598;
        this.f500542d = dataItem;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            tf5.g gVar = this.f500542d;
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 c22342xca74f598 = this.f500543e;
            if (itemId == 1 || itemId == 2) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = gVar.f500511d;
                int i18 = com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598.S;
                c22342xca74f598.getClass();
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
                n17.s3();
                c01.e2.g0(n17, true);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(n17.d1(), n17);
                return;
            }
            if (itemId == 7) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = gVar.f500511d;
                int i19 = com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598.S;
                android.app.Activity mo7438x76847179 = c22342xca74f598.mo7438x76847179();
                if (mo7438x76847179 == null || !z3Var2.r2()) {
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Contact_User", z3Var2.d1());
                intent.putExtra("view_mode", true);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.m(intent, mo7438x76847179);
                return;
            }
            if (itemId != 8) {
                return;
            }
            ((zc0.h) ((xs.i1) i95.n0.c(xs.i1.class))).bj(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(gVar.f500511d.d1()) + '-' + k35.m1.d("yyyy-MM-dd_HH:mm:ss", c01.id.e()) + ".txt", gVar.f500511d);
        }
    }
}
