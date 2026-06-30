package bw5;

/* loaded from: classes11.dex */
public class in0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f110177d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f110178e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f110179f;

    /* renamed from: g, reason: collision with root package name */
    public double f110180g;

    /* renamed from: h, reason: collision with root package name */
    public double f110181h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f110182i = new boolean[6];

    static {
        new bw5.in0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.in0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.in0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.in0)) {
            return false;
        }
        bw5.in0 in0Var = (bw5.in0) fVar;
        return n51.f.a(this.f110177d, in0Var.f110177d) && n51.f.a(this.f110178e, in0Var.f110178e) && n51.f.a(this.f110179f, in0Var.f110179f) && n51.f.a(java.lang.Double.valueOf(this.f110180g), java.lang.Double.valueOf(in0Var.f110180g)) && n51.f.a(java.lang.Double.valueOf(this.f110181h), java.lang.Double.valueOf(in0Var.f110181h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.in0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f110182i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f110177d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f110178e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f110179f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.c(4, this.f110180g);
            }
            if (zArr[5]) {
                fVar.c(5, this.f110181h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f110177d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f110178e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f110179f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                i18 += b36.f.c(4, this.f110180g);
            }
            return zArr[5] ? i18 + b36.f.c(5, this.f110181h) : i18;
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
        if (intValue == 1) {
            this.f110177d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f110178e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f110179f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f110180g = aVar2.e(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f110181h = aVar2.e(intValue);
        zArr[5] = true;
        return 0;
    }
}
