package gt4;

/* loaded from: classes9.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19146xd2600a18 f357088d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19146xd2600a18 c19146xd2600a18) {
        this.f357088d = c19146xd2600a18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19146xd2600a18 c19146xd2600a18 = this.f357088d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletAwardShakeAnimView", "delayNotifyClick, isInvokeCallback: %s", java.lang.Boolean.valueOf(c19146xd2600a18.f262240i));
        if (c19146xd2600a18.f262240i) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19146xd2600a18.f262243o)) {
            c19146xd2600a18.f262236e.setText(c19146xd2600a18.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kzv));
        } else {
            c19146xd2600a18.f262236e.setText(c19146xd2600a18.f262243o);
        }
        int i17 = c19146xd2600a18.f262244p;
        if (i17 != 0) {
            c19146xd2600a18.f262236e.setTextColor(i17);
        }
    }
}
