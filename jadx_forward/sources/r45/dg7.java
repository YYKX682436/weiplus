package r45;

/* loaded from: classes7.dex */
public class dg7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453986d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453987e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f453988f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f453989g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f453990h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f453991i;

    /* renamed from: m, reason: collision with root package name */
    public int f453992m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f453993n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dg7)) {
            return false;
        }
        r45.dg7 dg7Var = (r45.dg7) fVar;
        return n51.f.a(this.f453986d, dg7Var.f453986d) && n51.f.a(this.f453987e, dg7Var.f453987e) && n51.f.a(this.f453988f, dg7Var.f453988f) && n51.f.a(this.f453989g, dg7Var.f453989g) && n51.f.a(this.f453990h, dg7Var.f453990h) && n51.f.a(this.f453991i, dg7Var.f453991i) && n51.f.a(java.lang.Integer.valueOf(this.f453992m), java.lang.Integer.valueOf(dg7Var.f453992m)) && n51.f.a(this.f453993n, dg7Var.f453993n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f453986d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f453987e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f453988f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f453989g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f453990h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f453991i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.e(7, this.f453992m);
            java.lang.String str7 = this.f453993n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f453986d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f453987e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f453988f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f453989g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f453990h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f453991i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            int e17 = j17 + b36.f.e(7, this.f453992m);
            java.lang.String str14 = this.f453993n;
            return str14 != null ? e17 + b36.f.j(8, str14) : e17;
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
        r45.dg7 dg7Var = (r45.dg7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dg7Var.f453986d = aVar2.k(intValue);
                return 0;
            case 2:
                dg7Var.f453987e = aVar2.k(intValue);
                return 0;
            case 3:
                dg7Var.f453988f = aVar2.k(intValue);
                return 0;
            case 4:
                dg7Var.f453989g = aVar2.k(intValue);
                return 0;
            case 5:
                dg7Var.f453990h = aVar2.k(intValue);
                return 0;
            case 6:
                dg7Var.f453991i = aVar2.k(intValue);
                return 0;
            case 7:
                dg7Var.f453992m = aVar2.g(intValue);
                return 0;
            case 8:
                dg7Var.f453993n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
