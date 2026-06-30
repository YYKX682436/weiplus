package com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c;

/* loaded from: classes9.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f298936d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.e f298937e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.c f298938f;

    /* renamed from: g, reason: collision with root package name */
    public long f298939g;

    /* renamed from: h, reason: collision with root package name */
    public long f298940h;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.g f298943n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f298944o;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f298941i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f298942m = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f298945p = new boolean[10];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.a)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.a aVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.a) fVar;
        return n51.f.a(this.f298936d, aVar.f298936d) && n51.f.a(this.f298937e, aVar.f298937e) && n51.f.a(this.f298938f, aVar.f298938f) && n51.f.a(java.lang.Long.valueOf(this.f298939g), java.lang.Long.valueOf(aVar.f298939g)) && n51.f.a(java.lang.Long.valueOf(this.f298940h), java.lang.Long.valueOf(aVar.f298940h)) && n51.f.a(this.f298941i, aVar.f298941i) && n51.f.a(this.f298942m, aVar.f298942m) && n51.f.a(this.f298943n, aVar.f298943n) && n51.f.a(this.f298944o, aVar.f298944o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f298942m;
        java.util.LinkedList linkedList2 = this.f298941i;
        boolean[] zArr = this.f298945p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f298936d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.e eVar = this.f298937e;
            if (eVar != null && zArr[2]) {
                fVar.e(2, eVar.f298966d);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.c cVar = this.f298938f;
            if (cVar != null && zArr[3]) {
                fVar.i(3, cVar.mo75928xcd1e8d8());
                this.f298938f.mo75956x3d5d1f78(fVar);
            }
            if (zArr[4]) {
                fVar.h(4, this.f298939g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f298940h);
            }
            fVar.g(6, 8, linkedList2);
            fVar.g(7, 8, linkedList);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.g gVar = this.f298943n;
            if (gVar != null && zArr[8]) {
                fVar.e(8, gVar.f298975d);
            }
            java.lang.String str2 = this.f298944o;
            if (str2 == null || !zArr[9]) {
                return 0;
            }
            fVar.j(9, str2);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f298936d;
            int j17 = (str3 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str3);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.e eVar2 = this.f298937e;
            if (eVar2 != null && zArr[2]) {
                j17 += b36.f.e(2, eVar2.f298966d);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.c cVar2 = this.f298938f;
            if (cVar2 != null && zArr[3]) {
                j17 += b36.f.i(3, cVar2.mo75928xcd1e8d8());
            }
            if (zArr[4]) {
                j17 += b36.f.h(4, this.f298939g);
            }
            if (zArr[5]) {
                j17 += b36.f.h(5, this.f298940h);
            }
            int g17 = j17 + b36.f.g(6, 8, linkedList2) + b36.f.g(7, 8, linkedList);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.g gVar2 = this.f298943n;
            if (gVar2 != null && zArr[8]) {
                g17 += b36.f.e(8, gVar2.f298975d);
            }
            java.lang.String str4 = this.f298944o;
            return (str4 == null || !zArr[9]) ? g17 : g17 + b36.f.j(9, str4);
        }
        if (i17 == 2) {
            linkedList2.clear();
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
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.e eVar3 = null;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.g gVar3 = null;
        switch (intValue) {
            case 1:
                this.f298936d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                int g18 = aVar2.g(intValue);
                if (g18 == 0) {
                    eVar3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.e.kSpanKindClient;
                } else if (g18 == 1) {
                    eVar3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.e.kSpanKindServer;
                } else if (g18 == 2) {
                    eVar3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.e.kSpanKindProducer;
                } else if (g18 == 3) {
                    eVar3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.e.kSpanKindConsumer;
                } else if (g18 == 4) {
                    eVar3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.e.kSpanKindInternal;
                }
                this.f298937e = eVar3;
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.c cVar3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.c();
                    if (bArr != null && bArr.length > 0) {
                        cVar3.mo11468x92b714fd(bArr);
                    }
                    this.f298938f = cVar3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f298939g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f298940h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.b bVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.b();
                    if (bArr2 != null && bArr2.length > 0) {
                        bVar.mo11468x92b714fd(bArr2);
                    }
                    linkedList2.add(bVar);
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.d dVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.d();
                    if (bArr3 != null && bArr3.length > 0) {
                        dVar.mo11468x92b714fd(bArr3);
                    }
                    linkedList.add(dVar);
                }
                zArr[7] = true;
                return 0;
            case 8:
                int g19 = aVar2.g(intValue);
                if (g19 == 0) {
                    gVar3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.g.kStatusUnset;
                } else if (g19 == 1) {
                    gVar3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.g.kStatusOk;
                } else if (g19 == 2) {
                    gVar3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.g.kStatusError;
                }
                this.f298943n = gVar3;
                zArr[8] = true;
                return 0;
            case 9:
                this.f298944o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.a) super.mo11468x92b714fd(bArr);
    }
}
