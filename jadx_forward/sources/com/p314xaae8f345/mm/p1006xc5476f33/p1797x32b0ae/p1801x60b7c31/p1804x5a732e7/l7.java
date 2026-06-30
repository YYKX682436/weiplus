package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes9.dex */
public class l7 implements q80.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.m7 f225199a;

    public l7(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.m7 m7Var) {
        this.f225199a = m7Var;
    }

    @Override // q80.x
    /* renamed from: onActivityResult */
    public void mo55562x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.m7 m7Var = this.f225199a;
        if (i17 != 64506) {
            m7Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiSendAppMessage", "onSnsActivityResult receive other code(not $REQ_SNS_SHARE_CODE): $resultCode");
            m7Var.f224975e.b("unknown requestcode");
        } else if (i18 == -1) {
            m7Var.f224975e.d();
        } else if (i18 == 0) {
            m7Var.f224975e.b("cancel");
        } else {
            m7Var.f224975e.b("activity result is invalid, result code: $resultCode");
        }
    }
}
