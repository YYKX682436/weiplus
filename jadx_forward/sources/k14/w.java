package k14;

/* loaded from: classes2.dex */
public class w extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f384924d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f384925e;

    /* renamed from: f, reason: collision with root package name */
    public final int f384926f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f384927g;

    public w(java.lang.String str, int i17) {
        this.f384925e = str;
        this.f384926f = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f384924d = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.wc0 wc0Var = new r45.wc0();
        wc0Var.f470594d = this.f384925e;
        wc0Var.f470595e = this.f384926f;
        wc0Var.f470596f = this.f384927g;
        lVar.f152197a = wc0Var;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/deluserauth";
        lVar.f152198b = new r45.xc0();
        lVar.f152200d = 1127;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        return mo9409x10f9447a(sVar, lVar.a(), this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1127;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.qv6 qv6Var = ((r45.xc0) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a).f471500d;
        if (qv6Var != null) {
            i19 = qv6Var.f465837d;
            str = qv6Var.f465838e;
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f384924d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    public w(java.lang.String str, int i17, boolean z17) {
        this(str, i17);
        this.f384927g = z17;
    }
}
