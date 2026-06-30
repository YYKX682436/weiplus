package r45;

/* loaded from: classes9.dex */
public class bh3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f452291d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452292e;

    /* renamed from: f, reason: collision with root package name */
    public r45.bv3 f452293f;

    /* renamed from: g, reason: collision with root package name */
    public r45.bs f452294g;

    /* renamed from: h, reason: collision with root package name */
    public r45.di4 f452295h;

    /* renamed from: i, reason: collision with root package name */
    public r45.zu3 f452296i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cx3 f452297m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bh3)) {
            return false;
        }
        r45.bh3 bh3Var = (r45.bh3) fVar;
        return n51.f.a(this.f76492x92037252, bh3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f452291d), java.lang.Integer.valueOf(bh3Var.f452291d)) && n51.f.a(this.f452292e, bh3Var.f452292e) && n51.f.a(this.f452293f, bh3Var.f452293f) && n51.f.a(this.f452294g, bh3Var.f452294g) && n51.f.a(this.f452295h, bh3Var.f452295h) && n51.f.a(this.f452296i, bh3Var.f452296i) && n51.f.a(this.f452297m, bh3Var.f452297m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f452291d);
            java.lang.String str = this.f452292e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.bv3 bv3Var = this.f452293f;
            if (bv3Var != null) {
                fVar.i(4, bv3Var.mo75928xcd1e8d8());
                this.f452293f.mo75956x3d5d1f78(fVar);
            }
            r45.bs bsVar = this.f452294g;
            if (bsVar != null) {
                fVar.i(8, bsVar.mo75928xcd1e8d8());
                this.f452294g.mo75956x3d5d1f78(fVar);
            }
            r45.di4 di4Var = this.f452295h;
            if (di4Var != null) {
                fVar.i(9, di4Var.mo75928xcd1e8d8());
                this.f452295h.mo75956x3d5d1f78(fVar);
            }
            r45.zu3 zu3Var = this.f452296i;
            if (zu3Var != null) {
                fVar.i(10, zu3Var.mo75928xcd1e8d8());
                this.f452296i.mo75956x3d5d1f78(fVar);
            }
            r45.cx3 cx3Var = this.f452297m;
            if (cx3Var != null) {
                fVar.i(11, cx3Var.mo75928xcd1e8d8());
                this.f452297m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f452291d);
            java.lang.String str2 = this.f452292e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            r45.bv3 bv3Var2 = this.f452293f;
            if (bv3Var2 != null) {
                i18 += b36.f.i(4, bv3Var2.mo75928xcd1e8d8());
            }
            r45.bs bsVar2 = this.f452294g;
            if (bsVar2 != null) {
                i18 += b36.f.i(8, bsVar2.mo75928xcd1e8d8());
            }
            r45.di4 di4Var2 = this.f452295h;
            if (di4Var2 != null) {
                i18 += b36.f.i(9, di4Var2.mo75928xcd1e8d8());
            }
            r45.zu3 zu3Var2 = this.f452296i;
            if (zu3Var2 != null) {
                i18 += b36.f.i(10, zu3Var2.mo75928xcd1e8d8());
            }
            r45.cx3 cx3Var2 = this.f452297m;
            return cx3Var2 != null ? i18 + b36.f.i(11, cx3Var2.mo75928xcd1e8d8()) : i18;
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
        r45.bh3 bh3Var = (r45.bh3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                bh3Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            bh3Var.f452291d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            bh3Var.f452292e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.bv3 bv3Var3 = new r45.bv3();
                if (bArr2 != null && bArr2.length > 0) {
                    bv3Var3.mo11468x92b714fd(bArr2);
                }
                bh3Var.f452293f = bv3Var3;
            }
            return 0;
        }
        switch (intValue) {
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.bs bsVar3 = new r45.bs();
                    if (bArr3 != null && bArr3.length > 0) {
                        bsVar3.mo11468x92b714fd(bArr3);
                    }
                    bh3Var.f452294g = bsVar3;
                }
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.di4 di4Var3 = new r45.di4();
                    if (bArr4 != null && bArr4.length > 0) {
                        di4Var3.mo11468x92b714fd(bArr4);
                    }
                    bh3Var.f452295h = di4Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.zu3 zu3Var3 = new r45.zu3();
                    if (bArr5 != null && bArr5.length > 0) {
                        zu3Var3.mo11468x92b714fd(bArr5);
                    }
                    bh3Var.f452296i = zu3Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.cx3 cx3Var3 = new r45.cx3();
                    if (bArr6 != null && bArr6.length > 0) {
                        cx3Var3.mo11468x92b714fd(bArr6);
                    }
                    bh3Var.f452297m = cx3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
