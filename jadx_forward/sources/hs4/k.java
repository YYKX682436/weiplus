package hs4;

/* loaded from: classes9.dex */
public class k implements h45.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.ui.ActivityC19060x1440a18b f366167a;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.ui.ActivityC19060x1440a18b activityC19060x1440a18b) {
        this.f366167a = activityC19060x1440a18b;
    }

    @Override // h45.i
    /* renamed from: onKindaBusinessCallback */
    public void mo24858x44dbb8f3(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("retcode", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletJsApiAdapterUI", "startGetEncryptHKPasswd callback, retcode is %s", java.lang.Integer.valueOf(intExtra));
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.ui.ActivityC19060x1440a18b activityC19060x1440a18b = this.f366167a;
        if (intExtra == 1) {
            activityC19060x1440a18b.setResult(-1, intent);
        } else {
            activityC19060x1440a18b.setResult(0, intent);
        }
        activityC19060x1440a18b.finish();
    }
}
