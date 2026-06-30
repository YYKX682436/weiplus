package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes11.dex */
public class d2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f299495d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f299496e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f299497f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c2 f299498g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f299499h = new boolean[5];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d2 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d2) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d2 d2Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f299495d), java.lang.Integer.valueOf(d2Var.f299495d)) && n51.f.a(this.f299496e, d2Var.f299496e) && n51.f.a(java.lang.Boolean.valueOf(this.f299497f), java.lang.Boolean.valueOf(d2Var.f299497f)) && n51.f.a(this.f299498g, d2Var.f299498g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f299499h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f299495d);
            }
            java.lang.String str = this.f299496e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.a(3, this.f299497f);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c2 c2Var = this.f299498g;
            if (c2Var != null && zArr[4]) {
                fVar.i(4, c2Var.mo75928xcd1e8d8());
                this.f299498g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f299495d) : 0;
            java.lang.String str2 = this.f299496e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                e17 += b36.f.a(3, this.f299497f);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c2 c2Var2 = this.f299498g;
            return (c2Var2 == null || !zArr[4]) ? e17 : e17 + b36.f.i(4, c2Var2.mo75928xcd1e8d8());
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
            this.f299495d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f299496e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f299497f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c2 c2Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c2();
            if (bArr != null && bArr.length > 0) {
                c2Var3.mo11468x92b714fd(bArr);
            }
            this.f299498g = c2Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
