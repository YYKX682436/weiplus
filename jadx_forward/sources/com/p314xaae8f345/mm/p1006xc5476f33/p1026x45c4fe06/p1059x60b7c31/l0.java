package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class l0 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m0 f162894a;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m0 m0Var) {
        this.f162894a = m0Var;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m0 m0Var = this.f162894a;
        int i19 = m0Var.f163125f;
        if (i17 != i19) {
            return false;
        }
        if (i19 != i17) {
            return true;
        }
        if (i18 == -1) {
            m0Var.c(i18, intent);
            return true;
        }
        if (intent == null || !intent.hasExtra("result_error_msg")) {
            m0Var.b(-1, "fail:system error {{unknow error}}");
            return true;
        }
        m0Var.b(intent.getIntExtra("result_error_code", -1), intent.getStringExtra("result_error_msg"));
        return true;
    }
}
