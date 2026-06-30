package bw5;

/* loaded from: classes4.dex */
public class hd extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public int A;
    public bw5.cd B;
    public bw5.bd F;
    public int G;
    public int H;

    /* renamed from: d, reason: collision with root package name */
    public bw5.gd f109685d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f109686e;

    /* renamed from: f, reason: collision with root package name */
    public int f109687f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f109689h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f109690i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f109691m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f109692n;

    /* renamed from: q, reason: collision with root package name */
    public int f109695q;

    /* renamed from: r, reason: collision with root package name */
    public int f109696r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f109697s;

    /* renamed from: z, reason: collision with root package name */
    public bw5.fd f109704z;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f109688g = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f109693o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f109694p = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f109698t = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f109699u = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f109700v = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f109701w = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f109702x = new java.util.LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public final java.util.LinkedList f109703y = new java.util.LinkedList();
    public final java.util.LinkedList C = new java.util.LinkedList();
    public final java.util.LinkedList D = new java.util.LinkedList();
    public final java.util.LinkedList E = new java.util.LinkedList();
    public final boolean[] I = new boolean[30];

    static {
        new bw5.hd();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hd mo11468x92b714fd(byte[] bArr) {
        return (bw5.hd) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hd)) {
            return false;
        }
        bw5.hd hdVar = (bw5.hd) fVar;
        return n51.f.a(this.f109685d, hdVar.f109685d) && n51.f.a(this.f109686e, hdVar.f109686e) && n51.f.a(java.lang.Integer.valueOf(this.f109687f), java.lang.Integer.valueOf(hdVar.f109687f)) && n51.f.a(this.f109688g, hdVar.f109688g) && n51.f.a(this.f109689h, hdVar.f109689h) && n51.f.a(this.f109690i, hdVar.f109690i) && n51.f.a(this.f109691m, hdVar.f109691m) && n51.f.a(this.f109692n, hdVar.f109692n) && n51.f.a(this.f109693o, hdVar.f109693o) && n51.f.a(this.f109694p, hdVar.f109694p) && n51.f.a(java.lang.Integer.valueOf(this.f109695q), java.lang.Integer.valueOf(hdVar.f109695q)) && n51.f.a(java.lang.Integer.valueOf(this.f109696r), java.lang.Integer.valueOf(hdVar.f109696r)) && n51.f.a(this.f109697s, hdVar.f109697s) && n51.f.a(this.f109698t, hdVar.f109698t) && n51.f.a(this.f109699u, hdVar.f109699u) && n51.f.a(this.f109700v, hdVar.f109700v) && n51.f.a(this.f109701w, hdVar.f109701w) && n51.f.a(this.f109702x, hdVar.f109702x) && n51.f.a(this.f109703y, hdVar.f109703y) && n51.f.a(this.f109704z, hdVar.f109704z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(hdVar.A)) && n51.f.a(this.B, hdVar.B) && n51.f.a(this.C, hdVar.C) && n51.f.a(this.D, hdVar.D) && n51.f.a(this.E, hdVar.E) && n51.f.a(this.F, hdVar.F) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(hdVar.G)) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(hdVar.H));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.hd();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f109698t;
        java.util.LinkedList linkedList2 = this.f109694p;
        java.util.LinkedList linkedList3 = this.f109693o;
        java.util.LinkedList linkedList4 = this.f109688g;
        int i18 = 0;
        boolean[] zArr = this.I;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.gd gdVar = this.f109685d;
            if (gdVar != null && zArr[1]) {
                fVar.e(1, gdVar.f109348d);
            }
            java.lang.String str = this.f109686e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f109687f);
            }
            fVar.g(4, 8, linkedList4);
            java.lang.String str2 = this.f109689h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f109690i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f109691m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f109692n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            fVar.g(9, 1, linkedList3);
            fVar.g(10, 8, linkedList2);
            if (zArr[11]) {
                fVar.e(11, this.f109695q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f109696r);
            }
            java.lang.String str6 = this.f109697s;
            if (str6 != null && zArr[13]) {
                fVar.j(13, str6);
            }
            fVar.g(14, 8, linkedList);
            fVar.g(15, 8, this.f109699u);
            fVar.g(16, 8, this.f109700v);
            fVar.g(17, 8, this.f109701w);
            fVar.g(18, 8, this.f109702x);
            fVar.g(19, 8, this.f109703y);
            bw5.fd fdVar = this.f109704z;
            if (fdVar != null && zArr[20]) {
                fVar.i(20, fdVar.mo75928xcd1e8d8());
                this.f109704z.mo75956x3d5d1f78(fVar);
            }
            if (zArr[21]) {
                fVar.e(21, this.A);
            }
            bw5.cd cdVar = this.B;
            if (cdVar != null && zArr[22]) {
                fVar.i(22, cdVar.mo75928xcd1e8d8());
                this.B.mo75956x3d5d1f78(fVar);
            }
            fVar.g(23, 2, this.C);
            fVar.g(24, 8, this.D);
            fVar.g(25, 8, this.E);
            bw5.bd bdVar = this.F;
            if (bdVar != null && zArr[27]) {
                fVar.i(27, bdVar.mo75928xcd1e8d8());
                this.F.mo75956x3d5d1f78(fVar);
            }
            if (zArr[28]) {
                fVar.e(28, this.G);
            }
            if (zArr[29]) {
                fVar.e(29, this.H);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.gd gdVar2 = this.f109685d;
            if (gdVar2 != null && zArr[1]) {
                i18 = b36.f.e(1, gdVar2.f109348d) + 0;
            }
            java.lang.String str7 = this.f109686e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f109687f);
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList4);
            java.lang.String str8 = this.f109689h;
            if (str8 != null && zArr[5]) {
                g17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f109690i;
            if (str9 != null && zArr[6]) {
                g17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f109691m;
            if (str10 != null && zArr[7]) {
                g17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f109692n;
            if (str11 != null && zArr[8]) {
                g17 += b36.f.j(8, str11);
            }
            int g18 = g17 + b36.f.g(9, 1, linkedList3) + b36.f.g(10, 8, linkedList2);
            if (zArr[11]) {
                g18 += b36.f.e(11, this.f109695q);
            }
            if (zArr[12]) {
                g18 += b36.f.e(12, this.f109696r);
            }
            java.lang.String str12 = this.f109697s;
            if (str12 != null && zArr[13]) {
                g18 += b36.f.j(13, str12);
            }
            int g19 = g18 + b36.f.g(14, 8, linkedList) + b36.f.g(15, 8, this.f109699u) + b36.f.g(16, 8, this.f109700v) + b36.f.g(17, 8, this.f109701w) + b36.f.g(18, 8, this.f109702x) + b36.f.g(19, 8, this.f109703y);
            bw5.fd fdVar2 = this.f109704z;
            if (fdVar2 != null && zArr[20]) {
                g19 += b36.f.i(20, fdVar2.mo75928xcd1e8d8());
            }
            if (zArr[21]) {
                g19 += b36.f.e(21, this.A);
            }
            bw5.cd cdVar2 = this.B;
            if (cdVar2 != null && zArr[22]) {
                g19 += b36.f.i(22, cdVar2.mo75928xcd1e8d8());
            }
            int g27 = g19 + b36.f.g(23, 2, this.C) + b36.f.g(24, 8, this.D) + b36.f.g(25, 8, this.E);
            bw5.bd bdVar2 = this.F;
            if (bdVar2 != null && zArr[27]) {
                g27 += b36.f.i(27, bdVar2.mo75928xcd1e8d8());
            }
            if (zArr[28]) {
                g27 += b36.f.e(28, this.G);
            }
            return zArr[29] ? g27 + b36.f.e(29, this.H) : g27;
        }
        if (i17 == 2) {
            linkedList4.clear();
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
            this.f109699u.clear();
            this.f109700v.clear();
            this.f109701w.clear();
            this.f109702x.clear();
            this.f109703y.clear();
            this.C.clear();
            this.D.clear();
            this.E.clear();
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
                int g28 = aVar2.g(intValue);
                this.f109685d = g28 != 0 ? g28 != 1 ? g28 != 2 ? g28 != 3 ? g28 != 4 ? g28 != 5 ? null : bw5.gd.NET_5G : bw5.gd.NET_4G : bw5.gd.NET_3G : bw5.gd.NET_2G : bw5.gd.NET_WIFI : bw5.gd.NET_NULL;
                zArr[1] = true;
                return 0;
            case 2:
                this.f109686e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109687f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.se seVar = new bw5.se();
                    if (bArr != null && bArr.length > 0) {
                        seVar.mo11468x92b714fd(bArr);
                    }
                    linkedList4.add(seVar);
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f109689h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109690i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f109691m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f109692n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                linkedList3.add(aVar2.k(intValue));
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.zf zfVar = new bw5.zf();
                    if (bArr2 != null && bArr2.length > 0) {
                        zfVar.mo11468x92b714fd(bArr2);
                    }
                    linkedList2.add(zfVar);
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f109695q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f109696r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f109697s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.a5 a5Var = new bw5.a5();
                    if (bArr3 != null && bArr3.length > 0) {
                        a5Var.mo11468x92b714fd(bArr3);
                    }
                    linkedList.add(a5Var);
                }
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.a5 a5Var2 = new bw5.a5();
                    if (bArr4 != null && bArr4.length > 0) {
                        a5Var2.mo11468x92b714fd(bArr4);
                    }
                    this.f109699u.add(a5Var2);
                }
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.se seVar2 = new bw5.se();
                    if (bArr5 != null && bArr5.length > 0) {
                        seVar2.mo11468x92b714fd(bArr5);
                    }
                    this.f109700v.add(seVar2);
                }
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.a5 a5Var3 = new bw5.a5();
                    if (bArr6 != null && bArr6.length > 0) {
                        a5Var3.mo11468x92b714fd(bArr6);
                    }
                    this.f109701w.add(a5Var3);
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.a5 a5Var4 = new bw5.a5();
                    if (bArr7 != null && bArr7.length > 0) {
                        a5Var4.mo11468x92b714fd(bArr7);
                    }
                    this.f109702x.add(a5Var4);
                }
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.se seVar3 = new bw5.se();
                    if (bArr8 != null && bArr8.length > 0) {
                        seVar3.mo11468x92b714fd(bArr8);
                    }
                    this.f109703y.add(seVar3);
                }
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    bw5.fd fdVar3 = new bw5.fd();
                    if (bArr9 != null && bArr9.length > 0) {
                        fdVar3.mo11468x92b714fd(bArr9);
                    }
                    this.f109704z = fdVar3;
                }
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.g(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    bw5.cd cdVar3 = new bw5.cd();
                    if (bArr10 != null && bArr10.length > 0) {
                        cdVar3.mo11468x92b714fd(bArr10);
                    }
                    this.B = cdVar3;
                }
                zArr[22] = true;
                return 0;
            case 23:
                this.C.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[23] = true;
                return 0;
            case 24:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    bw5.dd ddVar = new bw5.dd();
                    if (bArr11 != null && bArr11.length > 0) {
                        ddVar.mo11468x92b714fd(bArr11);
                    }
                    this.D.add(ddVar);
                }
                zArr[24] = true;
                return 0;
            case 25:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    bw5.dd ddVar2 = new bw5.dd();
                    if (bArr12 != null && bArr12.length > 0) {
                        ddVar2.mo11468x92b714fd(bArr12);
                    }
                    this.E.add(ddVar2);
                }
                zArr[25] = true;
                return 0;
            case 26:
            default:
                return -1;
            case 27:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr13 = (byte[]) j57.get(i59);
                    bw5.bd bdVar3 = new bw5.bd();
                    if (bArr13 != null && bArr13.length > 0) {
                        bdVar3.mo11468x92b714fd(bArr13);
                    }
                    this.F = bdVar3;
                }
                zArr[27] = true;
                return 0;
            case 28:
                this.G = aVar2.g(intValue);
                zArr[28] = true;
                return 0;
            case 29:
                this.H = aVar2.g(intValue);
                zArr[29] = true;
                return 0;
        }
    }
}
