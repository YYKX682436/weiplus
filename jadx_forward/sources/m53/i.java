package m53;

/* loaded from: classes4.dex */
public class i extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f405296d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405297e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f405298f;

    /* renamed from: g, reason: collision with root package name */
    public int f405299g;

    /* renamed from: h, reason: collision with root package name */
    public m53.r3 f405300h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f405301i;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f405303n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f405304o;

    /* renamed from: q, reason: collision with root package name */
    public int f405306q;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f405302m = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f405305p = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.i)) {
            return false;
        }
        m53.i iVar = (m53.i) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f405296d), java.lang.Integer.valueOf(iVar.f405296d)) && n51.f.a(this.f405297e, iVar.f405297e) && n51.f.a(java.lang.Boolean.valueOf(this.f405298f), java.lang.Boolean.valueOf(iVar.f405298f)) && n51.f.a(java.lang.Integer.valueOf(this.f405299g), java.lang.Integer.valueOf(iVar.f405299g)) && n51.f.a(this.f405300h, iVar.f405300h) && n51.f.a(this.f405301i, iVar.f405301i) && n51.f.a(this.f405302m, iVar.f405302m) && n51.f.a(this.f405303n, iVar.f405303n) && n51.f.a(this.f405304o, iVar.f405304o) && n51.f.a(this.f405305p, iVar.f405305p) && n51.f.a(java.lang.Integer.valueOf(this.f405306q), java.lang.Integer.valueOf(iVar.f405306q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f405305p;
        java.util.LinkedList linkedList2 = this.f405302m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f405296d);
            java.lang.String str = this.f405297e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f405298f);
            fVar.e(4, this.f405299g);
            m53.r3 r3Var = this.f405300h;
            if (r3Var != null) {
                fVar.i(5, r3Var.mo75928xcd1e8d8());
                this.f405300h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f405301i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.g(7, 8, linkedList2);
            java.lang.String str3 = this.f405303n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f405304o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.g(10, 8, linkedList);
            fVar.e(11, this.f405306q);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f405296d) + 0;
            java.lang.String str5 = this.f405297e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            int a17 = e17 + b36.f.a(3, this.f405298f) + b36.f.e(4, this.f405299g);
            m53.r3 r3Var2 = this.f405300h;
            if (r3Var2 != null) {
                a17 += b36.f.i(5, r3Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f405301i;
            if (str6 != null) {
                a17 += b36.f.j(6, str6);
            }
            int g17 = a17 + b36.f.g(7, 8, linkedList2);
            java.lang.String str7 = this.f405303n;
            if (str7 != null) {
                g17 += b36.f.j(8, str7);
            }
            java.lang.String str8 = this.f405304o;
            if (str8 != null) {
                g17 += b36.f.j(9, str8);
            }
            return g17 + b36.f.g(10, 8, linkedList) + b36.f.e(11, this.f405306q);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        m53.i iVar = (m53.i) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                iVar.f405296d = aVar2.g(intValue);
                return 0;
            case 2:
                iVar.f405297e = aVar2.k(intValue);
                return 0;
            case 3:
                iVar.f405298f = aVar2.c(intValue);
                return 0;
            case 4:
                iVar.f405299g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    m53.r3 r3Var3 = new m53.r3();
                    if (bArr2 != null && bArr2.length > 0) {
                        r3Var3.mo11468x92b714fd(bArr2);
                    }
                    iVar.f405300h = r3Var3;
                }
                return 0;
            case 6:
                iVar.f405301i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    m53.f0 f0Var = new m53.f0();
                    if (bArr3 != null && bArr3.length > 0) {
                        f0Var.mo11468x92b714fd(bArr3);
                    }
                    iVar.f405302m.add(f0Var);
                }
                return 0;
            case 8:
                iVar.f405303n = aVar2.k(intValue);
                return 0;
            case 9:
                iVar.f405304o = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    m53.z zVar = new m53.z();
                    if (bArr4 != null && bArr4.length > 0) {
                        zVar.mo11468x92b714fd(bArr4);
                    }
                    iVar.f405305p.add(zVar);
                }
                return 0;
            case 11:
                iVar.f405306q = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
