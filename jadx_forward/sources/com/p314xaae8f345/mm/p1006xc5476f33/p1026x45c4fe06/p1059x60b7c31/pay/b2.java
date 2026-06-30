package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes7.dex */
public final class b2 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.c2 f164117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f164118b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f164119c;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.c2 c2Var, java.lang.ref.WeakReference weakReference, int i17) {
        this.f164117a = c2Var;
        this.f164118b = weakReference;
        this.f164119c = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        java.io.Serializable serializable;
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.c2 c2Var = this.f164117a;
        if (c2Var.f164123g != i17) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) this.f164118b.get();
        if (c0Var == null) {
            return true;
        }
        if (intent == null || (serializable = intent.getSerializableExtra("key_result_pay_result")) == null) {
            serializable = com.p314xaae8f345.mm.ui.s2.FAIL;
        }
        com.p314xaae8f345.mm.ui.s2 s2Var = (com.p314xaae8f345.mm.ui.s2) serializable;
        if (intent == null || (str = intent.getStringExtra("key_result_error_msg")) == null) {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiRequestPersonalPay", "[onResult] result=" + s2Var + ", errorMsg" + str);
        int ordinal = s2Var.ordinal();
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
        c0Var.a(this.f164119c, c2Var.o(str2));
        return true;
    }
}
