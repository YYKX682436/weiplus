package r45;

/* loaded from: classes7.dex */
public class mv5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f462385d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f462386e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f462387f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f462388g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f462389h;

    /* renamed from: i, reason: collision with root package name */
    public r45.nv5 f462390i;

    /* renamed from: m, reason: collision with root package name */
    public int f462391m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mv5)) {
            return false;
        }
        r45.mv5 mv5Var = (r45.mv5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f462385d), java.lang.Integer.valueOf(mv5Var.f462385d)) && n51.f.a(this.f462386e, mv5Var.f462386e) && n51.f.a(this.f462387f, mv5Var.f462387f) && n51.f.a(this.f462388g, mv5Var.f462388g) && n51.f.a(this.f462389h, mv5Var.f462389h) && n51.f.a(this.f462390i, mv5Var.f462390i) && n51.f.a(java.lang.Integer.valueOf(this.f462391m), java.lang.Integer.valueOf(mv5Var.f462391m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f462385d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f462386e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f462387f;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f462388g;
            if (gVar3 != null) {
                fVar.b(4, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f462389h;
            if (gVar4 != null) {
                fVar.b(5, gVar4);
            }
            r45.nv5 nv5Var = this.f462390i;
            if (nv5Var != null) {
                fVar.i(6, nv5Var.mo75928xcd1e8d8());
                this.f462390i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(7, this.f462391m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f462385d) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f462386e;
            if (gVar5 != null) {
                e17 += b36.f.b(2, gVar5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f462387f;
            if (gVar6 != null) {
                e17 += b36.f.b(3, gVar6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar7 = this.f462388g;
            if (gVar7 != null) {
                e17 += b36.f.b(4, gVar7);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar8 = this.f462389h;
            if (gVar8 != null) {
                e17 += b36.f.b(5, gVar8);
            }
            r45.nv5 nv5Var2 = this.f462390i;
            if (nv5Var2 != null) {
                e17 += b36.f.i(6, nv5Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(7, this.f462391m);
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
        r45.mv5 mv5Var = (r45.mv5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mv5Var.f462385d = aVar2.g(intValue);
                return 0;
            case 2:
                mv5Var.f462386e = aVar2.d(intValue);
                return 0;
            case 3:
                mv5Var.f462387f = aVar2.d(intValue);
                return 0;
            case 4:
                mv5Var.f462388g = aVar2.d(intValue);
                return 0;
            case 5:
                mv5Var.f462389h = aVar2.d(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.nv5 nv5Var3 = new r45.nv5();
                    if (bArr != null && bArr.length > 0) {
                        nv5Var3.mo11468x92b714fd(bArr);
                    }
                    mv5Var.f462390i = nv5Var3;
                }
                return 0;
            case 7:
                mv5Var.f462391m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
