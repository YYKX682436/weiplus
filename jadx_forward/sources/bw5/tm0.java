package bw5;

/* loaded from: classes2.dex */
public class tm0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f115049d;

    /* renamed from: e, reason: collision with root package name */
    public int f115050e;

    /* renamed from: f, reason: collision with root package name */
    public int f115051f;

    /* renamed from: g, reason: collision with root package name */
    public long f115052g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f115053h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f115054i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f115055m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f115056n;

    /* renamed from: o, reason: collision with root package name */
    public int f115057o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f115058p = new boolean[10];

    static {
        new bw5.tm0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tm0)) {
            return false;
        }
        bw5.tm0 tm0Var = (bw5.tm0) fVar;
        return n51.f.a(this.f115049d, tm0Var.f115049d) && n51.f.a(java.lang.Integer.valueOf(this.f115050e), java.lang.Integer.valueOf(tm0Var.f115050e)) && n51.f.a(java.lang.Integer.valueOf(this.f115051f), java.lang.Integer.valueOf(tm0Var.f115051f)) && n51.f.a(java.lang.Long.valueOf(this.f115052g), java.lang.Long.valueOf(tm0Var.f115052g)) && n51.f.a(java.lang.Boolean.valueOf(this.f115053h), java.lang.Boolean.valueOf(tm0Var.f115053h)) && n51.f.a(this.f115054i, tm0Var.f115054i) && n51.f.a(this.f115055m, tm0Var.f115055m) && n51.f.a(this.f115056n, tm0Var.f115056n) && n51.f.a(java.lang.Integer.valueOf(this.f115057o), java.lang.Integer.valueOf(tm0Var.f115057o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.tm0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f115058p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f115049d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f115050e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f115051f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f115052g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f115053h);
            }
            java.lang.String str2 = this.f115054i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f115055m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f115056n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            if (zArr[9]) {
                fVar.e(9, this.f115057o);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f115049d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f115050e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f115051f);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f115052g);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f115053h);
            }
            java.lang.String str6 = this.f115054i;
            if (str6 != null && zArr[6]) {
                i18 += b36.f.j(6, str6);
            }
            java.lang.String str7 = this.f115055m;
            if (str7 != null && zArr[7]) {
                i18 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f115056n;
            if (str8 != null && zArr[8]) {
                i18 += b36.f.j(8, str8);
            }
            return zArr[9] ? i18 + b36.f.e(9, this.f115057o) : i18;
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
                this.f115049d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f115050e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f115051f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f115052g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115053h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f115054i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f115055m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f115056n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f115057o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.tm0) super.mo11468x92b714fd(bArr);
    }
}
