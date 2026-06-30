package r45;

/* loaded from: classes2.dex */
public class eg4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public java.lang.String A;
    public java.lang.String B;
    public int C;
    public java.lang.String D;

    /* renamed from: d, reason: collision with root package name */
    public boolean f454977d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f454978e;

    /* renamed from: f, reason: collision with root package name */
    public int f454979f;

    /* renamed from: g, reason: collision with root package name */
    public int f454980g;

    /* renamed from: h, reason: collision with root package name */
    public int f454981h;

    /* renamed from: i, reason: collision with root package name */
    public int f454982i;

    /* renamed from: m, reason: collision with root package name */
    public int f454983m;

    /* renamed from: n, reason: collision with root package name */
    public int f454984n;

    /* renamed from: p, reason: collision with root package name */
    public long f454986p;

    /* renamed from: s, reason: collision with root package name */
    public int f454989s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f454990t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f454991u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f454992v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f454993w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f454994x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f454995y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f454996z;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f454985o = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f454987q = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f454988r = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.eg4)) {
            return false;
        }
        r45.eg4 eg4Var = (r45.eg4) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f454977d), java.lang.Boolean.valueOf(eg4Var.f454977d)) && n51.f.a(java.lang.Boolean.valueOf(this.f454978e), java.lang.Boolean.valueOf(eg4Var.f454978e)) && n51.f.a(java.lang.Integer.valueOf(this.f454979f), java.lang.Integer.valueOf(eg4Var.f454979f)) && n51.f.a(java.lang.Integer.valueOf(this.f454980g), java.lang.Integer.valueOf(eg4Var.f454980g)) && n51.f.a(java.lang.Integer.valueOf(this.f454981h), java.lang.Integer.valueOf(eg4Var.f454981h)) && n51.f.a(java.lang.Integer.valueOf(this.f454982i), java.lang.Integer.valueOf(eg4Var.f454982i)) && n51.f.a(java.lang.Integer.valueOf(this.f454983m), java.lang.Integer.valueOf(eg4Var.f454983m)) && n51.f.a(java.lang.Integer.valueOf(this.f454984n), java.lang.Integer.valueOf(eg4Var.f454984n)) && n51.f.a(this.f454985o, eg4Var.f454985o) && n51.f.a(java.lang.Long.valueOf(this.f454986p), java.lang.Long.valueOf(eg4Var.f454986p)) && n51.f.a(this.f454987q, eg4Var.f454987q) && n51.f.a(this.f454988r, eg4Var.f454988r) && n51.f.a(java.lang.Integer.valueOf(this.f454989s), java.lang.Integer.valueOf(eg4Var.f454989s)) && n51.f.a(this.f454990t, eg4Var.f454990t) && n51.f.a(this.f454991u, eg4Var.f454991u) && n51.f.a(this.f454992v, eg4Var.f454992v) && n51.f.a(this.f454993w, eg4Var.f454993w) && n51.f.a(this.f454994x, eg4Var.f454994x) && n51.f.a(this.f454995y, eg4Var.f454995y) && n51.f.a(this.f454996z, eg4Var.f454996z) && n51.f.a(this.A, eg4Var.A) && n51.f.a(this.B, eg4Var.B) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(eg4Var.C)) && n51.f.a(this.D, eg4Var.D);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f454988r;
        java.util.LinkedList linkedList2 = this.f454987q;
        java.util.LinkedList linkedList3 = this.f454985o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(2, this.f454977d);
            fVar.a(8, this.f454978e);
            fVar.e(3, this.f454979f);
            fVar.e(4, this.f454980g);
            fVar.e(5, this.f454981h);
            fVar.e(6, this.f454982i);
            fVar.e(7, this.f454983m);
            fVar.e(9, this.f454984n);
            fVar.g(10, 8, linkedList3);
            fVar.h(12, this.f454986p);
            fVar.g(14, 8, linkedList2);
            fVar.g(13, 8, linkedList);
            fVar.e(103, this.f454989s);
            java.lang.String str = this.f454990t;
            if (str != null) {
                fVar.j(101, str);
            }
            java.lang.String str2 = this.f454991u;
            if (str2 != null) {
                fVar.j(102, str2);
            }
            java.lang.String str3 = this.f454992v;
            if (str3 != null) {
                fVar.j(104, str3);
            }
            java.lang.String str4 = this.f454993w;
            if (str4 != null) {
                fVar.j(105, str4);
            }
            java.lang.String str5 = this.f454994x;
            if (str5 != null) {
                fVar.j(201, str5);
            }
            java.lang.String str6 = this.f454995y;
            if (str6 != null) {
                fVar.j(203, str6);
            }
            java.lang.String str7 = this.f454996z;
            if (str7 != null) {
                fVar.j(204, str7);
            }
            java.lang.String str8 = this.A;
            if (str8 != null) {
                fVar.j(205, str8);
            }
            java.lang.String str9 = this.B;
            if (str9 != null) {
                fVar.j(206, str9);
            }
            fVar.e(301, this.C);
            java.lang.String str10 = this.D;
            if (str10 != null) {
                fVar.j(302, str10);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(2, this.f454977d) + 0 + b36.f.a(8, this.f454978e) + b36.f.e(3, this.f454979f) + b36.f.e(4, this.f454980g) + b36.f.e(5, this.f454981h) + b36.f.e(6, this.f454982i) + b36.f.e(7, this.f454983m) + b36.f.e(9, this.f454984n) + b36.f.g(10, 8, linkedList3) + b36.f.h(12, this.f454986p) + b36.f.g(14, 8, linkedList2) + b36.f.g(13, 8, linkedList) + b36.f.e(103, this.f454989s);
            java.lang.String str11 = this.f454990t;
            if (str11 != null) {
                a17 += b36.f.j(101, str11);
            }
            java.lang.String str12 = this.f454991u;
            if (str12 != null) {
                a17 += b36.f.j(102, str12);
            }
            java.lang.String str13 = this.f454992v;
            if (str13 != null) {
                a17 += b36.f.j(104, str13);
            }
            java.lang.String str14 = this.f454993w;
            if (str14 != null) {
                a17 += b36.f.j(105, str14);
            }
            java.lang.String str15 = this.f454994x;
            if (str15 != null) {
                a17 += b36.f.j(201, str15);
            }
            java.lang.String str16 = this.f454995y;
            if (str16 != null) {
                a17 += b36.f.j(203, str16);
            }
            java.lang.String str17 = this.f454996z;
            if (str17 != null) {
                a17 += b36.f.j(204, str17);
            }
            java.lang.String str18 = this.A;
            if (str18 != null) {
                a17 += b36.f.j(205, str18);
            }
            java.lang.String str19 = this.B;
            if (str19 != null) {
                a17 += b36.f.j(206, str19);
            }
            int e17 = a17 + b36.f.e(301, this.C);
            java.lang.String str20 = this.D;
            return str20 != null ? e17 + b36.f.j(302, str20) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            linkedList2.clear();
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
        r45.eg4 eg4Var = (r45.eg4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 201) {
            eg4Var.f454994x = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 301) {
            eg4Var.C = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 302) {
            eg4Var.D = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 2:
                eg4Var.f454977d = aVar2.c(intValue);
                return 0;
            case 3:
                eg4Var.f454979f = aVar2.g(intValue);
                return 0;
            case 4:
                eg4Var.f454980g = aVar2.g(intValue);
                return 0;
            case 5:
                eg4Var.f454981h = aVar2.g(intValue);
                return 0;
            case 6:
                eg4Var.f454982i = aVar2.g(intValue);
                return 0;
            case 7:
                eg4Var.f454983m = aVar2.g(intValue);
                return 0;
            case 8:
                eg4Var.f454978e = aVar2.c(intValue);
                return 0;
            case 9:
                eg4Var.f454984n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.tg4 tg4Var = new r45.tg4();
                    if (bArr2 != null && bArr2.length > 0) {
                        tg4Var.mo11468x92b714fd(bArr2);
                    }
                    eg4Var.f454985o.add(tg4Var);
                }
                return 0;
            default:
                switch (intValue) {
                    case 12:
                        eg4Var.f454986p = aVar2.i(intValue);
                        return 0;
                    case 13:
                        java.util.LinkedList j18 = aVar2.j(intValue);
                        int size2 = j18.size();
                        for (int i19 = 0; i19 < size2; i19++) {
                            byte[] bArr3 = (byte[]) j18.get(i19);
                            r45.ng4 ng4Var = new r45.ng4();
                            if (bArr3 != null && bArr3.length > 0) {
                                ng4Var.mo11468x92b714fd(bArr3);
                            }
                            eg4Var.f454988r.add(ng4Var);
                        }
                        return 0;
                    case 14:
                        java.util.LinkedList j19 = aVar2.j(intValue);
                        int size3 = j19.size();
                        for (int i27 = 0; i27 < size3; i27++) {
                            byte[] bArr4 = (byte[]) j19.get(i27);
                            r45.tg4 tg4Var2 = new r45.tg4();
                            if (bArr4 != null && bArr4.length > 0) {
                                tg4Var2.mo11468x92b714fd(bArr4);
                            }
                            eg4Var.f454987q.add(tg4Var2);
                        }
                        return 0;
                    default:
                        switch (intValue) {
                            case 101:
                                eg4Var.f454990t = aVar2.k(intValue);
                                return 0;
                            case 102:
                                eg4Var.f454991u = aVar2.k(intValue);
                                return 0;
                            case 103:
                                eg4Var.f454989s = aVar2.g(intValue);
                                return 0;
                            case 104:
                                eg4Var.f454992v = aVar2.k(intValue);
                                return 0;
                            case 105:
                                eg4Var.f454993w = aVar2.k(intValue);
                                return 0;
                            default:
                                switch (intValue) {
                                    case 203:
                                        eg4Var.f454995y = aVar2.k(intValue);
                                        return 0;
                                    case 204:
                                        eg4Var.f454996z = aVar2.k(intValue);
                                        return 0;
                                    case 205:
                                        eg4Var.A = aVar2.k(intValue);
                                        return 0;
                                    case 206:
                                        eg4Var.B = aVar2.k(intValue);
                                        return 0;
                                    default:
                                        return -1;
                                }
                        }
                }
        }
    }
}
