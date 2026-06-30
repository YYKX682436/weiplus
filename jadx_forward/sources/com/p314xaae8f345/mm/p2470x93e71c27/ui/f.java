package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes4.dex */
public class f implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e f272364d;

    public f(com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e abstractC19633xb84f839e) {
        this.f272364d = abstractC19633xb84f839e;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e abstractC19633xb84f839e = this.f272364d;
        boolean mo61531xc00617a4 = abstractC19633xb84f839e.mo61531xc00617a4();
        int mo64621x25784152 = abstractC19633xb84f839e.mo64621x25784152();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC19633xb84f839e.f271272e, "%s prepare start checker isplaying[%b] currPosMs[%d]", abstractC19633xb84f839e.N(), java.lang.Boolean.valueOf(mo61531xc00617a4), java.lang.Integer.valueOf(mo64621x25784152));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = abstractC19633xb84f839e.f271281q;
        if (f4Var == null || mo64621x25784152 > 50) {
            return false;
        }
        f4Var.b(0.0d);
        return false;
    }
}
