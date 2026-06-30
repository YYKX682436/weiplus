package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes11.dex */
public class e2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f299524d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f299525e;

    /* renamed from: f, reason: collision with root package name */
    public int f299526f;

    /* renamed from: g, reason: collision with root package name */
    public int f299527g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f299528h = new boolean[5];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e2 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e2) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e2 e2Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e2) fVar;
        return n51.f.a(this.f299524d, e2Var.f299524d) && n51.f.a(this.f299525e, e2Var.f299525e) && n51.f.a(java.lang.Integer.valueOf(this.f299526f), java.lang.Integer.valueOf(e2Var.f299526f)) && n51.f.a(java.lang.Integer.valueOf(this.f299527g), java.lang.Integer.valueOf(e2Var.f299527g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f299528h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f299524d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f299525e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f299526f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f299527g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f299524d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f299525e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f299526f);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f299527g) : i18;
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
            this.f299524d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f299525e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f299526f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f299527g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }
}
