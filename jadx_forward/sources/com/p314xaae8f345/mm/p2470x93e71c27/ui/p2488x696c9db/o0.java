package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes5.dex */
public final class o0 extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public int f273330b;

    @Override // ot0.h
    public ot0.h a() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o0 o0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o0();
        o0Var.f273330b = this.f273330b;
        return o0Var;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb6, "sb");
        sb6.append("<referfromscene>");
        sb6.append(this.f273330b);
        sb6.append("</referfromscene>");
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        java.lang.String str = (java.lang.String) values.get(".msg.appmsg.referfromscene");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        this.f273330b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str, 0);
    }
}
