package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class h0 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19012xd0c85d9b f259723a;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19012xd0c85d9b activityC19012xd0c85d9b) {
        this.f259723a = activityC19012xd0c85d9b;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
    /* renamed from: call */
    public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19012xd0c85d9b activityC19012xd0c85d9b = this.f259723a;
        if (abstractC3411xcfaed72e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtCheckPwdInputDialogUI", "hy: verifyPwdPay fail, data is null");
            activityC19012xd0c85d9b.finish();
        } else {
            if (abstractC3411xcfaed72e.mo27544xb58848b9("retCode") != 0) {
                activityC19012xd0c85d9b.finish();
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("lqt_fetch_enc_pwd", abstractC3411xcfaed72e.mo27551x2fec8307("pwd"));
            intent.putExtra("lqt_redeem_listid", activityC19012xd0c85d9b.f259482f);
            activityC19012xd0c85d9b.setResult(-1, intent);
            activityC19012xd0c85d9b.finish();
        }
    }
}
