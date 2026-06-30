package bw5;

/* loaded from: classes2.dex */
public class tb0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f114881d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f114882e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f114883f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f114884g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f114885h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f114886i;

    /* renamed from: m, reason: collision with root package name */
    public int f114887m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f114888n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f114889o;

    /* renamed from: p, reason: collision with root package name */
    public int f114890p;

    /* renamed from: q, reason: collision with root package name */
    public int f114891q;

    /* renamed from: r, reason: collision with root package name */
    public int f114892r;

    /* renamed from: s, reason: collision with root package name */
    public int f114893s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f114894t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.xa0 f114895u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.g60 f114896v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f114897w = new boolean[18];

    static {
        new bw5.tb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tb0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.tb0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tb0)) {
            return false;
        }
        bw5.tb0 tb0Var = (bw5.tb0) fVar;
        return n51.f.a(this.f114881d, tb0Var.f114881d) && n51.f.a(this.f114882e, tb0Var.f114882e) && n51.f.a(this.f114883f, tb0Var.f114883f) && n51.f.a(this.f114884g, tb0Var.f114884g) && n51.f.a(this.f114885h, tb0Var.f114885h) && n51.f.a(this.f114886i, tb0Var.f114886i) && n51.f.a(java.lang.Integer.valueOf(this.f114887m), java.lang.Integer.valueOf(tb0Var.f114887m)) && n51.f.a(this.f114888n, tb0Var.f114888n) && n51.f.a(java.lang.Boolean.valueOf(this.f114889o), java.lang.Boolean.valueOf(tb0Var.f114889o)) && n51.f.a(java.lang.Integer.valueOf(this.f114890p), java.lang.Integer.valueOf(tb0Var.f114890p)) && n51.f.a(java.lang.Integer.valueOf(this.f114891q), java.lang.Integer.valueOf(tb0Var.f114891q)) && n51.f.a(java.lang.Integer.valueOf(this.f114892r), java.lang.Integer.valueOf(tb0Var.f114892r)) && n51.f.a(java.lang.Integer.valueOf(this.f114893s), java.lang.Integer.valueOf(tb0Var.f114893s)) && n51.f.a(java.lang.Boolean.valueOf(this.f114894t), java.lang.Boolean.valueOf(tb0Var.f114894t)) && n51.f.a(this.f114895u, tb0Var.f114895u) && n51.f.a(this.f114896v, tb0Var.f114896v);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.tb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f114897w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f114881d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f114882e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f114883f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f114884g;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f114885h;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f114886i;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            if (zArr[8]) {
                fVar.e(8, this.f114887m);
            }
            java.lang.String str7 = this.f114888n;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            if (zArr[10]) {
                fVar.a(10, this.f114889o);
            }
            if (zArr[11]) {
                fVar.e(11, this.f114890p);
            }
            if (zArr[12]) {
                fVar.e(12, this.f114891q);
            }
            if (zArr[13]) {
                fVar.e(13, this.f114892r);
            }
            if (zArr[14]) {
                fVar.e(14, this.f114893s);
            }
            if (zArr[15]) {
                fVar.a(15, this.f114894t);
            }
            bw5.xa0 xa0Var = this.f114895u;
            if (xa0Var != null && zArr[16]) {
                fVar.i(16, xa0Var.mo75928xcd1e8d8());
                this.f114895u.mo75956x3d5d1f78(fVar);
            }
            bw5.g60 g60Var = this.f114896v;
            if (g60Var != null && zArr[17]) {
                fVar.i(17, g60Var.mo75928xcd1e8d8());
                this.f114896v.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f114881d;
            if (str8 != null && zArr[1]) {
                i18 = b36.f.j(1, str8) + 0;
            }
            java.lang.String str9 = this.f114882e;
            if (str9 != null && zArr[2]) {
                i18 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f114883f;
            if (str10 != null && zArr[3]) {
                i18 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f114884g;
            if (str11 != null && zArr[5]) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f114885h;
            if (str12 != null && zArr[6]) {
                i18 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f114886i;
            if (str13 != null && zArr[7]) {
                i18 += b36.f.j(7, str13);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f114887m);
            }
            java.lang.String str14 = this.f114888n;
            if (str14 != null && zArr[9]) {
                i18 += b36.f.j(9, str14);
            }
            if (zArr[10]) {
                i18 += b36.f.a(10, this.f114889o);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f114890p);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f114891q);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f114892r);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f114893s);
            }
            if (zArr[15]) {
                i18 += b36.f.a(15, this.f114894t);
            }
            bw5.xa0 xa0Var2 = this.f114895u;
            if (xa0Var2 != null && zArr[16]) {
                i18 += b36.f.i(16, xa0Var2.mo75928xcd1e8d8());
            }
            bw5.g60 g60Var2 = this.f114896v;
            return (g60Var2 == null || !zArr[17]) ? i18 : i18 + b36.f.i(17, g60Var2.mo75928xcd1e8d8());
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
                this.f114881d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f114882e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f114883f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
            default:
                return -1;
            case 5:
                this.f114884g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f114885h = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f114886i = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f114887m = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f114888n = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f114889o = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f114890p = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f114891q = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f114892r = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f114893s = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f114894t = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.xa0 xa0Var3 = new bw5.xa0();
                    if (bArr != null && bArr.length > 0) {
                        xa0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f114895u = xa0Var3;
                }
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.g60 g60Var3 = new bw5.g60();
                    if (bArr2 != null && bArr2.length > 0) {
                        g60Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f114896v = g60Var3;
                }
                zArr[17] = true;
                return 0;
        }
    }
}
