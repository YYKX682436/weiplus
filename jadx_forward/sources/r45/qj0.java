package r45;

/* loaded from: classes12.dex */
public class qj0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public r45.pj0 D;
    public r45.v75 E;
    public java.lang.String F;
    public r45.l35 G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public r45.tj0 f465564J;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465565d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465566e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465567f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f465568g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465569h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f465570i;

    /* renamed from: m, reason: collision with root package name */
    public int f465571m;

    /* renamed from: n, reason: collision with root package name */
    public int f465572n;

    /* renamed from: o, reason: collision with root package name */
    public int f465573o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f465575q;

    /* renamed from: r, reason: collision with root package name */
    public int f465576r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f465577s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f465578t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f465579u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f465580v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f465581w;

    /* renamed from: x, reason: collision with root package name */
    public int f465582x;

    /* renamed from: z, reason: collision with root package name */
    public int f465584z;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f465574p = new java.util.LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public final java.util.LinkedList f465583y = new java.util.LinkedList();

    static {
        new r45.qj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.qj0 mo11468x92b714fd(byte[] bArr) {
        return (r45.qj0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qj0)) {
            return false;
        }
        r45.qj0 qj0Var = (r45.qj0) fVar;
        return n51.f.a(this.f465565d, qj0Var.f465565d) && n51.f.a(this.f465566e, qj0Var.f465566e) && n51.f.a(this.f465567f, qj0Var.f465567f) && n51.f.a(this.f465568g, qj0Var.f465568g) && n51.f.a(this.f465569h, qj0Var.f465569h) && n51.f.a(this.f465570i, qj0Var.f465570i) && n51.f.a(java.lang.Integer.valueOf(this.f465571m), java.lang.Integer.valueOf(qj0Var.f465571m)) && n51.f.a(java.lang.Integer.valueOf(this.f465572n), java.lang.Integer.valueOf(qj0Var.f465572n)) && n51.f.a(java.lang.Integer.valueOf(this.f465573o), java.lang.Integer.valueOf(qj0Var.f465573o)) && n51.f.a(this.f465574p, qj0Var.f465574p) && n51.f.a(this.f465575q, qj0Var.f465575q) && n51.f.a(java.lang.Integer.valueOf(this.f465576r), java.lang.Integer.valueOf(qj0Var.f465576r)) && n51.f.a(this.f465577s, qj0Var.f465577s) && n51.f.a(this.f465578t, qj0Var.f465578t) && n51.f.a(this.f465579u, qj0Var.f465579u) && n51.f.a(this.f465580v, qj0Var.f465580v) && n51.f.a(this.f465581w, qj0Var.f465581w) && n51.f.a(java.lang.Integer.valueOf(this.f465582x), java.lang.Integer.valueOf(qj0Var.f465582x)) && n51.f.a(this.f465583y, qj0Var.f465583y) && n51.f.a(java.lang.Integer.valueOf(this.f465584z), java.lang.Integer.valueOf(qj0Var.f465584z)) && n51.f.a(this.A, qj0Var.A) && n51.f.a(this.B, qj0Var.B) && n51.f.a(this.C, qj0Var.C) && n51.f.a(this.D, qj0Var.D) && n51.f.a(this.E, qj0Var.E) && n51.f.a(this.F, qj0Var.F) && n51.f.a(this.G, qj0Var.G) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(qj0Var.H)) && n51.f.a(java.lang.Integer.valueOf(this.I), java.lang.Integer.valueOf(qj0Var.I)) && n51.f.a(this.f465564J, qj0Var.f465564J);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.qj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f465583y;
        java.util.LinkedList linkedList2 = this.f465574p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f465565d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f465566e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f465567f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f465568g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f465569h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f465570i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.e(7, this.f465571m);
            fVar.e(8, this.f465572n);
            fVar.e(9, this.f465573o);
            fVar.g(10, 8, linkedList2);
            java.lang.String str7 = this.f465575q;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            fVar.e(12, this.f465576r);
            java.lang.String str8 = this.f465577s;
            if (str8 != null) {
                fVar.j(13, str8);
            }
            java.lang.String str9 = this.f465578t;
            if (str9 != null) {
                fVar.j(14, str9);
            }
            java.lang.String str10 = this.f465579u;
            if (str10 != null) {
                fVar.j(15, str10);
            }
            java.lang.String str11 = this.f465580v;
            if (str11 != null) {
                fVar.j(16, str11);
            }
            java.lang.String str12 = this.f465581w;
            if (str12 != null) {
                fVar.j(17, str12);
            }
            fVar.e(18, this.f465582x);
            fVar.g(19, 8, linkedList);
            fVar.e(20, this.f465584z);
            java.lang.String str13 = this.A;
            if (str13 != null) {
                fVar.j(21, str13);
            }
            java.lang.String str14 = this.B;
            if (str14 != null) {
                fVar.j(22, str14);
            }
            java.lang.String str15 = this.C;
            if (str15 != null) {
                fVar.j(23, str15);
            }
            r45.pj0 pj0Var = this.D;
            if (pj0Var != null) {
                fVar.i(24, pj0Var.mo75928xcd1e8d8());
                this.D.mo75956x3d5d1f78(fVar);
            }
            r45.v75 v75Var = this.E;
            if (v75Var != null) {
                fVar.i(25, v75Var.mo75928xcd1e8d8());
                this.E.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str16 = this.F;
            if (str16 != null) {
                fVar.j(26, str16);
            }
            r45.l35 l35Var = this.G;
            if (l35Var != null) {
                fVar.i(27, l35Var.mo75928xcd1e8d8());
                this.G.mo75956x3d5d1f78(fVar);
            }
            fVar.e(28, this.H);
            fVar.e(29, this.I);
            r45.tj0 tj0Var = this.f465564J;
            if (tj0Var != null) {
                fVar.i(30, tj0Var.mo75928xcd1e8d8());
                this.f465564J.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str17 = this.f465565d;
            int j17 = str17 != null ? b36.f.j(1, str17) + 0 : 0;
            java.lang.String str18 = this.f465566e;
            if (str18 != null) {
                j17 += b36.f.j(2, str18);
            }
            java.lang.String str19 = this.f465567f;
            if (str19 != null) {
                j17 += b36.f.j(3, str19);
            }
            java.lang.String str20 = this.f465568g;
            if (str20 != null) {
                j17 += b36.f.j(4, str20);
            }
            java.lang.String str21 = this.f465569h;
            if (str21 != null) {
                j17 += b36.f.j(5, str21);
            }
            java.lang.String str22 = this.f465570i;
            if (str22 != null) {
                j17 += b36.f.j(6, str22);
            }
            int e17 = j17 + b36.f.e(7, this.f465571m) + b36.f.e(8, this.f465572n) + b36.f.e(9, this.f465573o) + b36.f.g(10, 8, linkedList2);
            java.lang.String str23 = this.f465575q;
            if (str23 != null) {
                e17 += b36.f.j(11, str23);
            }
            int e18 = e17 + b36.f.e(12, this.f465576r);
            java.lang.String str24 = this.f465577s;
            if (str24 != null) {
                e18 += b36.f.j(13, str24);
            }
            java.lang.String str25 = this.f465578t;
            if (str25 != null) {
                e18 += b36.f.j(14, str25);
            }
            java.lang.String str26 = this.f465579u;
            if (str26 != null) {
                e18 += b36.f.j(15, str26);
            }
            java.lang.String str27 = this.f465580v;
            if (str27 != null) {
                e18 += b36.f.j(16, str27);
            }
            java.lang.String str28 = this.f465581w;
            if (str28 != null) {
                e18 += b36.f.j(17, str28);
            }
            int e19 = e18 + b36.f.e(18, this.f465582x) + b36.f.g(19, 8, linkedList) + b36.f.e(20, this.f465584z);
            java.lang.String str29 = this.A;
            if (str29 != null) {
                e19 += b36.f.j(21, str29);
            }
            java.lang.String str30 = this.B;
            if (str30 != null) {
                e19 += b36.f.j(22, str30);
            }
            java.lang.String str31 = this.C;
            if (str31 != null) {
                e19 += b36.f.j(23, str31);
            }
            r45.pj0 pj0Var2 = this.D;
            if (pj0Var2 != null) {
                e19 += b36.f.i(24, pj0Var2.mo75928xcd1e8d8());
            }
            r45.v75 v75Var2 = this.E;
            if (v75Var2 != null) {
                e19 += b36.f.i(25, v75Var2.mo75928xcd1e8d8());
            }
            java.lang.String str32 = this.F;
            if (str32 != null) {
                e19 += b36.f.j(26, str32);
            }
            r45.l35 l35Var2 = this.G;
            if (l35Var2 != null) {
                e19 += b36.f.i(27, l35Var2.mo75928xcd1e8d8());
            }
            int e27 = e19 + b36.f.e(28, this.H) + b36.f.e(29, this.I);
            r45.tj0 tj0Var2 = this.f465564J;
            return tj0Var2 != null ? e27 + b36.f.i(30, tj0Var2.mo75928xcd1e8d8()) : e27;
        }
        if (i17 == 2) {
            linkedList2.clear();
            linkedList.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f465565d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f465566e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f465567f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f465568g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f465569h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f465570i = aVar2.k(intValue);
                return 0;
            case 7:
                this.f465571m = aVar2.g(intValue);
                return 0;
            case 8:
                this.f465572n = aVar2.g(intValue);
                return 0;
            case 9:
                this.f465573o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr != null && bArr.length > 0) {
                        du5Var.b(bArr);
                    }
                    linkedList2.add(du5Var);
                }
                return 0;
            case 11:
                this.f465575q = aVar2.k(intValue);
                return 0;
            case 12:
                this.f465576r = aVar2.g(intValue);
                return 0;
            case 13:
                this.f465577s = aVar2.k(intValue);
                return 0;
            case 14:
                this.f465578t = aVar2.k(intValue);
                return 0;
            case 15:
                this.f465579u = aVar2.k(intValue);
                return 0;
            case 16:
                this.f465580v = aVar2.k(intValue);
                return 0;
            case 17:
                this.f465581w = aVar2.k(intValue);
                return 0;
            case 18:
                this.f465582x = aVar2.g(intValue);
                return 0;
            case 19:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.m35 m35Var = new r45.m35();
                    if (bArr2 != null && bArr2.length > 0) {
                        m35Var.mo11468x92b714fd(bArr2);
                    }
                    linkedList.add(m35Var);
                }
                return 0;
            case 20:
                this.f465584z = aVar2.g(intValue);
                return 0;
            case 21:
                this.A = aVar2.k(intValue);
                return 0;
            case 22:
                this.B = aVar2.k(intValue);
                return 0;
            case 23:
                this.C = aVar2.k(intValue);
                return 0;
            case 24:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.pj0 pj0Var3 = new r45.pj0();
                    if (bArr3 != null && bArr3.length > 0) {
                        pj0Var3.mo11468x92b714fd(bArr3);
                    }
                    this.D = pj0Var3;
                }
                return 0;
            case 25:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j28.get(i28);
                    r45.v75 v75Var3 = new r45.v75();
                    if (bArr4 != null && bArr4.length > 0) {
                        v75Var3.mo11468x92b714fd(bArr4);
                    }
                    this.E = v75Var3;
                }
                return 0;
            case 26:
                this.F = aVar2.k(intValue);
                return 0;
            case 27:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j29.get(i29);
                    r45.l35 l35Var3 = new r45.l35();
                    if (bArr5 != null && bArr5.length > 0) {
                        l35Var3.mo11468x92b714fd(bArr5);
                    }
                    this.G = l35Var3;
                }
                return 0;
            case 28:
                this.H = aVar2.g(intValue);
                return 0;
            case 29:
                this.I = aVar2.g(intValue);
                return 0;
            case 30:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size6 = j37.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j37.get(i37);
                    r45.tj0 tj0Var3 = new r45.tj0();
                    if (bArr6 != null && bArr6.length > 0) {
                        tj0Var3.mo11468x92b714fd(bArr6);
                    }
                    this.f465564J = tj0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
