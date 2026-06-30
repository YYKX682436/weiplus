package bw5;

/* loaded from: classes9.dex */
public class s8 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f114376d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.x7 f114377e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.x7 f114378f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.x7 f114379g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.x7 f114380h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.x7 f114381i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.x7 f114382m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.x7 f114383n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.x7 f114384o;

    /* renamed from: p, reason: collision with root package name */
    public int f114385p;

    /* renamed from: q, reason: collision with root package name */
    public int f114386q;

    /* renamed from: r, reason: collision with root package name */
    public int f114387r;

    /* renamed from: s, reason: collision with root package name */
    public int f114388s;

    /* renamed from: t, reason: collision with root package name */
    public long f114389t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f114390u = new boolean[15];

    static {
        new bw5.s8();
    }

    public bw5.x7 b() {
        return this.f114390u[2] ? this.f114377e : new bw5.x7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.s8 mo11468x92b714fd(byte[] bArr) {
        return (bw5.s8) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.s8)) {
            return false;
        }
        bw5.s8 s8Var = (bw5.s8) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f114376d), java.lang.Integer.valueOf(s8Var.f114376d)) && n51.f.a(this.f114377e, s8Var.f114377e) && n51.f.a(this.f114378f, s8Var.f114378f) && n51.f.a(this.f114379g, s8Var.f114379g) && n51.f.a(this.f114380h, s8Var.f114380h) && n51.f.a(this.f114381i, s8Var.f114381i) && n51.f.a(this.f114382m, s8Var.f114382m) && n51.f.a(this.f114383n, s8Var.f114383n) && n51.f.a(this.f114384o, s8Var.f114384o) && n51.f.a(java.lang.Integer.valueOf(this.f114385p), java.lang.Integer.valueOf(s8Var.f114385p)) && n51.f.a(java.lang.Integer.valueOf(this.f114386q), java.lang.Integer.valueOf(s8Var.f114386q)) && n51.f.a(java.lang.Integer.valueOf(this.f114387r), java.lang.Integer.valueOf(s8Var.f114387r)) && n51.f.a(java.lang.Integer.valueOf(this.f114388s), java.lang.Integer.valueOf(s8Var.f114388s)) && n51.f.a(java.lang.Long.valueOf(this.f114389t), java.lang.Long.valueOf(s8Var.f114389t));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.s8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f114390u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f114376d);
            }
            bw5.x7 x7Var = this.f114377e;
            if (x7Var != null && zArr[2]) {
                fVar.i(2, x7Var.mo75928xcd1e8d8());
                this.f114377e.mo75956x3d5d1f78(fVar);
            }
            bw5.x7 x7Var2 = this.f114378f;
            if (x7Var2 != null && zArr[3]) {
                fVar.i(3, x7Var2.mo75928xcd1e8d8());
                this.f114378f.mo75956x3d5d1f78(fVar);
            }
            bw5.x7 x7Var3 = this.f114379g;
            if (x7Var3 != null && zArr[4]) {
                fVar.i(4, x7Var3.mo75928xcd1e8d8());
                this.f114379g.mo75956x3d5d1f78(fVar);
            }
            bw5.x7 x7Var4 = this.f114380h;
            if (x7Var4 != null && zArr[5]) {
                fVar.i(5, x7Var4.mo75928xcd1e8d8());
                this.f114380h.mo75956x3d5d1f78(fVar);
            }
            bw5.x7 x7Var5 = this.f114381i;
            if (x7Var5 != null && zArr[6]) {
                fVar.i(6, x7Var5.mo75928xcd1e8d8());
                this.f114381i.mo75956x3d5d1f78(fVar);
            }
            bw5.x7 x7Var6 = this.f114382m;
            if (x7Var6 != null && zArr[7]) {
                fVar.i(7, x7Var6.mo75928xcd1e8d8());
                this.f114382m.mo75956x3d5d1f78(fVar);
            }
            bw5.x7 x7Var7 = this.f114383n;
            if (x7Var7 != null && zArr[8]) {
                fVar.i(8, x7Var7.mo75928xcd1e8d8());
                this.f114383n.mo75956x3d5d1f78(fVar);
            }
            bw5.x7 x7Var8 = this.f114384o;
            if (x7Var8 != null && zArr[9]) {
                fVar.i(9, x7Var8.mo75928xcd1e8d8());
                this.f114384o.mo75956x3d5d1f78(fVar);
            }
            if (zArr[10]) {
                fVar.e(10, this.f114385p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f114386q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f114387r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f114388s);
            }
            if (!zArr[14]) {
                return 0;
            }
            fVar.h(14, this.f114389t);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f114376d) : 0;
            bw5.x7 x7Var9 = this.f114377e;
            if (x7Var9 != null && zArr[2]) {
                e17 += b36.f.i(2, x7Var9.mo75928xcd1e8d8());
            }
            bw5.x7 x7Var10 = this.f114378f;
            if (x7Var10 != null && zArr[3]) {
                e17 += b36.f.i(3, x7Var10.mo75928xcd1e8d8());
            }
            bw5.x7 x7Var11 = this.f114379g;
            if (x7Var11 != null && zArr[4]) {
                e17 += b36.f.i(4, x7Var11.mo75928xcd1e8d8());
            }
            bw5.x7 x7Var12 = this.f114380h;
            if (x7Var12 != null && zArr[5]) {
                e17 += b36.f.i(5, x7Var12.mo75928xcd1e8d8());
            }
            bw5.x7 x7Var13 = this.f114381i;
            if (x7Var13 != null && zArr[6]) {
                e17 += b36.f.i(6, x7Var13.mo75928xcd1e8d8());
            }
            bw5.x7 x7Var14 = this.f114382m;
            if (x7Var14 != null && zArr[7]) {
                e17 += b36.f.i(7, x7Var14.mo75928xcd1e8d8());
            }
            bw5.x7 x7Var15 = this.f114383n;
            if (x7Var15 != null && zArr[8]) {
                e17 += b36.f.i(8, x7Var15.mo75928xcd1e8d8());
            }
            bw5.x7 x7Var16 = this.f114384o;
            if (x7Var16 != null && zArr[9]) {
                e17 += b36.f.i(9, x7Var16.mo75928xcd1e8d8());
            }
            if (zArr[10]) {
                e17 += b36.f.e(10, this.f114385p);
            }
            if (zArr[11]) {
                e17 += b36.f.e(11, this.f114386q);
            }
            if (zArr[12]) {
                e17 += b36.f.e(12, this.f114387r);
            }
            if (zArr[13]) {
                e17 += b36.f.e(13, this.f114388s);
            }
            return zArr[14] ? e17 + b36.f.h(14, this.f114389t) : e17;
        }
        if (i17 == 2) {
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
                this.f114376d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.x7 x7Var17 = new bw5.x7();
                    if (bArr != null && bArr.length > 0) {
                        x7Var17.mo11468x92b714fd(bArr);
                    }
                    this.f114377e = x7Var17;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.x7 x7Var18 = new bw5.x7();
                    if (bArr2 != null && bArr2.length > 0) {
                        x7Var18.mo11468x92b714fd(bArr2);
                    }
                    this.f114378f = x7Var18;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.x7 x7Var19 = new bw5.x7();
                    if (bArr3 != null && bArr3.length > 0) {
                        x7Var19.mo11468x92b714fd(bArr3);
                    }
                    this.f114379g = x7Var19;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.x7 x7Var20 = new bw5.x7();
                    if (bArr4 != null && bArr4.length > 0) {
                        x7Var20.mo11468x92b714fd(bArr4);
                    }
                    this.f114380h = x7Var20;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.x7 x7Var21 = new bw5.x7();
                    if (bArr5 != null && bArr5.length > 0) {
                        x7Var21.mo11468x92b714fd(bArr5);
                    }
                    this.f114381i = x7Var21;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.x7 x7Var22 = new bw5.x7();
                    if (bArr6 != null && bArr6.length > 0) {
                        x7Var22.mo11468x92b714fd(bArr6);
                    }
                    this.f114382m = x7Var22;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.x7 x7Var23 = new bw5.x7();
                    if (bArr7 != null && bArr7.length > 0) {
                        x7Var23.mo11468x92b714fd(bArr7);
                    }
                    this.f114383n = x7Var23;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    bw5.x7 x7Var24 = new bw5.x7();
                    if (bArr8 != null && bArr8.length > 0) {
                        x7Var24.mo11468x92b714fd(bArr8);
                    }
                    this.f114384o = x7Var24;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f114385p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f114386q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f114387r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f114388s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f114389t = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            default:
                return -1;
        }
    }
}
