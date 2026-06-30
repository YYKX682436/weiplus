package bw5;

/* loaded from: classes2.dex */
public class c90 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f107521d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107522e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107523f;

    /* renamed from: g, reason: collision with root package name */
    public int f107524g;

    /* renamed from: h, reason: collision with root package name */
    public int f107525h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f107526i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f107527m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f107528n = new boolean[8];

    static {
        new bw5.c90();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.c90 mo11468x92b714fd(byte[] bArr) {
        return (bw5.c90) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.c90)) {
            return false;
        }
        bw5.c90 c90Var = (bw5.c90) fVar;
        return n51.f.a(this.f107521d, c90Var.f107521d) && n51.f.a(this.f107522e, c90Var.f107522e) && n51.f.a(this.f107523f, c90Var.f107523f) && n51.f.a(java.lang.Integer.valueOf(this.f107524g), java.lang.Integer.valueOf(c90Var.f107524g)) && n51.f.a(java.lang.Integer.valueOf(this.f107525h), java.lang.Integer.valueOf(c90Var.f107525h)) && n51.f.a(this.f107526i, c90Var.f107526i) && n51.f.a(this.f107527m, c90Var.f107527m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.c90();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f107528n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f107521d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f107522e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f107523f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f107524g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f107525h);
            }
            java.lang.String str4 = this.f107526i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f107527m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f107521d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f107522e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f107523f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f107524g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f107525h);
            }
            java.lang.String str9 = this.f107526i;
            if (str9 != null && zArr[6]) {
                i18 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f107527m;
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
                this.f107521d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107522e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107523f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107524g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f107525h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107526i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f107527m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
