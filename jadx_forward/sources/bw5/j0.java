package bw5;

/* loaded from: classes12.dex */
public class j0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f110278d;

    /* renamed from: e, reason: collision with root package name */
    public long f110279e;

    /* renamed from: f, reason: collision with root package name */
    public long f110280f;

    /* renamed from: g, reason: collision with root package name */
    public long f110281g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f110282h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f110283i = new boolean[6];

    static {
        new bw5.j0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.j0)) {
            return false;
        }
        bw5.j0 j0Var = (bw5.j0) fVar;
        return n51.f.a(this.f110278d, j0Var.f110278d) && n51.f.a(java.lang.Long.valueOf(this.f110279e), java.lang.Long.valueOf(j0Var.f110279e)) && n51.f.a(java.lang.Long.valueOf(this.f110280f), java.lang.Long.valueOf(j0Var.f110280f)) && n51.f.a(java.lang.Long.valueOf(this.f110281g), java.lang.Long.valueOf(j0Var.f110281g)) && n51.f.a(this.f110282h, j0Var.f110282h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.j0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f110283i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f110278d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f110279e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f110280f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f110281g);
            }
            java.lang.String str2 = this.f110282h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f110278d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f110279e);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f110280f);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f110281g);
            }
            java.lang.String str4 = this.f110282h;
            return (str4 == null || !zArr[5]) ? i18 : i18 + b36.f.j(5, str4);
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
            this.f110278d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f110279e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f110280f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f110281g = aVar2.i(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f110282h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.j0) super.mo11468x92b714fd(bArr);
    }
}
