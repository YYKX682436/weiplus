package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class m8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.r8 f84783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f84784e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(com.tencent.mm.plugin.appbrand.launching.r8 r8Var, java.util.List list) {
        super(1);
        this.f84783d = r8Var;
        this.f84784e = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kotlin.jvm.internal.o.g((java.util.List) obj, "<anonymous parameter 0>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("emitParallelPkgDownloadTasks appId:");
        com.tencent.mm.plugin.appbrand.launching.r8 r8Var = this.f84783d;
        sb6.append(r8Var.f85106d);
        sb6.append(", versionType:");
        sb6.append(r8Var.f85107e);
        sb6.append(", moduleNames:");
        sb6.append(this.f84784e);
        sb6.append(", succeed");
        com.tencent.mars.xlog.Log.i("MicroMsg.LaunchCheckPkgHandlerSeparatedPluginsCompatible", sb6.toString());
        return jz5.f0.f302826a;
    }
}
