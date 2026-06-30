package bw5;

/* loaded from: classes11.dex */
public class j20 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f110304d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.f20 f110305e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f110306f;

    /* renamed from: g, reason: collision with root package name */
    public int f110307g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f110308h = new boolean[5];

    static {
        new bw5.j20();
    }

    public java.lang.String b() {
        return this.f110308h[3] ? this.f110306f : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.j20)) {
            return false;
        }
        bw5.j20 j20Var = (bw5.j20) fVar;
        return n51.f.a(this.f110304d, j20Var.f110304d) && n51.f.a(this.f110305e, j20Var.f110305e) && n51.f.a(this.f110306f, j20Var.f110306f) && n51.f.a(java.lang.Integer.valueOf(this.f110307g), java.lang.Integer.valueOf(j20Var.f110307g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.j20();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f110308h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f110304d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.f20 f20Var = this.f110305e;
            if (f20Var != null && zArr[2]) {
                fVar.e(2, f20Var.f108661d);
            }
            java.lang.String str2 = this.f110306f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f110307g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f110304d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            bw5.f20 f20Var2 = this.f110305e;
            if (f20Var2 != null && zArr[2]) {
                i18 += b36.f.e(2, f20Var2.f108661d);
            }
            java.lang.String str4 = this.f110306f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f110307g) : i18;
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
            this.f110304d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f110305e = bw5.f20.a(aVar2.g(intValue));
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f110306f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f110307g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.j20) super.mo11468x92b714fd(bArr);
    }
}
