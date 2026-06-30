package e12;

/* loaded from: classes2.dex */
public final class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f327935d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f327936e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Long f327937f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f327938g;

    public a(com.p314xaae8f345.mm.p2495xc50a8b8b.g discountCouponParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(discountCouponParams, "discountCouponParams");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ry5();
        lVar.f152198b = new r45.sy5();
        lVar.f152199c = "/cgi-bin/mmpay-bin/mktsendaward";
        lVar.f152200d = 2812;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f327935d = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SendAwardRequest");
        ((r45.ry5) fVar).f466837d = discountCouponParams;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f327936e = callback;
        return mo9409x10f9447a(dispatcher, this.f327935d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2812;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAcceptCoupon", "onGYNetEnd errType: %s, errCode: %s, errMsg: %s.", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f327935d.f152244b.f152233a;
        r45.sy5 sy5Var = fVar instanceof r45.sy5 ? (r45.sy5) fVar : null;
        this.f327937f = sy5Var != null ? java.lang.Long.valueOf(sy5Var.f467551d) : null;
        this.f327938g = sy5Var != null ? sy5Var.f467552e : null;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f327936e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
            throw null;
        }
    }
}
