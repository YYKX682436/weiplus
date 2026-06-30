package com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd;

/* loaded from: classes11.dex */
public class e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k f300412d = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f300413e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j f300414f = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j();

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.e();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.e)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.e eVar = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.e) fVar;
        return n51.f.a(this.f300412d, eVar.f300412d) && n51.f.a(this.f300413e, eVar.f300413e) && n51.f.a(this.f300414f, eVar.f300414f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.e();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f300413e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k kVar = this.f300412d;
            if (kVar != null) {
                fVar.i(1, kVar.mo75928xcd1e8d8());
                this.f300412d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j jVar = this.f300414f;
            if (jVar != null) {
                fVar.i(3, jVar.mo75928xcd1e8d8());
                this.f300414f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k kVar2 = this.f300412d;
            int i18 = (kVar2 != null ? 0 + b36.f.i(1, kVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j jVar2 = this.f300414f;
            return jVar2 != null ? i18 + b36.f.i(3, jVar2.mo75928xcd1e8d8()) : i18;
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
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k kVar3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k();
                if (bArr != null && bArr.length > 0) {
                    kVar3.mo11468x92b714fd(bArr);
                }
                this.f300412d = kVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c cVar = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c();
                if (bArr2 != null && bArr2.length > 0) {
                    cVar.mo11468x92b714fd(bArr2);
                }
                linkedList.add(cVar);
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
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j jVar3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j();
            if (bArr3 != null && bArr3.length > 0) {
                jVar3.mo11468x92b714fd(bArr3);
            }
            this.f300414f = jVar3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.e) super.mo11468x92b714fd(bArr);
    }
}
