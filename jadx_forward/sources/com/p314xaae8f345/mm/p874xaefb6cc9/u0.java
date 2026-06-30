package com.p314xaae8f345.mm.p874xaefb6cc9;

/* loaded from: classes7.dex */
public final class u0 extends ea5.l {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p874xaefb6cc9.r0 f150680e = new com.p314xaae8f345.mm.p874xaefb6cc9.r0(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f150681f = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public boolean f150682d;

    public final void b(com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x xVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WVAFrameworkUDRConfig", "processing wva-framework start. " + xVar.m117639xfb83cc9b());
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(xVar.m117639xfb83cc9b());
        if (!r6Var.m()) {
            com.p314xaae8f345.mm.p874xaefb6cc9.p0 p0Var = com.p314xaae8f345.mm.p874xaefb6cc9.p0.f150665a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WVAFrameworkUDRConfig", "postProcess: fromPath not exist: " + r6Var);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WVAFrameworkUDRConfig", "start to copying... prepare dir");
        java.lang.String c17 = xVar.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(c17.concat("/unziptmp"));
        java.lang.String c18 = xVar.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c18);
        com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(c18.concat("/unzip"));
        if (r6Var2.m()) {
            if (r6Var2.y()) {
                com.p314xaae8f345.mm.vfs.w6.f(r6Var2.u());
            } else {
                r6Var2.l();
            }
        }
        r6Var2.J();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WVAFrameworkUDRConfig", "prepare dir done, process stream " + r6Var2);
            java.util.zip.ZipInputStream zipInputStream = new java.util.zip.ZipInputStream(new com.p314xaae8f345.mm.vfs.u6(r6Var));
            try {
                q26.h hVar = new q26.h((q26.i) q26.h0.j(q26.y.e(new com.p314xaae8f345.mm.p874xaefb6cc9.s0(zipInputStream)), com.p314xaae8f345.mm.p874xaefb6cc9.t0.f150678d));
                while (hVar.hasNext()) {
                    java.util.zip.ZipEntry zipEntry = (java.util.zip.ZipEntry) hVar.next();
                    com.p314xaae8f345.mm.vfs.y6 y6Var = new com.p314xaae8f345.mm.vfs.y6(new com.p314xaae8f345.mm.vfs.r6(r6Var2, zipEntry.getName()));
                    try {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WVAFrameworkUDRConfig", "entry: " + zipEntry.getName() + ", copying");
                        vz5.a.b(zipInputStream, y6Var, 0, 2, null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WVAFrameworkUDRConfig", "entry: " + zipEntry.getName() + ", copied");
                        vz5.b.a(y6Var, null);
                    } finally {
                    }
                }
                vz5.b.a(zipInputStream, null);
            } finally {
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WVAFrameworkUDRConfig", e17, "process stream " + r6Var2, new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WVAFrameworkUDRConfig", "process stream done, moving dir");
        if (r6Var3.m() && r6Var3.y()) {
            com.p314xaae8f345.mm.vfs.w6.f(r6Var3.u());
        }
        r6Var2.L(r6Var3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WVAFrameworkUDRConfig", "moving dir done, postProcess done : " + r6Var3);
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getProjectId */
    public java.lang.String mo472xca17635e() {
        return "ilinkres_c411ffeb";
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: haveSpecifiedResourceAsync */
    public void mo14012xafcc46c6(long j17, java.lang.String projectId, java.lang.String name, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        super.mo14012xafcc46c6(j17, projectId, name, i17, i18, i19);
        java.lang.String str = i18 == 1002 || (i18 == 0 && i19 == 0 && this.f150682d) ? "成功" : "失败";
        com.p314xaae8f345.mm.p874xaefb6cc9.p0.f150665a.b("WVA 资源准备" + str + ':' + i17 + '(' + i18 + ':' + i19 + ':' + this.f150682d + ')', com.p314xaae8f345.mm.p874xaefb6cc9.k0.f150620e);
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: onCallBackFailAsync */
    public void mo46983xd73276fa(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        super.mo46983xd73276fa(j17, i17, i18, projectId, name, i19, type);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WVA 资源准备");
        sb6.append(i17 == 1002 ? "成功" : "失败");
        sb6.append(": onCallBackFail ");
        sb6.append(i19);
        sb6.append(' ');
        sb6.append(type.name());
        sb6.append(" -> postProcessSuccess:");
        sb6.append(this.f150682d);
        sb6.append(", type:");
        sb6.append(type);
        sb6.append(", (");
        sb6.append(i17);
        sb6.append(':');
        sb6.append(i18);
        sb6.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WVAFrameworkUDRConfig", sb6.toString());
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: onCallBackSuccessAsync */
    public void mo40418x5e6271bd(long j17, java.lang.String projectId, java.lang.String name, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        super.mo40418x5e6271bd(j17, projectId, name, i17, type);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WVAFrameworkUDRConfig", "WVA 资源准备成功: onCallBackSuccess " + i17 + ' ' + type.name() + " -> postProcessSuccess:" + this.f150682d + ", type:" + type.name());
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: postProcessAsync */
    public void mo473xaee99e0d(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x resource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resource, "resource");
        super.mo473xaee99e0d(j17, resource);
        try {
            this.f150682d = false;
            b(resource);
            this.f150682d = true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WVAFrameworkUDRConfig", th6, "WVA: wva-framework.zip postProcess failed", new java.lang.Object[0]);
            this.f150682d = false;
            throw th6;
        }
    }
}
