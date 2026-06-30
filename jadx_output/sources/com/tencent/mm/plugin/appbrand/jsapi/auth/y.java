package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f79787a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f79788b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f79789c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f79790d;

    public y(java.lang.String scope) {
        kotlin.jvm.internal.o.g(scope, "scope");
        this.f79787a = scope;
        this.f79790d = jz5.h.b(com.tencent.mm.plugin.appbrand.jsapi.auth.x.f79774d);
    }

    public final void a(boolean z17, int i17) {
        java.lang.Object value = ((jz5.n) this.f79790d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        java.lang.String str = this.f79787a;
        ((ch1.d) ((com.tencent.mm.plugin.appbrand.profile.c) value)).c(24877, str, java.lang.Integer.valueOf(this.f79788b ? 1 : 0), java.lang.Integer.valueOf(z17 ? 1 : 0), java.lang.Integer.valueOf(this.f79789c ? 1 : 0), java.lang.Integer.valueOf(i17));
        com.tencent.mars.xlog.Log.i("MicroMsg.AuthorizeReport", "scope=" + str + ", userUserAgreementVisible=" + this.f79788b + ", userUserAgreementChecked=" + z17 + ",  hadTriggerUserUserAgreementAlert=" + this.f79789c + ", action=" + i17);
    }
}
