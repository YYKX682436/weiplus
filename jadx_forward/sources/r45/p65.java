package r45;

/* loaded from: classes9.dex */
public class p65 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f464330d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464331e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464332f;

    /* renamed from: g, reason: collision with root package name */
    public int f464333g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f464334h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f464335i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f464336m;

    /* renamed from: n, reason: collision with root package name */
    public int f464337n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f464338o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f464339p;

    /* renamed from: q, reason: collision with root package name */
    public long f464340q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f464341r = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p65)) {
            return false;
        }
        r45.p65 p65Var = (r45.p65) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f464330d), java.lang.Integer.valueOf(p65Var.f464330d)) && n51.f.a(this.f464331e, p65Var.f464331e) && n51.f.a(this.f464332f, p65Var.f464332f) && n51.f.a(java.lang.Integer.valueOf(this.f464333g), java.lang.Integer.valueOf(p65Var.f464333g)) && n51.f.a(this.f464334h, p65Var.f464334h) && n51.f.a(this.f464335i, p65Var.f464335i) && n51.f.a(this.f464336m, p65Var.f464336m) && n51.f.a(java.lang.Integer.valueOf(this.f464337n), java.lang.Integer.valueOf(p65Var.f464337n)) && n51.f.a(this.f464338o, p65Var.f464338o) && n51.f.a(this.f464339p, p65Var.f464339p) && n51.f.a(java.lang.Long.valueOf(this.f464340q), java.lang.Long.valueOf(p65Var.f464340q)) && n51.f.a(this.f464341r, p65Var.f464341r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f464341r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f464330d);
            java.lang.String str = this.f464331e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f464332f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f464333g);
            java.lang.String str3 = this.f464334h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f464335i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f464336m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f464337n);
            java.lang.String str6 = this.f464338o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f464339p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            fVar.h(11, this.f464340q);
            fVar.g(12, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f464330d) + 0;
            java.lang.String str8 = this.f464331e;
            if (str8 != null) {
                e17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f464332f;
            if (str9 != null) {
                e17 += b36.f.j(3, str9);
            }
            int e18 = e17 + b36.f.e(4, this.f464333g);
            java.lang.String str10 = this.f464334h;
            if (str10 != null) {
                e18 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f464335i;
            if (str11 != null) {
                e18 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f464336m;
            if (str12 != null) {
                e18 += b36.f.j(7, str12);
            }
            int e19 = e18 + b36.f.e(8, this.f464337n);
            java.lang.String str13 = this.f464338o;
            if (str13 != null) {
                e19 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f464339p;
            if (str14 != null) {
                e19 += b36.f.j(10, str14);
            }
            return e19 + b36.f.h(11, this.f464340q) + b36.f.g(12, 8, linkedList);
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
        r45.p65 p65Var = (r45.p65) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                p65Var.f464330d = aVar2.g(intValue);
                return 0;
            case 2:
                p65Var.f464331e = aVar2.k(intValue);
                return 0;
            case 3:
                p65Var.f464332f = aVar2.k(intValue);
                return 0;
            case 4:
                p65Var.f464333g = aVar2.g(intValue);
                return 0;
            case 5:
                p65Var.f464334h = aVar2.k(intValue);
                return 0;
            case 6:
                p65Var.f464335i = aVar2.k(intValue);
                return 0;
            case 7:
                p65Var.f464336m = aVar2.k(intValue);
                return 0;
            case 8:
                p65Var.f464337n = aVar2.g(intValue);
                return 0;
            case 9:
                p65Var.f464338o = aVar2.k(intValue);
                return 0;
            case 10:
                p65Var.f464339p = aVar2.k(intValue);
                return 0;
            case 11:
                p65Var.f464340q = aVar2.i(intValue);
                return 0;
            case 12:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.e65 e65Var = new r45.e65();
                    if (bArr2 != null && bArr2.length > 0) {
                        e65Var.mo11468x92b714fd(bArr2);
                    }
                    p65Var.f464341r.add(e65Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
