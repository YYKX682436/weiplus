package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class s0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683 f239462d;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683 abstractActivityC17129x6de84683) {
        this.f239462d = abstractActivityC17129x6de84683;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683 abstractActivityC17129x6de84683 = this.f239462d;
        int i17 = abstractActivityC17129x6de84683.f238673m;
        if (i17 == 1 || i17 == 6) {
            abstractActivityC17129x6de84683.Y6();
            abstractActivityC17129x6de84683.finish();
        } else if (i17 == 2 || i17 == 5) {
            abstractActivityC17129x6de84683.finish();
        } else {
            abstractActivityC17129x6de84683.d7();
        }
        abstractActivityC17129x6de84683.W6();
        return true;
    }
}
