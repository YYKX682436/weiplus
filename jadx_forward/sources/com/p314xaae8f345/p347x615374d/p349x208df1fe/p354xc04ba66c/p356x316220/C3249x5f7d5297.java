package com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220;

/* renamed from: com.tencent.kinda.framework.module.impl.KindaWalletMixManagerImpl */
/* loaded from: classes9.dex */
public class C3249x5f7d5297 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3573x19bc3fd7 {
    private static final java.lang.String TAG = "KindaWalletMixManagerImpl";

    /* renamed from: mCancelCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 f12442x8952a2ac;

    /* renamed from: mSuccessCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3628xfac5d5f f12443xad87413b;

    /* renamed from: mWalletPayResultEventIListener */
    private com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e> f12444x8095e762 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.kinda.framework.module.impl.KindaWalletMixManagerImpl.1
        {
            this.f39173x3fe91575 = 520089918;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e) {
            int i17 = c6249x2aa12f2e.f136498g.f89396c;
            if (i17 == 0) {
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3249x5f7d5297.this.f12442x8952a2ac != null) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3249x5f7d5297.this.f12444x8095e762.mo48814x2efc64();
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3249x5f7d5297.this.f12442x8952a2ac.mo25801x2e7a5e();
                }
            } else if (i17 == -1 && com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3249x5f7d5297.this.f12443xad87413b != null) {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                android.content.Intent intent = c6249x2aa12f2e.f136498g.f89394a;
                if (intent != null) {
                    m27539xaf65a0fc.mo27556xf2e34299("is_jsapi_close_page", "1".equals(intent.getStringExtra("is_jsapi_close_page")));
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3249x5f7d5297.this.f12444x8095e762.mo48814x2efc64();
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3249x5f7d5297.this.f12443xad87413b.mo28480x2e7a5e(m27539xaf65a0fc);
            }
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3249x5f7d5297.this.f12444x8095e762.mo48814x2efc64();
            return false;
        }
    };

    /* renamed from: genWalletMixSpGenPrePayRespFromUrl */
    private r45.v67 m25936x8acce9d0(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        if (android.text.TextUtils.isEmpty(str) || abstractC3411xcfaed72e == null) {
            return null;
        }
        r45.v67 v67Var = new r45.v67();
        v67Var.f469486d = str;
        v67Var.f469488f = false;
        v67Var.f469489g = "";
        v67Var.f469487e = null;
        if (abstractC3411xcfaed72e.mo27542xfb7da360("hasCallbackRetryConf")) {
            r45.ws wsVar = new r45.ws();
            v67Var.f469487e = wsVar;
            wsVar.f470941e = abstractC3411xcfaed72e.mo27544xb58848b9("maxCount");
            v67Var.f469487e.f470940d = abstractC3411xcfaed72e.mo27544xb58848b9("intevalTime");
            v67Var.f469487e.f470942f = abstractC3411xcfaed72e.mo27551x2fec8307("defaultWording");
        }
        return v67Var;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3573x19bc3fd7
    /* renamed from: startWalletMixUseCaseImpl */
    public void mo25937xac8bc7f6(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e, com.p314xaae8f345.p347x615374d.gen.AbstractC3628xfac5d5f abstractC3628xfac5d5f, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856192) {
        r45.v67 m25936x8acce9d0 = m25936x8acce9d0(str, abstractC3411xcfaed72e);
        if (m25936x8acce9d0 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m25936x8acce9d0.f469486d)) {
            android.app.Activity m27313x7608d9c4 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4();
            if (m27313x7608d9c4 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "KindaWalletMixManagerImpl startWalletMixUseCaseImpl() KindaContext.getTopOrUIPageFragmentActivity() return null!");
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("prepayId", abstractC3411xcfaed72e.mo27551x2fec8307("prepayId"));
            intent.putExtra("is_jsapi_offline_pay", false);
            intent.putExtra("pay_gate_url", m25936x8acce9d0.f469486d);
            intent.putExtra("need_dialog", m25936x8acce9d0.f469488f);
            intent.putExtra("dialog_text", m25936x8acce9d0.f469489g);
            r45.ws wsVar = m25936x8acce9d0.f469487e;
            if (wsVar != null) {
                intent.putExtra("max_count", wsVar.f470941e);
                intent.putExtra("inteval_time", m25936x8acce9d0.f469487e.f470940d);
                intent.putExtra("default_wording", m25936x8acce9d0.f469487e.f470942f);
            }
            j45.l.k(m27313x7608d9c4, "wallet_core", ".ui.WalletMixOrderInfoUI", intent, true);
        }
        this.f12443xad87413b = abstractC3628xfac5d5f;
        this.f12442x8952a2ac = abstractC3623x3b485619;
        this.f12444x8095e762.mo48813x58998cd();
    }
}
