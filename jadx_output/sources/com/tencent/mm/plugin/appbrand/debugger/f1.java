package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class f1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.g1 f77741a;

    public f1(com.tencent.mm.plugin.appbrand.debugger.g1 g1Var) {
        this.f77741a = g1Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.fn3 fn3Var = (r45.fn3) obj;
        if (fn3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemoteDebugJsEngine", "getsubbusinessinfo cgi failed, null response");
            return null;
        }
        int i17 = fn3Var.BaseResponse.f376959d;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemoteDebugJsEngine", "getsubbusinessinfo cgi failed, errCode = %d, errMsg = %s, rr.resp = %b", java.lang.Integer.valueOf(i17), fn3Var.BaseResponse.f376960e, java.lang.Boolean.FALSE);
            return null;
        }
        com.tencent.mm.plugin.appbrand.debugger.a1 a1Var = this.f77741a.f77750d;
        java.lang.String str = fn3Var.f374461d;
        synchronized (a1Var) {
            a1Var.f77601c = str;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugJsEngine", "loginTicket %s", fn3Var.f374461d);
        tk1.c cVar = this.f77741a.f77753g.f77843a;
        if (!(cVar == null ? false : cVar.isOpen())) {
            return null;
        }
        if (android.text.TextUtils.isEmpty(this.f77741a.f77750d.f77622x)) {
            com.tencent.mm.plugin.appbrand.debugger.g1.u(this.f77741a);
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugJsEngine", "connect with wsEndpoint");
        return null;
    }
}
