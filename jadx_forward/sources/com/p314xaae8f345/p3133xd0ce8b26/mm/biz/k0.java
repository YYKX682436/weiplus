package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class k0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f299769d;

    /* renamed from: e, reason: collision with root package name */
    public long f299770e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f299771f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f299772g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f299773h = new boolean[5];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k0 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k0 k0Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f299769d), java.lang.Long.valueOf(k0Var.f299769d)) && n51.f.a(java.lang.Long.valueOf(this.f299770e), java.lang.Long.valueOf(k0Var.f299770e)) && n51.f.a(this.f299771f, k0Var.f299771f) && n51.f.a(this.f299772g, k0Var.f299772g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f299772g;
        boolean[] zArr = this.f299773h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f299769d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f299770e);
            }
            java.lang.String str = this.f299771f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f299769d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f299770e);
            }
            java.lang.String str2 = this.f299771f;
            if (str2 != null && zArr[3]) {
                h17 += b36.f.j(3, str2);
            }
            return h17 + b36.f.g(4, 8, linkedList);
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
            this.f299769d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f299770e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f299771f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.l0 l0Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.l0();
            if (bArr != null && bArr.length > 0) {
                l0Var.mo11468x92b714fd(bArr);
            }
            linkedList.add(l0Var);
        }
        zArr[4] = true;
        return 0;
    }
}
