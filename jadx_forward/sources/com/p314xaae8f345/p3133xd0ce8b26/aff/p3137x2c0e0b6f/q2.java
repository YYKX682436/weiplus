package com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f;

/* loaded from: classes4.dex */
public class q2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.p2 f297967d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.n2 f297968e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f297969f;

    /* renamed from: g, reason: collision with root package name */
    public long f297970g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.o2 f297971h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f297972i = new boolean[6];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.q2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.q2 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.q2) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.q2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.q2 q2Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.q2) fVar;
        return n51.f.a(this.f297967d, q2Var.f297967d) && n51.f.a(this.f297968e, q2Var.f297968e) && n51.f.a(this.f297969f, q2Var.f297969f) && n51.f.a(java.lang.Long.valueOf(this.f297970g), java.lang.Long.valueOf(q2Var.f297970g)) && n51.f.a(this.f297971h, q2Var.f297971h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.q2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f297972i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.p2 p2Var = this.f297967d;
            if (p2Var != null && zArr[1]) {
                fVar.e(1, p2Var.f297959d);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.n2 n2Var = this.f297968e;
            if (n2Var != null && zArr[2]) {
                fVar.e(2, n2Var.f297937d);
            }
            java.lang.String str = this.f297969f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.h(4, this.f297970g);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.o2 o2Var = this.f297971h;
            if (o2Var != null && zArr[5]) {
                fVar.i(5, o2Var.mo75928xcd1e8d8());
                this.f297971h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.p2 p2Var2 = this.f297967d;
            if (p2Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, p2Var2.f297959d);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.n2 n2Var2 = this.f297968e;
            if (n2Var2 != null && zArr[2]) {
                i18 += b36.f.e(2, n2Var2.f297937d);
            }
            java.lang.String str2 = this.f297969f;
            if (str2 != null && zArr[3]) {
                i18 += b36.f.j(3, str2);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f297970g);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.o2 o2Var2 = this.f297971h;
            return (o2Var2 == null || !zArr[5]) ? i18 : i18 + b36.f.i(5, o2Var2.mo75928xcd1e8d8());
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
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.p2 p2Var3 = null;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.n2 n2Var3 = null;
        if (intValue == 1) {
            int g17 = aVar2.g(intValue);
            if (g17 == 0) {
                p2Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.p2.TYPE_TEXT;
            } else if (g17 == 1) {
                p2Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.p2.TYPE_WEBPAGE;
            } else if (g17 == 2) {
                p2Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.p2.TYPE_IMAGE;
            } else if (g17 == 3) {
                p2Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.p2.TYPE_FINDER;
            } else if (g17 == 4) {
                p2Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.p2.TYPE_TODO;
            }
            this.f297967d = p2Var3;
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            int g18 = aVar2.g(intValue);
            if (g18 == 0) {
                n2Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.n2.USER;
            } else if (g18 == 1) {
                n2Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.n2.ASSISTANT;
            }
            this.f297968e = n2Var3;
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f297969f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f297970g = aVar2.i(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.o2 o2Var3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.o2();
            if (bArr != null && bArr.length > 0) {
                o2Var3.mo11468x92b714fd(bArr);
            }
            this.f297971h = o2Var3;
        }
        zArr[5] = true;
        return 0;
    }
}
