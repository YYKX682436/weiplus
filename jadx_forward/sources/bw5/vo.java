package bw5;

/* loaded from: classes2.dex */
public class vo extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public bw5.ko A;

    /* renamed from: d, reason: collision with root package name */
    public long f115950d;

    /* renamed from: e, reason: collision with root package name */
    public int f115951e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.yr f115952f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f115953g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.xo f115954h;

    /* renamed from: m, reason: collision with root package name */
    public bw5.wo f115956m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.oc f115957n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f115958o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.io f115959p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.fc f115960q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.jl f115961r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.ak f115962s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.jp f115963t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.kl f115964u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.bp f115965v;

    /* renamed from: w, reason: collision with root package name */
    public int f115966w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.go f115967x;

    /* renamed from: y, reason: collision with root package name */
    public bw5.wr f115968y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.nm f115969z;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f115955i = new java.util.LinkedList();
    public final boolean[] B = new boolean[22];

    static {
        new bw5.vo();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vo mo11468x92b714fd(byte[] bArr) {
        return (bw5.vo) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vo)) {
            return false;
        }
        bw5.vo voVar = (bw5.vo) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f115950d), java.lang.Long.valueOf(voVar.f115950d)) && n51.f.a(java.lang.Integer.valueOf(this.f115951e), java.lang.Integer.valueOf(voVar.f115951e)) && n51.f.a(this.f115952f, voVar.f115952f) && n51.f.a(this.f115953g, voVar.f115953g) && n51.f.a(this.f115954h, voVar.f115954h) && n51.f.a(this.f115955i, voVar.f115955i) && n51.f.a(this.f115956m, voVar.f115956m) && n51.f.a(this.f115957n, voVar.f115957n) && n51.f.a(this.f115958o, voVar.f115958o) && n51.f.a(this.f115959p, voVar.f115959p) && n51.f.a(this.f115960q, voVar.f115960q) && n51.f.a(this.f115961r, voVar.f115961r) && n51.f.a(this.f115962s, voVar.f115962s) && n51.f.a(this.f115963t, voVar.f115963t) && n51.f.a(this.f115964u, voVar.f115964u) && n51.f.a(this.f115965v, voVar.f115965v) && n51.f.a(java.lang.Integer.valueOf(this.f115966w), java.lang.Integer.valueOf(voVar.f115966w)) && n51.f.a(this.f115967x, voVar.f115967x) && n51.f.a(this.f115968y, voVar.f115968y) && n51.f.a(this.f115969z, voVar.f115969z) && n51.f.a(this.A, voVar.A);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.vo();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.B;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f115950d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f115951e);
            }
            bw5.yr yrVar = this.f115952f;
            if (yrVar != null && zArr[3]) {
                fVar.i(3, yrVar.mo75928xcd1e8d8());
                this.f115952f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f115953g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            bw5.xo xoVar = this.f115954h;
            if (xoVar != null && zArr[5]) {
                fVar.i(5, xoVar.mo75928xcd1e8d8());
                this.f115954h.mo75956x3d5d1f78(fVar);
            }
            fVar.g(6, 8, this.f115955i);
            bw5.wo woVar = this.f115956m;
            if (woVar != null && zArr[7]) {
                fVar.i(7, woVar.mo75928xcd1e8d8());
                this.f115956m.mo75956x3d5d1f78(fVar);
            }
            bw5.oc ocVar = this.f115957n;
            if (ocVar != null && zArr[8]) {
                fVar.i(8, ocVar.mo75928xcd1e8d8());
                this.f115957n.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f115958o;
            if (str2 != null && zArr[9]) {
                fVar.j(9, str2);
            }
            bw5.io ioVar = this.f115959p;
            if (ioVar != null && zArr[10]) {
                fVar.i(10, ioVar.mo75928xcd1e8d8());
                this.f115959p.mo75956x3d5d1f78(fVar);
            }
            bw5.fc fcVar = this.f115960q;
            if (fcVar != null && zArr[11]) {
                fVar.i(11, fcVar.mo75928xcd1e8d8());
                this.f115960q.mo75956x3d5d1f78(fVar);
            }
            bw5.jl jlVar = this.f115961r;
            if (jlVar != null && zArr[12]) {
                fVar.i(12, jlVar.mo75928xcd1e8d8());
                this.f115961r.mo75956x3d5d1f78(fVar);
            }
            bw5.ak akVar = this.f115962s;
            if (akVar != null && zArr[13]) {
                fVar.i(13, akVar.mo75928xcd1e8d8());
                this.f115962s.mo75956x3d5d1f78(fVar);
            }
            bw5.jp jpVar = this.f115963t;
            if (jpVar != null && zArr[14]) {
                fVar.i(14, jpVar.mo75928xcd1e8d8());
                this.f115963t.mo75956x3d5d1f78(fVar);
            }
            bw5.kl klVar = this.f115964u;
            if (klVar != null && zArr[15]) {
                fVar.i(15, klVar.mo75928xcd1e8d8());
                this.f115964u.mo75956x3d5d1f78(fVar);
            }
            bw5.bp bpVar = this.f115965v;
            if (bpVar != null && zArr[16]) {
                fVar.i(16, bpVar.mo75928xcd1e8d8());
                this.f115965v.mo75956x3d5d1f78(fVar);
            }
            if (zArr[17]) {
                fVar.e(17, this.f115966w);
            }
            bw5.go goVar = this.f115967x;
            if (goVar != null && zArr[18]) {
                fVar.i(18, goVar.mo75928xcd1e8d8());
                this.f115967x.mo75956x3d5d1f78(fVar);
            }
            bw5.wr wrVar = this.f115968y;
            if (wrVar != null && zArr[19]) {
                fVar.i(19, wrVar.mo75928xcd1e8d8());
                this.f115968y.mo75956x3d5d1f78(fVar);
            }
            bw5.nm nmVar = this.f115969z;
            if (nmVar != null && zArr[20]) {
                fVar.i(20, nmVar.mo75928xcd1e8d8());
                this.f115969z.mo75956x3d5d1f78(fVar);
            }
            bw5.ko koVar = this.A;
            if (koVar != null && zArr[21]) {
                fVar.i(21, koVar.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f115950d) + 0 : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f115951e);
            }
            bw5.yr yrVar2 = this.f115952f;
            if (yrVar2 != null && zArr[3]) {
                h17 += b36.f.i(3, yrVar2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f115953g;
            if (str3 != null && zArr[4]) {
                h17 += b36.f.j(4, str3);
            }
            bw5.xo xoVar2 = this.f115954h;
            if (xoVar2 != null && zArr[5]) {
                h17 += b36.f.i(5, xoVar2.mo75928xcd1e8d8());
            }
            int g17 = h17 + b36.f.g(6, 8, this.f115955i);
            bw5.wo woVar2 = this.f115956m;
            if (woVar2 != null && zArr[7]) {
                g17 += b36.f.i(7, woVar2.mo75928xcd1e8d8());
            }
            bw5.oc ocVar2 = this.f115957n;
            if (ocVar2 != null && zArr[8]) {
                g17 += b36.f.i(8, ocVar2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f115958o;
            if (str4 != null && zArr[9]) {
                g17 += b36.f.j(9, str4);
            }
            bw5.io ioVar2 = this.f115959p;
            if (ioVar2 != null && zArr[10]) {
                g17 += b36.f.i(10, ioVar2.mo75928xcd1e8d8());
            }
            bw5.fc fcVar2 = this.f115960q;
            if (fcVar2 != null && zArr[11]) {
                g17 += b36.f.i(11, fcVar2.mo75928xcd1e8d8());
            }
            bw5.jl jlVar2 = this.f115961r;
            if (jlVar2 != null && zArr[12]) {
                g17 += b36.f.i(12, jlVar2.mo75928xcd1e8d8());
            }
            bw5.ak akVar2 = this.f115962s;
            if (akVar2 != null && zArr[13]) {
                g17 += b36.f.i(13, akVar2.mo75928xcd1e8d8());
            }
            bw5.jp jpVar2 = this.f115963t;
            if (jpVar2 != null && zArr[14]) {
                g17 += b36.f.i(14, jpVar2.mo75928xcd1e8d8());
            }
            bw5.kl klVar2 = this.f115964u;
            if (klVar2 != null && zArr[15]) {
                g17 += b36.f.i(15, klVar2.mo75928xcd1e8d8());
            }
            bw5.bp bpVar2 = this.f115965v;
            if (bpVar2 != null && zArr[16]) {
                g17 += b36.f.i(16, bpVar2.mo75928xcd1e8d8());
            }
            if (zArr[17]) {
                g17 += b36.f.e(17, this.f115966w);
            }
            bw5.go goVar2 = this.f115967x;
            if (goVar2 != null && zArr[18]) {
                g17 += b36.f.i(18, goVar2.mo75928xcd1e8d8());
            }
            bw5.wr wrVar2 = this.f115968y;
            if (wrVar2 != null && zArr[19]) {
                g17 += b36.f.i(19, wrVar2.mo75928xcd1e8d8());
            }
            bw5.nm nmVar2 = this.f115969z;
            if (nmVar2 != null && zArr[20]) {
                g17 += b36.f.i(20, nmVar2.mo75928xcd1e8d8());
            }
            bw5.ko koVar2 = this.A;
            return (koVar2 == null || !zArr[21]) ? g17 : g17 + b36.f.i(21, koVar2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            this.f115955i.clear();
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
                this.f115950d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f115951e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.yr yrVar3 = new bw5.yr();
                    if (bArr != null && bArr.length > 0) {
                        yrVar3.mo11468x92b714fd(bArr);
                    }
                    this.f115952f = yrVar3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f115953g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.xo xoVar3 = new bw5.xo();
                    if (bArr2 != null && bArr2.length > 0) {
                        xoVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f115954h = xoVar3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.yr yrVar4 = new bw5.yr();
                    if (bArr3 != null && bArr3.length > 0) {
                        yrVar4.mo11468x92b714fd(bArr3);
                    }
                    this.f115955i.add(yrVar4);
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.wo woVar3 = new bw5.wo();
                    if (bArr4 != null && bArr4.length > 0) {
                        woVar3.mo11468x92b714fd(bArr4);
                    }
                    this.f115956m = woVar3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.oc ocVar3 = new bw5.oc();
                    if (bArr5 != null && bArr5.length > 0) {
                        ocVar3.mo11468x92b714fd(bArr5);
                    }
                    this.f115957n = ocVar3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f115958o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.io ioVar3 = new bw5.io();
                    if (bArr6 != null && bArr6.length > 0) {
                        ioVar3.mo11468x92b714fd(bArr6);
                    }
                    this.f115959p = ioVar3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.fc fcVar3 = new bw5.fc();
                    if (bArr7 != null && bArr7.length > 0) {
                        fcVar3.mo11468x92b714fd(bArr7);
                    }
                    this.f115960q = fcVar3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    bw5.jl jlVar3 = new bw5.jl();
                    if (bArr8 != null && bArr8.length > 0) {
                        jlVar3.mo11468x92b714fd(bArr8);
                    }
                    this.f115961r = jlVar3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j39.get(i47);
                    bw5.ak akVar3 = new bw5.ak();
                    if (bArr9 != null && bArr9.length > 0) {
                        akVar3.mo11468x92b714fd(bArr9);
                    }
                    this.f115962s = akVar3;
                }
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr10 = (byte[]) j47.get(i48);
                    bw5.jp jpVar3 = new bw5.jp();
                    if (bArr10 != null && bArr10.length > 0) {
                        jpVar3.mo11468x92b714fd(bArr10);
                    }
                    this.f115963t = jpVar3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i49 = 0; i49 < size11; i49++) {
                    byte[] bArr11 = (byte[]) j48.get(i49);
                    bw5.kl klVar3 = new bw5.kl();
                    if (bArr11 != null && bArr11.length > 0) {
                        klVar3.mo11468x92b714fd(bArr11);
                    }
                    this.f115964u = klVar3;
                }
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i57 = 0; i57 < size12; i57++) {
                    byte[] bArr12 = (byte[]) j49.get(i57);
                    bw5.bp bpVar3 = new bw5.bp();
                    if (bArr12 != null && bArr12.length > 0) {
                        bpVar3.mo11468x92b714fd(bArr12);
                    }
                    this.f115965v = bpVar3;
                }
                zArr[16] = true;
                return 0;
            case 17:
                this.f115966w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i58 = 0; i58 < size13; i58++) {
                    byte[] bArr13 = (byte[]) j57.get(i58);
                    bw5.go goVar3 = new bw5.go();
                    if (bArr13 != null && bArr13.length > 0) {
                        goVar3.mo11468x92b714fd(bArr13);
                    }
                    this.f115967x = goVar3;
                }
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i59 = 0; i59 < size14; i59++) {
                    byte[] bArr14 = (byte[]) j58.get(i59);
                    bw5.wr wrVar3 = new bw5.wr();
                    if (bArr14 != null && bArr14.length > 0) {
                        wrVar3.mo11468x92b714fd(bArr14);
                    }
                    this.f115968y = wrVar3;
                }
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i66 = 0; i66 < size15; i66++) {
                    byte[] bArr15 = (byte[]) j59.get(i66);
                    bw5.nm nmVar3 = new bw5.nm();
                    if (bArr15 != null && bArr15.length > 0) {
                        nmVar3.mo11468x92b714fd(bArr15);
                    }
                    this.f115969z = nmVar3;
                }
                zArr[20] = true;
                return 0;
            case 21:
                java.util.LinkedList j66 = aVar2.j(intValue);
                int size16 = j66.size();
                for (int i67 = 0; i67 < size16; i67++) {
                    byte[] bArr16 = (byte[]) j66.get(i67);
                    bw5.ko koVar3 = new bw5.ko();
                    if (bArr16 != null && bArr16.length > 0) {
                        koVar3.mo11468x92b714fd(bArr16);
                    }
                    this.A = koVar3;
                }
                zArr[21] = true;
                return 0;
            default:
                return -1;
        }
    }
}
