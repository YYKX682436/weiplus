package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class d1 extends com.tencent.mm.plugin.appbrand.report.k2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.e1 f90405d;

    public d1(com.tencent.mm.plugin.appbrand.utils.e1 e1Var, com.tencent.mm.plugin.appbrand.utils.b1 b1Var) {
        this.f90405d = e1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.report.k2, k75.c
    public void a() {
        super.a();
        com.tencent.mm.plugin.appbrand.utils.e1.q(this.f90405d);
    }

    @Override // k75.c
    public boolean c(android.os.Message message) {
        int i17 = message.what;
        if (1 != i17 && 2 != i17) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.utils.e1.q(this.f90405d);
        return true;
    }

    @Override // k75.c, k75.a
    public java.lang.String getName() {
        return this.f90405d.f90411i + "|StateIdle";
    }
}
