package bw5;

/* loaded from: classes2.dex */
public class c50 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f107461d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107462e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107463f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f107464g;

    /* renamed from: h, reason: collision with root package name */
    public long f107465h;

    /* renamed from: i, reason: collision with root package name */
    public int f107466i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f107467m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f107468n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f107469o = new boolean[9];

    static {
        new bw5.c50();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.c50 mo11468x92b714fd(byte[] bArr) {
        return (bw5.c50) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.c50)) {
            return false;
        }
        bw5.c50 c50Var = (bw5.c50) fVar;
        return n51.f.a(this.f107461d, c50Var.f107461d) && n51.f.a(this.f107462e, c50Var.f107462e) && n51.f.a(this.f107463f, c50Var.f107463f) && n51.f.a(this.f107464g, c50Var.f107464g) && n51.f.a(java.lang.Long.valueOf(this.f107465h), java.lang.Long.valueOf(c50Var.f107465h)) && n51.f.a(java.lang.Integer.valueOf(this.f107466i), java.lang.Integer.valueOf(c50Var.f107466i)) && n51.f.a(this.f107467m, c50Var.f107467m) && n51.f.a(java.lang.Boolean.valueOf(this.f107468n), java.lang.Boolean.valueOf(c50Var.f107468n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.c50();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f107469o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f107461d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f107462e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f107463f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f107464g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            if (zArr[5]) {
                fVar.h(5, this.f107465h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f107466i);
            }
            java.lang.String str5 = this.f107467m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            if (zArr[8]) {
                fVar.a(8, this.f107468n);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f107461d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f107462e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f107463f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f107464g;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f107465h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f107466i);
            }
            java.lang.String str10 = this.f107467m;
            if (str10 != null && zArr[7]) {
                i18 += b36.f.j(7, str10);
            }
            return zArr[8] ? i18 + b36.f.a(8, this.f107468n) : i18;
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
                this.f107461d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107462e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107463f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107464g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f107465h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107466i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f107467m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f107468n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
