package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class v4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f90588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.q4 f90589e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.y4 f90590f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f90591g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(kotlin.jvm.internal.g0 g0Var, com.tencent.mm.plugin.appbrand.utils.q4 q4Var, com.tencent.mm.plugin.appbrand.utils.y4 y4Var, yz5.a aVar) {
        super(0);
        this.f90588d = g0Var;
        this.f90589e = q4Var;
        this.f90590f = y4Var;
        this.f90591g = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        long j17 = this.f90588d.f310121d;
        com.tencent.mm.plugin.appbrand.utils.q4 q4Var = this.f90589e;
        com.tencent.mars.xlog.Log.i("MicroMsg.SimpleAsyncTaskConcurrentExecutor", "MicroMsg.SimpleAsyncTaskConcurrentExecutor|" + this.f90590f.hashCode() + "|end|" + q4Var.f90536d + "|pendingTime|" + (j17 - q4Var.f90538f) + "|runTime|" + (uptimeMillis - j17));
        this.f90591g.invoke();
        return jz5.f0.f302826a;
    }
}
