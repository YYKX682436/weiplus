package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class z1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f301548d;

    /* renamed from: e, reason: collision with root package name */
    public int f301549e;

    /* renamed from: f, reason: collision with root package name */
    public int f301550f;

    /* renamed from: h, reason: collision with root package name */
    public int f301552h;

    /* renamed from: i, reason: collision with root package name */
    public int f301553i;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f301551g = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f301554m = new boolean[7];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.z1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.z1 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.z1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.z1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.z1 z1Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.z1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f301548d), java.lang.Integer.valueOf(z1Var.f301548d)) && n51.f.a(java.lang.Integer.valueOf(this.f301549e), java.lang.Integer.valueOf(z1Var.f301549e)) && n51.f.a(java.lang.Integer.valueOf(this.f301550f), java.lang.Integer.valueOf(z1Var.f301550f)) && n51.f.a(this.f301551g, z1Var.f301551g) && n51.f.a(java.lang.Integer.valueOf(this.f301552h), java.lang.Integer.valueOf(z1Var.f301552h)) && n51.f.a(java.lang.Integer.valueOf(this.f301553i), java.lang.Integer.valueOf(z1Var.f301553i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.z1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f301551g;
        boolean[] zArr = this.f301554m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f301548d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f301549e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f301550f);
            }
            fVar.g(4, 8, linkedList);
            if (zArr[5]) {
                fVar.e(5, this.f301552h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f301553i);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f301548d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f301549e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f301550f);
            }
            int g17 = e17 + b36.f.g(4, 8, linkedList);
            if (zArr[5]) {
                g17 += b36.f.e(5, this.f301552h);
            }
            return zArr[6] ? g17 + b36.f.e(6, this.f301553i) : g17;
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
                this.f301548d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f301549e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f301550f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.a2 a2Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.a2();
                    if (bArr != null && bArr.length > 0) {
                        a2Var.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(a2Var);
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f301552h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f301553i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
