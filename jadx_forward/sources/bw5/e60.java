package bw5;

/* loaded from: classes2.dex */
public class e60 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f108278d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.mc0 f108279e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f108280f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f108281g;

    /* renamed from: h, reason: collision with root package name */
    public int f108282h;

    /* renamed from: i, reason: collision with root package name */
    public int f108283i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f108284m;

    /* renamed from: n, reason: collision with root package name */
    public int f108285n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.w50 f108286o;

    /* renamed from: p, reason: collision with root package name */
    public int f108287p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f108288q = new boolean[11];

    static {
        new bw5.e60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.e60 mo11468x92b714fd(byte[] bArr) {
        return (bw5.e60) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.e60)) {
            return false;
        }
        bw5.e60 e60Var = (bw5.e60) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f108278d), java.lang.Long.valueOf(e60Var.f108278d)) && n51.f.a(this.f108279e, e60Var.f108279e) && n51.f.a(java.lang.Boolean.valueOf(this.f108280f), java.lang.Boolean.valueOf(e60Var.f108280f)) && n51.f.a(java.lang.Boolean.valueOf(this.f108281g), java.lang.Boolean.valueOf(e60Var.f108281g)) && n51.f.a(java.lang.Integer.valueOf(this.f108282h), java.lang.Integer.valueOf(e60Var.f108282h)) && n51.f.a(java.lang.Integer.valueOf(this.f108283i), java.lang.Integer.valueOf(e60Var.f108283i)) && n51.f.a(this.f108284m, e60Var.f108284m) && n51.f.a(java.lang.Integer.valueOf(this.f108285n), java.lang.Integer.valueOf(e60Var.f108285n)) && n51.f.a(this.f108286o, e60Var.f108286o) && n51.f.a(java.lang.Integer.valueOf(this.f108287p), java.lang.Integer.valueOf(e60Var.f108287p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.e60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f108288q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f108278d);
            }
            bw5.mc0 mc0Var = this.f108279e;
            if (mc0Var != null && zArr[2]) {
                fVar.i(2, mc0Var.mo75928xcd1e8d8());
                this.f108279e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.a(3, this.f108280f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f108281g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f108282h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f108283i);
            }
            java.lang.String str = this.f108284m;
            if (str != null && zArr[7]) {
                fVar.j(7, str);
            }
            if (zArr[8]) {
                fVar.e(8, this.f108285n);
            }
            bw5.w50 w50Var = this.f108286o;
            if (w50Var != null && zArr[9]) {
                fVar.i(9, w50Var.mo75928xcd1e8d8());
                this.f108286o.mo75956x3d5d1f78(fVar);
            }
            if (zArr[10]) {
                fVar.e(10, this.f108287p);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f108278d) : 0;
            bw5.mc0 mc0Var2 = this.f108279e;
            if (mc0Var2 != null && zArr[2]) {
                h17 += b36.f.i(2, mc0Var2.mo75928xcd1e8d8());
            }
            if (zArr[3]) {
                h17 += b36.f.a(3, this.f108280f);
            }
            if (zArr[4]) {
                h17 += b36.f.a(4, this.f108281g);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f108282h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f108283i);
            }
            java.lang.String str2 = this.f108284m;
            if (str2 != null && zArr[7]) {
                h17 += b36.f.j(7, str2);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f108285n);
            }
            bw5.w50 w50Var2 = this.f108286o;
            if (w50Var2 != null && zArr[9]) {
                h17 += b36.f.i(9, w50Var2.mo75928xcd1e8d8());
            }
            return zArr[10] ? h17 + b36.f.e(10, this.f108287p) : h17;
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
                this.f108278d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.mc0 mc0Var3 = new bw5.mc0();
                    if (bArr != null && bArr.length > 0) {
                        mc0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f108279e = mc0Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f108280f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108281g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108282h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108283i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f108284m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f108285n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.w50 w50Var3 = new bw5.w50();
                    if (bArr2 != null && bArr2.length > 0) {
                        w50Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f108286o = w50Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f108287p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
