package bw5;

/* loaded from: classes2.dex */
public class tv extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public int A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public int F;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g G;
    public java.lang.String H;
    public bw5.ig0 I;

    /* renamed from: J, reason: collision with root package name */
    public int f115148J;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f115149d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f115150e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f115151f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f115152g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f115153h;

    /* renamed from: i, reason: collision with root package name */
    public int f115154i;

    /* renamed from: m, reason: collision with root package name */
    public int f115155m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f115157o;

    /* renamed from: p, reason: collision with root package name */
    public long f115158p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f115159q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f115160r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f115161s;

    /* renamed from: t, reason: collision with root package name */
    public int f115162t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f115163u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f115164v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f115165w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f115166x;

    /* renamed from: y, reason: collision with root package name */
    public int f115167y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f115168z;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f115156n = new java.util.LinkedList();
    public final boolean[] K = new boolean[31];

    static {
        new bw5.tv();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tv mo11468x92b714fd(byte[] bArr) {
        return (bw5.tv) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tv)) {
            return false;
        }
        bw5.tv tvVar = (bw5.tv) fVar;
        return n51.f.a(this.f115149d, tvVar.f115149d) && n51.f.a(this.f115150e, tvVar.f115150e) && n51.f.a(this.f115151f, tvVar.f115151f) && n51.f.a(this.f115152g, tvVar.f115152g) && n51.f.a(this.f115153h, tvVar.f115153h) && n51.f.a(java.lang.Integer.valueOf(this.f115154i), java.lang.Integer.valueOf(tvVar.f115154i)) && n51.f.a(java.lang.Integer.valueOf(this.f115155m), java.lang.Integer.valueOf(tvVar.f115155m)) && n51.f.a(this.f115156n, tvVar.f115156n) && n51.f.a(this.f115157o, tvVar.f115157o) && n51.f.a(java.lang.Long.valueOf(this.f115158p), java.lang.Long.valueOf(tvVar.f115158p)) && n51.f.a(this.f115159q, tvVar.f115159q) && n51.f.a(this.f115160r, tvVar.f115160r) && n51.f.a(this.f115161s, tvVar.f115161s) && n51.f.a(java.lang.Integer.valueOf(this.f115162t), java.lang.Integer.valueOf(tvVar.f115162t)) && n51.f.a(this.f115163u, tvVar.f115163u) && n51.f.a(this.f115164v, tvVar.f115164v) && n51.f.a(this.f115165w, tvVar.f115165w) && n51.f.a(this.f115166x, tvVar.f115166x) && n51.f.a(java.lang.Integer.valueOf(this.f115167y), java.lang.Integer.valueOf(tvVar.f115167y)) && n51.f.a(this.f115168z, tvVar.f115168z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(tvVar.A)) && n51.f.a(this.B, tvVar.B) && n51.f.a(this.C, tvVar.C) && n51.f.a(this.D, tvVar.D) && n51.f.a(this.E, tvVar.E) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(tvVar.F)) && n51.f.a(this.G, tvVar.G) && n51.f.a(this.H, tvVar.H) && n51.f.a(this.I, tvVar.I) && n51.f.a(java.lang.Integer.valueOf(this.f115148J), java.lang.Integer.valueOf(tvVar.f115148J));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.tv();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.K;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f115149d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f115150e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f115151f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f115152g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f115153h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.e(6, this.f115154i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f115155m);
            }
            fVar.g(8, 8, this.f115156n);
            java.lang.String str6 = this.f115157o;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            if (zArr[10]) {
                fVar.h(10, this.f115158p);
            }
            java.lang.String str7 = this.f115159q;
            if (str7 != null && zArr[11]) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f115160r;
            if (str8 != null && zArr[12]) {
                fVar.j(12, str8);
            }
            java.lang.String str9 = this.f115161s;
            if (str9 != null && zArr[13]) {
                fVar.j(13, str9);
            }
            if (zArr[14]) {
                fVar.e(14, this.f115162t);
            }
            java.lang.String str10 = this.f115163u;
            if (str10 != null && zArr[15]) {
                fVar.j(15, str10);
            }
            java.lang.String str11 = this.f115164v;
            if (str11 != null && zArr[16]) {
                fVar.j(16, str11);
            }
            java.lang.String str12 = this.f115165w;
            if (str12 != null && zArr[17]) {
                fVar.j(17, str12);
            }
            java.lang.String str13 = this.f115166x;
            if (str13 != null && zArr[18]) {
                fVar.j(18, str13);
            }
            if (zArr[19]) {
                fVar.e(19, this.f115167y);
            }
            java.lang.String str14 = this.f115168z;
            if (str14 != null && zArr[20]) {
                fVar.j(20, str14);
            }
            if (zArr[21]) {
                fVar.e(21, this.A);
            }
            java.lang.String str15 = this.B;
            if (str15 != null && zArr[22]) {
                fVar.j(22, str15);
            }
            java.lang.String str16 = this.C;
            if (str16 != null && zArr[23]) {
                fVar.j(23, str16);
            }
            java.lang.String str17 = this.D;
            if (str17 != null && zArr[24]) {
                fVar.j(24, str17);
            }
            java.lang.String str18 = this.E;
            if (str18 != null && zArr[25]) {
                fVar.j(25, str18);
            }
            if (zArr[26]) {
                fVar.e(26, this.F);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.G;
            if (gVar != null && zArr[27]) {
                fVar.b(27, gVar);
            }
            java.lang.String str19 = this.H;
            if (str19 != null && zArr[28]) {
                fVar.j(28, str19);
            }
            bw5.ig0 ig0Var = this.I;
            if (ig0Var != null && zArr[29]) {
                fVar.i(29, ig0Var.mo75928xcd1e8d8());
                this.I.mo75956x3d5d1f78(fVar);
            }
            if (zArr[30]) {
                fVar.e(30, this.f115148J);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str20 = this.f115149d;
            if (str20 != null && zArr[1]) {
                i18 = b36.f.j(1, str20) + 0;
            }
            java.lang.String str21 = this.f115150e;
            if (str21 != null && zArr[2]) {
                i18 += b36.f.j(2, str21);
            }
            java.lang.String str22 = this.f115151f;
            if (str22 != null && zArr[3]) {
                i18 += b36.f.j(3, str22);
            }
            java.lang.String str23 = this.f115152g;
            if (str23 != null && zArr[4]) {
                i18 += b36.f.j(4, str23);
            }
            java.lang.String str24 = this.f115153h;
            if (str24 != null && zArr[5]) {
                i18 += b36.f.j(5, str24);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f115154i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f115155m);
            }
            int g17 = i18 + b36.f.g(8, 8, this.f115156n);
            java.lang.String str25 = this.f115157o;
            if (str25 != null && zArr[9]) {
                g17 += b36.f.j(9, str25);
            }
            if (zArr[10]) {
                g17 += b36.f.h(10, this.f115158p);
            }
            java.lang.String str26 = this.f115159q;
            if (str26 != null && zArr[11]) {
                g17 += b36.f.j(11, str26);
            }
            java.lang.String str27 = this.f115160r;
            if (str27 != null && zArr[12]) {
                g17 += b36.f.j(12, str27);
            }
            java.lang.String str28 = this.f115161s;
            if (str28 != null && zArr[13]) {
                g17 += b36.f.j(13, str28);
            }
            if (zArr[14]) {
                g17 += b36.f.e(14, this.f115162t);
            }
            java.lang.String str29 = this.f115163u;
            if (str29 != null && zArr[15]) {
                g17 += b36.f.j(15, str29);
            }
            java.lang.String str30 = this.f115164v;
            if (str30 != null && zArr[16]) {
                g17 += b36.f.j(16, str30);
            }
            java.lang.String str31 = this.f115165w;
            if (str31 != null && zArr[17]) {
                g17 += b36.f.j(17, str31);
            }
            java.lang.String str32 = this.f115166x;
            if (str32 != null && zArr[18]) {
                g17 += b36.f.j(18, str32);
            }
            if (zArr[19]) {
                g17 += b36.f.e(19, this.f115167y);
            }
            java.lang.String str33 = this.f115168z;
            if (str33 != null && zArr[20]) {
                g17 += b36.f.j(20, str33);
            }
            if (zArr[21]) {
                g17 += b36.f.e(21, this.A);
            }
            java.lang.String str34 = this.B;
            if (str34 != null && zArr[22]) {
                g17 += b36.f.j(22, str34);
            }
            java.lang.String str35 = this.C;
            if (str35 != null && zArr[23]) {
                g17 += b36.f.j(23, str35);
            }
            java.lang.String str36 = this.D;
            if (str36 != null && zArr[24]) {
                g17 += b36.f.j(24, str36);
            }
            java.lang.String str37 = this.E;
            if (str37 != null && zArr[25]) {
                g17 += b36.f.j(25, str37);
            }
            if (zArr[26]) {
                g17 += b36.f.e(26, this.F);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.G;
            if (gVar2 != null && zArr[27]) {
                g17 += b36.f.b(27, gVar2);
            }
            java.lang.String str38 = this.H;
            if (str38 != null && zArr[28]) {
                g17 += b36.f.j(28, str38);
            }
            bw5.ig0 ig0Var2 = this.I;
            if (ig0Var2 != null && zArr[29]) {
                g17 += b36.f.i(29, ig0Var2.mo75928xcd1e8d8());
            }
            return zArr[30] ? g17 + b36.f.e(30, this.f115148J) : g17;
        }
        if (i17 == 2) {
            this.f115156n.clear();
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
                this.f115149d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f115150e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f115151f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f115152g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115153h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f115154i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f115155m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.sv svVar = new bw5.sv();
                    if (bArr != null && bArr.length > 0) {
                        svVar.mo11468x92b714fd(bArr);
                    }
                    this.f115156n.add(svVar);
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f115157o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f115158p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f115159q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f115160r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f115161s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f115162t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f115163u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f115164v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f115165w = aVar2.k(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f115166x = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f115167y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f115168z = aVar2.k(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.g(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.k(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.k(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.k(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                this.E = aVar2.k(intValue);
                zArr[25] = true;
                return 0;
            case 26:
                this.F = aVar2.g(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                this.G = aVar2.d(intValue);
                zArr[27] = true;
                return 0;
            case 28:
                this.H = aVar2.k(intValue);
                zArr[28] = true;
                return 0;
            case 29:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.ig0 ig0Var3 = new bw5.ig0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ig0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.I = ig0Var3;
                }
                zArr[29] = true;
                return 0;
            case 30:
                this.f115148J = aVar2.g(intValue);
                zArr[30] = true;
                return 0;
            default:
                return -1;
        }
    }
}
