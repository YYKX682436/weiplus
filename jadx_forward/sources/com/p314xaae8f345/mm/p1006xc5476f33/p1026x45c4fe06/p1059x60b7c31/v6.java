package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class v6 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w6 f165043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f165044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f165045c;

    public v6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w6 w6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i17) {
        this.f165043a = w6Var;
        this.f165044b = d0Var;
        this.f165045c = i17;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiJumpToWCPayMessage", "on Activity result: %s", java.lang.Integer.valueOf(i18));
        boolean z17 = false;
        if (i17 != this.f165043a.f165246g) {
            return false;
        }
        int i19 = this.f165045c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = this.f165044b;
        if (i18 == -1) {
            d0Var.a(i19, "jumpToWCPayMessage:ok");
        } else {
            d0Var.a(i19, "jumpToWCPayMessage:fail");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = d0Var.t3();
        if (intent != null && intent.getIntExtra("closeWebView", 0) == 1) {
            z17 = true;
        }
        if (!z17) {
            t37 = null;
        }
        if (t37 != null) {
            t37.S();
        }
        return true;
    }
}
