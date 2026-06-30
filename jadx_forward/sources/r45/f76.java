package r45;

/* loaded from: classes4.dex */
public class f76 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f455609d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f455610e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f455611f;

    /* renamed from: g, reason: collision with root package name */
    public r45.du5 f455612g;

    /* renamed from: h, reason: collision with root package name */
    public r45.du5 f455613h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f76)) {
            return false;
        }
        r45.f76 f76Var = (r45.f76) fVar;
        return n51.f.a(this.f455609d, f76Var.f455609d) && n51.f.a(this.f455610e, f76Var.f455610e) && n51.f.a(this.f455611f, f76Var.f455611f) && n51.f.a(this.f455612g, f76Var.f455612g) && n51.f.a(this.f455613h, f76Var.f455613h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = this.f455609d;
            if (c19806x4c372b7 != null) {
                fVar.i(1, c19806x4c372b7.mo75928xcd1e8d8());
                this.f455609d.mo75956x3d5d1f78(fVar);
            }
            r45.du5 du5Var = this.f455610e;
            if (du5Var != null) {
                fVar.i(2, du5Var.mo75928xcd1e8d8());
                this.f455610e.mo75956x3d5d1f78(fVar);
            }
            r45.du5 du5Var2 = this.f455611f;
            if (du5Var2 != null) {
                fVar.i(3, du5Var2.mo75928xcd1e8d8());
                this.f455611f.mo75956x3d5d1f78(fVar);
            }
            r45.du5 du5Var3 = this.f455612g;
            if (du5Var3 != null) {
                fVar.i(4, du5Var3.mo75928xcd1e8d8());
                this.f455612g.mo75956x3d5d1f78(fVar);
            }
            r45.du5 du5Var4 = this.f455613h;
            if (du5Var4 != null) {
                fVar.i(5, du5Var4.mo75928xcd1e8d8());
                this.f455613h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b72 = this.f455609d;
            int i18 = c19806x4c372b72 != null ? 0 + b36.f.i(1, c19806x4c372b72.mo75928xcd1e8d8()) : 0;
            r45.du5 du5Var5 = this.f455610e;
            if (du5Var5 != null) {
                i18 += b36.f.i(2, du5Var5.mo75928xcd1e8d8());
            }
            r45.du5 du5Var6 = this.f455611f;
            if (du5Var6 != null) {
                i18 += b36.f.i(3, du5Var6.mo75928xcd1e8d8());
            }
            r45.du5 du5Var7 = this.f455612g;
            if (du5Var7 != null) {
                i18 += b36.f.i(4, du5Var7.mo75928xcd1e8d8());
            }
            r45.du5 du5Var8 = this.f455613h;
            return du5Var8 != null ? i18 + b36.f.i(5, du5Var8.mo75928xcd1e8d8()) : i18;
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
        r45.f76 f76Var = (r45.f76) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b73 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7();
                if (bArr != null && bArr.length > 0) {
                    c19806x4c372b73.mo11468x92b714fd(bArr);
                }
                f76Var.f455609d = c19806x4c372b73;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.du5 du5Var9 = new r45.du5();
                if (bArr2 != null && bArr2.length > 0) {
                    du5Var9.b(bArr2);
                }
                f76Var.f455610e = du5Var9;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.du5 du5Var10 = new r45.du5();
                if (bArr3 != null && bArr3.length > 0) {
                    du5Var10.b(bArr3);
                }
                f76Var.f455611f = du5Var10;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr4 = (byte[]) j27.get(i29);
                r45.du5 du5Var11 = new r45.du5();
                if (bArr4 != null && bArr4.length > 0) {
                    du5Var11.b(bArr4);
                }
                f76Var.f455612g = du5Var11;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j28 = aVar2.j(intValue);
        int size5 = j28.size();
        for (int i37 = 0; i37 < size5; i37++) {
            byte[] bArr5 = (byte[]) j28.get(i37);
            r45.du5 du5Var12 = new r45.du5();
            if (bArr5 != null && bArr5.length > 0) {
                du5Var12.b(bArr5);
            }
            f76Var.f455613h = du5Var12;
        }
        return 0;
    }
}
