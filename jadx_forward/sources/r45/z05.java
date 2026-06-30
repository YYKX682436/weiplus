package r45;

/* loaded from: classes11.dex */
public class z05 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f473103d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f473104e;

    public com.p314xaae8f345.mm.p944x882e457a.i b() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 806;
        lVar.f152199c = "/cgi-bin/micromsg-bin/openimoplog";
        lVar.f152197a = this;
        lVar.f152198b = new r45.a15();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
        iVar.p(a17);
        return iVar;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z05)) {
            return false;
        }
        r45.z05 z05Var = (r45.z05) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f473103d), java.lang.Integer.valueOf(z05Var.f473103d)) && n51.f.a(this.f473104e, z05Var.f473104e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f473103d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f473104e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f473103d) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f473104e;
            return gVar2 != null ? e17 + b36.f.b(2, gVar2) : e17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.z05 z05Var = (r45.z05) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            z05Var.f473103d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        z05Var.f473104e = aVar2.d(intValue);
        return 0;
    }
}
