package bw5;

/* loaded from: classes2.dex */
public class p90 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f113040d;

    /* renamed from: e, reason: collision with root package name */
    public int f113041e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.o90 f113042f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.o50 f113043g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.o50 f113044h;

    /* renamed from: i, reason: collision with root package name */
    public int f113045i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.e80 f113046m;

    /* renamed from: n, reason: collision with root package name */
    public int f113047n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.mc0 f113048o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.o50 f113049p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.o50 f113050q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.n90 f113051r;

    /* renamed from: s, reason: collision with root package name */
    public long f113052s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f113053t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f113054u;

    /* renamed from: v, reason: collision with root package name */
    public int f113055v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.e80 f113056w;

    /* renamed from: y, reason: collision with root package name */
    public int f113058y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.o90 f113059z;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f113057x = new java.util.LinkedList();
    public final boolean[] A = new boolean[21];

    static {
        new bw5.p90();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.p90 mo11468x92b714fd(byte[] bArr) {
        return (bw5.p90) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.p90)) {
            return false;
        }
        bw5.p90 p90Var = (bw5.p90) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f113040d), java.lang.Integer.valueOf(p90Var.f113040d)) && n51.f.a(java.lang.Integer.valueOf(this.f113041e), java.lang.Integer.valueOf(p90Var.f113041e)) && n51.f.a(this.f113042f, p90Var.f113042f) && n51.f.a(this.f113043g, p90Var.f113043g) && n51.f.a(this.f113044h, p90Var.f113044h) && n51.f.a(java.lang.Integer.valueOf(this.f113045i), java.lang.Integer.valueOf(p90Var.f113045i)) && n51.f.a(this.f113046m, p90Var.f113046m) && n51.f.a(java.lang.Integer.valueOf(this.f113047n), java.lang.Integer.valueOf(p90Var.f113047n)) && n51.f.a(this.f113048o, p90Var.f113048o) && n51.f.a(this.f113049p, p90Var.f113049p) && n51.f.a(this.f113050q, p90Var.f113050q) && n51.f.a(this.f113051r, p90Var.f113051r) && n51.f.a(java.lang.Long.valueOf(this.f113052s), java.lang.Long.valueOf(p90Var.f113052s)) && n51.f.a(java.lang.Boolean.valueOf(this.f113053t), java.lang.Boolean.valueOf(p90Var.f113053t)) && n51.f.a(this.f113054u, p90Var.f113054u) && n51.f.a(java.lang.Integer.valueOf(this.f113055v), java.lang.Integer.valueOf(p90Var.f113055v)) && n51.f.a(this.f113056w, p90Var.f113056w) && n51.f.a(this.f113057x, p90Var.f113057x) && n51.f.a(java.lang.Integer.valueOf(this.f113058y), java.lang.Integer.valueOf(p90Var.f113058y)) && n51.f.a(this.f113059z, p90Var.f113059z);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.p90();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f113057x;
        boolean[] zArr = this.A;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f113040d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f113041e);
            }
            bw5.o90 o90Var = this.f113042f;
            if (o90Var != null && zArr[3]) {
                fVar.i(3, o90Var.mo75928xcd1e8d8());
                this.f113042f.mo75956x3d5d1f78(fVar);
            }
            bw5.o50 o50Var = this.f113043g;
            if (o50Var != null && zArr[4]) {
                fVar.i(4, o50Var.mo75928xcd1e8d8());
                this.f113043g.mo75956x3d5d1f78(fVar);
            }
            bw5.o50 o50Var2 = this.f113044h;
            if (o50Var2 != null && zArr[5]) {
                fVar.i(5, o50Var2.mo75928xcd1e8d8());
                this.f113044h.mo75956x3d5d1f78(fVar);
            }
            if (zArr[6]) {
                fVar.e(6, this.f113045i);
            }
            bw5.e80 e80Var = this.f113046m;
            if (e80Var != null && zArr[7]) {
                fVar.i(7, e80Var.mo75928xcd1e8d8());
                this.f113046m.mo75956x3d5d1f78(fVar);
            }
            if (zArr[8]) {
                fVar.e(8, this.f113047n);
            }
            bw5.mc0 mc0Var = this.f113048o;
            if (mc0Var != null && zArr[9]) {
                fVar.i(9, mc0Var.mo75928xcd1e8d8());
                this.f113048o.mo75956x3d5d1f78(fVar);
            }
            bw5.o50 o50Var3 = this.f113049p;
            if (o50Var3 != null && zArr[10]) {
                fVar.i(10, o50Var3.mo75928xcd1e8d8());
                this.f113049p.mo75956x3d5d1f78(fVar);
            }
            bw5.o50 o50Var4 = this.f113050q;
            if (o50Var4 != null && zArr[11]) {
                fVar.i(11, o50Var4.mo75928xcd1e8d8());
                this.f113050q.mo75956x3d5d1f78(fVar);
            }
            bw5.n90 n90Var = this.f113051r;
            if (n90Var != null && zArr[12]) {
                fVar.i(12, n90Var.mo75928xcd1e8d8());
                this.f113051r.mo75956x3d5d1f78(fVar);
            }
            if (zArr[13]) {
                fVar.h(13, this.f113052s);
            }
            if (zArr[14]) {
                fVar.a(14, this.f113053t);
            }
            java.lang.String str = this.f113054u;
            if (str != null && zArr[15]) {
                fVar.j(15, str);
            }
            if (zArr[16]) {
                fVar.e(16, this.f113055v);
            }
            bw5.e80 e80Var2 = this.f113056w;
            if (e80Var2 != null && zArr[17]) {
                fVar.i(17, e80Var2.mo75928xcd1e8d8());
                this.f113056w.mo75956x3d5d1f78(fVar);
            }
            fVar.g(18, 8, linkedList);
            if (zArr[19]) {
                fVar.e(19, this.f113058y);
            }
            bw5.o90 o90Var2 = this.f113059z;
            if (o90Var2 != null && zArr[20]) {
                fVar.i(20, o90Var2.mo75928xcd1e8d8());
                this.f113059z.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f113040d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f113041e);
            }
            bw5.o90 o90Var3 = this.f113042f;
            if (o90Var3 != null && zArr[3]) {
                e17 += b36.f.i(3, o90Var3.mo75928xcd1e8d8());
            }
            bw5.o50 o50Var5 = this.f113043g;
            if (o50Var5 != null && zArr[4]) {
                e17 += b36.f.i(4, o50Var5.mo75928xcd1e8d8());
            }
            bw5.o50 o50Var6 = this.f113044h;
            if (o50Var6 != null && zArr[5]) {
                e17 += b36.f.i(5, o50Var6.mo75928xcd1e8d8());
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f113045i);
            }
            bw5.e80 e80Var3 = this.f113046m;
            if (e80Var3 != null && zArr[7]) {
                e17 += b36.f.i(7, e80Var3.mo75928xcd1e8d8());
            }
            if (zArr[8]) {
                e17 += b36.f.e(8, this.f113047n);
            }
            bw5.mc0 mc0Var2 = this.f113048o;
            if (mc0Var2 != null && zArr[9]) {
                e17 += b36.f.i(9, mc0Var2.mo75928xcd1e8d8());
            }
            bw5.o50 o50Var7 = this.f113049p;
            if (o50Var7 != null && zArr[10]) {
                e17 += b36.f.i(10, o50Var7.mo75928xcd1e8d8());
            }
            bw5.o50 o50Var8 = this.f113050q;
            if (o50Var8 != null && zArr[11]) {
                e17 += b36.f.i(11, o50Var8.mo75928xcd1e8d8());
            }
            bw5.n90 n90Var2 = this.f113051r;
            if (n90Var2 != null && zArr[12]) {
                e17 += b36.f.i(12, n90Var2.mo75928xcd1e8d8());
            }
            if (zArr[13]) {
                e17 += b36.f.h(13, this.f113052s);
            }
            if (zArr[14]) {
                e17 += b36.f.a(14, this.f113053t);
            }
            java.lang.String str2 = this.f113054u;
            if (str2 != null && zArr[15]) {
                e17 += b36.f.j(15, str2);
            }
            if (zArr[16]) {
                e17 += b36.f.e(16, this.f113055v);
            }
            bw5.e80 e80Var4 = this.f113056w;
            if (e80Var4 != null && zArr[17]) {
                e17 += b36.f.i(17, e80Var4.mo75928xcd1e8d8());
            }
            int g17 = e17 + b36.f.g(18, 8, linkedList);
            if (zArr[19]) {
                g17 += b36.f.e(19, this.f113058y);
            }
            bw5.o90 o90Var4 = this.f113059z;
            return (o90Var4 == null || !zArr[20]) ? g17 : g17 + b36.f.i(20, o90Var4.mo75928xcd1e8d8());
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
                this.f113040d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113041e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.o90 o90Var5 = new bw5.o90();
                    if (bArr != null && bArr.length > 0) {
                        o90Var5.mo11468x92b714fd(bArr);
                    }
                    this.f113042f = o90Var5;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.o50 o50Var9 = new bw5.o50();
                    if (bArr2 != null && bArr2.length > 0) {
                        o50Var9.mo11468x92b714fd(bArr2);
                    }
                    this.f113043g = o50Var9;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.o50 o50Var10 = new bw5.o50();
                    if (bArr3 != null && bArr3.length > 0) {
                        o50Var10.mo11468x92b714fd(bArr3);
                    }
                    this.f113044h = o50Var10;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f113045i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.e80 e80Var5 = new bw5.e80();
                    if (bArr4 != null && bArr4.length > 0) {
                        e80Var5.mo11468x92b714fd(bArr4);
                    }
                    this.f113046m = e80Var5;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f113047n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.mc0 mc0Var3 = new bw5.mc0();
                    if (bArr5 != null && bArr5.length > 0) {
                        mc0Var3.mo11468x92b714fd(bArr5);
                    }
                    this.f113048o = mc0Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.o50 o50Var11 = new bw5.o50();
                    if (bArr6 != null && bArr6.length > 0) {
                        o50Var11.mo11468x92b714fd(bArr6);
                    }
                    this.f113049p = o50Var11;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.o50 o50Var12 = new bw5.o50();
                    if (bArr7 != null && bArr7.length > 0) {
                        o50Var12.mo11468x92b714fd(bArr7);
                    }
                    this.f113050q = o50Var12;
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    bw5.n90 n90Var3 = new bw5.n90();
                    if (bArr8 != null && bArr8.length > 0) {
                        n90Var3.mo11468x92b714fd(bArr8);
                    }
                    this.f113051r = n90Var3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                this.f113052s = aVar2.i(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f113053t = aVar2.c(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f113054u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f113055v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j39.get(i47);
                    bw5.e80 e80Var6 = new bw5.e80();
                    if (bArr9 != null && bArr9.length > 0) {
                        e80Var6.mo11468x92b714fd(bArr9);
                    }
                    this.f113056w = e80Var6;
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr10 = (byte[]) j47.get(i48);
                    bw5.n90 n90Var4 = new bw5.n90();
                    if (bArr10 != null && bArr10.length > 0) {
                        n90Var4.mo11468x92b714fd(bArr10);
                    }
                    linkedList.add(n90Var4);
                }
                zArr[18] = true;
                return 0;
            case 19:
                this.f113058y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i49 = 0; i49 < size11; i49++) {
                    byte[] bArr11 = (byte[]) j48.get(i49);
                    bw5.o90 o90Var6 = new bw5.o90();
                    if (bArr11 != null && bArr11.length > 0) {
                        o90Var6.mo11468x92b714fd(bArr11);
                    }
                    this.f113059z = o90Var6;
                }
                zArr[20] = true;
                return 0;
            default:
                return -1;
        }
    }
}
