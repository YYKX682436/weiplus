package bw5;

/* loaded from: classes2.dex */
public class nl extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f112256d;

    /* renamed from: e, reason: collision with root package name */
    public float f112257e;

    /* renamed from: f, reason: collision with root package name */
    public int f112258f;

    /* renamed from: g, reason: collision with root package name */
    public int f112259g;

    /* renamed from: h, reason: collision with root package name */
    public float f112260h;

    /* renamed from: i, reason: collision with root package name */
    public int f112261i;

    /* renamed from: m, reason: collision with root package name */
    public int f112262m;

    /* renamed from: n, reason: collision with root package name */
    public long f112263n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f112264o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f112265p = new boolean[22];

    static {
        new bw5.nl();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.nl mo11468x92b714fd(byte[] bArr) {
        return (bw5.nl) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nl)) {
            return false;
        }
        bw5.nl nlVar = (bw5.nl) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f112256d), java.lang.Integer.valueOf(nlVar.f112256d)) && n51.f.a(java.lang.Float.valueOf(this.f112257e), java.lang.Float.valueOf(nlVar.f112257e)) && n51.f.a(java.lang.Integer.valueOf(this.f112258f), java.lang.Integer.valueOf(nlVar.f112258f)) && n51.f.a(java.lang.Integer.valueOf(this.f112259g), java.lang.Integer.valueOf(nlVar.f112259g)) && n51.f.a(java.lang.Float.valueOf(this.f112260h), java.lang.Float.valueOf(nlVar.f112260h)) && n51.f.a(java.lang.Integer.valueOf(this.f112261i), java.lang.Integer.valueOf(nlVar.f112261i)) && n51.f.a(java.lang.Integer.valueOf(this.f112262m), java.lang.Integer.valueOf(nlVar.f112262m)) && n51.f.a(java.lang.Long.valueOf(this.f112263n), java.lang.Long.valueOf(nlVar.f112263n)) && n51.f.a(this.f112264o, nlVar.f112264o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.nl();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f112265p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f112256d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f112257e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f112258f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f112259g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f112260h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f112261i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f112262m);
            }
            if (zArr[11]) {
                fVar.h(11, this.f112263n);
            }
            java.lang.String str = this.f112264o;
            if (str != null && zArr[21]) {
                fVar.j(21, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f112256d) : 0;
            if (zArr[2]) {
                e17 += b36.f.d(2, this.f112257e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f112258f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f112259g);
            }
            if (zArr[5]) {
                e17 += b36.f.d(5, this.f112260h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f112261i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f112262m);
            }
            if (zArr[11]) {
                e17 += b36.f.h(11, this.f112263n);
            }
            java.lang.String str2 = this.f112264o;
            return (str2 == null || !zArr[21]) ? e17 : e17 + b36.f.j(21, str2);
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
        if (intValue == 11) {
            this.f112263n = aVar2.i(intValue);
            zArr[11] = true;
            return 0;
        }
        if (intValue == 21) {
            this.f112264o = aVar2.k(intValue);
            zArr[21] = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f112256d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f112257e = aVar2.f(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112258f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f112259g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f112260h = aVar2.f(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f112261i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f112262m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
