package com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57;

/* loaded from: classes8.dex */
public class l extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f298360d;

    /* renamed from: e, reason: collision with root package name */
    public long f298361e;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.k f298363g;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f298362f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f298364h = new boolean[5];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.l();
    }

    public java.lang.String b() {
        return this.f298364h[1] ? this.f298360d : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.l mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.l) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.l)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.l lVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.l) fVar;
        return n51.f.a(this.f298360d, lVar.f298360d) && n51.f.a(java.lang.Long.valueOf(this.f298361e), java.lang.Long.valueOf(lVar.f298361e)) && n51.f.a(this.f298362f, lVar.f298362f) && n51.f.a(this.f298363g, lVar.f298363g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.l();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f298362f;
        boolean[] zArr = this.f298364h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f298360d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f298361e);
            }
            fVar.g(3, 2, linkedList);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.k kVar = this.f298363g;
            if (kVar != null && zArr[4]) {
                fVar.i(4, kVar.mo75928xcd1e8d8());
                this.f298363g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f298360d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f298361e);
            }
            int g17 = i18 + b36.f.g(3, 2, linkedList);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.k kVar2 = this.f298363g;
            return (kVar2 == null || !zArr[4]) ? g17 : g17 + b36.f.i(4, kVar2.mo75928xcd1e8d8());
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
            this.f298360d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f298361e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.k kVar3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.k();
            if (bArr != null && bArr.length > 0) {
                kVar3.mo11468x92b714fd(bArr);
            }
            this.f298363g = kVar3;
        }
        zArr[4] = true;
        return 0;
    }
}
