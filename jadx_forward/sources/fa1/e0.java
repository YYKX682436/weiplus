package fa1;

/* loaded from: classes7.dex */
public final class e0 extends ea5.l {

    /* renamed from: d, reason: collision with root package name */
    public boolean f342215d;

    public static final void b() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui("ilinkres_3985331c", "mis");
        if (Ui != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameMISUDRConfig", "checkMisResource: resource exists, version=" + Ui.f299123e);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameMISUDRConfig", "checkMisResource: trigger UDR check");
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q qVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q();
        qVar.c("ilinkres_3985331c");
        java.util.LinkedList linkedList = qVar.f299081e;
        if (linkedList != null) {
            linkedList.add("mis");
        }
        ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Bi(qVar);
    }

    public static final java.lang.String c() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui("ilinkres_3985331c", "mis");
        if (Ui != null) {
            java.lang.String c17 = Ui.c();
            if (!(c17 == null || c17.length() == 0)) {
                if (Ui.f299123e < 4) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WAGameMISUDRConfig", "getMisSoPath: version mismatch, minVersion=4, actual=" + Ui.f299123e);
                    return "";
                }
                java.lang.String str = Ui.c() + "/unzip/libmis.so";
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str);
                if (r6Var.m() && r6Var.A()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameMISUDRConfig", "getMisSoPath: ".concat(str));
                    return str;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameMISUDRConfig", "getMisSoPath: so file not exist at ".concat(str));
                return "";
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameMISUDRConfig", "getMisSoPath: resource not ready");
        return "";
    }

    public final void f(com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x xVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameMISUDRConfig", "postProcess start. " + xVar.m117639xfb83cc9b());
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(xVar.m117639xfb83cc9b());
        if (!r6Var.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAGameMISUDRConfig", "postProcess: fromPath not exist: " + r6Var);
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(xVar.c() + "/unziptmp");
        com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(xVar.c() + "/unzip");
        if (r6Var2.m()) {
            if (r6Var2.y()) {
                com.p314xaae8f345.mm.vfs.w6.f(r6Var2.u());
            } else {
                r6Var2.l();
            }
        }
        r6Var2.J();
        try {
            com.p314xaae8f345.mm.vfs.u6 u6Var = new com.p314xaae8f345.mm.vfs.u6(r6Var);
            try {
                java.util.zip.ZipInputStream zipInputStream = new java.util.zip.ZipInputStream(u6Var);
                try {
                    q26.h hVar = new q26.h((q26.i) q26.h0.j(q26.y.e(new fa1.c0(zipInputStream)), fa1.d0.f342214d));
                    while (hVar.hasNext()) {
                        java.util.zip.ZipEntry zipEntry = (java.util.zip.ZipEntry) hVar.next();
                        com.p314xaae8f345.mm.vfs.y6 y6Var = new com.p314xaae8f345.mm.vfs.y6(new com.p314xaae8f345.mm.vfs.r6(r6Var2, zipEntry.getName()));
                        try {
                            vz5.a.b(zipInputStream, y6Var, 0, 2, null);
                            vz5.b.a(y6Var, null);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameMISUDRConfig", "postProcess: unzip " + zipEntry.getName());
                        } catch (java.lang.Throwable th6) {
                            try {
                                throw th6;
                            } catch (java.lang.Throwable th7) {
                                vz5.b.a(y6Var, th6);
                                throw th7;
                            }
                        }
                    }
                    vz5.b.a(zipInputStream, null);
                    vz5.b.a(u6Var, null);
                    if (r6Var3.m() && r6Var3.y()) {
                        com.p314xaae8f345.mm.vfs.w6.f(r6Var3.u());
                    }
                    r6Var2.L(r6Var3);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameMISUDRConfig", "postProcess done: " + r6Var3);
                } finally {
                }
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WAGameMISUDRConfig", e17, "postProcess unzip failed", new java.lang.Object[0]);
            if (r6Var2.m()) {
                if (r6Var2.y()) {
                    com.p314xaae8f345.mm.vfs.w6.f(r6Var2.u());
                } else {
                    r6Var2.l();
                }
            }
        }
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getProjectId */
    public java.lang.String mo472xca17635e() {
        return "ilinkres_3985331c";
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: haveSpecifiedResourceAsync */
    public void mo14012xafcc46c6(long j17, java.lang.String projectId, java.lang.String name, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        super.mo14012xafcc46c6(j17, projectId, name, i17, i18, i19);
        boolean z17 = i18 == 1002 || (i18 == 0 && i19 == 0 && this.f342215d);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MIS resource prepare ");
        sb6.append(z17 ? ya.b.f77504xbb80cbe3 : "fail");
        sb6.append(": version=");
        sb6.append(i17);
        sb6.append(" (");
        sb6.append(i18);
        sb6.append(':');
        sb6.append(i19);
        sb6.append(':');
        sb6.append(this.f342215d);
        sb6.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameMISUDRConfig", sb6.toString());
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: onCallBackFailAsync */
    public void mo46983xd73276fa(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        super.mo46983xd73276fa(j17, i17, i18, projectId, name, i19, type);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MIS resource ");
        sb6.append(i17 == 1002 ? ya.b.f77504xbb80cbe3 : "fail");
        sb6.append(": version=");
        sb6.append(i19);
        sb6.append(" type=");
        sb6.append(type.name());
        sb6.append(" (");
        sb6.append(i17);
        sb6.append(':');
        sb6.append(i18);
        sb6.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameMISUDRConfig", sb6.toString());
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: onCallBackSuccessAsync */
    public void mo40418x5e6271bd(long j17, java.lang.String projectId, java.lang.String name, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        super.mo40418x5e6271bd(j17, projectId, name, i17, type);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameMISUDRConfig", "MIS resource ready: version=" + i17 + " type=" + type.name());
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: postProcessAsync */
    public void mo473xaee99e0d(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x resource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resource, "resource");
        super.mo473xaee99e0d(j17, resource);
        try {
            this.f342215d = false;
            f(resource);
            this.f342215d = true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WAGameMISUDRConfig", th6, "MIS: postProcess failed", new java.lang.Object[0]);
            this.f342215d = false;
            throw th6;
        }
    }
}
