package com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57;

/* loaded from: classes4.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f298261d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f298262e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f298263f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f298264g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f298265h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3164x6bba817.g f298266i;

    /* renamed from: m, reason: collision with root package name */
    public int f298267m;

    /* renamed from: n, reason: collision with root package name */
    public int f298268n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f298269o = new boolean[9];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.a mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.a) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.a)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.a aVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.a) fVar;
        return n51.f.a(this.f298261d, aVar.f298261d) && n51.f.a(this.f298262e, aVar.f298262e) && n51.f.a(this.f298263f, aVar.f298263f) && n51.f.a(java.lang.Boolean.valueOf(this.f298264g), java.lang.Boolean.valueOf(aVar.f298264g)) && n51.f.a(this.f298265h, aVar.f298265h) && n51.f.a(this.f298266i, aVar.f298266i) && n51.f.a(java.lang.Integer.valueOf(this.f298267m), java.lang.Integer.valueOf(aVar.f298267m)) && n51.f.a(java.lang.Integer.valueOf(this.f298268n), java.lang.Integer.valueOf(aVar.f298268n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f298269o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f298261d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f298262e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f298263f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.a(4, this.f298264g);
            }
            java.lang.String str4 = this.f298265h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3164x6bba817.g gVar = this.f298266i;
            if (gVar != null && zArr[6]) {
                fVar.e(6, gVar.f299192d);
            }
            if (zArr[7]) {
                fVar.e(7, this.f298267m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f298268n);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f298261d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f298262e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f298263f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f298264g);
            }
            java.lang.String str8 = this.f298265h;
            if (str8 != null && zArr[5]) {
                i18 += b36.f.j(5, str8);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3164x6bba817.g gVar2 = this.f298266i;
            if (gVar2 != null && zArr[6]) {
                i18 += b36.f.e(6, gVar2.f299192d);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f298267m);
            }
            return zArr[8] ? i18 + b36.f.e(8, this.f298268n) : i18;
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
                this.f298261d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f298262e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f298263f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f298264g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f298265h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                int g17 = aVar2.g(intValue);
                this.f298266i = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? null : com.p314xaae8f345.p3133xd0ce8b26.aff.p3164x6bba817.g.FavNoteFrom_Anno : com.p314xaae8f345.p3133xd0ce8b26.aff.p3164x6bba817.g.FavNoteFrom_Fav : com.p314xaae8f345.p3133xd0ce8b26.aff.p3164x6bba817.g.FavNoteFrom_Chat : com.p314xaae8f345.p3133xd0ce8b26.aff.p3164x6bba817.g.FavNoteFrom_Unknow;
                zArr[6] = true;
                return 0;
            case 7:
                this.f298267m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f298268n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
