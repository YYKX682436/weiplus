package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class g4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f300995d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f300996e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f300997f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f300998g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f300999h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f301000i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f301001m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f301002n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f301003o = 0;

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.g4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.g4 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.g4) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.g4)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.g4 g4Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.g4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f300995d), java.lang.Integer.valueOf(g4Var.f300995d)) && n51.f.a(java.lang.Integer.valueOf(this.f300996e), java.lang.Integer.valueOf(g4Var.f300996e)) && n51.f.a(java.lang.Integer.valueOf(this.f300997f), java.lang.Integer.valueOf(g4Var.f300997f)) && n51.f.a(java.lang.Integer.valueOf(this.f300998g), java.lang.Integer.valueOf(g4Var.f300998g)) && n51.f.a(java.lang.Integer.valueOf(this.f300999h), java.lang.Integer.valueOf(g4Var.f300999h)) && n51.f.a(java.lang.Integer.valueOf(this.f301000i), java.lang.Integer.valueOf(g4Var.f301000i)) && n51.f.a(java.lang.Integer.valueOf(this.f301001m), java.lang.Integer.valueOf(g4Var.f301001m)) && n51.f.a(java.lang.Integer.valueOf(this.f301002n), java.lang.Integer.valueOf(g4Var.f301002n)) && n51.f.a(java.lang.Integer.valueOf(this.f301003o), java.lang.Integer.valueOf(g4Var.f301003o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.g4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f300995d);
            fVar.e(2, this.f300996e);
            fVar.e(3, this.f300997f);
            fVar.e(4, this.f300998g);
            fVar.e(5, this.f300999h);
            fVar.e(6, this.f301000i);
            fVar.e(7, this.f301001m);
            fVar.e(8, this.f301002n);
            fVar.e(9, this.f301003o);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f300995d) + 0 + b36.f.e(2, this.f300996e) + b36.f.e(3, this.f300997f) + b36.f.e(4, this.f300998g) + b36.f.e(5, this.f300999h) + b36.f.e(6, this.f301000i) + b36.f.e(7, this.f301001m) + b36.f.e(8, this.f301002n) + b36.f.e(9, this.f301003o);
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
        switch (intValue) {
            case 1:
                this.f300995d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f300996e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f300997f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f300998g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f300999h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f301000i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f301001m = aVar2.g(intValue);
                return 0;
            case 8:
                this.f301002n = aVar2.g(intValue);
                return 0;
            case 9:
                this.f301003o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
