package r45;

/* loaded from: classes9.dex */
public class qp0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f465695d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f465696e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f465697f;

    /* renamed from: g, reason: collision with root package name */
    public int f465698g;

    /* renamed from: h, reason: collision with root package name */
    public int f465699h;

    /* renamed from: i, reason: collision with root package name */
    public int f465700i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f465701m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f465702n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f465703o;

    /* renamed from: p, reason: collision with root package name */
    public int f465704p;

    /* renamed from: q, reason: collision with root package name */
    public r45.rp0 f465705q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f465706r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f465707s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f465708t;

    /* renamed from: u, reason: collision with root package name */
    public int f465709u;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qp0)) {
            return false;
        }
        r45.qp0 qp0Var = (r45.qp0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f465695d), java.lang.Integer.valueOf(qp0Var.f465695d)) && n51.f.a(java.lang.Integer.valueOf(this.f465696e), java.lang.Integer.valueOf(qp0Var.f465696e)) && n51.f.a(java.lang.Integer.valueOf(this.f465697f), java.lang.Integer.valueOf(qp0Var.f465697f)) && n51.f.a(java.lang.Integer.valueOf(this.f465698g), java.lang.Integer.valueOf(qp0Var.f465698g)) && n51.f.a(java.lang.Integer.valueOf(this.f465699h), java.lang.Integer.valueOf(qp0Var.f465699h)) && n51.f.a(java.lang.Integer.valueOf(this.f465700i), java.lang.Integer.valueOf(qp0Var.f465700i)) && n51.f.a(this.f465701m, qp0Var.f465701m) && n51.f.a(this.f465702n, qp0Var.f465702n) && n51.f.a(this.f465703o, qp0Var.f465703o) && n51.f.a(java.lang.Integer.valueOf(this.f465704p), java.lang.Integer.valueOf(qp0Var.f465704p)) && n51.f.a(this.f465705q, qp0Var.f465705q) && n51.f.a(this.f465706r, qp0Var.f465706r) && n51.f.a(this.f465707s, qp0Var.f465707s) && n51.f.a(this.f465708t, qp0Var.f465708t) && n51.f.a(java.lang.Integer.valueOf(this.f465709u), java.lang.Integer.valueOf(qp0Var.f465709u));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f465695d);
            fVar.e(2, this.f465696e);
            fVar.e(3, this.f465697f);
            fVar.e(4, this.f465698g);
            fVar.e(5, this.f465699h);
            fVar.e(6, this.f465700i);
            java.lang.String str = this.f465701m;
            if (str != null) {
                fVar.j(7, str);
            }
            java.lang.String str2 = this.f465702n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            java.lang.String str3 = this.f465703o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.e(10, this.f465704p);
            r45.rp0 rp0Var = this.f465705q;
            if (rp0Var != null) {
                fVar.i(11, rp0Var.mo75928xcd1e8d8());
                this.f465705q.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f465706r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f465707s;
            if (str5 != null) {
                fVar.j(13, str5);
            }
            java.lang.String str6 = this.f465708t;
            if (str6 != null) {
                fVar.j(14, str6);
            }
            fVar.e(15, this.f465709u);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f465695d) + 0 + b36.f.e(2, this.f465696e) + b36.f.e(3, this.f465697f) + b36.f.e(4, this.f465698g) + b36.f.e(5, this.f465699h) + b36.f.e(6, this.f465700i);
            java.lang.String str7 = this.f465701m;
            if (str7 != null) {
                e17 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f465702n;
            if (str8 != null) {
                e17 += b36.f.j(8, str8);
            }
            java.lang.String str9 = this.f465703o;
            if (str9 != null) {
                e17 += b36.f.j(9, str9);
            }
            int e18 = e17 + b36.f.e(10, this.f465704p);
            r45.rp0 rp0Var2 = this.f465705q;
            if (rp0Var2 != null) {
                e18 += b36.f.i(11, rp0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.f465706r;
            if (str10 != null) {
                e18 += b36.f.j(12, str10);
            }
            java.lang.String str11 = this.f465707s;
            if (str11 != null) {
                e18 += b36.f.j(13, str11);
            }
            java.lang.String str12 = this.f465708t;
            if (str12 != null) {
                e18 += b36.f.j(14, str12);
            }
            return e18 + b36.f.e(15, this.f465709u);
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
        r45.qp0 qp0Var = (r45.qp0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qp0Var.f465695d = aVar2.g(intValue);
                return 0;
            case 2:
                qp0Var.f465696e = aVar2.g(intValue);
                return 0;
            case 3:
                qp0Var.f465697f = aVar2.g(intValue);
                return 0;
            case 4:
                qp0Var.f465698g = aVar2.g(intValue);
                return 0;
            case 5:
                qp0Var.f465699h = aVar2.g(intValue);
                return 0;
            case 6:
                qp0Var.f465700i = aVar2.g(intValue);
                return 0;
            case 7:
                qp0Var.f465701m = aVar2.k(intValue);
                return 0;
            case 8:
                qp0Var.f465702n = aVar2.k(intValue);
                return 0;
            case 9:
                qp0Var.f465703o = aVar2.k(intValue);
                return 0;
            case 10:
                qp0Var.f465704p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.rp0 rp0Var3 = new r45.rp0();
                    if (bArr != null && bArr.length > 0) {
                        rp0Var3.mo11468x92b714fd(bArr);
                    }
                    qp0Var.f465705q = rp0Var3;
                }
                return 0;
            case 12:
                qp0Var.f465706r = aVar2.k(intValue);
                return 0;
            case 13:
                qp0Var.f465707s = aVar2.k(intValue);
                return 0;
            case 14:
                qp0Var.f465708t = aVar2.k(intValue);
                return 0;
            case 15:
                qp0Var.f465709u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
