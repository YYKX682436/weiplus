package bw5;

/* loaded from: classes2.dex */
public class ne extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f112177d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f112178e;

    /* renamed from: f, reason: collision with root package name */
    public int f112179f;

    /* renamed from: g, reason: collision with root package name */
    public float f112180g;

    /* renamed from: h, reason: collision with root package name */
    public float f112181h;

    /* renamed from: i, reason: collision with root package name */
    public float f112182i;

    /* renamed from: m, reason: collision with root package name */
    public float f112183m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f112184n = new boolean[8];

    static {
        new bw5.ne();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ne mo11468x92b714fd(byte[] bArr) {
        return (bw5.ne) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ne)) {
            return false;
        }
        bw5.ne neVar = (bw5.ne) fVar;
        return n51.f.a(this.f112177d, neVar.f112177d) && n51.f.a(java.lang.Boolean.valueOf(this.f112178e), java.lang.Boolean.valueOf(neVar.f112178e)) && n51.f.a(java.lang.Integer.valueOf(this.f112179f), java.lang.Integer.valueOf(neVar.f112179f)) && n51.f.a(java.lang.Float.valueOf(this.f112180g), java.lang.Float.valueOf(neVar.f112180g)) && n51.f.a(java.lang.Float.valueOf(this.f112181h), java.lang.Float.valueOf(neVar.f112181h)) && n51.f.a(java.lang.Float.valueOf(this.f112182i), java.lang.Float.valueOf(neVar.f112182i)) && n51.f.a(java.lang.Float.valueOf(this.f112183m), java.lang.Float.valueOf(neVar.f112183m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ne();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f112184n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f112177d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.a(2, this.f112178e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f112179f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f112180g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f112181h);
            }
            if (zArr[6]) {
                fVar.d(6, this.f112182i);
            }
            if (zArr[7]) {
                fVar.d(7, this.f112183m);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f112177d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f112178e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f112179f);
            }
            if (zArr[4]) {
                i18 += b36.f.d(4, this.f112180g);
            }
            if (zArr[5]) {
                i18 += b36.f.d(5, this.f112181h);
            }
            if (zArr[6]) {
                i18 += b36.f.d(6, this.f112182i);
            }
            return zArr[7] ? i18 + b36.f.d(7, this.f112183m) : i18;
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
                this.f112177d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f112178e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112179f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f112180g = aVar2.f(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f112181h = aVar2.f(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f112182i = aVar2.f(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f112183m = aVar2.f(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
