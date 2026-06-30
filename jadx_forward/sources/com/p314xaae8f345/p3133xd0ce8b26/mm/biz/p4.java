package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class p4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p4 f300003g = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p4();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t f300004d = new com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f300005e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.q4 f300006f = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.q4();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p4)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p4 p4Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p4) fVar;
        return n51.f.a(this.f300004d, p4Var.f300004d) && n51.f.a(this.f300005e, p4Var.f300005e) && n51.f.a(this.f300006f, p4Var.f300006f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t tVar = this.f300004d;
            if (tVar != null) {
                fVar.i(1, tVar.mo75928xcd1e8d8());
                this.f300004d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f300005e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.q4 q4Var = this.f300006f;
            if (q4Var != null) {
                fVar.i(3, q4Var.mo75928xcd1e8d8());
                this.f300006f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t tVar2 = this.f300004d;
            int i18 = tVar2 != null ? 0 + b36.f.i(1, tVar2.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f300005e;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.q4 q4Var2 = this.f300006f;
            return q4Var2 != null ? i18 + b36.f.i(3, q4Var2.mo75928xcd1e8d8()) : i18;
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t tVar3 = new com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t();
                if (bArr != null && bArr.length > 0) {
                    tVar3.mo11468x92b714fd(bArr);
                }
                this.f300004d = tVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            this.f300005e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.q4 q4Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.q4();
            if (bArr2 != null && bArr2.length > 0) {
                q4Var3.mo11468x92b714fd(bArr2);
            }
            this.f300006f = q4Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p4) super.mo11468x92b714fd(bArr);
    }
}
