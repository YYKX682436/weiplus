package eh4;

/* loaded from: classes8.dex */
public class a extends eh4.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f334454d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f334455e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f334456f;

    /* renamed from: g, reason: collision with root package name */
    public int f334457g;

    /* renamed from: h, reason: collision with root package name */
    public long f334458h;

    /* renamed from: i, reason: collision with root package name */
    public int f334459i;

    /* renamed from: m, reason: collision with root package name */
    public int f334460m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f334461n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f334462o;

    /* renamed from: p, reason: collision with root package name */
    public final int f334463p;

    public a(java.lang.String str, int i17) {
        this.f334463p = 0;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        this.f334463p = i17;
        lVar.f152197a = new r45.zk0();
        lVar.f152198b = new r45.al0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/entertalkroom";
        lVar.f152200d = 332;
        lVar.f152201e = 147;
        lVar.f152202f = 1000000147;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f334455e = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        ((r45.zk0) fVar).f473690d = str;
        ((r45.zk0) fVar).f473691e = i17;
        this.f334456f = str;
    }

    @Override // eh4.f
    public java.lang.String H() {
        return this.f334456f;
    }

    @Override // eh4.f
    public int I() {
        return this.f334463p;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f334454d = u0Var;
        return mo9409x10f9447a(sVar, this.f334455e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 332;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            this.f334454d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        r45.al0 al0Var = (r45.al0) this.f334455e.f152244b.f152233a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneEnterTalkRoom", "resp %s", al0Var.toString());
        this.f334457g = al0Var.f451612d;
        this.f334458h = al0Var.f451613e;
        this.f334459i = al0Var.f451614f;
        this.f334460m = al0Var.f451617i;
        java.util.LinkedList linkedList = al0Var.f451616h;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.nk6 nk6Var = (r45.nk6) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nk6Var.f463007e)) {
                linkedList2.add(nk6Var);
            }
        }
        this.f334461n = linkedList2;
        java.util.LinkedList linkedList3 = al0Var.f451619n;
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        java.util.Iterator it6 = linkedList3.iterator();
        while (it6.hasNext()) {
            linkedList4.add((r45.mk6) it6.next());
        }
        this.f334462o = linkedList4;
        this.f334454d.mo815x76e0bfae(i18, i19, str, this);
    }
}
