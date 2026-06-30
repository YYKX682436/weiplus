package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes9.dex */
public class e1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f300915d;

    /* renamed from: e, reason: collision with root package name */
    public int f300916e;

    /* renamed from: f, reason: collision with root package name */
    public int f300917f;

    /* renamed from: g, reason: collision with root package name */
    public int f300918g;

    /* renamed from: h, reason: collision with root package name */
    public int f300919h;

    /* renamed from: i, reason: collision with root package name */
    public int f300920i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f300921m = new boolean[7];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e1 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e1 e1Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f300915d), java.lang.Integer.valueOf(e1Var.f300915d)) && n51.f.a(java.lang.Integer.valueOf(this.f300916e), java.lang.Integer.valueOf(e1Var.f300916e)) && n51.f.a(java.lang.Integer.valueOf(this.f300917f), java.lang.Integer.valueOf(e1Var.f300917f)) && n51.f.a(java.lang.Integer.valueOf(this.f300918g), java.lang.Integer.valueOf(e1Var.f300918g)) && n51.f.a(java.lang.Integer.valueOf(this.f300919h), java.lang.Integer.valueOf(e1Var.f300919h)) && n51.f.a(java.lang.Integer.valueOf(this.f300920i), java.lang.Integer.valueOf(e1Var.f300920i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f300921m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f300915d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f300916e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f300917f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f300918g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f300919h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f300920i);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f300915d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f300916e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f300917f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f300918g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f300919h);
            }
            return zArr[6] ? e17 + b36.f.e(6, this.f300920i) : e17;
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
                this.f300915d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f300916e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f300917f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f300918g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f300919h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f300920i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
