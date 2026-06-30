package bw5;

/* loaded from: classes2.dex */
public class qg extends r45.js5 {
    public bw5.zn0 A;
    public bw5.co0 B;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f113629e;

    /* renamed from: f, reason: collision with root package name */
    public int f113630f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f113631g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.mu f113632h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f113633i;

    /* renamed from: o, reason: collision with root package name */
    public bw5.yn f113636o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.mw f113637p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.pc f113638q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f113639r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.nw f113640s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.z10 f113641t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f113642u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f113643v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.jv f113644w;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f113646y;

    /* renamed from: z, reason: collision with root package name */
    public int f113647z;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f113628d = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f113634m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f113635n = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f113645x = new java.util.LinkedList();
    public final boolean[] C = new boolean[51];

    static {
        new bw5.qg();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qg mo11468x92b714fd(byte[] bArr) {
        return (bw5.qg) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qg)) {
            return false;
        }
        bw5.qg qgVar = (bw5.qg) fVar;
        return n51.f.a(this.f76492x92037252, qgVar.f76492x92037252) && n51.f.a(this.f113628d, qgVar.f113628d) && n51.f.a(this.f113629e, qgVar.f113629e) && n51.f.a(java.lang.Integer.valueOf(this.f113630f), java.lang.Integer.valueOf(qgVar.f113630f)) && n51.f.a(this.f113631g, qgVar.f113631g) && n51.f.a(this.f113632h, qgVar.f113632h) && n51.f.a(this.f113633i, qgVar.f113633i) && n51.f.a(this.f113634m, qgVar.f113634m) && n51.f.a(this.f113635n, qgVar.f113635n) && n51.f.a(this.f113636o, qgVar.f113636o) && n51.f.a(this.f113637p, qgVar.f113637p) && n51.f.a(this.f113638q, qgVar.f113638q) && n51.f.a(this.f113639r, qgVar.f113639r) && n51.f.a(this.f113640s, qgVar.f113640s) && n51.f.a(this.f113641t, qgVar.f113641t) && n51.f.a(this.f113642u, qgVar.f113642u) && n51.f.a(this.f113643v, qgVar.f113643v) && n51.f.a(this.f113644w, qgVar.f113644w) && n51.f.a(this.f113645x, qgVar.f113645x) && n51.f.a(this.f113646y, qgVar.f113646y) && n51.f.a(java.lang.Integer.valueOf(this.f113647z), java.lang.Integer.valueOf(qgVar.f113647z)) && n51.f.a(this.A, qgVar.A) && n51.f.a(this.B, qgVar.B);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.C[1] ? this.f76492x92037252 : new r45.ie();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.qg();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.C;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, this.f113628d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f113629e;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f113630f);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f113631g;
            if (gVar2 != null && zArr[5]) {
                fVar.b(5, gVar2);
            }
            bw5.mu muVar = this.f113632h;
            if (muVar != null && zArr[6]) {
                fVar.i(6, muVar.mo75928xcd1e8d8());
                this.f113632h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f113633i;
            if (str != null && zArr[7]) {
                fVar.j(7, str);
            }
            fVar.g(8, 8, this.f113634m);
            fVar.g(9, 8, this.f113635n);
            bw5.yn ynVar = this.f113636o;
            if (ynVar != null && zArr[10]) {
                fVar.i(10, ynVar.mo75928xcd1e8d8());
                this.f113636o.mo75956x3d5d1f78(fVar);
            }
            bw5.mw mwVar = this.f113637p;
            if (mwVar != null && zArr[11]) {
                fVar.i(11, mwVar.mo75928xcd1e8d8());
                this.f113637p.mo75956x3d5d1f78(fVar);
            }
            bw5.pc pcVar = this.f113638q;
            if (pcVar != null && zArr[12]) {
                fVar.i(12, pcVar.mo75928xcd1e8d8());
                this.f113638q.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f113639r;
            if (str2 != null && zArr[13]) {
                fVar.j(13, str2);
            }
            bw5.nw nwVar = this.f113640s;
            if (nwVar != null && zArr[14]) {
                fVar.i(14, nwVar.mo75928xcd1e8d8());
                this.f113640s.mo75956x3d5d1f78(fVar);
            }
            bw5.z10 z10Var = this.f113641t;
            if (z10Var != null && zArr[15]) {
                fVar.i(15, z10Var.mo75928xcd1e8d8());
                this.f113641t.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f113642u;
            if (str3 != null && zArr[16]) {
                fVar.j(16, str3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f113643v;
            if (gVar3 != null && zArr[17]) {
                fVar.b(17, gVar3);
            }
            bw5.jv jvVar = this.f113644w;
            if (jvVar != null && zArr[18]) {
                fVar.i(18, jvVar.mo75928xcd1e8d8());
                this.f113644w.mo75956x3d5d1f78(fVar);
            }
            fVar.g(19, 8, this.f113645x);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f113646y;
            if (gVar4 != null && zArr[20]) {
                fVar.b(20, gVar4);
            }
            if (zArr[21]) {
                fVar.e(21, this.f113647z);
            }
            bw5.zn0 zn0Var = this.A;
            if (zn0Var != null && zArr[49]) {
                fVar.i(49, zn0Var.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            bw5.co0 co0Var = this.B;
            if (co0Var != null && zArr[50]) {
                fVar.i(50, co0Var.mo75928xcd1e8d8());
                this.B.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            if (ieVar2 != null && zArr[1]) {
                i18 = b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0;
            }
            int g17 = i18 + b36.f.g(2, 8, this.f113628d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f113629e;
            if (gVar5 != null && zArr[3]) {
                g17 += b36.f.b(3, gVar5);
            }
            if (zArr[4]) {
                g17 += b36.f.e(4, this.f113630f);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f113631g;
            if (gVar6 != null && zArr[5]) {
                g17 += b36.f.b(5, gVar6);
            }
            bw5.mu muVar2 = this.f113632h;
            if (muVar2 != null && zArr[6]) {
                g17 += b36.f.i(6, muVar2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f113633i;
            if (str4 != null && zArr[7]) {
                g17 += b36.f.j(7, str4);
            }
            int g18 = g17 + b36.f.g(8, 8, this.f113634m) + b36.f.g(9, 8, this.f113635n);
            bw5.yn ynVar2 = this.f113636o;
            if (ynVar2 != null && zArr[10]) {
                g18 += b36.f.i(10, ynVar2.mo75928xcd1e8d8());
            }
            bw5.mw mwVar2 = this.f113637p;
            if (mwVar2 != null && zArr[11]) {
                g18 += b36.f.i(11, mwVar2.mo75928xcd1e8d8());
            }
            bw5.pc pcVar2 = this.f113638q;
            if (pcVar2 != null && zArr[12]) {
                g18 += b36.f.i(12, pcVar2.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.f113639r;
            if (str5 != null && zArr[13]) {
                g18 += b36.f.j(13, str5);
            }
            bw5.nw nwVar2 = this.f113640s;
            if (nwVar2 != null && zArr[14]) {
                g18 += b36.f.i(14, nwVar2.mo75928xcd1e8d8());
            }
            bw5.z10 z10Var2 = this.f113641t;
            if (z10Var2 != null && zArr[15]) {
                g18 += b36.f.i(15, z10Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f113642u;
            if (str6 != null && zArr[16]) {
                g18 += b36.f.j(16, str6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar7 = this.f113643v;
            if (gVar7 != null && zArr[17]) {
                g18 += b36.f.b(17, gVar7);
            }
            bw5.jv jvVar2 = this.f113644w;
            if (jvVar2 != null && zArr[18]) {
                g18 += b36.f.i(18, jvVar2.mo75928xcd1e8d8());
            }
            int g19 = g18 + b36.f.g(19, 8, this.f113645x);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar8 = this.f113646y;
            if (gVar8 != null && zArr[20]) {
                g19 += b36.f.b(20, gVar8);
            }
            if (zArr[21]) {
                g19 += b36.f.e(21, this.f113647z);
            }
            bw5.zn0 zn0Var2 = this.A;
            if (zn0Var2 != null && zArr[49]) {
                g19 += b36.f.i(49, zn0Var2.mo75928xcd1e8d8());
            }
            bw5.co0 co0Var2 = this.B;
            return (co0Var2 == null || !zArr[50]) ? g19 : g19 + b36.f.i(50, co0Var2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            this.f113628d.clear();
            this.f113634m.clear();
            this.f113635n.clear();
            this.f113645x.clear();
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
        if (intValue == 49) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.zn0 zn0Var3 = new bw5.zn0();
                if (bArr != null && bArr.length > 0) {
                    zn0Var3.mo11468x92b714fd(bArr);
                }
                this.A = zn0Var3;
            }
            zArr[49] = true;
            return 0;
        }
        if (intValue == 50) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.co0 co0Var3 = new bw5.co0();
                if (bArr2 != null && bArr2.length > 0) {
                    co0Var3.mo11468x92b714fd(bArr2);
                }
                this.B = co0Var3;
            }
            zArr[50] = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr3 != null && bArr3.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr3);
                    }
                    this.f76492x92037252 = ieVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.yr yrVar = new bw5.yr();
                    if (bArr4 != null && bArr4.length > 0) {
                        yrVar.mo11468x92b714fd(bArr4);
                    }
                    this.f113628d.add(yrVar);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f113629e = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113630f = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113631g = aVar2.d(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.mu muVar3 = new bw5.mu();
                    if (bArr5 != null && bArr5.length > 0) {
                        muVar3.mo11468x92b714fd(bArr5);
                    }
                    this.f113632h = muVar3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f113633i = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.hw hwVar = new bw5.hw();
                    if (bArr6 != null && bArr6.length > 0) {
                        hwVar.mo11468x92b714fd(bArr6);
                    }
                    this.f113634m.add(hwVar);
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.yw ywVar = new bw5.yw();
                    if (bArr7 != null && bArr7.length > 0) {
                        ywVar.mo11468x92b714fd(bArr7);
                    }
                    this.f113635n.add(ywVar);
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.yn ynVar3 = new bw5.yn();
                    if (bArr8 != null && bArr8.length > 0) {
                        ynVar3.mo11468x92b714fd(bArr8);
                    }
                    this.f113636o = ynVar3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    bw5.mw mwVar3 = new bw5.mw();
                    if (bArr9 != null && bArr9.length > 0) {
                        mwVar3.mo11468x92b714fd(bArr9);
                    }
                    this.f113637p = mwVar3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    bw5.pc pcVar3 = new bw5.pc();
                    if (bArr10 != null && bArr10.length > 0) {
                        pcVar3.mo11468x92b714fd(bArr10);
                    }
                    this.f113638q = pcVar3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                this.f113639r = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    bw5.nw nwVar3 = new bw5.nw();
                    if (bArr11 != null && bArr11.length > 0) {
                        nwVar3.mo11468x92b714fd(bArr11);
                    }
                    this.f113640s = nwVar3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    bw5.z10 z10Var3 = new bw5.z10();
                    if (bArr12 != null && bArr12.length > 0) {
                        z10Var3.mo11468x92b714fd(bArr12);
                    }
                    this.f113641t = z10Var3;
                }
                zArr[15] = true;
                return 0;
            case 16:
                this.f113642u = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f113643v = aVar2.d(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr13 = (byte[]) j57.get(i59);
                    bw5.jv jvVar3 = new bw5.jv();
                    if (bArr13 != null && bArr13.length > 0) {
                        jvVar3.mo11468x92b714fd(bArr13);
                    }
                    this.f113644w = jvVar3;
                }
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr14 = (byte[]) j58.get(i66);
                    bw5.yr yrVar2 = new bw5.yr();
                    if (bArr14 != null && bArr14.length > 0) {
                        yrVar2.mo11468x92b714fd(bArr14);
                    }
                    this.f113645x.add(yrVar2);
                }
                zArr[19] = true;
                return 0;
            case 20:
                this.f113646y = aVar2.d(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.f113647z = aVar2.g(intValue);
                zArr[21] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.C[1] = true;
        return this;
    }
}
