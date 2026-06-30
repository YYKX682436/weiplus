package v2;

/* loaded from: classes15.dex */
public class i {
    public final v2.g[] A;
    public final java.util.ArrayList B;
    public final v2.h[] C;
    public v2.i D;
    public int E;
    public int F;
    public float G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f514181J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public float V;
    public float W;
    public java.lang.Object X;
    public int Y;
    public java.lang.String Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f514183a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f514185b0;

    /* renamed from: c, reason: collision with root package name */
    public v2.p f514186c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f514187c0;

    /* renamed from: d, reason: collision with root package name */
    public v2.p f514188d;

    /* renamed from: d0, reason: collision with root package name */
    public int f514189d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f514191e0;

    /* renamed from: f0, reason: collision with root package name */
    public final float[] f514193f0;

    /* renamed from: g0, reason: collision with root package name */
    public final v2.i[] f514195g0;

    /* renamed from: h0, reason: collision with root package name */
    public final v2.i[] f514197h0;

    /* renamed from: s, reason: collision with root package name */
    public final v2.g f514208s;

    /* renamed from: t, reason: collision with root package name */
    public final v2.g f514209t;

    /* renamed from: u, reason: collision with root package name */
    public final v2.g f514210u;

    /* renamed from: v, reason: collision with root package name */
    public final v2.g f514211v;

    /* renamed from: w, reason: collision with root package name */
    public final v2.g f514212w;

    /* renamed from: x, reason: collision with root package name */
    public final v2.g f514213x;

    /* renamed from: y, reason: collision with root package name */
    public final v2.g f514214y;

    /* renamed from: z, reason: collision with root package name */
    public final v2.g f514215z;

    /* renamed from: a, reason: collision with root package name */
    public int f514182a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f514184b = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f514190e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f514192f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f514194g = new int[2];

    /* renamed from: h, reason: collision with root package name */
    public int f514196h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f514198i = 0;

    /* renamed from: j, reason: collision with root package name */
    public float f514199j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public int f514200k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f514201l = 0;

    /* renamed from: m, reason: collision with root package name */
    public float f514202m = 1.0f;

    /* renamed from: n, reason: collision with root package name */
    public int f514203n = -1;

    /* renamed from: o, reason: collision with root package name */
    public float f514204o = 1.0f;

    /* renamed from: p, reason: collision with root package name */
    public v2.k f514205p = null;

    /* renamed from: q, reason: collision with root package name */
    public final int[] f514206q = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: r, reason: collision with root package name */
    public float f514207r = 0.0f;

    public i() {
        v2.g gVar = new v2.g(this, v2.f.LEFT);
        this.f514208s = gVar;
        v2.g gVar2 = new v2.g(this, v2.f.TOP);
        this.f514209t = gVar2;
        v2.g gVar3 = new v2.g(this, v2.f.RIGHT);
        this.f514210u = gVar3;
        v2.g gVar4 = new v2.g(this, v2.f.BOTTOM);
        this.f514211v = gVar4;
        v2.g gVar5 = new v2.g(this, v2.f.BASELINE);
        this.f514212w = gVar5;
        v2.g gVar6 = new v2.g(this, v2.f.CENTER_X);
        this.f514213x = gVar6;
        v2.g gVar7 = new v2.g(this, v2.f.CENTER_Y);
        this.f514214y = gVar7;
        v2.g gVar8 = new v2.g(this, v2.f.CENTER);
        this.f514215z = gVar8;
        this.A = new v2.g[]{gVar, gVar3, gVar2, gVar4, gVar5, gVar8};
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.B = arrayList;
        v2.h hVar = v2.h.FIXED;
        this.C = new v2.h[]{hVar, hVar};
        this.D = null;
        this.E = 0;
        this.F = 0;
        this.G = 0.0f;
        this.H = -1;
        this.I = 0;
        this.f514181J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.V = 0.5f;
        this.W = 0.5f;
        this.Y = 0;
        this.Z = null;
        this.f514183a0 = false;
        this.f514185b0 = false;
        this.f514187c0 = false;
        this.f514189d0 = 0;
        this.f514191e0 = 0;
        this.f514193f0 = new float[]{-1.0f, -1.0f};
        this.f514195g0 = new v2.i[]{null, null};
        this.f514197h0 = new v2.i[]{null, null};
        arrayList.add(gVar);
        arrayList.add(gVar2);
        arrayList.add(gVar3);
        arrayList.add(gVar4);
        arrayList.add(gVar6);
        arrayList.add(gVar7);
        arrayList.add(gVar8);
        arrayList.add(gVar5);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0331 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(u2.f r48) {
        /*
            Method dump skipped, instructions count: 1237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.i.a(u2.f):void");
    }

    public boolean b() {
        return this.Y != 8;
    }

    public void c(int i17) {
        int i18;
        int i19;
        for (int i27 = 0; i27 < 6; i27++) {
            v2.o oVar = this.A[i27].f514167a;
            v2.g gVar = oVar.f514250c;
            v2.g gVar2 = gVar.f514170d;
            if (gVar2 != null) {
                v2.g gVar3 = gVar2.f514170d;
                v2.o oVar2 = gVar2.f514167a;
                if (gVar3 == gVar) {
                    oVar.f514255h = 4;
                    oVar2.f514255h = 4;
                }
                int b17 = gVar.b();
                v2.f fVar = v2.f.RIGHT;
                v2.f fVar2 = gVar.f514169c;
                if (fVar2 == fVar || fVar2 == v2.f.BOTTOM) {
                    b17 = -b17;
                }
                oVar.h(oVar2, b17);
            }
        }
        v2.g gVar4 = this.f514208s;
        v2.o oVar3 = gVar4.f514167a;
        v2.g gVar5 = this.f514209t;
        v2.o oVar4 = gVar5.f514167a;
        v2.g gVar6 = this.f514210u;
        v2.o oVar5 = gVar6.f514167a;
        v2.g gVar7 = this.f514211v;
        v2.o oVar6 = gVar7.f514167a;
        boolean z17 = (i17 & 8) == 8;
        v2.h[] hVarArr = this.C;
        v2.h hVar = hVarArr[0];
        v2.h hVar2 = v2.h.MATCH_CONSTRAINT;
        boolean z18 = hVar == hVar2 && v2.n.a(this, 0);
        int i28 = oVar3.f514255h;
        v2.h hVar3 = v2.h.FIXED;
        if (i28 != 4 && oVar5.f514255h != 4) {
            if (hVarArr[0] == hVar3 || (z18 && this.Y == 8)) {
                v2.g gVar8 = gVar4.f514170d;
                if (gVar8 == null && gVar6.f514170d == null) {
                    i19 = 1;
                    oVar3.f514255h = 1;
                    oVar5.f514255h = 1;
                    if (z17) {
                        oVar5.i(oVar3, 1, k());
                    } else {
                        oVar5.h(oVar3, l());
                    }
                } else {
                    i19 = 1;
                    if (gVar8 != null && gVar6.f514170d == null) {
                        oVar3.f514255h = 1;
                        oVar5.f514255h = 1;
                        if (z17) {
                            oVar5.i(oVar3, 1, k());
                        } else {
                            oVar5.h(oVar3, l());
                        }
                    } else if (gVar8 == null && gVar6.f514170d != null) {
                        oVar3.f514255h = 1;
                        oVar5.f514255h = 1;
                        oVar3.h(oVar5, -l());
                        if (z17) {
                            oVar3.i(oVar5, -1, k());
                        } else {
                            oVar3.h(oVar5, -l());
                        }
                    } else if (gVar8 != null && gVar6.f514170d != null) {
                        oVar3.f514255h = 2;
                        oVar5.f514255h = 2;
                        if (z17) {
                            k().a(oVar3);
                            k().a(oVar5);
                            v2.p k17 = k();
                            oVar3.f514256i = oVar5;
                            oVar3.f514259l = k17;
                            v2.p k18 = k();
                            oVar5.f514256i = oVar3;
                            oVar5.f514259l = k18;
                        } else {
                            oVar3.f514256i = oVar5;
                            oVar5.f514256i = oVar3;
                        }
                    }
                }
                i18 = i19;
                int i29 = (hVarArr[i18] == hVar2 || !v2.n.a(this, i18)) ? 0 : i18;
                if (oVar4.f514255h != 4 || oVar6.f514255h == 4) {
                }
                v2.h hVar4 = hVarArr[i18];
                v2.g gVar9 = this.f514212w;
                if (hVar4 != hVar3 && (i29 == 0 || this.Y != 8)) {
                    if (i29 != 0) {
                        int h17 = h();
                        oVar4.f514255h = i18;
                        oVar6.f514255h = i18;
                        v2.g gVar10 = gVar5.f514170d;
                        if (gVar10 == null && gVar7.f514170d == null) {
                            if (z17) {
                                oVar6.i(oVar4, i18, j());
                                return;
                            } else {
                                oVar6.h(oVar4, h17);
                                return;
                            }
                        }
                        if (gVar10 != null && gVar7.f514170d == null) {
                            if (z17) {
                                oVar6.i(oVar4, i18, j());
                                return;
                            } else {
                                oVar6.h(oVar4, h17);
                                return;
                            }
                        }
                        if (gVar10 == null && gVar7.f514170d != null) {
                            if (z17) {
                                oVar4.i(oVar6, -1, j());
                                return;
                            } else {
                                oVar4.h(oVar6, -h17);
                                return;
                            }
                        }
                        if (gVar10 == null || gVar7.f514170d == null) {
                            return;
                        }
                        if (z17) {
                            j().a(oVar4);
                            k().a(oVar6);
                        }
                        if (this.G == 0.0f) {
                            oVar4.f514255h = 3;
                            oVar6.f514255h = 3;
                            oVar4.f514256i = oVar6;
                            oVar6.f514256i = oVar4;
                            return;
                        }
                        oVar4.f514255h = 2;
                        oVar6.f514255h = 2;
                        oVar4.f514256i = oVar6;
                        oVar6.f514256i = oVar4;
                        t(h17);
                        int i37 = this.Q;
                        if (i37 > 0) {
                            gVar9.f514167a.g(1, oVar4, i37);
                            return;
                        }
                        return;
                    }
                    return;
                }
                int i38 = i18;
                v2.g gVar11 = gVar5.f514170d;
                if (gVar11 == null && gVar7.f514170d == null) {
                    oVar4.f514255h = i38;
                    oVar6.f514255h = i38;
                    if (z17) {
                        oVar6.i(oVar4, i38, j());
                    } else {
                        oVar6.h(oVar4, h());
                    }
                    if (gVar9.f514170d != null) {
                        v2.o oVar7 = gVar9.f514167a;
                        oVar7.f514255h = i38;
                        oVar4.g(i38, oVar7, -this.Q);
                        return;
                    }
                    return;
                }
                if (gVar11 != null && gVar7.f514170d == null) {
                    oVar4.f514255h = i38;
                    oVar6.f514255h = i38;
                    if (z17) {
                        oVar6.i(oVar4, i38, j());
                    } else {
                        oVar6.h(oVar4, h());
                    }
                    int i39 = this.Q;
                    if (i39 > 0) {
                        gVar9.f514167a.g(i38, oVar4, i39);
                        return;
                    }
                    return;
                }
                if (gVar11 == null && gVar7.f514170d != null) {
                    oVar4.f514255h = i38;
                    oVar6.f514255h = i38;
                    if (z17) {
                        oVar4.i(oVar6, -1, j());
                    } else {
                        oVar4.h(oVar6, -h());
                    }
                    int i47 = this.Q;
                    if (i47 > 0) {
                        gVar9.f514167a.g(1, oVar4, i47);
                        return;
                    }
                    return;
                }
                if (gVar11 == null || gVar7.f514170d == null) {
                    return;
                }
                oVar4.f514255h = 2;
                oVar6.f514255h = 2;
                if (z17) {
                    v2.p j17 = j();
                    oVar4.f514256i = oVar6;
                    oVar4.f514259l = j17;
                    v2.p j18 = j();
                    oVar6.f514256i = oVar4;
                    oVar6.f514259l = j18;
                    j().a(oVar4);
                    k().a(oVar6);
                } else {
                    oVar4.f514256i = oVar6;
                    oVar6.f514256i = oVar4;
                }
                int i48 = this.Q;
                if (i48 > 0) {
                    gVar9.f514167a.g(1, oVar4, i48);
                    return;
                }
                return;
            }
            if (z18) {
                int l17 = l();
                oVar3.f514255h = 1;
                oVar5.f514255h = 1;
                v2.g gVar12 = gVar4.f514170d;
                if (gVar12 == null && gVar6.f514170d == null) {
                    if (z17) {
                        oVar5.i(oVar3, 1, k());
                    } else {
                        oVar5.h(oVar3, l17);
                    }
                } else if (gVar12 == null || gVar6.f514170d != null) {
                    if (gVar12 != null || gVar6.f514170d == null) {
                        if (gVar12 != null && gVar6.f514170d != null) {
                            if (z17) {
                                k().a(oVar3);
                                k().a(oVar5);
                            }
                            if (this.G == 0.0f) {
                                oVar3.f514255h = 3;
                                oVar5.f514255h = 3;
                                oVar3.f514256i = oVar5;
                                oVar5.f514256i = oVar3;
                            } else {
                                oVar3.f514255h = 2;
                                oVar5.f514255h = 2;
                                oVar3.f514256i = oVar5;
                                oVar5.f514256i = oVar3;
                                x(l17);
                            }
                        }
                    } else if (z17) {
                        oVar3.i(oVar5, -1, k());
                    } else {
                        oVar3.h(oVar5, -l17);
                    }
                } else if (z17) {
                    oVar5.i(oVar3, 1, k());
                } else {
                    oVar5.h(oVar3, l17);
                }
            }
        }
        i18 = 1;
        if (hVarArr[i18] == hVar2) {
        }
        if (oVar4.f514255h != 4) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x029d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(u2.f r25, boolean r26, u2.j r27, u2.j r28, v2.h r29, boolean r30, v2.g r31, v2.g r32, int r33, int r34, int r35, int r36, float r37, boolean r38, boolean r39, int r40, int r41, int r42, float r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.i.d(u2.f, boolean, u2.j, u2.j, v2.h, boolean, v2.g, v2.g, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }

    public void e(u2.f fVar) {
        fVar.j(this.f514208s);
        fVar.j(this.f514209t);
        fVar.j(this.f514210u);
        fVar.j(this.f514211v);
        if (this.Q > 0) {
            fVar.j(this.f514212w);
        }
    }

    public v2.g f(v2.f fVar) {
        switch (fVar) {
            case NONE:
                return null;
            case LEFT:
                return this.f514208s;
            case TOP:
                return this.f514209t;
            case RIGHT:
                return this.f514210u;
            case BOTTOM:
                return this.f514211v;
            case BASELINE:
                return this.f514212w;
            case CENTER:
                return this.f514215z;
            case CENTER_X:
                return this.f514213x;
            case CENTER_Y:
                return this.f514214y;
            default:
                throw new java.lang.AssertionError(fVar.name());
        }
    }

    public java.util.ArrayList g() {
        return this.B;
    }

    public int h() {
        if (this.Y == 8) {
            return 0;
        }
        return this.F;
    }

    public int i(int i17) {
        if (i17 == 0) {
            return l();
        }
        if (i17 == 1) {
            return h();
        }
        return 0;
    }

    public v2.p j() {
        if (this.f514188d == null) {
            this.f514188d = new v2.p();
        }
        return this.f514188d;
    }

    public v2.p k() {
        if (this.f514186c == null) {
            this.f514186c = new v2.p();
        }
        return this.f514186c;
    }

    public int l() {
        if (this.Y == 8) {
            return 0;
        }
        return this.E;
    }

    public void m(v2.f fVar, v2.i iVar, v2.f fVar2, int i17, int i18) {
        f(fVar).a(iVar.f(fVar2), i17, i18, v2.e.STRONG, 0, true);
    }

    public final boolean n(int i17) {
        v2.g gVar;
        v2.g gVar2;
        int i18 = i17 * 2;
        v2.g[] gVarArr = this.A;
        v2.g gVar3 = gVarArr[i18];
        v2.g gVar4 = gVar3.f514170d;
        return (gVar4 == null || gVar4.f514170d == gVar3 || (gVar2 = (gVar = gVarArr[i18 + 1]).f514170d) == null || gVar2.f514170d != gVar) ? false : true;
    }

    public boolean o() {
        return this.f514208s.f514167a.f514262b == 1 && this.f514210u.f514167a.f514262b == 1 && this.f514209t.f514167a.f514262b == 1 && this.f514211v.f514167a.f514262b == 1;
    }

    public void p() {
        this.f514208s.d();
        this.f514209t.d();
        this.f514210u.d();
        this.f514211v.d();
        this.f514212w.d();
        this.f514213x.d();
        this.f514214y.d();
        this.f514215z.d();
        this.D = null;
        this.f514207r = 0.0f;
        this.E = 0;
        this.F = 0;
        this.G = 0.0f;
        this.H = -1;
        this.I = 0;
        this.f514181J = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0.5f;
        this.W = 0.5f;
        v2.h hVar = v2.h.FIXED;
        v2.h[] hVarArr = this.C;
        hVarArr[0] = hVar;
        hVarArr[1] = hVar;
        this.X = null;
        this.Y = 0;
        this.f514189d0 = 0;
        this.f514191e0 = 0;
        float[] fArr = this.f514193f0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f514182a = -1;
        this.f514184b = -1;
        int[] iArr = this.f514206q;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f514190e = 0;
        this.f514192f = 0;
        this.f514199j = 1.0f;
        this.f514202m = 1.0f;
        this.f514198i = Integer.MAX_VALUE;
        this.f514201l = Integer.MAX_VALUE;
        this.f514196h = 0;
        this.f514200k = 0;
        this.f514203n = -1;
        this.f514204o = 1.0f;
        v2.p pVar = this.f514186c;
        if (pVar != null) {
            pVar.f();
        }
        v2.p pVar2 = this.f514188d;
        if (pVar2 != null) {
            pVar2.f();
        }
        this.f514205p = null;
        this.f514183a0 = false;
        this.f514185b0 = false;
        this.f514187c0 = false;
    }

    public void q() {
        for (int i17 = 0; i17 < 6; i17++) {
            this.A[i17].f514167a.j();
        }
    }

    public void r(u2.c cVar) {
        this.f514208s.e(cVar);
        this.f514209t.e(cVar);
        this.f514210u.e(cVar);
        this.f514211v.e(cVar);
        this.f514212w.e(cVar);
        this.f514215z.e(cVar);
        this.f514213x.e(cVar);
        this.f514214y.e(cVar);
    }

    public void s() {
    }

    public void t(int i17) {
        this.F = i17;
        int i18 = this.S;
        if (i17 < i18) {
            this.F = i18;
        }
    }

    /* renamed from: toString */
    public java.lang.String m170991x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = "";
        sb6.append("");
        if (this.Z != null) {
            str = "id: " + this.Z + " ";
        }
        sb6.append(str);
        sb6.append("(");
        sb6.append(this.I);
        sb6.append(", ");
        sb6.append(this.f514181J);
        sb6.append(") - (");
        sb6.append(this.E);
        sb6.append(" x ");
        sb6.append(this.F);
        sb6.append(") wrap: (");
        sb6.append(this.T);
        sb6.append(" x ");
        sb6.append(this.U);
        sb6.append(")");
        return sb6.toString();
    }

    public void u(v2.h hVar) {
        this.C[0] = hVar;
        if (hVar == v2.h.WRAP_CONTENT) {
            x(this.T);
        }
    }

    public void v(int i17, int i18) {
        this.O = i17;
        this.P = i18;
    }

    public void w(v2.h hVar) {
        this.C[1] = hVar;
        if (hVar == v2.h.WRAP_CONTENT) {
            t(this.U);
        }
    }

    public void x(int i17) {
        this.E = i17;
        int i18 = this.R;
        if (i17 < i18) {
            this.E = i18;
        }
    }

    public void y() {
        int i17 = this.I;
        int i18 = this.f514181J;
        this.M = i17;
        this.N = i18;
    }

    public void z(u2.f fVar) {
        int i17;
        int i18;
        int m17 = fVar.m(this.f514208s);
        int m18 = fVar.m(this.f514209t);
        int m19 = fVar.m(this.f514210u);
        int m27 = fVar.m(this.f514211v);
        int i19 = m27 - m18;
        if (m19 - m17 < 0 || i19 < 0 || m17 == Integer.MIN_VALUE || m17 == Integer.MAX_VALUE || m18 == Integer.MIN_VALUE || m18 == Integer.MAX_VALUE || m19 == Integer.MIN_VALUE || m19 == Integer.MAX_VALUE || m27 == Integer.MIN_VALUE || m27 == Integer.MAX_VALUE) {
            m27 = 0;
            m17 = 0;
            m18 = 0;
            m19 = 0;
        }
        int i27 = m19 - m17;
        int i28 = m27 - m18;
        this.I = m17;
        this.f514181J = m18;
        if (this.Y == 8) {
            this.E = 0;
            this.F = 0;
            return;
        }
        v2.h[] hVarArr = this.C;
        v2.h hVar = hVarArr[0];
        v2.h hVar2 = v2.h.FIXED;
        if (hVar == hVar2 && i27 < (i18 = this.E)) {
            i27 = i18;
        }
        if (hVarArr[1] == hVar2 && i28 < (i17 = this.F)) {
            i28 = i17;
        }
        this.E = i27;
        this.F = i28;
        int i29 = this.S;
        if (i28 < i29) {
            this.F = i29;
        }
        int i37 = this.R;
        if (i27 < i37) {
            this.E = i37;
        }
        this.f514185b0 = true;
    }
}
