package bw5;

/* loaded from: classes2.dex */
public class dd0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f107974d;

    /* renamed from: e, reason: collision with root package name */
    public float f107975e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107976f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f107977g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f107978h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f107979i;

    /* renamed from: m, reason: collision with root package name */
    public int f107980m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f107981n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f107982o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f107983p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f107984q = new boolean[11];

    static {
        new bw5.dd0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dd0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.dd0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dd0)) {
            return false;
        }
        bw5.dd0 dd0Var = (bw5.dd0) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f107974d), java.lang.Float.valueOf(dd0Var.f107974d)) && n51.f.a(java.lang.Float.valueOf(this.f107975e), java.lang.Float.valueOf(dd0Var.f107975e)) && n51.f.a(this.f107976f, dd0Var.f107976f) && n51.f.a(this.f107977g, dd0Var.f107977g) && n51.f.a(this.f107978h, dd0Var.f107978h) && n51.f.a(this.f107979i, dd0Var.f107979i) && n51.f.a(java.lang.Integer.valueOf(this.f107980m), java.lang.Integer.valueOf(dd0Var.f107980m)) && n51.f.a(this.f107981n, dd0Var.f107981n) && n51.f.a(this.f107982o, dd0Var.f107982o) && n51.f.a(this.f107983p, dd0Var.f107983p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.dd0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107984q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f107974d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f107975e);
            }
            java.lang.String str = this.f107976f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f107977g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f107978h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f107979i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            if (zArr[7]) {
                fVar.e(7, this.f107980m);
            }
            java.lang.String str5 = this.f107981n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f107982o;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f107983p;
            if (str7 != null && zArr[10]) {
                fVar.j(10, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f107974d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f107975e);
            }
            java.lang.String str8 = this.f107976f;
            if (str8 != null && zArr[3]) {
                d17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f107977g;
            if (str9 != null && zArr[4]) {
                d17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f107978h;
            if (str10 != null && zArr[5]) {
                d17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f107979i;
            if (str11 != null && zArr[6]) {
                d17 += b36.f.j(6, str11);
            }
            if (zArr[7]) {
                d17 += b36.f.e(7, this.f107980m);
            }
            java.lang.String str12 = this.f107981n;
            if (str12 != null && zArr[8]) {
                d17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f107982o;
            if (str13 != null && zArr[9]) {
                d17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f107983p;
            return (str14 == null || !zArr[10]) ? d17 : d17 + b36.f.j(10, str14);
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
                this.f107974d = aVar2.f(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107975e = aVar2.f(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107976f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107977g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f107978h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107979i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f107980m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f107981n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f107982o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f107983p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
