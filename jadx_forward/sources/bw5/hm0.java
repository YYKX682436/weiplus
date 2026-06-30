package bw5;

/* loaded from: classes2.dex */
public class hm0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f109806d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f109807e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f109808f;

    /* renamed from: g, reason: collision with root package name */
    public int f109809g;

    /* renamed from: h, reason: collision with root package name */
    public int f109810h;

    /* renamed from: i, reason: collision with root package name */
    public int f109811i;

    /* renamed from: m, reason: collision with root package name */
    public long f109812m;

    /* renamed from: n, reason: collision with root package name */
    public int f109813n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f109814o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f109815p = new boolean[10];

    static {
        new bw5.hm0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hm0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.hm0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hm0)) {
            return false;
        }
        bw5.hm0 hm0Var = (bw5.hm0) fVar;
        return n51.f.a(this.f109806d, hm0Var.f109806d) && n51.f.a(this.f109807e, hm0Var.f109807e) && n51.f.a(this.f109808f, hm0Var.f109808f) && n51.f.a(java.lang.Integer.valueOf(this.f109809g), java.lang.Integer.valueOf(hm0Var.f109809g)) && n51.f.a(java.lang.Integer.valueOf(this.f109810h), java.lang.Integer.valueOf(hm0Var.f109810h)) && n51.f.a(java.lang.Integer.valueOf(this.f109811i), java.lang.Integer.valueOf(hm0Var.f109811i)) && n51.f.a(java.lang.Long.valueOf(this.f109812m), java.lang.Long.valueOf(hm0Var.f109812m)) && n51.f.a(java.lang.Integer.valueOf(this.f109813n), java.lang.Integer.valueOf(hm0Var.f109813n)) && n51.f.a(this.f109814o, hm0Var.f109814o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.hm0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f109815p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f109806d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f109807e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f109808f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f109809g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f109810h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f109811i);
            }
            if (zArr[7]) {
                fVar.h(7, this.f109812m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f109813n);
            }
            java.lang.String str4 = this.f109814o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f109806d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f109807e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f109808f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f109809g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f109810h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f109811i);
            }
            if (zArr[7]) {
                i18 += b36.f.h(7, this.f109812m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f109813n);
            }
            java.lang.String str8 = this.f109814o;
            return (str8 == null || !zArr[9]) ? i18 : i18 + b36.f.j(9, str8);
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
                this.f109806d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109807e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109808f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109809g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f109810h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109811i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f109812m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f109813n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f109814o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
