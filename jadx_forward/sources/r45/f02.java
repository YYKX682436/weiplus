package r45;

/* loaded from: classes10.dex */
public class f02 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f455411d;

    /* renamed from: e, reason: collision with root package name */
    public r45.tl4 f455412e;

    /* renamed from: f, reason: collision with root package name */
    public r45.fm4 f455413f;

    /* renamed from: g, reason: collision with root package name */
    public int f455414g;

    /* renamed from: h, reason: collision with root package name */
    public r45.sl4 f455415h;

    /* renamed from: i, reason: collision with root package name */
    public r45.km4 f455416i;

    /* renamed from: m, reason: collision with root package name */
    public r45.em4 f455417m;

    /* renamed from: n, reason: collision with root package name */
    public r45.ul4 f455418n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f02)) {
            return false;
        }
        r45.f02 f02Var = (r45.f02) fVar;
        return n51.f.a(this.f455411d, f02Var.f455411d) && n51.f.a(this.f455412e, f02Var.f455412e) && n51.f.a(this.f455413f, f02Var.f455413f) && n51.f.a(java.lang.Integer.valueOf(this.f455414g), java.lang.Integer.valueOf(f02Var.f455414g)) && n51.f.a(this.f455415h, f02Var.f455415h) && n51.f.a(this.f455416i, f02Var.f455416i) && n51.f.a(this.f455417m, f02Var.f455417m) && n51.f.a(this.f455418n, f02Var.f455418n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f455411d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.tl4 tl4Var = this.f455412e;
            if (tl4Var != null) {
                fVar.i(2, tl4Var.mo75928xcd1e8d8());
                this.f455412e.mo75956x3d5d1f78(fVar);
            }
            r45.fm4 fm4Var = this.f455413f;
            if (fm4Var != null) {
                fVar.i(3, fm4Var.mo75928xcd1e8d8());
                this.f455413f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f455414g);
            r45.sl4 sl4Var = this.f455415h;
            if (sl4Var != null) {
                fVar.i(5, sl4Var.mo75928xcd1e8d8());
                this.f455415h.mo75956x3d5d1f78(fVar);
            }
            r45.km4 km4Var = this.f455416i;
            if (km4Var != null) {
                fVar.i(6, km4Var.mo75928xcd1e8d8());
                this.f455416i.mo75956x3d5d1f78(fVar);
            }
            r45.em4 em4Var = this.f455417m;
            if (em4Var != null) {
                fVar.i(7, em4Var.mo75928xcd1e8d8());
                this.f455417m.mo75956x3d5d1f78(fVar);
            }
            r45.ul4 ul4Var = this.f455418n;
            if (ul4Var != null) {
                fVar.i(8, ul4Var.mo75928xcd1e8d8());
                this.f455418n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f455411d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.tl4 tl4Var2 = this.f455412e;
            if (tl4Var2 != null) {
                j17 += b36.f.i(2, tl4Var2.mo75928xcd1e8d8());
            }
            r45.fm4 fm4Var2 = this.f455413f;
            if (fm4Var2 != null) {
                j17 += b36.f.i(3, fm4Var2.mo75928xcd1e8d8());
            }
            int e17 = j17 + b36.f.e(4, this.f455414g);
            r45.sl4 sl4Var2 = this.f455415h;
            if (sl4Var2 != null) {
                e17 += b36.f.i(5, sl4Var2.mo75928xcd1e8d8());
            }
            r45.km4 km4Var2 = this.f455416i;
            if (km4Var2 != null) {
                e17 += b36.f.i(6, km4Var2.mo75928xcd1e8d8());
            }
            r45.em4 em4Var2 = this.f455417m;
            if (em4Var2 != null) {
                e17 += b36.f.i(7, em4Var2.mo75928xcd1e8d8());
            }
            r45.ul4 ul4Var2 = this.f455418n;
            return ul4Var2 != null ? e17 + b36.f.i(8, ul4Var2.mo75928xcd1e8d8()) : e17;
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
        r45.f02 f02Var = (r45.f02) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                f02Var.f455411d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.tl4 tl4Var3 = new r45.tl4();
                    if (bArr != null && bArr.length > 0) {
                        tl4Var3.mo11468x92b714fd(bArr);
                    }
                    f02Var.f455412e = tl4Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.fm4 fm4Var3 = new r45.fm4();
                    if (bArr2 != null && bArr2.length > 0) {
                        fm4Var3.mo11468x92b714fd(bArr2);
                    }
                    f02Var.f455413f = fm4Var3;
                }
                return 0;
            case 4:
                f02Var.f455414g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.sl4 sl4Var3 = new r45.sl4();
                    if (bArr3 != null && bArr3.length > 0) {
                        sl4Var3.mo11468x92b714fd(bArr3);
                    }
                    f02Var.f455415h = sl4Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j28.get(i28);
                    r45.km4 km4Var3 = new r45.km4();
                    if (bArr4 != null && bArr4.length > 0) {
                        km4Var3.mo11468x92b714fd(bArr4);
                    }
                    f02Var.f455416i = km4Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j29.get(i29);
                    r45.em4 em4Var3 = new r45.em4();
                    if (bArr5 != null && bArr5.length > 0) {
                        em4Var3.mo11468x92b714fd(bArr5);
                    }
                    f02Var.f455417m = em4Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size6 = j37.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j37.get(i37);
                    r45.ul4 ul4Var3 = new r45.ul4();
                    if (bArr6 != null && bArr6.length > 0) {
                        ul4Var3.mo11468x92b714fd(bArr6);
                    }
                    f02Var.f455418n = ul4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
