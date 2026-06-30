package bw5;

/* loaded from: classes2.dex */
public class co extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f107709d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f107710e;

    /* renamed from: f, reason: collision with root package name */
    public int f107711f;

    /* renamed from: g, reason: collision with root package name */
    public long f107712g;

    /* renamed from: h, reason: collision with root package name */
    public int f107713h;

    /* renamed from: i, reason: collision with root package name */
    public int f107714i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f107715m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f107716n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f107717o = new boolean[9];

    static {
        new bw5.co();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.co mo11468x92b714fd(byte[] bArr) {
        return (bw5.co) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.co)) {
            return false;
        }
        bw5.co coVar = (bw5.co) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f107709d), java.lang.Integer.valueOf(coVar.f107709d)) && n51.f.a(java.lang.Boolean.valueOf(this.f107710e), java.lang.Boolean.valueOf(coVar.f107710e)) && n51.f.a(java.lang.Integer.valueOf(this.f107711f), java.lang.Integer.valueOf(coVar.f107711f)) && n51.f.a(java.lang.Long.valueOf(this.f107712g), java.lang.Long.valueOf(coVar.f107712g)) && n51.f.a(java.lang.Integer.valueOf(this.f107713h), java.lang.Integer.valueOf(coVar.f107713h)) && n51.f.a(java.lang.Integer.valueOf(this.f107714i), java.lang.Integer.valueOf(coVar.f107714i)) && n51.f.a(this.f107715m, coVar.f107715m) && n51.f.a(this.f107716n, coVar.f107716n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.co();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107717o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f107709d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f107710e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f107711f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f107712g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f107713h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f107714i);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f107715m;
            if (gVar != null && zArr[7]) {
                fVar.b(7, gVar);
            }
            java.lang.String str = this.f107716n;
            if (str != null && zArr[8]) {
                fVar.j(8, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f107709d) : 0;
            if (zArr[2]) {
                e17 += b36.f.a(2, this.f107710e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f107711f);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f107712g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f107713h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f107714i);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f107715m;
            if (gVar2 != null && zArr[7]) {
                e17 += b36.f.b(7, gVar2);
            }
            java.lang.String str2 = this.f107716n;
            return (str2 == null || !zArr[8]) ? e17 : e17 + b36.f.j(8, str2);
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
                this.f107709d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107710e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107711f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107712g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f107713h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107714i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f107715m = aVar2.d(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f107716n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
