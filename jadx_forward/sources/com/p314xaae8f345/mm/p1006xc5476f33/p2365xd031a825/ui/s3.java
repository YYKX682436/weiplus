package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class s3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362 f262143d;

    public s3(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362 activityC19112x755f8362) {
        this.f262143d = activityC19112x755f8362;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362.B;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362 activityC19112x755f8362 = this.f262143d;
        com.p314xaae8f345.mm.p2802xd031a825.h m83108x2b5a5a39 = activityC19112x755f8362.m83108x2b5a5a39();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.WalletCheckPwdUI", "onbackbtn click");
        if (m83108x2b5a5a39 == null) {
            activityC19112x755f8362.W6(0);
        } else if (m83108x2b5a5a39 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a) {
            m83108x2b5a5a39.c(activityC19112x755f8362, 0);
        } else if (activityC19112x755f8362.f261520o) {
            m83108x2b5a5a39.f295334c.putInt("key_process_result_code", 0);
            m83108x2b5a5a39.f(activityC19112x755f8362, m83108x2b5a5a39.f295334c);
        } else if (m83108x2b5a5a39.e().equals("OpenECardProcess")) {
            activityC19112x755f8362.m83105x7498fe14().putInt("key_process_result_code", 0);
            activityC19112x755f8362.setResult(-1);
            m83108x2b5a5a39.f(activityC19112x755f8362, activityC19112x755f8362.m83105x7498fe14());
        } else if (m83108x2b5a5a39.e().equals("PayProcess")) {
            activityC19112x755f8362.m83105x7498fe14().putInt("key_process_result_code", 0);
            activityC19112x755f8362.setResult(-1);
            m83108x2b5a5a39.f(activityC19112x755f8362.mo55332x76847179(), activityC19112x755f8362.m83105x7498fe14());
        } else if (m83108x2b5a5a39.e().equals("BindCardProcess")) {
            activityC19112x755f8362.m83105x7498fe14().putInt("key_process_result_code", 0);
            activityC19112x755f8362.setResult(-1);
            m83108x2b5a5a39.f(activityC19112x755f8362.mo55332x76847179(), activityC19112x755f8362.m83105x7498fe14());
        } else if (m83108x2b5a5a39.e().equals("OfflineProcess")) {
            activityC19112x755f8362.m83105x7498fe14().putInt("key_process_result_code", 0);
            activityC19112x755f8362.setResult(-1);
            m83108x2b5a5a39.g(activityC19112x755f8362);
        } else if (m83108x2b5a5a39.e().equals("FingerprintAuth")) {
            activityC19112x755f8362.m83105x7498fe14().putInt("key_process_result_code", 0);
            activityC19112x755f8362.setResult(-1);
            m83108x2b5a5a39.f(activityC19112x755f8362.mo55332x76847179(), activityC19112x755f8362.m83105x7498fe14());
        }
        activityC19112x755f8362.finish();
        return false;
    }
}
