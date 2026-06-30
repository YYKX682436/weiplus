package r45;

/* loaded from: classes9.dex */
public class op0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463940d;

    /* renamed from: e, reason: collision with root package name */
    public int f463941e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463942f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f463943g;

    /* renamed from: h, reason: collision with root package name */
    public int f463944h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f463945i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f463946m;

    /* renamed from: n, reason: collision with root package name */
    public int f463947n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f463948o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f463949p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f463950q;

    /* renamed from: r, reason: collision with root package name */
    public int f463951r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f463952s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f463953t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.LinkedList f463954u = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.op0)) {
            return false;
        }
        r45.op0 op0Var = (r45.op0) fVar;
        return n51.f.a(this.f463940d, op0Var.f463940d) && n51.f.a(java.lang.Integer.valueOf(this.f463941e), java.lang.Integer.valueOf(op0Var.f463941e)) && n51.f.a(this.f463942f, op0Var.f463942f) && n51.f.a(this.f463943g, op0Var.f463943g) && n51.f.a(java.lang.Integer.valueOf(this.f463944h), java.lang.Integer.valueOf(op0Var.f463944h)) && n51.f.a(this.f463945i, op0Var.f463945i) && n51.f.a(this.f463946m, op0Var.f463946m) && n51.f.a(java.lang.Integer.valueOf(this.f463947n), java.lang.Integer.valueOf(op0Var.f463947n)) && n51.f.a(this.f463948o, op0Var.f463948o) && n51.f.a(this.f463949p, op0Var.f463949p) && n51.f.a(this.f463950q, op0Var.f463950q) && n51.f.a(java.lang.Integer.valueOf(this.f463951r), java.lang.Integer.valueOf(op0Var.f463951r)) && n51.f.a(java.lang.Boolean.valueOf(this.f463952s), java.lang.Boolean.valueOf(op0Var.f463952s)) && n51.f.a(java.lang.Boolean.valueOf(this.f463953t), java.lang.Boolean.valueOf(op0Var.f463953t)) && n51.f.a(this.f463954u, op0Var.f463954u);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f463940d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f463941e);
            java.lang.String str2 = this.f463942f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f463943g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f463944h);
            java.lang.String str4 = this.f463945i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f463946m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f463947n);
            java.lang.String str6 = this.f463948o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f463949p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f463950q;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            fVar.e(12, this.f463951r);
            fVar.a(13, this.f463952s);
            fVar.a(14, this.f463953t);
            fVar.g(15, 8, this.f463954u);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f463940d;
            int j17 = (str9 != null ? b36.f.j(1, str9) + 0 : 0) + b36.f.e(2, this.f463941e);
            java.lang.String str10 = this.f463942f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f463943g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            int e17 = j17 + b36.f.e(5, this.f463944h);
            java.lang.String str12 = this.f463945i;
            if (str12 != null) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f463946m;
            if (str13 != null) {
                e17 += b36.f.j(7, str13);
            }
            int e18 = e17 + b36.f.e(8, this.f463947n);
            java.lang.String str14 = this.f463948o;
            if (str14 != null) {
                e18 += b36.f.j(9, str14);
            }
            java.lang.String str15 = this.f463949p;
            if (str15 != null) {
                e18 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f463950q;
            if (str16 != null) {
                e18 += b36.f.j(11, str16);
            }
            return e18 + b36.f.e(12, this.f463951r) + b36.f.a(13, this.f463952s) + b36.f.a(14, this.f463953t) + b36.f.g(15, 8, this.f463954u);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f463954u.clear();
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
        r45.op0 op0Var = (r45.op0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                op0Var.f463940d = aVar2.k(intValue);
                return 0;
            case 2:
                op0Var.f463941e = aVar2.g(intValue);
                return 0;
            case 3:
                op0Var.f463942f = aVar2.k(intValue);
                return 0;
            case 4:
                op0Var.f463943g = aVar2.k(intValue);
                return 0;
            case 5:
                op0Var.f463944h = aVar2.g(intValue);
                return 0;
            case 6:
                op0Var.f463945i = aVar2.k(intValue);
                return 0;
            case 7:
                op0Var.f463946m = aVar2.k(intValue);
                return 0;
            case 8:
                op0Var.f463947n = aVar2.g(intValue);
                return 0;
            case 9:
                op0Var.f463948o = aVar2.k(intValue);
                return 0;
            case 10:
                op0Var.f463949p = aVar2.k(intValue);
                return 0;
            case 11:
                op0Var.f463950q = aVar2.k(intValue);
                return 0;
            case 12:
                op0Var.f463951r = aVar2.g(intValue);
                return 0;
            case 13:
                op0Var.f463952s = aVar2.c(intValue);
                return 0;
            case 14:
                op0Var.f463953t = aVar2.c(intValue);
                return 0;
            case 15:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.np0 np0Var = new r45.np0();
                    if (bArr2 != null && bArr2.length > 0) {
                        np0Var.mo11468x92b714fd(bArr2);
                    }
                    op0Var.f463954u.add(np0Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
