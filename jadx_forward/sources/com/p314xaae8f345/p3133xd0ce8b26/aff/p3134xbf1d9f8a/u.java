package com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a;

/* loaded from: classes7.dex */
public class u extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u f297520h = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u();

    /* renamed from: d, reason: collision with root package name */
    public int f297521d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f297522e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f297523f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f297524g = "";

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u uVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f297521d), java.lang.Integer.valueOf(uVar.f297521d)) && n51.f.a(this.f297522e, uVar.f297522e) && n51.f.a(this.f297523f, uVar.f297523f) && n51.f.a(this.f297524g, uVar.f297524g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f297521d);
            java.lang.String str = this.f297522e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f297523f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f297524g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f297521d) + 0;
            java.lang.String str4 = this.f297522e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f297523f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f297524g;
            return str6 != null ? e17 + b36.f.j(4, str6) : e17;
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f297521d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f297522e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f297523f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f297524g = aVar2.k(intValue);
        return 0;
    }
}
