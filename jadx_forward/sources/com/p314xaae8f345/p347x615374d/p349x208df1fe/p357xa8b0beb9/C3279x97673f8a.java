package com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9;

/* renamed from: com.tencent.kinda.framework.sns_cross.TransferNormalUseCaseCallback */
/* loaded from: classes9.dex */
public class C3279x97673f8a implements com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.InterfaceC3267x684dce4d {

    /* renamed from: mBean */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.C3275x1c73078d f12506x61f89bd;

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
    /* renamed from: call */
    public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        android.content.Context m26001x76847179 = this.f12506x61f89bd.m26001x76847179();
        if ("1".equals(abstractC3411xcfaed72e.mo27551x2fec8307("closeLoading")) && (m26001x76847179 instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e)) {
            if (m26001x76847179 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17134x89ac8704) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17134x89ac8704) m26001x76847179).m83114xe5d7a18f();
                return;
            } else {
                ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) m26001x76847179).mo48627xce38d9a();
                return;
            }
        }
        if (abstractC3411xcfaed72e.mo27542xfb7da360("clear_input_amount") && (m26001x76847179 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17153xbe9612d2)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17153xbe9612d2) m26001x76847179).f238992q.d();
        }
        java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e.mo27551x2fec8307(ya.b.f77506xba41a63c);
        int m26003xccd4de3a = this.f12506x61f89bd.m26003xccd4de3a();
        int mo27544xb58848b9 = abstractC3411xcfaed72e.mo27544xb58848b9("retcode");
        long mo27548xfb822ef2 = abstractC3411xcfaed72e.mo27548xfb822ef2("total_fee");
        int mo27544xb58848b92 = abstractC3411xcfaed72e.mo27544xb58848b9("action");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(abstractC3411xcfaed72e.mo27542xfb7da360("from_wallet_mix"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TransferNormalUseCaseCallback", "call: retCode is :" + mo27544xb58848b9 + ", action is :" + mo27544xb58848b92 + ", fromWalletMix is :" + valueOf);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5411x62f54e20 c5411x62f54e20 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5411x62f54e20();
        java.lang.String mo27551x2fec83072 = abstractC3411xcfaed72e.mo27551x2fec8307("req_key");
        am.g9 g9Var = c5411x62f54e20.f135757g;
        g9Var.f88276a = mo27551x2fec83072;
        if (m26003xccd4de3a == 31 || m26003xccd4de3a == 82) {
            g9Var.getClass();
        } else if (m26003xccd4de3a == 32 || m26003xccd4de3a == 33 || m26003xccd4de3a == 65) {
            g9Var.getClass();
        }
        if (m26003xccd4de3a != 31 && m26003xccd4de3a != 82) {
            g9Var.f88279d = mo27544xb58848b9;
        } else if (mo27544xb58848b9 == 1 && mo27544xb58848b92 == 1) {
            if (valueOf.booleanValue()) {
                g9Var.f88279d = 3;
            } else {
                g9Var.f88279d = 1;
            }
        } else if (mo27544xb58848b9 == 1 && mo27544xb58848b92 == 2) {
            g9Var.f88279d = 2;
        } else if (valueOf.booleanValue() && (mo27544xb58848b9 == -1 || mo27544xb58848b9 == -2)) {
            g9Var.f88279d = 4;
            g9Var.f88281f = abstractC3411xcfaed72e.mo27542xfb7da360("has_try_hkpay");
        }
        g9Var.f88277b = mo27551x2fec8307;
        g9Var.f88278c = true;
        g9Var.f88280e = m26001x76847179.hashCode();
        c5411x62f54e20.e();
        if (m26003xccd4de3a == 31) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5207x4c38dee1 c5207x4c38dee1 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5207x4c38dee1();
        java.lang.String mo27551x2fec83073 = abstractC3411xcfaed72e.mo27551x2fec8307("req_key");
        am.e1 e1Var = c5207x4c38dee1.f135547g;
        e1Var.f88049a = mo27551x2fec83073;
        e1Var.f88050b = mo27551x2fec8307;
        e1Var.f88052d = mo27544xb58848b9;
        e1Var.f88053e = mo27548xfb822ef2 / 100.0d;
        e1Var.f88051c = true;
        e1Var.f88054f = abstractC3411xcfaed72e.mo27544xb58848b9("pay_fail_reason");
        e1Var.f88057i = this.f12506x61f89bd.m25999x74292566();
        e1Var.f88055g = abstractC3411xcfaed72e.mo27544xb58848b9("pay_succ_action");
        e1Var.f88056h = this.f12506x61f89bd.m26000x69d8b8cd();
        c5207x4c38dee1.e();
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.InterfaceC3267x684dce4d
    /* renamed from: setData */
    public void mo25996x76491f2c(android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56) {
        this.f12506x61f89bd = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.C3275x1c73078d(context, c19760x34448d56);
    }
}
