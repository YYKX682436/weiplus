package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes7.dex */
public class f1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1 f159274a;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1 g1Var) {
        this.f159274a = g1Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.fn3 fn3Var = (r45.fn3) obj;
        if (fn3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteDebugJsEngine", "getsubbusinessinfo cgi failed, null response");
            return null;
        }
        int i17 = fn3Var.f76492x92037252.f458492d;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteDebugJsEngine", "getsubbusinessinfo cgi failed, errCode = %d, errMsg = %s, rr.resp = %b", java.lang.Integer.valueOf(i17), fn3Var.f76492x92037252.f458493e, java.lang.Boolean.FALSE);
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var = this.f159274a.f159283d;
        java.lang.String str = fn3Var.f455994d;
        synchronized (a1Var) {
            a1Var.f159134c = str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugJsEngine", "loginTicket %s", fn3Var.f455994d);
        tk1.c cVar = this.f159274a.f159286g.f159376a;
        if (!(cVar == null ? false : cVar.m166713xb9a70294())) {
            return null;
        }
        if (android.text.TextUtils.isEmpty(this.f159274a.f159283d.f159155x)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1.u(this.f159274a);
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugJsEngine", "connect with wsEndpoint");
        return null;
    }
}
