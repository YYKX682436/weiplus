package bw5;

/* loaded from: classes8.dex */
public class t5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public final boolean[] A = new boolean[27];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f114780d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f114781e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f114782f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f114783g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f114784h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f114785i;

    /* renamed from: m, reason: collision with root package name */
    public int f114786m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.a30 f114787n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.b30 f114788o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f114789p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f114790q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f114791r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f114792s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f114793t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f114794u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f114795v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.r5 f114796w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.s5 f114797x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f114798y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f114799z;

    static {
        new bw5.t5();
    }

    public bw5.s5 b() {
        return this.A[22] ? this.f114797x : new bw5.s5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.t5 mo11468x92b714fd(byte[] bArr) {
        return (bw5.t5) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.t5)) {
            return false;
        }
        bw5.t5 t5Var = (bw5.t5) fVar;
        return n51.f.a(this.f114780d, t5Var.f114780d) && n51.f.a(this.f114781e, t5Var.f114781e) && n51.f.a(this.f114782f, t5Var.f114782f) && n51.f.a(this.f114783g, t5Var.f114783g) && n51.f.a(this.f114784h, t5Var.f114784h) && n51.f.a(this.f114785i, t5Var.f114785i) && n51.f.a(java.lang.Integer.valueOf(this.f114786m), java.lang.Integer.valueOf(t5Var.f114786m)) && n51.f.a(this.f114787n, t5Var.f114787n) && n51.f.a(this.f114788o, t5Var.f114788o) && n51.f.a(java.lang.Boolean.valueOf(this.f114789p), java.lang.Boolean.valueOf(t5Var.f114789p)) && n51.f.a(this.f114790q, t5Var.f114790q) && n51.f.a(this.f114791r, t5Var.f114791r) && n51.f.a(this.f114792s, t5Var.f114792s) && n51.f.a(this.f114793t, t5Var.f114793t) && n51.f.a(this.f114794u, t5Var.f114794u) && n51.f.a(this.f114795v, t5Var.f114795v) && n51.f.a(this.f114796w, t5Var.f114796w) && n51.f.a(this.f114797x, t5Var.f114797x) && n51.f.a(this.f114798y, t5Var.f114798y) && n51.f.a(this.f114799z, t5Var.f114799z);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.t5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.A;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f114780d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f114781e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f114782f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f114783g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f114784h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f114785i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            if (zArr[7]) {
                fVar.e(7, this.f114786m);
            }
            bw5.a30 a30Var = this.f114787n;
            if (a30Var != null && zArr[8]) {
                fVar.i(8, a30Var.mo75928xcd1e8d8());
                this.f114787n.mo75956x3d5d1f78(fVar);
            }
            bw5.b30 b30Var = this.f114788o;
            if (b30Var != null && zArr[9]) {
                fVar.i(9, b30Var.mo75928xcd1e8d8());
                this.f114788o.mo75956x3d5d1f78(fVar);
            }
            if (zArr[10]) {
                fVar.a(10, this.f114789p);
            }
            java.lang.String str7 = this.f114790q;
            if (str7 != null && zArr[11]) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f114791r;
            if (str8 != null && zArr[12]) {
                fVar.j(12, str8);
            }
            java.lang.String str9 = this.f114792s;
            if (str9 != null && zArr[13]) {
                fVar.j(13, str9);
            }
            java.lang.String str10 = this.f114793t;
            if (str10 != null && zArr[14]) {
                fVar.j(14, str10);
            }
            java.lang.String str11 = this.f114794u;
            if (str11 != null && zArr[15]) {
                fVar.j(15, str11);
            }
            java.lang.String str12 = this.f114795v;
            if (str12 != null && zArr[16]) {
                fVar.j(16, str12);
            }
            bw5.r5 r5Var = this.f114796w;
            if (r5Var != null && zArr[17]) {
                fVar.i(17, r5Var.mo75928xcd1e8d8());
                this.f114796w.mo75956x3d5d1f78(fVar);
            }
            bw5.s5 s5Var = this.f114797x;
            if (s5Var != null && zArr[22]) {
                fVar.i(22, s5Var.mo75928xcd1e8d8());
                this.f114797x.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str13 = this.f114798y;
            if (str13 != null && zArr[25]) {
                fVar.j(25, str13);
            }
            java.lang.String str14 = this.f114799z;
            if (str14 != null && zArr[26]) {
                fVar.j(26, str14);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str15 = this.f114780d;
            if (str15 != null && zArr[1]) {
                i18 = b36.f.j(1, str15) + 0;
            }
            java.lang.String str16 = this.f114781e;
            if (str16 != null && zArr[2]) {
                i18 += b36.f.j(2, str16);
            }
            java.lang.String str17 = this.f114782f;
            if (str17 != null && zArr[3]) {
                i18 += b36.f.j(3, str17);
            }
            java.lang.String str18 = this.f114783g;
            if (str18 != null && zArr[4]) {
                i18 += b36.f.j(4, str18);
            }
            java.lang.String str19 = this.f114784h;
            if (str19 != null && zArr[5]) {
                i18 += b36.f.j(5, str19);
            }
            java.lang.String str20 = this.f114785i;
            if (str20 != null && zArr[6]) {
                i18 += b36.f.j(6, str20);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f114786m);
            }
            bw5.a30 a30Var2 = this.f114787n;
            if (a30Var2 != null && zArr[8]) {
                i18 += b36.f.i(8, a30Var2.mo75928xcd1e8d8());
            }
            bw5.b30 b30Var2 = this.f114788o;
            if (b30Var2 != null && zArr[9]) {
                i18 += b36.f.i(9, b30Var2.mo75928xcd1e8d8());
            }
            if (zArr[10]) {
                i18 += b36.f.a(10, this.f114789p);
            }
            java.lang.String str21 = this.f114790q;
            if (str21 != null && zArr[11]) {
                i18 += b36.f.j(11, str21);
            }
            java.lang.String str22 = this.f114791r;
            if (str22 != null && zArr[12]) {
                i18 += b36.f.j(12, str22);
            }
            java.lang.String str23 = this.f114792s;
            if (str23 != null && zArr[13]) {
                i18 += b36.f.j(13, str23);
            }
            java.lang.String str24 = this.f114793t;
            if (str24 != null && zArr[14]) {
                i18 += b36.f.j(14, str24);
            }
            java.lang.String str25 = this.f114794u;
            if (str25 != null && zArr[15]) {
                i18 += b36.f.j(15, str25);
            }
            java.lang.String str26 = this.f114795v;
            if (str26 != null && zArr[16]) {
                i18 += b36.f.j(16, str26);
            }
            bw5.r5 r5Var2 = this.f114796w;
            if (r5Var2 != null && zArr[17]) {
                i18 += b36.f.i(17, r5Var2.mo75928xcd1e8d8());
            }
            bw5.s5 s5Var2 = this.f114797x;
            if (s5Var2 != null && zArr[22]) {
                i18 += b36.f.i(22, s5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str27 = this.f114798y;
            if (str27 != null && zArr[25]) {
                i18 += b36.f.j(25, str27);
            }
            java.lang.String str28 = this.f114799z;
            return (str28 == null || !zArr[26]) ? i18 : i18 + b36.f.j(26, str28);
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
        if (intValue == 22) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.s5 s5Var3 = new bw5.s5();
                if (bArr != null && bArr.length > 0) {
                    s5Var3.mo11468x92b714fd(bArr);
                }
                this.f114797x = s5Var3;
            }
            zArr[22] = true;
            return 0;
        }
        if (intValue == 25) {
            this.f114798y = aVar2.k(intValue);
            zArr[25] = true;
            return 0;
        }
        if (intValue == 26) {
            this.f114799z = aVar2.k(intValue);
            zArr[26] = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f114780d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f114781e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f114782f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f114783g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f114784h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f114785i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f114786m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.a30 a30Var3 = new bw5.a30();
                    if (bArr2 != null && bArr2.length > 0) {
                        a30Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f114787n = a30Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.b30 b30Var3 = new bw5.b30();
                    if (bArr3 != null && bArr3.length > 0) {
                        b30Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f114788o = b30Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f114789p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f114790q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f114791r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f114792s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f114793t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f114794u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f114795v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.r5 r5Var3 = new bw5.r5();
                    if (bArr4 != null && bArr4.length > 0) {
                        r5Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f114796w = r5Var3;
                }
                zArr[17] = true;
                return 0;
            default:
                return -1;
        }
    }
}
