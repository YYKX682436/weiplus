package com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9;

/* renamed from: com.tencent.kinda.framework.sns_cross.MobileRemittanceCaseCallBack */
/* loaded from: classes9.dex */
public class C3269x9ffb89d5 implements com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.InterfaceC3267x684dce4d {

    /* renamed from: mBean */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.C3275x1c73078d f12494x61f89bd;

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
    /* renamed from: call */
    public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        android.content.Context m26001x76847179 = this.f12494x61f89bd.m26001x76847179();
        if (m26001x76847179 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94 activityC17121x70367c94 = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94) m26001x76847179;
            if (abstractC3411xcfaed72e.mo27551x2fec8307("closeLoading").equals("1")) {
                activityC17121x70367c94.m83114xe5d7a18f();
                return;
            }
            int i17 = abstractC3411xcfaed72e.mo27544xb58848b9("retcode") == 1 ? -1 : 0;
            activityC17121x70367c94.m83114xe5d7a18f();
            activityC17121x70367c94.mo48627xce38d9a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "resultCode :%s", java.lang.Integer.valueOf(i17));
            if (i17 == -1) {
                android.content.Intent intent = activityC17121x70367c94.V;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activityC17121x70367c94, arrayList.toArray(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemittanceUI", "onMobileRemittanceResult", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC17121x70367c94.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(activityC17121x70367c94, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemittanceUI", "onMobileRemittanceResult", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.InterfaceC3267x684dce4d
    /* renamed from: setData */
    public void mo25996x76491f2c(android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56) {
        this.f12494x61f89bd = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.C3275x1c73078d(context, c19760x34448d56);
    }
}
