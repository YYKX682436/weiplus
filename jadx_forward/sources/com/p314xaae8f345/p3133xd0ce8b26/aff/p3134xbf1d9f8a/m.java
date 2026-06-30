package com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a;

/* loaded from: classes7.dex */
public class m extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k f297431d = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k f297432e = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f297433f = new java.util.LinkedList();

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m mVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m) fVar;
        return n51.f.a(this.f297431d, mVar.f297431d) && n51.f.a(this.f297432e, mVar.f297432e) && n51.f.a(this.f297433f, mVar.f297433f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f297433f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k kVar = this.f297431d;
            if (kVar != null) {
                fVar.i(1, kVar.mo75928xcd1e8d8());
                this.f297431d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k kVar2 = this.f297432e;
            if (kVar2 != null) {
                fVar.i(2, kVar2.mo75928xcd1e8d8());
                this.f297432e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k kVar3 = this.f297431d;
            int i18 = kVar3 != null ? 0 + b36.f.i(1, kVar3.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k kVar4 = this.f297432e;
            if (kVar4 != null) {
                i18 += b36.f.i(2, kVar4.mo75928xcd1e8d8());
            }
            return i18 + b36.f.g(3, 8, linkedList);
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k kVar5 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k();
                if (bArr != null && bArr.length > 0) {
                    kVar5.mo11468x92b714fd(bArr);
                }
                this.f297431d = kVar5;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k kVar6 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k();
                if (bArr2 != null && bArr2.length > 0) {
                    kVar6.mo11468x92b714fd(bArr2);
                }
                this.f297432e = kVar6;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.l lVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.l();
            if (bArr3 != null && bArr3.length > 0) {
                lVar.mo11468x92b714fd(bArr3);
            }
            linkedList.add(lVar);
        }
        return 0;
    }
}
