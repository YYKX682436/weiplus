package qz2;

/* loaded from: classes9.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15523xe4f09a5a f449405d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15523xe4f09a5a activityC15523xe4f09a5a) {
        this.f449405d = activityC15523xe4f09a5a;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "try fingerprint auth again!");
        com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15523xe4f09a5a activityC15523xe4f09a5a = this.f449405d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15523xe4f09a5a.W6(activityC15523xe4f09a5a);
        activityC15523xe4f09a5a.Z6();
        dialogInterface.dismiss();
    }
}
