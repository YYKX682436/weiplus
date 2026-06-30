package gf;

/* loaded from: classes7.dex */
public final class t0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u4 f352706a;

    /* renamed from: b, reason: collision with root package name */
    public final ze.n f352707b;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u4 origin, ze.n runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(origin, "origin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f352706a = origin;
        this.f352707b = runtime;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u4
    public void a() {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y C0 = this.f352707b.C0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(C0, "null cannot be cast to non-null type com.tencent.luggage.sdk.jsapi.component.service.AppBrandServiceLU");
        com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe c3955x2d990bfe = (com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe) C0.z1(com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe.class);
        if (c3955x2d990bfe == null) {
            this.f352706a.a();
        } else {
            c3955x2d990bfe.a(new gf.s0(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u4
    public void c(java.lang.String str, java.lang.Object obj) {
        this.f352706a.c(str, obj);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u4
    /* renamed from: cancel */
    public void mo52131xae7a2e7a() {
        this.f352706a.mo52131xae7a2e7a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u4
    /* renamed from: setAnimationEnabled */
    public void mo52132x15e8c79f(boolean z17) {
        this.f352706a.mo52132x15e8c79f(z17);
    }
}
