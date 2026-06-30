package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class y0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22292xa218e7a1 f288787d;

    public y0(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22292xa218e7a1 activityC22292xa218e7a1) {
        this.f288787d = activityC22292xa218e7a1;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() != 1) {
            return;
        }
        java.lang.String str = this.f288787d.f287881p;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
        if (n17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomContactUI", "userName=%s get Contact is null", str);
            return;
        }
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(str)) {
            n17.s3();
            c01.e2.g0(n17, true);
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
                ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).p0(str, n17);
                return;
            } else {
                ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).k(str);
                ((com.p314xaae8f345.mm.p2621x8fb0427b.b3) c01.d9.b().l()).y0(str);
                return;
            }
        }
        n17.s3();
        vg3.e4 e4Var = (vg3.e4) i95.n0.c(vg3.e4.class);
        java.lang.String d17 = n17.d1();
        ((np.h) e4Var).getClass();
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new p41.u(d17, 2));
        ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).p0(str, n17);
    }
}
