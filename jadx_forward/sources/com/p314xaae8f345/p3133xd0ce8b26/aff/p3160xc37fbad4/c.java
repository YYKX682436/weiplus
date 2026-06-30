package com.p314xaae8f345.p3133xd0ce8b26.aff.p3160xc37fbad4;

/* loaded from: classes8.dex */
public class c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: n, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3160xc37fbad4.c f299021n = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3160xc37fbad4.c();

    /* renamed from: d, reason: collision with root package name */
    public boolean f299022d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f299023e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f299024f;

    /* renamed from: g, reason: collision with root package name */
    public int f299025g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f299026h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f299027i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f299028m = new boolean[7];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3160xc37fbad4.c)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3160xc37fbad4.c cVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3160xc37fbad4.c) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f299022d), java.lang.Boolean.valueOf(cVar.f299022d)) && n51.f.a(this.f299023e, cVar.f299023e) && n51.f.a(this.f299024f, cVar.f299024f) && n51.f.a(java.lang.Integer.valueOf(this.f299025g), java.lang.Integer.valueOf(cVar.f299025g)) && n51.f.a(this.f299026h, cVar.f299026h) && n51.f.a(this.f299027i, cVar.f299027i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3160xc37fbad4.c();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f299028m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f299022d);
            }
            java.lang.String str = this.f299023e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f299024f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f299025g);
            }
            java.lang.String str3 = this.f299026h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f299027i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f299022d) : 0;
            java.lang.String str5 = this.f299023e;
            if (str5 != null && zArr[2]) {
                a17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f299024f;
            if (str6 != null && zArr[3]) {
                a17 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                a17 += b36.f.e(4, this.f299025g);
            }
            java.lang.String str7 = this.f299026h;
            if (str7 != null && zArr[5]) {
                a17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f299027i;
            return (str8 == null || !zArr[6]) ? a17 : a17 + b36.f.j(6, str8);
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
                this.f299022d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f299023e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f299024f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f299025g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f299026h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f299027i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3160xc37fbad4.c) super.mo11468x92b714fd(bArr);
    }
}
