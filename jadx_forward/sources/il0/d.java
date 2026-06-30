package il0;

/* loaded from: classes7.dex */
public class d extends ea5.l {
    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getProjectId */
    public java.lang.String mo472xca17635e() {
        return "ilinkres_6d2cb220";
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: onCallBackFailAsync */
    public void mo46983xd73276fa(long j17, int i17, int i18, java.lang.String str, java.lang.String str2, int i19, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r rVar) {
        super.mo46983xd73276fa(j17, i17, i18, str, str2, i19, rVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.DiscoveryReddotEnv.UDRResource", "download fail. projectId:%s, name:%s, version:%s, type:%s, errNo:%d, errCode:%d", str, str2, java.lang.Integer.valueOf(i19), rVar.name(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: onCallBackSuccessAsync */
    public void mo40418x5e6271bd(long j17, java.lang.String str, java.lang.String str2, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r rVar) {
        super.mo40418x5e6271bd(j17, str, str2, i17, rVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.DiscoveryReddotEnv.UDRResource", "download success. projectId:%s, name:%s, version:%s, type:%s", str, str2, java.lang.Integer.valueOf(i17), rVar.name());
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: postProcessAsync */
    public void mo473xaee99e0d(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x xVar) {
        super.mo473xaee99e0d(j17, xVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.DiscoveryReddotEnv.UDRResource", "project_id:%s, name:%s, size:%s", xVar.d(), xVar.m117638xfb82e301(), java.lang.String.valueOf(xVar.f299126h));
        il0.e.f373542f.f();
    }
}
