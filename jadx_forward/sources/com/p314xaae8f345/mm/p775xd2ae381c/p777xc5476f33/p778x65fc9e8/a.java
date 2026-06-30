package com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8;

/* loaded from: classes10.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f149458d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f149459e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f149460f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f149461g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.a)) {
            return false;
        }
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.a aVar = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.a) fVar;
        return n51.f.a(this.f149458d, aVar.f149458d) && n51.f.a(this.f149459e, aVar.f149459e) && n51.f.a(this.f149460f, aVar.f149460f) && n51.f.a(this.f149461g, aVar.f149461g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f149458d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f149459e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f149460f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f149461g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f149458d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f149459e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f149460f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f149461g;
            return str8 != null ? j17 + b36.f.j(4, str8) : j17;
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
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.a aVar3 = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            aVar3.f149458d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            aVar3.f149459e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            aVar3.f149460f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        aVar3.f149461g = aVar2.k(intValue);
        return 0;
    }
}
