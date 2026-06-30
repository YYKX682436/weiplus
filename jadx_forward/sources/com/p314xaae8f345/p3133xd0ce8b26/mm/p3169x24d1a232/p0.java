package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class p0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public int f301240e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f301241f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f301239d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f301242g = new boolean[4];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.p0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.p0 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.p0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.p0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.p0 p0Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.p0) fVar;
        return n51.f.a(this.f301239d, p0Var.f301239d) && n51.f.a(java.lang.Integer.valueOf(this.f301240e), java.lang.Integer.valueOf(p0Var.f301240e)) && n51.f.a(this.f301241f, p0Var.f301241f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.p0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f301239d;
        boolean[] zArr = this.f301242g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            if (zArr[2]) {
                fVar.e(2, this.f301240e);
            }
            java.lang.String str = this.f301241f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            if (zArr[2]) {
                g17 += b36.f.e(2, this.f301240e);
            }
            java.lang.String str2 = this.f301241f;
            return (str2 == null || !zArr[3]) ? g17 : g17 + b36.f.j(3, str2);
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f301240e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f301241f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.o0 o0Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.o0();
            if (bArr != null && bArr.length > 0) {
                o0Var.mo11468x92b714fd(bArr);
            }
            linkedList.add(o0Var);
        }
        zArr[1] = true;
        return 0;
    }
}
