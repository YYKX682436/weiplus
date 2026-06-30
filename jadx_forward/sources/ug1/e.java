package ug1;

/* loaded from: classes7.dex */
public final class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d {

    /* renamed from: o, reason: collision with root package name */
    public final r45.u54 f509021o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f509022p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f509023q;

    public e(r45.u54 req, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        this.f509021o = req;
        this.f509022p = z17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1122;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaattr/launchwxaapp";
        lVar.f152197a = req;
        lVar.f152198b = new r45.v54();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f509023q = a17;
        p(a17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    public java.lang.String B() {
        java.lang.String str = this.f509021o.f468597p;
        return str == null ? "" : str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    public java.lang.String C() {
        java.lang.String str = this.f509021o.f468598q;
        return str == null ? "" : str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void x(int i17, int i18, java.lang.String str, r45.v54 resp, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        super.x(i17, i18, str, resp, m1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiLaunchWxaAppForPreFetch", "onCgiBack response:" + wz0.a.b(resp));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d, com.p314xaae8f345.mm.p944x882e457a.i
    public pq5.g l() {
        qg1.c cVar = new qg1.c();
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f509023q;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LaunchWxaAppRequest");
        pq5.g a17 = cVar.a((r45.u54) fVar, this.f509022p, this);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = oVar.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LaunchWxaAppRequest");
        qg1.d.L((r45.u54) fVar2);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = oVar.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LaunchWxaAppRequest");
        qg1.d.K((r45.u54) fVar3);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("run() with request ");
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar4 = oVar.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LaunchWxaAppRequest");
        r45.u54 u54Var = (r45.u54) fVar4;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("LaunchWxaAppRequest{");
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("username[");
        sb8.append(u54Var.f468598q);
        sb8.append("], appId[");
        sb8.append(u54Var.f468588d);
        sb8.append("], sync[");
        sb8.append(u54Var.f468590f == 1);
        sb8.append("], instanceId[");
        sb8.append(u54Var.f468597p);
        sb8.append("], libVersion[");
        r45.fd7 fd7Var = u54Var.f468592h;
        sb8.append(fd7Var != null ? fd7Var.f455779d : 0);
        sb8.append("], ");
        sb8.append(wz0.a.a(u54Var.f468604w));
        sb7.append(sb8.toString());
        sb6.append(sb7.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiLaunchWxaAppForPreFetch", sb6.toString());
        return a17 == null ? super.l() : a17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    public pq5.g u() {
        r45.u54 u54Var = this.f509021o;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.a.a(u54Var.f468588d, u54Var.f468598q)) {
            return null;
        }
        return pq5.h.d(new ug1.d(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    public java.lang.String y() {
        java.lang.String str = this.f509021o.f468588d;
        return str == null ? "" : str;
    }
}
