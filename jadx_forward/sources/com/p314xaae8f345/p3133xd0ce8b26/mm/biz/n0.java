package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class n0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f299891d;

    /* renamed from: e, reason: collision with root package name */
    public int f299892e;

    /* renamed from: f, reason: collision with root package name */
    public int f299893f;

    /* renamed from: g, reason: collision with root package name */
    public int f299894g;

    /* renamed from: h, reason: collision with root package name */
    public int f299895h;

    /* renamed from: i, reason: collision with root package name */
    public int f299896i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f299897m;

    /* renamed from: n, reason: collision with root package name */
    public final android.util.ArrayMap f299898n = new android.util.ArrayMap();

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n0 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n0 n0Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f299891d), java.lang.Integer.valueOf(n0Var.f299891d)) && n51.f.a(java.lang.Integer.valueOf(this.f299892e), java.lang.Integer.valueOf(n0Var.f299892e)) && n51.f.a(java.lang.Integer.valueOf(this.f299893f), java.lang.Integer.valueOf(n0Var.f299893f)) && n51.f.a(java.lang.Integer.valueOf(this.f299894g), java.lang.Integer.valueOf(n0Var.f299894g)) && n51.f.a(java.lang.Integer.valueOf(this.f299895h), java.lang.Integer.valueOf(n0Var.f299895h)) && n51.f.a(java.lang.Integer.valueOf(this.f299896i), java.lang.Integer.valueOf(n0Var.f299896i)) && n51.f.a(java.lang.Boolean.valueOf(this.f299897m), java.lang.Boolean.valueOf(n0Var.f299897m));
    }

    /* renamed from: hasFieldNumber */
    public boolean m118750x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f299898n.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (m118750x6e095e9(1)) {
                fVar.e(1, this.f299891d);
            }
            if (m118750x6e095e9(2)) {
                fVar.e(2, this.f299892e);
            }
            if (m118750x6e095e9(3)) {
                fVar.e(3, this.f299893f);
            }
            if (m118750x6e095e9(4)) {
                fVar.e(4, this.f299894g);
            }
            if (m118750x6e095e9(5)) {
                fVar.e(5, this.f299895h);
            }
            if (m118750x6e095e9(6)) {
                fVar.e(6, this.f299896i);
            }
            if (m118750x6e095e9(900)) {
                fVar.a(900, this.f299897m);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = m118750x6e095e9(1) ? 0 + b36.f.e(1, this.f299891d) : 0;
            if (m118750x6e095e9(2)) {
                e17 += b36.f.e(2, this.f299892e);
            }
            if (m118750x6e095e9(3)) {
                e17 += b36.f.e(3, this.f299893f);
            }
            if (m118750x6e095e9(4)) {
                e17 += b36.f.e(4, this.f299894g);
            }
            if (m118750x6e095e9(5)) {
                e17 += b36.f.e(5, this.f299895h);
            }
            if (m118750x6e095e9(6)) {
                e17 += b36.f.e(6, this.f299896i);
            }
            return m118750x6e095e9(900) ? e17 + b36.f.a(900, this.f299897m) : e17;
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
        android.util.ArrayMap arrayMap = this.f299898n;
        if (intValue == 900) {
            this.f299897m = aVar2.c(intValue);
            arrayMap.put(900, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f299891d = aVar2.g(intValue);
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f299892e = aVar2.g(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f299893f = aVar2.g(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                this.f299894g = aVar2.g(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                this.f299895h = aVar2.g(intValue);
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                this.f299896i = aVar2.g(intValue);
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }
}
