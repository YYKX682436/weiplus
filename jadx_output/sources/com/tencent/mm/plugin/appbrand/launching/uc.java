package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class uc implements com.tencent.mm.plugin.appbrand.service.g6 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f85235a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.g6 f85236b;

    public uc(com.tencent.mm.plugin.appbrand.launching.xc xcVar, com.tencent.mm.plugin.appbrand.service.g6 g6Var) {
        this.f85236b = g6Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.g6
    public void d() {
        if (this.f85235a) {
            return;
        }
        this.f85235a = true;
        com.tencent.mm.plugin.appbrand.service.g6 g6Var = this.f85236b;
        if (g6Var != null) {
            g6Var.d();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.service.g6
    public void e() {
        if (this.f85235a) {
            return;
        }
        this.f85235a = true;
        com.tencent.mm.plugin.appbrand.service.g6 g6Var = this.f85236b;
        if (g6Var != null) {
            g6Var.e();
        }
    }
}
