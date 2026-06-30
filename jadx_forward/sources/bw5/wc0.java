package bw5;

/* loaded from: classes2.dex */
public class wc0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f116176d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f116178f;

    /* renamed from: g, reason: collision with root package name */
    public int f116179g;

    /* renamed from: h, reason: collision with root package name */
    public long f116180h;

    /* renamed from: i, reason: collision with root package name */
    public int f116181i;

    /* renamed from: m, reason: collision with root package name */
    public int f116182m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f116183n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f116184o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.pi0 f116185p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f116186q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f116187r;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f116177e = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f116188s = new boolean[13];

    static {
        new bw5.wc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wc0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.wc0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wc0)) {
            return false;
        }
        bw5.wc0 wc0Var = (bw5.wc0) fVar;
        return n51.f.a(this.f116176d, wc0Var.f116176d) && n51.f.a(this.f116177e, wc0Var.f116177e) && n51.f.a(this.f116178f, wc0Var.f116178f) && n51.f.a(java.lang.Integer.valueOf(this.f116179g), java.lang.Integer.valueOf(wc0Var.f116179g)) && n51.f.a(java.lang.Long.valueOf(this.f116180h), java.lang.Long.valueOf(wc0Var.f116180h)) && n51.f.a(java.lang.Integer.valueOf(this.f116181i), java.lang.Integer.valueOf(wc0Var.f116181i)) && n51.f.a(java.lang.Integer.valueOf(this.f116182m), java.lang.Integer.valueOf(wc0Var.f116182m)) && n51.f.a(this.f116183n, wc0Var.f116183n) && n51.f.a(this.f116184o, wc0Var.f116184o) && n51.f.a(this.f116185p, wc0Var.f116185p) && n51.f.a(this.f116186q, wc0Var.f116186q) && n51.f.a(java.lang.Boolean.valueOf(this.f116187r), java.lang.Boolean.valueOf(wc0Var.f116187r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.wc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116188s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f116176d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.f116177e);
            java.lang.String str2 = this.f116178f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f116179g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f116180h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f116181i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f116182m);
            }
            java.lang.String str3 = this.f116183n;
            if (str3 != null && zArr[8]) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f116184o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            bw5.pi0 pi0Var = this.f116185p;
            if (pi0Var != null && zArr[10]) {
                fVar.i(10, pi0Var.mo75928xcd1e8d8());
                this.f116185p.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str5 = this.f116186q;
            if (str5 != null && zArr[11]) {
                fVar.j(11, str5);
            }
            if (!zArr[12]) {
                return 0;
            }
            fVar.a(12, this.f116187r);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f116176d;
            int j17 = ((str6 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str6)) + b36.f.g(2, 8, this.f116177e);
            java.lang.String str7 = this.f116178f;
            if (str7 != null && zArr[3]) {
                j17 += b36.f.j(3, str7);
            }
            if (zArr[4]) {
                j17 += b36.f.e(4, this.f116179g);
            }
            if (zArr[5]) {
                j17 += b36.f.h(5, this.f116180h);
            }
            if (zArr[6]) {
                j17 += b36.f.e(6, this.f116181i);
            }
            if (zArr[7]) {
                j17 += b36.f.e(7, this.f116182m);
            }
            java.lang.String str8 = this.f116183n;
            if (str8 != null && zArr[8]) {
                j17 += b36.f.j(8, str8);
            }
            java.lang.String str9 = this.f116184o;
            if (str9 != null && zArr[9]) {
                j17 += b36.f.j(9, str9);
            }
            bw5.pi0 pi0Var2 = this.f116185p;
            if (pi0Var2 != null && zArr[10]) {
                j17 += b36.f.i(10, pi0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.f116186q;
            if (str10 != null && zArr[11]) {
                j17 += b36.f.j(11, str10);
            }
            return zArr[12] ? j17 + b36.f.a(12, this.f116187r) : j17;
        }
        if (i17 == 2) {
            this.f116177e.clear();
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
                this.f116176d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.zc0 zc0Var = new bw5.zc0();
                    if (bArr != null && bArr.length > 0) {
                        zc0Var.mo11468x92b714fd(bArr);
                    }
                    this.f116177e.add(zc0Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f116178f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f116179g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f116180h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f116181i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f116182m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f116183n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f116184o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    bw5.pi0 pi0Var3 = new bw5.pi0();
                    if (bArr2 != null && bArr2.length > 0) {
                        pi0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f116185p = pi0Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f116186q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f116187r = aVar2.c(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
