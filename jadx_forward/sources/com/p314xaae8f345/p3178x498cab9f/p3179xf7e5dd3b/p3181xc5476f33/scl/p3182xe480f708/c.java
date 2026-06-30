package com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708;

/* loaded from: classes8.dex */
public class c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f301577d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.e f301578e;

    /* renamed from: g, reason: collision with root package name */
    public double f301580g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f301581h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f301583m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f301584n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f301585o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f301586p;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f301579f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f301582i = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f301587q = new boolean[11];

    static {
        new com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.c();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.c)) {
            return false;
        }
        com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.c cVar = (com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.c) fVar;
        return n51.f.a(this.f301577d, cVar.f301577d) && n51.f.a(this.f301578e, cVar.f301578e) && n51.f.a(this.f301579f, cVar.f301579f) && n51.f.a(java.lang.Double.valueOf(this.f301580g), java.lang.Double.valueOf(cVar.f301580g)) && n51.f.a(this.f301581h, cVar.f301581h) && n51.f.a(this.f301582i, cVar.f301582i) && n51.f.a(this.f301583m, cVar.f301583m) && n51.f.a(this.f301584n, cVar.f301584n) && n51.f.a(java.lang.Boolean.valueOf(this.f301585o), java.lang.Boolean.valueOf(cVar.f301585o)) && n51.f.a(java.lang.Boolean.valueOf(this.f301586p), java.lang.Boolean.valueOf(cVar.f301586p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.c();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f301587q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f301577d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.e eVar = this.f301578e;
            if (eVar != null && zArr[2]) {
                fVar.i(2, eVar.mo75928xcd1e8d8());
                this.f301578e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 1, this.f301579f);
            if (zArr[4]) {
                fVar.c(4, this.f301580g);
            }
            java.lang.String str2 = this.f301581h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            fVar.g(6, 1, this.f301582i);
            java.lang.String str3 = this.f301583m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f301584n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            if (zArr[9]) {
                fVar.a(9, this.f301585o);
            }
            if (zArr[10]) {
                fVar.a(10, this.f301586p);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f301577d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.e eVar2 = this.f301578e;
            if (eVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, eVar2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(3, 1, this.f301579f);
            if (zArr[4]) {
                g17 += b36.f.c(4, this.f301580g);
            }
            java.lang.String str6 = this.f301581h;
            if (str6 != null && zArr[5]) {
                g17 += b36.f.j(5, str6);
            }
            int g18 = g17 + b36.f.g(6, 1, this.f301582i);
            java.lang.String str7 = this.f301583m;
            if (str7 != null && zArr[7]) {
                g18 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f301584n;
            if (str8 != null && zArr[8]) {
                g18 += b36.f.j(8, str8);
            }
            if (zArr[9]) {
                g18 += b36.f.a(9, this.f301585o);
            }
            return zArr[10] ? g18 + b36.f.a(10, this.f301586p) : g18;
        }
        if (i17 == 2) {
            this.f301579f.clear();
            this.f301582i.clear();
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
                this.f301577d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.e eVar3 = new com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.e();
                    if (bArr != null && bArr.length > 0) {
                        eVar3.mo11468x92b714fd(bArr);
                    }
                    this.f301578e = eVar3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f301579f.add(aVar2.k(intValue));
                zArr[3] = true;
                return 0;
            case 4:
                this.f301580g = aVar2.e(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f301581h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f301582i.add(aVar2.k(intValue));
                zArr[6] = true;
                return 0;
            case 7:
                this.f301583m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f301584n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f301585o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f301586p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.c) super.mo11468x92b714fd(bArr);
    }
}
