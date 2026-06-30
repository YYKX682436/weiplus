package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class w0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public int f301430e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f301431f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.k1 f301432g;

    /* renamed from: i, reason: collision with root package name */
    public int f301434i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f301429d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f301433h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f301435m = new boolean[8];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.w0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.w0 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.w0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.w0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.w0 w0Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.w0) fVar;
        return n51.f.a(this.f301429d, w0Var.f301429d) && n51.f.a(java.lang.Integer.valueOf(this.f301430e), java.lang.Integer.valueOf(w0Var.f301430e)) && n51.f.a(this.f301431f, w0Var.f301431f) && n51.f.a(this.f301432g, w0Var.f301432g) && n51.f.a(this.f301433h, w0Var.f301433h) && n51.f.a(java.lang.Integer.valueOf(this.f301434i), java.lang.Integer.valueOf(w0Var.f301434i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.w0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f301433h;
        java.util.LinkedList linkedList2 = this.f301429d;
        boolean[] zArr = this.f301435m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            if (zArr[3]) {
                fVar.e(3, this.f301430e);
            }
            java.lang.String str = this.f301431f;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.k1 k1Var = this.f301432g;
            if (k1Var != null && zArr[5]) {
                fVar.i(5, k1Var.mo75928xcd1e8d8());
                this.f301432g.mo75956x3d5d1f78(fVar);
            }
            fVar.g(6, 8, linkedList);
            if (zArr[7]) {
                fVar.e(7, this.f301434i);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0;
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f301430e);
            }
            java.lang.String str2 = this.f301431f;
            if (str2 != null && zArr[4]) {
                g17 += b36.f.j(4, str2);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.k1 k1Var2 = this.f301432g;
            if (k1Var2 != null && zArr[5]) {
                g17 += b36.f.i(5, k1Var2.mo75928xcd1e8d8());
            }
            int g18 = g17 + b36.f.g(6, 8, linkedList);
            return zArr[7] ? g18 + b36.f.e(7, this.f301434i) : g18;
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
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.v0 v0Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.v0();
                if (bArr != null && bArr.length > 0) {
                    v0Var.mo11468x92b714fd(bArr);
                }
                linkedList2.add(v0Var);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f301430e = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f301431f = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue == 5) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.k1 k1Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.k1();
                if (bArr2 != null && bArr2.length > 0) {
                    k1Var3.mo11468x92b714fd(bArr2);
                }
                this.f301432g = k1Var3;
            }
            zArr[5] = true;
            return 0;
        }
        if (intValue != 6) {
            if (intValue != 7) {
                return -1;
            }
            this.f301434i = aVar2.g(intValue);
            zArr[7] = true;
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.v0 v0Var2 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.v0();
            if (bArr3 != null && bArr3.length > 0) {
                v0Var2.mo11468x92b714fd(bArr3);
            }
            linkedList.add(v0Var2);
        }
        zArr[6] = true;
        return 0;
    }
}
