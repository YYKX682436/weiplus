package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui;

/* loaded from: classes9.dex */
public class n implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13135x13db66fd f177852d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13135x13db66fd activityC13135x13db66fd) {
        this.f177852d = activityC13135x13db66fd;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13135x13db66fd activityC13135x13db66fd = this.f177852d;
        if (itemId == 1) {
            activityC13135x13db66fd.A = "";
            activityC13135x13db66fd.X6();
            activityC13135x13db66fd.a7(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14721, 1, 3);
            return;
        }
        if (itemId != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QrRewardMainUI", "unknown menu: %s", java.lang.Integer.valueOf(menuItem.getItemId()));
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13135x13db66fd.f177760J;
            activityC13135x13db66fd.a7(true);
            return;
        }
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13135x13db66fd.f177760J;
        activityC13135x13db66fd.a7(false);
        activityC13135x13db66fd.f177770p.setCursorVisible(true);
        activityC13135x13db66fd.f177770p.requestFocus();
        activityC13135x13db66fd.f177770p.requestFocusFromTouch();
        activityC13135x13db66fd.f177770p.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.t(activityC13135x13db66fd), 200L);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14721, 1, 4);
    }
}
