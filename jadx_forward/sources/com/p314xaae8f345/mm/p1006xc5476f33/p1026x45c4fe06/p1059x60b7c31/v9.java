package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class v9 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f165046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f165047b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w9 f165048c;

    public v9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w9 w9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i17) {
        this.f165048c = w9Var;
        this.f165046a = d0Var;
        this.f165047b = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w9 w9Var = this.f165048c;
        if (i17 != w9Var.f165256g) {
            return false;
        }
        int i19 = this.f165047b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = this.f165046a;
        if (intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("key_callback");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenOfflinePayView", "callback: %s", stringExtra);
            d0Var.a(i19, w9Var.o(stringExtra));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14954, h45.y.f360501a, "openOfflinePayView:ok");
        } else {
            d0Var.a(i19, w9Var.o("fail"));
            if (!h45.y.c()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14954, h45.y.f360501a, "openOfflinePayView:fail");
            }
        }
        if (h45.y.c()) {
            return true;
        }
        h45.y.f360501a = null;
        return true;
    }
}
