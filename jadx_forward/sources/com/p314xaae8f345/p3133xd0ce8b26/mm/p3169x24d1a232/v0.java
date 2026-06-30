package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class v0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.o2 f301401d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.b2 f301402e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.u0 f301403f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.h2 f301404g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.g2 f301405h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.m0 f301406i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f301407m;

    /* renamed from: n, reason: collision with root package name */
    public int f301408n;

    /* renamed from: o, reason: collision with root package name */
    public final android.util.ArrayMap f301409o = new android.util.ArrayMap();

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.v0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.v0 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.v0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.v0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.v0 v0Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.v0) fVar;
        return n51.f.a(this.f301401d, v0Var.f301401d) && n51.f.a(this.f301402e, v0Var.f301402e) && n51.f.a(this.f301403f, v0Var.f301403f) && n51.f.a(this.f301404g, v0Var.f301404g) && n51.f.a(this.f301405h, v0Var.f301405h) && n51.f.a(this.f301406i, v0Var.f301406i) && n51.f.a(java.lang.Boolean.valueOf(this.f301407m), java.lang.Boolean.valueOf(v0Var.f301407m)) && n51.f.a(java.lang.Integer.valueOf(this.f301408n), java.lang.Integer.valueOf(v0Var.f301408n));
    }

    /* renamed from: hasFieldNumber */
    public boolean m119224x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f301409o.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.v0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f301401d != null && m119224x6e095e9(1)) {
                fVar.i(1, this.f301401d.mo75928xcd1e8d8());
                this.f301401d.mo75956x3d5d1f78(fVar);
            }
            if (this.f301402e != null && m119224x6e095e9(2)) {
                fVar.i(2, this.f301402e.mo75928xcd1e8d8());
                this.f301402e.mo75956x3d5d1f78(fVar);
            }
            if (this.f301403f != null && m119224x6e095e9(3)) {
                fVar.i(3, this.f301403f.mo75928xcd1e8d8());
                this.f301403f.mo75956x3d5d1f78(fVar);
            }
            if (this.f301404g != null && m119224x6e095e9(4)) {
                fVar.i(4, this.f301404g.mo75928xcd1e8d8());
                this.f301404g.mo75956x3d5d1f78(fVar);
            }
            if (this.f301405h != null && m119224x6e095e9(5)) {
                fVar.i(5, this.f301405h.mo75928xcd1e8d8());
                this.f301405h.mo75956x3d5d1f78(fVar);
            }
            if (this.f301406i != null && m119224x6e095e9(6)) {
                fVar.i(6, this.f301406i.mo75928xcd1e8d8());
                this.f301406i.mo75956x3d5d1f78(fVar);
            }
            if (m119224x6e095e9(900)) {
                fVar.a(900, this.f301407m);
            }
            if (m119224x6e095e9(901)) {
                fVar.e(901, this.f301408n);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f301401d != null && m119224x6e095e9(1)) {
                i18 = 0 + b36.f.i(1, this.f301401d.mo75928xcd1e8d8());
            }
            if (this.f301402e != null && m119224x6e095e9(2)) {
                i18 += b36.f.i(2, this.f301402e.mo75928xcd1e8d8());
            }
            if (this.f301403f != null && m119224x6e095e9(3)) {
                i18 += b36.f.i(3, this.f301403f.mo75928xcd1e8d8());
            }
            if (this.f301404g != null && m119224x6e095e9(4)) {
                i18 += b36.f.i(4, this.f301404g.mo75928xcd1e8d8());
            }
            if (this.f301405h != null && m119224x6e095e9(5)) {
                i18 += b36.f.i(5, this.f301405h.mo75928xcd1e8d8());
            }
            if (this.f301406i != null && m119224x6e095e9(6)) {
                i18 += b36.f.i(6, this.f301406i.mo75928xcd1e8d8());
            }
            if (m119224x6e095e9(900)) {
                i18 += b36.f.a(900, this.f301407m);
            }
            return m119224x6e095e9(901) ? i18 + b36.f.e(901, this.f301408n) : i18;
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
        android.util.ArrayMap arrayMap = this.f301409o;
        if (intValue == 900) {
            this.f301407m = aVar2.c(intValue);
            arrayMap.put(900, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 901) {
            this.f301408n = aVar2.g(intValue);
            arrayMap.put(901, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.o2 o2Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.o2();
                    if (bArr != null && bArr.length > 0) {
                        o2Var.mo11468x92b714fd(bArr);
                    }
                    this.f301401d = o2Var;
                }
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.b2 b2Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.b2();
                    if (bArr2 != null && bArr2.length > 0) {
                        b2Var.mo11468x92b714fd(bArr2);
                    }
                    this.f301402e = b2Var;
                }
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.u0 u0Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.u0();
                    if (bArr3 != null && bArr3.length > 0) {
                        u0Var.mo11468x92b714fd(bArr3);
                    }
                    this.f301403f = u0Var;
                }
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.h2 h2Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.h2();
                    if (bArr4 != null && bArr4.length > 0) {
                        h2Var.mo11468x92b714fd(bArr4);
                    }
                    this.f301404g = h2Var;
                }
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.g2 g2Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.g2();
                    if (bArr5 != null && bArr5.length > 0) {
                        g2Var.mo11468x92b714fd(bArr5);
                    }
                    this.f301405h = g2Var;
                }
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.m0 m0Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.m0();
                    if (bArr6 != null && bArr6.length > 0) {
                        m0Var.mo11468x92b714fd(bArr6);
                    }
                    this.f301406i = m0Var;
                }
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }
}
