package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes8.dex */
public class i9 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f276559d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f276560e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f276561f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ad4 f276562g;

    /* renamed from: h, reason: collision with root package name */
    public int f276563h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.v8 f276564i;

    /* renamed from: m, reason: collision with root package name */
    public long f276565m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f276566n;

    /* renamed from: o, reason: collision with root package name */
    public int f276567o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f276568p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p2621x8fb0427b.i9)) {
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.i9 i9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.i9) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f276559d), java.lang.Integer.valueOf(i9Var.f276559d)) && n51.f.a(this.f276560e, i9Var.f276560e) && n51.f.a(this.f276561f, i9Var.f276561f) && n51.f.a(this.f276562g, i9Var.f276562g) && n51.f.a(java.lang.Integer.valueOf(this.f276563h), java.lang.Integer.valueOf(i9Var.f276563h)) && n51.f.a(this.f276564i, i9Var.f276564i) && n51.f.a(java.lang.Long.valueOf(this.f276565m), java.lang.Long.valueOf(i9Var.f276565m)) && n51.f.a(this.f276566n, i9Var.f276566n) && n51.f.a(java.lang.Integer.valueOf(this.f276567o), java.lang.Integer.valueOf(i9Var.f276567o)) && n51.f.a(java.lang.Boolean.valueOf(this.f276568p), java.lang.Boolean.valueOf(i9Var.f276568p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f276559d);
            java.lang.String str = this.f276560e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f276561f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.ad4 ad4Var = this.f276562g;
            if (ad4Var != null) {
                fVar.i(4, ad4Var.mo75928xcd1e8d8());
                this.f276562g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f276563h);
            com.p314xaae8f345.mm.p2621x8fb0427b.v8 v8Var = this.f276564i;
            if (v8Var != null) {
                fVar.i(6, v8Var.mo75928xcd1e8d8());
                this.f276564i.mo75956x3d5d1f78(fVar);
            }
            fVar.h(7, this.f276565m);
            java.lang.String str3 = this.f276566n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f276567o);
            fVar.a(10, this.f276568p);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f276559d) + 0;
            java.lang.String str4 = this.f276560e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f276561f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            r45.ad4 ad4Var2 = this.f276562g;
            if (ad4Var2 != null) {
                e17 += b36.f.i(4, ad4Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(5, this.f276563h);
            com.p314xaae8f345.mm.p2621x8fb0427b.v8 v8Var2 = this.f276564i;
            if (v8Var2 != null) {
                e18 += b36.f.i(6, v8Var2.mo75928xcd1e8d8());
            }
            int h17 = e18 + b36.f.h(7, this.f276565m);
            java.lang.String str6 = this.f276566n;
            if (str6 != null) {
                h17 += b36.f.j(8, str6);
            }
            return h17 + b36.f.e(9, this.f276567o) + b36.f.a(10, this.f276568p);
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
        com.p314xaae8f345.mm.p2621x8fb0427b.i9 i9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.i9) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                i9Var.f276559d = aVar2.g(intValue);
                return 0;
            case 2:
                i9Var.f276560e = aVar2.k(intValue);
                return 0;
            case 3:
                i9Var.f276561f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.ad4 ad4Var3 = new r45.ad4();
                    if (bArr != null && bArr.length > 0) {
                        ad4Var3.mo11468x92b714fd(bArr);
                    }
                    i9Var.f276562g = ad4Var3;
                }
                return 0;
            case 5:
                i9Var.f276563h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.p314xaae8f345.mm.p2621x8fb0427b.v8 v8Var3 = new com.p314xaae8f345.mm.p2621x8fb0427b.v8();
                    if (bArr2 != null && bArr2.length > 0) {
                        v8Var3.mo11468x92b714fd(bArr2);
                    }
                    i9Var.f276564i = v8Var3;
                }
                return 0;
            case 7:
                i9Var.f276565m = aVar2.i(intValue);
                return 0;
            case 8:
                i9Var.f276566n = aVar2.k(intValue);
                return 0;
            case 9:
                i9Var.f276567o = aVar2.g(intValue);
                return 0;
            case 10:
                i9Var.f276568p = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
