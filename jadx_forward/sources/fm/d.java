package fm;

/* loaded from: classes8.dex */
public final class d extends ea5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6693xbd9eeeab f345509a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f345510b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f345511c;

    public d(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6693xbd9eeeab c6693xbd9eeeab, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<? super java.lang.Boolean> interfaceC29045xdcb5ca57) {
        this.f345509a = c6693xbd9eeeab;
        this.f345510b = j17;
        this.f345511c = interfaceC29045xdcb5ca57;
    }

    @Override // ea5.k, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackFailAsync */
    public void mo13581xd73276fa(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        super.mo13581xd73276fa(j17, i17, i18, projectId, name, i19, type);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6693xbd9eeeab c6693xbd9eeeab = this.f345509a;
        c6693xbd9eeeab.f140312j = i18;
        c6693xbd9eeeab.p(java.lang.String.valueOf(java.lang.System.currentTimeMillis() - this.f345510b));
        c6693xbd9eeeab.k();
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f345511c.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
    }

    @Override // ea5.k, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackSuccessAsync */
    public void mo13582x5e6271bd(long j17, java.lang.String projectId, java.lang.String name, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        super.mo13582x5e6271bd(j17, projectId, name, i17, type);
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis() - this.f345510b);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6693xbd9eeeab c6693xbd9eeeab = this.f345509a;
        c6693xbd9eeeab.p(valueOf);
        c6693xbd9eeeab.k();
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f345511c.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
    }
}
