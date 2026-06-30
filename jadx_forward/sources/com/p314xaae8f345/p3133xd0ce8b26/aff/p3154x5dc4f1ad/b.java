package com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad;

/* loaded from: classes7.dex */
public class b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.c f298903d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f298905f;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f298904e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f298906g = new boolean[4];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.b();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.b)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.b bVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.b) fVar;
        return n51.f.a(this.f298903d, bVar.f298903d) && n51.f.a(this.f298904e, bVar.f298904e) && n51.f.a(java.lang.Boolean.valueOf(this.f298905f), java.lang.Boolean.valueOf(bVar.f298905f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.b();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f298906g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.c cVar = this.f298903d;
            if (cVar != null && zArr[1]) {
                fVar.i(1, cVar.mo75928xcd1e8d8());
                this.f298903d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, this.f298904e);
            if (zArr[3]) {
                fVar.a(3, this.f298905f);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.c cVar2 = this.f298903d;
            if (cVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, cVar2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(2, 8, this.f298904e);
            return zArr[3] ? g17 + b36.f.a(3, this.f298905f) : g17;
        }
        if (i17 == 2) {
            this.f298904e.clear();
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.c cVar3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.c();
                if (bArr != null && bArr.length > 0) {
                    cVar3.mo11468x92b714fd(bArr);
                }
                this.f298903d = cVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f298905f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.a aVar3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.a();
            if (bArr2 != null && bArr2.length > 0) {
                aVar3.mo11468x92b714fd(bArr2);
            }
            this.f298904e.add(aVar3);
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.b) super.mo11468x92b714fd(bArr);
    }
}
