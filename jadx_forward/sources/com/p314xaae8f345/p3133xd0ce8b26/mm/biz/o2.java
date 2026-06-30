package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class o2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f299948d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f299949e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f299950f;

    /* renamed from: g, reason: collision with root package name */
    public int f299951g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f299952h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f299953i;

    /* renamed from: m, reason: collision with root package name */
    public int f299954m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f299956o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f299957p;

    /* renamed from: q, reason: collision with root package name */
    public int f299958q;

    /* renamed from: r, reason: collision with root package name */
    public int f299959r;

    /* renamed from: s, reason: collision with root package name */
    public int f299960s;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f299955n = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f299961t = new boolean[14];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o2 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o2) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o2 o2Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o2) fVar;
        return n51.f.a(this.f299948d, o2Var.f299948d) && n51.f.a(this.f299949e, o2Var.f299949e) && n51.f.a(this.f299950f, o2Var.f299950f) && n51.f.a(java.lang.Integer.valueOf(this.f299951g), java.lang.Integer.valueOf(o2Var.f299951g)) && n51.f.a(this.f299952h, o2Var.f299952h) && n51.f.a(this.f299953i, o2Var.f299953i) && n51.f.a(java.lang.Integer.valueOf(this.f299954m), java.lang.Integer.valueOf(o2Var.f299954m)) && n51.f.a(this.f299955n, o2Var.f299955n) && n51.f.a(this.f299956o, o2Var.f299956o) && n51.f.a(this.f299957p, o2Var.f299957p) && n51.f.a(java.lang.Integer.valueOf(this.f299958q), java.lang.Integer.valueOf(o2Var.f299958q)) && n51.f.a(java.lang.Integer.valueOf(this.f299959r), java.lang.Integer.valueOf(o2Var.f299959r)) && n51.f.a(java.lang.Integer.valueOf(this.f299960s), java.lang.Integer.valueOf(o2Var.f299960s));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f299955n;
        boolean[] zArr = this.f299961t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f299948d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f299949e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f299950f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f299951g);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f299952h;
            if (gVar != null && zArr[5]) {
                fVar.b(5, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f299953i;
            if (gVar2 != null && zArr[6]) {
                fVar.b(6, gVar2);
            }
            if (zArr[7]) {
                fVar.e(7, this.f299954m);
            }
            fVar.g(8, 8, linkedList);
            java.lang.String str4 = this.f299956o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f299957p;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            if (zArr[11]) {
                fVar.e(11, this.f299958q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f299959r);
            }
            if (!zArr[13]) {
                return 0;
            }
            fVar.e(13, this.f299960s);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f299948d;
            int j17 = (str6 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str6);
            java.lang.String str7 = this.f299949e;
            if (str7 != null && zArr[2]) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f299950f;
            if (str8 != null && zArr[3]) {
                j17 += b36.f.j(3, str8);
            }
            if (zArr[4]) {
                j17 += b36.f.e(4, this.f299951g);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f299952h;
            if (gVar3 != null && zArr[5]) {
                j17 += b36.f.b(5, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f299953i;
            if (gVar4 != null && zArr[6]) {
                j17 += b36.f.b(6, gVar4);
            }
            if (zArr[7]) {
                j17 += b36.f.e(7, this.f299954m);
            }
            int g17 = j17 + b36.f.g(8, 8, linkedList);
            java.lang.String str9 = this.f299956o;
            if (str9 != null && zArr[9]) {
                g17 += b36.f.j(9, str9);
            }
            java.lang.String str10 = this.f299957p;
            if (str10 != null && zArr[10]) {
                g17 += b36.f.j(10, str10);
            }
            if (zArr[11]) {
                g17 += b36.f.e(11, this.f299958q);
            }
            if (zArr[12]) {
                g17 += b36.f.e(12, this.f299959r);
            }
            return zArr[13] ? g17 + b36.f.e(13, this.f299960s) : g17;
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
                this.f299948d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f299949e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f299950f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f299951g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f299952h = aVar2.d(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f299953i = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f299954m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n2 n2Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n2();
                    if (bArr != null && bArr.length > 0) {
                        n2Var.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(n2Var);
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f299956o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f299957p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f299958q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f299959r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f299960s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
