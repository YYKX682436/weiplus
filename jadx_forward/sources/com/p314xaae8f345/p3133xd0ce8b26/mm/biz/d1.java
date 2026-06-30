package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class d1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m3 f299486d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x2 f299487e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c1 f299488f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d3 f299489g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c3 f299490h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t0 f299491i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f299492m;

    /* renamed from: n, reason: collision with root package name */
    public int f299493n;

    /* renamed from: o, reason: collision with root package name */
    public final android.util.ArrayMap f299494o = new android.util.ArrayMap();

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d1 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d1 d1Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d1) fVar;
        return n51.f.a(this.f299486d, d1Var.f299486d) && n51.f.a(this.f299487e, d1Var.f299487e) && n51.f.a(this.f299488f, d1Var.f299488f) && n51.f.a(this.f299489g, d1Var.f299489g) && n51.f.a(this.f299490h, d1Var.f299490h) && n51.f.a(this.f299491i, d1Var.f299491i) && n51.f.a(java.lang.Boolean.valueOf(this.f299492m), java.lang.Boolean.valueOf(d1Var.f299492m)) && n51.f.a(java.lang.Integer.valueOf(this.f299493n), java.lang.Integer.valueOf(d1Var.f299493n));
    }

    /* renamed from: hasFieldNumber */
    public boolean m118680x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f299494o.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f299486d != null && m118680x6e095e9(1)) {
                fVar.i(1, this.f299486d.mo75928xcd1e8d8());
                this.f299486d.mo75956x3d5d1f78(fVar);
            }
            if (this.f299487e != null && m118680x6e095e9(2)) {
                fVar.i(2, this.f299487e.mo75928xcd1e8d8());
                this.f299487e.mo75956x3d5d1f78(fVar);
            }
            if (this.f299488f != null && m118680x6e095e9(3)) {
                fVar.i(3, this.f299488f.mo75928xcd1e8d8());
                this.f299488f.mo75956x3d5d1f78(fVar);
            }
            if (this.f299489g != null && m118680x6e095e9(4)) {
                fVar.i(4, this.f299489g.mo75928xcd1e8d8());
                this.f299489g.mo75956x3d5d1f78(fVar);
            }
            if (this.f299490h != null && m118680x6e095e9(5)) {
                fVar.i(5, this.f299490h.mo75928xcd1e8d8());
                this.f299490h.mo75956x3d5d1f78(fVar);
            }
            if (this.f299491i != null && m118680x6e095e9(6)) {
                fVar.i(6, this.f299491i.mo75928xcd1e8d8());
                this.f299491i.mo75956x3d5d1f78(fVar);
            }
            if (m118680x6e095e9(900)) {
                fVar.a(900, this.f299492m);
            }
            if (m118680x6e095e9(901)) {
                fVar.e(901, this.f299493n);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f299486d != null && m118680x6e095e9(1)) {
                i18 = 0 + b36.f.i(1, this.f299486d.mo75928xcd1e8d8());
            }
            if (this.f299487e != null && m118680x6e095e9(2)) {
                i18 += b36.f.i(2, this.f299487e.mo75928xcd1e8d8());
            }
            if (this.f299488f != null && m118680x6e095e9(3)) {
                i18 += b36.f.i(3, this.f299488f.mo75928xcd1e8d8());
            }
            if (this.f299489g != null && m118680x6e095e9(4)) {
                i18 += b36.f.i(4, this.f299489g.mo75928xcd1e8d8());
            }
            if (this.f299490h != null && m118680x6e095e9(5)) {
                i18 += b36.f.i(5, this.f299490h.mo75928xcd1e8d8());
            }
            if (this.f299491i != null && m118680x6e095e9(6)) {
                i18 += b36.f.i(6, this.f299491i.mo75928xcd1e8d8());
            }
            if (m118680x6e095e9(900)) {
                i18 += b36.f.a(900, this.f299492m);
            }
            return m118680x6e095e9(901) ? i18 + b36.f.e(901, this.f299493n) : i18;
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
        android.util.ArrayMap arrayMap = this.f299494o;
        if (intValue == 900) {
            this.f299492m = aVar2.c(intValue);
            arrayMap.put(900, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 901) {
            this.f299493n = aVar2.g(intValue);
            arrayMap.put(901, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m3 m3Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m3();
                    if (bArr != null && bArr.length > 0) {
                        m3Var.mo11468x92b714fd(bArr);
                    }
                    this.f299486d = m3Var;
                }
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x2 x2Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x2();
                    if (bArr2 != null && bArr2.length > 0) {
                        x2Var.mo11468x92b714fd(bArr2);
                    }
                    this.f299487e = x2Var;
                }
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c1 c1Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c1();
                    if (bArr3 != null && bArr3.length > 0) {
                        c1Var.mo11468x92b714fd(bArr3);
                    }
                    this.f299488f = c1Var;
                }
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d3 d3Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.d3();
                    if (bArr4 != null && bArr4.length > 0) {
                        d3Var.mo11468x92b714fd(bArr4);
                    }
                    this.f299489g = d3Var;
                }
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c3 c3Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c3();
                    if (bArr5 != null && bArr5.length > 0) {
                        c3Var.mo11468x92b714fd(bArr5);
                    }
                    this.f299490h = c3Var;
                }
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t0 t0Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t0();
                    if (bArr6 != null && bArr6.length > 0) {
                        t0Var.mo11468x92b714fd(bArr6);
                    }
                    this.f299491i = t0Var;
                }
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }
}
