package com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c;

/* loaded from: classes9.dex */
public class g extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: u, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.g f298805u = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.g();

    /* renamed from: d, reason: collision with root package name */
    public long f298806d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f298807e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f298808f;

    /* renamed from: g, reason: collision with root package name */
    public int f298809g;

    /* renamed from: h, reason: collision with root package name */
    public int f298810h;

    /* renamed from: i, reason: collision with root package name */
    public long f298811i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.y f298812m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.w f298813n;

    /* renamed from: o, reason: collision with root package name */
    public int f298814o;

    /* renamed from: p, reason: collision with root package name */
    public long f298815p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f298816q;

    /* renamed from: r, reason: collision with root package name */
    public int f298817r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f298818s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f298819t = new boolean[14];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.g)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.g gVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.g) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f298806d), java.lang.Long.valueOf(gVar.f298806d)) && n51.f.a(this.f298807e, gVar.f298807e) && n51.f.a(this.f298808f, gVar.f298808f) && n51.f.a(java.lang.Integer.valueOf(this.f298809g), java.lang.Integer.valueOf(gVar.f298809g)) && n51.f.a(java.lang.Integer.valueOf(this.f298810h), java.lang.Integer.valueOf(gVar.f298810h)) && n51.f.a(java.lang.Long.valueOf(this.f298811i), java.lang.Long.valueOf(gVar.f298811i)) && n51.f.a(this.f298812m, gVar.f298812m) && n51.f.a(this.f298813n, gVar.f298813n) && n51.f.a(java.lang.Integer.valueOf(this.f298814o), java.lang.Integer.valueOf(gVar.f298814o)) && n51.f.a(java.lang.Long.valueOf(this.f298815p), java.lang.Long.valueOf(gVar.f298815p)) && n51.f.a(this.f298816q, gVar.f298816q) && n51.f.a(java.lang.Integer.valueOf(this.f298817r), java.lang.Integer.valueOf(gVar.f298817r)) && n51.f.a(this.f298818s, gVar.f298818s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.g();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f298819t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f298806d);
            }
            java.lang.String str = this.f298807e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f298808f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f298809g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f298810h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f298811i);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.y yVar = this.f298812m;
            if (yVar != null && zArr[7]) {
                fVar.e(7, yVar.f298880d);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.w wVar = this.f298813n;
            if (wVar != null && zArr[8]) {
                fVar.e(8, wVar.f298863d);
            }
            if (zArr[9]) {
                fVar.e(9, this.f298814o);
            }
            if (zArr[10]) {
                fVar.h(10, this.f298815p);
            }
            java.lang.String str3 = this.f298816q;
            if (str3 != null && zArr[11]) {
                fVar.j(11, str3);
            }
            if (zArr[12]) {
                fVar.e(12, this.f298817r);
            }
            java.lang.String str4 = this.f298818s;
            if (str4 != null && zArr[13]) {
                fVar.j(13, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f298806d) : 0;
            java.lang.String str5 = this.f298807e;
            if (str5 != null && zArr[2]) {
                h17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f298808f;
            if (str6 != null && zArr[3]) {
                h17 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f298809g);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f298810h);
            }
            if (zArr[6]) {
                h17 += b36.f.h(6, this.f298811i);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.y yVar2 = this.f298812m;
            if (yVar2 != null && zArr[7]) {
                h17 += b36.f.e(7, yVar2.f298880d);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.w wVar2 = this.f298813n;
            if (wVar2 != null && zArr[8]) {
                h17 += b36.f.e(8, wVar2.f298863d);
            }
            if (zArr[9]) {
                h17 += b36.f.e(9, this.f298814o);
            }
            if (zArr[10]) {
                h17 += b36.f.h(10, this.f298815p);
            }
            java.lang.String str7 = this.f298816q;
            if (str7 != null && zArr[11]) {
                h17 += b36.f.j(11, str7);
            }
            if (zArr[12]) {
                h17 += b36.f.e(12, this.f298817r);
            }
            java.lang.String str8 = this.f298818s;
            return (str8 == null || !zArr[13]) ? h17 : h17 + b36.f.j(13, str8);
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
                this.f298806d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f298807e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f298808f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f298809g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f298810h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f298811i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                int g17 = aVar2.g(intValue);
                this.f298812m = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.y.kTransferModeQuic : com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.y.kTransferModeWSS : com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.y.kTransferModeUnknown;
                zArr[7] = true;
                return 0;
            case 8:
                this.f298813n = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.w.a(aVar2.g(intValue));
                zArr[8] = true;
                return 0;
            case 9:
                this.f298814o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f298815p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f298816q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f298817r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f298818s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.g) super.mo11468x92b714fd(bArr);
    }
}
