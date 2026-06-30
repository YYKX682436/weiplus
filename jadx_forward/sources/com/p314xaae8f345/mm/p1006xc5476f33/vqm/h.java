package com.p314xaae8f345.mm.p1006xc5476f33.vqm;

/* loaded from: classes9.dex */
public class h extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: n, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.vqm.h f258867n = new com.p314xaae8f345.mm.p1006xc5476f33.vqm.h();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.vqm.i f258868d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.vqm.i f258869e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.vqm.i f258870f;

    /* renamed from: g, reason: collision with root package name */
    public long f258871g;

    /* renamed from: h, reason: collision with root package name */
    public int f258872h;

    /* renamed from: i, reason: collision with root package name */
    public int f258873i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f258874m = new boolean[7];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.vqm.h)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.h hVar = (com.p314xaae8f345.mm.p1006xc5476f33.vqm.h) fVar;
        return n51.f.a(this.f258868d, hVar.f258868d) && n51.f.a(this.f258869e, hVar.f258869e) && n51.f.a(this.f258870f, hVar.f258870f) && n51.f.a(java.lang.Long.valueOf(this.f258871g), java.lang.Long.valueOf(hVar.f258871g)) && n51.f.a(java.lang.Integer.valueOf(this.f258872h), java.lang.Integer.valueOf(hVar.f258872h)) && n51.f.a(java.lang.Integer.valueOf(this.f258873i), java.lang.Integer.valueOf(hVar.f258873i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.vqm.h();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f258874m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.i iVar = this.f258868d;
            if (iVar != null && zArr[1]) {
                fVar.e(1, iVar.f258880d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.i iVar2 = this.f258869e;
            if (iVar2 != null && zArr[2]) {
                fVar.e(2, iVar2.f258880d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.i iVar3 = this.f258870f;
            if (iVar3 != null && zArr[3]) {
                fVar.e(3, iVar3.f258880d);
            }
            if (zArr[4]) {
                fVar.h(4, this.f258871g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f258872h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f258873i);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.i iVar4 = this.f258868d;
            if (iVar4 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, iVar4.f258880d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.i iVar5 = this.f258869e;
            if (iVar5 != null && zArr[2]) {
                i18 += b36.f.e(2, iVar5.f258880d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.i iVar6 = this.f258870f;
            if (iVar6 != null && zArr[3]) {
                i18 += b36.f.e(3, iVar6.f258880d);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f258871g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f258872h);
            }
            return zArr[6] ? i18 + b36.f.e(6, this.f258873i) : i18;
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
                this.f258868d = com.p314xaae8f345.mm.p1006xc5476f33.vqm.i.a(aVar2.g(intValue));
                zArr[1] = true;
                return 0;
            case 2:
                this.f258869e = com.p314xaae8f345.mm.p1006xc5476f33.vqm.i.a(aVar2.g(intValue));
                zArr[2] = true;
                return 0;
            case 3:
                this.f258870f = com.p314xaae8f345.mm.p1006xc5476f33.vqm.i.a(aVar2.g(intValue));
                zArr[3] = true;
                return 0;
            case 4:
                this.f258871g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f258872h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f258873i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.vqm.h) super.mo11468x92b714fd(bArr);
    }
}
