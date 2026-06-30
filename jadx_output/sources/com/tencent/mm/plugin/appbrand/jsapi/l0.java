package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class l0 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.m0 f81361a;

    public l0(com.tencent.mm.plugin.appbrand.jsapi.m0 m0Var) {
        this.f81361a = m0Var;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.m0 m0Var = this.f81361a;
        int i19 = m0Var.f81592f;
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
