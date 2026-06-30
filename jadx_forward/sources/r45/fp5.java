package r45;

/* loaded from: classes10.dex */
public class fp5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456061d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456062e;

    /* renamed from: f, reason: collision with root package name */
    public int f456063f;

    /* renamed from: g, reason: collision with root package name */
    public int f456064g;

    /* renamed from: h, reason: collision with root package name */
    public int f456065h;

    /* renamed from: i, reason: collision with root package name */
    public int f456066i;

    /* renamed from: m, reason: collision with root package name */
    public int f456067m;

    /* renamed from: n, reason: collision with root package name */
    public int f456068n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f456069o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fp5)) {
            return false;
        }
        r45.fp5 fp5Var = (r45.fp5) fVar;
        return n51.f.a(this.f456061d, fp5Var.f456061d) && n51.f.a(this.f456062e, fp5Var.f456062e) && n51.f.a(java.lang.Integer.valueOf(this.f456063f), java.lang.Integer.valueOf(fp5Var.f456063f)) && n51.f.a(java.lang.Integer.valueOf(this.f456064g), java.lang.Integer.valueOf(fp5Var.f456064g)) && n51.f.a(java.lang.Integer.valueOf(this.f456065h), java.lang.Integer.valueOf(fp5Var.f456065h)) && n51.f.a(java.lang.Integer.valueOf(this.f456066i), java.lang.Integer.valueOf(fp5Var.f456066i)) && n51.f.a(java.lang.Integer.valueOf(this.f456067m), java.lang.Integer.valueOf(fp5Var.f456067m)) && n51.f.a(java.lang.Integer.valueOf(this.f456068n), java.lang.Integer.valueOf(fp5Var.f456068n)) && n51.f.a(this.f456069o, fp5Var.f456069o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f456061d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f456062e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f456063f);
            fVar.e(4, this.f456064g);
            fVar.e(5, this.f456065h);
            fVar.e(6, this.f456066i);
            fVar.e(7, this.f456067m);
            fVar.e(8, this.f456068n);
            java.lang.String str3 = this.f456069o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f456061d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f456062e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int e17 = j17 + b36.f.e(3, this.f456063f) + b36.f.e(4, this.f456064g) + b36.f.e(5, this.f456065h) + b36.f.e(6, this.f456066i) + b36.f.e(7, this.f456067m) + b36.f.e(8, this.f456068n);
            java.lang.String str6 = this.f456069o;
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
        r45.fp5 fp5Var = (r45.fp5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fp5Var.f456061d = aVar2.k(intValue);
                return 0;
            case 2:
                fp5Var.f456062e = aVar2.k(intValue);
                return 0;
            case 3:
                fp5Var.f456063f = aVar2.g(intValue);
                return 0;
            case 4:
                fp5Var.f456064g = aVar2.g(intValue);
                return 0;
            case 5:
                fp5Var.f456065h = aVar2.g(intValue);
                return 0;
            case 6:
                fp5Var.f456066i = aVar2.g(intValue);
                return 0;
            case 7:
                fp5Var.f456067m = aVar2.g(intValue);
                return 0;
            case 8:
                fp5Var.f456068n = aVar2.g(intValue);
                return 0;
            case 9:
                fp5Var.f456069o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
