package r45;

/* loaded from: classes9.dex */
public class p43 extends r45.js5 {
    public r45.s43 A;
    public int B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public int F;
    public java.lang.String G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f464259J;
    public java.lang.String K;
    public r45.m43 L;

    /* renamed from: f, reason: collision with root package name */
    public int f464262f;

    /* renamed from: g, reason: collision with root package name */
    public int f464263g;

    /* renamed from: h, reason: collision with root package name */
    public long f464264h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f464265i;

    /* renamed from: m, reason: collision with root package name */
    public long f464266m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f464267n;

    /* renamed from: o, reason: collision with root package name */
    public int f464268o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f464269p;

    /* renamed from: r, reason: collision with root package name */
    public int f464271r;

    /* renamed from: s, reason: collision with root package name */
    public int f464272s;

    /* renamed from: t, reason: collision with root package name */
    public int f464273t;

    /* renamed from: u, reason: collision with root package name */
    public int f464274u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f464275v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f464276w;

    /* renamed from: x, reason: collision with root package name */
    public int f464277x;

    /* renamed from: y, reason: collision with root package name */
    public long f464278y;

    /* renamed from: d, reason: collision with root package name */
    public int f464260d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464261e = "ok";

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f464270q = new java.util.LinkedList();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.LinkedList f464279z = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p43)) {
            return false;
        }
        r45.p43 p43Var = (r45.p43) fVar;
        return n51.f.a(this.f76492x92037252, p43Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f464260d), java.lang.Integer.valueOf(p43Var.f464260d)) && n51.f.a(this.f464261e, p43Var.f464261e) && n51.f.a(java.lang.Integer.valueOf(this.f464262f), java.lang.Integer.valueOf(p43Var.f464262f)) && n51.f.a(java.lang.Integer.valueOf(this.f464263g), java.lang.Integer.valueOf(p43Var.f464263g)) && n51.f.a(java.lang.Long.valueOf(this.f464264h), java.lang.Long.valueOf(p43Var.f464264h)) && n51.f.a(this.f464265i, p43Var.f464265i) && n51.f.a(java.lang.Long.valueOf(this.f464266m), java.lang.Long.valueOf(p43Var.f464266m)) && n51.f.a(this.f464267n, p43Var.f464267n) && n51.f.a(java.lang.Integer.valueOf(this.f464268o), java.lang.Integer.valueOf(p43Var.f464268o)) && n51.f.a(this.f464269p, p43Var.f464269p) && n51.f.a(this.f464270q, p43Var.f464270q) && n51.f.a(java.lang.Integer.valueOf(this.f464271r), java.lang.Integer.valueOf(p43Var.f464271r)) && n51.f.a(java.lang.Integer.valueOf(this.f464272s), java.lang.Integer.valueOf(p43Var.f464272s)) && n51.f.a(java.lang.Integer.valueOf(this.f464273t), java.lang.Integer.valueOf(p43Var.f464273t)) && n51.f.a(java.lang.Integer.valueOf(this.f464274u), java.lang.Integer.valueOf(p43Var.f464274u)) && n51.f.a(this.f464275v, p43Var.f464275v) && n51.f.a(this.f464276w, p43Var.f464276w) && n51.f.a(java.lang.Integer.valueOf(this.f464277x), java.lang.Integer.valueOf(p43Var.f464277x)) && n51.f.a(java.lang.Long.valueOf(this.f464278y), java.lang.Long.valueOf(p43Var.f464278y)) && n51.f.a(this.f464279z, p43Var.f464279z) && n51.f.a(this.A, p43Var.A) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(p43Var.B)) && n51.f.a(this.C, p43Var.C) && n51.f.a(this.D, p43Var.D) && n51.f.a(this.E, p43Var.E) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(p43Var.F)) && n51.f.a(this.G, p43Var.G) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(p43Var.H)) && n51.f.a(java.lang.Integer.valueOf(this.I), java.lang.Integer.valueOf(p43Var.I)) && n51.f.a(this.f464259J, p43Var.f464259J) && n51.f.a(this.K, p43Var.K) && n51.f.a(this.L, p43Var.L);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f464279z;
        java.util.LinkedList linkedList2 = this.f464270q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f464260d);
            java.lang.String str = this.f464261e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f464262f);
            fVar.e(5, this.f464263g);
            fVar.h(6, this.f464264h);
            java.lang.String str2 = this.f464265i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.h(8, this.f464266m);
            java.lang.String str3 = this.f464267n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.e(10, this.f464268o);
            java.lang.String str4 = this.f464269p;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            fVar.g(12, 8, linkedList2);
            fVar.e(13, this.f464271r);
            fVar.e(14, this.f464272s);
            fVar.e(15, this.f464273t);
            fVar.e(16, this.f464274u);
            java.lang.String str5 = this.f464275v;
            if (str5 != null) {
                fVar.j(17, str5);
            }
            java.lang.String str6 = this.f464276w;
            if (str6 != null) {
                fVar.j(18, str6);
            }
            fVar.e(19, this.f464277x);
            fVar.h(20, this.f464278y);
            fVar.g(21, 8, linkedList);
            r45.s43 s43Var = this.A;
            if (s43Var != null) {
                fVar.i(22, s43Var.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            fVar.e(23, this.B);
            java.lang.String str7 = this.C;
            if (str7 != null) {
                fVar.j(24, str7);
            }
            java.lang.String str8 = this.D;
            if (str8 != null) {
                fVar.j(25, str8);
            }
            java.lang.String str9 = this.E;
            if (str9 != null) {
                fVar.j(26, str9);
            }
            fVar.e(27, this.F);
            java.lang.String str10 = this.G;
            if (str10 != null) {
                fVar.j(28, str10);
            }
            fVar.e(29, this.H);
            fVar.e(30, this.I);
            java.lang.String str11 = this.f464259J;
            if (str11 != null) {
                fVar.j(31, str11);
            }
            java.lang.String str12 = this.K;
            if (str12 != null) {
                fVar.j(32, str12);
            }
            r45.m43 m43Var = this.L;
            if (m43Var != null) {
                fVar.i(33, m43Var.mo75928xcd1e8d8());
                this.L.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f464260d);
            java.lang.String str13 = this.f464261e;
            if (str13 != null) {
                i18 += b36.f.j(3, str13);
            }
            int e17 = i18 + b36.f.e(4, this.f464262f) + b36.f.e(5, this.f464263g) + b36.f.h(6, this.f464264h);
            java.lang.String str14 = this.f464265i;
            if (str14 != null) {
                e17 += b36.f.j(7, str14);
            }
            int h17 = e17 + b36.f.h(8, this.f464266m);
            java.lang.String str15 = this.f464267n;
            if (str15 != null) {
                h17 += b36.f.j(9, str15);
            }
            int e18 = h17 + b36.f.e(10, this.f464268o);
            java.lang.String str16 = this.f464269p;
            if (str16 != null) {
                e18 += b36.f.j(11, str16);
            }
            int g17 = e18 + b36.f.g(12, 8, linkedList2) + b36.f.e(13, this.f464271r) + b36.f.e(14, this.f464272s) + b36.f.e(15, this.f464273t) + b36.f.e(16, this.f464274u);
            java.lang.String str17 = this.f464275v;
            if (str17 != null) {
                g17 += b36.f.j(17, str17);
            }
            java.lang.String str18 = this.f464276w;
            if (str18 != null) {
                g17 += b36.f.j(18, str18);
            }
            int e19 = g17 + b36.f.e(19, this.f464277x) + b36.f.h(20, this.f464278y) + b36.f.g(21, 8, linkedList);
            r45.s43 s43Var2 = this.A;
            if (s43Var2 != null) {
                e19 += b36.f.i(22, s43Var2.mo75928xcd1e8d8());
            }
            int e27 = e19 + b36.f.e(23, this.B);
            java.lang.String str19 = this.C;
            if (str19 != null) {
                e27 += b36.f.j(24, str19);
            }
            java.lang.String str20 = this.D;
            if (str20 != null) {
                e27 += b36.f.j(25, str20);
            }
            java.lang.String str21 = this.E;
            if (str21 != null) {
                e27 += b36.f.j(26, str21);
            }
            int e28 = e27 + b36.f.e(27, this.F);
            java.lang.String str22 = this.G;
            if (str22 != null) {
                e28 += b36.f.j(28, str22);
            }
            int e29 = e28 + b36.f.e(29, this.H) + b36.f.e(30, this.I);
            java.lang.String str23 = this.f464259J;
            if (str23 != null) {
                e29 += b36.f.j(31, str23);
            }
            java.lang.String str24 = this.K;
            if (str24 != null) {
                e29 += b36.f.j(32, str24);
            }
            r45.m43 m43Var2 = this.L;
            return m43Var2 != null ? e29 + b36.f.i(33, m43Var2.mo75928xcd1e8d8()) : e29;
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
        r45.p43 p43Var = (r45.p43) objArr[1];
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
                    p43Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                p43Var.f464260d = aVar2.g(intValue);
                return 0;
            case 3:
                p43Var.f464261e = aVar2.k(intValue);
                return 0;
            case 4:
                p43Var.f464262f = aVar2.g(intValue);
                return 0;
            case 5:
                p43Var.f464263g = aVar2.g(intValue);
                return 0;
            case 6:
                p43Var.f464264h = aVar2.i(intValue);
                return 0;
            case 7:
                p43Var.f464265i = aVar2.k(intValue);
                return 0;
            case 8:
                p43Var.f464266m = aVar2.i(intValue);
                return 0;
            case 9:
                p43Var.f464267n = aVar2.k(intValue);
                return 0;
            case 10:
                p43Var.f464268o = aVar2.g(intValue);
                return 0;
            case 11:
                p43Var.f464269p = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.s43 s43Var3 = new r45.s43();
                    if (bArr3 != null && bArr3.length > 0) {
                        s43Var3.mo11468x92b714fd(bArr3);
                    }
                    p43Var.f464270q.add(s43Var3);
                }
                return 0;
            case 13:
                p43Var.f464271r = aVar2.g(intValue);
                return 0;
            case 14:
                p43Var.f464272s = aVar2.g(intValue);
                return 0;
            case 15:
                p43Var.f464273t = aVar2.g(intValue);
                return 0;
            case 16:
                p43Var.f464274u = aVar2.g(intValue);
                return 0;
            case 17:
                p43Var.f464275v = aVar2.k(intValue);
                return 0;
            case 18:
                p43Var.f464276w = aVar2.k(intValue);
                return 0;
            case 19:
                p43Var.f464277x = aVar2.g(intValue);
                return 0;
            case 20:
                p43Var.f464278y = aVar2.i(intValue);
                return 0;
            case 21:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.n43 n43Var = new r45.n43();
                    if (bArr4 != null && bArr4.length > 0) {
                        n43Var.mo11468x92b714fd(bArr4);
                    }
                    p43Var.f464279z.add(n43Var);
                }
                return 0;
            case 22:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.s43 s43Var4 = new r45.s43();
                    if (bArr5 != null && bArr5.length > 0) {
                        s43Var4.mo11468x92b714fd(bArr5);
                    }
                    p43Var.A = s43Var4;
                }
                return 0;
            case 23:
                p43Var.B = aVar2.g(intValue);
                return 0;
            case 24:
                p43Var.C = aVar2.k(intValue);
                return 0;
            case 25:
                p43Var.D = aVar2.k(intValue);
                return 0;
            case 26:
                p43Var.E = aVar2.k(intValue);
                return 0;
            case 27:
                p43Var.F = aVar2.g(intValue);
                return 0;
            case 28:
                p43Var.G = aVar2.k(intValue);
                return 0;
            case 29:
                p43Var.H = aVar2.g(intValue);
                return 0;
            case 30:
                p43Var.I = aVar2.g(intValue);
                return 0;
            case 31:
                p43Var.f464259J = aVar2.k(intValue);
                return 0;
            case 32:
                p43Var.K = aVar2.k(intValue);
                return 0;
            case 33:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.m43 m43Var3 = new r45.m43();
                    if (bArr6 != null && bArr6.length > 0) {
                        m43Var3.mo11468x92b714fd(bArr6);
                    }
                    p43Var.L = m43Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
