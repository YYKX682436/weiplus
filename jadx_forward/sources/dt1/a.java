package dt1;

/* loaded from: classes12.dex */
public abstract class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Set f324657h = java.util.Collections.synchronizedSet(new java.util.HashSet());

    /* renamed from: d, reason: collision with root package name */
    public final r45.fr f324658d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f324659e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f324660f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.qr f324661g;

    public a(int i17, r45.fr pack) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pack, "pack");
        this.f324658d = pack;
        r45.qr qrVar = new r45.qr();
        this.f324661g = qrVar;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        qrVar.f465750e = pack;
        qrVar.f465749d = i17;
        lVar.f152197a = qrVar;
        r45.rr rrVar = new r45.rr();
        rrVar.mo11485x1f73abb4(new r45.ie());
        rrVar.mo11484xe92ab0a8().f458493e = new r45.du5();
        lVar.f152198b = rrVar;
        lVar.f152199c = "/cgi-bin/micromsg-bin/bypsend";
        lVar.f152200d = 3862;
        this.f324659e = lVar.a();
    }

    public long H() {
        return 0L;
    }

    public void I(int i17, int i18, java.lang.String str, r45.rr resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
    }

    public void J(r45.rr resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f324660f = u0Var;
        f324657h.add(java.lang.Long.valueOf(H()));
        return mo9409x10f9447a(sVar, this.f324659e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3862;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 rr6, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rr6, "rr");
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f324659e.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BypSendResponse");
        r45.rr rrVar = (r45.rr) fVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Byp.CgiBypSend", "[onCgiBack] errType=" + i18 + " errCode=" + i19 + " errMsg=" + str + " resp=" + rrVar);
        f324657h.remove(java.lang.Long.valueOf(H()));
        if (i18 == 0 && i19 == 0) {
            J(rrVar);
        } else {
            I(i18, i19, str, rrVar);
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f324660f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
