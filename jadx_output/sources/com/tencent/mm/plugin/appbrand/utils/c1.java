package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class c1 extends com.tencent.mm.plugin.appbrand.report.k2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.e1 f90396d;

    public c1(com.tencent.mm.plugin.appbrand.utils.e1 e1Var, com.tencent.mm.plugin.appbrand.utils.b1 b1Var) {
        this.f90396d = e1Var;
    }

    @Override // k75.c
    public boolean c(android.os.Message message) {
        if (2 != message.what) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.utils.e1 e1Var = this.f90396d;
        e1Var.o(e1Var.f90409g);
        return true;
    }

    @Override // k75.c, k75.a
    public java.lang.String getName() {
        return this.f90396d.f90411i + "|StateExecuting";
    }
}
