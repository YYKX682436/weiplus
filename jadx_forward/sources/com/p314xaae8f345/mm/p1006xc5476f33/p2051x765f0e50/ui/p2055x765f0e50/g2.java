package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class g2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e f242597d;

    public g2(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e activityC17388xa7b1222e) {
        this.f242597d = activityC17388xa7b1222e;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e activityC17388xa7b1222e = this.f242597d;
        if (itemId == 1) {
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e.C;
            activityC17388xa7b1222e.getClass();
            ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(activityC17388xa7b1222e, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.v2(activityC17388xa7b1222e), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.d2(activityC17388xa7b1222e));
            return;
        }
        if (itemId == 2) {
            java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e.C;
            activityC17388xa7b1222e.V6(0);
            return;
        }
        if (itemId != 3) {
            if (itemId != 4) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e.U6(activityC17388xa7b1222e);
        } else {
            if (iq.b.g(activityC17388xa7b1222e.mo55332x76847179()) || iq.b.x(activityC17388xa7b1222e.mo55332x76847179()) || iq.b.c(activityC17388xa7b1222e.mo55332x76847179(), true)) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_scan_report_enter_scene", 4);
            j45.l.j(activityC17388xa7b1222e.mo55332x76847179(), "scanner", ".ui.BaseScanUI", intent, null);
        }
    }
}
