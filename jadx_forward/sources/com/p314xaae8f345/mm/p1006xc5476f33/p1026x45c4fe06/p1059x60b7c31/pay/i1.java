package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes7.dex */
public final class i1 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.j1 f164141a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f164142b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f164143c;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.j1 j1Var, java.lang.ref.WeakReference weakReference, int i17) {
        this.f164141a = j1Var;
        this.f164142b = weakReference;
        this.f164143c = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        java.io.Serializable serializable;
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.j1 j1Var = this.f164141a;
        if (j1Var.f164147g != i17) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) this.f164142b.get();
        if (c0Var == null) {
            return true;
        }
        if (intent == null || (serializable = intent.getSerializableExtra("key_result_pay_result")) == null) {
            serializable = com.p314xaae8f345.mm.ui.o2.FAIL;
        }
        com.p314xaae8f345.mm.ui.o2 o2Var = (com.p314xaae8f345.mm.ui.o2) serializable;
        if (intent == null || (str = intent.getStringExtra("key_result_error_msg")) == null) {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiRequestFaceToFacePayment", "[onResult] result=" + o2Var + ", errorMsg" + str);
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
        c0Var.a(this.f164143c, j1Var.o(str2));
        return true;
    }
}
