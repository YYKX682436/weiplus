package r45;

/* loaded from: classes2.dex */
public class e95 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454697d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454698e;

    /* renamed from: f, reason: collision with root package name */
    public r45.n95 f454699f;

    /* renamed from: g, reason: collision with root package name */
    public r45.r95 f454700g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f454701h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f454702i;

    /* renamed from: n, reason: collision with root package name */
    public float f454704n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f454705o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f454706p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f454707q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f454708r;

    /* renamed from: s, reason: collision with root package name */
    public int f454709s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f454710t;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f454712v;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f454703m = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f454711u = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e95)) {
            return false;
        }
        r45.e95 e95Var = (r45.e95) fVar;
        return n51.f.a(this.f454697d, e95Var.f454697d) && n51.f.a(this.f454698e, e95Var.f454698e) && n51.f.a(this.f454699f, e95Var.f454699f) && n51.f.a(this.f454700g, e95Var.f454700g) && n51.f.a(this.f454701h, e95Var.f454701h) && n51.f.a(this.f454702i, e95Var.f454702i) && n51.f.a(this.f454703m, e95Var.f454703m) && n51.f.a(java.lang.Float.valueOf(this.f454704n), java.lang.Float.valueOf(e95Var.f454704n)) && n51.f.a(this.f454705o, e95Var.f454705o) && n51.f.a(this.f454706p, e95Var.f454706p) && n51.f.a(this.f454707q, e95Var.f454707q) && n51.f.a(this.f454708r, e95Var.f454708r) && n51.f.a(java.lang.Integer.valueOf(this.f454709s), java.lang.Integer.valueOf(e95Var.f454709s)) && n51.f.a(this.f454710t, e95Var.f454710t) && n51.f.a(this.f454711u, e95Var.f454711u) && n51.f.a(this.f454712v, e95Var.f454712v);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f454711u;
        java.util.LinkedList linkedList2 = this.f454703m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f454697d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f454698e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            r45.n95 n95Var = this.f454699f;
            if (n95Var != null) {
                fVar.i(3, n95Var.mo75928xcd1e8d8());
                this.f454699f.mo75956x3d5d1f78(fVar);
            }
            r45.r95 r95Var = this.f454700g;
            if (r95Var != null) {
                fVar.i(4, r95Var.mo75928xcd1e8d8());
                this.f454700g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f454701h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f454702i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.g(7, 8, linkedList2);
            fVar.d(8, this.f454704n);
            java.lang.String str5 = this.f454705o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f454706p;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f454707q;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f454708r;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            fVar.e(13, this.f454709s);
            java.lang.String str9 = this.f454710t;
            if (str9 != null) {
                fVar.j(14, str9);
            }
            fVar.g(15, 8, linkedList);
            java.lang.String str10 = this.f454712v;
            if (str10 != null) {
                fVar.j(101, str10);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f454697d;
            int j17 = str11 != null ? b36.f.j(1, str11) + 0 : 0;
            java.lang.String str12 = this.f454698e;
            if (str12 != null) {
                j17 += b36.f.j(2, str12);
            }
            r45.n95 n95Var2 = this.f454699f;
            if (n95Var2 != null) {
                j17 += b36.f.i(3, n95Var2.mo75928xcd1e8d8());
            }
            r45.r95 r95Var2 = this.f454700g;
            if (r95Var2 != null) {
                j17 += b36.f.i(4, r95Var2.mo75928xcd1e8d8());
            }
            java.lang.String str13 = this.f454701h;
            if (str13 != null) {
                j17 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f454702i;
            if (str14 != null) {
                j17 += b36.f.j(6, str14);
            }
            int g17 = j17 + b36.f.g(7, 8, linkedList2) + b36.f.d(8, this.f454704n);
            java.lang.String str15 = this.f454705o;
            if (str15 != null) {
                g17 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f454706p;
            if (str16 != null) {
                g17 += b36.f.j(10, str16);
            }
            java.lang.String str17 = this.f454707q;
            if (str17 != null) {
                g17 += b36.f.j(11, str17);
            }
            java.lang.String str18 = this.f454708r;
            if (str18 != null) {
                g17 += b36.f.j(12, str18);
            }
            int e17 = g17 + b36.f.e(13, this.f454709s);
            java.lang.String str19 = this.f454710t;
            if (str19 != null) {
                e17 += b36.f.j(14, str19);
            }
            int g18 = e17 + b36.f.g(15, 8, linkedList);
            java.lang.String str20 = this.f454712v;
            return str20 != null ? g18 + b36.f.j(101, str20) : g18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.e95 e95Var = (r45.e95) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 101) {
            e95Var.f454712v = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                e95Var.f454697d = aVar2.k(intValue);
                return 0;
            case 2:
                e95Var.f454698e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.n95 n95Var3 = new r45.n95();
                    if (bArr2 != null && bArr2.length > 0) {
                        n95Var3.mo11468x92b714fd(bArr2);
                    }
                    e95Var.f454699f = n95Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.r95 r95Var3 = new r45.r95();
                    if (bArr3 != null && bArr3.length > 0) {
                        r95Var3.mo11468x92b714fd(bArr3);
                    }
                    e95Var.f454700g = r95Var3;
                }
                return 0;
            case 5:
                e95Var.f454701h = aVar2.k(intValue);
                return 0;
            case 6:
                e95Var.f454702i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.h95 h95Var = new r45.h95();
                    if (bArr4 != null && bArr4.length > 0) {
                        h95Var.mo11468x92b714fd(bArr4);
                    }
                    e95Var.f454703m.add(h95Var);
                }
                return 0;
            case 8:
                e95Var.f454704n = aVar2.f(intValue);
                return 0;
            case 9:
                e95Var.f454705o = aVar2.k(intValue);
                return 0;
            case 10:
                e95Var.f454706p = aVar2.k(intValue);
                return 0;
            case 11:
                e95Var.f454707q = aVar2.k(intValue);
                return 0;
            case 12:
                e95Var.f454708r = aVar2.k(intValue);
                return 0;
            case 13:
                e95Var.f454709s = aVar2.g(intValue);
                return 0;
            case 14:
                e95Var.f454710t = aVar2.k(intValue);
                return 0;
            case 15:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.c95 c95Var = new r45.c95();
                    if (bArr5 != null && bArr5.length > 0) {
                        c95Var.mo11468x92b714fd(bArr5);
                    }
                    e95Var.f454711u.add(c95Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
