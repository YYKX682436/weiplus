package bw5;

/* loaded from: classes2.dex */
public class pd0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f113112d;

    /* renamed from: e, reason: collision with root package name */
    public int f113113e;

    /* renamed from: f, reason: collision with root package name */
    public int f113114f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f113115g;

    /* renamed from: h, reason: collision with root package name */
    public int f113116h;

    /* renamed from: i, reason: collision with root package name */
    public int f113117i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f113118m;

    /* renamed from: n, reason: collision with root package name */
    public long f113119n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f113120o = new boolean[9];

    static {
        new bw5.pd0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pd0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.pd0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pd0)) {
            return false;
        }
        bw5.pd0 pd0Var = (bw5.pd0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f113112d), java.lang.Integer.valueOf(pd0Var.f113112d)) && n51.f.a(java.lang.Integer.valueOf(this.f113113e), java.lang.Integer.valueOf(pd0Var.f113113e)) && n51.f.a(java.lang.Integer.valueOf(this.f113114f), java.lang.Integer.valueOf(pd0Var.f113114f)) && n51.f.a(java.lang.Boolean.valueOf(this.f113115g), java.lang.Boolean.valueOf(pd0Var.f113115g)) && n51.f.a(java.lang.Integer.valueOf(this.f113116h), java.lang.Integer.valueOf(pd0Var.f113116h)) && n51.f.a(java.lang.Integer.valueOf(this.f113117i), java.lang.Integer.valueOf(pd0Var.f113117i)) && n51.f.a(java.lang.Boolean.valueOf(this.f113118m), java.lang.Boolean.valueOf(pd0Var.f113118m)) && n51.f.a(java.lang.Long.valueOf(this.f113119n), java.lang.Long.valueOf(pd0Var.f113119n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.pd0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113120o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f113112d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f113113e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f113114f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f113115g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f113116h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f113117i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f113118m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f113119n);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f113112d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f113113e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f113114f);
            }
            if (zArr[4]) {
                e17 += b36.f.a(4, this.f113115g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f113116h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f113117i);
            }
            if (zArr[7]) {
                e17 += b36.f.a(7, this.f113118m);
            }
            return zArr[8] ? e17 + b36.f.h(8, this.f113119n) : e17;
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
                this.f113112d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113113e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f113114f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113115g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113116h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f113117i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f113118m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f113119n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
