package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes14.dex */
public final class z6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.b7 f76672d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(com.tencent.mm.plugin.appbrand.appusage.b7 b7Var) {
        super(0);
        this.f76672d = b7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f76672d.f76395g.getAndSet(false) && !this.f76672d.f76393e) {
            com.tencent.mm.plugin.appbrand.appusage.b7 b7Var = this.f76672d;
            if (b7Var.f76394f) {
                b7Var.f76394f = false;
                pm0.v.O(b7Var.f76392d, new com.tencent.mm.plugin.appbrand.appusage.a7(b7Var));
            }
        }
        return jz5.f0.f302826a;
    }
}
