package bw5;

/* loaded from: classes10.dex */
public class lb0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111246d;

    /* renamed from: e, reason: collision with root package name */
    public int f111247e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f111248f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f111249g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f111250h;

    /* renamed from: i, reason: collision with root package name */
    public int f111251i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f111252m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f111253n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f111254o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f111255p;

    /* renamed from: q, reason: collision with root package name */
    public int f111256q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f111257r = new boolean[12];

    static {
        new bw5.lb0();
    }

    public java.lang.String b() {
        return this.f111257r[5] ? this.f111250h : "";
    }

    public java.lang.String c() {
        return this.f111257r[7] ? this.f111252m : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lb0)) {
            return false;
        }
        bw5.lb0 lb0Var = (bw5.lb0) fVar;
        return n51.f.a(this.f111246d, lb0Var.f111246d) && n51.f.a(java.lang.Integer.valueOf(this.f111247e), java.lang.Integer.valueOf(lb0Var.f111247e)) && n51.f.a(this.f111248f, lb0Var.f111248f) && n51.f.a(this.f111249g, lb0Var.f111249g) && n51.f.a(this.f111250h, lb0Var.f111250h) && n51.f.a(java.lang.Integer.valueOf(this.f111251i), java.lang.Integer.valueOf(lb0Var.f111251i)) && n51.f.a(this.f111252m, lb0Var.f111252m) && n51.f.a(this.f111253n, lb0Var.f111253n) && n51.f.a(this.f111254o, lb0Var.f111254o) && n51.f.a(this.f111255p, lb0Var.f111255p) && n51.f.a(java.lang.Integer.valueOf(this.f111256q), java.lang.Integer.valueOf(lb0Var.f111256q));
    }

    public java.lang.String d() {
        return this.f111257r[8] ? this.f111253n : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public bw5.lb0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.lb0) super.mo11468x92b714fd(bArr);
    }

    /* renamed from: getListenId */
    public java.lang.String m12396xcc16feb8() {
        return this.f111257r[1] ? this.f111246d : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.lb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f111257r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f111246d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f111247e);
            }
            java.lang.String str2 = this.f111248f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f111249g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f111250h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            if (zArr[6]) {
                fVar.e(6, this.f111251i);
            }
            java.lang.String str5 = this.f111252m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f111253n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f111254o;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f111255p;
            if (gVar != null && zArr[10]) {
                fVar.b(10, gVar);
            }
            if (zArr[11]) {
                fVar.e(11, this.f111256q);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f111246d;
            if (str8 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str8);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f111247e);
            }
            java.lang.String str9 = this.f111248f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f111249g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f111250h;
            if (str11 != null && zArr[5]) {
                i18 += b36.f.j(5, str11);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f111251i);
            }
            java.lang.String str12 = this.f111252m;
            if (str12 != null && zArr[7]) {
                i18 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f111253n;
            if (str13 != null && zArr[8]) {
                i18 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f111254o;
            if (str14 != null && zArr[9]) {
                i18 += b36.f.j(9, str14);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f111255p;
            if (gVar2 != null && zArr[10]) {
                i18 += b36.f.b(10, gVar2);
            }
            return zArr[11] ? i18 + b36.f.e(11, this.f111256q) : i18;
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
                this.f111246d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111247e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f111248f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f111249g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f111250h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f111251i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f111252m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f111253n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f111254o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f111255p = aVar2.d(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f111256q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
