package com.tencent.mm.plugin.appbrand.task.ipc;

/* loaded from: classes7.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f89073d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.lang.String str) {
        super(1);
        this.f89073d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.luggage.sdk.processes.s it = (com.tencent.luggage.sdk.processes.s) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String str = it.f47684a;
        java.lang.String str2 = this.f89073d;
        if (kotlin.jvm.internal.o.b(str2, str)) {
            return new com.tencent.mm.plugin.appbrand.task.ipc.AppBrandRuntimeCheckResetToTopOfStackMessage(str2);
        }
        return null;
    }
}
