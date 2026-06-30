package bw5;

/* loaded from: classes2.dex */
public class v00 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f115629d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f115630e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.q00 f115631f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f115632g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f115633h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f115634i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f115635m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f115636n;

    /* renamed from: o, reason: collision with root package name */
    public int f115637o;

    /* renamed from: p, reason: collision with root package name */
    public int f115638p;

    /* renamed from: q, reason: collision with root package name */
    public int f115639q;

    /* renamed from: r, reason: collision with root package name */
    public int f115640r;

    /* renamed from: s, reason: collision with root package name */
    public int f115641s;

    /* renamed from: t, reason: collision with root package name */
    public int f115642t;

    /* renamed from: u, reason: collision with root package name */
    public int f115643u;

    /* renamed from: v, reason: collision with root package name */
    public int f115644v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f115645w = new boolean[19];

    static {
        new bw5.v00();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.v00 mo11468x92b714fd(byte[] bArr) {
        return (bw5.v00) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.v00)) {
            return false;
        }
        bw5.v00 v00Var = (bw5.v00) fVar;
        return n51.f.a(this.f115629d, v00Var.f115629d) && n51.f.a(this.f115630e, v00Var.f115630e) && n51.f.a(this.f115631f, v00Var.f115631f) && n51.f.a(this.f115632g, v00Var.f115632g) && n51.f.a(this.f115633h, v00Var.f115633h) && n51.f.a(this.f115634i, v00Var.f115634i) && n51.f.a(this.f115635m, v00Var.f115635m) && n51.f.a(this.f115636n, v00Var.f115636n) && n51.f.a(java.lang.Integer.valueOf(this.f115637o), java.lang.Integer.valueOf(v00Var.f115637o)) && n51.f.a(java.lang.Integer.valueOf(this.f115638p), java.lang.Integer.valueOf(v00Var.f115638p)) && n51.f.a(java.lang.Integer.valueOf(this.f115639q), java.lang.Integer.valueOf(v00Var.f115639q)) && n51.f.a(java.lang.Integer.valueOf(this.f115640r), java.lang.Integer.valueOf(v00Var.f115640r)) && n51.f.a(java.lang.Integer.valueOf(this.f115641s), java.lang.Integer.valueOf(v00Var.f115641s)) && n51.f.a(java.lang.Integer.valueOf(this.f115642t), java.lang.Integer.valueOf(v00Var.f115642t)) && n51.f.a(java.lang.Integer.valueOf(this.f115643u), java.lang.Integer.valueOf(v00Var.f115643u)) && n51.f.a(java.lang.Integer.valueOf(this.f115644v), java.lang.Integer.valueOf(v00Var.f115644v));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.v00();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f115645w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f115629d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f115630e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            bw5.q00 q00Var = this.f115631f;
            if (q00Var != null && zArr[3]) {
                fVar.i(3, q00Var.mo75928xcd1e8d8());
                this.f115631f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f115632g;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f115633h;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f115634i;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f115635m;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f115636n;
            if (str7 != null && zArr[10]) {
                fVar.j(10, str7);
            }
            if (zArr[11]) {
                fVar.e(11, this.f115637o);
            }
            if (zArr[12]) {
                fVar.e(12, this.f115638p);
            }
            if (zArr[13]) {
                fVar.e(13, this.f115639q);
            }
            if (zArr[14]) {
                fVar.e(14, this.f115640r);
            }
            if (zArr[15]) {
                fVar.e(15, this.f115641s);
            }
            if (zArr[16]) {
                fVar.e(16, this.f115642t);
            }
            if (zArr[17]) {
                fVar.e(17, this.f115643u);
            }
            if (zArr[18]) {
                fVar.e(18, this.f115644v);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f115629d;
            if (str8 != null && zArr[1]) {
                i18 = b36.f.j(1, str8) + 0;
            }
            java.lang.String str9 = this.f115630e;
            if (str9 != null && zArr[2]) {
                i18 += b36.f.j(2, str9);
            }
            bw5.q00 q00Var2 = this.f115631f;
            if (q00Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, q00Var2.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.f115632g;
            if (str10 != null && zArr[6]) {
                i18 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f115633h;
            if (str11 != null && zArr[7]) {
                i18 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f115634i;
            if (str12 != null && zArr[8]) {
                i18 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f115635m;
            if (str13 != null && zArr[9]) {
                i18 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f115636n;
            if (str14 != null && zArr[10]) {
                i18 += b36.f.j(10, str14);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f115637o);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f115638p);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f115639q);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f115640r);
            }
            if (zArr[15]) {
                i18 += b36.f.e(15, this.f115641s);
            }
            if (zArr[16]) {
                i18 += b36.f.e(16, this.f115642t);
            }
            if (zArr[17]) {
                i18 += b36.f.e(17, this.f115643u);
            }
            return zArr[18] ? i18 + b36.f.e(18, this.f115644v) : i18;
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
                this.f115629d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f115630e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.q00 q00Var3 = new bw5.q00();
                    if (bArr != null && bArr.length > 0) {
                        q00Var3.mo11468x92b714fd(bArr);
                    }
                    this.f115631f = q00Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
            case 5:
            default:
                return -1;
            case 6:
                this.f115632g = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f115633h = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f115634i = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f115635m = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f115636n = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f115637o = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f115638p = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f115639q = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f115640r = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f115641s = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f115642t = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f115643u = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f115644v = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
        }
    }
}
