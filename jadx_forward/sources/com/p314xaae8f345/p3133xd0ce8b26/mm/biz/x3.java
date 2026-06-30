package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class x3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f300308d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f300309e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f300310f = 0;

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x3 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x3) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x3)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x3 x3Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x3) fVar;
        return n51.f.a(this.f300308d, x3Var.f300308d) && n51.f.a(this.f300309e, x3Var.f300309e) && n51.f.a(java.lang.Integer.valueOf(this.f300310f), java.lang.Integer.valueOf(x3Var.f300310f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f300308d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f300309e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f300310f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f300308d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f300309e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f300310f);
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
            this.f300308d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f300309e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f300310f = aVar2.g(intValue);
        return 0;
    }
}
