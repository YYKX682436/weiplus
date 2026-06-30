package com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f;

/* loaded from: classes4.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f297589d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f297590e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f297591f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f297592g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f297593h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f297594i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f297595m = new boolean[7];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.a mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.a) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.a)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.a aVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.a) fVar;
        return n51.f.a(this.f297589d, aVar.f297589d) && n51.f.a(this.f297590e, aVar.f297590e) && n51.f.a(this.f297591f, aVar.f297591f) && n51.f.a(this.f297592g, aVar.f297592g) && n51.f.a(this.f297593h, aVar.f297593h) && n51.f.a(this.f297594i, aVar.f297594i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f297595m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f297589d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f297590e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f297591f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f297592g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f297593h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f297594i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f297589d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            java.lang.String str8 = this.f297590e;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f297591f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f297592g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f297593h;
            if (str11 != null && zArr[5]) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f297594i;
            return (str12 == null || !zArr[6]) ? i18 : i18 + b36.f.j(6, str12);
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
                this.f297589d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f297590e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f297591f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f297592g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f297593h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f297594i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
