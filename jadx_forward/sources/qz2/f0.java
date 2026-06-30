package qz2;

/* loaded from: classes9.dex */
public class f0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15525x4ba2bf8e f449392d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15525x4ba2bf8e activityC15525x4ba2bf8e) {
        this.f449392d = activityC15525x4ba2bf8e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintEntranceUI", "user click the button to open fingerprint pay");
        com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15525x4ba2bf8e activityC15525x4ba2bf8e = this.f449392d;
        j45.l.h(activityC15525x4ba2bf8e, "wallet", ".pwd.ui.WalletPasswordSettingUI");
        activityC15525x4ba2bf8e.finish();
    }
}
