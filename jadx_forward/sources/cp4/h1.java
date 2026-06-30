package cp4;

/* loaded from: classes8.dex */
public final class h1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f302560d;

    /* renamed from: e, reason: collision with root package name */
    public final int f302561e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f302562f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f302563g;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f302565i;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f302567n;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f302564h = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f302566m = "";

    public h1(int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i18, int i19, int i27, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2) {
        this.f302560d = i17;
        this.f302561e = i18;
        this.f302562f = gVar2;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.js();
        lVar.f152198b = new r45.ks();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmccvoicetrans";
        lVar.f152200d = 3835;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f302563g = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CCVoiceTransRequest");
        r45.js jsVar = (r45.js) fVar;
        if (gVar2 == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(java.lang.System.currentTimeMillis());
            sb6.append(hashCode());
            byte[] bytes = sb6.toString().getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            this.f302562f = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length);
        }
        jsVar.f459610d = this.f302562f;
        jsVar.f459611e = i18;
        jsVar.f459612f = gVar;
        jsVar.f459613g = i19;
        jsVar.f459614h = i27;
        jsVar.f459615i = 10;
        if (gVar == null) {
            this.f302565i = true;
        } else if (gVar.f273689a.length + i19 >= i27) {
            this.f302565i = true;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetVideoCaption", "doScene");
        this.f302567n = u0Var;
        return mo9409x10f9447a(sVar, this.f302563g, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3835;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetVideoCaption", "onGYNetEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetVideoCaption", "onGYNetEnd error");
        }
        java.util.ArrayList arrayList = this.f302564h;
        arrayList.clear();
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f302563g.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CCVoiceTransResponse");
        arrayList.addAll(((r45.ks) fVar).f460446d);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f302567n;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
