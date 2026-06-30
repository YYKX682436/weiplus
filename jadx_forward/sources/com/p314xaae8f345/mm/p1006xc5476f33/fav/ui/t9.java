package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public final class t9 implements com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da f182991a;

    public t9(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar) {
        this.f182991a = daVar;
    }

    public void a(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar = this.f182991a;
        if (daVar.W6(daVar.A) && o72.c2.f424850a.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSearchManager", "[onSelectAllStateChanged] isAllSelected: " + z17);
            java.lang.String string = daVar.m80379x76847179().getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.nxm : com.p314xaae8f345.mm.R.C30867xcad56011.nxf);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            android.app.Activity m80379x76847179 = daVar.m80379x76847179();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m80379x76847179 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m80379x76847179 : null;
            if (abstractActivityC21394xb3d2c0cf != null) {
                abstractActivityC21394xb3d2c0cf.mo60878xf6b21fea(12, string);
            }
        }
    }

    public void b(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onSelectedModeChanged] isSelectedMode: ");
        sb6.append(z17);
        sb6.append(", shouldShowGridList: ");
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar = this.f182991a;
        sb6.append(daVar.W6(daVar.A));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSearchManager", sb6.toString());
        if (daVar.W6(daVar.A) && o72.c2.f424850a.b()) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[onSelectedModeChanged] Calling showOptionMenu: SELECT_ALL=");
            sb7.append(z17);
            sb7.append(", POST=");
            sb7.append(!z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSearchManager", sb7.toString());
            android.app.Activity m80379x76847179 = daVar.m80379x76847179();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m80379x76847179 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m80379x76847179 : null;
            if (abstractActivityC21394xb3d2c0cf != null) {
                abstractActivityC21394xb3d2c0cf.mo74407xb0dfae51(12, z17);
            }
            android.app.Activity m80379x768471792 = daVar.m80379x76847179();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = m80379x768471792 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m80379x768471792 : null;
            if (abstractActivityC21394xb3d2c0cf2 != null) {
                abstractActivityC21394xb3d2c0cf2.mo74407xb0dfae51(11, !z17);
            }
        } else {
            android.app.Activity m80379x768471793 = daVar.m80379x76847179();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf3 = m80379x768471793 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m80379x768471793 : null;
            if (abstractActivityC21394xb3d2c0cf3 != null) {
                abstractActivityC21394xb3d2c0cf3.mo74407xb0dfae51(12, false);
            }
            android.app.Activity m80379x768471794 = daVar.m80379x76847179();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf4 = m80379x768471794 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m80379x768471794 : null;
            if (abstractActivityC21394xb3d2c0cf4 != null) {
                abstractActivityC21394xb3d2c0cf4.mo74407xb0dfae51(11, true);
            }
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSearchManager", "[onSelectedModeChanged] Restoring default title: " + daVar.f182109d);
        android.app.Activity m80379x768471795 = daVar.m80379x76847179();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf5 = m80379x768471795 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m80379x768471795 : null;
        if (abstractActivityC21394xb3d2c0cf5 != null) {
            abstractActivityC21394xb3d2c0cf5.mo54450xbf7c1df6(daVar.f182109d);
        }
    }

    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf;
        boolean z17 = str == null || str.length() == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar = this.f182991a;
        if (z17) {
            android.app.Activity m80379x76847179 = daVar.m80379x76847179();
            abstractActivityC21394xb3d2c0cf = m80379x76847179 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m80379x76847179 : null;
            if (abstractActivityC21394xb3d2c0cf != null) {
                abstractActivityC21394xb3d2c0cf.mo54450xbf7c1df6(daVar.f182109d);
                return;
            }
            return;
        }
        android.app.Activity m80379x768471792 = daVar.m80379x76847179();
        abstractActivityC21394xb3d2c0cf = m80379x768471792 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m80379x768471792 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            abstractActivityC21394xb3d2c0cf.mo54450xbf7c1df6(str);
        }
    }
}
