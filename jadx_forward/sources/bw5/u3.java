package bw5;

/* loaded from: classes2.dex */
public class u3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f115248d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f115249e;

    /* renamed from: f, reason: collision with root package name */
    public int f115250f;

    /* renamed from: g, reason: collision with root package name */
    public int f115251g;

    /* renamed from: h, reason: collision with root package name */
    public int f115252h;

    /* renamed from: i, reason: collision with root package name */
    public int f115253i;

    /* renamed from: m, reason: collision with root package name */
    public int f115254m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f115255n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f115256o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f115257p;

    /* renamed from: q, reason: collision with root package name */
    public long f115258q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f115259r = new boolean[12];

    static {
        new bw5.u3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.u3 mo11468x92b714fd(byte[] bArr) {
        return (bw5.u3) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.u3)) {
            return false;
        }
        bw5.u3 u3Var = (bw5.u3) fVar;
        return n51.f.a(this.f115248d, u3Var.f115248d) && n51.f.a(this.f115249e, u3Var.f115249e) && n51.f.a(java.lang.Integer.valueOf(this.f115250f), java.lang.Integer.valueOf(u3Var.f115250f)) && n51.f.a(java.lang.Integer.valueOf(this.f115251g), java.lang.Integer.valueOf(u3Var.f115251g)) && n51.f.a(java.lang.Integer.valueOf(this.f115252h), java.lang.Integer.valueOf(u3Var.f115252h)) && n51.f.a(java.lang.Integer.valueOf(this.f115253i), java.lang.Integer.valueOf(u3Var.f115253i)) && n51.f.a(java.lang.Integer.valueOf(this.f115254m), java.lang.Integer.valueOf(u3Var.f115254m)) && n51.f.a(this.f115255n, u3Var.f115255n) && n51.f.a(this.f115256o, u3Var.f115256o) && n51.f.a(this.f115257p, u3Var.f115257p) && n51.f.a(java.lang.Long.valueOf(this.f115258q), java.lang.Long.valueOf(u3Var.f115258q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.u3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f115259r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f115248d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f115249e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f115250f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f115251g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f115252h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f115253i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f115254m);
            }
            java.lang.String str3 = this.f115255n;
            if (str3 != null && zArr[8]) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f115256o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f115257p;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            if (zArr[11]) {
                fVar.h(11, this.f115258q);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f115248d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f115249e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f115250f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f115251g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f115252h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f115253i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f115254m);
            }
            java.lang.String str8 = this.f115255n;
            if (str8 != null && zArr[8]) {
                i18 += b36.f.j(8, str8);
            }
            java.lang.String str9 = this.f115256o;
            if (str9 != null && zArr[9]) {
                i18 += b36.f.j(9, str9);
            }
            java.lang.String str10 = this.f115257p;
            if (str10 != null && zArr[10]) {
                i18 += b36.f.j(10, str10);
            }
            return zArr[11] ? i18 + b36.f.h(11, this.f115258q) : i18;
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
                this.f115248d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f115249e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f115250f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f115251g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115252h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f115253i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f115254m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f115255n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f115256o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f115257p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f115258q = aVar2.i(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
