package com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f;

/* loaded from: classes2.dex */
public class c1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f297641d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f297642e;

    /* renamed from: f, reason: collision with root package name */
    public int f297643f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f297645h;

    /* renamed from: i, reason: collision with root package name */
    public long f297646i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f297647m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f297648n;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f297650p;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f297644g = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f297649o = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f297651q = new boolean[11];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c1 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c1 c1Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c1) fVar;
        return n51.f.a(this.f297641d, c1Var.f297641d) && n51.f.a(java.lang.Boolean.valueOf(this.f297642e), java.lang.Boolean.valueOf(c1Var.f297642e)) && n51.f.a(java.lang.Integer.valueOf(this.f297643f), java.lang.Integer.valueOf(c1Var.f297643f)) && n51.f.a(this.f297644g, c1Var.f297644g) && n51.f.a(this.f297645h, c1Var.f297645h) && n51.f.a(java.lang.Long.valueOf(this.f297646i), java.lang.Long.valueOf(c1Var.f297646i)) && n51.f.a(java.lang.Boolean.valueOf(this.f297647m), java.lang.Boolean.valueOf(c1Var.f297647m)) && n51.f.a(java.lang.Boolean.valueOf(this.f297648n), java.lang.Boolean.valueOf(c1Var.f297648n)) && n51.f.a(this.f297649o, c1Var.f297649o) && n51.f.a(this.f297650p, c1Var.f297650p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f297649o;
        java.util.LinkedList linkedList2 = this.f297644g;
        boolean[] zArr = this.f297651q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f297641d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.a(2, this.f297642e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f297643f);
            }
            fVar.g(4, 8, linkedList2);
            java.lang.String str2 = this.f297645h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            if (zArr[6]) {
                fVar.h(6, this.f297646i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f297647m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f297648n);
            }
            fVar.g(9, 1, linkedList);
            java.lang.String str3 = this.f297650p;
            if (str3 == null || !zArr[10]) {
                return 0;
            }
            fVar.j(10, str3);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f297641d;
            int j17 = (str4 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str4);
            if (zArr[2]) {
                j17 += b36.f.a(2, this.f297642e);
            }
            if (zArr[3]) {
                j17 += b36.f.e(3, this.f297643f);
            }
            int g17 = j17 + b36.f.g(4, 8, linkedList2);
            java.lang.String str5 = this.f297645h;
            if (str5 != null && zArr[5]) {
                g17 += b36.f.j(5, str5);
            }
            if (zArr[6]) {
                g17 += b36.f.h(6, this.f297646i);
            }
            if (zArr[7]) {
                g17 += b36.f.a(7, this.f297647m);
            }
            if (zArr[8]) {
                g17 += b36.f.a(8, this.f297648n);
            }
            int g18 = g17 + b36.f.g(9, 1, linkedList);
            java.lang.String str6 = this.f297650p;
            return (str6 == null || !zArr[10]) ? g18 : g18 + b36.f.j(10, str6);
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
        switch (intValue) {
            case 1:
                this.f297641d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f297642e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f297643f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.b1 b1Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.b1();
                    if (bArr != null && bArr.length > 0) {
                        b1Var.mo11468x92b714fd(bArr);
                    }
                    linkedList2.add(b1Var);
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f297645h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f297646i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f297647m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f297648n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                linkedList.add(aVar2.k(intValue));
                zArr[9] = true;
                return 0;
            case 10:
                this.f297650p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
