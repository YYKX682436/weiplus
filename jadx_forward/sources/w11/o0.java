package w11;

/* loaded from: classes4.dex */
public class o0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f523632d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f523633e;

    public o0(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.bb5();
        lVar.f152198b = new r45.cb5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/postinvitefriendsmsg";
        lVar.f152200d = 1804;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f523633e = a17;
        r45.bb5 bb5Var = (r45.bb5) a17.f152243a.f152217a;
        bb5Var.f452189d = i17;
        bb5Var.f452191f = str;
        if ((i17 & 16) > 0) {
            jk5.j jVar = new jk5.j();
            r45.kq6 kq6Var = new r45.kq6();
            l56.i iVar = jVar.f381702b;
            if (iVar == null) {
                kq6Var = null;
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f398225d)) {
                l56.i iVar2 = jVar.f381702b;
                kq6Var.f460439d = iVar2.f398225d;
                kq6Var.f460440e = iVar2.f398226e;
            }
            bb5Var.f452192g = kq6Var;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f523632d = u0Var;
        return mo9409x10f9447a(sVar, this.f523633e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1804;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            this.f523632d.mo815x76e0bfae(i18, i19, str, this);
        } else {
            this.f523632d.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
