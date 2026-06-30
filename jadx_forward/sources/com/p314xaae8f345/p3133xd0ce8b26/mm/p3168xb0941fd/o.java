package com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd;

/* loaded from: classes2.dex */
public class o extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f300628d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f300629e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f300630f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f300631g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f300632h;

    /* renamed from: i, reason: collision with root package name */
    public int f300633i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f300634m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f300635n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f300636o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f300637p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public int f300638q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f300639r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c1 f300640s;

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.o();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.o mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.o) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.o)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.o oVar = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.o) fVar;
        return n51.f.a(this.f300628d, oVar.f300628d) && n51.f.a(this.f300629e, oVar.f300629e) && n51.f.a(this.f300630f, oVar.f300630f) && n51.f.a(this.f300631g, oVar.f300631g) && n51.f.a(this.f300632h, oVar.f300632h) && n51.f.a(java.lang.Integer.valueOf(this.f300633i), java.lang.Integer.valueOf(oVar.f300633i)) && n51.f.a(this.f300634m, oVar.f300634m) && n51.f.a(this.f300635n, oVar.f300635n) && n51.f.a(this.f300636o, oVar.f300636o) && n51.f.a(this.f300637p, oVar.f300637p) && n51.f.a(java.lang.Integer.valueOf(this.f300638q), java.lang.Integer.valueOf(oVar.f300638q)) && n51.f.a(this.f300639r, oVar.f300639r) && n51.f.a(this.f300640s, oVar.f300640s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.o();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f300637p;
        java.util.LinkedList linkedList2 = this.f300636o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f300628d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f300629e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f300630f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f300631g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f300632h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f300633i);
            java.lang.String str6 = this.f300634m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f300635n;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            fVar.g(10, 8, linkedList2);
            fVar.g(11, 1, linkedList);
            fVar.e(12, this.f300638q);
            java.lang.String str8 = this.f300639r;
            if (str8 != null) {
                fVar.j(13, str8);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c1 c1Var = this.f300640s;
            if (c1Var != null) {
                fVar.i(14, c1Var.mo75928xcd1e8d8());
                this.f300640s.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f300628d;
            int j17 = str9 != null ? b36.f.j(1, str9) + 0 : 0;
            java.lang.String str10 = this.f300629e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f300630f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f300631g;
            if (str12 != null) {
                j17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f300632h;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            int e17 = j17 + b36.f.e(7, this.f300633i);
            java.lang.String str14 = this.f300634m;
            if (str14 != null) {
                e17 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f300635n;
            if (str15 != null) {
                e17 += b36.f.j(9, str15);
            }
            int g17 = e17 + b36.f.g(10, 8, linkedList2) + b36.f.g(11, 1, linkedList) + b36.f.e(12, this.f300638q);
            java.lang.String str16 = this.f300639r;
            if (str16 != null) {
                g17 += b36.f.j(13, str16);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c1 c1Var2 = this.f300640s;
            return c1Var2 != null ? g17 + b36.f.i(14, c1Var2.mo75928xcd1e8d8()) : g17;
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
                this.f300628d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f300629e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f300630f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f300631g = aVar2.k(intValue);
                return 0;
            case 5:
            default:
                return -1;
            case 6:
                this.f300632h = aVar2.k(intValue);
                return 0;
            case 7:
                this.f300633i = aVar2.g(intValue);
                return 0;
            case 8:
                this.f300634m = aVar2.k(intValue);
                return 0;
            case 9:
                this.f300635n = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.p pVar = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.p();
                    if (bArr != null && bArr.length > 0) {
                        pVar.mo11468x92b714fd(bArr);
                    }
                    linkedList2.add(pVar);
                }
                return 0;
            case 11:
                linkedList.add(aVar2.k(intValue));
                return 0;
            case 12:
                this.f300638q = aVar2.g(intValue);
                return 0;
            case 13:
                this.f300639r = aVar2.k(intValue);
                return 0;
            case 14:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c1 c1Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c1();
                    if (bArr2 != null && bArr2.length > 0) {
                        c1Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f300640s = c1Var3;
                }
                return 0;
        }
    }
}
