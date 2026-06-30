package gc0;

/* loaded from: classes5.dex */
public final class w2 extends ea5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351879a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f351880b;

    public w2(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<? super com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x> interfaceC29045xdcb5ca57) {
        this.f351879a = str;
        this.f351880b = interfaceC29045xdcb5ca57;
    }

    @Override // ea5.k, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackCheckSuccessAsync */
    public void mo52024x9bd1065d(long j17, java.lang.String projectId, java.lang.String name, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        super.mo52024x9bd1065d(j17, projectId, name, i17, type);
    }

    @Override // ea5.k, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackFailAsync */
    public void mo13581xd73276fa(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        super.mo13581xd73276fa(j17, i17, i18, projectId, name, i19, type);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemarkRecommender", "fail() called with: errNo = " + i17 + ", errCode = " + i18 + ", projectId = " + projectId + ", name = " + name + ", version = " + i19);
        this.f351880b.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
    }

    @Override // ea5.k, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackSuccessAsync */
    public void mo13582x5e6271bd(long j17, java.lang.String projectId, java.lang.String name, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        super.mo13582x5e6271bd(j17, projectId, name, i17, type);
        gc0.d3 d3Var = gc0.d3.f351664a;
        com.p314xaae8f345.mm.udr.e0 e0Var = (com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class);
        d3Var.e().getClass();
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) e0Var).Ui("ilinkres_0f34f0cc", this.f351879a);
        boolean z17 = Ui != null && d3Var.f(Ui);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("success() called with: projectId = ");
        sb6.append(projectId);
        sb6.append(", name = ");
        sb6.append(name);
        sb6.append(", version = ");
        sb6.append(i17);
        sb6.append(" res:");
        sb6.append(Ui != null);
        sb6.append(" isValid:");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemarkRecommender", sb6.toString());
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        if (!z17) {
            Ui = null;
        }
        this.f351880b.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(Ui));
    }
}
