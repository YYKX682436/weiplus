package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class u3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f300215d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f300216e = "";

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t3 f300217f = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t3();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f300218g = "";

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u3 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u3) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u3)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u3 u3Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u3) fVar;
        return n51.f.a(this.f300215d, u3Var.f300215d) && n51.f.a(this.f300216e, u3Var.f300216e) && n51.f.a(this.f300217f, u3Var.f300217f) && n51.f.a(this.f300218g, u3Var.f300218g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f300215d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f300216e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t3 t3Var = this.f300217f;
            if (t3Var != null) {
                fVar.i(3, t3Var.mo75928xcd1e8d8());
                this.f300217f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f300218g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f300215d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f300216e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t3 t3Var2 = this.f300217f;
            if (t3Var2 != null) {
                j17 += b36.f.i(3, t3Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f300218g;
            return str6 != null ? j17 + b36.f.j(4, str6) : j17;
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
            this.f300215d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f300216e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f300218g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t3 t3Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t3();
            if (bArr != null && bArr.length > 0) {
                t3Var3.mo11468x92b714fd(bArr);
            }
            this.f300217f = t3Var3;
        }
        return 0;
    }
}
