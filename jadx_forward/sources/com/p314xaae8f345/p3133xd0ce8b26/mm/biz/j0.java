package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class j0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j0 f299741m = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j0();

    /* renamed from: d, reason: collision with root package name */
    public int f299742d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f299743e;

    /* renamed from: f, reason: collision with root package name */
    public long f299744f;

    /* renamed from: g, reason: collision with root package name */
    public long f299745g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f299746h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f299747i = new boolean[6];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j0 j0Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f299742d), java.lang.Integer.valueOf(j0Var.f299742d)) && n51.f.a(this.f299743e, j0Var.f299743e) && n51.f.a(java.lang.Long.valueOf(this.f299744f), java.lang.Long.valueOf(j0Var.f299744f)) && n51.f.a(java.lang.Long.valueOf(this.f299745g), java.lang.Long.valueOf(j0Var.f299745g)) && n51.f.a(this.f299746h, j0Var.f299746h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f299746h;
        boolean[] zArr = this.f299747i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f299742d);
            }
            java.lang.String str = this.f299743e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f299744f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f299745g);
            }
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f299742d) : 0;
            java.lang.String str2 = this.f299743e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                e17 += b36.f.h(3, this.f299744f);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f299745g);
            }
            return e17 + b36.f.g(5, 8, linkedList);
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
            this.f299742d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f299743e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f299744f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f299745g = aVar2.i(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k0 k0Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k0();
            if (bArr != null && bArr.length > 0) {
                k0Var.mo11468x92b714fd(bArr);
            }
            linkedList.add(k0Var);
        }
        zArr[5] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j0) super.mo11468x92b714fd(bArr);
    }
}
