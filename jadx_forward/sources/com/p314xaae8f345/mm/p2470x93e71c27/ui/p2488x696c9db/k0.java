package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes5.dex */
public class k0 extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public int f273274b = 0;

    @Override // ot0.h
    public ot0.h a() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.k0 k0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.k0();
        k0Var.f273274b = this.f273274b;
        return k0Var;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        sb6.append("<directshare>");
        sb6.append(this.f273274b);
        sb6.append("</directshare>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.directshare");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        this.f273274b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str, 0);
    }
}
