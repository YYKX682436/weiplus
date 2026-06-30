package r45;

/* loaded from: classes9.dex */
public class ny4 extends r45.js5 {
    public r45.ce4 A;
    public java.lang.String B;

    /* renamed from: d, reason: collision with root package name */
    public int f463278d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463279e;

    /* renamed from: f, reason: collision with root package name */
    public r45.be4 f463280f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f463281g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f463282h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f463283i;

    /* renamed from: m, reason: collision with root package name */
    public int f463284m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f463285n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f463286o;

    /* renamed from: p, reason: collision with root package name */
    public r45.bp0 f463287p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f463288q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f463289r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f463290s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f463291t;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f463293v;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f463295x;

    /* renamed from: u, reason: collision with root package name */
    public java.util.LinkedList f463292u = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public java.util.LinkedList f463294w = new java.util.LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public java.util.LinkedList f463296y = new java.util.LinkedList();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.LinkedList f463297z = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ny4)) {
            return false;
        }
        r45.ny4 ny4Var = (r45.ny4) fVar;
        return n51.f.a(this.f76492x92037252, ny4Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f463278d), java.lang.Integer.valueOf(ny4Var.f463278d)) && n51.f.a(this.f463279e, ny4Var.f463279e) && n51.f.a(this.f463280f, ny4Var.f463280f) && n51.f.a(this.f463281g, ny4Var.f463281g) && n51.f.a(this.f463282h, ny4Var.f463282h) && n51.f.a(this.f463283i, ny4Var.f463283i) && n51.f.a(java.lang.Integer.valueOf(this.f463284m), java.lang.Integer.valueOf(ny4Var.f463284m)) && n51.f.a(this.f463285n, ny4Var.f463285n) && n51.f.a(this.f463286o, ny4Var.f463286o) && n51.f.a(this.f463287p, ny4Var.f463287p) && n51.f.a(this.f463288q, ny4Var.f463288q) && n51.f.a(java.lang.Boolean.valueOf(this.f463289r), java.lang.Boolean.valueOf(ny4Var.f463289r)) && n51.f.a(java.lang.Boolean.valueOf(this.f463290s), java.lang.Boolean.valueOf(ny4Var.f463290s)) && n51.f.a(java.lang.Boolean.valueOf(this.f463291t), java.lang.Boolean.valueOf(ny4Var.f463291t)) && n51.f.a(this.f463292u, ny4Var.f463292u) && n51.f.a(this.f463293v, ny4Var.f463293v) && n51.f.a(this.f463294w, ny4Var.f463294w) && n51.f.a(this.f463295x, ny4Var.f463295x) && n51.f.a(this.f463296y, ny4Var.f463296y) && n51.f.a(this.f463297z, ny4Var.f463297z) && n51.f.a(this.A, ny4Var.A) && n51.f.a(this.B, ny4Var.B);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f463297z;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f463278d);
            java.lang.String str = this.f463279e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.be4 be4Var = this.f463280f;
            if (be4Var != null) {
                fVar.i(4, be4Var.mo75928xcd1e8d8());
                this.f463280f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f463281g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f463282h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f463283i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f463284m);
            java.lang.String str5 = this.f463285n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f463286o;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            r45.bp0 bp0Var = this.f463287p;
            if (bp0Var != null) {
                fVar.i(11, bp0Var.mo75928xcd1e8d8());
                this.f463287p.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str7 = this.f463288q;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            fVar.a(13, this.f463289r);
            fVar.a(14, this.f463290s);
            fVar.a(15, this.f463291t);
            fVar.g(16, 8, this.f463292u);
            java.lang.String str8 = this.f463293v;
            if (str8 != null) {
                fVar.j(17, str8);
            }
            fVar.g(18, 8, this.f463294w);
            java.lang.String str9 = this.f463295x;
            if (str9 != null) {
                fVar.j(19, str9);
            }
            fVar.g(20, 8, this.f463296y);
            fVar.g(98, 8, linkedList);
            r45.ce4 ce4Var = this.A;
            if (ce4Var != null) {
                fVar.i(99, ce4Var.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str10 = this.B;
            if (str10 != null) {
                fVar.j(100, str10);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f463278d);
            java.lang.String str11 = this.f463279e;
            if (str11 != null) {
                i18 += b36.f.j(3, str11);
            }
            r45.be4 be4Var2 = this.f463280f;
            if (be4Var2 != null) {
                i18 += b36.f.i(4, be4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str12 = this.f463281g;
            if (str12 != null) {
                i18 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f463282h;
            if (str13 != null) {
                i18 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f463283i;
            if (str14 != null) {
                i18 += b36.f.j(7, str14);
            }
            int e17 = i18 + b36.f.e(8, this.f463284m);
            java.lang.String str15 = this.f463285n;
            if (str15 != null) {
                e17 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f463286o;
            if (str16 != null) {
                e17 += b36.f.j(10, str16);
            }
            r45.bp0 bp0Var2 = this.f463287p;
            if (bp0Var2 != null) {
                e17 += b36.f.i(11, bp0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str17 = this.f463288q;
            if (str17 != null) {
                e17 += b36.f.j(12, str17);
            }
            int a17 = e17 + b36.f.a(13, this.f463289r) + b36.f.a(14, this.f463290s) + b36.f.a(15, this.f463291t) + b36.f.g(16, 8, this.f463292u);
            java.lang.String str18 = this.f463293v;
            if (str18 != null) {
                a17 += b36.f.j(17, str18);
            }
            int g17 = a17 + b36.f.g(18, 8, this.f463294w);
            java.lang.String str19 = this.f463295x;
            if (str19 != null) {
                g17 += b36.f.j(19, str19);
            }
            int g18 = g17 + b36.f.g(20, 8, this.f463296y) + b36.f.g(98, 8, linkedList);
            r45.ce4 ce4Var2 = this.A;
            if (ce4Var2 != null) {
                g18 += b36.f.i(99, ce4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str20 = this.B;
            return str20 != null ? g18 + b36.f.j(100, str20) : g18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f463292u.clear();
            this.f463294w.clear();
            this.f463296y.clear();
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
        r45.ny4 ny4Var = (r45.ny4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    ny4Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                ny4Var.f463278d = aVar2.g(intValue);
                return 0;
            case 3:
                ny4Var.f463279e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.be4 be4Var3 = new r45.be4();
                    if (bArr3 != null && bArr3.length > 0) {
                        be4Var3.mo11468x92b714fd(bArr3);
                    }
                    ny4Var.f463280f = be4Var3;
                }
                return 0;
            case 5:
                ny4Var.f463281g = aVar2.k(intValue);
                return 0;
            case 6:
                ny4Var.f463282h = aVar2.k(intValue);
                return 0;
            case 7:
                ny4Var.f463283i = aVar2.k(intValue);
                return 0;
            case 8:
                ny4Var.f463284m = aVar2.g(intValue);
                return 0;
            case 9:
                ny4Var.f463285n = aVar2.k(intValue);
                return 0;
            case 10:
                ny4Var.f463286o = aVar2.k(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.bp0 bp0Var3 = new r45.bp0();
                    if (bArr4 != null && bArr4.length > 0) {
                        bp0Var3.mo11468x92b714fd(bArr4);
                    }
                    ny4Var.f463287p = bp0Var3;
                }
                return 0;
            case 12:
                ny4Var.f463288q = aVar2.k(intValue);
                return 0;
            case 13:
                ny4Var.f463289r = aVar2.c(intValue);
                return 0;
            case 14:
                ny4Var.f463290s = aVar2.c(intValue);
                return 0;
            case 15:
                ny4Var.f463291t = aVar2.c(intValue);
                return 0;
            case 16:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.if0 if0Var = new r45.if0();
                    if (bArr5 != null && bArr5.length > 0) {
                        if0Var.mo11468x92b714fd(bArr5);
                    }
                    ny4Var.f463292u.add(if0Var);
                }
                return 0;
            case 17:
                ny4Var.f463293v = aVar2.k(intValue);
                return 0;
            case 18:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.c70 c70Var = new r45.c70();
                    if (bArr6 != null && bArr6.length > 0) {
                        c70Var.mo11468x92b714fd(bArr6);
                    }
                    ny4Var.f463294w.add(c70Var);
                }
                return 0;
            case 19:
                ny4Var.f463295x = aVar2.k(intValue);
                return 0;
            case 20:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.nw3 nw3Var = new r45.nw3();
                    if (bArr7 != null && bArr7.length > 0) {
                        nw3Var.mo11468x92b714fd(bArr7);
                    }
                    ny4Var.f463296y.add(nw3Var);
                }
                return 0;
            default:
                switch (intValue) {
                    case 98:
                        java.util.LinkedList j37 = aVar2.j(intValue);
                        int size7 = j37.size();
                        for (int i39 = 0; i39 < size7; i39++) {
                            byte[] bArr8 = (byte[]) j37.get(i39);
                            r45.gf5 gf5Var = new r45.gf5();
                            if (bArr8 != null && bArr8.length > 0) {
                                gf5Var.mo11468x92b714fd(bArr8);
                            }
                            ny4Var.f463297z.add(gf5Var);
                        }
                        return 0;
                    case 99:
                        java.util.LinkedList j38 = aVar2.j(intValue);
                        int size8 = j38.size();
                        for (int i47 = 0; i47 < size8; i47++) {
                            byte[] bArr9 = (byte[]) j38.get(i47);
                            r45.ce4 ce4Var3 = new r45.ce4();
                            if (bArr9 != null && bArr9.length > 0) {
                                ce4Var3.mo11468x92b714fd(bArr9);
                            }
                            ny4Var.A = ce4Var3;
                        }
                        return 0;
                    case 100:
                        ny4Var.B = aVar2.k(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
