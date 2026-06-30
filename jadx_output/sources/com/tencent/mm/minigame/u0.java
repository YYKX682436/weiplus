package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class u0 extends ea5.l {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.minigame.r0 f69147e = new com.tencent.mm.minigame.r0(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f69148f = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public boolean f69149d;

    public final void b(com.tencent.wechat.aff.udr.x xVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WVAFrameworkUDRConfig", "processing wva-framework start. " + xVar.getPath());
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(xVar.getPath());
        if (!r6Var.m()) {
            com.tencent.mm.minigame.p0 p0Var = com.tencent.mm.minigame.p0.f69132a;
            com.tencent.mars.xlog.Log.e("MicroMsg.WVAFrameworkUDRConfig", "postProcess: fromPath not exist: " + r6Var);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WVAFrameworkUDRConfig", "start to copying... prepare dir");
        java.lang.String c17 = xVar.c();
        kotlin.jvm.internal.o.d(c17);
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(c17.concat("/unziptmp"));
        java.lang.String c18 = xVar.c();
        kotlin.jvm.internal.o.d(c18);
        com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(c18.concat("/unzip"));
        if (r6Var2.m()) {
            if (r6Var2.y()) {
                com.tencent.mm.vfs.w6.f(r6Var2.u());
            } else {
                r6Var2.l();
            }
        }
        r6Var2.J();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WVAFrameworkUDRConfig", "prepare dir done, process stream " + r6Var2);
            java.util.zip.ZipInputStream zipInputStream = new java.util.zip.ZipInputStream(new com.tencent.mm.vfs.u6(r6Var));
            try {
                q26.h hVar = new q26.h((q26.i) q26.h0.j(q26.y.e(new com.tencent.mm.minigame.s0(zipInputStream)), com.tencent.mm.minigame.t0.f69145d));
                while (hVar.hasNext()) {
                    java.util.zip.ZipEntry zipEntry = (java.util.zip.ZipEntry) hVar.next();
                    com.tencent.mm.vfs.y6 y6Var = new com.tencent.mm.vfs.y6(new com.tencent.mm.vfs.r6(r6Var2, zipEntry.getName()));
                    try {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WVAFrameworkUDRConfig", "entry: " + zipEntry.getName() + ", copying");
                        vz5.a.b(zipInputStream, y6Var, 0, 2, null);
                        com.tencent.mars.xlog.Log.i("MicroMsg.WVAFrameworkUDRConfig", "entry: " + zipEntry.getName() + ", copied");
                        vz5.b.a(y6Var, null);
                    } finally {
                    }
                }
                vz5.b.a(zipInputStream, null);
            } finally {
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WVAFrameworkUDRConfig", e17, "process stream " + r6Var2, new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WVAFrameworkUDRConfig", "process stream done, moving dir");
        if (r6Var3.m() && r6Var3.y()) {
            com.tencent.mm.vfs.w6.f(r6Var3.u());
        }
        r6Var2.L(r6Var3);
        com.tencent.mars.xlog.Log.i("MicroMsg.WVAFrameworkUDRConfig", "moving dir done, postProcess done : " + r6Var3);
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_c411ffeb";
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void haveSpecifiedResourceAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        super.haveSpecifiedResourceAsync(j17, projectId, name, i17, i18, i19);
        java.lang.String str = i18 == 1002 || (i18 == 0 && i19 == 0 && this.f69149d) ? "成功" : "失败";
        com.tencent.mm.minigame.p0.f69132a.b("WVA 资源准备" + str + ':' + i17 + '(' + i18 + ':' + i19 + ':' + this.f69149d + ')', com.tencent.mm.minigame.k0.f69087e);
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackFailAsync(j17, i17, i18, projectId, name, i19, type);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WVA 资源准备");
        sb6.append(i17 == 1002 ? "成功" : "失败");
        sb6.append(": onCallBackFail ");
        sb6.append(i19);
        sb6.append(' ');
        sb6.append(type.name());
        sb6.append(" -> postProcessSuccess:");
        sb6.append(this.f69149d);
        sb6.append(", type:");
        sb6.append(type);
        sb6.append(", (");
        sb6.append(i17);
        sb6.append(':');
        sb6.append(i18);
        sb6.append(')');
        com.tencent.mars.xlog.Log.i("MicroMsg.WVAFrameworkUDRConfig", sb6.toString());
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void onCallBackSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackSuccessAsync(j17, projectId, name, i17, type);
        com.tencent.mars.xlog.Log.i("MicroMsg.WVAFrameworkUDRConfig", "WVA 资源准备成功: onCallBackSuccess " + i17 + ' ' + type.name() + " -> postProcessSuccess:" + this.f69149d + ", type:" + type.name());
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void postProcessAsync(long j17, com.tencent.wechat.aff.udr.x resource) {
        kotlin.jvm.internal.o.g(resource, "resource");
        super.postProcessAsync(j17, resource);
        try {
            this.f69149d = false;
            b(resource);
            this.f69149d = true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WVAFrameworkUDRConfig", th6, "WVA: wva-framework.zip postProcess failed", new java.lang.Object[0]);
            this.f69149d = false;
            throw th6;
        }
    }
}
