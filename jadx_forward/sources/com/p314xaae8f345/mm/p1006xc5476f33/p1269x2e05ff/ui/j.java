package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui;

/* loaded from: classes14.dex */
public class j extends gp1.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n f174835a;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar) {
        this.f174835a = nVar;
    }

    @Override // gp1.b0
    public void a(int i17, int i18, int i19, int i27, boolean z17, boolean z18, int i28, int i29, boolean z19, boolean z27) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0;
        int i37;
        int i38;
        int i39;
        int i47;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "onBallSettled-content, x:%s, y:%s, height:%s, isDockLeft: %s, collapseState: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(i28));
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4 f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f();
            f17.getClass();
            if (i17 != com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174731i) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174731i = i17;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(f17.d()).A("content_pos_x", com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174731i);
            }
            if (i18 != com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174732m) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174732m = i18;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(f17.d()).A("content_pos_y", com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174732m);
            }
            if (z18 != com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174734o) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174734o = z18;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(f17.d()).G("content_dock_left", com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174734o);
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174735p != i28) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174735p = i28;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(f17.d()).A("content_collapse_state", com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174735p);
            }
        }
        if (z27 && (c12929x567537a0 = (nVar = this.f174835a).f174851c) != null && c12929x567537a0.a0()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a02 = nVar.f174851c;
            gp1.k kVar = c12929x567537a02.f175064g2;
            if (kVar != null) {
                android.graphics.Point a17 = kVar.a(i17, i18);
                int i48 = a17.x;
                int i49 = a17.y;
                android.graphics.Point d17 = c12929x567537a02.f175064g2.d(i19, i27);
                int i57 = d17.x;
                i38 = d17.y;
                i39 = i57;
                i47 = i49;
                i37 = i48;
            } else {
                i37 = i17;
                i38 = i27;
                i39 = i19;
                i47 = i18;
            }
            android.graphics.Point x17 = c12929x567537a02.x(null, i37, i47, i39, i38, z18);
            if (x17 != null) {
                c12929x567537a02.z0(x17.x, x17.y, c12929x567537a02.f175068i2, false, true, false);
                c12929x567537a02.I0(c12929x567537a02.f175096x1, x17.x, x17.y, true, false);
            }
        }
    }

    @Override // gp1.b0
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "onCollapseStateChanged-content old: %d, new: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (!gp1.i.a(i18)) {
            if (!(i18 == 0)) {
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12919x6cd8224f c12919x6cd8224f = this.f174835a.f174855g;
        if (c12919x6cd8224f != null) {
            c12919x6cd8224f.m54123x9a37dfc1(false);
        }
    }

    @Override // gp1.b0
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "onCollapsedViewClicked-content");
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = this.f174835a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 c12931xa4a39700 = nVar.f174852d;
        if (c12931xa4a39700 != null && c12931xa4a39700.getVisibility() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12919x6cd8224f c12919x6cd8224f = nVar.f174855g;
            if (c12919x6cd8224f != null) {
                c12919x6cd8224f.m54123x9a37dfc1(true);
            }
            nVar.n();
        }
    }

    @Override // gp1.b0
    public void d(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = this.f174835a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "onBallDragStart needProcessFloatViewFlags: %b", java.lang.Boolean.valueOf(nVar.f174857i));
        if (nVar.f174857i) {
            qp1.j.a(131072, nVar.f174851c);
            qp1.j.a(131072, nVar.f174853e);
        }
        nVar.n();
    }

    @Override // gp1.b0
    public void f() {
        gp1.v vVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = this.f174835a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "onBallDragEnd needProcessFloatViewFlags: %b", java.lang.Boolean.valueOf(nVar.f174857i));
        if (!nVar.f174857i || (vVar = nVar.f174850b) == null || vVar.t(true, new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.i(this))) {
            return;
        }
        nVar.m(131072);
    }

    @Override // gp1.b0
    public void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12919x6cd8224f c12919x6cd8224f = this.f174835a.f174855g;
        if (c12919x6cd8224f != null) {
            c12919x6cd8224f.a(false);
        }
    }
}
