package r45;

/* loaded from: classes9.dex */
public class ry4 extends r45.js5 {
    public r45.ce4 B;
    public java.lang.String C;

    /* renamed from: d, reason: collision with root package name */
    public int f466817d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466818e;

    /* renamed from: f, reason: collision with root package name */
    public int f466819f;

    /* renamed from: g, reason: collision with root package name */
    public int f466820g;

    /* renamed from: h, reason: collision with root package name */
    public int f466821h;

    /* renamed from: m, reason: collision with root package name */
    public r45.be4 f466823m;

    /* renamed from: p, reason: collision with root package name */
    public boolean f466826p;

    /* renamed from: q, reason: collision with root package name */
    public r45.oa5 f466827q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f466828r;

    /* renamed from: s, reason: collision with root package name */
    public r45.bp0 f466829s;

    /* renamed from: t, reason: collision with root package name */
    public int f466830t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f466831u;

    /* renamed from: v, reason: collision with root package name */
    public r45.na5 f466832v;

    /* renamed from: w, reason: collision with root package name */
    public r45.na5 f466833w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f466834x;

    /* renamed from: y, reason: collision with root package name */
    public r45.c70 f466835y;

    /* renamed from: z, reason: collision with root package name */
    public r45.na5 f466836z;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f466822i = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f466824n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f466825o = new java.util.LinkedList();
    public final java.util.LinkedList A = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ry4)) {
            return false;
        }
        r45.ry4 ry4Var = (r45.ry4) fVar;
        return n51.f.a(this.f76492x92037252, ry4Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f466817d), java.lang.Integer.valueOf(ry4Var.f466817d)) && n51.f.a(this.f466818e, ry4Var.f466818e) && n51.f.a(java.lang.Integer.valueOf(this.f466819f), java.lang.Integer.valueOf(ry4Var.f466819f)) && n51.f.a(java.lang.Integer.valueOf(this.f466820g), java.lang.Integer.valueOf(ry4Var.f466820g)) && n51.f.a(java.lang.Integer.valueOf(this.f466821h), java.lang.Integer.valueOf(ry4Var.f466821h)) && n51.f.a(this.f466822i, ry4Var.f466822i) && n51.f.a(this.f466823m, ry4Var.f466823m) && n51.f.a(this.f466824n, ry4Var.f466824n) && n51.f.a(this.f466825o, ry4Var.f466825o) && n51.f.a(java.lang.Boolean.valueOf(this.f466826p), java.lang.Boolean.valueOf(ry4Var.f466826p)) && n51.f.a(this.f466827q, ry4Var.f466827q) && n51.f.a(this.f466828r, ry4Var.f466828r) && n51.f.a(this.f466829s, ry4Var.f466829s) && n51.f.a(java.lang.Integer.valueOf(this.f466830t), java.lang.Integer.valueOf(ry4Var.f466830t)) && n51.f.a(this.f466831u, ry4Var.f466831u) && n51.f.a(this.f466832v, ry4Var.f466832v) && n51.f.a(this.f466833w, ry4Var.f466833w) && n51.f.a(this.f466834x, ry4Var.f466834x) && n51.f.a(this.f466835y, ry4Var.f466835y) && n51.f.a(this.f466836z, ry4Var.f466836z) && n51.f.a(this.A, ry4Var.A) && n51.f.a(this.B, ry4Var.B) && n51.f.a(this.C, ry4Var.C);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.A;
        java.util.LinkedList linkedList2 = this.f466825o;
        java.util.LinkedList linkedList3 = this.f466824n;
        java.util.LinkedList linkedList4 = this.f466822i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f466817d);
            java.lang.String str = this.f466818e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f466819f);
            fVar.e(5, this.f466820g);
            fVar.e(6, this.f466821h);
            fVar.g(8, 8, linkedList4);
            r45.be4 be4Var = this.f466823m;
            if (be4Var != null) {
                fVar.i(9, be4Var.mo75928xcd1e8d8());
                this.f466823m.mo75956x3d5d1f78(fVar);
            }
            fVar.g(10, 8, linkedList3);
            fVar.g(11, 8, linkedList2);
            fVar.a(12, this.f466826p);
            r45.oa5 oa5Var = this.f466827q;
            if (oa5Var != null) {
                fVar.i(13, oa5Var.mo75928xcd1e8d8());
                this.f466827q.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f466828r;
            if (str2 != null) {
                fVar.j(14, str2);
            }
            r45.bp0 bp0Var = this.f466829s;
            if (bp0Var != null) {
                fVar.i(15, bp0Var.mo75928xcd1e8d8());
                this.f466829s.mo75956x3d5d1f78(fVar);
            }
            fVar.e(16, this.f466830t);
            java.lang.String str3 = this.f466831u;
            if (str3 != null) {
                fVar.j(17, str3);
            }
            r45.na5 na5Var = this.f466832v;
            if (na5Var != null) {
                fVar.i(18, na5Var.mo75928xcd1e8d8());
                this.f466832v.mo75956x3d5d1f78(fVar);
            }
            r45.na5 na5Var2 = this.f466833w;
            if (na5Var2 != null) {
                fVar.i(19, na5Var2.mo75928xcd1e8d8());
                this.f466833w.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f466834x;
            if (str4 != null) {
                fVar.j(20, str4);
            }
            r45.c70 c70Var = this.f466835y;
            if (c70Var != null) {
                fVar.i(21, c70Var.mo75928xcd1e8d8());
                this.f466835y.mo75956x3d5d1f78(fVar);
            }
            r45.na5 na5Var3 = this.f466836z;
            if (na5Var3 != null) {
                fVar.i(22, na5Var3.mo75928xcd1e8d8());
                this.f466836z.mo75956x3d5d1f78(fVar);
            }
            fVar.g(23, 8, linkedList);
            r45.ce4 ce4Var = this.B;
            if (ce4Var != null) {
                fVar.i(99, ce4Var.mo75928xcd1e8d8());
                this.B.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str5 = this.C;
            if (str5 != null) {
                fVar.j(100, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f466817d);
            java.lang.String str6 = this.f466818e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            int e17 = i18 + b36.f.e(4, this.f466819f) + b36.f.e(5, this.f466820g) + b36.f.e(6, this.f466821h) + b36.f.g(8, 8, linkedList4);
            r45.be4 be4Var2 = this.f466823m;
            if (be4Var2 != null) {
                e17 += b36.f.i(9, be4Var2.mo75928xcd1e8d8());
            }
            int g17 = e17 + b36.f.g(10, 8, linkedList3) + b36.f.g(11, 8, linkedList2) + b36.f.a(12, this.f466826p);
            r45.oa5 oa5Var2 = this.f466827q;
            if (oa5Var2 != null) {
                g17 += b36.f.i(13, oa5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f466828r;
            if (str7 != null) {
                g17 += b36.f.j(14, str7);
            }
            r45.bp0 bp0Var2 = this.f466829s;
            if (bp0Var2 != null) {
                g17 += b36.f.i(15, bp0Var2.mo75928xcd1e8d8());
            }
            int e18 = g17 + b36.f.e(16, this.f466830t);
            java.lang.String str8 = this.f466831u;
            if (str8 != null) {
                e18 += b36.f.j(17, str8);
            }
            r45.na5 na5Var4 = this.f466832v;
            if (na5Var4 != null) {
                e18 += b36.f.i(18, na5Var4.mo75928xcd1e8d8());
            }
            r45.na5 na5Var5 = this.f466833w;
            if (na5Var5 != null) {
                e18 += b36.f.i(19, na5Var5.mo75928xcd1e8d8());
            }
            java.lang.String str9 = this.f466834x;
            if (str9 != null) {
                e18 += b36.f.j(20, str9);
            }
            r45.c70 c70Var2 = this.f466835y;
            if (c70Var2 != null) {
                e18 += b36.f.i(21, c70Var2.mo75928xcd1e8d8());
            }
            r45.na5 na5Var6 = this.f466836z;
            if (na5Var6 != null) {
                e18 += b36.f.i(22, na5Var6.mo75928xcd1e8d8());
            }
            int g18 = e18 + b36.f.g(23, 8, linkedList);
            r45.ce4 ce4Var2 = this.B;
            if (ce4Var2 != null) {
                g18 += b36.f.i(99, ce4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.C;
            return str10 != null ? g18 + b36.f.j(100, str10) : g18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList4.clear();
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
        r45.ry4 ry4Var = (r45.ry4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 99) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ce4 ce4Var3 = new r45.ce4();
                if (bArr2 != null && bArr2.length > 0) {
                    ce4Var3.mo11468x92b714fd(bArr2);
                }
                ry4Var.B = ce4Var3;
            }
            return 0;
        }
        if (intValue == 100) {
            ry4Var.C = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr3 != null && bArr3.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr3);
                    }
                    ry4Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                ry4Var.f466817d = aVar2.g(intValue);
                return 0;
            case 3:
                ry4Var.f466818e = aVar2.k(intValue);
                return 0;
            case 4:
                ry4Var.f466819f = aVar2.g(intValue);
                return 0;
            case 5:
                ry4Var.f466820g = aVar2.g(intValue);
                return 0;
            case 6:
                ry4Var.f466821h = aVar2.g(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 8:
                        java.util.LinkedList j19 = aVar2.j(intValue);
                        int size3 = j19.size();
                        for (int i28 = 0; i28 < size3; i28++) {
                            byte[] bArr4 = (byte[]) j19.get(i28);
                            r45.if0 if0Var = new r45.if0();
                            if (bArr4 != null && bArr4.length > 0) {
                                if0Var.mo11468x92b714fd(bArr4);
                            }
                            ry4Var.f466822i.add(if0Var);
                        }
                        return 0;
                    case 9:
                        java.util.LinkedList j27 = aVar2.j(intValue);
                        int size4 = j27.size();
                        for (int i29 = 0; i29 < size4; i29++) {
                            byte[] bArr5 = (byte[]) j27.get(i29);
                            r45.be4 be4Var3 = new r45.be4();
                            if (bArr5 != null && bArr5.length > 0) {
                                be4Var3.mo11468x92b714fd(bArr5);
                            }
                            ry4Var.f466823m = be4Var3;
                        }
                        return 0;
                    case 10:
                        java.util.LinkedList j28 = aVar2.j(intValue);
                        int size5 = j28.size();
                        for (int i37 = 0; i37 < size5; i37++) {
                            byte[] bArr6 = (byte[]) j28.get(i37);
                            r45.bn5 bn5Var = new r45.bn5();
                            if (bArr6 != null && bArr6.length > 0) {
                                bn5Var.mo11468x92b714fd(bArr6);
                            }
                            ry4Var.f466824n.add(bn5Var);
                        }
                        return 0;
                    case 11:
                        java.util.LinkedList j29 = aVar2.j(intValue);
                        int size6 = j29.size();
                        for (int i38 = 0; i38 < size6; i38++) {
                            byte[] bArr7 = (byte[]) j29.get(i38);
                            r45.pd pdVar = new r45.pd();
                            if (bArr7 != null && bArr7.length > 0) {
                                pdVar.mo11468x92b714fd(bArr7);
                            }
                            ry4Var.f466825o.add(pdVar);
                        }
                        return 0;
                    case 12:
                        ry4Var.f466826p = aVar2.c(intValue);
                        return 0;
                    case 13:
                        java.util.LinkedList j37 = aVar2.j(intValue);
                        int size7 = j37.size();
                        for (int i39 = 0; i39 < size7; i39++) {
                            byte[] bArr8 = (byte[]) j37.get(i39);
                            r45.oa5 oa5Var3 = new r45.oa5();
                            if (bArr8 != null && bArr8.length > 0) {
                                oa5Var3.mo11468x92b714fd(bArr8);
                            }
                            ry4Var.f466827q = oa5Var3;
                        }
                        return 0;
                    case 14:
                        ry4Var.f466828r = aVar2.k(intValue);
                        return 0;
                    case 15:
                        java.util.LinkedList j38 = aVar2.j(intValue);
                        int size8 = j38.size();
                        for (int i47 = 0; i47 < size8; i47++) {
                            byte[] bArr9 = (byte[]) j38.get(i47);
                            r45.bp0 bp0Var3 = new r45.bp0();
                            if (bArr9 != null && bArr9.length > 0) {
                                bp0Var3.mo11468x92b714fd(bArr9);
                            }
                            ry4Var.f466829s = bp0Var3;
                        }
                        return 0;
                    case 16:
                        ry4Var.f466830t = aVar2.g(intValue);
                        return 0;
                    case 17:
                        ry4Var.f466831u = aVar2.k(intValue);
                        return 0;
                    case 18:
                        java.util.LinkedList j39 = aVar2.j(intValue);
                        int size9 = j39.size();
                        for (int i48 = 0; i48 < size9; i48++) {
                            byte[] bArr10 = (byte[]) j39.get(i48);
                            r45.na5 na5Var7 = new r45.na5();
                            if (bArr10 != null && bArr10.length > 0) {
                                na5Var7.mo11468x92b714fd(bArr10);
                            }
                            ry4Var.f466832v = na5Var7;
                        }
                        return 0;
                    case 19:
                        java.util.LinkedList j47 = aVar2.j(intValue);
                        int size10 = j47.size();
                        for (int i49 = 0; i49 < size10; i49++) {
                            byte[] bArr11 = (byte[]) j47.get(i49);
                            r45.na5 na5Var8 = new r45.na5();
                            if (bArr11 != null && bArr11.length > 0) {
                                na5Var8.mo11468x92b714fd(bArr11);
                            }
                            ry4Var.f466833w = na5Var8;
                        }
                        return 0;
                    case 20:
                        ry4Var.f466834x = aVar2.k(intValue);
                        return 0;
                    case 21:
                        java.util.LinkedList j48 = aVar2.j(intValue);
                        int size11 = j48.size();
                        for (int i57 = 0; i57 < size11; i57++) {
                            byte[] bArr12 = (byte[]) j48.get(i57);
                            r45.c70 c70Var3 = new r45.c70();
                            if (bArr12 != null && bArr12.length > 0) {
                                c70Var3.mo11468x92b714fd(bArr12);
                            }
                            ry4Var.f466835y = c70Var3;
                        }
                        return 0;
                    case 22:
                        java.util.LinkedList j49 = aVar2.j(intValue);
                        int size12 = j49.size();
                        for (int i58 = 0; i58 < size12; i58++) {
                            byte[] bArr13 = (byte[]) j49.get(i58);
                            r45.na5 na5Var9 = new r45.na5();
                            if (bArr13 != null && bArr13.length > 0) {
                                na5Var9.mo11468x92b714fd(bArr13);
                            }
                            ry4Var.f466836z = na5Var9;
                        }
                        return 0;
                    case 23:
                        java.util.LinkedList j57 = aVar2.j(intValue);
                        int size13 = j57.size();
                        for (int i59 = 0; i59 < size13; i59++) {
                            byte[] bArr14 = (byte[]) j57.get(i59);
                            r45.c70 c70Var4 = new r45.c70();
                            if (bArr14 != null && bArr14.length > 0) {
                                c70Var4.mo11468x92b714fd(bArr14);
                            }
                            ry4Var.A.add(c70Var4);
                        }
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
