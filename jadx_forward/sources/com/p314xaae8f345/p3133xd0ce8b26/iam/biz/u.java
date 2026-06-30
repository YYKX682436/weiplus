package com.p314xaae8f345.p3133xd0ce8b26.iam.biz;

/* loaded from: classes2.dex */
public class u extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f299328d = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.iam.biz.q1 f299329e = new com.p314xaae8f345.p3133xd0ce8b26.iam.biz.q1();

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.iam.biz.u();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.iam.biz.u mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.iam.biz.u) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.iam.biz.u)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.u uVar = (com.p314xaae8f345.p3133xd0ce8b26.iam.biz.u) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f299328d), java.lang.Integer.valueOf(uVar.f299328d)) && n51.f.a(this.f299329e, uVar.f299329e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.iam.biz.u();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f299328d);
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.q1 q1Var = this.f299329e;
            if (q1Var != null) {
                fVar.i(2, q1Var.mo75928xcd1e8d8());
                this.f299329e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f299328d) + 0;
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.q1 q1Var2 = this.f299329e;
            return q1Var2 != null ? e17 + b36.f.i(2, q1Var2.mo75928xcd1e8d8()) : e17;
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
            this.f299328d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.q1 q1Var3 = new com.p314xaae8f345.p3133xd0ce8b26.iam.biz.q1();
            if (bArr != null && bArr.length > 0) {
                q1Var3.mo11468x92b714fd(bArr);
            }
            this.f299329e = q1Var3;
        }
        return 0;
    }
}
