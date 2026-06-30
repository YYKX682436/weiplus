package gu4;

/* loaded from: classes9.dex */
public class e implements fu4.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c f357480a;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c activityC19200x9865b13c) {
        this.f357480a = activityC19200x9865b13c;
    }

    @Override // fu4.g
    public void h(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "open fingerprint lock onFinish errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c activityC19200x9865b13c = this.f357480a;
        if (i17 != 0) {
            java.lang.String string = activityC19200x9865b13c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.knr);
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c.C;
            activityC19200x9865b13c.c7(string);
            return;
        }
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c.C;
        activityC19200x9865b13c.V6();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new gu4.f(activityC19200x9865b13c));
        dp.a.m125853x26a183b(activityC19200x9865b13c, com.p314xaae8f345.mm.R.C30867xcad56011.kns, 0).show();
        ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().j(2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.n.INSTANCE.i();
        activityC19200x9865b13c.Y6(-1, 0, "open fingerprint lock ok");
    }
}
