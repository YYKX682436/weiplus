package bw5;

/* loaded from: classes10.dex */
public class e30 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f108243d;

    /* renamed from: e, reason: collision with root package name */
    public float f108244e;

    /* renamed from: f, reason: collision with root package name */
    public int f108245f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f108246g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f108247h;

    /* renamed from: i, reason: collision with root package name */
    public int f108248i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f108249m;

    /* renamed from: n, reason: collision with root package name */
    public int f108250n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f108251o = new boolean[9];

    static {
        new bw5.e30();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.e30 mo11468x92b714fd(byte[] bArr) {
        return (bw5.e30) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.e30)) {
            return false;
        }
        bw5.e30 e30Var = (bw5.e30) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f108243d), java.lang.Float.valueOf(e30Var.f108243d)) && n51.f.a(java.lang.Float.valueOf(this.f108244e), java.lang.Float.valueOf(e30Var.f108244e)) && n51.f.a(java.lang.Integer.valueOf(this.f108245f), java.lang.Integer.valueOf(e30Var.f108245f)) && n51.f.a(this.f108246g, e30Var.f108246g) && n51.f.a(this.f108247h, e30Var.f108247h) && n51.f.a(java.lang.Integer.valueOf(this.f108248i), java.lang.Integer.valueOf(e30Var.f108248i)) && n51.f.a(this.f108249m, e30Var.f108249m) && n51.f.a(java.lang.Integer.valueOf(this.f108250n), java.lang.Integer.valueOf(e30Var.f108250n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.e30();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f108251o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f108243d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f108244e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f108245f);
            }
            java.lang.String str = this.f108246g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f108247h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            if (zArr[6]) {
                fVar.e(6, this.f108248i);
            }
            java.lang.String str3 = this.f108249m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            if (zArr[8]) {
                fVar.e(8, this.f108250n);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f108243d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f108244e);
            }
            if (zArr[3]) {
                d17 += b36.f.e(3, this.f108245f);
            }
            java.lang.String str4 = this.f108246g;
            if (str4 != null && zArr[4]) {
                d17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f108247h;
            if (str5 != null && zArr[5]) {
                d17 += b36.f.j(5, str5);
            }
            if (zArr[6]) {
                d17 += b36.f.e(6, this.f108248i);
            }
            java.lang.String str6 = this.f108249m;
            if (str6 != null && zArr[7]) {
                d17 += b36.f.j(7, str6);
            }
            return zArr[8] ? d17 + b36.f.e(8, this.f108250n) : d17;
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
                this.f108243d = aVar2.f(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108244e = aVar2.f(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108245f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108246g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108247h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108248i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f108249m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f108250n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
