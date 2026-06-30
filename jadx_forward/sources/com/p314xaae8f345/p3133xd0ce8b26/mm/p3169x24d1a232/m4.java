package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class m4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f301183d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f301184e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f301185f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.l4 f301186g;

    /* renamed from: h, reason: collision with root package name */
    public int f301187h;

    /* renamed from: i, reason: collision with root package name */
    public int f301188i;

    /* renamed from: m, reason: collision with root package name */
    public int f301189m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.j4 f301190n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.k4 f301191o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f301192p = new boolean[10];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.m4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.m4 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.m4) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.m4)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.m4 m4Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.m4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f301183d), java.lang.Integer.valueOf(m4Var.f301183d)) && n51.f.a(this.f301184e, m4Var.f301184e) && n51.f.a(this.f301185f, m4Var.f301185f) && n51.f.a(this.f301186g, m4Var.f301186g) && n51.f.a(java.lang.Integer.valueOf(this.f301187h), java.lang.Integer.valueOf(m4Var.f301187h)) && n51.f.a(java.lang.Integer.valueOf(this.f301188i), java.lang.Integer.valueOf(m4Var.f301188i)) && n51.f.a(java.lang.Integer.valueOf(this.f301189m), java.lang.Integer.valueOf(m4Var.f301189m)) && n51.f.a(this.f301190n, m4Var.f301190n) && n51.f.a(this.f301191o, m4Var.f301191o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.m4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f301192p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f301183d);
            }
            java.lang.String str = this.f301184e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f301185f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.l4 l4Var = this.f301186g;
            if (l4Var != null && zArr[4]) {
                fVar.i(4, l4Var.mo75928xcd1e8d8());
                this.f301186g.mo75956x3d5d1f78(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f301187h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f301188i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f301189m);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.j4 j4Var = this.f301190n;
            if (j4Var != null && zArr[8]) {
                fVar.i(8, j4Var.mo75928xcd1e8d8());
                this.f301190n.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.k4 k4Var = this.f301191o;
            if (k4Var != null && zArr[9]) {
                fVar.i(9, k4Var.mo75928xcd1e8d8());
                this.f301191o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f301183d) : 0;
            java.lang.String str3 = this.f301184e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f301185f;
            if (str4 != null && zArr[3]) {
                e17 += b36.f.j(3, str4);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.l4 l4Var2 = this.f301186g;
            if (l4Var2 != null && zArr[4]) {
                e17 += b36.f.i(4, l4Var2.mo75928xcd1e8d8());
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f301187h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f301188i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f301189m);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.j4 j4Var2 = this.f301190n;
            if (j4Var2 != null && zArr[8]) {
                e17 += b36.f.i(8, j4Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.k4 k4Var2 = this.f301191o;
            return (k4Var2 == null || !zArr[9]) ? e17 : e17 + b36.f.i(9, k4Var2.mo75928xcd1e8d8());
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
                this.f301183d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f301184e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f301185f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.l4 l4Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.l4();
                    if (bArr != null && bArr.length > 0) {
                        l4Var3.mo11468x92b714fd(bArr);
                    }
                    this.f301186g = l4Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f301187h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f301188i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f301189m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.j4 j4Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.j4();
                    if (bArr2 != null && bArr2.length > 0) {
                        j4Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f301190n = j4Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.k4 k4Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.k4();
                    if (bArr3 != null && bArr3.length > 0) {
                        k4Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f301191o = k4Var3;
                }
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
