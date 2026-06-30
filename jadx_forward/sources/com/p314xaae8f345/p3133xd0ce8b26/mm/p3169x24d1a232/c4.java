package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes9.dex */
public class c4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: n, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c4 f300880n = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c4();

    /* renamed from: d, reason: collision with root package name */
    public long f300881d;

    /* renamed from: e, reason: collision with root package name */
    public int f300882e;

    /* renamed from: f, reason: collision with root package name */
    public int f300883f;

    /* renamed from: g, reason: collision with root package name */
    public int f300884g;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.r2 f300886i;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f300885h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f300887m = new boolean[7];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c4)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c4 c4Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f300881d), java.lang.Long.valueOf(c4Var.f300881d)) && n51.f.a(java.lang.Integer.valueOf(this.f300882e), java.lang.Integer.valueOf(c4Var.f300882e)) && n51.f.a(java.lang.Integer.valueOf(this.f300883f), java.lang.Integer.valueOf(c4Var.f300883f)) && n51.f.a(java.lang.Integer.valueOf(this.f300884g), java.lang.Integer.valueOf(c4Var.f300884g)) && n51.f.a(this.f300885h, c4Var.f300885h) && n51.f.a(this.f300886i, c4Var.f300886i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f300885h;
        boolean[] zArr = this.f300887m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f300881d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f300882e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f300883f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f300884g);
            }
            fVar.g(5, 3, linkedList);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.r2 r2Var = this.f300886i;
            if (r2Var != null && zArr[6]) {
                fVar.i(6, r2Var.mo75928xcd1e8d8());
                this.f300886i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f300881d) : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f300882e);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f300883f);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f300884g);
            }
            int g17 = h17 + b36.f.g(5, 3, linkedList);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.r2 r2Var2 = this.f300886i;
            return (r2Var2 == null || !zArr[6]) ? g17 : g17 + b36.f.i(6, r2Var2.mo75928xcd1e8d8());
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
                this.f300881d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f300882e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f300883f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f300884g = aVar2.g(intValue);
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
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.r2 r2Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.r2();
                    if (bArr != null && bArr.length > 0) {
                        r2Var3.mo11468x92b714fd(bArr);
                    }
                    this.f300886i = r2Var3;
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
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c4) super.mo11468x92b714fd(bArr);
    }
}
