package bw5;

/* loaded from: classes2.dex */
public class eg0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public double f108433d;

    /* renamed from: e, reason: collision with root package name */
    public double f108434e;

    /* renamed from: f, reason: collision with root package name */
    public double f108435f;

    /* renamed from: g, reason: collision with root package name */
    public double f108436g;

    /* renamed from: h, reason: collision with root package name */
    public int f108437h;

    /* renamed from: i, reason: collision with root package name */
    public int f108438i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f108439m = new boolean[7];

    static {
        new bw5.eg0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.eg0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.eg0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.eg0)) {
            return false;
        }
        bw5.eg0 eg0Var = (bw5.eg0) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f108433d), java.lang.Double.valueOf(eg0Var.f108433d)) && n51.f.a(java.lang.Double.valueOf(this.f108434e), java.lang.Double.valueOf(eg0Var.f108434e)) && n51.f.a(java.lang.Double.valueOf(this.f108435f), java.lang.Double.valueOf(eg0Var.f108435f)) && n51.f.a(java.lang.Double.valueOf(this.f108436g), java.lang.Double.valueOf(eg0Var.f108436g)) && n51.f.a(java.lang.Integer.valueOf(this.f108437h), java.lang.Integer.valueOf(eg0Var.f108437h)) && n51.f.a(java.lang.Integer.valueOf(this.f108438i), java.lang.Integer.valueOf(eg0Var.f108438i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.eg0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f108439m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.c(1, this.f108433d);
            }
            if (zArr[2]) {
                fVar.c(2, this.f108434e);
            }
            if (zArr[3]) {
                fVar.c(3, this.f108435f);
            }
            if (zArr[4]) {
                fVar.c(4, this.f108436g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f108437h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f108438i);
            }
            return 0;
        }
        if (i17 == 1) {
            int c17 = zArr[1] ? 0 + b36.f.c(1, this.f108433d) : 0;
            if (zArr[2]) {
                c17 += b36.f.c(2, this.f108434e);
            }
            if (zArr[3]) {
                c17 += b36.f.c(3, this.f108435f);
            }
            if (zArr[4]) {
                c17 += b36.f.c(4, this.f108436g);
            }
            if (zArr[5]) {
                c17 += b36.f.e(5, this.f108437h);
            }
            return zArr[6] ? c17 + b36.f.e(6, this.f108438i) : c17;
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
                this.f108433d = aVar2.e(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108434e = aVar2.e(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108435f = aVar2.e(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108436g = aVar2.e(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108437h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108438i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
