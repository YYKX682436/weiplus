package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class v2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f301412d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f301413e;

    /* renamed from: f, reason: collision with root package name */
    public int f301414f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f301415g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f301416h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f301417i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f301418m;

    /* renamed from: n, reason: collision with root package name */
    public int f301419n;

    /* renamed from: o, reason: collision with root package name */
    public int f301420o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.t2 f301421p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.u2 f301422q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f301423r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f301424s = new boolean[13];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.v2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.v2 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.v2) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.v2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.v2 v2Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.v2) fVar;
        return n51.f.a(this.f301412d, v2Var.f301412d) && n51.f.a(this.f301413e, v2Var.f301413e) && n51.f.a(java.lang.Integer.valueOf(this.f301414f), java.lang.Integer.valueOf(v2Var.f301414f)) && n51.f.a(this.f301415g, v2Var.f301415g) && n51.f.a(this.f301416h, v2Var.f301416h) && n51.f.a(this.f301417i, v2Var.f301417i) && n51.f.a(this.f301418m, v2Var.f301418m) && n51.f.a(java.lang.Integer.valueOf(this.f301419n), java.lang.Integer.valueOf(v2Var.f301419n)) && n51.f.a(java.lang.Integer.valueOf(this.f301420o), java.lang.Integer.valueOf(v2Var.f301420o)) && n51.f.a(this.f301421p, v2Var.f301421p) && n51.f.a(this.f301422q, v2Var.f301422q) && n51.f.a(this.f301423r, v2Var.f301423r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.v2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f301424s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f301412d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f301413e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f301414f);
            }
            java.lang.String str3 = this.f301415g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f301416h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f301417i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f301418m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            if (zArr[8]) {
                fVar.e(8, this.f301419n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f301420o);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.t2 t2Var = this.f301421p;
            if (t2Var != null && zArr[10]) {
                fVar.i(10, t2Var.mo75928xcd1e8d8());
                this.f301421p.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.u2 u2Var = this.f301422q;
            if (u2Var != null && zArr[11]) {
                fVar.i(11, u2Var.mo75928xcd1e8d8());
                this.f301422q.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str7 = this.f301423r;
            if (str7 == null || !zArr[12]) {
                return 0;
            }
            fVar.j(12, str7);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f301412d;
            int j17 = (str8 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str8);
            java.lang.String str9 = this.f301413e;
            if (str9 != null && zArr[2]) {
                j17 += b36.f.j(2, str9);
            }
            if (zArr[3]) {
                j17 += b36.f.e(3, this.f301414f);
            }
            java.lang.String str10 = this.f301415g;
            if (str10 != null && zArr[4]) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f301416h;
            if (str11 != null && zArr[5]) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f301417i;
            if (str12 != null && zArr[6]) {
                j17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f301418m;
            if (str13 != null && zArr[7]) {
                j17 += b36.f.j(7, str13);
            }
            if (zArr[8]) {
                j17 += b36.f.e(8, this.f301419n);
            }
            if (zArr[9]) {
                j17 += b36.f.e(9, this.f301420o);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.t2 t2Var2 = this.f301421p;
            if (t2Var2 != null && zArr[10]) {
                j17 += b36.f.i(10, t2Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.u2 u2Var2 = this.f301422q;
            if (u2Var2 != null && zArr[11]) {
                j17 += b36.f.i(11, u2Var2.mo75928xcd1e8d8());
            }
            java.lang.String str14 = this.f301423r;
            return (str14 == null || !zArr[12]) ? j17 : j17 + b36.f.j(12, str14);
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
        switch (intValue) {
            case 1:
                this.f301412d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f301413e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f301414f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f301415g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f301416h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f301417i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f301418m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f301419n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f301420o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.t2 t2Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.t2();
                    if (bArr != null && bArr.length > 0) {
                        t2Var3.mo11468x92b714fd(bArr);
                    }
                    this.f301421p = t2Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.u2 u2Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.u2();
                    if (bArr2 != null && bArr2.length > 0) {
                        u2Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f301422q = u2Var3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f301423r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
