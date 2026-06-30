package com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f;

/* loaded from: classes4.dex */
public class f2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f297736d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f297737e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f297738f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f297739g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f297740h = new boolean[5];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.f2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.f2 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.f2) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.f2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.f2 f2Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.f2) fVar;
        return n51.f.a(this.f297736d, f2Var.f297736d) && n51.f.a(this.f297737e, f2Var.f297737e) && n51.f.a(this.f297738f, f2Var.f297738f) && n51.f.a(this.f297739g, f2Var.f297739g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.f2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f297739g;
        java.util.LinkedList linkedList2 = this.f297738f;
        boolean[] zArr = this.f297740h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f297736d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f297737e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            fVar.g(3, 2, linkedList2);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f297736d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f297737e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            return i18 + b36.f.g(3, 2, linkedList2) + b36.f.g(4, 8, linkedList);
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
            this.f297736d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f297737e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            linkedList2.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
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
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.e2 e2Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.e2();
            if (bArr != null && bArr.length > 0) {
                e2Var.mo11468x92b714fd(bArr);
            }
            linkedList.add(e2Var);
        }
        zArr[4] = true;
        return 0;
    }
}
