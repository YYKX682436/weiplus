package com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f;

/* loaded from: classes2.dex */
public class r1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.r1 f297973m = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.r1();

    /* renamed from: d, reason: collision with root package name */
    public int f297974d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f297975e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f297976f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f297977g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f297978h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f297979i = new boolean[6];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.r1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.r1 r1Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.r1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f297974d), java.lang.Integer.valueOf(r1Var.f297974d)) && n51.f.a(this.f297975e, r1Var.f297975e) && n51.f.a(this.f297976f, r1Var.f297976f) && n51.f.a(this.f297977g, r1Var.f297977g) && n51.f.a(this.f297978h, r1Var.f297978h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.r1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f297978h;
        java.util.LinkedList linkedList2 = this.f297977g;
        java.util.LinkedList linkedList3 = this.f297976f;
        boolean[] zArr = this.f297979i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f297974d);
            }
            java.lang.String str = this.f297975e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList3);
            fVar.g(4, 8, linkedList2);
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f297974d) : 0;
            java.lang.String str2 = this.f297975e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.g(3, 8, linkedList3) + b36.f.g(4, 8, linkedList2) + b36.f.g(5, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList3.clear();
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
            this.f297974d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f297975e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.m1 m1Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.m1();
                if (bArr != null && bArr.length > 0) {
                    m1Var.mo11468x92b714fd(bArr);
                }
                linkedList3.add(m1Var);
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.q1 q1Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.q1();
                if (bArr2 != null && bArr2.length > 0) {
                    q1Var.mo11468x92b714fd(bArr2);
                }
                linkedList2.add(q1Var);
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.q1 q1Var2 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.q1();
            if (bArr3 != null && bArr3.length > 0) {
                q1Var2.mo11468x92b714fd(bArr3);
            }
            linkedList.add(q1Var2);
        }
        zArr[5] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.r1) super.mo11468x92b714fd(bArr);
    }
}
