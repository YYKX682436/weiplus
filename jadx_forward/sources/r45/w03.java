package r45;

/* loaded from: classes10.dex */
public class w03 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f470278d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470279e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f470280f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f470281g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f470282h;

    /* renamed from: i, reason: collision with root package name */
    public long f470283i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f470284m;

    /* renamed from: n, reason: collision with root package name */
    public long f470285n;

    /* renamed from: o, reason: collision with root package name */
    public long f470286o;

    /* renamed from: p, reason: collision with root package name */
    public int f470287p;

    /* renamed from: q, reason: collision with root package name */
    public int f470288q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f470289r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public int f470290s;

    /* renamed from: t, reason: collision with root package name */
    public r45.e60 f470291t;

    /* renamed from: u, reason: collision with root package name */
    public long f470292u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f470293v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f470294w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f470295x;

    /* renamed from: y, reason: collision with root package name */
    public int f470296y;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w03)) {
            return false;
        }
        r45.w03 w03Var = (r45.w03) fVar;
        return n51.f.a(this.f76494x2de60e5e, w03Var.f76494x2de60e5e) && n51.f.a(this.f470278d, w03Var.f470278d) && n51.f.a(this.f470279e, w03Var.f470279e) && n51.f.a(this.f470280f, w03Var.f470280f) && n51.f.a(this.f470281g, w03Var.f470281g) && n51.f.a(this.f470282h, w03Var.f470282h) && n51.f.a(java.lang.Long.valueOf(this.f470283i), java.lang.Long.valueOf(w03Var.f470283i)) && n51.f.a(this.f470284m, w03Var.f470284m) && n51.f.a(java.lang.Long.valueOf(this.f470285n), java.lang.Long.valueOf(w03Var.f470285n)) && n51.f.a(java.lang.Long.valueOf(this.f470286o), java.lang.Long.valueOf(w03Var.f470286o)) && n51.f.a(java.lang.Integer.valueOf(this.f470287p), java.lang.Integer.valueOf(w03Var.f470287p)) && n51.f.a(java.lang.Integer.valueOf(this.f470288q), java.lang.Integer.valueOf(w03Var.f470288q)) && n51.f.a(this.f470289r, w03Var.f470289r) && n51.f.a(java.lang.Integer.valueOf(this.f470290s), java.lang.Integer.valueOf(w03Var.f470290s)) && n51.f.a(this.f470291t, w03Var.f470291t) && n51.f.a(java.lang.Long.valueOf(this.f470292u), java.lang.Long.valueOf(w03Var.f470292u)) && n51.f.a(this.f470293v, w03Var.f470293v) && n51.f.a(this.f470294w, w03Var.f470294w) && n51.f.a(this.f470295x, w03Var.f470295x) && n51.f.a(java.lang.Integer.valueOf(this.f470296y), java.lang.Integer.valueOf(w03Var.f470296y));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f470289r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            r45.kv0 kv0Var = this.f470278d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.mo75928xcd1e8d8());
                this.f470278d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f470279e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f470280f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f470281g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f470282h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.h(7, this.f470283i);
            java.lang.String str5 = this.f470284m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.h(9, this.f470285n);
            fVar.h(10, this.f470286o);
            fVar.e(11, this.f470287p);
            fVar.e(12, this.f470288q);
            fVar.g(13, 8, linkedList);
            fVar.e(14, this.f470290s);
            r45.e60 e60Var = this.f470291t;
            if (e60Var != null) {
                fVar.i(15, e60Var.mo75928xcd1e8d8());
                this.f470291t.mo75956x3d5d1f78(fVar);
            }
            fVar.h(16, this.f470292u);
            java.lang.String str6 = this.f470293v;
            if (str6 != null) {
                fVar.j(17, str6);
            }
            java.lang.String str7 = this.f470294w;
            if (str7 != null) {
                fVar.j(18, str7);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f470295x;
            if (gVar != null) {
                fVar.b(100, gVar);
            }
            fVar.e(101, this.f470296y);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0;
            r45.kv0 kv0Var2 = this.f470278d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f470279e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f470280f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f470281g;
            if (str10 != null) {
                i18 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f470282h;
            if (str11 != null) {
                i18 += b36.f.j(6, str11);
            }
            int h17 = i18 + b36.f.h(7, this.f470283i);
            java.lang.String str12 = this.f470284m;
            if (str12 != null) {
                h17 += b36.f.j(8, str12);
            }
            int h18 = h17 + b36.f.h(9, this.f470285n) + b36.f.h(10, this.f470286o) + b36.f.e(11, this.f470287p) + b36.f.e(12, this.f470288q) + b36.f.g(13, 8, linkedList) + b36.f.e(14, this.f470290s);
            r45.e60 e60Var2 = this.f470291t;
            if (e60Var2 != null) {
                h18 += b36.f.i(15, e60Var2.mo75928xcd1e8d8());
            }
            int h19 = h18 + b36.f.h(16, this.f470292u);
            java.lang.String str13 = this.f470293v;
            if (str13 != null) {
                h19 += b36.f.j(17, str13);
            }
            java.lang.String str14 = this.f470294w;
            if (str14 != null) {
                h19 += b36.f.j(18, str14);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f470295x;
            if (gVar2 != null) {
                h19 += b36.f.b(100, gVar2);
            }
            return h19 + b36.f.e(101, this.f470296y);
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
        r45.w03 w03Var = (r45.w03) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            w03Var.f470295x = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 101) {
            w03Var.f470296y = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    w03Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr3 != null && bArr3.length > 0) {
                        kv0Var3.mo11468x92b714fd(bArr3);
                    }
                    w03Var.f470278d = kv0Var3;
                }
                return 0;
            case 3:
                w03Var.f470279e = aVar2.k(intValue);
                return 0;
            case 4:
                w03Var.f470280f = aVar2.k(intValue);
                return 0;
            case 5:
                w03Var.f470281g = aVar2.k(intValue);
                return 0;
            case 6:
                w03Var.f470282h = aVar2.k(intValue);
                return 0;
            case 7:
                w03Var.f470283i = aVar2.i(intValue);
                return 0;
            case 8:
                w03Var.f470284m = aVar2.k(intValue);
                return 0;
            case 9:
                w03Var.f470285n = aVar2.i(intValue);
                return 0;
            case 10:
                w03Var.f470286o = aVar2.i(intValue);
                return 0;
            case 11:
                w03Var.f470287p = aVar2.g(intValue);
                return 0;
            case 12:
                w03Var.f470288q = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.oy0 oy0Var = new r45.oy0();
                    if (bArr4 != null && bArr4.length > 0) {
                        oy0Var.mo11468x92b714fd(bArr4);
                    }
                    w03Var.f470289r.add(oy0Var);
                }
                return 0;
            case 14:
                w03Var.f470290s = aVar2.g(intValue);
                return 0;
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.e60 e60Var3 = new r45.e60();
                    if (bArr5 != null && bArr5.length > 0) {
                        e60Var3.mo11468x92b714fd(bArr5);
                    }
                    w03Var.f470291t = e60Var3;
                }
                return 0;
            case 16:
                w03Var.f470292u = aVar2.i(intValue);
                return 0;
            case 17:
                w03Var.f470293v = aVar2.k(intValue);
                return 0;
            case 18:
                w03Var.f470294w = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
