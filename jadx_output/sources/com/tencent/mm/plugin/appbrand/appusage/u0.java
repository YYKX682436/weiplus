package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.c1 f76578d;

    public u0(com.tencent.mm.plugin.appbrand.appusage.c1 c1Var) {
        this.f76578d = c1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (gm0.j1.a()) {
            if (com.tencent.mm.plugin.appbrand.appusage.r0.b() || com.tencent.mm.plugin.appbrand.appusage.r0.c()) {
                return;
            }
            com.tencent.mm.plugin.appbrand.appusage.c1 c1Var = this.f76578d;
            java.lang.Integer num = com.tencent.mm.plugin.appbrand.appusage.x2.f76645d;
            com.tencent.mm.plugin.appbrand.appusage.c1.m0(c1Var, 2, 0, 7, 0L, true, null, -1, -1L, null, null);
        }
    }
}
