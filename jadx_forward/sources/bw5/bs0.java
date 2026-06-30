package bw5;

/* loaded from: classes2.dex */
public class bs0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f107364d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107365e;

    /* renamed from: f, reason: collision with root package name */
    public int f107366f;

    /* renamed from: g, reason: collision with root package name */
    public int f107367g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f107368h;

    /* renamed from: i, reason: collision with root package name */
    public int f107369i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f107370m;

    /* renamed from: n, reason: collision with root package name */
    public int f107371n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f107372o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f107373p = new boolean[10];

    static {
        new bw5.bs0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bs0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.bs0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bs0)) {
            return false;
        }
        bw5.bs0 bs0Var = (bw5.bs0) fVar;
        return n51.f.a(this.f107364d, bs0Var.f107364d) && n51.f.a(this.f107365e, bs0Var.f107365e) && n51.f.a(java.lang.Integer.valueOf(this.f107366f), java.lang.Integer.valueOf(bs0Var.f107366f)) && n51.f.a(java.lang.Integer.valueOf(this.f107367g), java.lang.Integer.valueOf(bs0Var.f107367g)) && n51.f.a(this.f107368h, bs0Var.f107368h) && n51.f.a(java.lang.Integer.valueOf(this.f107369i), java.lang.Integer.valueOf(bs0Var.f107369i)) && n51.f.a(this.f107370m, bs0Var.f107370m) && n51.f.a(java.lang.Integer.valueOf(this.f107371n), java.lang.Integer.valueOf(bs0Var.f107371n)) && n51.f.a(this.f107372o, bs0Var.f107372o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.bs0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f107373p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f107364d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f107365e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f107366f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f107367g);
            }
            java.lang.String str3 = this.f107368h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            if (zArr[6]) {
                fVar.e(6, this.f107369i);
            }
            java.lang.String str4 = this.f107370m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            if (zArr[8]) {
                fVar.e(8, this.f107371n);
            }
            java.lang.String str5 = this.f107372o;
            if (str5 != null && zArr[9]) {
                fVar.j(9, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f107364d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f107365e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f107366f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f107367g);
            }
            java.lang.String str8 = this.f107368h;
            if (str8 != null && zArr[5]) {
                i18 += b36.f.j(5, str8);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f107369i);
            }
            java.lang.String str9 = this.f107370m;
            if (str9 != null && zArr[7]) {
                i18 += b36.f.j(7, str9);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f107371n);
            }
            java.lang.String str10 = this.f107372o;
            return (str10 == null || !zArr[9]) ? i18 : i18 + b36.f.j(9, str10);
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
                this.f107364d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107365e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107366f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107367g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f107368h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107369i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f107370m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f107371n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f107372o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
