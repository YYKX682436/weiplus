package g10;

/* loaded from: classes7.dex */
public final class y extends ie3.j {
    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getProjectId */
    public java.lang.String mo472xca17635e() {
        return "ilinkres_4274070d";
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: haveSpecifiedResourceAsync */
    public void mo14012xafcc46c6(long j17, java.lang.String projectId, java.lang.String name, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        super.mo14012xafcc46c6(j17, projectId, name, i17, i18, i19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UDRMagicEcsNirvanaFeatureService", "haveSpecifiedResourceAsync: " + projectId + ", " + name + ", " + i17 + ", " + i18 + ", " + i19);
        pm0.v.X(new g10.x(name, i17, i18, i19));
    }
}
