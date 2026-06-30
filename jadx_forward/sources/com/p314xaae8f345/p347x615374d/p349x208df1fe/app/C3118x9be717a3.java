package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.KTransferPayServiceImpl */
/* loaded from: classes9.dex */
public class C3118x9be717a3 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3539xe8a6ae3 {
    private static final java.lang.String TAG = "MicroMsg.KTransferPayServiceImpl";

    /* renamed from: mCheckSurnameCancelCallBack */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 f11937x43b36cdf = null;

    /* renamed from: mCheckSurnameConfirmCallBack */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3635x710ca4a f11938x946fbb65 = null;

    /* renamed from: mCheckAmountCancelCallBack */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 f11935xb77db8b2 = null;

    /* renamed from: mCheckAmountConfirmCallBack */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3627x83447f8 f11936x99eee9f2 = null;

    /* renamed from: mLargeMoneyListener */
    private com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f11939xb12b166 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5904x24321495>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.kinda.framework.app.KTransferPayServiceImpl.2
        {
            this.f39173x3fe91575 = -84556123;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5904x24321495 c5904x24321495) {
            am.rq rqVar;
            if (c5904x24321495 != null && (rqVar = c5904x24321495.f136209g) != null) {
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3118x9be717a3.this.f11936x99eee9f2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3118x9be717a3.TAG, "mCheckAmountConfirmCallBack == null");
                    return false;
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3118x9be717a3.this.f11936x99eee9f2.mo28475x2e7a5e((int) java.lang.Math.round(rqVar.f89368b * 100.0d));
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3118x9be717a3.this.f11939xb12b166.mo48814x2efc64();
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3118x9be717a3.TAG, "event == null || event.data == null");
            return false;
        }
    };

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3539xe8a6ae3
    /* renamed from: startTransferCheckAmountImpl */
    public void mo25072x28886393(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, com.p314xaae8f345.p347x615374d.gen.AbstractC3627x83447f8 abstractC3627x83447f8) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startTransferCheckAmountImpl");
        this.f11936x99eee9f2 = abstractC3627x83447f8;
        this.f11935xb77db8b2 = abstractC3623x3b485619;
        java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e.mo27551x2fec8307(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        java.lang.String mo27551x2fec83072 = abstractC3411xcfaed72e.mo27551x2fec8307("sub_title");
        java.lang.String mo27551x2fec83073 = abstractC3411xcfaed72e.mo27551x2fec8307("prepay_page_payee");
        java.lang.String mo27551x2fec83074 = abstractC3411xcfaed72e.mo27551x2fec8307("receiver_username");
        java.lang.String mo27551x2fec83075 = abstractC3411xcfaed72e.mo27551x2fec8307("displayname_with_true_name");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_amount_remind_bit", 4);
        intent.putExtra("key_title", mo27551x2fec8307);
        this.f11939xb12b166.mo48813x58998cd();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo27551x2fec83075)) {
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 q17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(mo27551x2fec83074);
            mo27551x2fec83075 = q17 != null ? com.p314xaae8f345.mm.p2802xd031a825.ui.r1.H(q17.g2()) : "";
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo27551x2fec83072) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo27551x2fec83075)) {
            intent.putExtra("key_desc", mo27551x2fec83072.replace("${receiver_name}", mo27551x2fec83075));
        }
        intent.putExtra("key_display_name", mo27551x2fec83073);
        intent.putExtra("key_place_attach", "");
        android.app.Activity m27313x7608d9c4 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4();
        intent.setClass(m27313x7608d9c4, com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2379xebc86edc.ui.ActivityC19176x54f7b127.class);
        intent.putExtra("MMActivity.OverrideEnterAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea);
        intent.putExtra("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(7);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(m27313x7608d9c4, arrayList.toArray(), "com/tencent/kinda/framework/app/KTransferPayServiceImpl", "startTransferCheckAmountImpl", "(Lcom/tencent/kinda/gen/ITransmitKvData;Lcom/tencent/kinda/gen/VoidCallback;Lcom/tencent/kinda/gen/VoidI64Callback;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3539xe8a6ae3
    /* renamed from: startTransferCheckSurnameImpl */
    public void mo25073x2e607800(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, com.p314xaae8f345.p347x615374d.gen.AbstractC3635x710ca4a abstractC3635x710ca4a) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startTransferCheckSurnameImpl");
        java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e.mo27551x2fec8307(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        java.lang.String mo27551x2fec83072 = abstractC3411xcfaed72e.mo27551x2fec8307("sub_title");
        java.lang.String mo27551x2fec83073 = abstractC3411xcfaed72e.mo27551x2fec8307("display_name");
        java.lang.String mo27551x2fec83074 = abstractC3411xcfaed72e.mo27551x2fec8307("confirm_button_text");
        java.lang.String mo27551x2fec83075 = abstractC3411xcfaed72e.mo27551x2fec8307("cancel_button_text");
        r45.o10 o10Var = new r45.o10();
        o10Var.f463343d = mo27551x2fec8307;
        o10Var.f463344e = mo27551x2fec83072;
        o10Var.f463345f = mo27551x2fec83073;
        this.f11937x43b36cdf = abstractC3623x3b485619;
        this.f11938x946fbb65 = abstractC3635x710ca4a;
        final android.app.Activity m27313x7608d9c4 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4();
        if (m27313x7608d9c4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7) {
            new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.b0(m27313x7608d9c4).a(0, "", o10Var, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a0() { // from class: com.tencent.kinda.framework.app.KTransferPayServiceImpl.1
                @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a0
                /* renamed from: onCancel */
                public void mo25075x3d6f0539() {
                    if (com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3118x9be717a3.this.f11937x43b36cdf != null) {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3118x9be717a3.this.f11937x43b36cdf.mo25801x2e7a5e();
                        android.app.Activity activity = m27313x7608d9c4;
                        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7 abstractActivityC17142x347c74c7 = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7) activity;
                            abstractActivityC17142x347c74c7.f238992q.p();
                            abstractActivityC17142x347c74c7.m83136xb67ebaa8();
                        }
                    }
                }

                @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a0
                /* renamed from: onINputName */
                public void mo25076x67bff276(java.lang.String str) {
                    if (com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3118x9be717a3.this.f11938x946fbb65 != null) {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3118x9be717a3.this.f11938x946fbb65.mo28515x2e7a5e(str);
                    }
                }
            }, mo27551x2fec83074, mo27551x2fec83075);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3539xe8a6ae3
    /* renamed from: stopTransferCheckAmount */
    public void mo25074xecc50733() {
        android.app.Activity m27313x7608d9c4 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4();
        if (m27313x7608d9c4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2379xebc86edc.ui.ActivityC19176x54f7b127) {
            m27313x7608d9c4.finish();
        }
    }
}
