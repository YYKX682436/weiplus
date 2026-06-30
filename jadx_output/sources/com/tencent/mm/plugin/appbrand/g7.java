package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class g7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f78189d;

    public g7(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f78189d = o6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(this.f78189d.f74803n);
        if (b17 != null && this.f78189d != b17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "clearDuplicatedInstanceOnAppCreate duplicated[%d] this[%d]", java.lang.Integer.valueOf(b17.hashCode()), java.lang.Integer.valueOf(hashCode()));
            b17.K2();
        }
        new com.tencent.luggage.sdk.processes.main.LuggageClearDuplicatedTask(this.f78189d).d();
    }
}
