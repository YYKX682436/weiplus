package bw5;

/* loaded from: classes9.dex */
public class yo0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f117125d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f117126e;

    /* renamed from: f, reason: collision with root package name */
    public int f117127f;

    /* renamed from: g, reason: collision with root package name */
    public double f117128g;

    /* renamed from: h, reason: collision with root package name */
    public double f117129h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f117130i = new boolean[6];

    static {
        new bw5.yo0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yo0)) {
            return false;
        }
        bw5.yo0 yo0Var = (bw5.yo0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f117125d), java.lang.Integer.valueOf(yo0Var.f117125d)) && n51.f.a(this.f117126e, yo0Var.f117126e) && n51.f.a(java.lang.Integer.valueOf(this.f117127f), java.lang.Integer.valueOf(yo0Var.f117127f)) && n51.f.a(java.lang.Double.valueOf(this.f117128g), java.lang.Double.valueOf(yo0Var.f117128g)) && n51.f.a(java.lang.Double.valueOf(this.f117129h), java.lang.Double.valueOf(yo0Var.f117129h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.yo0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f117130i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f117125d);
            }
            java.lang.String str = this.f117126e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f117127f);
            }
            if (zArr[4]) {
                fVar.c(4, this.f117128g);
            }
            if (zArr[5]) {
                fVar.c(5, this.f117129h);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f117125d) : 0;
            java.lang.String str2 = this.f117126e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f117127f);
            }
            if (zArr[4]) {
                e17 += b36.f.c(4, this.f117128g);
            }
            return zArr[5] ? e17 + b36.f.c(5, this.f117129h) : e17;
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
            this.f117125d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f117126e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f117127f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f117128g = aVar2.e(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f117129h = aVar2.e(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.yo0) super.mo11468x92b714fd(bArr);
    }
}
