package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class o0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f227012d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f227013e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f227014f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f227015g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f227016h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f227017i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f227018m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f227019n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o0 o0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o0) fVar;
        return n51.f.a(this.f227012d, o0Var.f227012d) && n51.f.a(this.f227013e, o0Var.f227013e) && n51.f.a(this.f227014f, o0Var.f227014f) && n51.f.a(this.f227015g, o0Var.f227015g) && n51.f.a(this.f227016h, o0Var.f227016h) && n51.f.a(this.f227017i, o0Var.f227017i) && n51.f.a(this.f227018m, o0Var.f227018m) && n51.f.a(this.f227019n, o0Var.f227019n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f227012d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f227013e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f227014f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f227015g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f227016h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f227017i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f227018m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f227019n;
            if (str8 != null) {
                fVar.j(8, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f227012d;
            int j17 = str9 != null ? 0 + b36.f.j(1, str9) : 0;
            java.lang.String str10 = this.f227013e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f227014f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f227015g;
            if (str12 != null) {
                j17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f227016h;
            if (str13 != null) {
                j17 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f227017i;
            if (str14 != null) {
                j17 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f227018m;
            if (str15 != null) {
                j17 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f227019n;
            return str16 != null ? j17 + b36.f.j(8, str16) : j17;
        }
        if (i17 == 2) {
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o0 o0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                o0Var.f227012d = aVar2.k(intValue);
                return 0;
            case 2:
                o0Var.f227013e = aVar2.k(intValue);
                return 0;
            case 3:
                o0Var.f227014f = aVar2.k(intValue);
                return 0;
            case 4:
                o0Var.f227015g = aVar2.k(intValue);
                return 0;
            case 5:
                o0Var.f227016h = aVar2.k(intValue);
                return 0;
            case 6:
                o0Var.f227017i = aVar2.k(intValue);
                return 0;
            case 7:
                o0Var.f227018m = aVar2.k(intValue);
                return 0;
            case 8:
                o0Var.f227019n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
