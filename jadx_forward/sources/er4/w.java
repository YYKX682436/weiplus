package er4;

/* loaded from: classes14.dex */
public class w extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: o, reason: collision with root package name */
    public static final er4.w f337719o = new er4.w();

    /* renamed from: d, reason: collision with root package name */
    public long f337720d;

    /* renamed from: e, reason: collision with root package name */
    public long f337721e;

    /* renamed from: f, reason: collision with root package name */
    public double f337722f;

    /* renamed from: g, reason: collision with root package name */
    public double f337723g;

    /* renamed from: h, reason: collision with root package name */
    public double f337724h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f337725i;

    /* renamed from: m, reason: collision with root package name */
    public long f337726m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f337727n = new boolean[8];

    public er4.w b(double d17) {
        this.f337724h = d17;
        this.f337727n[5] = true;
        return this;
    }

    public er4.w c(boolean z17) {
        this.f337725i = z17;
        this.f337727n[6] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof er4.w)) {
            return false;
        }
        er4.w wVar = (er4.w) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f337720d), java.lang.Long.valueOf(wVar.f337720d)) && n51.f.a(java.lang.Long.valueOf(this.f337721e), java.lang.Long.valueOf(wVar.f337721e)) && n51.f.a(java.lang.Double.valueOf(this.f337722f), java.lang.Double.valueOf(wVar.f337722f)) && n51.f.a(java.lang.Double.valueOf(this.f337723g), java.lang.Double.valueOf(wVar.f337723g)) && n51.f.a(java.lang.Double.valueOf(this.f337724h), java.lang.Double.valueOf(wVar.f337724h)) && n51.f.a(java.lang.Boolean.valueOf(this.f337725i), java.lang.Boolean.valueOf(wVar.f337725i)) && n51.f.a(java.lang.Long.valueOf(this.f337726m), java.lang.Long.valueOf(wVar.f337726m));
    }

    public er4.w d(double d17) {
        this.f337722f = d17;
        this.f337727n[3] = true;
        return this;
    }

    public er4.w e(long j17) {
        this.f337721e = j17;
        this.f337727n[2] = true;
        return this;
    }

    public er4.w f(long j17) {
        this.f337720d = j17;
        this.f337727n[1] = true;
        return this;
    }

    public er4.w g(double d17) {
        this.f337723g = d17;
        this.f337727n[4] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new er4.w();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f337727n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f337720d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f337721e);
            }
            if (zArr[3]) {
                fVar.c(3, this.f337722f);
            }
            if (zArr[4]) {
                fVar.c(4, this.f337723g);
            }
            if (zArr[5]) {
                fVar.c(5, this.f337724h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f337725i);
            }
            if (zArr[7]) {
                fVar.h(7, this.f337726m);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f337720d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f337721e);
            }
            if (zArr[3]) {
                h17 += b36.f.c(3, this.f337722f);
            }
            if (zArr[4]) {
                h17 += b36.f.c(4, this.f337723g);
            }
            if (zArr[5]) {
                h17 += b36.f.c(5, this.f337724h);
            }
            if (zArr[6]) {
                h17 += b36.f.a(6, this.f337725i);
            }
            return zArr[7] ? h17 + b36.f.h(7, this.f337726m) : h17;
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
                this.f337720d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f337721e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f337722f = aVar2.e(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f337723g = aVar2.e(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f337724h = aVar2.e(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f337725i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f337726m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (er4.w) super.mo11468x92b714fd(bArr);
    }
}
