package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes4.dex */
public class j2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: o, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j2 f299751o = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j2();

    /* renamed from: d, reason: collision with root package name */
    public boolean f299752d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f299754f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g2 f299755g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f299756h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f299757i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f299758m;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f299753e = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f299759n = new boolean[8];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j2 j2Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j2) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f299752d), java.lang.Boolean.valueOf(j2Var.f299752d)) && n51.f.a(this.f299753e, j2Var.f299753e) && n51.f.a(this.f299754f, j2Var.f299754f) && n51.f.a(this.f299755g, j2Var.f299755g) && n51.f.a(this.f299756h, j2Var.f299756h) && n51.f.a(this.f299757i, j2Var.f299757i) && n51.f.a(this.f299758m, j2Var.f299758m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f299753e;
        boolean[] zArr = this.f299759n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f299752d);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f299754f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g2 g2Var = this.f299755g;
            if (g2Var != null && zArr[4]) {
                fVar.i(4, g2Var.mo75928xcd1e8d8());
                this.f299755g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f299756h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f299757i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f299758m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = (zArr[1] ? 0 + b36.f.a(1, this.f299752d) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str5 = this.f299754f;
            if (str5 != null && zArr[3]) {
                a17 += b36.f.j(3, str5);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g2 g2Var2 = this.f299755g;
            if (g2Var2 != null && zArr[4]) {
                a17 += b36.f.i(4, g2Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f299756h;
            if (str6 != null && zArr[5]) {
                a17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f299757i;
            if (str7 != null && zArr[6]) {
                a17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f299758m;
            return (str8 == null || !zArr[7]) ? a17 : a17 + b36.f.j(7, str8);
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
                this.f299752d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i2 i2Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i2();
                    if (bArr != null && bArr.length > 0) {
                        i2Var.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(i2Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f299754f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g2 g2Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g2();
                    if (bArr2 != null && bArr2.length > 0) {
                        g2Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f299755g = g2Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f299756h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f299757i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f299758m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j2) super.mo11468x92b714fd(bArr);
    }
}
