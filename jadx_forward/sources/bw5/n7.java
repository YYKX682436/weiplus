package bw5;

/* loaded from: classes9.dex */
public class n7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public double f112055d;

    /* renamed from: e, reason: collision with root package name */
    public int f112056e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f112057f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f112058g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f112059h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f112060i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f112061m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f112062n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f112063o = new boolean[9];

    static {
        new bw5.n7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.n7 mo11468x92b714fd(byte[] bArr) {
        return (bw5.n7) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.n7)) {
            return false;
        }
        bw5.n7 n7Var = (bw5.n7) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f112055d), java.lang.Double.valueOf(n7Var.f112055d)) && n51.f.a(java.lang.Integer.valueOf(this.f112056e), java.lang.Integer.valueOf(n7Var.f112056e)) && n51.f.a(java.lang.Boolean.valueOf(this.f112057f), java.lang.Boolean.valueOf(n7Var.f112057f)) && n51.f.a(java.lang.Boolean.valueOf(this.f112058g), java.lang.Boolean.valueOf(n7Var.f112058g)) && n51.f.a(java.lang.Boolean.valueOf(this.f112059h), java.lang.Boolean.valueOf(n7Var.f112059h)) && n51.f.a(java.lang.Boolean.valueOf(this.f112060i), java.lang.Boolean.valueOf(n7Var.f112060i)) && n51.f.a(java.lang.Boolean.valueOf(this.f112061m), java.lang.Boolean.valueOf(n7Var.f112061m)) && n51.f.a(java.lang.Boolean.valueOf(this.f112062n), java.lang.Boolean.valueOf(n7Var.f112062n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.n7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f112063o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.c(1, this.f112055d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f112056e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f112057f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f112058g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f112059h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f112060i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f112061m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f112062n);
            }
            return 0;
        }
        if (i17 == 1) {
            int c17 = zArr[1] ? 0 + b36.f.c(1, this.f112055d) : 0;
            if (zArr[2]) {
                c17 += b36.f.e(2, this.f112056e);
            }
            if (zArr[3]) {
                c17 += b36.f.a(3, this.f112057f);
            }
            if (zArr[4]) {
                c17 += b36.f.a(4, this.f112058g);
            }
            if (zArr[5]) {
                c17 += b36.f.a(5, this.f112059h);
            }
            if (zArr[6]) {
                c17 += b36.f.a(6, this.f112060i);
            }
            if (zArr[7]) {
                c17 += b36.f.a(7, this.f112061m);
            }
            return zArr[8] ? c17 + b36.f.a(8, this.f112062n) : c17;
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
                this.f112055d = aVar2.e(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f112056e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112057f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f112058g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f112059h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f112060i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f112061m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f112062n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
