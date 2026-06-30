package r45;

/* loaded from: classes12.dex */
public class cj0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453113d;

    /* renamed from: e, reason: collision with root package name */
    public int f453114e;

    /* renamed from: f, reason: collision with root package name */
    public int f453115f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f453116g;

    /* renamed from: h, reason: collision with root package name */
    public int f453117h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f453118i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f453119m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f453120n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f453121o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f453122p;

    /* renamed from: q, reason: collision with root package name */
    public int f453123q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f453124r;

    /* renamed from: s, reason: collision with root package name */
    public int f453125s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f453126t;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cj0)) {
            return false;
        }
        r45.cj0 cj0Var = (r45.cj0) fVar;
        return n51.f.a(this.f453113d, cj0Var.f453113d) && n51.f.a(java.lang.Integer.valueOf(this.f453114e), java.lang.Integer.valueOf(cj0Var.f453114e)) && n51.f.a(java.lang.Integer.valueOf(this.f453115f), java.lang.Integer.valueOf(cj0Var.f453115f)) && n51.f.a(this.f453116g, cj0Var.f453116g) && n51.f.a(java.lang.Integer.valueOf(this.f453117h), java.lang.Integer.valueOf(cj0Var.f453117h)) && n51.f.a(this.f453118i, cj0Var.f453118i) && n51.f.a(this.f453119m, cj0Var.f453119m) && n51.f.a(this.f453120n, cj0Var.f453120n) && n51.f.a(this.f453121o, cj0Var.f453121o) && n51.f.a(this.f453122p, cj0Var.f453122p) && n51.f.a(java.lang.Integer.valueOf(this.f453123q), java.lang.Integer.valueOf(cj0Var.f453123q)) && n51.f.a(this.f453124r, cj0Var.f453124r) && n51.f.a(java.lang.Integer.valueOf(this.f453125s), java.lang.Integer.valueOf(cj0Var.f453125s)) && n51.f.a(this.f453126t, cj0Var.f453126t);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f453113d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f453114e);
            fVar.e(3, this.f453115f);
            r45.cu5 cu5Var = this.f453116g;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.mo75928xcd1e8d8());
                this.f453116g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f453117h);
            java.lang.String str2 = this.f453118i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f453119m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f453120n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f453121o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f453122p;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            fVar.e(11, this.f453123q);
            java.lang.String str7 = this.f453124r;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            fVar.e(14, this.f453125s);
            java.lang.String str8 = this.f453126t;
            if (str8 != null) {
                fVar.j(16, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f453113d;
            int j17 = (str9 != null ? b36.f.j(1, str9) + 0 : 0) + b36.f.e(2, this.f453114e) + b36.f.e(3, this.f453115f);
            r45.cu5 cu5Var2 = this.f453116g;
            if (cu5Var2 != null) {
                j17 += b36.f.i(4, cu5Var2.mo75928xcd1e8d8());
            }
            int e17 = j17 + b36.f.e(5, this.f453117h);
            java.lang.String str10 = this.f453118i;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f453119m;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f453120n;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f453121o;
            if (str13 != null) {
                e17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f453122p;
            if (str14 != null) {
                e17 += b36.f.j(10, str14);
            }
            int e18 = e17 + b36.f.e(11, this.f453123q);
            java.lang.String str15 = this.f453124r;
            if (str15 != null) {
                e18 += b36.f.j(12, str15);
            }
            int e19 = e18 + b36.f.e(14, this.f453125s);
            java.lang.String str16 = this.f453126t;
            return str16 != null ? e19 + b36.f.j(16, str16) : e19;
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
        r45.cj0 cj0Var = (r45.cj0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cj0Var.f453113d = aVar2.k(intValue);
                return 0;
            case 2:
                cj0Var.f453114e = aVar2.g(intValue);
                return 0;
            case 3:
                cj0Var.f453115f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var3.b(bArr);
                    }
                    cj0Var.f453116g = cu5Var3;
                }
                return 0;
            case 5:
                cj0Var.f453117h = aVar2.g(intValue);
                return 0;
            case 6:
                cj0Var.f453118i = aVar2.k(intValue);
                return 0;
            case 7:
                cj0Var.f453119m = aVar2.k(intValue);
                return 0;
            case 8:
                cj0Var.f453120n = aVar2.k(intValue);
                return 0;
            case 9:
                cj0Var.f453121o = aVar2.k(intValue);
                return 0;
            case 10:
                cj0Var.f453122p = aVar2.k(intValue);
                return 0;
            case 11:
                cj0Var.f453123q = aVar2.g(intValue);
                return 0;
            case 12:
                cj0Var.f453124r = aVar2.k(intValue);
                return 0;
            case 13:
            case 15:
            default:
                return -1;
            case 14:
                cj0Var.f453125s = aVar2.g(intValue);
                return 0;
            case 16:
                cj0Var.f453126t = aVar2.k(intValue);
                return 0;
        }
    }
}
