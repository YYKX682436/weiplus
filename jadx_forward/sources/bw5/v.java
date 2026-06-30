package bw5;

/* loaded from: classes2.dex */
public class v extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f115617d;

    /* renamed from: e, reason: collision with root package name */
    public int f115618e;

    /* renamed from: f, reason: collision with root package name */
    public int f115619f;

    /* renamed from: g, reason: collision with root package name */
    public int f115620g;

    /* renamed from: h, reason: collision with root package name */
    public int f115621h;

    /* renamed from: i, reason: collision with root package name */
    public int f115622i;

    /* renamed from: m, reason: collision with root package name */
    public int f115623m;

    /* renamed from: n, reason: collision with root package name */
    public long f115624n;

    /* renamed from: o, reason: collision with root package name */
    public int f115625o;

    /* renamed from: p, reason: collision with root package name */
    public int f115626p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f115627q = new boolean[11];

    static {
        new bw5.v();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.v mo11468x92b714fd(byte[] bArr) {
        return (bw5.v) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.v)) {
            return false;
        }
        bw5.v vVar = (bw5.v) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f115617d), java.lang.Integer.valueOf(vVar.f115617d)) && n51.f.a(java.lang.Integer.valueOf(this.f115618e), java.lang.Integer.valueOf(vVar.f115618e)) && n51.f.a(java.lang.Integer.valueOf(this.f115619f), java.lang.Integer.valueOf(vVar.f115619f)) && n51.f.a(java.lang.Integer.valueOf(this.f115620g), java.lang.Integer.valueOf(vVar.f115620g)) && n51.f.a(java.lang.Integer.valueOf(this.f115621h), java.lang.Integer.valueOf(vVar.f115621h)) && n51.f.a(java.lang.Integer.valueOf(this.f115622i), java.lang.Integer.valueOf(vVar.f115622i)) && n51.f.a(java.lang.Integer.valueOf(this.f115623m), java.lang.Integer.valueOf(vVar.f115623m)) && n51.f.a(java.lang.Long.valueOf(this.f115624n), java.lang.Long.valueOf(vVar.f115624n)) && n51.f.a(java.lang.Integer.valueOf(this.f115625o), java.lang.Integer.valueOf(vVar.f115625o)) && n51.f.a(java.lang.Integer.valueOf(this.f115626p), java.lang.Integer.valueOf(vVar.f115626p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.v();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115627q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f115617d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f115618e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f115619f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f115620g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f115621h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f115622i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f115623m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f115624n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f115625o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f115626p);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f115617d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f115618e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f115619f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f115620g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f115621h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f115622i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f115623m);
            }
            if (zArr[8]) {
                e17 += b36.f.h(8, this.f115624n);
            }
            if (zArr[9]) {
                e17 += b36.f.e(9, this.f115625o);
            }
            return zArr[10] ? e17 + b36.f.e(10, this.f115626p) : e17;
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
                this.f115617d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f115618e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f115619f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f115620g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115621h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f115622i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f115623m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f115624n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f115625o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f115626p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
