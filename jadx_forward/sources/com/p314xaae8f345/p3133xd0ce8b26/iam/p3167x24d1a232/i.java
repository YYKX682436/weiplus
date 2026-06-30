package com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232;

/* loaded from: classes2.dex */
public class i extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f299377d = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.n f299378e = new com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.n();

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.i();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.i mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.i) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.i)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.i iVar = (com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.i) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f299377d), java.lang.Integer.valueOf(iVar.f299377d)) && n51.f.a(this.f299378e, iVar.f299378e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.i();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f299377d);
            com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.n nVar = this.f299378e;
            if (nVar != null) {
                fVar.i(2, nVar.mo75928xcd1e8d8());
                this.f299378e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f299377d) + 0;
            com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.n nVar2 = this.f299378e;
            return nVar2 != null ? e17 + b36.f.i(2, nVar2.mo75928xcd1e8d8()) : e17;
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
        if (intValue == 1) {
            this.f299377d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.n nVar3 = new com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.n();
            if (bArr != null && bArr.length > 0) {
                nVar3.mo11468x92b714fd(bArr);
            }
            this.f299378e = nVar3;
        }
        return 0;
    }
}
