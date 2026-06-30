package com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57;

/* loaded from: classes12.dex */
public class h extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: t, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.h f298310t = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.h();

    /* renamed from: d, reason: collision with root package name */
    public int f298311d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f298312e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f298313f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f298314g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f298315h;

    /* renamed from: i, reason: collision with root package name */
    public int f298316i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f298317m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.g f298318n;

    /* renamed from: o, reason: collision with root package name */
    public int f298319o;

    /* renamed from: p, reason: collision with root package name */
    public int f298320p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f298321q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f298322r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f298323s = new boolean[13];

    public java.lang.String b() {
        return this.f298323s[2] ? this.f298312e : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.h)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.h hVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.h) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f298311d), java.lang.Integer.valueOf(hVar.f298311d)) && n51.f.a(this.f298312e, hVar.f298312e) && n51.f.a(this.f298313f, hVar.f298313f) && n51.f.a(java.lang.Boolean.valueOf(this.f298314g), java.lang.Boolean.valueOf(hVar.f298314g)) && n51.f.a(this.f298315h, hVar.f298315h) && n51.f.a(java.lang.Integer.valueOf(this.f298316i), java.lang.Integer.valueOf(hVar.f298316i)) && n51.f.a(java.lang.Boolean.valueOf(this.f298317m), java.lang.Boolean.valueOf(hVar.f298317m)) && n51.f.a(this.f298318n, hVar.f298318n) && n51.f.a(java.lang.Integer.valueOf(this.f298319o), java.lang.Integer.valueOf(hVar.f298319o)) && n51.f.a(java.lang.Integer.valueOf(this.f298320p), java.lang.Integer.valueOf(hVar.f298320p)) && n51.f.a(this.f298321q, hVar.f298321q) && n51.f.a(this.f298322r, hVar.f298322r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.h();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f298323s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f298311d);
            }
            java.lang.String str = this.f298312e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f298313f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.a(4, this.f298314g);
            }
            java.lang.String str3 = this.f298315h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            if (zArr[6]) {
                fVar.e(6, this.f298316i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f298317m);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.g gVar = this.f298318n;
            if (gVar != null && zArr[8]) {
                fVar.i(8, gVar.mo75928xcd1e8d8());
                this.f298318n.mo75956x3d5d1f78(fVar);
            }
            if (zArr[9]) {
                fVar.e(9, this.f298319o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f298320p);
            }
            java.lang.String str4 = this.f298321q;
            if (str4 != null && zArr[11]) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f298322r;
            if (str5 == null || !zArr[12]) {
                return 0;
            }
            fVar.j(12, str5);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f298311d) : 0;
            java.lang.String str6 = this.f298312e;
            if (str6 != null && zArr[2]) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f298313f;
            if (str7 != null && zArr[3]) {
                e17 += b36.f.j(3, str7);
            }
            if (zArr[4]) {
                e17 += b36.f.a(4, this.f298314g);
            }
            java.lang.String str8 = this.f298315h;
            if (str8 != null && zArr[5]) {
                e17 += b36.f.j(5, str8);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f298316i);
            }
            if (zArr[7]) {
                e17 += b36.f.a(7, this.f298317m);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.g gVar2 = this.f298318n;
            if (gVar2 != null && zArr[8]) {
                e17 += b36.f.i(8, gVar2.mo75928xcd1e8d8());
            }
            if (zArr[9]) {
                e17 += b36.f.e(9, this.f298319o);
            }
            if (zArr[10]) {
                e17 += b36.f.e(10, this.f298320p);
            }
            java.lang.String str9 = this.f298321q;
            if (str9 != null && zArr[11]) {
                e17 += b36.f.j(11, str9);
            }
            java.lang.String str10 = this.f298322r;
            return (str10 == null || !zArr[12]) ? e17 : e17 + b36.f.j(12, str10);
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
                this.f298311d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f298312e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f298313f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f298314g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f298315h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f298316i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f298317m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.g gVar3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.g();
                    if (bArr != null && bArr.length > 0) {
                        gVar3.mo11468x92b714fd(bArr);
                    }
                    this.f298318n = gVar3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f298319o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f298320p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f298321q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f298322r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.h) super.mo11468x92b714fd(bArr);
    }
}
