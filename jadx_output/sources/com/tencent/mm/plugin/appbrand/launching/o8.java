package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class o8 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.r8 f84860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f84861e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(com.tencent.mm.plugin.appbrand.launching.r8 r8Var, java.util.List list) {
        super(2);
        this.f84860d = r8Var;
        this.f84861e = list;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("emitParallelPkgDownloadTasks appId:");
        com.tencent.mm.plugin.appbrand.launching.r8 r8Var = this.f84860d;
        sb6.append(r8Var.f85106d);
        sb6.append(", versionType:");
        sb6.append(r8Var.f85107e);
        sb6.append(", moduleNames:");
        sb6.append(this.f84861e);
        sb6.append(", get error(");
        sb6.append(intValue);
        sb6.append(' ');
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(')');
        com.tencent.mars.xlog.Log.e("MicroMsg.LaunchCheckPkgHandlerSeparatedPluginsCompatible", sb6.toString());
        return jz5.f0.f302826a;
    }
}
