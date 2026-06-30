package bw5;

/* loaded from: classes2.dex */
public class ed extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public int A;
    public bw5.y9 B;
    public bw5.te C;
    public bw5.my D;

    /* renamed from: d, reason: collision with root package name */
    public int f108359d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.bf f108360e;

    /* renamed from: f, reason: collision with root package name */
    public float f108361f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.pe f108362g;

    /* renamed from: i, reason: collision with root package name */
    public int f108364i;

    /* renamed from: m, reason: collision with root package name */
    public long f108365m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f108366n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f108367o;

    /* renamed from: p, reason: collision with root package name */
    public int f108368p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.qq f108369q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f108370r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.zp f108371s;

    /* renamed from: t, reason: collision with root package name */
    public int f108372t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f108373u;

    /* renamed from: v, reason: collision with root package name */
    public float f108374v;

    /* renamed from: w, reason: collision with root package name */
    public float f108375w;

    /* renamed from: x, reason: collision with root package name */
    public int f108376x;

    /* renamed from: y, reason: collision with root package name */
    public bw5.ir f108377y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.ir f108378z;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f108363h = new java.util.LinkedList();
    public final boolean[] E = new boolean[26];

    static {
        new bw5.ed();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ed mo11468x92b714fd(byte[] bArr) {
        return (bw5.ed) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ed)) {
            return false;
        }
        bw5.ed edVar = (bw5.ed) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f108359d), java.lang.Integer.valueOf(edVar.f108359d)) && n51.f.a(this.f108360e, edVar.f108360e) && n51.f.a(java.lang.Float.valueOf(this.f108361f), java.lang.Float.valueOf(edVar.f108361f)) && n51.f.a(this.f108362g, edVar.f108362g) && n51.f.a(this.f108363h, edVar.f108363h) && n51.f.a(java.lang.Integer.valueOf(this.f108364i), java.lang.Integer.valueOf(edVar.f108364i)) && n51.f.a(java.lang.Long.valueOf(this.f108365m), java.lang.Long.valueOf(edVar.f108365m)) && n51.f.a(this.f108366n, edVar.f108366n) && n51.f.a(this.f108367o, edVar.f108367o) && n51.f.a(java.lang.Integer.valueOf(this.f108368p), java.lang.Integer.valueOf(edVar.f108368p)) && n51.f.a(this.f108369q, edVar.f108369q) && n51.f.a(this.f108370r, edVar.f108370r) && n51.f.a(this.f108371s, edVar.f108371s) && n51.f.a(java.lang.Integer.valueOf(this.f108372t), java.lang.Integer.valueOf(edVar.f108372t)) && n51.f.a(this.f108373u, edVar.f108373u) && n51.f.a(java.lang.Float.valueOf(this.f108374v), java.lang.Float.valueOf(edVar.f108374v)) && n51.f.a(java.lang.Float.valueOf(this.f108375w), java.lang.Float.valueOf(edVar.f108375w)) && n51.f.a(java.lang.Integer.valueOf(this.f108376x), java.lang.Integer.valueOf(edVar.f108376x)) && n51.f.a(this.f108377y, edVar.f108377y) && n51.f.a(this.f108378z, edVar.f108378z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(edVar.A)) && n51.f.a(this.B, edVar.B) && n51.f.a(this.C, edVar.C) && n51.f.a(this.D, edVar.D);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ed();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.E;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f108359d);
            }
            bw5.bf bfVar = this.f108360e;
            if (bfVar != null && zArr[2]) {
                fVar.i(2, bfVar.mo75928xcd1e8d8());
                this.f108360e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.d(3, this.f108361f);
            }
            bw5.pe peVar = this.f108362g;
            if (peVar != null && zArr[4]) {
                fVar.i(4, peVar.mo75928xcd1e8d8());
                this.f108362g.mo75956x3d5d1f78(fVar);
            }
            fVar.g(5, 8, this.f108363h);
            if (zArr[6]) {
                fVar.e(6, this.f108364i);
            }
            if (zArr[7]) {
                fVar.h(7, this.f108365m);
            }
            java.lang.String str = this.f108366n;
            if (str != null && zArr[8]) {
                fVar.j(8, str);
            }
            java.lang.String str2 = this.f108367o;
            if (str2 != null && zArr[9]) {
                fVar.j(9, str2);
            }
            if (zArr[10]) {
                fVar.e(10, this.f108368p);
            }
            bw5.qq qqVar = this.f108369q;
            if (qqVar != null && zArr[11]) {
                fVar.i(11, qqVar.mo75928xcd1e8d8());
                this.f108369q.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f108370r;
            if (str3 != null && zArr[12]) {
                fVar.j(12, str3);
            }
            bw5.zp zpVar = this.f108371s;
            if (zpVar != null && zArr[13]) {
                fVar.i(13, zpVar.mo75928xcd1e8d8());
                this.f108371s.mo75956x3d5d1f78(fVar);
            }
            if (zArr[14]) {
                fVar.e(14, this.f108372t);
            }
            java.lang.String str4 = this.f108373u;
            if (str4 != null && zArr[15]) {
                fVar.j(15, str4);
            }
            if (zArr[16]) {
                fVar.d(16, this.f108374v);
            }
            if (zArr[17]) {
                fVar.d(17, this.f108375w);
            }
            if (zArr[18]) {
                fVar.e(18, this.f108376x);
            }
            bw5.ir irVar = this.f108377y;
            if (irVar != null && zArr[19]) {
                fVar.i(19, irVar.mo75928xcd1e8d8());
                this.f108377y.mo75956x3d5d1f78(fVar);
            }
            bw5.ir irVar2 = this.f108378z;
            if (irVar2 != null && zArr[20]) {
                fVar.i(20, irVar2.mo75928xcd1e8d8());
                this.f108378z.mo75956x3d5d1f78(fVar);
            }
            if (zArr[21]) {
                fVar.e(21, this.A);
            }
            bw5.y9 y9Var = this.B;
            if (y9Var != null && zArr[23]) {
                fVar.i(23, y9Var.mo75928xcd1e8d8());
                this.B.mo75956x3d5d1f78(fVar);
            }
            bw5.te teVar = this.C;
            if (teVar != null && zArr[24]) {
                fVar.i(24, teVar.mo75928xcd1e8d8());
                this.C.mo75956x3d5d1f78(fVar);
            }
            bw5.my myVar = this.D;
            if (myVar != null && zArr[25]) {
                fVar.i(25, myVar.mo75928xcd1e8d8());
                this.D.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f108359d) + 0 : 0;
            bw5.bf bfVar2 = this.f108360e;
            if (bfVar2 != null && zArr[2]) {
                e17 += b36.f.i(2, bfVar2.mo75928xcd1e8d8());
            }
            if (zArr[3]) {
                e17 += b36.f.d(3, this.f108361f);
            }
            bw5.pe peVar2 = this.f108362g;
            if (peVar2 != null && zArr[4]) {
                e17 += b36.f.i(4, peVar2.mo75928xcd1e8d8());
            }
            int g17 = e17 + b36.f.g(5, 8, this.f108363h);
            if (zArr[6]) {
                g17 += b36.f.e(6, this.f108364i);
            }
            if (zArr[7]) {
                g17 += b36.f.h(7, this.f108365m);
            }
            java.lang.String str5 = this.f108366n;
            if (str5 != null && zArr[8]) {
                g17 += b36.f.j(8, str5);
            }
            java.lang.String str6 = this.f108367o;
            if (str6 != null && zArr[9]) {
                g17 += b36.f.j(9, str6);
            }
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f108368p);
            }
            bw5.qq qqVar2 = this.f108369q;
            if (qqVar2 != null && zArr[11]) {
                g17 += b36.f.i(11, qqVar2.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f108370r;
            if (str7 != null && zArr[12]) {
                g17 += b36.f.j(12, str7);
            }
            bw5.zp zpVar2 = this.f108371s;
            if (zpVar2 != null && zArr[13]) {
                g17 += b36.f.i(13, zpVar2.mo75928xcd1e8d8());
            }
            if (zArr[14]) {
                g17 += b36.f.e(14, this.f108372t);
            }
            java.lang.String str8 = this.f108373u;
            if (str8 != null && zArr[15]) {
                g17 += b36.f.j(15, str8);
            }
            if (zArr[16]) {
                g17 += b36.f.d(16, this.f108374v);
            }
            if (zArr[17]) {
                g17 += b36.f.d(17, this.f108375w);
            }
            if (zArr[18]) {
                g17 += b36.f.e(18, this.f108376x);
            }
            bw5.ir irVar3 = this.f108377y;
            if (irVar3 != null && zArr[19]) {
                g17 += b36.f.i(19, irVar3.mo75928xcd1e8d8());
            }
            bw5.ir irVar4 = this.f108378z;
            if (irVar4 != null && zArr[20]) {
                g17 += b36.f.i(20, irVar4.mo75928xcd1e8d8());
            }
            if (zArr[21]) {
                g17 += b36.f.e(21, this.A);
            }
            bw5.y9 y9Var2 = this.B;
            if (y9Var2 != null && zArr[23]) {
                g17 += b36.f.i(23, y9Var2.mo75928xcd1e8d8());
            }
            bw5.te teVar2 = this.C;
            if (teVar2 != null && zArr[24]) {
                g17 += b36.f.i(24, teVar2.mo75928xcd1e8d8());
            }
            bw5.my myVar2 = this.D;
            return (myVar2 == null || !zArr[25]) ? g17 : g17 + b36.f.i(25, myVar2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            this.f108363h.clear();
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
                this.f108359d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.bf bfVar3 = new bw5.bf();
                    if (bArr != null && bArr.length > 0) {
                        bfVar3.mo11468x92b714fd(bArr);
                    }
                    this.f108360e = bfVar3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f108361f = aVar2.f(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.pe peVar3 = new bw5.pe();
                    if (bArr2 != null && bArr2.length > 0) {
                        peVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f108362g = peVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.oe oeVar = new bw5.oe();
                    if (bArr3 != null && bArr3.length > 0) {
                        oeVar.mo11468x92b714fd(bArr3);
                    }
                    this.f108363h.add(oeVar);
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f108364i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f108365m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f108366n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f108367o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f108368p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.qq qqVar3 = new bw5.qq();
                    if (bArr4 != null && bArr4.length > 0) {
                        qqVar3.mo11468x92b714fd(bArr4);
                    }
                    this.f108369q = qqVar3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f108370r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.zp zpVar3 = new bw5.zp();
                    if (bArr5 != null && bArr5.length > 0) {
                        zpVar3.mo11468x92b714fd(bArr5);
                    }
                    this.f108371s = zpVar3;
                }
                zArr[13] = true;
                return 0;
            case 14:
                this.f108372t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f108373u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f108374v = aVar2.f(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f108375w = aVar2.f(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f108376x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.ir irVar5 = new bw5.ir();
                    if (bArr6 != null && bArr6.length > 0) {
                        irVar5.mo11468x92b714fd(bArr6);
                    }
                    this.f108377y = irVar5;
                }
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.ir irVar6 = new bw5.ir();
                    if (bArr7 != null && bArr7.length > 0) {
                        irVar6.mo11468x92b714fd(bArr7);
                    }
                    this.f108378z = irVar6;
                }
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.g(intValue);
                zArr[21] = true;
                return 0;
            case 22:
            default:
                return -1;
            case 23:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    bw5.y9 y9Var3 = new bw5.y9();
                    if (bArr8 != null && bArr8.length > 0) {
                        y9Var3.mo11468x92b714fd(bArr8);
                    }
                    this.B = y9Var3;
                }
                zArr[23] = true;
                return 0;
            case 24:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j39.get(i47);
                    bw5.te teVar3 = new bw5.te();
                    if (bArr9 != null && bArr9.length > 0) {
                        teVar3.mo11468x92b714fd(bArr9);
                    }
                    this.C = teVar3;
                }
                zArr[24] = true;
                return 0;
            case 25:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr10 = (byte[]) j47.get(i48);
                    bw5.my myVar3 = new bw5.my();
                    if (bArr10 != null && bArr10.length > 0) {
                        myVar3.mo11468x92b714fd(bArr10);
                    }
                    this.D = myVar3;
                }
                zArr[25] = true;
                return 0;
        }
    }
}
