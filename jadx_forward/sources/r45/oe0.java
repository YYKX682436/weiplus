package r45;

/* loaded from: classes2.dex */
public class oe0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f463716d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463717e;

    /* renamed from: f, reason: collision with root package name */
    public r45.bz3 f463718f;

    /* renamed from: g, reason: collision with root package name */
    public r45.rl6 f463719g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f463720h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f463721i;

    /* renamed from: m, reason: collision with root package name */
    public int f463722m;

    /* renamed from: n, reason: collision with root package name */
    public r45.gq f463723n;

    /* renamed from: o, reason: collision with root package name */
    public r45.gq f463724o;

    /* renamed from: p, reason: collision with root package name */
    public r45.rl6 f463725p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oe0)) {
            return false;
        }
        r45.oe0 oe0Var = (r45.oe0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f463716d), java.lang.Boolean.valueOf(oe0Var.f463716d)) && n51.f.a(this.f463717e, oe0Var.f463717e) && n51.f.a(this.f463718f, oe0Var.f463718f) && n51.f.a(this.f463719g, oe0Var.f463719g) && n51.f.a(this.f463720h, oe0Var.f463720h) && n51.f.a(java.lang.Boolean.valueOf(this.f463721i), java.lang.Boolean.valueOf(oe0Var.f463721i)) && n51.f.a(java.lang.Integer.valueOf(this.f463722m), java.lang.Integer.valueOf(oe0Var.f463722m)) && n51.f.a(this.f463723n, oe0Var.f463723n) && n51.f.a(this.f463724o, oe0Var.f463724o) && n51.f.a(this.f463725p, oe0Var.f463725p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f463720h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f463716d);
            java.lang.String str = this.f463717e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.bz3 bz3Var = this.f463718f;
            if (bz3Var != null) {
                fVar.i(3, bz3Var.mo75928xcd1e8d8());
                this.f463718f.mo75956x3d5d1f78(fVar);
            }
            r45.rl6 rl6Var = this.f463719g;
            if (rl6Var != null) {
                fVar.i(4, rl6Var.mo75928xcd1e8d8());
                this.f463719g.mo75956x3d5d1f78(fVar);
            }
            fVar.g(5, 8, linkedList);
            fVar.a(6, this.f463721i);
            fVar.e(7, this.f463722m);
            r45.gq gqVar = this.f463723n;
            if (gqVar != null) {
                fVar.i(8, gqVar.mo75928xcd1e8d8());
                this.f463723n.mo75956x3d5d1f78(fVar);
            }
            r45.gq gqVar2 = this.f463724o;
            if (gqVar2 != null) {
                fVar.i(9, gqVar2.mo75928xcd1e8d8());
                this.f463724o.mo75956x3d5d1f78(fVar);
            }
            r45.rl6 rl6Var2 = this.f463725p;
            if (rl6Var2 != null) {
                fVar.i(10, rl6Var2.mo75928xcd1e8d8());
                this.f463725p.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f463716d) + 0;
            java.lang.String str2 = this.f463717e;
            if (str2 != null) {
                a17 += b36.f.j(2, str2);
            }
            r45.bz3 bz3Var2 = this.f463718f;
            if (bz3Var2 != null) {
                a17 += b36.f.i(3, bz3Var2.mo75928xcd1e8d8());
            }
            r45.rl6 rl6Var3 = this.f463719g;
            if (rl6Var3 != null) {
                a17 += b36.f.i(4, rl6Var3.mo75928xcd1e8d8());
            }
            int g17 = a17 + b36.f.g(5, 8, linkedList) + b36.f.a(6, this.f463721i) + b36.f.e(7, this.f463722m);
            r45.gq gqVar3 = this.f463723n;
            if (gqVar3 != null) {
                g17 += b36.f.i(8, gqVar3.mo75928xcd1e8d8());
            }
            r45.gq gqVar4 = this.f463724o;
            if (gqVar4 != null) {
                g17 += b36.f.i(9, gqVar4.mo75928xcd1e8d8());
            }
            r45.rl6 rl6Var4 = this.f463725p;
            return rl6Var4 != null ? g17 + b36.f.i(10, rl6Var4.mo75928xcd1e8d8()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.oe0 oe0Var = (r45.oe0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                oe0Var.f463716d = aVar2.c(intValue);
                return 0;
            case 2:
                oe0Var.f463717e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.bz3 bz3Var3 = new r45.bz3();
                    if (bArr2 != null && bArr2.length > 0) {
                        bz3Var3.mo11468x92b714fd(bArr2);
                    }
                    oe0Var.f463718f = bz3Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.rl6 rl6Var5 = new r45.rl6();
                    if (bArr3 != null && bArr3.length > 0) {
                        rl6Var5.mo11468x92b714fd(bArr3);
                    }
                    oe0Var.f463719g = rl6Var5;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.rl6 rl6Var6 = new r45.rl6();
                    if (bArr4 != null && bArr4.length > 0) {
                        rl6Var6.mo11468x92b714fd(bArr4);
                    }
                    oe0Var.f463720h.add(rl6Var6);
                }
                return 0;
            case 6:
                oe0Var.f463721i = aVar2.c(intValue);
                return 0;
            case 7:
                oe0Var.f463722m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.gq gqVar5 = new r45.gq();
                    if (bArr5 != null && bArr5.length > 0) {
                        gqVar5.mo11468x92b714fd(bArr5);
                    }
                    oe0Var.f463723n = gqVar5;
                }
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.gq gqVar6 = new r45.gq();
                    if (bArr6 != null && bArr6.length > 0) {
                        gqVar6.mo11468x92b714fd(bArr6);
                    }
                    oe0Var.f463724o = gqVar6;
                }
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.rl6 rl6Var7 = new r45.rl6();
                    if (bArr7 != null && bArr7.length > 0) {
                        rl6Var7.mo11468x92b714fd(bArr7);
                    }
                    oe0Var.f463725p = rl6Var7;
                }
                return 0;
            default:
                return -1;
        }
    }
}
