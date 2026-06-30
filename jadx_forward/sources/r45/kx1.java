package r45;

/* loaded from: classes9.dex */
public class kx1 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f460547d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f460548e;

    /* renamed from: f, reason: collision with root package name */
    public int f460549f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ox1 f460550g;

    /* renamed from: h, reason: collision with root package name */
    public int f460551h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f460552i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f460553m;

    /* renamed from: n, reason: collision with root package name */
    public int f460554n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f460555o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kx1)) {
            return false;
        }
        r45.kx1 kx1Var = (r45.kx1) fVar;
        return n51.f.a(this.f76492x92037252, kx1Var.f76492x92037252) && n51.f.a(this.f460547d, kx1Var.f460547d) && n51.f.a(this.f460548e, kx1Var.f460548e) && n51.f.a(java.lang.Integer.valueOf(this.f460549f), java.lang.Integer.valueOf(kx1Var.f460549f)) && n51.f.a(this.f460550g, kx1Var.f460550g) && n51.f.a(java.lang.Integer.valueOf(this.f460551h), java.lang.Integer.valueOf(kx1Var.f460551h)) && n51.f.a(this.f460552i, kx1Var.f460552i) && n51.f.a(this.f460553m, kx1Var.f460553m) && n51.f.a(java.lang.Integer.valueOf(this.f460554n), java.lang.Integer.valueOf(kx1Var.f460554n)) && n51.f.a(java.lang.Boolean.valueOf(this.f460555o), java.lang.Boolean.valueOf(kx1Var.f460555o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f460547d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f460548e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f460549f);
            r45.ox1 ox1Var = this.f460550g;
            if (ox1Var != null) {
                fVar.i(5, ox1Var.mo75928xcd1e8d8());
                this.f460550g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f460551h);
            java.lang.String str = this.f460552i;
            if (str != null) {
                fVar.j(7, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f460553m;
            if (gVar2 != null) {
                fVar.b(8, gVar2);
            }
            fVar.e(9, this.f460554n);
            fVar.a(10, this.f460555o);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f460548e;
            if (gVar3 != null) {
                i18 += b36.f.b(3, gVar3);
            }
            int e17 = i18 + b36.f.e(4, this.f460549f);
            r45.ox1 ox1Var2 = this.f460550g;
            if (ox1Var2 != null) {
                e17 += b36.f.i(5, ox1Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(6, this.f460551h);
            java.lang.String str2 = this.f460552i;
            if (str2 != null) {
                e18 += b36.f.j(7, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f460553m;
            if (gVar4 != null) {
                e18 += b36.f.b(8, gVar4);
            }
            return e18 + b36.f.e(9, this.f460554n) + b36.f.a(10, this.f460555o);
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
        r45.kx1 kx1Var = (r45.kx1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    kx1Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.yx1 yx1Var = new r45.yx1();
                    if (bArr3 != null && bArr3.length > 0) {
                        yx1Var.mo11468x92b714fd(bArr3);
                    }
                    kx1Var.f460547d.add(yx1Var);
                }
                return 0;
            case 3:
                kx1Var.f460548e = aVar2.d(intValue);
                return 0;
            case 4:
                kx1Var.f460549f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.ox1 ox1Var3 = new r45.ox1();
                    if (bArr4 != null && bArr4.length > 0) {
                        ox1Var3.mo11468x92b714fd(bArr4);
                    }
                    kx1Var.f460550g = ox1Var3;
                }
                return 0;
            case 6:
                kx1Var.f460551h = aVar2.g(intValue);
                return 0;
            case 7:
                kx1Var.f460552i = aVar2.k(intValue);
                return 0;
            case 8:
                kx1Var.f460553m = aVar2.d(intValue);
                return 0;
            case 9:
                kx1Var.f460554n = aVar2.g(intValue);
                return 0;
            case 10:
                kx1Var.f460555o = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
