package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class k extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f226894d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f226895e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f226896f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k) fVar;
        return n51.f.a(this.f226894d, kVar.f226894d) && n51.f.a(this.f226895e, kVar.f226895e) && n51.f.a(this.f226896f, kVar.f226896f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f226894d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f226895e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f226896f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f226894d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f226895e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f226896f;
            return str6 != null ? j17 + b36.f.j(3, str6) : j17;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            kVar.f226894d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            kVar.f226895e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        kVar.f226896f = aVar2.k(intValue);
        return 0;
    }
}
