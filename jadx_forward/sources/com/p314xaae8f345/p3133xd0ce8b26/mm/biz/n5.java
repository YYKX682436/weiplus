package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes9.dex */
public class n5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: n, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n5 f299919n = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n5();

    /* renamed from: d, reason: collision with root package name */
    public long f299920d;

    /* renamed from: e, reason: collision with root package name */
    public int f299921e;

    /* renamed from: f, reason: collision with root package name */
    public int f299922f;

    /* renamed from: g, reason: collision with root package name */
    public int f299923g;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p3 f299925i;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f299924h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f299926m = new boolean[7];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n5)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n5 n5Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n5) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f299920d), java.lang.Long.valueOf(n5Var.f299920d)) && n51.f.a(java.lang.Integer.valueOf(this.f299921e), java.lang.Integer.valueOf(n5Var.f299921e)) && n51.f.a(java.lang.Integer.valueOf(this.f299922f), java.lang.Integer.valueOf(n5Var.f299922f)) && n51.f.a(java.lang.Integer.valueOf(this.f299923g), java.lang.Integer.valueOf(n5Var.f299923g)) && n51.f.a(this.f299924h, n5Var.f299924h) && n51.f.a(this.f299925i, n5Var.f299925i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f299924h;
        boolean[] zArr = this.f299926m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f299920d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f299921e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f299922f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f299923g);
            }
            fVar.g(5, 3, linkedList);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p3 p3Var = this.f299925i;
            if (p3Var != null && zArr[6]) {
                fVar.i(6, p3Var.mo75928xcd1e8d8());
                this.f299925i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f299920d) : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f299921e);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f299922f);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f299923g);
            }
            int g17 = h17 + b36.f.g(5, 3, linkedList);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p3 p3Var2 = this.f299925i;
            return (p3Var2 == null || !zArr[6]) ? g17 : g17 + b36.f.i(6, p3Var2.mo75928xcd1e8d8());
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
        switch (intValue) {
            case 1:
                this.f299920d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f299921e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f299922f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f299923g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                linkedList.add(java.lang.Long.valueOf(aVar2.i(intValue)));
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p3 p3Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p3();
                    if (bArr != null && bArr.length > 0) {
                        p3Var3.mo11468x92b714fd(bArr);
                    }
                    this.f299925i = p3Var3;
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n5) super.mo11468x92b714fd(bArr);
    }
}
