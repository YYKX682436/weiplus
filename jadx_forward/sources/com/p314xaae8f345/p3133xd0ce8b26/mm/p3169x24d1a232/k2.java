package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class k2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.k2 f301110m = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.k2();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.i f301111d = new com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.i();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e0 f301112e = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e0();

    /* renamed from: f, reason: collision with root package name */
    public int f301113f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f301114g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f301115h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f301116i = 0;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.k2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.k2 k2Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.k2) fVar;
        return n51.f.a(this.f301111d, k2Var.f301111d) && n51.f.a(this.f301112e, k2Var.f301112e) && n51.f.a(java.lang.Integer.valueOf(this.f301113f), java.lang.Integer.valueOf(k2Var.f301113f)) && n51.f.a(java.lang.Integer.valueOf(this.f301114g), java.lang.Integer.valueOf(k2Var.f301114g)) && n51.f.a(java.lang.Integer.valueOf(this.f301115h), java.lang.Integer.valueOf(k2Var.f301115h)) && n51.f.a(java.lang.Integer.valueOf(this.f301116i), java.lang.Integer.valueOf(k2Var.f301116i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.k2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.i iVar = this.f301111d;
            if (iVar != null) {
                fVar.i(1, iVar.mo75928xcd1e8d8());
                this.f301111d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e0 e0Var = this.f301112e;
            if (e0Var != null) {
                fVar.i(2, e0Var.mo75928xcd1e8d8());
                this.f301112e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f301113f);
            fVar.e(4, this.f301114g);
            fVar.e(5, this.f301115h);
            fVar.e(6, this.f301116i);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.i iVar2 = this.f301111d;
            int i18 = iVar2 != null ? 0 + b36.f.i(1, iVar2.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e0 e0Var2 = this.f301112e;
            if (e0Var2 != null) {
                i18 += b36.f.i(2, e0Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.e(3, this.f301113f) + b36.f.e(4, this.f301114g) + b36.f.e(5, this.f301115h) + b36.f.e(6, this.f301116i);
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.i iVar3 = new com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.i();
                    if (bArr != null && bArr.length > 0) {
                        iVar3.mo11468x92b714fd(bArr);
                    }
                    this.f301111d = iVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e0 e0Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e0();
                    if (bArr2 != null && bArr2.length > 0) {
                        e0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f301112e = e0Var3;
                }
                return 0;
            case 3:
                this.f301113f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f301114g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f301115h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f301116i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.k2) super.mo11468x92b714fd(bArr);
    }
}
