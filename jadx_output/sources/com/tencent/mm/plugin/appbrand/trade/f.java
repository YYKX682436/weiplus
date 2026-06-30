package com.tencent.mm.plugin.appbrand.trade;

/* loaded from: classes7.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f89242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f89243e;

    public f(com.tencent.mm.plugin.appbrand.o6 o6Var, java.lang.String str) {
        this.f89242d = o6Var;
        this.f89243e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.service.c0 C0 = this.f89242d.C0();
        if (C0 != null) {
            zb1.a aVar = new zb1.a();
            aVar.s("passThroughInfo", this.f89243e);
            C0.p(aVar);
        }
    }
}
