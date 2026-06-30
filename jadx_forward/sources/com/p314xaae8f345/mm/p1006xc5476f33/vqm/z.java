package com.p314xaae8f345.mm.p1006xc5476f33.vqm;

/* loaded from: classes2.dex */
public class z extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: y, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.vqm.z f259057y = new com.p314xaae8f345.mm.p1006xc5476f33.vqm.z();

    /* renamed from: d, reason: collision with root package name */
    public long f259058d;

    /* renamed from: e, reason: collision with root package name */
    public long f259059e;

    /* renamed from: f, reason: collision with root package name */
    public long f259060f;

    /* renamed from: g, reason: collision with root package name */
    public long f259061g;

    /* renamed from: h, reason: collision with root package name */
    public int f259062h;

    /* renamed from: i, reason: collision with root package name */
    public long f259063i;

    /* renamed from: m, reason: collision with root package name */
    public long f259064m;

    /* renamed from: n, reason: collision with root package name */
    public int f259065n;

    /* renamed from: o, reason: collision with root package name */
    public int f259066o;

    /* renamed from: p, reason: collision with root package name */
    public long f259067p;

    /* renamed from: q, reason: collision with root package name */
    public long f259068q;

    /* renamed from: r, reason: collision with root package name */
    public long f259069r;

    /* renamed from: s, reason: collision with root package name */
    public long f259070s;

    /* renamed from: t, reason: collision with root package name */
    public long f259071t;

    /* renamed from: u, reason: collision with root package name */
    public int f259072u;

    /* renamed from: v, reason: collision with root package name */
    public int f259073v;

    /* renamed from: w, reason: collision with root package name */
    public int f259074w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f259075x = new boolean[18];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.vqm.z)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.z zVar = (com.p314xaae8f345.mm.p1006xc5476f33.vqm.z) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f259058d), java.lang.Long.valueOf(zVar.f259058d)) && n51.f.a(java.lang.Long.valueOf(this.f259059e), java.lang.Long.valueOf(zVar.f259059e)) && n51.f.a(java.lang.Long.valueOf(this.f259060f), java.lang.Long.valueOf(zVar.f259060f)) && n51.f.a(java.lang.Long.valueOf(this.f259061g), java.lang.Long.valueOf(zVar.f259061g)) && n51.f.a(java.lang.Integer.valueOf(this.f259062h), java.lang.Integer.valueOf(zVar.f259062h)) && n51.f.a(java.lang.Long.valueOf(this.f259063i), java.lang.Long.valueOf(zVar.f259063i)) && n51.f.a(java.lang.Long.valueOf(this.f259064m), java.lang.Long.valueOf(zVar.f259064m)) && n51.f.a(java.lang.Integer.valueOf(this.f259065n), java.lang.Integer.valueOf(zVar.f259065n)) && n51.f.a(java.lang.Integer.valueOf(this.f259066o), java.lang.Integer.valueOf(zVar.f259066o)) && n51.f.a(java.lang.Long.valueOf(this.f259067p), java.lang.Long.valueOf(zVar.f259067p)) && n51.f.a(java.lang.Long.valueOf(this.f259068q), java.lang.Long.valueOf(zVar.f259068q)) && n51.f.a(java.lang.Long.valueOf(this.f259069r), java.lang.Long.valueOf(zVar.f259069r)) && n51.f.a(java.lang.Long.valueOf(this.f259070s), java.lang.Long.valueOf(zVar.f259070s)) && n51.f.a(java.lang.Long.valueOf(this.f259071t), java.lang.Long.valueOf(zVar.f259071t)) && n51.f.a(java.lang.Integer.valueOf(this.f259072u), java.lang.Integer.valueOf(zVar.f259072u)) && n51.f.a(java.lang.Integer.valueOf(this.f259073v), java.lang.Integer.valueOf(zVar.f259073v)) && n51.f.a(java.lang.Integer.valueOf(this.f259074w), java.lang.Integer.valueOf(zVar.f259074w));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.vqm.z();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f259075x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f259058d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f259059e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f259060f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f259061g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f259062h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f259063i);
            }
            if (zArr[7]) {
                fVar.h(7, this.f259064m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f259065n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f259066o);
            }
            if (zArr[10]) {
                fVar.h(10, this.f259067p);
            }
            if (zArr[11]) {
                fVar.h(11, this.f259068q);
            }
            if (zArr[12]) {
                fVar.h(12, this.f259069r);
            }
            if (zArr[13]) {
                fVar.h(13, this.f259070s);
            }
            if (zArr[14]) {
                fVar.h(14, this.f259071t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f259072u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f259073v);
            }
            if (zArr[17]) {
                fVar.e(17, this.f259074w);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f259058d) + 0 : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f259059e);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f259060f);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f259061g);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f259062h);
            }
            if (zArr[6]) {
                h17 += b36.f.h(6, this.f259063i);
            }
            if (zArr[7]) {
                h17 += b36.f.h(7, this.f259064m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f259065n);
            }
            if (zArr[9]) {
                h17 += b36.f.e(9, this.f259066o);
            }
            if (zArr[10]) {
                h17 += b36.f.h(10, this.f259067p);
            }
            if (zArr[11]) {
                h17 += b36.f.h(11, this.f259068q);
            }
            if (zArr[12]) {
                h17 += b36.f.h(12, this.f259069r);
            }
            if (zArr[13]) {
                h17 += b36.f.h(13, this.f259070s);
            }
            if (zArr[14]) {
                h17 += b36.f.h(14, this.f259071t);
            }
            if (zArr[15]) {
                h17 += b36.f.e(15, this.f259072u);
            }
            if (zArr[16]) {
                h17 += b36.f.e(16, this.f259073v);
            }
            return zArr[17] ? h17 + b36.f.e(17, this.f259074w) : h17;
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
                this.f259058d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f259059e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f259060f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f259061g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f259062h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f259063i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f259064m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f259065n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f259066o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f259067p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f259068q = aVar2.i(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f259069r = aVar2.i(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f259070s = aVar2.i(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f259071t = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f259072u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f259073v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f259074w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.vqm.z) super.mo11468x92b714fd(bArr);
    }
}
