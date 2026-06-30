package nw;

/* loaded from: classes7.dex */
public final class k extends ie3.j {
    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getProjectId */
    public java.lang.String mo472xca17635e() {
        return "ilinkres_3deef268";
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: haveSpecifiedResourceAsync */
    public void mo14012xafcc46c6(long j17, java.lang.String projectId, java.lang.String name, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        super.mo14012xafcc46c6(j17, projectId, name, i17, i18, i19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UDRMagicEcsTimelineFeatureService", "haveSpecifiedResourceAsync projectId " + projectId + ", name " + name + ", version " + i17 + " errNo " + i18 + " errCode " + i19);
    }

    @Override // ie3.j, ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: postProcessAsync */
    public void mo473xaee99e0d(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x resource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resource, "resource");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UDRMagicEcsTimelineFeatureService", "postProcessAsync " + resource);
        super.mo473xaee99e0d(j17, resource);
    }
}
