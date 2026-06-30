package r45;

/* loaded from: classes4.dex */
public class z3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f473188d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f473189e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f473190f;

    /* renamed from: g, reason: collision with root package name */
    public int f473191g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f473192h;

    /* renamed from: i, reason: collision with root package name */
    public r45.rw3 f473193i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z3)) {
            return false;
        }
        r45.z3 z3Var = (r45.z3) fVar;
        return n51.f.a(this.f76494x2de60e5e, z3Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f473188d), java.lang.Integer.valueOf(z3Var.f473188d)) && n51.f.a(this.f473189e, z3Var.f473189e) && n51.f.a(this.f473190f, z3Var.f473190f) && n51.f.a(java.lang.Integer.valueOf(this.f473191g), java.lang.Integer.valueOf(z3Var.f473191g)) && n51.f.a(this.f473192h, z3Var.f473192h) && n51.f.a(this.f473193i, z3Var.f473193i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f473188d);
            fVar.g(3, 8, this.f473189e);
            r45.du5 du5Var = this.f473190f;
            if (du5Var != null) {
                fVar.i(4, du5Var.mo75928xcd1e8d8());
                this.f473190f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f473191g);
            java.lang.String str = this.f473192h;
            if (str != null) {
                fVar.j(6, str);
            }
            r45.rw3 rw3Var = this.f473193i;
            if (rw3Var != null) {
                fVar.i(7, rw3Var.mo75928xcd1e8d8());
                this.f473193i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f473188d) + b36.f.g(3, 8, this.f473189e);
            r45.du5 du5Var2 = this.f473190f;
            if (du5Var2 != null) {
                i18 += b36.f.i(4, du5Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(5, this.f473191g);
            java.lang.String str2 = this.f473192h;
            if (str2 != null) {
                e17 += b36.f.j(6, str2);
            }
            r45.rw3 rw3Var2 = this.f473193i;
            return rw3Var2 != null ? e17 + b36.f.i(7, rw3Var2.mo75928xcd1e8d8()) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f473189e.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.z3 z3Var = (r45.z3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    z3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                z3Var.f473188d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.kk4 kk4Var = new r45.kk4();
                    if (bArr3 != null && bArr3.length > 0) {
                        kk4Var.mo11468x92b714fd(bArr3);
                    }
                    z3Var.f473189e.add(kk4Var);
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var3.b(bArr4);
                    }
                    z3Var.f473190f = du5Var3;
                }
                return 0;
            case 5:
                z3Var.f473191g = aVar2.g(intValue);
                return 0;
            case 6:
                z3Var.f473192h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.rw3 rw3Var3 = new r45.rw3();
                    if (bArr5 != null && bArr5.length > 0) {
                        rw3Var3.mo11468x92b714fd(bArr5);
                    }
                    z3Var.f473193i = rw3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
