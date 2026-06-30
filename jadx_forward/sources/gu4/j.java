package gu4;

/* loaded from: classes9.dex */
public class j implements fu4.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c f357485a;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c activityC19200x9865b13c) {
        this.f357485a = activityC19200x9865b13c;
    }

    @Override // fu4.g
    public void h(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "prepare onFinish errCode: %d, errMsg: %s, time: %d", java.lang.Integer.valueOf(i17), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c activityC19200x9865b13c = this.f357485a;
        if (activityC19200x9865b13c.f262839y) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "has cancelled and return");
        } else if (i17 == 0) {
            activityC19200x9865b13c.a7();
        } else {
            activityC19200x9865b13c.c7(activityC19200x9865b13c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.knq));
        }
    }
}
