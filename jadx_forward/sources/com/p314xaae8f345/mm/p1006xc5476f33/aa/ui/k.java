package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class k implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.l f154235d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.l lVar) {
        this.f154235d = lVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreviewHdHeadImg", "onMMMenuItemSelected %s", java.lang.Integer.valueOf(menuItem.getItemId()));
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.l lVar = this.f154235d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            lVar.f154250a.setResult(-1);
            lVar.f154250a.finish();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11339x6e0beaf2 activityC11339x6e0beaf2 = lVar.f154250a;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11339x6e0beaf2.f153962s;
        activityC11339x6e0beaf2.getClass();
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(activityC11339x6e0beaf2, new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.s(activityC11339x6e0beaf2), new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.t(activityC11339x6e0beaf2));
    }
}
