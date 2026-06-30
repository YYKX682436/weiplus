package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.KindaTextStatusSetupManagerImpl */
/* loaded from: classes11.dex */
public class C3144x81275b5c implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3572x586b731c {
    private final java.lang.String TAG = "MicorMsg.KindaTextStatusSetupManagerImpl";

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3572x586b731c
    /* renamed from: setupTextStatusImpl */
    public void mo25397xb4ad121c(java.lang.String str, final java.lang.String str2, java.lang.String str3, int i17, final com.p314xaae8f345.p347x615374d.gen.AbstractC3621xc31fe5d4 abstractC3621xc31fe5d4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.KindaTextStatusSetupManagerImpl", "leadViewInfo click jump status");
        pj4.q qVar = new pj4.q();
        qVar.f436788d = str2;
        qVar.f436789e = str3;
        bi4.n1 n1Var = new bi4.n1(null);
        n1Var.f436495d = str;
        n1Var.f436496e = qVar;
        n1Var.f436503o = java.lang.String.valueOf(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24498, 1, str2);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9) ((xe0.g0) i95.n0.c(xe0.g0.class))).Ui(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), n1Var, new bi4.l1() { // from class: com.tencent.kinda.framework.app.KindaTextStatusSetupManagerImpl.1
            @Override // bi4.l1
            /* renamed from: onFinishAction */
            public void mo10624xfbbb8828(int i18, java.lang.String str4, pj4.r0 r0Var) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.KindaTextStatusSetupManagerImpl", "onFinishAction result :%s", java.lang.Integer.valueOf(i18));
                if (i18 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.KindaTextStatusSetupManagerImpl", "onFinishAction click ok");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24498, 3, str2);
                    if (abstractC3621xc31fe5d4 == null || r0Var == null || r0Var.f436805d != 2) {
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.KindaTextStatusSetupManagerImpl", "desc :%s", r0Var.f436806e.f436844d);
                    abstractC3621xc31fe5d4.mo28446x2e7a5e(true, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ksi, r0Var.f436806e.f436844d));
                    return;
                }
                if (i18 == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.KindaTextStatusSetupManagerImpl", "onFinishAction click error");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24498, 4, str2);
                    db5.e1.y(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ksj), "", com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ke6), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.app.KindaTextStatusSetupManagerImpl.1.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(android.content.DialogInterface dialogInterface, int i19) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.KindaTextStatusSetupManagerImpl", "click AlertDialog");
                        }
                    });
                } else {
                    if (i18 != 2) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.KindaTextStatusSetupManagerImpl", "onFinishAction default");
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.KindaTextStatusSetupManagerImpl", "onFinishAction click cancel");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24498, 2, str2);
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3621xc31fe5d4 abstractC3621xc31fe5d42 = abstractC3621xc31fe5d4;
                    if (abstractC3621xc31fe5d42 != null) {
                        abstractC3621xc31fe5d42.mo28446x2e7a5e(false, "");
                    }
                }
            }
        });
    }
}
