package com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui;

/* loaded from: classes8.dex */
public class m implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13097xec982457 f177159a;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13097xec982457 activityC13097xec982457) {
        this.f177159a = activityC13097xec982457;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileShowUI", "openReadFile, receiveValue = %s", str);
        boolean equals = "query for feature_wx_float_window successfully".equals(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13097xec982457 activityC13097xec982457 = this.f177159a;
        if (equals) {
            activityC13097xec982457.f177119o = true;
            ((th0.w) ((uh0.s) i95.n0.c(uh0.s.class))).wi(activityC13097xec982457.f177117m.s(), activityC13097xec982457.f177117m.a(), false, false, activityC13097xec982457, activityC13097xec982457.f177111d, activityC13097xec982457.f177114g, activityC13097xec982457.f177112e, activityC13097xec982457.f177115h, 7, activityC13097xec982457.f177123s, activityC13097xec982457.U6(true), true);
            return;
        }
        if ("xwebFileReaderReachEnd".equals(str) || "xwebFileReaderUserOperated".equals(str)) {
            return;
        }
        if ("fileReaderClosed".equals(str)) {
            boolean z17 = activityC13097xec982457.f177118n;
            if (z17) {
                activityC13097xec982457.finish();
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileShowUI", "opCallback isFinishCurPage:%s", java.lang.Boolean.valueOf(z17));
                activityC13097xec982457.f177118n = true;
                return;
            }
        }
        if ("fileReaderMenuClicked".equals(str)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC13097xec982457, 1, false);
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.j(this);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.l(this);
            k0Var.v();
        }
    }
}
