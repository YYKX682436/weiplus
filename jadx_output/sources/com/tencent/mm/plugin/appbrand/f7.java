package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class f7 extends com.tencent.mm.plugin.appbrand.g3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f78045b;

    public f7(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f78045b = o6Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public java.lang.String b() {
        return "WaitForPrefetchGetSettingAuthInfoApplier";
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public void c() {
        this.f78045b.f86191w2 = new u65.a(1, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.f7$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.f7.this.f78045b;
                o6Var.o(new com.tencent.mm.plugin.appbrand.launching.bb(o6Var));
            }
        });
        d();
    }
}
