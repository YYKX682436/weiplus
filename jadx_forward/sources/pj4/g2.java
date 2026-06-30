package pj4;

/* loaded from: classes11.dex */
public class g2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public pj4.b0 f436595d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f436596e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f436597f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f436598g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f436599h;

    /* renamed from: i, reason: collision with root package name */
    public int f436600i;

    /* renamed from: m, reason: collision with root package name */
    public int f436601m;

    /* renamed from: n, reason: collision with root package name */
    public long f436602n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f436603o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f436604p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f436605q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f436606r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f436607s;

    /* renamed from: t, reason: collision with root package name */
    public long f436608t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f436609u;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.g2)) {
            return false;
        }
        pj4.g2 g2Var = (pj4.g2) fVar;
        return n51.f.a(this.f436595d, g2Var.f436595d) && n51.f.a(this.f436596e, g2Var.f436596e) && n51.f.a(java.lang.Boolean.valueOf(this.f436597f), java.lang.Boolean.valueOf(g2Var.f436597f)) && n51.f.a(this.f436598g, g2Var.f436598g) && n51.f.a(this.f436599h, g2Var.f436599h) && n51.f.a(java.lang.Integer.valueOf(this.f436600i), java.lang.Integer.valueOf(g2Var.f436600i)) && n51.f.a(java.lang.Integer.valueOf(this.f436601m), java.lang.Integer.valueOf(g2Var.f436601m)) && n51.f.a(java.lang.Long.valueOf(this.f436602n), java.lang.Long.valueOf(g2Var.f436602n)) && n51.f.a(java.lang.Boolean.valueOf(this.f436603o), java.lang.Boolean.valueOf(g2Var.f436603o)) && n51.f.a(this.f436604p, g2Var.f436604p) && n51.f.a(this.f436605q, g2Var.f436605q) && n51.f.a(this.f436606r, g2Var.f436606r) && n51.f.a(this.f436607s, g2Var.f436607s) && n51.f.a(java.lang.Long.valueOf(this.f436608t), java.lang.Long.valueOf(g2Var.f436608t)) && n51.f.a(this.f436609u, g2Var.f436609u);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            pj4.b0 b0Var = this.f436595d;
            if (b0Var != null) {
                fVar.i(1, b0Var.mo75928xcd1e8d8());
                this.f436595d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 1, this.f436596e);
            fVar.a(3, this.f436597f);
            java.lang.String str = this.f436598g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f436599h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f436600i);
            fVar.e(7, this.f436601m);
            fVar.h(8, this.f436602n);
            fVar.a(9, this.f436603o);
            java.lang.String str3 = this.f436604p;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            java.lang.String str4 = this.f436605q;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f436606r;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            java.lang.String str6 = this.f436607s;
            if (str6 != null) {
                fVar.j(13, str6);
            }
            fVar.h(14, this.f436608t);
            java.lang.String str7 = this.f436609u;
            if (str7 != null) {
                fVar.j(15, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            pj4.b0 b0Var2 = this.f436595d;
            int i18 = (b0Var2 != null ? b36.f.i(1, b0Var2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.g(2, 1, this.f436596e) + b36.f.a(3, this.f436597f);
            java.lang.String str8 = this.f436598g;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f436599h;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            int e17 = i18 + b36.f.e(6, this.f436600i) + b36.f.e(7, this.f436601m) + b36.f.h(8, this.f436602n) + b36.f.a(9, this.f436603o);
            java.lang.String str10 = this.f436604p;
            if (str10 != null) {
                e17 += b36.f.j(10, str10);
            }
            java.lang.String str11 = this.f436605q;
            if (str11 != null) {
                e17 += b36.f.j(11, str11);
            }
            java.lang.String str12 = this.f436606r;
            if (str12 != null) {
                e17 += b36.f.j(12, str12);
            }
            java.lang.String str13 = this.f436607s;
            if (str13 != null) {
                e17 += b36.f.j(13, str13);
            }
            int h17 = e17 + b36.f.h(14, this.f436608t);
            java.lang.String str14 = this.f436609u;
            return str14 != null ? h17 + b36.f.j(15, str14) : h17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f436596e.clear();
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
        pj4.g2 g2Var = (pj4.g2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    pj4.b0 b0Var3 = new pj4.b0();
                    if (bArr2 != null && bArr2.length > 0) {
                        b0Var3.mo11468x92b714fd(bArr2);
                    }
                    g2Var.f436595d = b0Var3;
                }
                return 0;
            case 2:
                g2Var.f436596e.add(aVar2.k(intValue));
                return 0;
            case 3:
                g2Var.f436597f = aVar2.c(intValue);
                return 0;
            case 4:
                g2Var.f436598g = aVar2.k(intValue);
                return 0;
            case 5:
                g2Var.f436599h = aVar2.k(intValue);
                return 0;
            case 6:
                g2Var.f436600i = aVar2.g(intValue);
                return 0;
            case 7:
                g2Var.f436601m = aVar2.g(intValue);
                return 0;
            case 8:
                g2Var.f436602n = aVar2.i(intValue);
                return 0;
            case 9:
                g2Var.f436603o = aVar2.c(intValue);
                return 0;
            case 10:
                g2Var.f436604p = aVar2.k(intValue);
                return 0;
            case 11:
                g2Var.f436605q = aVar2.k(intValue);
                return 0;
            case 12:
                g2Var.f436606r = aVar2.k(intValue);
                return 0;
            case 13:
                g2Var.f436607s = aVar2.k(intValue);
                return 0;
            case 14:
                g2Var.f436608t = aVar2.i(intValue);
                return 0;
            case 15:
                g2Var.f436609u = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
