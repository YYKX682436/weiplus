package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class v3 implements zs4.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.w3 f234276a;

    public v3(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.w3 w3Var) {
        this.f234276a = w3Var;
    }

    @Override // zs4.p
    public boolean run(int i17, int i18, java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "getDisclaimer   resultCode=" + i17 + ";errCode=" + i18 + ";errMsg=" + str + ";hadAgree = " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.w3 w3Var = this.f234276a;
        if (i17 == 2) {
            w3Var.f234286d.f234295g.m83099x5406100e(new ys4.j(1, "reward"), false);
        } else if (i17 == 0 && z17) {
            w3Var.f234286d.f234295g.m83099x5406100e(new ys4.j(1, "reward"), false);
        } else {
            android.app.Dialog dialog = w3Var.f234286d.f234295g.f234080y0;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
        return true;
    }
}
