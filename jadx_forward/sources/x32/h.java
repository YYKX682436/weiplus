package x32;

/* loaded from: classes5.dex */
public final class h extends ea5.l {
    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getProjectId */
    public java.lang.String mo472xca17635e() {
        return "ilinkres_099f9dd6";
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: postProcessAsync */
    public void mo473xaee99e0d(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x resource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resource, "resource");
        super.mo473xaee99e0d(j17, resource);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UdrLibWechatAccessoryFeatureService", "[postProcess] name: %s, md5: %s, path: %s", resource.m117638xfb82e301(), resource.m117637xb5885648(), resource.m117639xfb83cc9b());
    }
}
