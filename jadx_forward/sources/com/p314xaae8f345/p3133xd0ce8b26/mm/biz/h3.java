package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class h3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t f299669d = new com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f299670e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f299671f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f299672g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f299673h = 0;

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h3)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h3 h3Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h3) fVar;
        return n51.f.a(this.f299669d, h3Var.f299669d) && n51.f.a(this.f299670e, h3Var.f299670e) && n51.f.a(this.f299671f, h3Var.f299671f) && n51.f.a(java.lang.Integer.valueOf(this.f299672g), java.lang.Integer.valueOf(h3Var.f299672g)) && n51.f.a(java.lang.Integer.valueOf(this.f299673h), java.lang.Integer.valueOf(h3Var.f299673h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t tVar = this.f299669d;
            if (tVar != null) {
                fVar.i(1, tVar.mo75928xcd1e8d8());
                this.f299669d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f299670e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f299671f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f299672g);
            fVar.e(5, this.f299673h);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t tVar2 = this.f299669d;
            int i18 = tVar2 != null ? 0 + b36.f.i(1, tVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f299670e;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f299671f;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            return i18 + b36.f.e(4, this.f299672g) + b36.f.e(5, this.f299673h);
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
                this.f299669d = tVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            this.f299670e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f299671f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f299672g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f299673h = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h3) super.mo11468x92b714fd(bArr);
    }
}
