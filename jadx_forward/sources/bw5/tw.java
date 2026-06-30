package bw5;

/* loaded from: classes2.dex */
public class tw extends r45.js5 {
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g A;
    public java.lang.String B;
    public int C;
    public bw5.vw D;
    public bw5.jv E;
    public bw5.pw F;
    public bw5.zn0 G;
    public bw5.co0 H;
    public bw5.do0 I;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f115171e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f115172f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f115173g;

    /* renamed from: h, reason: collision with root package name */
    public int f115174h;

    /* renamed from: i, reason: collision with root package name */
    public int f115175i;

    /* renamed from: m, reason: collision with root package name */
    public int f115176m;

    /* renamed from: n, reason: collision with root package name */
    public int f115177n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.mu f115178o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.ie f115179p;

    /* renamed from: q, reason: collision with root package name */
    public int f115180q;

    /* renamed from: s, reason: collision with root package name */
    public bw5.ez f115182s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.ad f115183t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f115184u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.nv f115185v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.qw f115186w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.mw f115187x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f115188y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.yn f115189z;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f115170d = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f115181r = new java.util.LinkedList();

    /* renamed from: J, reason: collision with root package name */
    public final boolean[] f115169J = new boolean[34];

    static {
        new bw5.tw();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tw mo11468x92b714fd(byte[] bArr) {
        return (bw5.tw) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tw)) {
            return false;
        }
        bw5.tw twVar = (bw5.tw) fVar;
        return n51.f.a(this.f76492x92037252, twVar.f76492x92037252) && n51.f.a(this.f115170d, twVar.f115170d) && n51.f.a(this.f115171e, twVar.f115171e) && n51.f.a(this.f115172f, twVar.f115172f) && n51.f.a(this.f115173g, twVar.f115173g) && n51.f.a(java.lang.Integer.valueOf(this.f115174h), java.lang.Integer.valueOf(twVar.f115174h)) && n51.f.a(java.lang.Integer.valueOf(this.f115175i), java.lang.Integer.valueOf(twVar.f115175i)) && n51.f.a(java.lang.Integer.valueOf(this.f115176m), java.lang.Integer.valueOf(twVar.f115176m)) && n51.f.a(java.lang.Integer.valueOf(this.f115177n), java.lang.Integer.valueOf(twVar.f115177n)) && n51.f.a(this.f115178o, twVar.f115178o) && n51.f.a(this.f115179p, twVar.f115179p) && n51.f.a(java.lang.Integer.valueOf(this.f115180q), java.lang.Integer.valueOf(twVar.f115180q)) && n51.f.a(this.f115181r, twVar.f115181r) && n51.f.a(this.f115182s, twVar.f115182s) && n51.f.a(this.f115183t, twVar.f115183t) && n51.f.a(this.f115184u, twVar.f115184u) && n51.f.a(this.f115185v, twVar.f115185v) && n51.f.a(this.f115186w, twVar.f115186w) && n51.f.a(this.f115187x, twVar.f115187x) && n51.f.a(this.f115188y, twVar.f115188y) && n51.f.a(this.f115189z, twVar.f115189z) && n51.f.a(this.A, twVar.A) && n51.f.a(this.B, twVar.B) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(twVar.C)) && n51.f.a(this.D, twVar.D) && n51.f.a(this.E, twVar.E) && n51.f.a(this.F, twVar.F) && n51.f.a(this.G, twVar.G) && n51.f.a(this.H, twVar.H) && n51.f.a(this.I, twVar.I);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f115169J[1] ? this.f76492x92037252 : new r45.ie();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.tw();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f115169J;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, this.f115170d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f115171e;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            java.lang.String str = this.f115172f;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f115173g;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            if (zArr[6]) {
                fVar.e(6, this.f115174h);
            }
            if (zArr[7]) {
                fVar.e(7, this.f115175i);
            }
            if (zArr[8]) {
                fVar.e(8, this.f115176m);
            }
            if (zArr[9]) {
                fVar.e(9, this.f115177n);
            }
            bw5.mu muVar = this.f115178o;
            if (muVar != null && zArr[10]) {
                fVar.i(10, muVar.mo75928xcd1e8d8());
                this.f115178o.mo75956x3d5d1f78(fVar);
            }
            bw5.ie ieVar2 = this.f115179p;
            if (ieVar2 != null && zArr[11]) {
                fVar.i(11, ieVar2.mo75928xcd1e8d8());
                this.f115179p.mo75956x3d5d1f78(fVar);
            }
            if (zArr[12]) {
                fVar.e(12, this.f115180q);
            }
            fVar.g(13, 8, this.f115181r);
            bw5.ez ezVar = this.f115182s;
            if (ezVar != null && zArr[14]) {
                fVar.i(14, ezVar.mo75928xcd1e8d8());
                this.f115182s.mo75956x3d5d1f78(fVar);
            }
            bw5.ad adVar = this.f115183t;
            if (adVar != null && zArr[15]) {
                fVar.i(15, adVar.mo75928xcd1e8d8());
                this.f115183t.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f115184u;
            if (str3 != null && zArr[16]) {
                fVar.j(16, str3);
            }
            bw5.nv nvVar = this.f115185v;
            if (nvVar != null && zArr[17]) {
                fVar.i(17, nvVar.mo75928xcd1e8d8());
                this.f115185v.mo75956x3d5d1f78(fVar);
            }
            bw5.qw qwVar = this.f115186w;
            if (qwVar != null && zArr[18]) {
                fVar.i(18, qwVar.mo75928xcd1e8d8());
                this.f115186w.mo75956x3d5d1f78(fVar);
            }
            bw5.mw mwVar = this.f115187x;
            if (mwVar != null && zArr[19]) {
                fVar.i(19, mwVar.mo75928xcd1e8d8());
                this.f115187x.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f115188y;
            if (str4 != null && zArr[20]) {
                fVar.j(20, str4);
            }
            bw5.yn ynVar = this.f115189z;
            if (ynVar != null && zArr[21]) {
                fVar.i(21, ynVar.mo75928xcd1e8d8());
                this.f115189z.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.A;
            if (gVar2 != null && zArr[22]) {
                fVar.b(22, gVar2);
            }
            java.lang.String str5 = this.B;
            if (str5 != null && zArr[23]) {
                fVar.j(23, str5);
            }
            if (zArr[24]) {
                fVar.e(24, this.C);
            }
            bw5.vw vwVar = this.D;
            if (vwVar != null && zArr[25]) {
                fVar.i(25, vwVar.mo75928xcd1e8d8());
                this.D.mo75956x3d5d1f78(fVar);
            }
            bw5.jv jvVar = this.E;
            if (jvVar != null && zArr[28]) {
                fVar.i(28, jvVar.mo75928xcd1e8d8());
                this.E.mo75956x3d5d1f78(fVar);
            }
            bw5.pw pwVar = this.F;
            if (pwVar != null && zArr[29]) {
                fVar.i(29, pwVar.mo75928xcd1e8d8());
                this.F.mo75956x3d5d1f78(fVar);
            }
            bw5.zn0 zn0Var = this.G;
            if (zn0Var != null && zArr[30]) {
                fVar.i(30, zn0Var.mo75928xcd1e8d8());
                this.G.mo75956x3d5d1f78(fVar);
            }
            bw5.co0 co0Var = this.H;
            if (co0Var != null && zArr[31]) {
                fVar.i(31, co0Var.mo75928xcd1e8d8());
                this.H.mo75956x3d5d1f78(fVar);
            }
            bw5.do0 do0Var = this.I;
            if (do0Var != null && zArr[33]) {
                fVar.i(33, do0Var.mo75928xcd1e8d8());
                this.I.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar3 = this.f76492x92037252;
            if (ieVar3 != null && zArr[1]) {
                i18 = b36.f.i(1, ieVar3.mo75928xcd1e8d8()) + 0;
            }
            int g17 = i18 + b36.f.g(2, 8, this.f115170d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f115171e;
            if (gVar3 != null && zArr[3]) {
                g17 += b36.f.b(3, gVar3);
            }
            java.lang.String str6 = this.f115172f;
            if (str6 != null && zArr[4]) {
                g17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f115173g;
            if (str7 != null && zArr[5]) {
                g17 += b36.f.j(5, str7);
            }
            if (zArr[6]) {
                g17 += b36.f.e(6, this.f115174h);
            }
            if (zArr[7]) {
                g17 += b36.f.e(7, this.f115175i);
            }
            if (zArr[8]) {
                g17 += b36.f.e(8, this.f115176m);
            }
            if (zArr[9]) {
                g17 += b36.f.e(9, this.f115177n);
            }
            bw5.mu muVar2 = this.f115178o;
            if (muVar2 != null && zArr[10]) {
                g17 += b36.f.i(10, muVar2.mo75928xcd1e8d8());
            }
            bw5.ie ieVar4 = this.f115179p;
            if (ieVar4 != null && zArr[11]) {
                g17 += b36.f.i(11, ieVar4.mo75928xcd1e8d8());
            }
            if (zArr[12]) {
                g17 += b36.f.e(12, this.f115180q);
            }
            int g18 = g17 + b36.f.g(13, 8, this.f115181r);
            bw5.ez ezVar2 = this.f115182s;
            if (ezVar2 != null && zArr[14]) {
                g18 += b36.f.i(14, ezVar2.mo75928xcd1e8d8());
            }
            bw5.ad adVar2 = this.f115183t;
            if (adVar2 != null && zArr[15]) {
                g18 += b36.f.i(15, adVar2.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f115184u;
            if (str8 != null && zArr[16]) {
                g18 += b36.f.j(16, str8);
            }
            bw5.nv nvVar2 = this.f115185v;
            if (nvVar2 != null && zArr[17]) {
                g18 += b36.f.i(17, nvVar2.mo75928xcd1e8d8());
            }
            bw5.qw qwVar2 = this.f115186w;
            if (qwVar2 != null && zArr[18]) {
                g18 += b36.f.i(18, qwVar2.mo75928xcd1e8d8());
            }
            bw5.mw mwVar2 = this.f115187x;
            if (mwVar2 != null && zArr[19]) {
                g18 += b36.f.i(19, mwVar2.mo75928xcd1e8d8());
            }
            java.lang.String str9 = this.f115188y;
            if (str9 != null && zArr[20]) {
                g18 += b36.f.j(20, str9);
            }
            bw5.yn ynVar2 = this.f115189z;
            if (ynVar2 != null && zArr[21]) {
                g18 += b36.f.i(21, ynVar2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.A;
            if (gVar4 != null && zArr[22]) {
                g18 += b36.f.b(22, gVar4);
            }
            java.lang.String str10 = this.B;
            if (str10 != null && zArr[23]) {
                g18 += b36.f.j(23, str10);
            }
            if (zArr[24]) {
                g18 += b36.f.e(24, this.C);
            }
            bw5.vw vwVar2 = this.D;
            if (vwVar2 != null && zArr[25]) {
                g18 += b36.f.i(25, vwVar2.mo75928xcd1e8d8());
            }
            bw5.jv jvVar2 = this.E;
            if (jvVar2 != null && zArr[28]) {
                g18 += b36.f.i(28, jvVar2.mo75928xcd1e8d8());
            }
            bw5.pw pwVar2 = this.F;
            if (pwVar2 != null && zArr[29]) {
                g18 += b36.f.i(29, pwVar2.mo75928xcd1e8d8());
            }
            bw5.zn0 zn0Var2 = this.G;
            if (zn0Var2 != null && zArr[30]) {
                g18 += b36.f.i(30, zn0Var2.mo75928xcd1e8d8());
            }
            bw5.co0 co0Var2 = this.H;
            if (co0Var2 != null && zArr[31]) {
                g18 += b36.f.i(31, co0Var2.mo75928xcd1e8d8());
            }
            bw5.do0 do0Var2 = this.I;
            return (do0Var2 == null || !zArr[33]) ? g18 : g18 + b36.f.i(33, do0Var2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            this.f115170d.clear();
            this.f115181r.clear();
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar5 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar5.mo11468x92b714fd(bArr);
                    }
                    this.f76492x92037252 = ieVar5;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.yr yrVar = new bw5.yr();
                    if (bArr2 != null && bArr2.length > 0) {
                        yrVar.mo11468x92b714fd(bArr2);
                    }
                    this.f115170d.add(yrVar);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f115171e = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f115172f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115173g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f115174h = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f115175i = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f115176m = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f115177n = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.mu muVar3 = new bw5.mu();
                    if (bArr3 != null && bArr3.length > 0) {
                        muVar3.mo11468x92b714fd(bArr3);
                    }
                    this.f115178o = muVar3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.ie ieVar6 = new bw5.ie();
                    if (bArr4 != null && bArr4.length > 0) {
                        ieVar6.mo11468x92b714fd(bArr4);
                    }
                    this.f115179p = ieVar6;
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f115180q = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.yr yrVar2 = new bw5.yr();
                    if (bArr5 != null && bArr5.length > 0) {
                        yrVar2.mo11468x92b714fd(bArr5);
                    }
                    this.f115181r.add(yrVar2);
                }
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.ez ezVar3 = new bw5.ez();
                    if (bArr6 != null && bArr6.length > 0) {
                        ezVar3.mo11468x92b714fd(bArr6);
                    }
                    this.f115182s = ezVar3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.ad adVar3 = new bw5.ad();
                    if (bArr7 != null && bArr7.length > 0) {
                        adVar3.mo11468x92b714fd(bArr7);
                    }
                    this.f115183t = adVar3;
                }
                zArr[15] = true;
                return 0;
            case 16:
                this.f115184u = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.nv nvVar3 = new bw5.nv();
                    if (bArr8 != null && bArr8.length > 0) {
                        nvVar3.mo11468x92b714fd(bArr8);
                    }
                    this.f115185v = nvVar3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    bw5.qw qwVar3 = new bw5.qw();
                    if (bArr9 != null && bArr9.length > 0) {
                        qwVar3.mo11468x92b714fd(bArr9);
                    }
                    this.f115186w = qwVar3;
                }
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    bw5.mw mwVar3 = new bw5.mw();
                    if (bArr10 != null && bArr10.length > 0) {
                        mwVar3.mo11468x92b714fd(bArr10);
                    }
                    this.f115187x = mwVar3;
                }
                zArr[19] = true;
                return 0;
            case 20:
                this.f115188y = aVar2.k(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    bw5.yn ynVar3 = new bw5.yn();
                    if (bArr11 != null && bArr11.length > 0) {
                        ynVar3.mo11468x92b714fd(bArr11);
                    }
                    this.f115189z = ynVar3;
                }
                zArr[21] = true;
                return 0;
            case 22:
                this.A = aVar2.d(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.B = aVar2.k(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.C = aVar2.g(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    bw5.vw vwVar3 = new bw5.vw();
                    if (bArr12 != null && bArr12.length > 0) {
                        vwVar3.mo11468x92b714fd(bArr12);
                    }
                    this.D = vwVar3;
                }
                zArr[25] = true;
                return 0;
            case 26:
            case 27:
            case 32:
            default:
                return -1;
            case 28:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr13 = (byte[]) j57.get(i59);
                    bw5.jv jvVar3 = new bw5.jv();
                    if (bArr13 != null && bArr13.length > 0) {
                        jvVar3.mo11468x92b714fd(bArr13);
                    }
                    this.E = jvVar3;
                }
                zArr[28] = true;
                return 0;
            case 29:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr14 = (byte[]) j58.get(i66);
                    bw5.pw pwVar3 = new bw5.pw();
                    if (bArr14 != null && bArr14.length > 0) {
                        pwVar3.mo11468x92b714fd(bArr14);
                    }
                    this.F = pwVar3;
                }
                zArr[29] = true;
                return 0;
            case 30:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i67 = 0; i67 < size15; i67++) {
                    byte[] bArr15 = (byte[]) j59.get(i67);
                    bw5.zn0 zn0Var3 = new bw5.zn0();
                    if (bArr15 != null && bArr15.length > 0) {
                        zn0Var3.mo11468x92b714fd(bArr15);
                    }
                    this.G = zn0Var3;
                }
                zArr[30] = true;
                return 0;
            case 31:
                java.util.LinkedList j66 = aVar2.j(intValue);
                int size16 = j66.size();
                for (int i68 = 0; i68 < size16; i68++) {
                    byte[] bArr16 = (byte[]) j66.get(i68);
                    bw5.co0 co0Var3 = new bw5.co0();
                    if (bArr16 != null && bArr16.length > 0) {
                        co0Var3.mo11468x92b714fd(bArr16);
                    }
                    this.H = co0Var3;
                }
                zArr[31] = true;
                return 0;
            case 33:
                java.util.LinkedList j67 = aVar2.j(intValue);
                int size17 = j67.size();
                for (int i69 = 0; i69 < size17; i69++) {
                    byte[] bArr17 = (byte[]) j67.get(i69);
                    bw5.do0 do0Var3 = new bw5.do0();
                    if (bArr17 != null && bArr17.length > 0) {
                        do0Var3.mo11468x92b714fd(bArr17);
                    }
                    this.I = do0Var3;
                }
                zArr[33] = true;
                return 0;
        }
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f115169J[1] = true;
        return this;
    }
}
