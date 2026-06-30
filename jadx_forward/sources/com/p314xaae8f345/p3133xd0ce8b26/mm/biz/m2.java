package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class m2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f299853d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f299854e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f299855f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f299856g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f299857h;

    /* renamed from: i, reason: collision with root package name */
    public int f299858i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f299859m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f299860n;

    /* renamed from: q, reason: collision with root package name */
    public int f299863q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f299864r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t4 f299865s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f299866t;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f299861o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f299862p = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f299867u = new boolean[16];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m2 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m2) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m2 m2Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m2) fVar;
        return n51.f.a(this.f299853d, m2Var.f299853d) && n51.f.a(this.f299854e, m2Var.f299854e) && n51.f.a(this.f299855f, m2Var.f299855f) && n51.f.a(this.f299856g, m2Var.f299856g) && n51.f.a(this.f299857h, m2Var.f299857h) && n51.f.a(java.lang.Integer.valueOf(this.f299858i), java.lang.Integer.valueOf(m2Var.f299858i)) && n51.f.a(this.f299859m, m2Var.f299859m) && n51.f.a(this.f299860n, m2Var.f299860n) && n51.f.a(this.f299861o, m2Var.f299861o) && n51.f.a(this.f299862p, m2Var.f299862p) && n51.f.a(java.lang.Integer.valueOf(this.f299863q), java.lang.Integer.valueOf(m2Var.f299863q)) && n51.f.a(this.f299864r, m2Var.f299864r) && n51.f.a(this.f299865s, m2Var.f299865s) && n51.f.a(java.lang.Boolean.valueOf(this.f299866t), java.lang.Boolean.valueOf(m2Var.f299866t));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f299862p;
        java.util.LinkedList linkedList2 = this.f299861o;
        int i18 = 0;
        boolean[] zArr = this.f299867u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f299853d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f299854e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f299855f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f299856g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f299857h;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            if (zArr[7]) {
                fVar.e(7, this.f299858i);
            }
            java.lang.String str6 = this.f299859m;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f299860n;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            fVar.g(10, 8, linkedList2);
            fVar.g(11, 1, linkedList);
            if (zArr[12]) {
                fVar.e(12, this.f299863q);
            }
            java.lang.String str8 = this.f299864r;
            if (str8 != null && zArr[13]) {
                fVar.j(13, str8);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t4 t4Var = this.f299865s;
            if (t4Var != null && zArr[14]) {
                fVar.i(14, t4Var.mo75928xcd1e8d8());
                this.f299865s.mo75956x3d5d1f78(fVar);
            }
            if (zArr[15]) {
                fVar.a(15, this.f299866t);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f299853d;
            if (str9 != null && zArr[1]) {
                i18 = b36.f.j(1, str9) + 0;
            }
            java.lang.String str10 = this.f299854e;
            if (str10 != null && zArr[2]) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f299855f;
            if (str11 != null && zArr[3]) {
                i18 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f299856g;
            if (str12 != null && zArr[4]) {
                i18 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f299857h;
            if (str13 != null && zArr[6]) {
                i18 += b36.f.j(6, str13);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f299858i);
            }
            java.lang.String str14 = this.f299859m;
            if (str14 != null && zArr[8]) {
                i18 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f299860n;
            if (str15 != null && zArr[9]) {
                i18 += b36.f.j(9, str15);
            }
            int g17 = i18 + b36.f.g(10, 8, linkedList2) + b36.f.g(11, 1, linkedList);
            if (zArr[12]) {
                g17 += b36.f.e(12, this.f299863q);
            }
            java.lang.String str16 = this.f299864r;
            if (str16 != null && zArr[13]) {
                g17 += b36.f.j(13, str16);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t4 t4Var2 = this.f299865s;
            if (t4Var2 != null && zArr[14]) {
                g17 += b36.f.i(14, t4Var2.mo75928xcd1e8d8());
            }
            return zArr[15] ? g17 + b36.f.a(15, this.f299866t) : g17;
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
                this.f299853d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f299854e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f299855f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f299856g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
            default:
                return -1;
            case 6:
                this.f299857h = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f299858i = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f299859m = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f299860n = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p2 p2Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p2();
                    if (bArr != null && bArr.length > 0) {
                        p2Var.mo11468x92b714fd(bArr);
                    }
                    linkedList2.add(p2Var);
                }
                zArr[10] = true;
                return 0;
            case 11:
                linkedList.add(aVar2.k(intValue));
                zArr[11] = true;
                return 0;
            case 12:
                this.f299863q = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f299864r = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t4 t4Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t4();
                    if (bArr2 != null && bArr2.length > 0) {
                        t4Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f299865s = t4Var3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                this.f299866t = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
        }
    }
}
