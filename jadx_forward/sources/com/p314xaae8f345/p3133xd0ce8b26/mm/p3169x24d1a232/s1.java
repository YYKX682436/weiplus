package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class s1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f301330d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f301331e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f301332f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f301333g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f301334h;

    /* renamed from: i, reason: collision with root package name */
    public int f301335i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f301336m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f301337n;

    /* renamed from: q, reason: collision with root package name */
    public int f301340q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f301341r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.l3 f301342s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f301343t;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f301338o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f301339p = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f301344u = new boolean[16];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.s1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.s1 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.s1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.s1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.s1 s1Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.s1) fVar;
        return n51.f.a(this.f301330d, s1Var.f301330d) && n51.f.a(this.f301331e, s1Var.f301331e) && n51.f.a(this.f301332f, s1Var.f301332f) && n51.f.a(this.f301333g, s1Var.f301333g) && n51.f.a(this.f301334h, s1Var.f301334h) && n51.f.a(java.lang.Integer.valueOf(this.f301335i), java.lang.Integer.valueOf(s1Var.f301335i)) && n51.f.a(this.f301336m, s1Var.f301336m) && n51.f.a(this.f301337n, s1Var.f301337n) && n51.f.a(this.f301338o, s1Var.f301338o) && n51.f.a(this.f301339p, s1Var.f301339p) && n51.f.a(java.lang.Integer.valueOf(this.f301340q), java.lang.Integer.valueOf(s1Var.f301340q)) && n51.f.a(this.f301341r, s1Var.f301341r) && n51.f.a(this.f301342s, s1Var.f301342s) && n51.f.a(java.lang.Boolean.valueOf(this.f301343t), java.lang.Boolean.valueOf(s1Var.f301343t));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.s1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f301339p;
        java.util.LinkedList linkedList2 = this.f301338o;
        int i18 = 0;
        boolean[] zArr = this.f301344u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f301330d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f301331e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f301332f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f301333g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f301334h;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            if (zArr[7]) {
                fVar.e(7, this.f301335i);
            }
            java.lang.String str6 = this.f301336m;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f301337n;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            fVar.g(10, 8, linkedList2);
            fVar.g(11, 1, linkedList);
            if (zArr[12]) {
                fVar.e(12, this.f301340q);
            }
            java.lang.String str8 = this.f301341r;
            if (str8 != null && zArr[13]) {
                fVar.j(13, str8);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.l3 l3Var = this.f301342s;
            if (l3Var != null && zArr[14]) {
                fVar.i(14, l3Var.mo75928xcd1e8d8());
                this.f301342s.mo75956x3d5d1f78(fVar);
            }
            if (zArr[15]) {
                fVar.a(15, this.f301343t);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f301330d;
            if (str9 != null && zArr[1]) {
                i18 = b36.f.j(1, str9) + 0;
            }
            java.lang.String str10 = this.f301331e;
            if (str10 != null && zArr[2]) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f301332f;
            if (str11 != null && zArr[3]) {
                i18 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f301333g;
            if (str12 != null && zArr[4]) {
                i18 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f301334h;
            if (str13 != null && zArr[6]) {
                i18 += b36.f.j(6, str13);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f301335i);
            }
            java.lang.String str14 = this.f301336m;
            if (str14 != null && zArr[8]) {
                i18 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f301337n;
            if (str15 != null && zArr[9]) {
                i18 += b36.f.j(9, str15);
            }
            int g17 = i18 + b36.f.g(10, 8, linkedList2) + b36.f.g(11, 1, linkedList);
            if (zArr[12]) {
                g17 += b36.f.e(12, this.f301340q);
            }
            java.lang.String str16 = this.f301341r;
            if (str16 != null && zArr[13]) {
                g17 += b36.f.j(13, str16);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.l3 l3Var2 = this.f301342s;
            if (l3Var2 != null && zArr[14]) {
                g17 += b36.f.i(14, l3Var2.mo75928xcd1e8d8());
            }
            return zArr[15] ? g17 + b36.f.a(15, this.f301343t) : g17;
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
                this.f301330d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f301331e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f301332f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f301333g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
            default:
                return -1;
            case 6:
                this.f301334h = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f301335i = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f301336m = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f301337n = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.t1 t1Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.t1();
                    if (bArr != null && bArr.length > 0) {
                        t1Var.mo11468x92b714fd(bArr);
                    }
                    linkedList2.add(t1Var);
                }
                zArr[10] = true;
                return 0;
            case 11:
                linkedList.add(aVar2.k(intValue));
                zArr[11] = true;
                return 0;
            case 12:
                this.f301340q = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f301341r = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.l3 l3Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.l3();
                    if (bArr2 != null && bArr2.length > 0) {
                        l3Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f301342s = l3Var3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                this.f301343t = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
        }
    }
}
