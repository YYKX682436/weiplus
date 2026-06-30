package r45;

/* loaded from: classes9.dex */
public class wh6 extends r45.js5 {
    public r45.uh6 A;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f470702d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public r45.zh6 f470703e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f470704f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f470705g;

    /* renamed from: h, reason: collision with root package name */
    public int f470706h;

    /* renamed from: i, reason: collision with root package name */
    public int f470707i;

    /* renamed from: m, reason: collision with root package name */
    public int f470708m;

    /* renamed from: n, reason: collision with root package name */
    public int f470709n;

    /* renamed from: o, reason: collision with root package name */
    public int f470710o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f470711p;

    /* renamed from: q, reason: collision with root package name */
    public int f470712q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f470713r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f470714s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f470715t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f470716u;

    /* renamed from: v, reason: collision with root package name */
    public int f470717v;

    /* renamed from: w, reason: collision with root package name */
    public r45.xh6 f470718w;

    /* renamed from: x, reason: collision with root package name */
    public int f470719x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f470720y;

    /* renamed from: z, reason: collision with root package name */
    public int f470721z;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wh6)) {
            return false;
        }
        r45.wh6 wh6Var = (r45.wh6) fVar;
        return n51.f.a(this.f76492x92037252, wh6Var.f76492x92037252) && n51.f.a(this.f470702d, wh6Var.f470702d) && n51.f.a(this.f470703e, wh6Var.f470703e) && n51.f.a(this.f470704f, wh6Var.f470704f) && n51.f.a(this.f470705g, wh6Var.f470705g) && n51.f.a(java.lang.Integer.valueOf(this.f470706h), java.lang.Integer.valueOf(wh6Var.f470706h)) && n51.f.a(java.lang.Integer.valueOf(this.f470707i), java.lang.Integer.valueOf(wh6Var.f470707i)) && n51.f.a(java.lang.Integer.valueOf(this.f470708m), java.lang.Integer.valueOf(wh6Var.f470708m)) && n51.f.a(java.lang.Integer.valueOf(this.f470709n), java.lang.Integer.valueOf(wh6Var.f470709n)) && n51.f.a(java.lang.Integer.valueOf(this.f470710o), java.lang.Integer.valueOf(wh6Var.f470710o)) && n51.f.a(this.f470711p, wh6Var.f470711p) && n51.f.a(java.lang.Integer.valueOf(this.f470712q), java.lang.Integer.valueOf(wh6Var.f470712q)) && n51.f.a(this.f470713r, wh6Var.f470713r) && n51.f.a(java.lang.Boolean.valueOf(this.f470714s), java.lang.Boolean.valueOf(wh6Var.f470714s)) && n51.f.a(this.f470715t, wh6Var.f470715t) && n51.f.a(this.f470716u, wh6Var.f470716u) && n51.f.a(java.lang.Integer.valueOf(this.f470717v), java.lang.Integer.valueOf(wh6Var.f470717v)) && n51.f.a(this.f470718w, wh6Var.f470718w) && n51.f.a(java.lang.Integer.valueOf(this.f470719x), java.lang.Integer.valueOf(wh6Var.f470719x)) && n51.f.a(this.f470720y, wh6Var.f470720y) && n51.f.a(java.lang.Integer.valueOf(this.f470721z), java.lang.Integer.valueOf(wh6Var.f470721z)) && n51.f.a(this.A, wh6Var.A);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f470702d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            r45.zh6 zh6Var = this.f470703e;
            if (zh6Var != null) {
                fVar.i(3, zh6Var.mo75928xcd1e8d8());
                this.f470703e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f470704f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f470705g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f470706h);
            fVar.e(9, this.f470707i);
            fVar.e(10, this.f470708m);
            fVar.e(11, this.f470709n);
            fVar.e(15, this.f470710o);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f470711p;
            if (gVar != null) {
                fVar.b(16, gVar);
            }
            fVar.e(17, this.f470712q);
            java.lang.String str3 = this.f470713r;
            if (str3 != null) {
                fVar.j(18, str3);
            }
            fVar.a(19, this.f470714s);
            java.lang.String str4 = this.f470715t;
            if (str4 != null) {
                fVar.j(20, str4);
            }
            java.lang.String str5 = this.f470716u;
            if (str5 != null) {
                fVar.j(21, str5);
            }
            fVar.e(22, this.f470717v);
            r45.xh6 xh6Var = this.f470718w;
            if (xh6Var != null) {
                fVar.i(23, xh6Var.mo75928xcd1e8d8());
                this.f470718w.mo75956x3d5d1f78(fVar);
            }
            fVar.e(24, this.f470719x);
            java.lang.String str6 = this.f470720y;
            if (str6 != null) {
                fVar.j(25, str6);
            }
            fVar.e(27, this.f470721z);
            r45.uh6 uh6Var = this.A;
            if (uh6Var != null) {
                fVar.i(29, uh6Var.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.g(2, 8, linkedList);
            r45.zh6 zh6Var2 = this.f470703e;
            if (zh6Var2 != null) {
                i18 += b36.f.i(3, zh6Var2.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f470704f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f470705g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            int e17 = i18 + b36.f.e(6, this.f470706h) + b36.f.e(9, this.f470707i) + b36.f.e(10, this.f470708m) + b36.f.e(11, this.f470709n) + b36.f.e(15, this.f470710o);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f470711p;
            if (gVar2 != null) {
                e17 += b36.f.b(16, gVar2);
            }
            int e18 = e17 + b36.f.e(17, this.f470712q);
            java.lang.String str9 = this.f470713r;
            if (str9 != null) {
                e18 += b36.f.j(18, str9);
            }
            int a17 = e18 + b36.f.a(19, this.f470714s);
            java.lang.String str10 = this.f470715t;
            if (str10 != null) {
                a17 += b36.f.j(20, str10);
            }
            java.lang.String str11 = this.f470716u;
            if (str11 != null) {
                a17 += b36.f.j(21, str11);
            }
            int e19 = a17 + b36.f.e(22, this.f470717v);
            r45.xh6 xh6Var2 = this.f470718w;
            if (xh6Var2 != null) {
                e19 += b36.f.i(23, xh6Var2.mo75928xcd1e8d8());
            }
            int e27 = e19 + b36.f.e(24, this.f470719x);
            java.lang.String str12 = this.f470720y;
            if (str12 != null) {
                e27 += b36.f.j(25, str12);
            }
            int e28 = e27 + b36.f.e(27, this.f470721z);
            r45.uh6 uh6Var2 = this.A;
            return uh6Var2 != null ? e28 + b36.f.i(29, uh6Var2.mo75928xcd1e8d8()) : e28;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.wh6 wh6Var = (r45.wh6) objArr[1];
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
                    wh6Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.th6 th6Var = new r45.th6();
                    if (bArr3 != null && bArr3.length > 0) {
                        th6Var.mo11468x92b714fd(bArr3);
                    }
                    wh6Var.f470702d.add(th6Var);
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.zh6 zh6Var3 = new r45.zh6();
                    if (bArr4 != null && bArr4.length > 0) {
                        zh6Var3.mo11468x92b714fd(bArr4);
                    }
                    wh6Var.f470703e = zh6Var3;
                }
                return 0;
            case 4:
                wh6Var.f470704f = aVar2.k(intValue);
                return 0;
            case 5:
                wh6Var.f470705g = aVar2.k(intValue);
                return 0;
            case 6:
                wh6Var.f470706h = aVar2.g(intValue);
                return 0;
            case 7:
            case 8:
            case 12:
            case 13:
            case 14:
            case 26:
            case 28:
            default:
                return -1;
            case 9:
                wh6Var.f470707i = aVar2.g(intValue);
                return 0;
            case 10:
                wh6Var.f470708m = aVar2.g(intValue);
                return 0;
            case 11:
                wh6Var.f470709n = aVar2.g(intValue);
                return 0;
            case 15:
                wh6Var.f470710o = aVar2.g(intValue);
                return 0;
            case 16:
                wh6Var.f470711p = aVar2.d(intValue);
                return 0;
            case 17:
                wh6Var.f470712q = aVar2.g(intValue);
                return 0;
            case 18:
                wh6Var.f470713r = aVar2.k(intValue);
                return 0;
            case 19:
                wh6Var.f470714s = aVar2.c(intValue);
                return 0;
            case 20:
                wh6Var.f470715t = aVar2.k(intValue);
                return 0;
            case 21:
                wh6Var.f470716u = aVar2.k(intValue);
                return 0;
            case 22:
                wh6Var.f470717v = aVar2.g(intValue);
                return 0;
            case 23:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.xh6 xh6Var3 = new r45.xh6();
                    if (bArr5 != null && bArr5.length > 0) {
                        xh6Var3.mo11468x92b714fd(bArr5);
                    }
                    wh6Var.f470718w = xh6Var3;
                }
                return 0;
            case 24:
                wh6Var.f470719x = aVar2.g(intValue);
                return 0;
            case 25:
                wh6Var.f470720y = aVar2.k(intValue);
                return 0;
            case 27:
                wh6Var.f470721z = aVar2.g(intValue);
                return 0;
            case 29:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.uh6 uh6Var3 = new r45.uh6();
                    if (bArr6 != null && bArr6.length > 0) {
                        uh6Var3.mo11468x92b714fd(bArr6);
                    }
                    wh6Var.A = uh6Var3;
                }
                return 0;
        }
    }
}
