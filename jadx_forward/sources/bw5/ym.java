package bw5;

/* loaded from: classes2.dex */
public class ym extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public bw5.pj A;
    public java.lang.String B;
    public bw5.pj C;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f117092d;

    /* renamed from: e, reason: collision with root package name */
    public int f117093e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.ql f117094f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.ql f117095g;

    /* renamed from: h, reason: collision with root package name */
    public int f117096h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.oo f117097i;

    /* renamed from: n, reason: collision with root package name */
    public bw5.bn f117099n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.fl f117100o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f117101p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.w20 f117102q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.xm f117103r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.zm f117104s;

    /* renamed from: u, reason: collision with root package name */
    public bw5.ln f117106u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.gl f117107v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.wm f117108w;

    /* renamed from: y, reason: collision with root package name */
    public bw5.eo f117110y;

    /* renamed from: z, reason: collision with root package name */
    public double f117111z;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f117098m = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f117105t = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f117109x = new java.util.LinkedList();
    public final boolean[] D = new boolean[24];

    static {
        new bw5.ym();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ym mo11468x92b714fd(byte[] bArr) {
        return (bw5.ym) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ym)) {
            return false;
        }
        bw5.ym ymVar = (bw5.ym) fVar;
        return n51.f.a(this.f117092d, ymVar.f117092d) && n51.f.a(java.lang.Integer.valueOf(this.f117093e), java.lang.Integer.valueOf(ymVar.f117093e)) && n51.f.a(this.f117094f, ymVar.f117094f) && n51.f.a(this.f117095g, ymVar.f117095g) && n51.f.a(java.lang.Integer.valueOf(this.f117096h), java.lang.Integer.valueOf(ymVar.f117096h)) && n51.f.a(this.f117097i, ymVar.f117097i) && n51.f.a(this.f117098m, ymVar.f117098m) && n51.f.a(this.f117099n, ymVar.f117099n) && n51.f.a(this.f117100o, ymVar.f117100o) && n51.f.a(java.lang.Boolean.valueOf(this.f117101p), java.lang.Boolean.valueOf(ymVar.f117101p)) && n51.f.a(this.f117102q, ymVar.f117102q) && n51.f.a(this.f117103r, ymVar.f117103r) && n51.f.a(this.f117104s, ymVar.f117104s) && n51.f.a(this.f117105t, ymVar.f117105t) && n51.f.a(this.f117106u, ymVar.f117106u) && n51.f.a(this.f117107v, ymVar.f117107v) && n51.f.a(this.f117108w, ymVar.f117108w) && n51.f.a(this.f117109x, ymVar.f117109x) && n51.f.a(this.f117110y, ymVar.f117110y) && n51.f.a(java.lang.Double.valueOf(this.f117111z), java.lang.Double.valueOf(ymVar.f117111z)) && n51.f.a(this.A, ymVar.A) && n51.f.a(this.B, ymVar.B) && n51.f.a(this.C, ymVar.C);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ym();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.D;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f117092d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f117093e);
            }
            bw5.ql qlVar = this.f117094f;
            if (qlVar != null && zArr[3]) {
                fVar.i(3, qlVar.mo75928xcd1e8d8());
                this.f117094f.mo75956x3d5d1f78(fVar);
            }
            bw5.ql qlVar2 = this.f117095g;
            if (qlVar2 != null && zArr[4]) {
                fVar.i(4, qlVar2.mo75928xcd1e8d8());
                this.f117095g.mo75956x3d5d1f78(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f117096h);
            }
            bw5.oo ooVar = this.f117097i;
            if (ooVar != null && zArr[6]) {
                fVar.i(6, ooVar.mo75928xcd1e8d8());
                this.f117097i.mo75956x3d5d1f78(fVar);
            }
            fVar.g(7, 8, this.f117098m);
            bw5.bn bnVar = this.f117099n;
            if (bnVar != null && zArr[8]) {
                fVar.i(8, bnVar.mo75928xcd1e8d8());
                this.f117099n.mo75956x3d5d1f78(fVar);
            }
            bw5.fl flVar = this.f117100o;
            if (flVar != null && zArr[9]) {
                fVar.i(9, flVar.mo75928xcd1e8d8());
                this.f117100o.mo75956x3d5d1f78(fVar);
            }
            if (zArr[10]) {
                fVar.a(10, this.f117101p);
            }
            bw5.w20 w20Var = this.f117102q;
            if (w20Var != null && zArr[11]) {
                fVar.i(11, w20Var.mo75928xcd1e8d8());
                this.f117102q.mo75956x3d5d1f78(fVar);
            }
            bw5.xm xmVar = this.f117103r;
            if (xmVar != null && zArr[12]) {
                fVar.i(12, xmVar.mo75928xcd1e8d8());
                this.f117103r.mo75956x3d5d1f78(fVar);
            }
            bw5.zm zmVar = this.f117104s;
            if (zmVar != null && zArr[13]) {
                fVar.i(13, zmVar.mo75928xcd1e8d8());
                this.f117104s.mo75956x3d5d1f78(fVar);
            }
            fVar.g(14, 8, this.f117105t);
            bw5.ln lnVar = this.f117106u;
            if (lnVar != null && zArr[15]) {
                fVar.i(15, lnVar.mo75928xcd1e8d8());
                this.f117106u.mo75956x3d5d1f78(fVar);
            }
            bw5.gl glVar = this.f117107v;
            if (glVar != null && zArr[16]) {
                fVar.i(16, glVar.mo75928xcd1e8d8());
                this.f117107v.mo75956x3d5d1f78(fVar);
            }
            bw5.wm wmVar = this.f117108w;
            if (wmVar != null && zArr[17]) {
                fVar.i(17, wmVar.mo75928xcd1e8d8());
                this.f117108w.mo75956x3d5d1f78(fVar);
            }
            fVar.g(18, 8, this.f117109x);
            bw5.eo eoVar = this.f117110y;
            if (eoVar != null && zArr[19]) {
                fVar.i(19, eoVar.mo75928xcd1e8d8());
                this.f117110y.mo75956x3d5d1f78(fVar);
            }
            if (zArr[20]) {
                fVar.c(20, this.f117111z);
            }
            bw5.pj pjVar = this.A;
            if (pjVar != null && zArr[21]) {
                fVar.i(21, pjVar.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.B;
            if (str2 != null && zArr[22]) {
                fVar.j(22, str2);
            }
            bw5.pj pjVar2 = this.C;
            if (pjVar2 != null && zArr[23]) {
                fVar.i(23, pjVar2.mo75928xcd1e8d8());
                this.C.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f117092d;
            if (str3 != null && zArr[1]) {
                i18 = b36.f.j(1, str3) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f117093e);
            }
            bw5.ql qlVar3 = this.f117094f;
            if (qlVar3 != null && zArr[3]) {
                i18 += b36.f.i(3, qlVar3.mo75928xcd1e8d8());
            }
            bw5.ql qlVar4 = this.f117095g;
            if (qlVar4 != null && zArr[4]) {
                i18 += b36.f.i(4, qlVar4.mo75928xcd1e8d8());
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f117096h);
            }
            bw5.oo ooVar2 = this.f117097i;
            if (ooVar2 != null && zArr[6]) {
                i18 += b36.f.i(6, ooVar2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(7, 8, this.f117098m);
            bw5.bn bnVar2 = this.f117099n;
            if (bnVar2 != null && zArr[8]) {
                g17 += b36.f.i(8, bnVar2.mo75928xcd1e8d8());
            }
            bw5.fl flVar2 = this.f117100o;
            if (flVar2 != null && zArr[9]) {
                g17 += b36.f.i(9, flVar2.mo75928xcd1e8d8());
            }
            if (zArr[10]) {
                g17 += b36.f.a(10, this.f117101p);
            }
            bw5.w20 w20Var2 = this.f117102q;
            if (w20Var2 != null && zArr[11]) {
                g17 += b36.f.i(11, w20Var2.mo75928xcd1e8d8());
            }
            bw5.xm xmVar2 = this.f117103r;
            if (xmVar2 != null && zArr[12]) {
                g17 += b36.f.i(12, xmVar2.mo75928xcd1e8d8());
            }
            bw5.zm zmVar2 = this.f117104s;
            if (zmVar2 != null && zArr[13]) {
                g17 += b36.f.i(13, zmVar2.mo75928xcd1e8d8());
            }
            int g18 = g17 + b36.f.g(14, 8, this.f117105t);
            bw5.ln lnVar2 = this.f117106u;
            if (lnVar2 != null && zArr[15]) {
                g18 += b36.f.i(15, lnVar2.mo75928xcd1e8d8());
            }
            bw5.gl glVar2 = this.f117107v;
            if (glVar2 != null && zArr[16]) {
                g18 += b36.f.i(16, glVar2.mo75928xcd1e8d8());
            }
            bw5.wm wmVar2 = this.f117108w;
            if (wmVar2 != null && zArr[17]) {
                g18 += b36.f.i(17, wmVar2.mo75928xcd1e8d8());
            }
            int g19 = g18 + b36.f.g(18, 8, this.f117109x);
            bw5.eo eoVar2 = this.f117110y;
            if (eoVar2 != null && zArr[19]) {
                g19 += b36.f.i(19, eoVar2.mo75928xcd1e8d8());
            }
            if (zArr[20]) {
                g19 += b36.f.c(20, this.f117111z);
            }
            bw5.pj pjVar3 = this.A;
            if (pjVar3 != null && zArr[21]) {
                g19 += b36.f.i(21, pjVar3.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.B;
            if (str4 != null && zArr[22]) {
                g19 += b36.f.j(22, str4);
            }
            bw5.pj pjVar4 = this.C;
            return (pjVar4 == null || !zArr[23]) ? g19 : g19 + b36.f.i(23, pjVar4.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            this.f117098m.clear();
            this.f117105t.clear();
            this.f117109x.clear();
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
                this.f117092d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f117093e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.ql qlVar5 = new bw5.ql();
                    if (bArr != null && bArr.length > 0) {
                        qlVar5.mo11468x92b714fd(bArr);
                    }
                    this.f117094f = qlVar5;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.ql qlVar6 = new bw5.ql();
                    if (bArr2 != null && bArr2.length > 0) {
                        qlVar6.mo11468x92b714fd(bArr2);
                    }
                    this.f117095g = qlVar6;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f117096h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.oo ooVar3 = new bw5.oo();
                    if (bArr3 != null && bArr3.length > 0) {
                        ooVar3.mo11468x92b714fd(bArr3);
                    }
                    this.f117097i = ooVar3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.um umVar = new bw5.um();
                    if (bArr4 != null && bArr4.length > 0) {
                        umVar.mo11468x92b714fd(bArr4);
                    }
                    this.f117098m.add(umVar);
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.bn bnVar3 = new bw5.bn();
                    if (bArr5 != null && bArr5.length > 0) {
                        bnVar3.mo11468x92b714fd(bArr5);
                    }
                    this.f117099n = bnVar3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.fl flVar3 = new bw5.fl();
                    if (bArr6 != null && bArr6.length > 0) {
                        flVar3.mo11468x92b714fd(bArr6);
                    }
                    this.f117100o = flVar3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f117101p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.w20 w20Var3 = new bw5.w20();
                    if (bArr7 != null && bArr7.length > 0) {
                        w20Var3.mo11468x92b714fd(bArr7);
                    }
                    this.f117102q = w20Var3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.xm xmVar3 = new bw5.xm();
                    if (bArr8 != null && bArr8.length > 0) {
                        xmVar3.mo11468x92b714fd(bArr8);
                    }
                    this.f117103r = xmVar3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    bw5.zm zmVar3 = new bw5.zm();
                    if (bArr9 != null && bArr9.length > 0) {
                        zmVar3.mo11468x92b714fd(bArr9);
                    }
                    this.f117104s = zmVar3;
                }
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    bw5.bn bnVar4 = new bw5.bn();
                    if (bArr10 != null && bArr10.length > 0) {
                        bnVar4.mo11468x92b714fd(bArr10);
                    }
                    this.f117105t.add(bnVar4);
                }
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    bw5.ln lnVar3 = new bw5.ln();
                    if (bArr11 != null && bArr11.length > 0) {
                        lnVar3.mo11468x92b714fd(bArr11);
                    }
                    this.f117106u = lnVar3;
                }
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    bw5.gl glVar3 = new bw5.gl();
                    if (bArr12 != null && bArr12.length > 0) {
                        glVar3.mo11468x92b714fd(bArr12);
                    }
                    this.f117107v = glVar3;
                }
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr13 = (byte[]) j57.get(i59);
                    bw5.wm wmVar3 = new bw5.wm();
                    if (bArr13 != null && bArr13.length > 0) {
                        wmVar3.mo11468x92b714fd(bArr13);
                    }
                    this.f117108w = wmVar3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr14 = (byte[]) j58.get(i66);
                    bw5.cn cnVar = new bw5.cn();
                    if (bArr14 != null && bArr14.length > 0) {
                        cnVar.mo11468x92b714fd(bArr14);
                    }
                    this.f117109x.add(cnVar);
                }
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i67 = 0; i67 < size15; i67++) {
                    byte[] bArr15 = (byte[]) j59.get(i67);
                    bw5.eo eoVar3 = new bw5.eo();
                    if (bArr15 != null && bArr15.length > 0) {
                        eoVar3.mo11468x92b714fd(bArr15);
                    }
                    this.f117110y = eoVar3;
                }
                zArr[19] = true;
                return 0;
            case 20:
                this.f117111z = aVar2.e(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                java.util.LinkedList j66 = aVar2.j(intValue);
                int size16 = j66.size();
                for (int i68 = 0; i68 < size16; i68++) {
                    byte[] bArr16 = (byte[]) j66.get(i68);
                    bw5.pj pjVar5 = new bw5.pj();
                    if (bArr16 != null && bArr16.length > 0) {
                        pjVar5.mo11468x92b714fd(bArr16);
                    }
                    this.A = pjVar5;
                }
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.k(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                java.util.LinkedList j67 = aVar2.j(intValue);
                int size17 = j67.size();
                for (int i69 = 0; i69 < size17; i69++) {
                    byte[] bArr17 = (byte[]) j67.get(i69);
                    bw5.pj pjVar6 = new bw5.pj();
                    if (bArr17 != null && bArr17.length > 0) {
                        pjVar6.mo11468x92b714fd(bArr17);
                    }
                    this.C = pjVar6;
                }
                zArr[23] = true;
                return 0;
            default:
                return -1;
        }
    }
}
