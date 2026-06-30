package bw5;

/* loaded from: classes2.dex */
public class yg0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f117012d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f117013e;

    /* renamed from: f, reason: collision with root package name */
    public int f117014f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f117015g;

    /* renamed from: h, reason: collision with root package name */
    public int f117016h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f117017i = new boolean[6];

    static {
        new bw5.yg0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yg0)) {
            return false;
        }
        bw5.yg0 yg0Var = (bw5.yg0) fVar;
        return n51.f.a(this.f117012d, yg0Var.f117012d) && n51.f.a(this.f117013e, yg0Var.f117013e) && n51.f.a(java.lang.Integer.valueOf(this.f117014f), java.lang.Integer.valueOf(yg0Var.f117014f)) && n51.f.a(this.f117015g, yg0Var.f117015g) && n51.f.a(java.lang.Integer.valueOf(this.f117016h), java.lang.Integer.valueOf(yg0Var.f117016h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.yg0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f117017i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f117012d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f117013e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f117014f);
            }
            java.lang.String str3 = this.f117015g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.e(5, this.f117016h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f117012d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f117013e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f117014f);
            }
            java.lang.String str6 = this.f117015g;
            if (str6 != null && zArr[4]) {
                i18 += b36.f.j(4, str6);
            }
            return zArr[5] ? i18 + b36.f.e(5, this.f117016h) : i18;
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
            this.f117012d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f117013e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f117014f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f117015g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f117016h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.yg0) super.mo11468x92b714fd(bArr);
    }
}
