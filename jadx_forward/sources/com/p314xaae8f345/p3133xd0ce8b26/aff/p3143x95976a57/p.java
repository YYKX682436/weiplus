package com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57;

/* loaded from: classes11.dex */
public class p extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.p f298381m = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.p();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f298382d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f298383e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f298384f;

    /* renamed from: g, reason: collision with root package name */
    public float f298385g;

    /* renamed from: h, reason: collision with root package name */
    public float f298386h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f298387i = new boolean[6];

    public java.lang.String b() {
        return this.f298387i[1] ? this.f298382d : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.p)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.p pVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.p) fVar;
        return n51.f.a(this.f298382d, pVar.f298382d) && n51.f.a(this.f298383e, pVar.f298383e) && n51.f.a(this.f298384f, pVar.f298384f) && n51.f.a(java.lang.Float.valueOf(this.f298385g), java.lang.Float.valueOf(pVar.f298385g)) && n51.f.a(java.lang.Float.valueOf(this.f298386h), java.lang.Float.valueOf(pVar.f298386h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.p();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f298387i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f298382d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f298383e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f298384f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.d(4, this.f298385g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f298386h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f298382d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f298383e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f298384f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                i18 += b36.f.d(4, this.f298385g);
            }
            return zArr[5] ? i18 + b36.f.d(5, this.f298386h) : i18;
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
            this.f298382d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f298383e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f298384f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f298385g = aVar2.f(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f298386h = aVar2.f(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.p) super.mo11468x92b714fd(bArr);
    }
}
