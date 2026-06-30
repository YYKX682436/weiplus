package bw5;

/* loaded from: classes9.dex */
public class r0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f113882d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f113883e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f113884f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f113885g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f113886h;

    /* renamed from: i, reason: collision with root package name */
    public int f113887i;

    /* renamed from: m, reason: collision with root package name */
    public long f113888m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f113889n = new boolean[8];

    static {
        new bw5.r0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.r0)) {
            return false;
        }
        bw5.r0 r0Var = (bw5.r0) fVar;
        return n51.f.a(this.f113882d, r0Var.f113882d) && n51.f.a(this.f113883e, r0Var.f113883e) && n51.f.a(this.f113884f, r0Var.f113884f) && n51.f.a(this.f113885g, r0Var.f113885g) && n51.f.a(this.f113886h, r0Var.f113886h) && n51.f.a(java.lang.Integer.valueOf(this.f113887i), java.lang.Integer.valueOf(r0Var.f113887i)) && n51.f.a(java.lang.Long.valueOf(this.f113888m), java.lang.Long.valueOf(r0Var.f113888m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.r0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f113889n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f113882d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f113883e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f113884f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f113885g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f113886h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.e(6, this.f113887i);
            }
            if (zArr[7]) {
                fVar.h(7, this.f113888m);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f113882d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f113883e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f113884f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f113885g;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f113886h;
            if (str10 != null && zArr[5]) {
                i18 += b36.f.j(5, str10);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f113887i);
            }
            return zArr[7] ? i18 + b36.f.h(7, this.f113888m) : i18;
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
                this.f113882d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113883e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f113884f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113885g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113886h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f113887i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f113888m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.r0) super.mo11468x92b714fd(bArr);
    }
}
