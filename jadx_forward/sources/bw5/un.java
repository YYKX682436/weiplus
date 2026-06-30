package bw5;

/* loaded from: classes2.dex */
public class un extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f115522d;

    /* renamed from: e, reason: collision with root package name */
    public float f115523e;

    /* renamed from: f, reason: collision with root package name */
    public float f115524f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f115525g;

    /* renamed from: h, reason: collision with root package name */
    public long f115526h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f115527i;

    /* renamed from: m, reason: collision with root package name */
    public int f115528m;

    /* renamed from: n, reason: collision with root package name */
    public int f115529n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f115530o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f115531p = new boolean[10];

    static {
        new bw5.un();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.un mo11468x92b714fd(byte[] bArr) {
        return (bw5.un) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.un)) {
            return false;
        }
        bw5.un unVar = (bw5.un) fVar;
        return n51.f.a(this.f115522d, unVar.f115522d) && n51.f.a(java.lang.Float.valueOf(this.f115523e), java.lang.Float.valueOf(unVar.f115523e)) && n51.f.a(java.lang.Float.valueOf(this.f115524f), java.lang.Float.valueOf(unVar.f115524f)) && n51.f.a(this.f115525g, unVar.f115525g) && n51.f.a(java.lang.Long.valueOf(this.f115526h), java.lang.Long.valueOf(unVar.f115526h)) && n51.f.a(this.f115527i, unVar.f115527i) && n51.f.a(java.lang.Integer.valueOf(this.f115528m), java.lang.Integer.valueOf(unVar.f115528m)) && n51.f.a(java.lang.Integer.valueOf(this.f115529n), java.lang.Integer.valueOf(unVar.f115529n)) && n51.f.a(this.f115530o, unVar.f115530o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.un();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f115531p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f115522d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.d(2, this.f115523e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f115524f);
            }
            java.lang.String str2 = this.f115525g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.h(5, this.f115526h);
            }
            java.lang.String str3 = this.f115527i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            if (zArr[7]) {
                fVar.e(7, this.f115528m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f115529n);
            }
            java.lang.String str4 = this.f115530o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f115522d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            if (zArr[2]) {
                i18 += b36.f.d(2, this.f115523e);
            }
            if (zArr[3]) {
                i18 += b36.f.d(3, this.f115524f);
            }
            java.lang.String str6 = this.f115525g;
            if (str6 != null && zArr[4]) {
                i18 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f115526h);
            }
            java.lang.String str7 = this.f115527i;
            if (str7 != null && zArr[6]) {
                i18 += b36.f.j(6, str7);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f115528m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f115529n);
            }
            java.lang.String str8 = this.f115530o;
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
                this.f115522d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f115523e = aVar2.f(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f115524f = aVar2.f(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f115525g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115526h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f115527i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f115528m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f115529n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f115530o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
