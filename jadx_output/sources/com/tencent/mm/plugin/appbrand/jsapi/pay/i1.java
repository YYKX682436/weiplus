package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public final class i1 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.j1 f82608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f82609b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f82610c;

    public i1(com.tencent.mm.plugin.appbrand.jsapi.pay.j1 j1Var, java.lang.ref.WeakReference weakReference, int i17) {
        this.f82608a = j1Var;
        this.f82609b = weakReference;
        this.f82610c = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        java.io.Serializable serializable;
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.jsapi.pay.j1 j1Var = this.f82608a;
        if (j1Var.f82614g != i17) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) this.f82609b.get();
        if (c0Var == null) {
            return true;
        }
        if (intent == null || (serializable = intent.getSerializableExtra("key_result_pay_result")) == null) {
            serializable = com.tencent.mm.ui.o2.FAIL;
        }
        com.tencent.mm.ui.o2 o2Var = (com.tencent.mm.ui.o2) serializable;
        if (intent == null || (str = intent.getStringExtra("key_result_error_msg")) == null) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i("JsApiRequestFaceToFacePayment", "[onResult] result=" + o2Var + ", errorMsg" + str);
        int ordinal = o2Var.ordinal();
        if (ordinal == 0) {
            str2 = "ok";
        } else if (ordinal == 1) {
            str2 = str.length() == 0 ? "fail" : "fail:".concat(str);
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            str2 = "cancel";
        }
        c0Var.a(this.f82610c, j1Var.o(str2));
        return true;
    }
}
