package zy2;

/* loaded from: classes2.dex */
public final class rc extends az2.v {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f559096g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f559097h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f559098i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(java.lang.String qrUrl) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qrUrl, "qrUrl");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.y82 y82Var = new r45.y82();
        y82Var.set(2, qrUrl);
        r45.z82 z82Var = new r45.z82();
        lVar.f152197a = y82Var;
        lVar.f152198b = z82Var;
        lVar.f152200d = 7424;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderliveselectgo";
        this.f559096g = lVar.a();
        this.f559098i = qrUrl;
    }

    @Override // az2.v, az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        super.J(i17, i18, i19, str, v0Var, bArr);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f559097h;
        if (u0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var);
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // az2.v
    public java.util.List K(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f559096g;
        java.lang.Object obj = oVar != null ? oVar.f152244b.f152233a : null;
        r45.z82 z82Var = obj instanceof r45.z82 ? (r45.z82) obj : null;
        return (z82Var == null || (c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) z82Var.m75936x14adae67(3)) == null) ? kz5.p0.f395529d : kz5.b0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 0));
    }

    @Override // az2.v
    public long L() {
        r45.kv0 kv0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f559096g;
        java.lang.Object obj = oVar != null ? oVar.f152243a.f152217a : null;
        r45.y82 y82Var = obj instanceof r45.y82 ? (r45.y82) obj : null;
        if (y82Var == null || (kv0Var = (r45.kv0) y82Var.m75936x14adae67(1)) == null) {
            return 0L;
        }
        return kv0Var.m75942xfb822ef2(5);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f559097h = u0Var;
        return mo9409x10f9447a(sVar, this.f559096g, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 7424;
    }
}
