package com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57;

/* loaded from: classes11.dex */
public class f extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: n, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.f f298291n = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.f();

    /* renamed from: d, reason: collision with root package name */
    public float f298292d;

    /* renamed from: e, reason: collision with root package name */
    public float f298293e;

    /* renamed from: f, reason: collision with root package name */
    public int f298294f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f298295g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f298296h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f298297i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f298298m = new boolean[7];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.f)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.f fVar2 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.f) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f298292d), java.lang.Float.valueOf(fVar2.f298292d)) && n51.f.a(java.lang.Float.valueOf(this.f298293e), java.lang.Float.valueOf(fVar2.f298293e)) && n51.f.a(java.lang.Integer.valueOf(this.f298294f), java.lang.Integer.valueOf(fVar2.f298294f)) && n51.f.a(this.f298295g, fVar2.f298295g) && n51.f.a(this.f298296h, fVar2.f298296h) && n51.f.a(this.f298297i, fVar2.f298297i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.f();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f298298m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f298292d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f298293e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f298294f);
            }
            java.lang.String str = this.f298295g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f298296h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f298297i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f298292d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f298293e);
            }
            if (zArr[3]) {
                d17 += b36.f.e(3, this.f298294f);
            }
            java.lang.String str4 = this.f298295g;
            if (str4 != null && zArr[4]) {
                d17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f298296h;
            if (str5 != null && zArr[5]) {
                d17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f298297i;
            return (str6 == null || !zArr[6]) ? d17 : d17 + b36.f.j(6, str6);
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
                this.f298292d = aVar2.f(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f298293e = aVar2.f(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f298294f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f298295g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f298296h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f298297i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.f) super.mo11468x92b714fd(bArr);
    }
}
