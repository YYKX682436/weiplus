package bw5;

/* loaded from: classes2.dex */
public class b40 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f107043d;

    /* renamed from: e, reason: collision with root package name */
    public float f107044e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107045f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f107046g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f107047h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f107048i;

    /* renamed from: m, reason: collision with root package name */
    public int f107049m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f107050n;

    /* renamed from: o, reason: collision with root package name */
    public int f107051o;

    /* renamed from: p, reason: collision with root package name */
    public int f107052p;

    /* renamed from: q, reason: collision with root package name */
    public int f107053q;

    /* renamed from: r, reason: collision with root package name */
    public float f107054r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f107055s;

    /* renamed from: t, reason: collision with root package name */
    public int f107056t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f107057u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f107058v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f107059w = new boolean[17];

    static {
        new bw5.b40();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.b40 mo11468x92b714fd(byte[] bArr) {
        return (bw5.b40) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.b40)) {
            return false;
        }
        bw5.b40 b40Var = (bw5.b40) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f107043d), java.lang.Float.valueOf(b40Var.f107043d)) && n51.f.a(java.lang.Float.valueOf(this.f107044e), java.lang.Float.valueOf(b40Var.f107044e)) && n51.f.a(this.f107045f, b40Var.f107045f) && n51.f.a(this.f107046g, b40Var.f107046g) && n51.f.a(this.f107047h, b40Var.f107047h) && n51.f.a(this.f107048i, b40Var.f107048i) && n51.f.a(java.lang.Integer.valueOf(this.f107049m), java.lang.Integer.valueOf(b40Var.f107049m)) && n51.f.a(this.f107050n, b40Var.f107050n) && n51.f.a(java.lang.Integer.valueOf(this.f107051o), java.lang.Integer.valueOf(b40Var.f107051o)) && n51.f.a(java.lang.Integer.valueOf(this.f107052p), java.lang.Integer.valueOf(b40Var.f107052p)) && n51.f.a(java.lang.Integer.valueOf(this.f107053q), java.lang.Integer.valueOf(b40Var.f107053q)) && n51.f.a(java.lang.Float.valueOf(this.f107054r), java.lang.Float.valueOf(b40Var.f107054r)) && n51.f.a(this.f107055s, b40Var.f107055s) && n51.f.a(java.lang.Integer.valueOf(this.f107056t), java.lang.Integer.valueOf(b40Var.f107056t)) && n51.f.a(this.f107057u, b40Var.f107057u) && n51.f.a(this.f107058v, b40Var.f107058v);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.b40();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107059w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f107043d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f107044e);
            }
            java.lang.String str = this.f107045f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f107046g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f107047h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f107048i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            if (zArr[7]) {
                fVar.e(7, this.f107049m);
            }
            java.lang.String str5 = this.f107050n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            if (zArr[9]) {
                fVar.e(9, this.f107051o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f107052p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f107053q);
            }
            if (zArr[12]) {
                fVar.d(12, this.f107054r);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f107055s;
            if (gVar != null && zArr[13]) {
                fVar.b(13, gVar);
            }
            if (zArr[14]) {
                fVar.e(14, this.f107056t);
            }
            java.lang.String str6 = this.f107057u;
            if (str6 != null && zArr[15]) {
                fVar.j(15, str6);
            }
            java.lang.String str7 = this.f107058v;
            if (str7 != null && zArr[16]) {
                fVar.j(16, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? b36.f.d(1, this.f107043d) + 0 : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f107044e);
            }
            java.lang.String str8 = this.f107045f;
            if (str8 != null && zArr[3]) {
                d17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f107046g;
            if (str9 != null && zArr[4]) {
                d17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f107047h;
            if (str10 != null && zArr[5]) {
                d17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f107048i;
            if (str11 != null && zArr[6]) {
                d17 += b36.f.j(6, str11);
            }
            if (zArr[7]) {
                d17 += b36.f.e(7, this.f107049m);
            }
            java.lang.String str12 = this.f107050n;
            if (str12 != null && zArr[8]) {
                d17 += b36.f.j(8, str12);
            }
            if (zArr[9]) {
                d17 += b36.f.e(9, this.f107051o);
            }
            if (zArr[10]) {
                d17 += b36.f.e(10, this.f107052p);
            }
            if (zArr[11]) {
                d17 += b36.f.e(11, this.f107053q);
            }
            if (zArr[12]) {
                d17 += b36.f.d(12, this.f107054r);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f107055s;
            if (gVar2 != null && zArr[13]) {
                d17 += b36.f.b(13, gVar2);
            }
            if (zArr[14]) {
                d17 += b36.f.e(14, this.f107056t);
            }
            java.lang.String str13 = this.f107057u;
            if (str13 != null && zArr[15]) {
                d17 += b36.f.j(15, str13);
            }
            java.lang.String str14 = this.f107058v;
            return (str14 == null || !zArr[16]) ? d17 : d17 + b36.f.j(16, str14);
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
                this.f107043d = aVar2.f(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107044e = aVar2.f(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107045f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107046g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f107047h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107048i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f107049m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f107050n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f107051o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f107052p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f107053q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f107054r = aVar2.f(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f107055s = aVar2.d(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f107056t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f107057u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f107058v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            default:
                return -1;
        }
    }
}
