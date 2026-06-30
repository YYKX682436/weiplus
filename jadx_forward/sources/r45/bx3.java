package r45;

/* loaded from: classes9.dex */
public class bx3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452652d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452653e;

    /* renamed from: f, reason: collision with root package name */
    public long f452654f;

    /* renamed from: g, reason: collision with root package name */
    public int f452655g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f452656h;

    /* renamed from: i, reason: collision with root package name */
    public int f452657i;

    /* renamed from: m, reason: collision with root package name */
    public r45.n75 f452658m;

    /* renamed from: n, reason: collision with root package name */
    public int f452659n;

    /* renamed from: o, reason: collision with root package name */
    public int f452660o;

    /* renamed from: p, reason: collision with root package name */
    public int f452661p;

    /* renamed from: q, reason: collision with root package name */
    public int f452662q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f452663r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f452664s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bx3)) {
            return false;
        }
        r45.bx3 bx3Var = (r45.bx3) fVar;
        return n51.f.a(this.f452652d, bx3Var.f452652d) && n51.f.a(this.f452653e, bx3Var.f452653e) && n51.f.a(java.lang.Long.valueOf(this.f452654f), java.lang.Long.valueOf(bx3Var.f452654f)) && n51.f.a(java.lang.Integer.valueOf(this.f452655g), java.lang.Integer.valueOf(bx3Var.f452655g)) && n51.f.a(this.f452656h, bx3Var.f452656h) && n51.f.a(java.lang.Integer.valueOf(this.f452657i), java.lang.Integer.valueOf(bx3Var.f452657i)) && n51.f.a(this.f452658m, bx3Var.f452658m) && n51.f.a(java.lang.Integer.valueOf(this.f452659n), java.lang.Integer.valueOf(bx3Var.f452659n)) && n51.f.a(java.lang.Integer.valueOf(this.f452660o), java.lang.Integer.valueOf(bx3Var.f452660o)) && n51.f.a(java.lang.Integer.valueOf(this.f452661p), java.lang.Integer.valueOf(bx3Var.f452661p)) && n51.f.a(java.lang.Integer.valueOf(this.f452662q), java.lang.Integer.valueOf(bx3Var.f452662q)) && n51.f.a(this.f452663r, bx3Var.f452663r) && n51.f.a(this.f452664s, bx3Var.f452664s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f452652d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f452653e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f452654f);
            fVar.e(4, this.f452655g);
            java.lang.String str3 = this.f452656h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f452657i);
            r45.n75 n75Var = this.f452658m;
            if (n75Var != null) {
                fVar.i(7, n75Var.mo75928xcd1e8d8());
                this.f452658m.mo75956x3d5d1f78(fVar);
            }
            fVar.e(8, this.f452659n);
            fVar.e(9, this.f452660o);
            fVar.e(10, this.f452661p);
            fVar.e(11, this.f452662q);
            java.lang.String str4 = this.f452663r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f452664s;
            if (str5 == null) {
                return 0;
            }
            fVar.j(13, str5);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f452652d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f452653e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            int h17 = j17 + b36.f.h(3, this.f452654f) + b36.f.e(4, this.f452655g);
            java.lang.String str8 = this.f452656h;
            if (str8 != null) {
                h17 += b36.f.j(5, str8);
            }
            int e17 = h17 + b36.f.e(6, this.f452657i);
            r45.n75 n75Var2 = this.f452658m;
            if (n75Var2 != null) {
                e17 += b36.f.i(7, n75Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(8, this.f452659n) + b36.f.e(9, this.f452660o) + b36.f.e(10, this.f452661p) + b36.f.e(11, this.f452662q);
            java.lang.String str9 = this.f452663r;
            if (str9 != null) {
                e18 += b36.f.j(12, str9);
            }
            java.lang.String str10 = this.f452664s;
            return str10 != null ? e18 + b36.f.j(13, str10) : e18;
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
        r45.bx3 bx3Var = (r45.bx3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bx3Var.f452652d = aVar2.k(intValue);
                return 0;
            case 2:
                bx3Var.f452653e = aVar2.k(intValue);
                return 0;
            case 3:
                bx3Var.f452654f = aVar2.i(intValue);
                return 0;
            case 4:
                bx3Var.f452655g = aVar2.g(intValue);
                return 0;
            case 5:
                bx3Var.f452656h = aVar2.k(intValue);
                return 0;
            case 6:
                bx3Var.f452657i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.n75 n75Var3 = new r45.n75();
                    if (bArr != null && bArr.length > 0) {
                        n75Var3.mo11468x92b714fd(bArr);
                    }
                    bx3Var.f452658m = n75Var3;
                }
                return 0;
            case 8:
                bx3Var.f452659n = aVar2.g(intValue);
                return 0;
            case 9:
                bx3Var.f452660o = aVar2.g(intValue);
                return 0;
            case 10:
                bx3Var.f452661p = aVar2.g(intValue);
                return 0;
            case 11:
                bx3Var.f452662q = aVar2.g(intValue);
                return 0;
            case 12:
                bx3Var.f452663r = aVar2.k(intValue);
                return 0;
            case 13:
                bx3Var.f452664s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
