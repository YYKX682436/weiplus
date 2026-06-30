package rh2;

/* loaded from: classes5.dex */
public final class h extends ea5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.udr.e0 f477185a;

    public h(com.p314xaae8f345.mm.udr.e0 e0Var) {
        this.f477185a = e0Var;
    }

    @Override // ea5.k, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackFailAsync */
    public void mo13581xd73276fa(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        super.mo13581xd73276fa(j17, i17, i18, projectId, name, i19, type);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KWSResourceLoader", "[prefetch] download failed: " + name + ", errNo=" + i17 + ", errCode=" + i18);
    }

    @Override // ea5.k, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackSuccessAsync */
    public void mo13582x5e6271bd(long j17, java.lang.String projectId, java.lang.String name, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        super.mo13582x5e6271bd(j17, projectId, name, i17, type);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KWSResourceLoader", "[prefetch] downloaded: " + name + " v" + i17);
        ((ku5.t0) ku5.t0.f394148d).r(new rh2.g(this.f477185a), "kws-prefetch");
    }
}
