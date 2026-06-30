package com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c;

/* loaded from: classes7.dex */
public class t extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f298830d;

    /* renamed from: e, reason: collision with root package name */
    public long f298831e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f298832f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f298833g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f298834h;

    /* renamed from: i, reason: collision with root package name */
    public int f298835i;

    /* renamed from: m, reason: collision with root package name */
    public int f298836m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f298837n = new boolean[8];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.t();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.t mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.t) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.t)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.t tVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.t) fVar;
        return n51.f.a(this.f298830d, tVar.f298830d) && n51.f.a(java.lang.Long.valueOf(this.f298831e), java.lang.Long.valueOf(tVar.f298831e)) && n51.f.a(this.f298832f, tVar.f298832f) && n51.f.a(this.f298833g, tVar.f298833g) && n51.f.a(this.f298834h, tVar.f298834h) && n51.f.a(java.lang.Integer.valueOf(this.f298835i), java.lang.Integer.valueOf(tVar.f298835i)) && n51.f.a(java.lang.Integer.valueOf(this.f298836m), java.lang.Integer.valueOf(tVar.f298836m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.t();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f298837n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f298830d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f298831e);
            }
            java.lang.String str2 = this.f298832f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f298833g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f298834h;
            if (gVar != null && zArr[5]) {
                fVar.b(5, gVar);
            }
            if (zArr[6]) {
                fVar.e(6, this.f298835i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f298836m);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f298830d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f298831e);
            }
            java.lang.String str5 = this.f298832f;
            if (str5 != null && zArr[3]) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f298833g;
            if (str6 != null && zArr[4]) {
                i18 += b36.f.j(4, str6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f298834h;
            if (gVar2 != null && zArr[5]) {
                i18 += b36.f.b(5, gVar2);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f298835i);
            }
            return zArr[7] ? i18 + b36.f.e(7, this.f298836m) : i18;
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
                this.f298830d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f298831e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f298832f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f298833g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f298834h = aVar2.d(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f298835i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f298836m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
