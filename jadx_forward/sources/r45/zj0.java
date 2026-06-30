package r45;

/* loaded from: classes12.dex */
public class zj0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public int A;
    public int B;
    public java.lang.String C;
    public r45.tj0 D;
    public final java.util.LinkedList E = new java.util.LinkedList();
    public int F;
    public r45.xj0 G;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473661d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473662e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f473663f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f473664g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f473665h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f473666i;

    /* renamed from: m, reason: collision with root package name */
    public int f473667m;

    /* renamed from: n, reason: collision with root package name */
    public int f473668n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f473669o;

    /* renamed from: p, reason: collision with root package name */
    public int f473670p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f473671q;

    /* renamed from: r, reason: collision with root package name */
    public int f473672r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f473673s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f473674t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f473675u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f473676v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f473677w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f473678x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f473679y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f473680z;

    static {
        new r45.zj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.zj0 mo11468x92b714fd(byte[] bArr) {
        return (r45.zj0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zj0)) {
            return false;
        }
        r45.zj0 zj0Var = (r45.zj0) fVar;
        return n51.f.a(this.f473661d, zj0Var.f473661d) && n51.f.a(this.f473662e, zj0Var.f473662e) && n51.f.a(this.f473663f, zj0Var.f473663f) && n51.f.a(this.f473664g, zj0Var.f473664g) && n51.f.a(this.f473665h, zj0Var.f473665h) && n51.f.a(this.f473666i, zj0Var.f473666i) && n51.f.a(java.lang.Integer.valueOf(this.f473667m), java.lang.Integer.valueOf(zj0Var.f473667m)) && n51.f.a(java.lang.Integer.valueOf(this.f473668n), java.lang.Integer.valueOf(zj0Var.f473668n)) && n51.f.a(this.f473669o, zj0Var.f473669o) && n51.f.a(java.lang.Integer.valueOf(this.f473670p), java.lang.Integer.valueOf(zj0Var.f473670p)) && n51.f.a(this.f473671q, zj0Var.f473671q) && n51.f.a(java.lang.Integer.valueOf(this.f473672r), java.lang.Integer.valueOf(zj0Var.f473672r)) && n51.f.a(this.f473673s, zj0Var.f473673s) && n51.f.a(this.f473674t, zj0Var.f473674t) && n51.f.a(this.f473675u, zj0Var.f473675u) && n51.f.a(this.f473676v, zj0Var.f473676v) && n51.f.a(this.f473677w, zj0Var.f473677w) && n51.f.a(this.f473678x, zj0Var.f473678x) && n51.f.a(this.f473679y, zj0Var.f473679y) && n51.f.a(this.f473680z, zj0Var.f473680z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(zj0Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(zj0Var.B)) && n51.f.a(this.C, zj0Var.C) && n51.f.a(this.D, zj0Var.D) && n51.f.a(this.E, zj0Var.E) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(zj0Var.F)) && n51.f.a(this.G, zj0Var.G);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.zj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.E;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473661d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f473662e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f473663f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f473664g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f473665h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f473666i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.e(7, this.f473667m);
            fVar.e(8, this.f473668n);
            java.lang.String str7 = this.f473669o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            fVar.e(10, this.f473670p);
            java.lang.String str8 = this.f473671q;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            fVar.e(12, this.f473672r);
            java.lang.String str9 = this.f473673s;
            if (str9 != null) {
                fVar.j(13, str9);
            }
            java.lang.String str10 = this.f473674t;
            if (str10 != null) {
                fVar.j(14, str10);
            }
            java.lang.String str11 = this.f473675u;
            if (str11 != null) {
                fVar.j(15, str11);
            }
            java.lang.String str12 = this.f473676v;
            if (str12 != null) {
                fVar.j(16, str12);
            }
            java.lang.String str13 = this.f473677w;
            if (str13 != null) {
                fVar.j(17, str13);
            }
            java.lang.String str14 = this.f473678x;
            if (str14 != null) {
                fVar.j(18, str14);
            }
            java.lang.String str15 = this.f473679y;
            if (str15 != null) {
                fVar.j(19, str15);
            }
            java.lang.String str16 = this.f473680z;
            if (str16 != null) {
                fVar.j(20, str16);
            }
            fVar.e(21, this.A);
            fVar.e(22, this.B);
            java.lang.String str17 = this.C;
            if (str17 != null) {
                fVar.j(23, str17);
            }
            r45.tj0 tj0Var = this.D;
            if (tj0Var != null) {
                fVar.i(24, tj0Var.mo75928xcd1e8d8());
                this.D.mo75956x3d5d1f78(fVar);
            }
            fVar.g(25, 8, linkedList);
            fVar.e(26, this.F);
            r45.xj0 xj0Var = this.G;
            if (xj0Var != null) {
                fVar.i(27, xj0Var.mo75928xcd1e8d8());
                this.G.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str18 = this.f473661d;
            int j17 = str18 != null ? b36.f.j(1, str18) + 0 : 0;
            java.lang.String str19 = this.f473662e;
            if (str19 != null) {
                j17 += b36.f.j(2, str19);
            }
            java.lang.String str20 = this.f473663f;
            if (str20 != null) {
                j17 += b36.f.j(3, str20);
            }
            java.lang.String str21 = this.f473664g;
            if (str21 != null) {
                j17 += b36.f.j(4, str21);
            }
            java.lang.String str22 = this.f473665h;
            if (str22 != null) {
                j17 += b36.f.j(5, str22);
            }
            java.lang.String str23 = this.f473666i;
            if (str23 != null) {
                j17 += b36.f.j(6, str23);
            }
            int e17 = j17 + b36.f.e(7, this.f473667m) + b36.f.e(8, this.f473668n);
            java.lang.String str24 = this.f473669o;
            if (str24 != null) {
                e17 += b36.f.j(9, str24);
            }
            int e18 = e17 + b36.f.e(10, this.f473670p);
            java.lang.String str25 = this.f473671q;
            if (str25 != null) {
                e18 += b36.f.j(11, str25);
            }
            int e19 = e18 + b36.f.e(12, this.f473672r);
            java.lang.String str26 = this.f473673s;
            if (str26 != null) {
                e19 += b36.f.j(13, str26);
            }
            java.lang.String str27 = this.f473674t;
            if (str27 != null) {
                e19 += b36.f.j(14, str27);
            }
            java.lang.String str28 = this.f473675u;
            if (str28 != null) {
                e19 += b36.f.j(15, str28);
            }
            java.lang.String str29 = this.f473676v;
            if (str29 != null) {
                e19 += b36.f.j(16, str29);
            }
            java.lang.String str30 = this.f473677w;
            if (str30 != null) {
                e19 += b36.f.j(17, str30);
            }
            java.lang.String str31 = this.f473678x;
            if (str31 != null) {
                e19 += b36.f.j(18, str31);
            }
            java.lang.String str32 = this.f473679y;
            if (str32 != null) {
                e19 += b36.f.j(19, str32);
            }
            java.lang.String str33 = this.f473680z;
            if (str33 != null) {
                e19 += b36.f.j(20, str33);
            }
            int e27 = e19 + b36.f.e(21, this.A) + b36.f.e(22, this.B);
            java.lang.String str34 = this.C;
            if (str34 != null) {
                e27 += b36.f.j(23, str34);
            }
            r45.tj0 tj0Var2 = this.D;
            if (tj0Var2 != null) {
                e27 += b36.f.i(24, tj0Var2.mo75928xcd1e8d8());
            }
            int g17 = e27 + b36.f.g(25, 8, linkedList) + b36.f.e(26, this.F);
            r45.xj0 xj0Var2 = this.G;
            return xj0Var2 != null ? g17 + b36.f.i(27, xj0Var2.mo75928xcd1e8d8()) : g17;
        }
        if (i17 == 2) {
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
                this.f473661d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f473662e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f473663f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f473664g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f473665h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f473666i = aVar2.k(intValue);
                return 0;
            case 7:
                this.f473667m = aVar2.g(intValue);
                return 0;
            case 8:
                this.f473668n = aVar2.g(intValue);
                return 0;
            case 9:
                this.f473669o = aVar2.k(intValue);
                return 0;
            case 10:
                this.f473670p = aVar2.g(intValue);
                return 0;
            case 11:
                this.f473671q = aVar2.k(intValue);
                return 0;
            case 12:
                this.f473672r = aVar2.g(intValue);
                return 0;
            case 13:
                this.f473673s = aVar2.k(intValue);
                return 0;
            case 14:
                this.f473674t = aVar2.k(intValue);
                return 0;
            case 15:
                this.f473675u = aVar2.k(intValue);
                return 0;
            case 16:
                this.f473676v = aVar2.k(intValue);
                return 0;
            case 17:
                this.f473677w = aVar2.k(intValue);
                return 0;
            case 18:
                this.f473678x = aVar2.k(intValue);
                return 0;
            case 19:
                this.f473679y = aVar2.k(intValue);
                return 0;
            case 20:
                this.f473680z = aVar2.k(intValue);
                return 0;
            case 21:
                this.A = aVar2.g(intValue);
                return 0;
            case 22:
                this.B = aVar2.g(intValue);
                return 0;
            case 23:
                this.C = aVar2.k(intValue);
                return 0;
            case 24:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.tj0 tj0Var3 = new r45.tj0();
                    if (bArr != null && bArr.length > 0) {
                        tj0Var3.mo11468x92b714fd(bArr);
                    }
                    this.D = tj0Var3;
                }
                return 0;
            case 25:
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
            case 26:
                this.F = aVar2.g(intValue);
                return 0;
            case 27:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.xj0 xj0Var3 = new r45.xj0();
                    if (bArr3 != null && bArr3.length > 0) {
                        xj0Var3.mo11468x92b714fd(bArr3);
                    }
                    this.G = xj0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
