package bw5;

/* loaded from: classes9.dex */
public class qf extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public bw5.nf A;
    public int B;
    public final boolean[] C = new boolean[23];

    /* renamed from: d, reason: collision with root package name */
    public long f113600d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.a9 f113601e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.o9 f113602f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.a9 f113603g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.o9 f113604h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.d9 f113605i;

    /* renamed from: m, reason: collision with root package name */
    public int f113606m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.lf f113607n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.hf f113608o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.Cif f113609p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f113610q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f113611r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.of f113612s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.x7 f113613t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f113614u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.a9 f113615v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.a9 f113616w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.a9 f113617x;

    /* renamed from: y, reason: collision with root package name */
    public bw5.pf f113618y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.jf f113619z;

    static {
        new bw5.qf();
    }

    public java.lang.String b() {
        return this.C[15] ? this.f113614u : "";
    }

    public bw5.jf c() {
        return this.C[20] ? this.f113619z : new bw5.jf();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qf)) {
            return false;
        }
        bw5.qf qfVar = (bw5.qf) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f113600d), java.lang.Long.valueOf(qfVar.f113600d)) && n51.f.a(this.f113601e, qfVar.f113601e) && n51.f.a(this.f113602f, qfVar.f113602f) && n51.f.a(this.f113603g, qfVar.f113603g) && n51.f.a(this.f113604h, qfVar.f113604h) && n51.f.a(this.f113605i, qfVar.f113605i) && n51.f.a(java.lang.Integer.valueOf(this.f113606m), java.lang.Integer.valueOf(qfVar.f113606m)) && n51.f.a(this.f113607n, qfVar.f113607n) && n51.f.a(this.f113608o, qfVar.f113608o) && n51.f.a(this.f113609p, qfVar.f113609p) && n51.f.a(this.f113610q, qfVar.f113610q) && n51.f.a(this.f113611r, qfVar.f113611r) && n51.f.a(this.f113612s, qfVar.f113612s) && n51.f.a(this.f113613t, qfVar.f113613t) && n51.f.a(this.f113614u, qfVar.f113614u) && n51.f.a(this.f113615v, qfVar.f113615v) && n51.f.a(this.f113616w, qfVar.f113616w) && n51.f.a(this.f113617x, qfVar.f113617x) && n51.f.a(this.f113618y, qfVar.f113618y) && n51.f.a(this.f113619z, qfVar.f113619z) && n51.f.a(this.A, qfVar.A) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(qfVar.B));
    }

    public bw5.Cif d() {
        return this.C[10] ? this.f113609p : new bw5.Cif();
    }

    public bw5.x7 e() {
        return this.C[14] ? this.f113613t : new bw5.x7();
    }

    public bw5.nf f() {
        return this.C[21] ? this.A : new bw5.nf();
    }

    public bw5.of g() {
        return this.C[13] ? this.f113612s : new bw5.of();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public bw5.qf mo11468x92b714fd(byte[] bArr) {
        return (bw5.qf) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.qf();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.C;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f113600d);
            }
            bw5.a9 a9Var = this.f113601e;
            if (a9Var != null && zArr[2]) {
                fVar.i(2, a9Var.mo75928xcd1e8d8());
                this.f113601e.mo75956x3d5d1f78(fVar);
            }
            bw5.o9 o9Var = this.f113602f;
            if (o9Var != null && zArr[3]) {
                fVar.i(3, o9Var.mo75928xcd1e8d8());
                this.f113602f.mo75956x3d5d1f78(fVar);
            }
            bw5.a9 a9Var2 = this.f113603g;
            if (a9Var2 != null && zArr[4]) {
                fVar.i(4, a9Var2.mo75928xcd1e8d8());
                this.f113603g.mo75956x3d5d1f78(fVar);
            }
            bw5.o9 o9Var2 = this.f113604h;
            if (o9Var2 != null && zArr[5]) {
                fVar.i(5, o9Var2.mo75928xcd1e8d8());
                this.f113604h.mo75956x3d5d1f78(fVar);
            }
            bw5.d9 d9Var = this.f113605i;
            if (d9Var != null && zArr[6]) {
                fVar.i(6, d9Var.mo75928xcd1e8d8());
                this.f113605i.mo75956x3d5d1f78(fVar);
            }
            if (zArr[7]) {
                fVar.e(7, this.f113606m);
            }
            bw5.lf lfVar = this.f113607n;
            if (lfVar != null && zArr[8]) {
                fVar.i(8, lfVar.mo75928xcd1e8d8());
                this.f113607n.mo75956x3d5d1f78(fVar);
            }
            bw5.hf hfVar = this.f113608o;
            if (hfVar != null && zArr[9]) {
                fVar.i(9, hfVar.mo75928xcd1e8d8());
                this.f113608o.mo75956x3d5d1f78(fVar);
            }
            bw5.Cif cif = this.f113609p;
            if (cif != null && zArr[10]) {
                fVar.i(10, cif.mo75928xcd1e8d8());
                this.f113609p.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f113610q;
            if (str != null && zArr[11]) {
                fVar.j(11, str);
            }
            java.lang.String str2 = this.f113611r;
            if (str2 != null && zArr[12]) {
                fVar.j(12, str2);
            }
            bw5.of ofVar = this.f113612s;
            if (ofVar != null && zArr[13]) {
                fVar.i(13, ofVar.mo75928xcd1e8d8());
                this.f113612s.mo75956x3d5d1f78(fVar);
            }
            bw5.x7 x7Var = this.f113613t;
            if (x7Var != null && zArr[14]) {
                fVar.i(14, x7Var.mo75928xcd1e8d8());
                this.f113613t.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f113614u;
            if (str3 != null && zArr[15]) {
                fVar.j(15, str3);
            }
            bw5.a9 a9Var3 = this.f113615v;
            if (a9Var3 != null && zArr[16]) {
                fVar.i(16, a9Var3.mo75928xcd1e8d8());
                this.f113615v.mo75956x3d5d1f78(fVar);
            }
            bw5.a9 a9Var4 = this.f113616w;
            if (a9Var4 != null && zArr[17]) {
                fVar.i(17, a9Var4.mo75928xcd1e8d8());
                this.f113616w.mo75956x3d5d1f78(fVar);
            }
            bw5.a9 a9Var5 = this.f113617x;
            if (a9Var5 != null && zArr[18]) {
                fVar.i(18, a9Var5.mo75928xcd1e8d8());
                this.f113617x.mo75956x3d5d1f78(fVar);
            }
            bw5.pf pfVar = this.f113618y;
            if (pfVar != null && zArr[19]) {
                fVar.i(19, pfVar.mo75928xcd1e8d8());
                this.f113618y.mo75956x3d5d1f78(fVar);
            }
            bw5.jf jfVar = this.f113619z;
            if (jfVar != null && zArr[20]) {
                fVar.i(20, jfVar.mo75928xcd1e8d8());
                this.f113619z.mo75956x3d5d1f78(fVar);
            }
            bw5.nf nfVar = this.A;
            if (nfVar != null && zArr[21]) {
                fVar.i(21, nfVar.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            if (zArr[22]) {
                fVar.e(22, this.B);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f113600d) + 0 : 0;
            bw5.a9 a9Var6 = this.f113601e;
            if (a9Var6 != null && zArr[2]) {
                h17 += b36.f.i(2, a9Var6.mo75928xcd1e8d8());
            }
            bw5.o9 o9Var3 = this.f113602f;
            if (o9Var3 != null && zArr[3]) {
                h17 += b36.f.i(3, o9Var3.mo75928xcd1e8d8());
            }
            bw5.a9 a9Var7 = this.f113603g;
            if (a9Var7 != null && zArr[4]) {
                h17 += b36.f.i(4, a9Var7.mo75928xcd1e8d8());
            }
            bw5.o9 o9Var4 = this.f113604h;
            if (o9Var4 != null && zArr[5]) {
                h17 += b36.f.i(5, o9Var4.mo75928xcd1e8d8());
            }
            bw5.d9 d9Var2 = this.f113605i;
            if (d9Var2 != null && zArr[6]) {
                h17 += b36.f.i(6, d9Var2.mo75928xcd1e8d8());
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f113606m);
            }
            bw5.lf lfVar2 = this.f113607n;
            if (lfVar2 != null && zArr[8]) {
                h17 += b36.f.i(8, lfVar2.mo75928xcd1e8d8());
            }
            bw5.hf hfVar2 = this.f113608o;
            if (hfVar2 != null && zArr[9]) {
                h17 += b36.f.i(9, hfVar2.mo75928xcd1e8d8());
            }
            bw5.Cif cif2 = this.f113609p;
            if (cif2 != null && zArr[10]) {
                h17 += b36.f.i(10, cif2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f113610q;
            if (str4 != null && zArr[11]) {
                h17 += b36.f.j(11, str4);
            }
            java.lang.String str5 = this.f113611r;
            if (str5 != null && zArr[12]) {
                h17 += b36.f.j(12, str5);
            }
            bw5.of ofVar2 = this.f113612s;
            if (ofVar2 != null && zArr[13]) {
                h17 += b36.f.i(13, ofVar2.mo75928xcd1e8d8());
            }
            bw5.x7 x7Var2 = this.f113613t;
            if (x7Var2 != null && zArr[14]) {
                h17 += b36.f.i(14, x7Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f113614u;
            if (str6 != null && zArr[15]) {
                h17 += b36.f.j(15, str6);
            }
            bw5.a9 a9Var8 = this.f113615v;
            if (a9Var8 != null && zArr[16]) {
                h17 += b36.f.i(16, a9Var8.mo75928xcd1e8d8());
            }
            bw5.a9 a9Var9 = this.f113616w;
            if (a9Var9 != null && zArr[17]) {
                h17 += b36.f.i(17, a9Var9.mo75928xcd1e8d8());
            }
            bw5.a9 a9Var10 = this.f113617x;
            if (a9Var10 != null && zArr[18]) {
                h17 += b36.f.i(18, a9Var10.mo75928xcd1e8d8());
            }
            bw5.pf pfVar2 = this.f113618y;
            if (pfVar2 != null && zArr[19]) {
                h17 += b36.f.i(19, pfVar2.mo75928xcd1e8d8());
            }
            bw5.jf jfVar2 = this.f113619z;
            if (jfVar2 != null && zArr[20]) {
                h17 += b36.f.i(20, jfVar2.mo75928xcd1e8d8());
            }
            bw5.nf nfVar2 = this.A;
            if (nfVar2 != null && zArr[21]) {
                h17 += b36.f.i(21, nfVar2.mo75928xcd1e8d8());
            }
            return zArr[22] ? h17 + b36.f.e(22, this.B) : h17;
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
                this.f113600d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.a9 a9Var11 = new bw5.a9();
                    if (bArr != null && bArr.length > 0) {
                        a9Var11.mo11468x92b714fd(bArr);
                    }
                    this.f113601e = a9Var11;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.o9 o9Var5 = new bw5.o9();
                    if (bArr2 != null && bArr2.length > 0) {
                        o9Var5.mo11468x92b714fd(bArr2);
                    }
                    this.f113602f = o9Var5;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.a9 a9Var12 = new bw5.a9();
                    if (bArr3 != null && bArr3.length > 0) {
                        a9Var12.mo11468x92b714fd(bArr3);
                    }
                    this.f113603g = a9Var12;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.o9 o9Var6 = new bw5.o9();
                    if (bArr4 != null && bArr4.length > 0) {
                        o9Var6.mo11468x92b714fd(bArr4);
                    }
                    this.f113604h = o9Var6;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.d9 d9Var3 = new bw5.d9();
                    if (bArr5 != null && bArr5.length > 0) {
                        d9Var3.mo11468x92b714fd(bArr5);
                    }
                    this.f113605i = d9Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f113606m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.lf lfVar3 = new bw5.lf();
                    if (bArr6 != null && bArr6.length > 0) {
                        lfVar3.mo11468x92b714fd(bArr6);
                    }
                    this.f113607n = lfVar3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.hf hfVar3 = new bw5.hf();
                    if (bArr7 != null && bArr7.length > 0) {
                        hfVar3.mo11468x92b714fd(bArr7);
                    }
                    this.f113608o = hfVar3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    bw5.Cif cif3 = new bw5.Cif();
                    if (bArr8 != null && bArr8.length > 0) {
                        cif3.mo11468x92b714fd(bArr8);
                    }
                    this.f113609p = cif3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f113610q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f113611r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j39.get(i47);
                    bw5.of ofVar3 = new bw5.of();
                    if (bArr9 != null && bArr9.length > 0) {
                        ofVar3.mo11468x92b714fd(bArr9);
                    }
                    this.f113612s = ofVar3;
                }
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr10 = (byte[]) j47.get(i48);
                    bw5.x7 x7Var3 = new bw5.x7();
                    if (bArr10 != null && bArr10.length > 0) {
                        x7Var3.mo11468x92b714fd(bArr10);
                    }
                    this.f113613t = x7Var3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                this.f113614u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i49 = 0; i49 < size11; i49++) {
                    byte[] bArr11 = (byte[]) j48.get(i49);
                    bw5.a9 a9Var13 = new bw5.a9();
                    if (bArr11 != null && bArr11.length > 0) {
                        a9Var13.mo11468x92b714fd(bArr11);
                    }
                    this.f113615v = a9Var13;
                }
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i57 = 0; i57 < size12; i57++) {
                    byte[] bArr12 = (byte[]) j49.get(i57);
                    bw5.a9 a9Var14 = new bw5.a9();
                    if (bArr12 != null && bArr12.length > 0) {
                        a9Var14.mo11468x92b714fd(bArr12);
                    }
                    this.f113616w = a9Var14;
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i58 = 0; i58 < size13; i58++) {
                    byte[] bArr13 = (byte[]) j57.get(i58);
                    bw5.a9 a9Var15 = new bw5.a9();
                    if (bArr13 != null && bArr13.length > 0) {
                        a9Var15.mo11468x92b714fd(bArr13);
                    }
                    this.f113617x = a9Var15;
                }
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i59 = 0; i59 < size14; i59++) {
                    byte[] bArr14 = (byte[]) j58.get(i59);
                    bw5.pf pfVar3 = new bw5.pf();
                    if (bArr14 != null && bArr14.length > 0) {
                        pfVar3.mo11468x92b714fd(bArr14);
                    }
                    this.f113618y = pfVar3;
                }
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i66 = 0; i66 < size15; i66++) {
                    byte[] bArr15 = (byte[]) j59.get(i66);
                    bw5.jf jfVar3 = new bw5.jf();
                    if (bArr15 != null && bArr15.length > 0) {
                        jfVar3.mo11468x92b714fd(bArr15);
                    }
                    this.f113619z = jfVar3;
                }
                zArr[20] = true;
                return 0;
            case 21:
                java.util.LinkedList j66 = aVar2.j(intValue);
                int size16 = j66.size();
                for (int i67 = 0; i67 < size16; i67++) {
                    byte[] bArr16 = (byte[]) j66.get(i67);
                    bw5.nf nfVar3 = new bw5.nf();
                    if (bArr16 != null && bArr16.length > 0) {
                        nfVar3.mo11468x92b714fd(bArr16);
                    }
                    this.A = nfVar3;
                }
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.g(intValue);
                zArr[22] = true;
                return 0;
            default:
                return -1;
        }
    }
}
