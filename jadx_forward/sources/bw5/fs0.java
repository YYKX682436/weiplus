package bw5;

/* loaded from: classes10.dex */
public class fs0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: J, reason: collision with root package name */
    public static final bw5.fs0 f109035J = new bw5.fs0();
    public java.lang.String A;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g B;
    public bw5.wj0 C;
    public bw5.v4 D;
    public bw5.eh0 E;
    public int F;
    public bw5.j3 G;
    public bw5.go0 H;

    /* renamed from: d, reason: collision with root package name */
    public int f109036d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f109037e;

    /* renamed from: f, reason: collision with root package name */
    public int f109038f;

    /* renamed from: g, reason: collision with root package name */
    public long f109039g;

    /* renamed from: h, reason: collision with root package name */
    public int f109040h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.e30 f109041i;

    /* renamed from: n, reason: collision with root package name */
    public int f109043n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f109044o;

    /* renamed from: p, reason: collision with root package name */
    public int f109045p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f109046q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f109047r;

    /* renamed from: s, reason: collision with root package name */
    public int f109048s;

    /* renamed from: u, reason: collision with root package name */
    public int f109050u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.ho0 f109051v;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f109054y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f109055z;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f109042m = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f109049t = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public java.util.LinkedList f109052w = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f109053x = new java.util.LinkedList();
    public final boolean[] I = new boolean[29];

    public java.lang.String b() {
        return this.I[2] ? this.f109037e : "";
    }

    public java.lang.String c() {
        return this.I[21] ? this.A : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fs0)) {
            return false;
        }
        bw5.fs0 fs0Var = (bw5.fs0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f109036d), java.lang.Integer.valueOf(fs0Var.f109036d)) && n51.f.a(this.f109037e, fs0Var.f109037e) && n51.f.a(java.lang.Integer.valueOf(this.f109038f), java.lang.Integer.valueOf(fs0Var.f109038f)) && n51.f.a(java.lang.Long.valueOf(this.f109039g), java.lang.Long.valueOf(fs0Var.f109039g)) && n51.f.a(java.lang.Integer.valueOf(this.f109040h), java.lang.Integer.valueOf(fs0Var.f109040h)) && n51.f.a(this.f109041i, fs0Var.f109041i) && n51.f.a(this.f109042m, fs0Var.f109042m) && n51.f.a(java.lang.Integer.valueOf(this.f109043n), java.lang.Integer.valueOf(fs0Var.f109043n)) && n51.f.a(this.f109044o, fs0Var.f109044o) && n51.f.a(java.lang.Integer.valueOf(this.f109045p), java.lang.Integer.valueOf(fs0Var.f109045p)) && n51.f.a(this.f109046q, fs0Var.f109046q) && n51.f.a(this.f109047r, fs0Var.f109047r) && n51.f.a(java.lang.Integer.valueOf(this.f109048s), java.lang.Integer.valueOf(fs0Var.f109048s)) && n51.f.a(this.f109049t, fs0Var.f109049t) && n51.f.a(java.lang.Integer.valueOf(this.f109050u), java.lang.Integer.valueOf(fs0Var.f109050u)) && n51.f.a(this.f109051v, fs0Var.f109051v) && n51.f.a(this.f109052w, fs0Var.f109052w) && n51.f.a(this.f109053x, fs0Var.f109053x) && n51.f.a(this.f109054y, fs0Var.f109054y) && n51.f.a(this.f109055z, fs0Var.f109055z) && n51.f.a(this.A, fs0Var.A) && n51.f.a(this.B, fs0Var.B) && n51.f.a(this.C, fs0Var.C) && n51.f.a(this.D, fs0Var.D) && n51.f.a(this.E, fs0Var.E) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(fs0Var.F)) && n51.f.a(this.G, fs0Var.G) && n51.f.a(this.H, fs0Var.H);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.fs0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.I;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f109036d);
            }
            java.lang.String str = this.f109037e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f109038f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f109039g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f109040h);
            }
            bw5.e30 e30Var = this.f109041i;
            if (e30Var != null && zArr[6]) {
                fVar.i(6, e30Var.mo75928xcd1e8d8());
                this.f109041i.mo75956x3d5d1f78(fVar);
            }
            fVar.g(7, 8, this.f109042m);
            if (zArr[8]) {
                fVar.e(8, this.f109043n);
            }
            java.lang.String str2 = this.f109044o;
            if (str2 != null && zArr[9]) {
                fVar.j(9, str2);
            }
            if (zArr[10]) {
                fVar.e(10, this.f109045p);
            }
            java.lang.String str3 = this.f109046q;
            if (str3 != null && zArr[11]) {
                fVar.j(11, str3);
            }
            java.lang.String str4 = this.f109047r;
            if (str4 != null && zArr[12]) {
                fVar.j(12, str4);
            }
            if (zArr[13]) {
                fVar.e(13, this.f109048s);
            }
            fVar.g(14, 1, this.f109049t);
            if (zArr[15]) {
                fVar.e(15, this.f109050u);
            }
            bw5.ho0 ho0Var = this.f109051v;
            if (ho0Var != null && zArr[16]) {
                fVar.i(16, ho0Var.mo75928xcd1e8d8());
                this.f109051v.mo75956x3d5d1f78(fVar);
            }
            fVar.g(17, 8, this.f109052w);
            fVar.g(18, 8, this.f109053x);
            java.lang.String str5 = this.f109054y;
            if (str5 != null && zArr[19]) {
                fVar.j(19, str5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f109055z;
            if (gVar != null && zArr[20]) {
                fVar.b(20, gVar);
            }
            java.lang.String str6 = this.A;
            if (str6 != null && zArr[21]) {
                fVar.j(21, str6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.B;
            if (gVar2 != null && zArr[22]) {
                fVar.b(22, gVar2);
            }
            bw5.wj0 wj0Var = this.C;
            if (wj0Var != null && zArr[23]) {
                fVar.i(23, wj0Var.mo75928xcd1e8d8());
                this.C.mo75956x3d5d1f78(fVar);
            }
            bw5.v4 v4Var = this.D;
            if (v4Var != null && zArr[24]) {
                fVar.i(24, v4Var.mo75928xcd1e8d8());
                this.D.mo75956x3d5d1f78(fVar);
            }
            bw5.eh0 eh0Var = this.E;
            if (eh0Var != null && zArr[25]) {
                fVar.i(25, eh0Var.mo75928xcd1e8d8());
                this.E.mo75956x3d5d1f78(fVar);
            }
            if (zArr[26]) {
                fVar.e(26, this.F);
            }
            bw5.j3 j3Var = this.G;
            if (j3Var != null && zArr[27]) {
                fVar.i(27, j3Var.mo75928xcd1e8d8());
                this.G.mo75956x3d5d1f78(fVar);
            }
            bw5.go0 go0Var = this.H;
            if (go0Var != null && zArr[28]) {
                fVar.i(28, go0Var.mo75928xcd1e8d8());
                this.H.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f109036d) + 0 : 0;
            java.lang.String str7 = this.f109037e;
            if (str7 != null && zArr[2]) {
                e17 += b36.f.j(2, str7);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f109038f);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f109039g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f109040h);
            }
            bw5.e30 e30Var2 = this.f109041i;
            if (e30Var2 != null && zArr[6]) {
                e17 += b36.f.i(6, e30Var2.mo75928xcd1e8d8());
            }
            int g17 = e17 + b36.f.g(7, 8, this.f109042m);
            if (zArr[8]) {
                g17 += b36.f.e(8, this.f109043n);
            }
            java.lang.String str8 = this.f109044o;
            if (str8 != null && zArr[9]) {
                g17 += b36.f.j(9, str8);
            }
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f109045p);
            }
            java.lang.String str9 = this.f109046q;
            if (str9 != null && zArr[11]) {
                g17 += b36.f.j(11, str9);
            }
            java.lang.String str10 = this.f109047r;
            if (str10 != null && zArr[12]) {
                g17 += b36.f.j(12, str10);
            }
            if (zArr[13]) {
                g17 += b36.f.e(13, this.f109048s);
            }
            int g18 = g17 + b36.f.g(14, 1, this.f109049t);
            if (zArr[15]) {
                g18 += b36.f.e(15, this.f109050u);
            }
            bw5.ho0 ho0Var2 = this.f109051v;
            if (ho0Var2 != null && zArr[16]) {
                g18 += b36.f.i(16, ho0Var2.mo75928xcd1e8d8());
            }
            int g19 = g18 + b36.f.g(17, 8, this.f109052w) + b36.f.g(18, 8, this.f109053x);
            java.lang.String str11 = this.f109054y;
            if (str11 != null && zArr[19]) {
                g19 += b36.f.j(19, str11);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f109055z;
            if (gVar3 != null && zArr[20]) {
                g19 += b36.f.b(20, gVar3);
            }
            java.lang.String str12 = this.A;
            if (str12 != null && zArr[21]) {
                g19 += b36.f.j(21, str12);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.B;
            if (gVar4 != null && zArr[22]) {
                g19 += b36.f.b(22, gVar4);
            }
            bw5.wj0 wj0Var2 = this.C;
            if (wj0Var2 != null && zArr[23]) {
                g19 += b36.f.i(23, wj0Var2.mo75928xcd1e8d8());
            }
            bw5.v4 v4Var2 = this.D;
            if (v4Var2 != null && zArr[24]) {
                g19 += b36.f.i(24, v4Var2.mo75928xcd1e8d8());
            }
            bw5.eh0 eh0Var2 = this.E;
            if (eh0Var2 != null && zArr[25]) {
                g19 += b36.f.i(25, eh0Var2.mo75928xcd1e8d8());
            }
            if (zArr[26]) {
                g19 += b36.f.e(26, this.F);
            }
            bw5.j3 j3Var2 = this.G;
            if (j3Var2 != null && zArr[27]) {
                g19 += b36.f.i(27, j3Var2.mo75928xcd1e8d8());
            }
            bw5.go0 go0Var2 = this.H;
            return (go0Var2 == null || !zArr[28]) ? g19 : g19 + b36.f.i(28, go0Var2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            this.f109042m.clear();
            this.f109049t.clear();
            this.f109052w.clear();
            this.f109053x.clear();
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
                this.f109036d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109037e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109038f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109039g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f109040h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.e30 e30Var3 = new bw5.e30();
                    if (bArr != null && bArr.length > 0) {
                        e30Var3.mo11468x92b714fd(bArr);
                    }
                    this.f109041i = e30Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.sr0 sr0Var = new bw5.sr0();
                    if (bArr2 != null && bArr2.length > 0) {
                        sr0Var.mo11468x92b714fd(bArr2);
                    }
                    this.f109042m.add(sr0Var);
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f109043n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f109044o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f109045p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f109046q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f109047r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f109048s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f109049t.add(aVar2.k(intValue));
                zArr[14] = true;
                return 0;
            case 15:
                this.f109050u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.ho0 ho0Var3 = new bw5.ho0();
                    if (bArr3 != null && bArr3.length > 0) {
                        ho0Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f109051v = ho0Var3;
                }
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.q3 q3Var = new bw5.q3();
                    if (bArr4 != null && bArr4.length > 0) {
                        q3Var.mo11468x92b714fd(bArr4);
                    }
                    this.f109052w.add(q3Var);
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.og0 og0Var = new bw5.og0();
                    if (bArr5 != null && bArr5.length > 0) {
                        og0Var.mo11468x92b714fd(bArr5);
                    }
                    this.f109053x.add(og0Var);
                }
                zArr[18] = true;
                return 0;
            case 19:
                this.f109054y = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f109055z = aVar2.d(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.k(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.d(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.wj0 wj0Var3 = new bw5.wj0();
                    if (bArr6 != null && bArr6.length > 0) {
                        wj0Var3.mo11468x92b714fd(bArr6);
                    }
                    this.C = wj0Var3;
                }
                zArr[23] = true;
                return 0;
            case 24:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.v4 v4Var3 = new bw5.v4();
                    if (bArr7 != null && bArr7.length > 0) {
                        v4Var3.mo11468x92b714fd(bArr7);
                    }
                    this.D = v4Var3;
                }
                zArr[24] = true;
                return 0;
            case 25:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    bw5.eh0 eh0Var3 = new bw5.eh0();
                    if (bArr8 != null && bArr8.length > 0) {
                        eh0Var3.mo11468x92b714fd(bArr8);
                    }
                    this.E = eh0Var3;
                }
                zArr[25] = true;
                return 0;
            case 26:
                this.F = aVar2.g(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j39.get(i47);
                    bw5.j3 j3Var3 = new bw5.j3();
                    if (bArr9 != null && bArr9.length > 0) {
                        j3Var3.mo11468x92b714fd(bArr9);
                    }
                    this.G = j3Var3;
                }
                zArr[27] = true;
                return 0;
            case 28:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr10 = (byte[]) j47.get(i48);
                    bw5.go0 go0Var3 = new bw5.go0();
                    if (bArr10 != null && bArr10.length > 0) {
                        go0Var3.mo11468x92b714fd(bArr10);
                    }
                    this.H = go0Var3;
                }
                zArr[28] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.fs0) super.mo11468x92b714fd(bArr);
    }
}
