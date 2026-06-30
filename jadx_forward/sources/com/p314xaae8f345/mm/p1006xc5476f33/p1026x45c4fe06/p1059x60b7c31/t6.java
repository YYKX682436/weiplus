package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class t6 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.u6 f164993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f164994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f164995c;

    public t6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.u6 u6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i17) {
        this.f164993a = u6Var;
        this.f164994b = d0Var;
        this.f164995c = i17;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.u6 u6Var = this.f164993a;
        if (i17 != u6Var.f165034g) {
            return false;
        }
        int i19 = this.f164995c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = this.f164994b;
        if (intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("key_callback");
            if (stringExtra == null) {
                stringExtra = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiJumpToOfflinePay", "callback: %s", stringExtra);
            d0Var.a(i19, u6Var.o(stringExtra));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14954, h45.y.f360501a, "jumpToOfflinePay:ok");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiJumpToOfflinePay", "callback fail");
            d0Var.a(i19, u6Var.o("fail"));
            if (!h45.y.c()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14954, h45.y.f360501a, "jumpToOfflinePay:fail");
            }
        }
        if (h45.y.c()) {
            return true;
        }
        h45.y.f360501a = null;
        return true;
    }
}
