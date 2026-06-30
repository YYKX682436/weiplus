package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes9.dex */
public class w3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f300285d = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.y3 f300286e = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.y3();

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v3 f300287f = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v3();

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u3 f300288g = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u3();

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s3 f300289h = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s3();

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w3 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w3) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w3)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w3 w3Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f300285d), java.lang.Integer.valueOf(w3Var.f300285d)) && n51.f.a(this.f300286e, w3Var.f300286e) && n51.f.a(this.f300287f, w3Var.f300287f) && n51.f.a(this.f300288g, w3Var.f300288g) && n51.f.a(this.f300289h, w3Var.f300289h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f300285d);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.y3 y3Var = this.f300286e;
            if (y3Var != null) {
                fVar.i(2, y3Var.mo75928xcd1e8d8());
                this.f300286e.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v3 v3Var = this.f300287f;
            if (v3Var != null) {
                fVar.i(3, v3Var.mo75928xcd1e8d8());
                this.f300287f.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u3 u3Var = this.f300288g;
            if (u3Var != null) {
                fVar.i(4, u3Var.mo75928xcd1e8d8());
                this.f300288g.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s3 s3Var = this.f300289h;
            if (s3Var != null) {
                fVar.i(5, s3Var.mo75928xcd1e8d8());
                this.f300289h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f300285d) + 0;
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.y3 y3Var2 = this.f300286e;
            if (y3Var2 != null) {
                e17 += b36.f.i(2, y3Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v3 v3Var2 = this.f300287f;
            if (v3Var2 != null) {
                e17 += b36.f.i(3, v3Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u3 u3Var2 = this.f300288g;
            if (u3Var2 != null) {
                e17 += b36.f.i(4, u3Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s3 s3Var2 = this.f300289h;
            return s3Var2 != null ? e17 + b36.f.i(5, s3Var2.mo75928xcd1e8d8()) : e17;
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
            this.f300285d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.y3 y3Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.y3();
                if (bArr != null && bArr.length > 0) {
                    y3Var3.mo11468x92b714fd(bArr);
                }
                this.f300286e = y3Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v3 v3Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.v3();
                if (bArr2 != null && bArr2.length > 0) {
                    v3Var3.mo11468x92b714fd(bArr2);
                }
                this.f300287f = v3Var3;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr3 = (byte[]) j19.get(i27);
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u3 u3Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.u3();
                if (bArr3 != null && bArr3.length > 0) {
                    u3Var3.mo11468x92b714fd(bArr3);
                }
                this.f300288g = u3Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i28 = 0; i28 < size4; i28++) {
            byte[] bArr4 = (byte[]) j27.get(i28);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s3 s3Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s3();
            if (bArr4 != null && bArr4.length > 0) {
                s3Var3.mo11468x92b714fd(bArr4);
            }
            this.f300289h = s3Var3;
        }
        return 0;
    }
}
