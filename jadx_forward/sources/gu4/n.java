package gu4;

/* loaded from: classes9.dex */
public class n implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c f357488d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c activityC19200x9865b13c) {
        this.f357488d = activityC19200x9865b13c;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "cancel not support fingerprint dialog");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c.C;
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c activityC19200x9865b13c = this.f357488d;
        activityC19200x9865b13c.X6();
        activityC19200x9865b13c.Y6(0, 4, "user cancel reset wallet lock");
    }
}
