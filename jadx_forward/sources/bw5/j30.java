package bw5;

/* loaded from: classes2.dex */
public class j30 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f110314d;

    /* renamed from: e, reason: collision with root package name */
    public int f110315e;

    /* renamed from: f, reason: collision with root package name */
    public int f110316f;

    /* renamed from: g, reason: collision with root package name */
    public int f110317g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f110318h = new boolean[5];

    static {
        new bw5.j30();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.j30 mo11468x92b714fd(byte[] bArr) {
        return (bw5.j30) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.j30)) {
            return false;
        }
        bw5.j30 j30Var = (bw5.j30) fVar;
        return n51.f.a(this.f110314d, j30Var.f110314d) && n51.f.a(java.lang.Integer.valueOf(this.f110315e), java.lang.Integer.valueOf(j30Var.f110315e)) && n51.f.a(java.lang.Integer.valueOf(this.f110316f), java.lang.Integer.valueOf(j30Var.f110316f)) && n51.f.a(java.lang.Integer.valueOf(this.f110317g), java.lang.Integer.valueOf(j30Var.f110317g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.j30();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f110318h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f110314d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f110315e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f110316f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f110317g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f110314d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f110315e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f110316f);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f110317g) : i18;
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
            this.f110314d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f110315e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f110316f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f110317g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }
}
