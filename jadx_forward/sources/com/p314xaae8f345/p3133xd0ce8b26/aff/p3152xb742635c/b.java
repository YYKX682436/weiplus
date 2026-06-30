package com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c;

/* loaded from: classes7.dex */
public class b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.c f298756d;

    /* renamed from: e, reason: collision with root package name */
    public long f298757e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f298758f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.t f298759g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.z f298760h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f298761i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f298762m = new boolean[7];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.b();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.b)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.b bVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.b) fVar;
        return n51.f.a(this.f298756d, bVar.f298756d) && n51.f.a(java.lang.Long.valueOf(this.f298757e), java.lang.Long.valueOf(bVar.f298757e)) && n51.f.a(java.lang.Boolean.valueOf(this.f298758f), java.lang.Boolean.valueOf(bVar.f298758f)) && n51.f.a(this.f298759g, bVar.f298759g) && n51.f.a(this.f298760h, bVar.f298760h) && n51.f.a(java.lang.Boolean.valueOf(this.f298761i), java.lang.Boolean.valueOf(bVar.f298761i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.b();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f298762m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.c cVar = this.f298756d;
            if (cVar != null && zArr[1]) {
                fVar.e(1, cVar.f298786d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f298757e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f298758f);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.t tVar = this.f298759g;
            if (tVar != null && zArr[4]) {
                fVar.i(4, tVar.mo75928xcd1e8d8());
                this.f298759g.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.z zVar = this.f298760h;
            if (zVar != null && zArr[5]) {
                fVar.e(5, zVar.f298886d);
            }
            if (zArr[6]) {
                fVar.a(6, this.f298761i);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.c cVar2 = this.f298756d;
            if (cVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, cVar2.f298786d);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f298757e);
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f298758f);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.t tVar2 = this.f298759g;
            if (tVar2 != null && zArr[4]) {
                i18 += b36.f.i(4, tVar2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.z zVar2 = this.f298760h;
            if (zVar2 != null && zArr[5]) {
                i18 += b36.f.e(5, zVar2.f298886d);
            }
            return zArr[6] ? i18 + b36.f.a(6, this.f298761i) : i18;
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
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.c cVar3 = null;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.z zVar3 = null;
        switch (intValue) {
            case 1:
                int g17 = aVar2.g(intValue);
                if (g17 == 0) {
                    cVar3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.c.kStreamChannelModeDual;
                } else if (g17 == 1) {
                    cVar3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.c.kStreamChannelModeQuic;
                } else if (g17 == 2) {
                    cVar3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.c.kStreamChannelModeWSS;
                }
                this.f298756d = cVar3;
                zArr[1] = true;
                return 0;
            case 2:
                this.f298757e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f298758f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.t tVar3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.t();
                    if (bArr != null && bArr.length > 0) {
                        tVar3.mo11468x92b714fd(bArr);
                    }
                    this.f298759g = tVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                int g18 = aVar2.g(intValue);
                if (g18 == 0) {
                    zVar3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.z.kTransferStrategyDefaultMode;
                } else if (g18 == 1) {
                    zVar3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.z.kTransferStrategySpeedMode;
                } else if (g18 == 2) {
                    zVar3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.z.kTransferStrategyTrafficMode;
                } else if (g18 == 3) {
                    zVar3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.z.kTransferStrategyFullSpeedMode;
                }
                this.f298760h = zVar3;
                zArr[5] = true;
                return 0;
            case 6:
                this.f298761i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.b) super.mo11468x92b714fd(bArr);
    }
}
