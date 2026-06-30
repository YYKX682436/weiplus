package bw5;

/* loaded from: classes2.dex */
public class fc0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f108753d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f108754e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f108755f;

    /* renamed from: g, reason: collision with root package name */
    public int f108756g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f108757h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f108758i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f108759m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f108760n = new boolean[8];

    static {
        new bw5.fc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fc0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.fc0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fc0)) {
            return false;
        }
        bw5.fc0 fc0Var = (bw5.fc0) fVar;
        return n51.f.a(this.f108753d, fc0Var.f108753d) && n51.f.a(this.f108754e, fc0Var.f108754e) && n51.f.a(this.f108755f, fc0Var.f108755f) && n51.f.a(java.lang.Integer.valueOf(this.f108756g), java.lang.Integer.valueOf(fc0Var.f108756g)) && n51.f.a(java.lang.Boolean.valueOf(this.f108757h), java.lang.Boolean.valueOf(fc0Var.f108757h)) && n51.f.a(this.f108758i, fc0Var.f108758i) && n51.f.a(this.f108759m, fc0Var.f108759m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.fc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f108760n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f108753d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f108754e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f108755f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f108756g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f108757h);
            }
            java.lang.String str4 = this.f108758i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f108759m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f108753d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f108754e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f108755f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f108756g);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f108757h);
            }
            java.lang.String str9 = this.f108758i;
            if (str9 != null && zArr[6]) {
                i18 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f108759m;
            return (str10 == null || !zArr[7]) ? i18 : i18 + b36.f.j(7, str10);
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
                this.f108753d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108754e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108755f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108756g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108757h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108758i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f108759m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
