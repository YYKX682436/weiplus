package w11;

/* loaded from: classes2.dex */
public class j0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f523592d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f523593e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f523594f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f523595g = "";

    /* renamed from: h, reason: collision with root package name */
    public final int f523596h;

    public j0(int i17) {
        this.f523596h = 0;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ih3();
        lVar.f152198b = new r45.jh3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getinvitefriendsmsg";
        lVar.f152200d = 1803;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f523593e = a17;
        ((r45.ih3) a17.f152243a.f152217a).f458577d = i17;
        this.f523596h = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f523592d = u0Var;
        return mo9409x10f9447a(sVar, this.f523593e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1803;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            this.f523592d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        r45.jh3 jh3Var = (r45.jh3) this.f523593e.f152244b.f152233a;
        this.f523594f = jh3Var.f459343d;
        this.f523595g = jh3Var.f459344e;
        this.f523592d.mo815x76e0bfae(i18, i19, str, this);
    }
}
