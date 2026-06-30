package k14;

/* loaded from: classes5.dex */
public final class r extends ea5.k {
    @Override // ea5.k, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackFailAsync */
    public void mo13581xd73276fa(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        super.mo13581xd73276fa(j17, i17, i18, projectId, name, i19, type);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HearingAidDownloadResource", "downloadResources remote fail, errNo: " + i17 + ", errCode: " + i18 + ", projectId: " + projectId + ", name: " + name + ", version: " + i19);
        k14.t.f384913d.set(false);
    }

    @Override // ea5.k, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackSuccessAsync */
    public void mo13582x5e6271bd(long j17, java.lang.String projectId, java.lang.String name, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        super.mo13582x5e6271bd(j17, projectId, name, i17, type);
        if (((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui(projectId, name) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HearingAidDownloadResource", "downloadResources remote success");
            k14.t.f384912c.set(true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HearingAidDownloadResource", "downloadResources remote fail");
        }
        k14.t.f384913d.set(false);
    }
}
