package bw5;

/* loaded from: classes2.dex */
public class es0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public final boolean[] A = new boolean[21];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f108569d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f108570e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f108571f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f108572g;

    /* renamed from: h, reason: collision with root package name */
    public long f108573h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f108574i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f108575m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f108576n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f108577o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f108578p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f108579q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f108580r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f108581s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f108582t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f108583u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f108584v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f108585w;

    /* renamed from: x, reason: collision with root package name */
    public long f108586x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f108587y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f108588z;

    static {
        new bw5.es0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.es0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.es0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.es0)) {
            return false;
        }
        bw5.es0 es0Var = (bw5.es0) fVar;
        return n51.f.a(this.f108569d, es0Var.f108569d) && n51.f.a(this.f108570e, es0Var.f108570e) && n51.f.a(this.f108571f, es0Var.f108571f) && n51.f.a(this.f108572g, es0Var.f108572g) && n51.f.a(java.lang.Long.valueOf(this.f108573h), java.lang.Long.valueOf(es0Var.f108573h)) && n51.f.a(this.f108574i, es0Var.f108574i) && n51.f.a(this.f108575m, es0Var.f108575m) && n51.f.a(this.f108576n, es0Var.f108576n) && n51.f.a(this.f108577o, es0Var.f108577o) && n51.f.a(this.f108578p, es0Var.f108578p) && n51.f.a(this.f108579q, es0Var.f108579q) && n51.f.a(this.f108580r, es0Var.f108580r) && n51.f.a(this.f108581s, es0Var.f108581s) && n51.f.a(this.f108582t, es0Var.f108582t) && n51.f.a(this.f108583u, es0Var.f108583u) && n51.f.a(this.f108584v, es0Var.f108584v) && n51.f.a(this.f108585w, es0Var.f108585w) && n51.f.a(java.lang.Long.valueOf(this.f108586x), java.lang.Long.valueOf(es0Var.f108586x)) && n51.f.a(this.f108587y, es0Var.f108587y) && n51.f.a(this.f108588z, es0Var.f108588z);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.es0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.A;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f108569d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f108570e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f108571f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f108572g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            if (zArr[5]) {
                fVar.h(5, this.f108573h);
            }
            java.lang.String str5 = this.f108574i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f108575m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f108576n;
            if (str7 != null && zArr[8]) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f108577o;
            if (str8 != null && zArr[9]) {
                fVar.j(9, str8);
            }
            java.lang.String str9 = this.f108578p;
            if (str9 != null && zArr[10]) {
                fVar.j(10, str9);
            }
            java.lang.String str10 = this.f108579q;
            if (str10 != null && zArr[11]) {
                fVar.j(11, str10);
            }
            java.lang.String str11 = this.f108580r;
            if (str11 != null && zArr[12]) {
                fVar.j(12, str11);
            }
            java.lang.String str12 = this.f108581s;
            if (str12 != null && zArr[13]) {
                fVar.j(13, str12);
            }
            java.lang.String str13 = this.f108582t;
            if (str13 != null && zArr[14]) {
                fVar.j(14, str13);
            }
            java.lang.String str14 = this.f108583u;
            if (str14 != null && zArr[15]) {
                fVar.j(15, str14);
            }
            java.lang.String str15 = this.f108584v;
            if (str15 != null && zArr[16]) {
                fVar.j(16, str15);
            }
            java.lang.String str16 = this.f108585w;
            if (str16 != null && zArr[17]) {
                fVar.j(17, str16);
            }
            if (zArr[18]) {
                fVar.h(18, this.f108586x);
            }
            java.lang.String str17 = this.f108587y;
            if (str17 != null && zArr[19]) {
                fVar.j(19, str17);
            }
            java.lang.String str18 = this.f108588z;
            if (str18 != null && zArr[20]) {
                fVar.j(20, str18);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str19 = this.f108569d;
            if (str19 != null && zArr[1]) {
                i18 = b36.f.j(1, str19) + 0;
            }
            java.lang.String str20 = this.f108570e;
            if (str20 != null && zArr[2]) {
                i18 += b36.f.j(2, str20);
            }
            java.lang.String str21 = this.f108571f;
            if (str21 != null && zArr[3]) {
                i18 += b36.f.j(3, str21);
            }
            java.lang.String str22 = this.f108572g;
            if (str22 != null && zArr[4]) {
                i18 += b36.f.j(4, str22);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f108573h);
            }
            java.lang.String str23 = this.f108574i;
            if (str23 != null && zArr[6]) {
                i18 += b36.f.j(6, str23);
            }
            java.lang.String str24 = this.f108575m;
            if (str24 != null && zArr[7]) {
                i18 += b36.f.j(7, str24);
            }
            java.lang.String str25 = this.f108576n;
            if (str25 != null && zArr[8]) {
                i18 += b36.f.j(8, str25);
            }
            java.lang.String str26 = this.f108577o;
            if (str26 != null && zArr[9]) {
                i18 += b36.f.j(9, str26);
            }
            java.lang.String str27 = this.f108578p;
            if (str27 != null && zArr[10]) {
                i18 += b36.f.j(10, str27);
            }
            java.lang.String str28 = this.f108579q;
            if (str28 != null && zArr[11]) {
                i18 += b36.f.j(11, str28);
            }
            java.lang.String str29 = this.f108580r;
            if (str29 != null && zArr[12]) {
                i18 += b36.f.j(12, str29);
            }
            java.lang.String str30 = this.f108581s;
            if (str30 != null && zArr[13]) {
                i18 += b36.f.j(13, str30);
            }
            java.lang.String str31 = this.f108582t;
            if (str31 != null && zArr[14]) {
                i18 += b36.f.j(14, str31);
            }
            java.lang.String str32 = this.f108583u;
            if (str32 != null && zArr[15]) {
                i18 += b36.f.j(15, str32);
            }
            java.lang.String str33 = this.f108584v;
            if (str33 != null && zArr[16]) {
                i18 += b36.f.j(16, str33);
            }
            java.lang.String str34 = this.f108585w;
            if (str34 != null && zArr[17]) {
                i18 += b36.f.j(17, str34);
            }
            if (zArr[18]) {
                i18 += b36.f.h(18, this.f108586x);
            }
            java.lang.String str35 = this.f108587y;
            if (str35 != null && zArr[19]) {
                i18 += b36.f.j(19, str35);
            }
            java.lang.String str36 = this.f108588z;
            return (str36 == null || !zArr[20]) ? i18 : i18 + b36.f.j(20, str36);
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
                this.f108569d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108570e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108571f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108572g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108573h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108574i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f108575m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f108576n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f108577o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f108578p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f108579q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f108580r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f108581s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f108582t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f108583u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f108584v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f108585w = aVar2.k(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f108586x = aVar2.i(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f108587y = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f108588z = aVar2.k(intValue);
                zArr[20] = true;
                return 0;
            default:
                return -1;
        }
    }
}
