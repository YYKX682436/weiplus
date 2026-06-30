package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.u1 f82475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.q f82476e;

    public p(com.tencent.mm.plugin.appbrand.jsapi.q qVar, com.tencent.mm.plugin.appbrand.jsapi.u1 u1Var) {
        this.f82476e = qVar;
        this.f82475d = u1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.q qVar = this.f82476e;
        qVar.f82847h.f81583p.a(qVar.f82844e, qVar.f82842c.k());
        ((com.tencent.mm.plugin.appbrand.jsapi.q) this.f82475d).a();
    }
}
