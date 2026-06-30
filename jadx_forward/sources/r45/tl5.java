package r45;

/* loaded from: classes4.dex */
public class tl5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f468085d;

    /* renamed from: e, reason: collision with root package name */
    public float f468086e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f468087f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f468088g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f468089h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f468090i;

    /* renamed from: m, reason: collision with root package name */
    public int f468091m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f468092n;

    /* renamed from: o, reason: collision with root package name */
    public int f468093o;

    /* renamed from: p, reason: collision with root package name */
    public int f468094p;

    /* renamed from: q, reason: collision with root package name */
    public int f468095q;

    /* renamed from: r, reason: collision with root package name */
    public float f468096r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f468097s;

    /* renamed from: t, reason: collision with root package name */
    public int f468098t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f468099u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f468100v;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tl5)) {
            return false;
        }
        r45.tl5 tl5Var = (r45.tl5) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f468085d), java.lang.Float.valueOf(tl5Var.f468085d)) && n51.f.a(java.lang.Float.valueOf(this.f468086e), java.lang.Float.valueOf(tl5Var.f468086e)) && n51.f.a(this.f468087f, tl5Var.f468087f) && n51.f.a(this.f468088g, tl5Var.f468088g) && n51.f.a(this.f468089h, tl5Var.f468089h) && n51.f.a(this.f468090i, tl5Var.f468090i) && n51.f.a(java.lang.Integer.valueOf(this.f468091m), java.lang.Integer.valueOf(tl5Var.f468091m)) && n51.f.a(this.f468092n, tl5Var.f468092n) && n51.f.a(java.lang.Integer.valueOf(this.f468093o), java.lang.Integer.valueOf(tl5Var.f468093o)) && n51.f.a(java.lang.Integer.valueOf(this.f468094p), java.lang.Integer.valueOf(tl5Var.f468094p)) && n51.f.a(java.lang.Integer.valueOf(this.f468095q), java.lang.Integer.valueOf(tl5Var.f468095q)) && n51.f.a(java.lang.Float.valueOf(this.f468096r), java.lang.Float.valueOf(tl5Var.f468096r)) && n51.f.a(this.f468097s, tl5Var.f468097s) && n51.f.a(java.lang.Integer.valueOf(this.f468098t), java.lang.Integer.valueOf(tl5Var.f468098t)) && n51.f.a(this.f468099u, tl5Var.f468099u) && n51.f.a(this.f468100v, tl5Var.f468100v);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f468085d);
            fVar.d(2, this.f468086e);
            java.lang.String str = this.f468087f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f468088g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f468089h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f468090i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f468091m);
            java.lang.String str5 = this.f468092n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.e(9, this.f468093o);
            fVar.e(10, this.f468094p);
            fVar.e(11, this.f468095q);
            fVar.d(12, this.f468096r);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f468097s;
            if (gVar != null) {
                fVar.b(13, gVar);
            }
            fVar.e(14, this.f468098t);
            java.lang.String str6 = this.f468099u;
            if (str6 != null) {
                fVar.j(15, str6);
            }
            java.lang.String str7 = this.f468100v;
            if (str7 != null) {
                fVar.j(16, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = b36.f.d(1, this.f468085d) + 0 + b36.f.d(2, this.f468086e);
            java.lang.String str8 = this.f468087f;
            if (str8 != null) {
                d17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f468088g;
            if (str9 != null) {
                d17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f468089h;
            if (str10 != null) {
                d17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f468090i;
            if (str11 != null) {
                d17 += b36.f.j(6, str11);
            }
            int e17 = d17 + b36.f.e(7, this.f468091m);
            java.lang.String str12 = this.f468092n;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            int e18 = e17 + b36.f.e(9, this.f468093o) + b36.f.e(10, this.f468094p) + b36.f.e(11, this.f468095q) + b36.f.d(12, this.f468096r);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f468097s;
            if (gVar2 != null) {
                e18 += b36.f.b(13, gVar2);
            }
            int e19 = e18 + b36.f.e(14, this.f468098t);
            java.lang.String str13 = this.f468099u;
            if (str13 != null) {
                e19 += b36.f.j(15, str13);
            }
            java.lang.String str14 = this.f468100v;
            return str14 != null ? e19 + b36.f.j(16, str14) : e19;
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
        r45.tl5 tl5Var = (r45.tl5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tl5Var.f468085d = aVar2.f(intValue);
                return 0;
            case 2:
                tl5Var.f468086e = aVar2.f(intValue);
                return 0;
            case 3:
                tl5Var.f468087f = aVar2.k(intValue);
                return 0;
            case 4:
                tl5Var.f468088g = aVar2.k(intValue);
                return 0;
            case 5:
                tl5Var.f468089h = aVar2.k(intValue);
                return 0;
            case 6:
                tl5Var.f468090i = aVar2.k(intValue);
                return 0;
            case 7:
                tl5Var.f468091m = aVar2.g(intValue);
                return 0;
            case 8:
                tl5Var.f468092n = aVar2.k(intValue);
                return 0;
            case 9:
                tl5Var.f468093o = aVar2.g(intValue);
                return 0;
            case 10:
                tl5Var.f468094p = aVar2.g(intValue);
                return 0;
            case 11:
                tl5Var.f468095q = aVar2.g(intValue);
                return 0;
            case 12:
                tl5Var.f468096r = aVar2.f(intValue);
                return 0;
            case 13:
                tl5Var.f468097s = aVar2.d(intValue);
                return 0;
            case 14:
                tl5Var.f468098t = aVar2.g(intValue);
                return 0;
            case 15:
                tl5Var.f468099u = aVar2.k(intValue);
                return 0;
            case 16:
                tl5Var.f468100v = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
