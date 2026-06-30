package vr4;

/* loaded from: classes9.dex */
public class j0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public double f521286d;

    /* renamed from: e, reason: collision with root package name */
    public double f521287e;

    /* renamed from: f, reason: collision with root package name */
    public double f521288f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f521289g;

    /* renamed from: i, reason: collision with root package name */
    public vr4.k0 f521291i;

    /* renamed from: m, reason: collision with root package name */
    public int f521292m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f521293n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f521294o;

    /* renamed from: p, reason: collision with root package name */
    public double f521295p;

    /* renamed from: q, reason: collision with root package name */
    public double f521296q;

    /* renamed from: r, reason: collision with root package name */
    public int f521297r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f521298s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f521299t;

    /* renamed from: u, reason: collision with root package name */
    public vr4.a f521300u;

    /* renamed from: w, reason: collision with root package name */
    public vr4.b f521302w;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f521290h = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f521301v = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof vr4.j0)) {
            return false;
        }
        vr4.j0 j0Var = (vr4.j0) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f521286d), java.lang.Double.valueOf(j0Var.f521286d)) && n51.f.a(java.lang.Double.valueOf(this.f521287e), java.lang.Double.valueOf(j0Var.f521287e)) && n51.f.a(java.lang.Double.valueOf(this.f521288f), java.lang.Double.valueOf(j0Var.f521288f)) && n51.f.a(this.f521289g, j0Var.f521289g) && n51.f.a(this.f521290h, j0Var.f521290h) && n51.f.a(this.f521291i, j0Var.f521291i) && n51.f.a(java.lang.Integer.valueOf(this.f521292m), java.lang.Integer.valueOf(j0Var.f521292m)) && n51.f.a(this.f521293n, j0Var.f521293n) && n51.f.a(this.f521294o, j0Var.f521294o) && n51.f.a(java.lang.Double.valueOf(this.f521295p), java.lang.Double.valueOf(j0Var.f521295p)) && n51.f.a(java.lang.Double.valueOf(this.f521296q), java.lang.Double.valueOf(j0Var.f521296q)) && n51.f.a(java.lang.Integer.valueOf(this.f521297r), java.lang.Integer.valueOf(j0Var.f521297r)) && n51.f.a(this.f521298s, j0Var.f521298s) && n51.f.a(this.f521299t, j0Var.f521299t) && n51.f.a(this.f521300u, j0Var.f521300u) && n51.f.a(this.f521301v, j0Var.f521301v) && n51.f.a(this.f521302w, j0Var.f521302w);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f521301v;
        java.util.LinkedList linkedList2 = this.f521290h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.c(1, this.f521286d);
            fVar.c(2, this.f521287e);
            fVar.c(3, this.f521288f);
            java.lang.String str = this.f521289g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.g(5, 8, linkedList2);
            vr4.k0 k0Var = this.f521291i;
            if (k0Var != null) {
                fVar.i(6, k0Var.mo75928xcd1e8d8());
                this.f521291i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(7, this.f521292m);
            java.lang.String str2 = this.f521293n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            java.lang.String str3 = this.f521294o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.c(10, this.f521295p);
            fVar.c(11, this.f521296q);
            fVar.e(12, this.f521297r);
            java.lang.String str4 = this.f521298s;
            if (str4 != null) {
                fVar.j(13, str4);
            }
            java.lang.String str5 = this.f521299t;
            if (str5 != null) {
                fVar.j(14, str5);
            }
            vr4.a aVar = this.f521300u;
            if (aVar != null) {
                fVar.i(15, aVar.mo75928xcd1e8d8());
                this.f521300u.mo75956x3d5d1f78(fVar);
            }
            fVar.g(16, 8, linkedList);
            vr4.b bVar = this.f521302w;
            if (bVar != null) {
                fVar.i(17, bVar.mo75928xcd1e8d8());
                this.f521302w.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int c17 = b36.f.c(1, this.f521286d) + 0 + b36.f.c(2, this.f521287e) + b36.f.c(3, this.f521288f);
            java.lang.String str6 = this.f521289g;
            if (str6 != null) {
                c17 += b36.f.j(4, str6);
            }
            int g17 = c17 + b36.f.g(5, 8, linkedList2);
            vr4.k0 k0Var2 = this.f521291i;
            if (k0Var2 != null) {
                g17 += b36.f.i(6, k0Var2.mo75928xcd1e8d8());
            }
            int e17 = g17 + b36.f.e(7, this.f521292m);
            java.lang.String str7 = this.f521293n;
            if (str7 != null) {
                e17 += b36.f.j(8, str7);
            }
            java.lang.String str8 = this.f521294o;
            if (str8 != null) {
                e17 += b36.f.j(9, str8);
            }
            int c18 = e17 + b36.f.c(10, this.f521295p) + b36.f.c(11, this.f521296q) + b36.f.e(12, this.f521297r);
            java.lang.String str9 = this.f521298s;
            if (str9 != null) {
                c18 += b36.f.j(13, str9);
            }
            java.lang.String str10 = this.f521299t;
            if (str10 != null) {
                c18 += b36.f.j(14, str10);
            }
            vr4.a aVar2 = this.f521300u;
            if (aVar2 != null) {
                c18 += b36.f.i(15, aVar2.mo75928xcd1e8d8());
            }
            int g18 = c18 + b36.f.g(16, 8, linkedList);
            vr4.b bVar2 = this.f521302w;
            return bVar2 != null ? g18 + b36.f.i(17, bVar2.mo75928xcd1e8d8()) : g18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar3 = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar3); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar3)) {
                if (!super.mo75949x4476b383(aVar3, this, m75958x5767edba)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        vr4.j0 j0Var = (vr4.j0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                j0Var.f521286d = aVar4.e(intValue);
                return 0;
            case 2:
                j0Var.f521287e = aVar4.e(intValue);
                return 0;
            case 3:
                j0Var.f521288f = aVar4.e(intValue);
                return 0;
            case 4:
                j0Var.f521289g = aVar4.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar4.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    vr4.i1 i1Var = new vr4.i1();
                    if (bArr2 != null && bArr2.length > 0) {
                        i1Var.mo11468x92b714fd(bArr2);
                    }
                    j0Var.f521290h.add(i1Var);
                }
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar4.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    vr4.k0 k0Var3 = new vr4.k0();
                    if (bArr3 != null && bArr3.length > 0) {
                        k0Var3.mo11468x92b714fd(bArr3);
                    }
                    j0Var.f521291i = k0Var3;
                }
                return 0;
            case 7:
                j0Var.f521292m = aVar4.g(intValue);
                return 0;
            case 8:
                j0Var.f521293n = aVar4.k(intValue);
                return 0;
            case 9:
                j0Var.f521294o = aVar4.k(intValue);
                return 0;
            case 10:
                j0Var.f521295p = aVar4.e(intValue);
                return 0;
            case 11:
                j0Var.f521296q = aVar4.e(intValue);
                return 0;
            case 12:
                j0Var.f521297r = aVar4.g(intValue);
                return 0;
            case 13:
                j0Var.f521298s = aVar4.k(intValue);
                return 0;
            case 14:
                j0Var.f521299t = aVar4.k(intValue);
                return 0;
            case 15:
                java.util.LinkedList j19 = aVar4.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    vr4.a aVar5 = new vr4.a();
                    if (bArr4 != null && bArr4.length > 0) {
                        aVar5.mo11468x92b714fd(bArr4);
                    }
                    j0Var.f521300u = aVar5;
                }
                return 0;
            case 16:
                java.util.LinkedList j27 = aVar4.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    vr4.i0 i0Var = new vr4.i0();
                    if (bArr5 != null && bArr5.length > 0) {
                        i0Var.mo11468x92b714fd(bArr5);
                    }
                    j0Var.f521301v.add(i0Var);
                }
                return 0;
            case 17:
                java.util.LinkedList j28 = aVar4.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    vr4.b bVar3 = new vr4.b();
                    if (bArr6 != null && bArr6.length > 0) {
                        bVar3.mo11468x92b714fd(bArr6);
                    }
                    j0Var.f521302w = bVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
