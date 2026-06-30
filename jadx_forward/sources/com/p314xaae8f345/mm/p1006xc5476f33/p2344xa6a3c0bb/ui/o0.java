package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

/* loaded from: classes8.dex */
public final class o0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18845xae54c8ee f257800d;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18845xae54c8ee activityC18845xae54c8ee) {
        this.f257800d = activityC18845xae54c8ee;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18845xae54c8ee activityC18845xae54c8ee = this.f257800d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoicePrintStateSettingUI", "resetLogic: delete click");
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18845xae54c8ee.f257737f;
            activityC18845xae54c8ee.U6(3);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoicePrintStateSettingUI", "resetLogic: reset click");
        java.lang.String str = fq4.e0.f347124a;
        if (str == null) {
            str = v61.d.a(1);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("voicelock_create", "view_clk", kz5.c1.k(new jz5.l("voicelock_sessionid", str), new jz5.l("page_id", "50395")), 34575);
        android.content.Intent intent = new android.content.Intent(activityC18845xae54c8ee, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18840xef9a7fc2.class);
        intent.putExtra("KvoicePrintReset", true);
        intent.putExtra("kscene_type", 73);
        intent.putExtra("trans_out_anim", com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        activityC18845xae54c8ee.startActivityForResult(intent, 2);
        activityC18845xae54c8ee.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
    }
}
