package q71;

/* loaded from: classes8.dex */
public class p extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f441891d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f441892e;

    /* renamed from: f, reason: collision with root package name */
    public final int f441893f;

    public p(int i17) {
        this.f441893f = 0;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.cj5();
        lVar.f152198b = new r45.dj5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/rcptinforemove";
        lVar.f152200d = com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60852x9b1ed3e8;
        lVar.f152201e = 201;
        lVar.f152202f = 1000000201;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f441892e = a17;
        this.f441893f = i17;
        ((r45.cj5) a17.f152243a.f152217a).f453132d = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f441891d = u0Var;
        return mo9409x10f9447a(sVar, this.f441892e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60852x9b1ed3e8;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            r45.dj5 dj5Var = (r45.dj5) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            java.util.LinkedList linkedList = dj5Var.f454065e.f472672e;
            if (linkedList != null) {
                linkedList.size();
                o71.l.wi();
                o71.l.Bi().j(dj5Var.f454065e.f472672e);
                o71.l.wi();
                o71.l.Bi().i();
            }
        }
        this.f441891d.mo815x76e0bfae(i18, i19, str, this);
    }
}
