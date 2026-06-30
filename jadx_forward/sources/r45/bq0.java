package r45;

/* loaded from: classes9.dex */
public class bq0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public long A;
    public r45.mq0 C;
    public int E;
    public r45.sp0 G;
    public r45.dp0 I;
    public r45.qp0 K;
    public r45.kv2 M;
    public r45.op0 P;
    public r45.ev2 Q;
    public java.lang.String R;

    /* renamed from: d, reason: collision with root package name */
    public r45.jq0 f452495d;

    /* renamed from: h, reason: collision with root package name */
    public r45.pp0 f452499h;

    /* renamed from: m, reason: collision with root package name */
    public r45.tq0 f452501m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f452503o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f452505q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f452507s;

    /* renamed from: u, reason: collision with root package name */
    public long f452509u;

    /* renamed from: y, reason: collision with root package name */
    public r45.aq0 f452513y;

    /* renamed from: e, reason: collision with root package name */
    public boolean f452496e = false;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f452497f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f452498g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f452500i = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f452502n = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f452504p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f452506r = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f452508t = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f452510v = false;

    /* renamed from: w, reason: collision with root package name */
    public int f452511w = -1;

    /* renamed from: x, reason: collision with root package name */
    public boolean f452512x = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f452514z = false;
    public boolean B = false;
    public boolean D = false;
    public boolean F = false;
    public boolean H = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f452494J = false;
    public boolean L = false;
    public boolean N = false;
    public boolean S = false;

    public final r45.bq0 b(r45.dp0 dp0Var) {
        this.I = dp0Var;
        this.f452494J = true;
        return this;
    }

    public final r45.bq0 c(int i17) {
        this.f452511w = i17;
        this.f452512x = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bq0)) {
            return false;
        }
        r45.bq0 bq0Var = (r45.bq0) fVar;
        return n51.f.a(this.f452495d, bq0Var.f452495d) && n51.f.a(this.f452497f, bq0Var.f452497f) && n51.f.a(this.f452499h, bq0Var.f452499h) && n51.f.a(this.f452501m, bq0Var.f452501m) && n51.f.a(this.f452503o, bq0Var.f452503o) && n51.f.a(this.f452505q, bq0Var.f452505q) && n51.f.a(this.f452507s, bq0Var.f452507s) && n51.f.a(java.lang.Long.valueOf(this.f452509u), java.lang.Long.valueOf(bq0Var.f452509u)) && n51.f.a(java.lang.Integer.valueOf(this.f452511w), java.lang.Integer.valueOf(bq0Var.f452511w)) && n51.f.a(this.f452513y, bq0Var.f452513y) && n51.f.a(java.lang.Long.valueOf(this.A), java.lang.Long.valueOf(bq0Var.A)) && n51.f.a(this.C, bq0Var.C) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(bq0Var.E)) && n51.f.a(this.G, bq0Var.G) && n51.f.a(this.I, bq0Var.I) && n51.f.a(this.K, bq0Var.K) && n51.f.a(this.M, bq0Var.M) && n51.f.a(this.P, bq0Var.P) && n51.f.a(this.Q, bq0Var.Q) && n51.f.a(this.R, bq0Var.R);
    }

    public final r45.bq0 d(java.util.LinkedList linkedList) {
        this.f452497f = linkedList;
        this.f452498g = true;
        return this;
    }

    public final r45.bq0 e(java.lang.String str) {
        this.f452507s = str;
        this.f452508t = true;
        return this;
    }

    public final r45.bq0 f(java.lang.String str) {
        this.R = str;
        this.S = true;
        return this;
    }

    public final r45.bq0 g(long j17) {
        this.A = j17;
        this.B = true;
        return this;
    }

    /* renamed from: getVersion */
    public final int m161584x52c258a2() {
        return this.E;
    }

    public final r45.bq0 i(r45.kv2 kv2Var) {
        this.M = kv2Var;
        this.N = true;
        return this;
    }

    public final r45.bq0 j(r45.pp0 pp0Var) {
        this.f452499h = pp0Var;
        this.f452500i = true;
        return this;
    }

    public final r45.bq0 k(r45.qp0 qp0Var) {
        this.K = qp0Var;
        this.L = true;
        return this;
    }

    public final r45.bq0 l(r45.sp0 sp0Var) {
        this.G = sp0Var;
        this.H = true;
        return this;
    }

    public final r45.bq0 n(r45.aq0 aq0Var) {
        this.f452513y = aq0Var;
        this.f452514z = true;
        return this;
    }

    public final r45.bq0 o(r45.jq0 jq0Var) {
        this.f452495d = jq0Var;
        this.f452496e = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.jq0 jq0Var = this.f452495d;
            if (jq0Var != null) {
                fVar.i(1, jq0Var.mo75928xcd1e8d8());
                this.f452495d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, this.f452497f);
            r45.pp0 pp0Var = this.f452499h;
            if (pp0Var != null) {
                fVar.i(3, pp0Var.mo75928xcd1e8d8());
                this.f452499h.mo75956x3d5d1f78(fVar);
            }
            r45.tq0 tq0Var = this.f452501m;
            if (tq0Var != null) {
                fVar.i(4, tq0Var.mo75928xcd1e8d8());
                this.f452501m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f452503o;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f452505q;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f452507s;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            if (this.f452510v) {
                fVar.h(8, this.f452509u);
            }
            if (this.f452512x) {
                fVar.e(91, this.f452511w);
            }
            r45.aq0 aq0Var = this.f452513y;
            if (aq0Var != null) {
                fVar.i(10, aq0Var.mo75928xcd1e8d8());
                this.f452513y.mo75956x3d5d1f78(fVar);
            }
            if (this.B) {
                fVar.h(11, this.A);
            }
            r45.mq0 mq0Var = this.C;
            if (mq0Var != null) {
                fVar.i(12, mq0Var.mo75928xcd1e8d8());
                this.C.mo75956x3d5d1f78(fVar);
            }
            if (this.F) {
                fVar.e(13, this.E);
            }
            r45.sp0 sp0Var = this.G;
            if (sp0Var != null) {
                fVar.i(14, sp0Var.mo75928xcd1e8d8());
                this.G.mo75956x3d5d1f78(fVar);
            }
            r45.dp0 dp0Var = this.I;
            if (dp0Var != null) {
                fVar.i(15, dp0Var.mo75928xcd1e8d8());
                this.I.mo75956x3d5d1f78(fVar);
            }
            r45.qp0 qp0Var = this.K;
            if (qp0Var != null) {
                fVar.i(16, qp0Var.mo75928xcd1e8d8());
                this.K.mo75956x3d5d1f78(fVar);
            }
            r45.kv2 kv2Var = this.M;
            if (kv2Var != null) {
                fVar.i(17, kv2Var.mo75928xcd1e8d8());
                this.M.mo75956x3d5d1f78(fVar);
            }
            r45.op0 op0Var = this.P;
            if (op0Var != null) {
                fVar.i(18, op0Var.mo75928xcd1e8d8());
                this.P.mo75956x3d5d1f78(fVar);
            }
            r45.ev2 ev2Var = this.Q;
            if (ev2Var != null) {
                fVar.i(19, ev2Var.mo75928xcd1e8d8());
                this.Q.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.R;
            if (str4 != null) {
                fVar.j(20, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.jq0 jq0Var2 = this.f452495d;
            int i18 = (jq0Var2 != null ? b36.f.i(1, jq0Var2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.g(2, 8, this.f452497f);
            r45.pp0 pp0Var2 = this.f452499h;
            if (pp0Var2 != null) {
                i18 += b36.f.i(3, pp0Var2.mo75928xcd1e8d8());
            }
            r45.tq0 tq0Var2 = this.f452501m;
            if (tq0Var2 != null) {
                i18 += b36.f.i(4, tq0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.f452503o;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f452505q;
            if (str6 != null) {
                i18 += b36.f.j(6, str6);
            }
            java.lang.String str7 = this.f452507s;
            if (str7 != null) {
                i18 += b36.f.j(7, str7);
            }
            if (this.f452510v) {
                i18 += b36.f.h(8, this.f452509u);
            }
            if (this.f452512x) {
                i18 += b36.f.e(91, this.f452511w);
            }
            r45.aq0 aq0Var2 = this.f452513y;
            if (aq0Var2 != null) {
                i18 += b36.f.i(10, aq0Var2.mo75928xcd1e8d8());
            }
            if (this.B) {
                i18 += b36.f.h(11, this.A);
            }
            r45.mq0 mq0Var2 = this.C;
            if (mq0Var2 != null) {
                i18 += b36.f.i(12, mq0Var2.mo75928xcd1e8d8());
            }
            if (this.F) {
                i18 += b36.f.e(13, this.E);
            }
            r45.sp0 sp0Var2 = this.G;
            if (sp0Var2 != null) {
                i18 += b36.f.i(14, sp0Var2.mo75928xcd1e8d8());
            }
            r45.dp0 dp0Var2 = this.I;
            if (dp0Var2 != null) {
                i18 += b36.f.i(15, dp0Var2.mo75928xcd1e8d8());
            }
            r45.qp0 qp0Var2 = this.K;
            if (qp0Var2 != null) {
                i18 += b36.f.i(16, qp0Var2.mo75928xcd1e8d8());
            }
            r45.kv2 kv2Var2 = this.M;
            if (kv2Var2 != null) {
                i18 += b36.f.i(17, kv2Var2.mo75928xcd1e8d8());
            }
            r45.op0 op0Var2 = this.P;
            if (op0Var2 != null) {
                i18 += b36.f.i(18, op0Var2.mo75928xcd1e8d8());
            }
            r45.ev2 ev2Var2 = this.Q;
            if (ev2Var2 != null) {
                i18 += b36.f.i(19, ev2Var2.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.R;
            return str8 != null ? i18 + b36.f.j(20, str8) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f452497f.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.bq0 bq0Var = (r45.bq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 91) {
            bq0Var.f452511w = aVar2.g(intValue);
            bq0Var.f452512x = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.jq0 jq0Var3 = new r45.jq0();
                    if (bArr2 != null && bArr2.length > 0) {
                        jq0Var3.mo11468x92b714fd(bArr2);
                    }
                    bq0Var.f452495d = jq0Var3;
                }
                bq0Var.f452496e = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.gp0 gp0Var = new r45.gp0();
                    if (bArr3 != null && bArr3.length > 0) {
                        gp0Var.mo11468x92b714fd(bArr3);
                    }
                    bq0Var.f452497f.add(gp0Var);
                }
                bq0Var.f452498g = true;
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.pp0 pp0Var3 = new r45.pp0();
                    if (bArr4 != null && bArr4.length > 0) {
                        pp0Var3.mo11468x92b714fd(bArr4);
                    }
                    bq0Var.f452499h = pp0Var3;
                }
                bq0Var.f452500i = true;
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.tq0 tq0Var3 = new r45.tq0();
                    if (bArr5 != null && bArr5.length > 0) {
                        tq0Var3.mo11468x92b714fd(bArr5);
                    }
                    bq0Var.f452501m = tq0Var3;
                }
                bq0Var.f452502n = true;
                return 0;
            case 5:
                bq0Var.f452503o = aVar2.k(intValue);
                bq0Var.f452504p = true;
                return 0;
            case 6:
                bq0Var.f452505q = aVar2.k(intValue);
                bq0Var.f452506r = true;
                return 0;
            case 7:
                bq0Var.f452507s = aVar2.k(intValue);
                bq0Var.f452508t = true;
                return 0;
            case 8:
                bq0Var.f452509u = aVar2.i(intValue);
                bq0Var.f452510v = true;
                return 0;
            default:
                switch (intValue) {
                    case 10:
                        java.util.LinkedList j28 = aVar2.j(intValue);
                        int size5 = j28.size();
                        for (int i37 = 0; i37 < size5; i37++) {
                            byte[] bArr6 = (byte[]) j28.get(i37);
                            r45.aq0 aq0Var3 = new r45.aq0();
                            if (bArr6 != null && bArr6.length > 0) {
                                aq0Var3.mo11468x92b714fd(bArr6);
                            }
                            bq0Var.f452513y = aq0Var3;
                        }
                        bq0Var.f452514z = true;
                        return 0;
                    case 11:
                        bq0Var.A = aVar2.i(intValue);
                        bq0Var.B = true;
                        return 0;
                    case 12:
                        java.util.LinkedList j29 = aVar2.j(intValue);
                        int size6 = j29.size();
                        for (int i38 = 0; i38 < size6; i38++) {
                            byte[] bArr7 = (byte[]) j29.get(i38);
                            r45.mq0 mq0Var3 = new r45.mq0();
                            if (bArr7 != null && bArr7.length > 0) {
                                mq0Var3.mo11468x92b714fd(bArr7);
                            }
                            bq0Var.C = mq0Var3;
                        }
                        bq0Var.D = true;
                        return 0;
                    case 13:
                        bq0Var.E = aVar2.g(intValue);
                        bq0Var.F = true;
                        return 0;
                    case 14:
                        java.util.LinkedList j37 = aVar2.j(intValue);
                        int size7 = j37.size();
                        for (int i39 = 0; i39 < size7; i39++) {
                            byte[] bArr8 = (byte[]) j37.get(i39);
                            r45.sp0 sp0Var3 = new r45.sp0();
                            if (bArr8 != null && bArr8.length > 0) {
                                sp0Var3.mo11468x92b714fd(bArr8);
                            }
                            bq0Var.G = sp0Var3;
                        }
                        bq0Var.H = true;
                        return 0;
                    case 15:
                        java.util.LinkedList j38 = aVar2.j(intValue);
                        int size8 = j38.size();
                        for (int i47 = 0; i47 < size8; i47++) {
                            byte[] bArr9 = (byte[]) j38.get(i47);
                            r45.dp0 dp0Var3 = new r45.dp0();
                            if (bArr9 != null && bArr9.length > 0) {
                                dp0Var3.mo11468x92b714fd(bArr9);
                            }
                            bq0Var.I = dp0Var3;
                        }
                        bq0Var.f452494J = true;
                        return 0;
                    case 16:
                        java.util.LinkedList j39 = aVar2.j(intValue);
                        int size9 = j39.size();
                        for (int i48 = 0; i48 < size9; i48++) {
                            byte[] bArr10 = (byte[]) j39.get(i48);
                            r45.qp0 qp0Var3 = new r45.qp0();
                            if (bArr10 != null && bArr10.length > 0) {
                                qp0Var3.mo11468x92b714fd(bArr10);
                            }
                            bq0Var.K = qp0Var3;
                        }
                        bq0Var.L = true;
                        return 0;
                    case 17:
                        java.util.LinkedList j47 = aVar2.j(intValue);
                        int size10 = j47.size();
                        for (int i49 = 0; i49 < size10; i49++) {
                            byte[] bArr11 = (byte[]) j47.get(i49);
                            r45.kv2 kv2Var3 = new r45.kv2();
                            if (bArr11 != null && bArr11.length > 0) {
                                kv2Var3.mo11468x92b714fd(bArr11);
                            }
                            bq0Var.M = kv2Var3;
                        }
                        bq0Var.N = true;
                        return 0;
                    case 18:
                        java.util.LinkedList j48 = aVar2.j(intValue);
                        int size11 = j48.size();
                        for (int i57 = 0; i57 < size11; i57++) {
                            byte[] bArr12 = (byte[]) j48.get(i57);
                            r45.op0 op0Var3 = new r45.op0();
                            if (bArr12 != null && bArr12.length > 0) {
                                op0Var3.mo11468x92b714fd(bArr12);
                            }
                            bq0Var.P = op0Var3;
                        }
                        bq0Var.getClass();
                        return 0;
                    case 19:
                        java.util.LinkedList j49 = aVar2.j(intValue);
                        int size12 = j49.size();
                        for (int i58 = 0; i58 < size12; i58++) {
                            byte[] bArr13 = (byte[]) j49.get(i58);
                            r45.ev2 ev2Var3 = new r45.ev2();
                            if (bArr13 != null && bArr13.length > 0) {
                                ev2Var3.mo11468x92b714fd(bArr13);
                            }
                            bq0Var.Q = ev2Var3;
                        }
                        bq0Var.getClass();
                        return 0;
                    case 20:
                        bq0Var.R = aVar2.k(intValue);
                        bq0Var.S = true;
                        return 0;
                    default:
                        return -1;
                }
        }
    }

    public final r45.bq0 p(java.lang.String str) {
        this.f452505q = str;
        this.f452506r = true;
        return this;
    }

    public final r45.bq0 q(r45.mq0 mq0Var) {
        this.C = mq0Var;
        this.D = true;
        return this;
    }

    public final r45.bq0 r(r45.tq0 tq0Var) {
        this.f452501m = tq0Var;
        this.f452502n = true;
        return this;
    }

    public final r45.bq0 s(int i17) {
        this.E = i17;
        this.F = true;
        return this;
    }
}
