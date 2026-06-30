package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5;

/* loaded from: classes8.dex */
public class v extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f239845d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f239846e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239847f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239848g;

    /* renamed from: h, reason: collision with root package name */
    public int f239849h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239850i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.v)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.v vVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.v) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f239845d), java.lang.Integer.valueOf(vVar.f239845d)) && n51.f.a(this.f239846e, vVar.f239846e) && n51.f.a(java.lang.Boolean.valueOf(this.f239847f), java.lang.Boolean.valueOf(vVar.f239847f)) && n51.f.a(java.lang.Boolean.valueOf(this.f239848g), java.lang.Boolean.valueOf(vVar.f239848g)) && n51.f.a(java.lang.Integer.valueOf(this.f239849h), java.lang.Integer.valueOf(vVar.f239849h)) && n51.f.a(java.lang.Boolean.valueOf(this.f239850i), java.lang.Boolean.valueOf(vVar.f239850i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f239845d);
            java.lang.String str = this.f239846e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f239847f);
            fVar.a(4, this.f239848g);
            fVar.e(5, this.f239849h);
            fVar.a(6, this.f239850i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f239845d) + 0;
            java.lang.String str2 = this.f239846e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.a(3, this.f239847f) + b36.f.a(4, this.f239848g) + b36.f.e(5, this.f239849h) + b36.f.a(6, this.f239850i);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.v vVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.v) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vVar.f239845d = aVar2.g(intValue);
                return 0;
            case 2:
                vVar.f239846e = aVar2.k(intValue);
                return 0;
            case 3:
                vVar.f239847f = aVar2.c(intValue);
                return 0;
            case 4:
                vVar.f239848g = aVar2.c(intValue);
                return 0;
            case 5:
                vVar.f239849h = aVar2.g(intValue);
                return 0;
            case 6:
                vVar.f239850i = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
