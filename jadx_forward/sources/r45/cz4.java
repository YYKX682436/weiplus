package r45;

/* loaded from: classes11.dex */
public class cz4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453471d;

    /* renamed from: e, reason: collision with root package name */
    public int f453472e;

    /* renamed from: f, reason: collision with root package name */
    public int f453473f;

    /* renamed from: g, reason: collision with root package name */
    public int f453474g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f453475h;

    /* renamed from: i, reason: collision with root package name */
    public int f453476i;

    /* renamed from: m, reason: collision with root package name */
    public int f453477m;

    /* renamed from: n, reason: collision with root package name */
    public int f453478n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f453479o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cz4)) {
            return false;
        }
        r45.cz4 cz4Var = (r45.cz4) fVar;
        return n51.f.a(this.f453471d, cz4Var.f453471d) && n51.f.a(java.lang.Integer.valueOf(this.f453472e), java.lang.Integer.valueOf(cz4Var.f453472e)) && n51.f.a(java.lang.Integer.valueOf(this.f453473f), java.lang.Integer.valueOf(cz4Var.f453473f)) && n51.f.a(java.lang.Integer.valueOf(this.f453474g), java.lang.Integer.valueOf(cz4Var.f453474g)) && n51.f.a(this.f453475h, cz4Var.f453475h) && n51.f.a(java.lang.Integer.valueOf(this.f453476i), java.lang.Integer.valueOf(cz4Var.f453476i)) && n51.f.a(java.lang.Integer.valueOf(this.f453477m), java.lang.Integer.valueOf(cz4Var.f453477m)) && n51.f.a(java.lang.Integer.valueOf(this.f453478n), java.lang.Integer.valueOf(cz4Var.f453478n)) && n51.f.a(this.f453479o, cz4Var.f453479o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f453471d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f453472e);
            fVar.e(3, this.f453473f);
            fVar.e(4, this.f453474g);
            java.lang.String str2 = this.f453475h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f453476i);
            fVar.e(7, this.f453477m);
            fVar.e(8, this.f453478n);
            java.lang.String str3 = this.f453479o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f453471d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f453472e) + b36.f.e(3, this.f453473f) + b36.f.e(4, this.f453474g);
            java.lang.String str5 = this.f453475h;
            if (str5 != null) {
                j17 += b36.f.j(5, str5);
            }
            int e17 = j17 + b36.f.e(6, this.f453476i) + b36.f.e(7, this.f453477m) + b36.f.e(8, this.f453478n);
            java.lang.String str6 = this.f453479o;
            return str6 != null ? e17 + b36.f.j(9, str6) : e17;
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
        r45.cz4 cz4Var = (r45.cz4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cz4Var.f453471d = aVar2.k(intValue);
                return 0;
            case 2:
                cz4Var.f453472e = aVar2.g(intValue);
                return 0;
            case 3:
                cz4Var.f453473f = aVar2.g(intValue);
                return 0;
            case 4:
                cz4Var.f453474g = aVar2.g(intValue);
                return 0;
            case 5:
                cz4Var.f453475h = aVar2.k(intValue);
                return 0;
            case 6:
                cz4Var.f453476i = aVar2.g(intValue);
                return 0;
            case 7:
                cz4Var.f453477m = aVar2.g(intValue);
                return 0;
            case 8:
                cz4Var.f453478n = aVar2.g(intValue);
                return 0;
            case 9:
                cz4Var.f453479o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
