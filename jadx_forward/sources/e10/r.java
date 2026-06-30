package e10;

/* loaded from: classes7.dex */
public final class r extends ie3.j {
    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getProjectId */
    public java.lang.String mo472xca17635e() {
        return "ilinkres_b516b52d";
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: haveSpecifiedResourceAsync */
    public void mo14012xafcc46c6(long j17, java.lang.String projectId, java.lang.String name, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        super.mo14012xafcc46c6(j17, projectId, name, i17, i18, i19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UDRMagicEcsPublicServiceFeatureService", "haveSpecifiedResourceAsync projectId " + projectId + ", name " + name + ", version " + i17 + " errNo " + i18 + " errCode " + i19);
    }

    @Override // ie3.j, ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: postProcessAsync */
    public void mo473xaee99e0d(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x resource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resource, "resource");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UDRMagicEcsPublicServiceFeatureService", "postProcessAsync, resource name:" + resource.m117638xfb82e301() + ", path:" + resource.m117639xfb83cc9b() + ", postPath:" + resource.c());
        super.mo473xaee99e0d(j17, resource);
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(resource.c());
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UDRMagicEcsPublicServiceFeatureService", "postPath not exist");
            com.p314xaae8f345.mm.vfs.w6.u(resource.c());
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(resource.m117638xfb82e301(), "EcsGiftOpenAnimation")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UDRMagicEcsPublicServiceFeatureService", "unzipStatus: " + com.p314xaae8f345.mm.vfs.w6.Q(resource.m117639xfb83cc9b(), resource.c()));
        }
    }
}
