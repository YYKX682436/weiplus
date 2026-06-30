package com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f;

/* loaded from: classes4.dex */
public class u extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.u f298004m = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.u();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f298005d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f298006e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f298008g;

    /* renamed from: h, reason: collision with root package name */
    public int f298009h;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f298007f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f298010i = new boolean[6];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.u)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.u uVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.u) fVar;
        return n51.f.a(this.f298005d, uVar.f298005d) && n51.f.a(this.f298006e, uVar.f298006e) && n51.f.a(this.f298007f, uVar.f298007f) && n51.f.a(this.f298008g, uVar.f298008g) && n51.f.a(java.lang.Integer.valueOf(this.f298009h), java.lang.Integer.valueOf(uVar.f298009h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.u();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f298007f;
        int i18 = 0;
        boolean[] zArr = this.f298010i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f298005d;
            if (gVar != null && zArr[1]) {
                fVar.b(1, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f298006e;
            if (gVar2 != null && zArr[2]) {
                fVar.b(2, gVar2);
            }
            fVar.g(3, 6, linkedList);
            java.lang.String str = this.f298008g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.e(5, this.f298009h);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f298005d;
            if (gVar3 != null && zArr[1]) {
                i18 = 0 + b36.f.b(1, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f298006e;
            if (gVar4 != null && zArr[2]) {
                i18 += b36.f.b(2, gVar4);
            }
            int g17 = i18 + b36.f.g(3, 6, linkedList);
            java.lang.String str2 = this.f298008g;
            if (str2 != null && zArr[4]) {
                g17 += b36.f.j(4, str2);
            }
            return zArr[5] ? g17 + b36.f.e(5, this.f298009h) : g17;
        }
        if (i17 == 2) {
            linkedList.clear();
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
            this.f298005d = aVar2.d(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f298006e = aVar2.d(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            linkedList.add(aVar2.d(intValue));
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f298008g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f298009h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.u) super.mo11468x92b714fd(bArr);
    }
}
