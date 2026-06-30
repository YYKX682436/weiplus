package eh4;

/* loaded from: classes4.dex */
public class c extends eh4.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f334466d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f334467e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f334468f;

    /* renamed from: g, reason: collision with root package name */
    public int f334469g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f334470h;

    /* renamed from: i, reason: collision with root package name */
    public final int f334471i;

    public c(int i17, long j17, java.lang.String str, int i18) {
        this.f334471i = 0;
        this.f334471i = i18;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.xo3();
        lVar.f152198b = new r45.yo3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/gettalkroommember";
        lVar.f152200d = 336;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f334467e = a17;
        r45.xo3 xo3Var = (r45.xo3) a17.f152243a.f152217a;
        xo3Var.f471825d = i17;
        xo3Var.f471826e = j17;
        this.f334468f = str;
        xo3Var.f471827f = i18;
    }

    @Override // eh4.f
    public java.lang.String H() {
        return this.f334468f;
    }

    @Override // eh4.f
    public int I() {
        return this.f334471i;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f334466d = u0Var;
        return mo9409x10f9447a(sVar, this.f334467e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 336;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            this.f334466d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        r45.yo3 yo3Var = (r45.yo3) this.f334467e.f152244b.f152233a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetTalkRoomMember", "resp %s", yo3Var.toString());
        this.f334469g = yo3Var.f472789d;
        java.util.LinkedList linkedList = yo3Var.f472791f;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.nk6 nk6Var = (r45.nk6) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nk6Var.f463007e)) {
                linkedList2.add(nk6Var);
            }
        }
        this.f334470h = linkedList2;
        this.f334466d.mo815x76e0bfae(i18, i19, str, this);
    }
}
