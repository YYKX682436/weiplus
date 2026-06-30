package r45;

/* loaded from: classes12.dex */
public class tq3 extends r45.js5 {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f468220g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f468221h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f468222i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f468223m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f468224n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f468225o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f468226p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f468228r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f468229s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f468230t;

    /* renamed from: u, reason: collision with root package name */
    public int f468231u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f468232v;

    /* renamed from: w, reason: collision with root package name */
    public r45.dh7 f468233w;

    /* renamed from: x, reason: collision with root package name */
    public r45.ri5 f468234x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f468235y;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f468217d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f468218e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f468219f = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f468227q = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tq3)) {
            return false;
        }
        r45.tq3 tq3Var = (r45.tq3) fVar;
        return n51.f.a(this.f76492x92037252, tq3Var.f76492x92037252) && n51.f.a(this.f468217d, tq3Var.f468217d) && n51.f.a(this.f468218e, tq3Var.f468218e) && n51.f.a(this.f468219f, tq3Var.f468219f) && n51.f.a(this.f468220g, tq3Var.f468220g) && n51.f.a(this.f468221h, tq3Var.f468221h) && n51.f.a(this.f468222i, tq3Var.f468222i) && n51.f.a(this.f468223m, tq3Var.f468223m) && n51.f.a(this.f468224n, tq3Var.f468224n) && n51.f.a(java.lang.Boolean.valueOf(this.f468225o), java.lang.Boolean.valueOf(tq3Var.f468225o)) && n51.f.a(this.f468226p, tq3Var.f468226p) && n51.f.a(this.f468227q, tq3Var.f468227q) && n51.f.a(java.lang.Boolean.valueOf(this.f468228r), java.lang.Boolean.valueOf(tq3Var.f468228r)) && n51.f.a(this.f468229s, tq3Var.f468229s) && n51.f.a(java.lang.Boolean.valueOf(this.f468230t), java.lang.Boolean.valueOf(tq3Var.f468230t)) && n51.f.a(java.lang.Integer.valueOf(this.f468231u), java.lang.Integer.valueOf(tq3Var.f468231u)) && n51.f.a(this.f468232v, tq3Var.f468232v) && n51.f.a(this.f468233w, tq3Var.f468233w) && n51.f.a(this.f468234x, tq3Var.f468234x) && n51.f.a(this.f468235y, tq3Var.f468235y);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f468227q;
        java.util.LinkedList linkedList2 = this.f468219f;
        java.util.LinkedList linkedList3 = this.f468218e;
        java.util.LinkedList linkedList4 = this.f468217d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList4);
            fVar.g(3, 8, linkedList3);
            fVar.g(4, 1, linkedList2);
            java.lang.String str = this.f468220g;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f468221h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f468222i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f468223m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f468224n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.a(10, this.f468225o);
            java.lang.String str6 = this.f468226p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            fVar.g(12, 8, linkedList);
            fVar.a(13, this.f468228r);
            java.lang.String str7 = this.f468229s;
            if (str7 != null) {
                fVar.j(14, str7);
            }
            fVar.a(15, this.f468230t);
            fVar.e(16, this.f468231u);
            java.lang.String str8 = this.f468232v;
            if (str8 != null) {
                fVar.j(17, str8);
            }
            r45.dh7 dh7Var = this.f468233w;
            if (dh7Var != null) {
                fVar.i(18, dh7Var.mo75928xcd1e8d8());
                this.f468233w.mo75956x3d5d1f78(fVar);
            }
            r45.ri5 ri5Var = this.f468234x;
            if (ri5Var != null) {
                fVar.i(19, ri5Var.mo75928xcd1e8d8());
                this.f468234x.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str9 = this.f468235y;
            if (str9 != null) {
                fVar.j(20, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.g(2, 8, linkedList4) + b36.f.g(3, 8, linkedList3) + b36.f.g(4, 1, linkedList2);
            java.lang.String str10 = this.f468220g;
            if (str10 != null) {
                i18 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f468221h;
            if (str11 != null) {
                i18 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f468222i;
            if (str12 != null) {
                i18 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f468223m;
            if (str13 != null) {
                i18 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f468224n;
            if (str14 != null) {
                i18 += b36.f.j(9, str14);
            }
            int a17 = i18 + b36.f.a(10, this.f468225o);
            java.lang.String str15 = this.f468226p;
            if (str15 != null) {
                a17 += b36.f.j(11, str15);
            }
            int g17 = a17 + b36.f.g(12, 8, linkedList) + b36.f.a(13, this.f468228r);
            java.lang.String str16 = this.f468229s;
            if (str16 != null) {
                g17 += b36.f.j(14, str16);
            }
            int a18 = g17 + b36.f.a(15, this.f468230t) + b36.f.e(16, this.f468231u);
            java.lang.String str17 = this.f468232v;
            if (str17 != null) {
                a18 += b36.f.j(17, str17);
            }
            r45.dh7 dh7Var2 = this.f468233w;
            if (dh7Var2 != null) {
                a18 += b36.f.i(18, dh7Var2.mo75928xcd1e8d8());
            }
            r45.ri5 ri5Var2 = this.f468234x;
            if (ri5Var2 != null) {
                a18 += b36.f.i(19, ri5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str18 = this.f468235y;
            return str18 != null ? a18 + b36.f.j(20, str18) : a18;
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
        r45.tq3 tq3Var = (r45.tq3) objArr[1];
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
                    tq3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.dh7 dh7Var3 = new r45.dh7();
                    if (bArr3 != null && bArr3.length > 0) {
                        dh7Var3.mo11468x92b714fd(bArr3);
                    }
                    tq3Var.f468217d.add(dh7Var3);
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.eh7 eh7Var = new r45.eh7();
                    if (bArr4 != null && bArr4.length > 0) {
                        eh7Var.mo11468x92b714fd(bArr4);
                    }
                    tq3Var.f468218e.add(eh7Var);
                }
                return 0;
            case 4:
                tq3Var.f468219f.add(aVar2.k(intValue));
                return 0;
            case 5:
                tq3Var.f468220g = aVar2.k(intValue);
                return 0;
            case 6:
                tq3Var.f468221h = aVar2.k(intValue);
                return 0;
            case 7:
                tq3Var.f468222i = aVar2.k(intValue);
                return 0;
            case 8:
                tq3Var.f468223m = aVar2.k(intValue);
                return 0;
            case 9:
                tq3Var.f468224n = aVar2.k(intValue);
                return 0;
            case 10:
                tq3Var.f468225o = aVar2.c(intValue);
                return 0;
            case 11:
                tq3Var.f468226p = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.e43 e43Var = new r45.e43();
                    if (bArr5 != null && bArr5.length > 0) {
                        e43Var.mo11468x92b714fd(bArr5);
                    }
                    tq3Var.f468227q.add(e43Var);
                }
                return 0;
            case 13:
                tq3Var.f468228r = aVar2.c(intValue);
                return 0;
            case 14:
                tq3Var.f468229s = aVar2.k(intValue);
                return 0;
            case 15:
                tq3Var.f468230t = aVar2.c(intValue);
                return 0;
            case 16:
                tq3Var.f468231u = aVar2.g(intValue);
                return 0;
            case 17:
                tq3Var.f468232v = aVar2.k(intValue);
                return 0;
            case 18:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.dh7 dh7Var4 = new r45.dh7();
                    if (bArr6 != null && bArr6.length > 0) {
                        dh7Var4.mo11468x92b714fd(bArr6);
                    }
                    tq3Var.f468233w = dh7Var4;
                }
                return 0;
            case 19:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.ri5 ri5Var3 = new r45.ri5();
                    if (bArr7 != null && bArr7.length > 0) {
                        ri5Var3.mo11468x92b714fd(bArr7);
                    }
                    tq3Var.f468234x = ri5Var3;
                }
                return 0;
            case 20:
                tq3Var.f468235y = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
