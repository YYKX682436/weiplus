package g10;

/* loaded from: classes7.dex */
public final class s extends ea5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g10.v f349080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bw5.s7 f349081b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f349082c;

    public s(g10.v vVar, bw5.s7 s7Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<? super java.lang.Boolean> interfaceC29045xdcb5ca57) {
        this.f349080a = vVar;
        this.f349081b = s7Var;
        this.f349082c = interfaceC29045xdcb5ca57;
    }

    @Override // ea5.k, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackFailAsync */
    public void mo13581xd73276fa(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        super.mo13581xd73276fa(j17, i17, i18, projectId, name, i19, type);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "updateLatestBizUdrPkg, fail, projectId:" + projectId + ", name:" + name + ", errNo = " + i17 + ", errCode = " + i18);
        bw5.d5 d5Var = bw5.d5.EcsNirvanaUdrResult;
        ((ku5.t0) ku5.t0.f394148d).h(new q10.n(kz5.c1.k(new jz5.l("projectId", projectId), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, name)), d5Var, 1), "MicroMsg.EcsNirvanaReportUtil");
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f349082c;
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
    }

    @Override // ea5.k, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackSuccessAsync */
    public void mo13582x5e6271bd(long j17, java.lang.String projectId, java.lang.String name, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        super.mo13582x5e6271bd(j17, projectId, name, i17, type);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "updateLatestBizUdrPkg, success");
        boolean Ni = this.f349080a.Ni(this.f349081b);
        bw5.d5 d5Var = bw5.d5.EcsNirvanaUdrResult;
        java.util.Map k17 = kz5.c1.k(new jz5.l("projectId", projectId), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, name));
        ((ku5.t0) ku5.t0.f394148d).h(new q10.n(k17, d5Var, 0), "MicroMsg.EcsNirvanaReportUtil");
        this.f349082c.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(Ni)));
    }
}
