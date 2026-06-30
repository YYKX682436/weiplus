package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class e3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f299529d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f299530e = "";

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f299531f = com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f299532g = false;

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e3 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e3) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e3)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e3 e3Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e3) fVar;
        return n51.f.a(this.f299529d, e3Var.f299529d) && n51.f.a(this.f299530e, e3Var.f299530e) && n51.f.a(this.f299531f, e3Var.f299531f) && n51.f.a(java.lang.Boolean.valueOf(this.f299532g), java.lang.Boolean.valueOf(e3Var.f299532g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f299529d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f299530e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f299531f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.a(4, this.f299532g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f299529d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f299530e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f299531f;
            if (gVar2 != null) {
                j17 += b36.f.b(3, gVar2);
            }
            return j17 + b36.f.a(4, this.f299532g);
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
            this.f299529d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f299530e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f299531f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f299532g = aVar2.c(intValue);
        return 0;
    }
}
