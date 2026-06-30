package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class z3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.w3 f301558d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.x3 f301559e;

    /* renamed from: f, reason: collision with root package name */
    public int f301560f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f301561g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.y3 f301562h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f301563i = new boolean[6];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.z3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.z3 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.z3) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.z3)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.z3 z3Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.z3) fVar;
        return n51.f.a(this.f301558d, z3Var.f301558d) && n51.f.a(this.f301559e, z3Var.f301559e) && n51.f.a(java.lang.Integer.valueOf(this.f301560f), java.lang.Integer.valueOf(z3Var.f301560f)) && n51.f.a(this.f301561g, z3Var.f301561g) && n51.f.a(this.f301562h, z3Var.f301562h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.z3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f301563i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.w3 w3Var = this.f301558d;
            if (w3Var != null && zArr[1]) {
                fVar.i(1, w3Var.mo75928xcd1e8d8());
                this.f301558d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.x3 x3Var = this.f301559e;
            if (x3Var != null && zArr[2]) {
                fVar.i(2, x3Var.mo75928xcd1e8d8());
                this.f301559e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f301560f);
            }
            java.lang.String str = this.f301561g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.y3 y3Var = this.f301562h;
            if (y3Var != null && zArr[5]) {
                fVar.i(5, y3Var.mo75928xcd1e8d8());
                this.f301562h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.w3 w3Var2 = this.f301558d;
            if (w3Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, w3Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.x3 x3Var2 = this.f301559e;
            if (x3Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, x3Var2.mo75928xcd1e8d8());
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f301560f);
            }
            java.lang.String str2 = this.f301561g;
            if (str2 != null && zArr[4]) {
                i18 += b36.f.j(4, str2);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.y3 y3Var2 = this.f301562h;
            return (y3Var2 == null || !zArr[5]) ? i18 : i18 + b36.f.i(5, y3Var2.mo75928xcd1e8d8());
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
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.w3 w3Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.w3();
                if (bArr != null && bArr.length > 0) {
                    w3Var3.mo11468x92b714fd(bArr);
                }
                this.f301558d = w3Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.x3 x3Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.x3();
                if (bArr2 != null && bArr2.length > 0) {
                    x3Var3.mo11468x92b714fd(bArr2);
                }
                this.f301559e = x3Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f301560f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f301561g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.y3 y3Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.y3();
            if (bArr3 != null && bArr3.length > 0) {
                y3Var3.mo11468x92b714fd(bArr3);
            }
            this.f301562h = y3Var3;
        }
        zArr[5] = true;
        return 0;
    }
}
