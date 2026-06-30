package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class a1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i4 f300797e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f300796d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f300798f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f300799g = new boolean[4];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.a1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.a1 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.a1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.a1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.a1 a1Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.a1) fVar;
        return n51.f.a(this.f300796d, a1Var.f300796d) && n51.f.a(this.f300797e, a1Var.f300797e) && n51.f.a(this.f300798f, a1Var.f300798f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.a1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f300798f;
        java.util.LinkedList linkedList2 = this.f300796d;
        boolean[] zArr = this.f300799g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i4 i4Var = this.f300797e;
            if (i4Var != null && zArr[2]) {
                fVar.i(2, i4Var.mo75928xcd1e8d8());
                this.f300797e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0;
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i4 i4Var2 = this.f300797e;
            if (i4Var2 != null && zArr[2]) {
                g17 += b36.f.i(2, i4Var2.mo75928xcd1e8d8());
            }
            return g17 + b36.f.g(3, 8, linkedList);
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
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.z0 z0Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.z0();
                if (bArr != null && bArr.length > 0) {
                    z0Var.mo11468x92b714fd(bArr);
                }
                linkedList2.add(z0Var);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i4 i4Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i4();
                if (bArr2 != null && bArr2.length > 0) {
                    i4Var3.mo11468x92b714fd(bArr2);
                }
                this.f300797e = i4Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i4 i4Var4 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i4();
            if (bArr3 != null && bArr3.length > 0) {
                i4Var4.mo11468x92b714fd(bArr3);
            }
            linkedList.add(i4Var4);
        }
        zArr[3] = true;
        return 0;
    }
}
