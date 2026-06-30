package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class j2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.h f301080d = new com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.h();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f301081e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f301082f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f301083g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f301084h = 0;

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.j2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.j2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.j2 j2Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.j2) fVar;
        return n51.f.a(this.f301080d, j2Var.f301080d) && n51.f.a(this.f301081e, j2Var.f301081e) && n51.f.a(this.f301082f, j2Var.f301082f) && n51.f.a(java.lang.Integer.valueOf(this.f301083g), java.lang.Integer.valueOf(j2Var.f301083g)) && n51.f.a(java.lang.Integer.valueOf(this.f301084h), java.lang.Integer.valueOf(j2Var.f301084h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.j2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.h hVar = this.f301080d;
            if (hVar != null) {
                fVar.i(1, hVar.mo75928xcd1e8d8());
                this.f301080d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f301081e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f301082f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f301083g);
            fVar.e(5, this.f301084h);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.h hVar2 = this.f301080d;
            int i18 = hVar2 != null ? 0 + b36.f.i(1, hVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f301081e;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f301082f;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            return i18 + b36.f.e(4, this.f301083g) + b36.f.e(5, this.f301084h);
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
                com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.h hVar3 = new com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.h();
                if (bArr != null && bArr.length > 0) {
                    hVar3.mo11468x92b714fd(bArr);
                }
                this.f301080d = hVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            this.f301081e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f301082f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f301083g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f301084h = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.j2) super.mo11468x92b714fd(bArr);
    }
}
