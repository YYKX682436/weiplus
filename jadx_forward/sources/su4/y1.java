package su4;

/* loaded from: classes8.dex */
public class y1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f494674d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f494675e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.w97 f494676f;

    /* renamed from: g, reason: collision with root package name */
    public r45.x97 f494677g;

    public y1(java.util.List list, int i17, long j17, java.util.List list2) {
        this.f494676f = new r45.w97();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1948;
        lVar.f152199c = "/cgi-bin/mmsearch-bin/websearchconfig";
        lVar.f152197a = new r45.w97();
        lVar.f152198b = new r45.x97();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f494675e = a17;
        r45.w97 w97Var = (r45.w97) a17.f152243a.f152217a;
        this.f494676f = w97Var;
        w97Var.f470526e = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0);
        w97Var.f470527f = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        w97Var.f470530i = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.b();
        w97Var.f470531m = su4.r2.i();
        w97Var.f470533o = su4.r2.g();
        if (list != null) {
            w97Var.f470525d.addAll(list);
        }
        w97Var.f470528g = i17;
        w97Var.f470529h = j17;
        if (list2 != null) {
            w97Var.f470532n.addAll(list2);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f494674d = u0Var;
        return mo9409x10f9447a(sVar, this.f494675e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1948;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.NetSceneWebSearchConfig", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            this.f494674d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        r45.x97 x97Var = (r45.x97) this.f494675e.f152244b.f152233a;
        this.f494677g = x97Var;
        if (x97Var != null) {
            java.lang.String str2 = x97Var.f471436d;
        }
        this.f494674d.mo815x76e0bfae(i18, i19, str, this);
    }
}
