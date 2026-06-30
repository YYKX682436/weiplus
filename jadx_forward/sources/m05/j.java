package m05;

/* loaded from: classes5.dex */
public final class j implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.l0 f404104d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.m1 f404105e;

    public j(com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f404104d = l0Var;
        this.f404105e = m1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.String mo13823xb5887636;
        java.lang.String mo13823xb58876362;
        com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var = this.f404104d;
        if (l0Var != null) {
            l0Var.mo804x5f9cdc6f(i17, i18, i19, str, v0Var, bArr);
        }
        if (!((v0Var == null || (mo13823xb58876362 = v0Var.mo13823xb5887636()) == null || !r26.n0.B(mo13823xb58876362, "mmpay-bin", false)) ? false : true) == true || i18 == 0 || i19 == 0) {
            return;
        }
        if (((v0Var == null || (mo13823xb5887636 = v0Var.mo13823xb5887636()) == null || !mo13823xb5887636.equals("/cgi-bin/mmpay-bin/cpucardgetconfig2")) ? false : true) == true && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("autoauth_errmsg_", str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WcPayReport", "ignore bad case");
            return;
        }
        v0Var.mo13823xb5887636();
        java.lang.String mo13823xb58876363 = v0Var.mo13823xb5887636();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo13823xb58876363, "getUri(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i18);
        sb6.append(':');
        sb6.append(i19);
        java.lang.String errorCode = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorCode, "errorCode");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24610, "1", mo13823xb58876363, errorCode, str, "", java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.bk.C() ? 1 : 0), java.lang.Integer.valueOf(j65.e.b() ? 1 : 0), java.lang.Integer.valueOf(i65.a.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) <= 1.0f ? 0 : 1));
    }
}
