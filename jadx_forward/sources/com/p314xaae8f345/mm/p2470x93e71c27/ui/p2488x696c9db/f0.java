package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes7.dex */
public class f0 extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f273150b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f273151c;

    /* renamed from: d, reason: collision with root package name */
    public int f273152d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f273153e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f273154f;

    @Override // ot0.h
    public ot0.h a() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f0();
        f0Var.f273150b = this.f273150b;
        f0Var.f273151c = this.f273151c;
        f0Var.f273152d = this.f273152d;
        f0Var.f273153e = this.f273153e;
        f0Var.f273154f = this.f273154f;
        return f0Var;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        sb6.append("<ecskfcard>");
        sb6.append("<framesetname>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f273151c));
        sb6.append("</framesetname>");
        sb6.append("<mbcarddata>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f273150b));
        sb6.append("</mbcarddata>");
        sb6.append("<minupdateunixtimestamp>");
        sb6.append(this.f273152d);
        sb6.append("</minupdateunixtimestamp>");
        sb6.append("<needheader>");
        sb6.append(this.f273153e);
        sb6.append("</needheader>");
        sb6.append("<summary>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f273154f));
        sb6.append("</summary>");
        sb6.append("</ecskfcard>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        this.f273150b = (java.lang.String) map.get(".msg.appmsg.ecskfcard.mbcarddata");
        this.f273151c = (java.lang.String) map.get(".msg.appmsg.ecskfcard.framesetname");
        this.f273152d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.ecskfcard.minupdateunixtimestamp"), 0);
        this.f273153e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.ecskfcard.needheader"), 0) == 1;
        this.f273154f = (java.lang.String) map.get(".msg.appmsg.ecskfcard.summary");
    }
}
