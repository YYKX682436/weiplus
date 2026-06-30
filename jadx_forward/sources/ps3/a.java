package ps3;

/* loaded from: classes8.dex */
public final class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f439595d;

    /* renamed from: e, reason: collision with root package name */
    public final float f439596e;

    /* renamed from: f, reason: collision with root package name */
    public final float f439597f;

    /* renamed from: g, reason: collision with root package name */
    public final int f439598g;

    /* renamed from: h, reason: collision with root package name */
    public final int f439599h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f439600i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f439601m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f439602n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f439603o;

    public a(int i17, float f17, float f18, int i18, int i19, java.lang.String macAddr, java.lang.String cellId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(macAddr, "macAddr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cellId, "cellId");
        this.f439595d = i17;
        this.f439596e = f17;
        this.f439597f = f18;
        this.f439598g = i18;
        this.f439599h = i19;
        this.f439600i = macAddr;
        this.f439601m = cellId;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneRadarSearch", "opcode is wrong!");
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f439602n = callback;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.pi5();
        lVar.f152198b = new r45.qi5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmradarsearch";
        lVar.f152200d = 425;
        lVar.f152201e = 209;
        lVar.f152202f = 1000000209;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f439603o = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.RadarSearchRequest");
        r45.pi5 pi5Var = (r45.pi5) fVar;
        pi5Var.f464610d = this.f439595d;
        pi5Var.f464615i = this.f439601m;
        pi5Var.f464616m = this.f439599h;
        pi5Var.f464612f = this.f439596e;
        pi5Var.f464611e = this.f439597f;
        pi5Var.f464614h = this.f439600i;
        pi5Var.f464613g = this.f439598g;
        return mo9409x10f9447a(dispatcher, this.f439603o, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 425;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.util.LinkedList<r45.oi5> linkedList;
        if (this.f439595d == 1 && i18 == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f439603o;
            java.lang.Object obj = oVar != null ? oVar.f152244b.f152233a : null;
            r45.qi5 qi5Var = obj instanceof r45.qi5 ? (r45.qi5) obj : null;
            if (qi5Var != null && (linkedList = qi5Var.f465561g) != null) {
                for (r45.oi5 oi5Var : linkedList) {
                    com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oi5Var);
                    java.lang.String str2 = oi5Var.f463816d;
                    if (str2 == null && (str2 = oi5Var.f463820h) == null) {
                        str2 = "";
                    }
                    r0Var.f152062a = str2;
                    r0Var.f152065d = oi5Var.f463819g;
                    r0Var.f152067f = 1;
                    arrayList.add(r0Var);
                }
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().m0(arrayList);
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f439602n;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
