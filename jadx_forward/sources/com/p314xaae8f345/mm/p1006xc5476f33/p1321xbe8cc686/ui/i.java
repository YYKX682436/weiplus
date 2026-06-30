package com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui;

/* loaded from: classes8.dex */
public class i extends uh0.v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13097xec982457 f177155b;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13097xec982457 activityC13097xec982457) {
        this.f177155b = activityC13097xec982457;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        if (this.f509272a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileShowUI", "openReadFile, ignore ret = %d", num);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileShowUI", "openReadFile, ret = %d", num);
        uh0.r rVar = (uh0.r) i95.n0.c(uh0.r.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13097xec982457 activityC13097xec982457 = this.f177155b;
        java.lang.String str = activityC13097xec982457.f177111d;
        java.lang.String str2 = activityC13097xec982457.f177112e;
        int intValue = num.intValue();
        ((th0.u) rVar).getClass();
        com.p314xaae8f345.mm.p2829xfa87f9de.i.g(activityC13097xec982457, str, str2, intValue);
        if (num.intValue() != 0) {
            activityC13097xec982457.finish();
        }
    }
}
