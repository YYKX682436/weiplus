package com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd;

/* loaded from: classes2.dex */
public class p0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f300674d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f300675e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f300676f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f300677g;

    /* renamed from: h, reason: collision with root package name */
    public int f300678h;

    /* renamed from: i, reason: collision with root package name */
    public int f300679i;

    /* renamed from: m, reason: collision with root package name */
    public int f300680m;

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.p0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.p0 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.p0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.p0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.p0 p0Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.p0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f300674d), java.lang.Integer.valueOf(p0Var.f300674d)) && n51.f.a(this.f300675e, p0Var.f300675e) && n51.f.a(this.f300676f, p0Var.f300676f) && n51.f.a(this.f300677g, p0Var.f300677g) && n51.f.a(java.lang.Integer.valueOf(this.f300678h), java.lang.Integer.valueOf(p0Var.f300678h)) && n51.f.a(java.lang.Integer.valueOf(this.f300679i), java.lang.Integer.valueOf(p0Var.f300679i)) && n51.f.a(java.lang.Integer.valueOf(this.f300680m), java.lang.Integer.valueOf(p0Var.f300680m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.p0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f300674d);
            java.lang.String str = this.f300675e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f300676f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f300677g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f300678h);
            fVar.e(6, this.f300679i);
            fVar.e(7, this.f300680m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f300674d) + 0;
            java.lang.String str4 = this.f300675e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f300676f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f300677g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            return e17 + b36.f.e(5, this.f300678h) + b36.f.e(6, this.f300679i) + b36.f.e(7, this.f300680m);
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
                this.f300674d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f300675e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f300676f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f300677g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f300678h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f300679i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f300680m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
