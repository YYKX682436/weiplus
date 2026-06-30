package bw5;

/* loaded from: classes2.dex */
public class ul extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f115492d;

    /* renamed from: e, reason: collision with root package name */
    public long f115493e;

    /* renamed from: f, reason: collision with root package name */
    public int f115494f;

    /* renamed from: g, reason: collision with root package name */
    public long f115495g;

    /* renamed from: h, reason: collision with root package name */
    public int f115496h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f115497i;

    /* renamed from: m, reason: collision with root package name */
    public float f115498m;

    /* renamed from: n, reason: collision with root package name */
    public int f115499n;

    /* renamed from: o, reason: collision with root package name */
    public int f115500o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f115501p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f115502q = new boolean[11];

    static {
        new bw5.ul();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ul mo11468x92b714fd(byte[] bArr) {
        return (bw5.ul) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ul)) {
            return false;
        }
        bw5.ul ulVar = (bw5.ul) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f115492d), java.lang.Boolean.valueOf(ulVar.f115492d)) && n51.f.a(java.lang.Long.valueOf(this.f115493e), java.lang.Long.valueOf(ulVar.f115493e)) && n51.f.a(java.lang.Integer.valueOf(this.f115494f), java.lang.Integer.valueOf(ulVar.f115494f)) && n51.f.a(java.lang.Long.valueOf(this.f115495g), java.lang.Long.valueOf(ulVar.f115495g)) && n51.f.a(java.lang.Integer.valueOf(this.f115496h), java.lang.Integer.valueOf(ulVar.f115496h)) && n51.f.a(this.f115497i, ulVar.f115497i) && n51.f.a(java.lang.Float.valueOf(this.f115498m), java.lang.Float.valueOf(ulVar.f115498m)) && n51.f.a(java.lang.Integer.valueOf(this.f115499n), java.lang.Integer.valueOf(ulVar.f115499n)) && n51.f.a(java.lang.Integer.valueOf(this.f115500o), java.lang.Integer.valueOf(ulVar.f115500o)) && n51.f.a(this.f115501p, ulVar.f115501p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ul();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115502q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f115492d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f115493e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f115494f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f115495g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f115496h);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f115497i;
            if (gVar != null && zArr[6]) {
                fVar.b(6, gVar);
            }
            if (zArr[7]) {
                fVar.d(7, this.f115498m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f115499n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f115500o);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f115501p;
            if (gVar2 != null && zArr[10]) {
                fVar.b(10, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f115492d) : 0;
            if (zArr[2]) {
                a17 += b36.f.h(2, this.f115493e);
            }
            if (zArr[3]) {
                a17 += b36.f.e(3, this.f115494f);
            }
            if (zArr[4]) {
                a17 += b36.f.h(4, this.f115495g);
            }
            if (zArr[5]) {
                a17 += b36.f.e(5, this.f115496h);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f115497i;
            if (gVar3 != null && zArr[6]) {
                a17 += b36.f.b(6, gVar3);
            }
            if (zArr[7]) {
                a17 += b36.f.d(7, this.f115498m);
            }
            if (zArr[8]) {
                a17 += b36.f.e(8, this.f115499n);
            }
            if (zArr[9]) {
                a17 += b36.f.e(9, this.f115500o);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f115501p;
            return (gVar4 == null || !zArr[10]) ? a17 : a17 + b36.f.b(10, gVar4);
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
                this.f115492d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f115493e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f115494f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f115495g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115496h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f115497i = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f115498m = aVar2.f(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f115499n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f115500o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f115501p = aVar2.d(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
