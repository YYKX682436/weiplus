package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class u6 extends com.tencent.mm.plugin.appbrand.g3 {

    /* renamed from: b, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.launching.t1 f89270b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f89271c;

    public u6(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f89271c = o6Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public void a() {
        if (this.f89270b != null) {
            ((com.tencent.mm.plugin.appbrand.launching.w1) this.f89270b).a();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public java.lang.String b() {
        return "stepWaitForCommLibConfirm";
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public void c() {
        com.tencent.mm.plugin.appbrand.keylogger.w.g(this.f89271c.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepWaitForCommLibConfirm);
        this.f89270b = com.tencent.mm.plugin.appbrand.launching.d2.a(this.f89271c, new com.tencent.mm.plugin.appbrand.t6(this, this));
    }
}
