package com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8;

/* loaded from: classes10.dex */
public class c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f149480d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f149481e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f149482f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f149483g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f149484h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f149485i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.c)) {
            return false;
        }
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.c cVar = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.c) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f149480d), java.lang.Integer.valueOf(cVar.f149480d)) && n51.f.a(this.f149481e, cVar.f149481e) && n51.f.a(this.f149482f, cVar.f149482f) && n51.f.a(this.f149483g, cVar.f149483g) && n51.f.a(this.f149484h, cVar.f149484h) && n51.f.a(this.f149485i, cVar.f149485i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f149480d);
            java.lang.String str = this.f149481e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f149482f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f149483g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f149484h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f149485i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f149480d) + 0;
            java.lang.String str6 = this.f149481e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f149482f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f149483g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f149484h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f149485i;
            return str10 != null ? e17 + b36.f.j(6, str10) : e17;
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
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.c cVar = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cVar.f149480d = aVar2.g(intValue);
                return 0;
            case 2:
                cVar.f149481e = aVar2.k(intValue);
                return 0;
            case 3:
                cVar.f149482f = aVar2.k(intValue);
                return 0;
            case 4:
                cVar.f149483g = aVar2.k(intValue);
                return 0;
            case 5:
                cVar.f149484h = aVar2.k(intValue);
                return 0;
            case 6:
                cVar.f149485i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
