package com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c;

/* loaded from: classes12.dex */
public class d extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f298787d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.w f298788e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f298789f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f298790g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.e f298791h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f298792i = new boolean[6];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.d();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.d)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.d dVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.d) fVar;
        return n51.f.a(this.f298787d, dVar.f298787d) && n51.f.a(this.f298788e, dVar.f298788e) && n51.f.a(this.f298789f, dVar.f298789f) && n51.f.a(this.f298790g, dVar.f298790g) && n51.f.a(this.f298791h, dVar.f298791h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.d();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f298792i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f298787d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.w wVar = this.f298788e;
            if (wVar != null && zArr[2]) {
                fVar.e(2, wVar.f298863d);
            }
            java.lang.String str2 = this.f298789f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f298790g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.e eVar = this.f298791h;
            if (eVar != null && zArr[5]) {
                fVar.e(5, eVar.f298798d);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f298787d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.w wVar2 = this.f298788e;
            if (wVar2 != null && zArr[2]) {
                i18 += b36.f.e(2, wVar2.f298863d);
            }
            java.lang.String str5 = this.f298789f;
            if (str5 != null && zArr[3]) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f298790g;
            if (str6 != null && zArr[4]) {
                i18 += b36.f.j(4, str6);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.e eVar2 = this.f298791h;
            return (eVar2 == null || !zArr[5]) ? i18 : i18 + b36.f.e(5, eVar2.f298798d);
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
        if (intValue == 1) {
            this.f298787d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f298788e = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.w.a(aVar2.g(intValue));
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f298789f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f298790g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        int g17 = aVar2.g(intValue);
        this.f298791h = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? null : com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.e.kDebugEnvSG995 : com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.e.kDebugEnvShenzhen995 : com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.e.kDebugEnvShanghai995 : com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.e.kDebugEnvNone;
        zArr[5] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.d) super.mo11468x92b714fd(bArr);
    }
}
