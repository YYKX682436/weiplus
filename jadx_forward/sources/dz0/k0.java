package dz0;

/* loaded from: classes5.dex */
public final class k0 implements az0.d {

    /* renamed from: a, reason: collision with root package name */
    public final az0.e f326435a;

    /* renamed from: b, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f326436b;

    /* renamed from: c, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.f1 f326437c;

    /* renamed from: d, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.f1 f326438d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f326439e = "";

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b f326440f;

    public k0(com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b, az0.e eVar) {
        this.f326440f = c11015x5b190a3b;
        this.f326435a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.Object c(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", "awaitActiveSwitchingJob: ready templateId=" + this.f326439e);
        p3325xe03a0797.p3326xc267989b.f1 f1Var = this.f326438d;
        if (f1Var != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", "awaitSwitchTemplateJob: templateId=" + this.f326439e + ", isActive=" + f1Var.a() + ", isCancelled=" + ((p3325xe03a0797.p3326xc267989b.c3) f1Var).mo143975x62a56b47());
            if (f1Var.a()) {
                return f1Var.k(interfaceC29045xdcb5ca57);
            }
        }
        return java.lang.Boolean.TRUE;
    }

    public void d(java.lang.String skipCancelTemplateId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(skipCancelTemplateId, "skipCancelTemplateId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", "cancel buildTemplateNonBlockingJob cur:" + this.f326439e + ", skipCancel:" + skipCancelTemplateId);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6710xe2d6917f c6710xe2d6917f = oy0.a.f431366a;
        if (c6710xe2d6917f != null) {
            c6710xe2d6917f.f140502d = 3;
        }
        if (c6710xe2d6917f != null) {
            c6710xe2d6917f.f140510l = c6710xe2d6917f.b("failReason", java.lang.String.valueOf(1000), true);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6710xe2d6917f c6710xe2d6917f2 = oy0.a.f431366a;
        if (c6710xe2d6917f2 != null) {
            c6710xe2d6917f2.k();
        }
        oy0.a.f431366a = null;
        p3325xe03a0797.p3326xc267989b.f1 f1Var = this.f326437c;
        if (f1Var != null) {
            if (!(f1Var.a() && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(skipCancelTemplateId, this.f326439e))) {
                f1Var = null;
            }
            if (f1Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(f1Var, null, 1, null);
            }
        }
    }

    public void e(java.lang.String skipCancelTemplateId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(skipCancelTemplateId, "skipCancelTemplateId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", "cancel selectTemplateNonBlockingJob cur:" + this.f326439e + ", skipCancel:" + skipCancelTemplateId);
        if (this.f326436b != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6710xe2d6917f c6710xe2d6917f = oy0.a.f431366a;
            if (c6710xe2d6917f != null) {
                c6710xe2d6917f.f140502d = 3;
            }
            if (c6710xe2d6917f != null) {
                c6710xe2d6917f.f140510l = c6710xe2d6917f.b("failReason", java.lang.String.valueOf(1000), true);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6710xe2d6917f c6710xe2d6917f2 = oy0.a.f431366a;
            if (c6710xe2d6917f2 != null) {
                c6710xe2d6917f2.k();
            }
            oy0.a.f431366a = null;
        }
        az0.e eVar = this.f326435a;
        if (eVar != null) {
            ((mz0.w1) eVar).b(this.f326439e);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f326436b;
        if (r2Var != null) {
            if (!(((p3325xe03a0797.p3326xc267989b.a) r2Var).a() && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(skipCancelTemplateId, this.f326439e))) {
                r2Var = null;
            }
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
        }
    }

    public void f(com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 data, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String str = data.f151610a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", "startSelectTemplateNonBlockingJob ready " + str);
        this.f326436b = p3325xe03a0797.p3326xc267989b.l.d(this.f326440f.m158345xefc66565(), null, null, new dz0.j0(this, str, lVar, this.f326440f, data, null), 3, null);
    }
}
