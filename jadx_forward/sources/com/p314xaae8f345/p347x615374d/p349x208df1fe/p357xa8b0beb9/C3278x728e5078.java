package com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9;

/* renamed from: com.tencent.kinda.framework.sns_cross.T2BUseCaseCallback */
/* loaded from: classes9.dex */
public class C3278x728e5078 implements com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.InterfaceC3267x684dce4d {

    /* renamed from: REQ_DETAIL */
    private static final int f12504x2da46332 = 2;

    /* renamed from: mBean */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.C3275x1c73078d f12505x61f89bd;

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
    /* renamed from: call */
    public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.C3275x1c73078d c3275x1c73078d;
        android.os.Bundle bundle;
        android.content.Context m26001x76847179 = this.f12505x61f89bd.m26001x76847179();
        if (m26001x76847179 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7) {
            android.app.Activity activity = (android.app.Activity) m26001x76847179;
            if (abstractC3411xcfaed72e.mo27551x2fec8307("closeLoading").equals("1")) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7) activity).mo48627xce38d9a();
                return;
            }
            int mo27544xb58848b9 = abstractC3411xcfaed72e.mo27544xb58848b9("retcode");
            java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e.mo27551x2fec8307(ya.b.f77506xba41a63c);
            if (mo27544xb58848b9 != 1 || (c3275x1c73078d = this.f12505x61f89bd) == null || c3275x1c73078d.m26002xed93140() == null || (bundle = this.f12505x61f89bd.m26002xed93140().f273655u) == null) {
                return;
            }
            java.lang.String string = bundle.getString("key_transfer_bill_id");
            android.content.Intent intent = new android.content.Intent(m26001x76847179, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17104xbfbb140e.class);
            intent.putExtra("key_transfer_transaction_id", mo27551x2fec8307);
            intent.putExtra("key_transfer_bill_id", string);
            intent.putExtra("key_enter_scene", 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 activityC17105xa1fb9be7 = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7) activity;
            activityC17105xa1fb9be7.startActivityForResult(intent, 2);
            java.lang.String stringExtra = intent.getStringExtra("key_transfer_transaction_id");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitMoneyInputUI", "do business callback: %s, %s", activityC17105xa1fb9be7.f238046J, stringExtra);
            activityC17105xa1fb9be7.m83099x5406100e(new ow3.c(activityC17105xa1fb9be7.f238046J, stringExtra), false);
            activityC17105xa1fb9be7.L = 1;
            activityC17105xa1fb9be7.m83099x5406100e(new ow3.l(activityC17105xa1fb9be7.f238046J, activityC17105xa1fb9be7.K, 1), false);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.InterfaceC3267x684dce4d
    /* renamed from: setData */
    public void mo25996x76491f2c(android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56) {
        this.f12505x61f89bd = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.C3275x1c73078d(context, c19760x34448d56);
    }
}
