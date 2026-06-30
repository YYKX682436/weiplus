package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class g0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f300968d;

    /* renamed from: e, reason: collision with root package name */
    public int f300969e;

    /* renamed from: f, reason: collision with root package name */
    public int f300970f;

    /* renamed from: g, reason: collision with root package name */
    public int f300971g;

    /* renamed from: h, reason: collision with root package name */
    public int f300972h;

    /* renamed from: i, reason: collision with root package name */
    public int f300973i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f300974m;

    /* renamed from: n, reason: collision with root package name */
    public final android.util.ArrayMap f300975n = new android.util.ArrayMap();

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.g0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.g0 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.g0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.g0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.g0 g0Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.g0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f300968d), java.lang.Integer.valueOf(g0Var.f300968d)) && n51.f.a(java.lang.Integer.valueOf(this.f300969e), java.lang.Integer.valueOf(g0Var.f300969e)) && n51.f.a(java.lang.Integer.valueOf(this.f300970f), java.lang.Integer.valueOf(g0Var.f300970f)) && n51.f.a(java.lang.Integer.valueOf(this.f300971g), java.lang.Integer.valueOf(g0Var.f300971g)) && n51.f.a(java.lang.Integer.valueOf(this.f300972h), java.lang.Integer.valueOf(g0Var.f300972h)) && n51.f.a(java.lang.Integer.valueOf(this.f300973i), java.lang.Integer.valueOf(g0Var.f300973i)) && n51.f.a(java.lang.Boolean.valueOf(this.f300974m), java.lang.Boolean.valueOf(g0Var.f300974m));
    }

    /* renamed from: hasFieldNumber */
    public boolean m119151x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f300975n.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.g0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (m119151x6e095e9(1)) {
                fVar.e(1, this.f300968d);
            }
            if (m119151x6e095e9(2)) {
                fVar.e(2, this.f300969e);
            }
            if (m119151x6e095e9(3)) {
                fVar.e(3, this.f300970f);
            }
            if (m119151x6e095e9(4)) {
                fVar.e(4, this.f300971g);
            }
            if (m119151x6e095e9(5)) {
                fVar.e(5, this.f300972h);
            }
            if (m119151x6e095e9(6)) {
                fVar.e(6, this.f300973i);
            }
            if (m119151x6e095e9(900)) {
                fVar.a(900, this.f300974m);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = m119151x6e095e9(1) ? 0 + b36.f.e(1, this.f300968d) : 0;
            if (m119151x6e095e9(2)) {
                e17 += b36.f.e(2, this.f300969e);
            }
            if (m119151x6e095e9(3)) {
                e17 += b36.f.e(3, this.f300970f);
            }
            if (m119151x6e095e9(4)) {
                e17 += b36.f.e(4, this.f300971g);
            }
            if (m119151x6e095e9(5)) {
                e17 += b36.f.e(5, this.f300972h);
            }
            if (m119151x6e095e9(6)) {
                e17 += b36.f.e(6, this.f300973i);
            }
            return m119151x6e095e9(900) ? e17 + b36.f.a(900, this.f300974m) : e17;
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
        android.util.ArrayMap arrayMap = this.f300975n;
        if (intValue == 900) {
            this.f300974m = aVar2.c(intValue);
            arrayMap.put(900, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f300968d = aVar2.g(intValue);
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f300969e = aVar2.g(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f300970f = aVar2.g(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                this.f300971g = aVar2.g(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                this.f300972h = aVar2.g(intValue);
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                this.f300973i = aVar2.g(intValue);
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }
}
