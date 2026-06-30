package bw5;

/* loaded from: classes2.dex */
public class tr0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f115120d;

    /* renamed from: e, reason: collision with root package name */
    public int f115121e;

    /* renamed from: f, reason: collision with root package name */
    public long f115122f;

    /* renamed from: g, reason: collision with root package name */
    public long f115123g;

    /* renamed from: h, reason: collision with root package name */
    public long f115124h;

    /* renamed from: i, reason: collision with root package name */
    public long f115125i;

    /* renamed from: m, reason: collision with root package name */
    public long f115126m;

    /* renamed from: n, reason: collision with root package name */
    public long f115127n;

    /* renamed from: o, reason: collision with root package name */
    public long f115128o;

    /* renamed from: p, reason: collision with root package name */
    public long f115129p;

    /* renamed from: q, reason: collision with root package name */
    public int f115130q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f115131r = new boolean[12];

    static {
        new bw5.tr0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tr0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.tr0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tr0)) {
            return false;
        }
        bw5.tr0 tr0Var = (bw5.tr0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f115120d), java.lang.Integer.valueOf(tr0Var.f115120d)) && n51.f.a(java.lang.Integer.valueOf(this.f115121e), java.lang.Integer.valueOf(tr0Var.f115121e)) && n51.f.a(java.lang.Long.valueOf(this.f115122f), java.lang.Long.valueOf(tr0Var.f115122f)) && n51.f.a(java.lang.Long.valueOf(this.f115123g), java.lang.Long.valueOf(tr0Var.f115123g)) && n51.f.a(java.lang.Long.valueOf(this.f115124h), java.lang.Long.valueOf(tr0Var.f115124h)) && n51.f.a(java.lang.Long.valueOf(this.f115125i), java.lang.Long.valueOf(tr0Var.f115125i)) && n51.f.a(java.lang.Long.valueOf(this.f115126m), java.lang.Long.valueOf(tr0Var.f115126m)) && n51.f.a(java.lang.Long.valueOf(this.f115127n), java.lang.Long.valueOf(tr0Var.f115127n)) && n51.f.a(java.lang.Long.valueOf(this.f115128o), java.lang.Long.valueOf(tr0Var.f115128o)) && n51.f.a(java.lang.Long.valueOf(this.f115129p), java.lang.Long.valueOf(tr0Var.f115129p)) && n51.f.a(java.lang.Integer.valueOf(this.f115130q), java.lang.Integer.valueOf(tr0Var.f115130q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.tr0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115131r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f115120d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f115121e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f115122f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f115123g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f115124h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f115125i);
            }
            if (zArr[7]) {
                fVar.h(7, this.f115126m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f115127n);
            }
            if (zArr[9]) {
                fVar.h(9, this.f115128o);
            }
            if (zArr[10]) {
                fVar.h(10, this.f115129p);
            }
            if (!zArr[11]) {
                return 0;
            }
            fVar.e(11, this.f115130q);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f115120d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f115121e);
            }
            if (zArr[3]) {
                e17 += b36.f.h(3, this.f115122f);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f115123g);
            }
            if (zArr[5]) {
                e17 += b36.f.h(5, this.f115124h);
            }
            if (zArr[6]) {
                e17 += b36.f.h(6, this.f115125i);
            }
            if (zArr[7]) {
                e17 += b36.f.h(7, this.f115126m);
            }
            if (zArr[8]) {
                e17 += b36.f.h(8, this.f115127n);
            }
            if (zArr[9]) {
                e17 += b36.f.h(9, this.f115128o);
            }
            if (zArr[10]) {
                e17 += b36.f.h(10, this.f115129p);
            }
            return zArr[11] ? e17 + b36.f.e(11, this.f115130q) : e17;
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
                this.f115120d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f115121e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f115122f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f115123g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115124h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f115125i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f115126m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f115127n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f115128o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f115129p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f115130q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
