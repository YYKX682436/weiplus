package bw5;

/* loaded from: classes9.dex */
public class g8 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f109244d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f109245e;

    /* renamed from: f, reason: collision with root package name */
    public int f109246f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f109247g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f109248h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f109249i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f109250m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f109251n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f109252o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f109253p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f109254q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f109255r = new boolean[12];

    static {
        new bw5.g8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.g8 mo11468x92b714fd(byte[] bArr) {
        return (bw5.g8) super.mo11468x92b714fd(bArr);
    }

    public bw5.g8 c(java.lang.String str) {
        this.f109252o = str;
        this.f109255r[9] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.g8)) {
            return false;
        }
        bw5.g8 g8Var = (bw5.g8) fVar;
        return n51.f.a(this.f109244d, g8Var.f109244d) && n51.f.a(java.lang.Boolean.valueOf(this.f109245e), java.lang.Boolean.valueOf(g8Var.f109245e)) && n51.f.a(java.lang.Integer.valueOf(this.f109246f), java.lang.Integer.valueOf(g8Var.f109246f)) && n51.f.a(java.lang.Boolean.valueOf(this.f109247g), java.lang.Boolean.valueOf(g8Var.f109247g)) && n51.f.a(java.lang.Boolean.valueOf(this.f109248h), java.lang.Boolean.valueOf(g8Var.f109248h)) && n51.f.a(java.lang.Boolean.valueOf(this.f109249i), java.lang.Boolean.valueOf(g8Var.f109249i)) && n51.f.a(java.lang.Boolean.valueOf(this.f109250m), java.lang.Boolean.valueOf(g8Var.f109250m)) && n51.f.a(this.f109251n, g8Var.f109251n) && n51.f.a(this.f109252o, g8Var.f109252o) && n51.f.a(java.lang.Boolean.valueOf(this.f109253p), java.lang.Boolean.valueOf(g8Var.f109253p)) && n51.f.a(java.lang.Boolean.valueOf(this.f109254q), java.lang.Boolean.valueOf(g8Var.f109254q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.g8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f109255r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f109244d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.a(2, this.f109245e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f109246f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f109247g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f109248h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f109249i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f109250m);
            }
            java.lang.String str2 = this.f109251n;
            if (str2 != null && zArr[8]) {
                fVar.j(8, str2);
            }
            java.lang.String str3 = this.f109252o;
            if (str3 != null && zArr[9]) {
                fVar.j(9, str3);
            }
            if (zArr[10]) {
                fVar.a(10, this.f109253p);
            }
            if (zArr[11]) {
                fVar.a(11, this.f109254q);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f109244d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f109245e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f109246f);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f109247g);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f109248h);
            }
            if (zArr[6]) {
                i18 += b36.f.a(6, this.f109249i);
            }
            if (zArr[7]) {
                i18 += b36.f.a(7, this.f109250m);
            }
            java.lang.String str5 = this.f109251n;
            if (str5 != null && zArr[8]) {
                i18 += b36.f.j(8, str5);
            }
            java.lang.String str6 = this.f109252o;
            if (str6 != null && zArr[9]) {
                i18 += b36.f.j(9, str6);
            }
            if (zArr[10]) {
                i18 += b36.f.a(10, this.f109253p);
            }
            return zArr[11] ? i18 + b36.f.a(11, this.f109254q) : i18;
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
                this.f109244d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109245e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109246f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109247g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f109248h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109249i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f109250m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f109251n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f109252o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f109253p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f109254q = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
