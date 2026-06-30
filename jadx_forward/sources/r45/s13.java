package r45;

/* loaded from: classes2.dex */
public class s13 extends r45.js5 {
    public r45.er2 A;
    public r45.t13 B;
    public r45.tr2 C;
    public r45.cj2 D;
    public r45.ah2 E;
    public int F;
    public r45.a23 G;
    public r45.v31 H;
    public r45.c32 I;

    /* renamed from: J, reason: collision with root package name */
    public r45.h23 f466911J;
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 K;
    public r45.x13 L;
    public r45.fr2 M;
    public r45.q13 N;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa f466912d;

    /* renamed from: e, reason: collision with root package name */
    public r45.nk2 f466913e;

    /* renamed from: f, reason: collision with root package name */
    public int f466914f;

    /* renamed from: g, reason: collision with root package name */
    public int f466915g;

    /* renamed from: i, reason: collision with root package name */
    public int f466917i;

    /* renamed from: m, reason: collision with root package name */
    public int f466918m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f466919n;

    /* renamed from: o, reason: collision with root package name */
    public r45.fw0 f466920o;

    /* renamed from: q, reason: collision with root package name */
    public r45.j32 f466922q;

    /* renamed from: r, reason: collision with root package name */
    public r45.ah1 f466923r;

    /* renamed from: s, reason: collision with root package name */
    public r45.dc1 f466924s;

    /* renamed from: t, reason: collision with root package name */
    public r45.sf2 f466925t;

    /* renamed from: u, reason: collision with root package name */
    public int f466926u;

    /* renamed from: v, reason: collision with root package name */
    public r45.dc1 f466927v;

    /* renamed from: w, reason: collision with root package name */
    public r45.gx0 f466928w;

    /* renamed from: x, reason: collision with root package name */
    public r45.vn2 f466929x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f466930y;

    /* renamed from: z, reason: collision with root package name */
    public r45.c23 f466931z;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f466916h = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f466921p = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s13)) {
            return false;
        }
        r45.s13 s13Var = (r45.s13) fVar;
        return n51.f.a(this.f76492x92037252, s13Var.f76492x92037252) && n51.f.a(this.f466912d, s13Var.f466912d) && n51.f.a(this.f466913e, s13Var.f466913e) && n51.f.a(java.lang.Integer.valueOf(this.f466914f), java.lang.Integer.valueOf(s13Var.f466914f)) && n51.f.a(java.lang.Integer.valueOf(this.f466915g), java.lang.Integer.valueOf(s13Var.f466915g)) && n51.f.a(this.f466916h, s13Var.f466916h) && n51.f.a(java.lang.Integer.valueOf(this.f466917i), java.lang.Integer.valueOf(s13Var.f466917i)) && n51.f.a(java.lang.Integer.valueOf(this.f466918m), java.lang.Integer.valueOf(s13Var.f466918m)) && n51.f.a(this.f466919n, s13Var.f466919n) && n51.f.a(this.f466920o, s13Var.f466920o) && n51.f.a(this.f466921p, s13Var.f466921p) && n51.f.a(this.f466922q, s13Var.f466922q) && n51.f.a(this.f466923r, s13Var.f466923r) && n51.f.a(this.f466924s, s13Var.f466924s) && n51.f.a(this.f466925t, s13Var.f466925t) && n51.f.a(java.lang.Integer.valueOf(this.f466926u), java.lang.Integer.valueOf(s13Var.f466926u)) && n51.f.a(this.f466927v, s13Var.f466927v) && n51.f.a(this.f466928w, s13Var.f466928w) && n51.f.a(this.f466929x, s13Var.f466929x) && n51.f.a(this.f466930y, s13Var.f466930y) && n51.f.a(this.f466931z, s13Var.f466931z) && n51.f.a(this.A, s13Var.A) && n51.f.a(this.B, s13Var.B) && n51.f.a(this.C, s13Var.C) && n51.f.a(this.D, s13Var.D) && n51.f.a(this.E, s13Var.E) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(s13Var.F)) && n51.f.a(this.G, s13Var.G) && n51.f.a(this.H, s13Var.H) && n51.f.a(this.I, s13Var.I) && n51.f.a(this.f466911J, s13Var.f466911J) && n51.f.a(this.K, s13Var.K) && n51.f.a(this.L, s13Var.L) && n51.f.a(this.M, s13Var.M) && n51.f.a(this.N, s13Var.N);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f466921p;
        java.util.LinkedList linkedList2 = this.f466916h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = this.f466912d;
            if (c19782x23db1cfa != null) {
                fVar.i(2, c19782x23db1cfa.mo75928xcd1e8d8());
                this.f466912d.mo75956x3d5d1f78(fVar);
            }
            r45.nk2 nk2Var = this.f466913e;
            if (nk2Var != null) {
                fVar.i(3, nk2Var.mo75928xcd1e8d8());
                this.f466913e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f466914f);
            fVar.e(5, this.f466915g);
            fVar.g(6, 1, linkedList2);
            fVar.e(7, this.f466917i);
            fVar.e(8, this.f466918m);
            java.lang.String str = this.f466919n;
            if (str != null) {
                fVar.j(9, str);
            }
            r45.fw0 fw0Var = this.f466920o;
            if (fw0Var != null) {
                fVar.i(10, fw0Var.mo75928xcd1e8d8());
                this.f466920o.mo75956x3d5d1f78(fVar);
            }
            fVar.g(11, 8, linkedList);
            r45.j32 j32Var = this.f466922q;
            if (j32Var != null) {
                fVar.i(12, j32Var.mo75928xcd1e8d8());
                this.f466922q.mo75956x3d5d1f78(fVar);
            }
            r45.ah1 ah1Var = this.f466923r;
            if (ah1Var != null) {
                fVar.i(13, ah1Var.mo75928xcd1e8d8());
                this.f466923r.mo75956x3d5d1f78(fVar);
            }
            r45.dc1 dc1Var = this.f466924s;
            if (dc1Var != null) {
                fVar.i(14, dc1Var.mo75928xcd1e8d8());
                this.f466924s.mo75956x3d5d1f78(fVar);
            }
            r45.sf2 sf2Var = this.f466925t;
            if (sf2Var != null) {
                fVar.i(15, sf2Var.mo75928xcd1e8d8());
                this.f466925t.mo75956x3d5d1f78(fVar);
            }
            fVar.e(16, this.f466926u);
            r45.dc1 dc1Var2 = this.f466927v;
            if (dc1Var2 != null) {
                fVar.i(17, dc1Var2.mo75928xcd1e8d8());
                this.f466927v.mo75956x3d5d1f78(fVar);
            }
            r45.gx0 gx0Var = this.f466928w;
            if (gx0Var != null) {
                fVar.i(18, gx0Var.mo75928xcd1e8d8());
                this.f466928w.mo75956x3d5d1f78(fVar);
            }
            r45.vn2 vn2Var = this.f466929x;
            if (vn2Var != null) {
                fVar.i(19, vn2Var.mo75928xcd1e8d8());
                this.f466929x.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f466930y;
            if (c19786x6a1e2862 != null) {
                fVar.i(20, c19786x6a1e2862.mo75928xcd1e8d8());
                this.f466930y.mo75956x3d5d1f78(fVar);
            }
            r45.c23 c23Var = this.f466931z;
            if (c23Var != null) {
                fVar.i(21, c23Var.mo75928xcd1e8d8());
                this.f466931z.mo75956x3d5d1f78(fVar);
            }
            r45.er2 er2Var = this.A;
            if (er2Var != null) {
                fVar.i(22, er2Var.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            r45.t13 t13Var = this.B;
            if (t13Var != null) {
                fVar.i(23, t13Var.mo75928xcd1e8d8());
                this.B.mo75956x3d5d1f78(fVar);
            }
            r45.tr2 tr2Var = this.C;
            if (tr2Var != null) {
                fVar.i(24, tr2Var.mo75928xcd1e8d8());
                this.C.mo75956x3d5d1f78(fVar);
            }
            r45.cj2 cj2Var = this.D;
            if (cj2Var != null) {
                fVar.i(25, cj2Var.mo75928xcd1e8d8());
                this.D.mo75956x3d5d1f78(fVar);
            }
            r45.ah2 ah2Var = this.E;
            if (ah2Var != null) {
                fVar.i(26, ah2Var.mo75928xcd1e8d8());
                this.E.mo75956x3d5d1f78(fVar);
            }
            fVar.e(28, this.F);
            r45.a23 a23Var = this.G;
            if (a23Var != null) {
                fVar.i(30, a23Var.mo75928xcd1e8d8());
                this.G.mo75956x3d5d1f78(fVar);
            }
            r45.v31 v31Var = this.H;
            if (v31Var != null) {
                fVar.i(31, v31Var.mo75928xcd1e8d8());
                this.H.mo75956x3d5d1f78(fVar);
            }
            r45.c32 c32Var = this.I;
            if (c32Var != null) {
                fVar.i(32, c32Var.mo75928xcd1e8d8());
                this.I.mo75956x3d5d1f78(fVar);
            }
            r45.h23 h23Var = this.f466911J;
            if (h23Var != null) {
                fVar.i(33, h23Var.mo75928xcd1e8d8());
                this.f466911J.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = this.K;
            if (c19786x6a1e28622 != null) {
                fVar.i(34, c19786x6a1e28622.mo75928xcd1e8d8());
                this.K.mo75956x3d5d1f78(fVar);
            }
            r45.x13 x13Var = this.L;
            if (x13Var != null) {
                fVar.i(35, x13Var.mo75928xcd1e8d8());
                this.L.mo75956x3d5d1f78(fVar);
            }
            r45.fr2 fr2Var = this.M;
            if (fr2Var != null) {
                fVar.i(36, fr2Var.mo75928xcd1e8d8());
                this.M.mo75956x3d5d1f78(fVar);
            }
            r45.q13 q13Var = this.N;
            if (q13Var != null) {
                fVar.i(38, q13Var.mo75928xcd1e8d8());
                this.N.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = this.f466912d;
            if (c19782x23db1cfa2 != null) {
                i18 += b36.f.i(2, c19782x23db1cfa2.mo75928xcd1e8d8());
            }
            r45.nk2 nk2Var2 = this.f466913e;
            if (nk2Var2 != null) {
                i18 += b36.f.i(3, nk2Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(4, this.f466914f) + b36.f.e(5, this.f466915g) + b36.f.g(6, 1, linkedList2) + b36.f.e(7, this.f466917i) + b36.f.e(8, this.f466918m);
            java.lang.String str2 = this.f466919n;
            if (str2 != null) {
                e17 += b36.f.j(9, str2);
            }
            r45.fw0 fw0Var2 = this.f466920o;
            if (fw0Var2 != null) {
                e17 += b36.f.i(10, fw0Var2.mo75928xcd1e8d8());
            }
            int g17 = e17 + b36.f.g(11, 8, linkedList);
            r45.j32 j32Var2 = this.f466922q;
            if (j32Var2 != null) {
                g17 += b36.f.i(12, j32Var2.mo75928xcd1e8d8());
            }
            r45.ah1 ah1Var2 = this.f466923r;
            if (ah1Var2 != null) {
                g17 += b36.f.i(13, ah1Var2.mo75928xcd1e8d8());
            }
            r45.dc1 dc1Var3 = this.f466924s;
            if (dc1Var3 != null) {
                g17 += b36.f.i(14, dc1Var3.mo75928xcd1e8d8());
            }
            r45.sf2 sf2Var2 = this.f466925t;
            if (sf2Var2 != null) {
                g17 += b36.f.i(15, sf2Var2.mo75928xcd1e8d8());
            }
            int e18 = g17 + b36.f.e(16, this.f466926u);
            r45.dc1 dc1Var4 = this.f466927v;
            if (dc1Var4 != null) {
                e18 += b36.f.i(17, dc1Var4.mo75928xcd1e8d8());
            }
            r45.gx0 gx0Var2 = this.f466928w;
            if (gx0Var2 != null) {
                e18 += b36.f.i(18, gx0Var2.mo75928xcd1e8d8());
            }
            r45.vn2 vn2Var2 = this.f466929x;
            if (vn2Var2 != null) {
                e18 += b36.f.i(19, vn2Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28623 = this.f466930y;
            if (c19786x6a1e28623 != null) {
                e18 += b36.f.i(20, c19786x6a1e28623.mo75928xcd1e8d8());
            }
            r45.c23 c23Var2 = this.f466931z;
            if (c23Var2 != null) {
                e18 += b36.f.i(21, c23Var2.mo75928xcd1e8d8());
            }
            r45.er2 er2Var2 = this.A;
            if (er2Var2 != null) {
                e18 += b36.f.i(22, er2Var2.mo75928xcd1e8d8());
            }
            r45.t13 t13Var2 = this.B;
            if (t13Var2 != null) {
                e18 += b36.f.i(23, t13Var2.mo75928xcd1e8d8());
            }
            r45.tr2 tr2Var2 = this.C;
            if (tr2Var2 != null) {
                e18 += b36.f.i(24, tr2Var2.mo75928xcd1e8d8());
            }
            r45.cj2 cj2Var2 = this.D;
            if (cj2Var2 != null) {
                e18 += b36.f.i(25, cj2Var2.mo75928xcd1e8d8());
            }
            r45.ah2 ah2Var2 = this.E;
            if (ah2Var2 != null) {
                e18 += b36.f.i(26, ah2Var2.mo75928xcd1e8d8());
            }
            int e19 = e18 + b36.f.e(28, this.F);
            r45.a23 a23Var2 = this.G;
            if (a23Var2 != null) {
                e19 += b36.f.i(30, a23Var2.mo75928xcd1e8d8());
            }
            r45.v31 v31Var2 = this.H;
            if (v31Var2 != null) {
                e19 += b36.f.i(31, v31Var2.mo75928xcd1e8d8());
            }
            r45.c32 c32Var2 = this.I;
            if (c32Var2 != null) {
                e19 += b36.f.i(32, c32Var2.mo75928xcd1e8d8());
            }
            r45.h23 h23Var2 = this.f466911J;
            if (h23Var2 != null) {
                e19 += b36.f.i(33, h23Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28624 = this.K;
            if (c19786x6a1e28624 != null) {
                e19 += b36.f.i(34, c19786x6a1e28624.mo75928xcd1e8d8());
            }
            r45.x13 x13Var2 = this.L;
            if (x13Var2 != null) {
                e19 += b36.f.i(35, x13Var2.mo75928xcd1e8d8());
            }
            r45.fr2 fr2Var2 = this.M;
            if (fr2Var2 != null) {
                e19 += b36.f.i(36, fr2Var2.mo75928xcd1e8d8());
            }
            r45.q13 q13Var2 = this.N;
            return q13Var2 != null ? e19 + b36.f.i(38, q13Var2.mo75928xcd1e8d8()) : e19;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
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
        r45.s13 s13Var = (r45.s13) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    s13Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
                    if (bArr3 != null && bArr3.length > 0) {
                        c19782x23db1cfa3.mo11468x92b714fd(bArr3);
                    }
                    s13Var.f466912d = c19782x23db1cfa3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.nk2 nk2Var3 = new r45.nk2();
                    if (bArr4 != null && bArr4.length > 0) {
                        nk2Var3.mo11468x92b714fd(bArr4);
                    }
                    s13Var.f466913e = nk2Var3;
                }
                return 0;
            case 4:
                s13Var.f466914f = aVar2.g(intValue);
                return 0;
            case 5:
                s13Var.f466915g = aVar2.g(intValue);
                return 0;
            case 6:
                s13Var.f466916h.add(aVar2.k(intValue));
                return 0;
            case 7:
                s13Var.f466917i = aVar2.g(intValue);
                return 0;
            case 8:
                s13Var.f466918m = aVar2.g(intValue);
                return 0;
            case 9:
                s13Var.f466919n = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.fw0 fw0Var3 = new r45.fw0();
                    if (bArr5 != null && bArr5.length > 0) {
                        fw0Var3.mo11468x92b714fd(bArr5);
                    }
                    s13Var.f466920o = fw0Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.e21 e21Var = new r45.e21();
                    if (bArr6 != null && bArr6.length > 0) {
                        e21Var.mo11468x92b714fd(bArr6);
                    }
                    s13Var.f466921p.add(e21Var);
                }
                return 0;
            case 12:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.j32 j32Var3 = new r45.j32();
                    if (bArr7 != null && bArr7.length > 0) {
                        j32Var3.mo11468x92b714fd(bArr7);
                    }
                    s13Var.f466922q = j32Var3;
                }
                return 0;
            case 13:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.ah1 ah1Var3 = new r45.ah1();
                    if (bArr8 != null && bArr8.length > 0) {
                        ah1Var3.mo11468x92b714fd(bArr8);
                    }
                    s13Var.f466923r = ah1Var3;
                }
                return 0;
            case 14:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.dc1 dc1Var5 = new r45.dc1();
                    if (bArr9 != null && bArr9.length > 0) {
                        dc1Var5.mo11468x92b714fd(bArr9);
                    }
                    s13Var.f466924s = dc1Var5;
                }
                return 0;
            case 15:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    r45.sf2 sf2Var3 = new r45.sf2();
                    if (bArr10 != null && bArr10.length > 0) {
                        sf2Var3.mo11468x92b714fd(bArr10);
                    }
                    s13Var.f466925t = sf2Var3;
                }
                return 0;
            case 16:
                s13Var.f466926u = aVar2.g(intValue);
                return 0;
            case 17:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr11 = (byte[]) j47.get(i49);
                    r45.dc1 dc1Var6 = new r45.dc1();
                    if (bArr11 != null && bArr11.length > 0) {
                        dc1Var6.mo11468x92b714fd(bArr11);
                    }
                    s13Var.f466927v = dc1Var6;
                }
                return 0;
            case 18:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr12 = (byte[]) j48.get(i57);
                    r45.gx0 gx0Var3 = new r45.gx0();
                    if (bArr12 != null && bArr12.length > 0) {
                        gx0Var3.mo11468x92b714fd(bArr12);
                    }
                    s13Var.f466928w = gx0Var3;
                }
                return 0;
            case 19:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr13 = (byte[]) j49.get(i58);
                    r45.vn2 vn2Var3 = new r45.vn2();
                    if (bArr13 != null && bArr13.length > 0) {
                        vn2Var3.mo11468x92b714fd(bArr13);
                    }
                    s13Var.f466929x = vn2Var3;
                }
                return 0;
            case 20:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr14 = (byte[]) j57.get(i59);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28625 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
                    if (bArr14 != null && bArr14.length > 0) {
                        c19786x6a1e28625.mo11468x92b714fd(bArr14);
                    }
                    s13Var.f466930y = c19786x6a1e28625;
                }
                return 0;
            case 21:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr15 = (byte[]) j58.get(i66);
                    r45.c23 c23Var3 = new r45.c23();
                    if (bArr15 != null && bArr15.length > 0) {
                        c23Var3.mo11468x92b714fd(bArr15);
                    }
                    s13Var.f466931z = c23Var3;
                }
                return 0;
            case 22:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i67 = 0; i67 < size15; i67++) {
                    byte[] bArr16 = (byte[]) j59.get(i67);
                    r45.er2 er2Var3 = new r45.er2();
                    if (bArr16 != null && bArr16.length > 0) {
                        er2Var3.mo11468x92b714fd(bArr16);
                    }
                    s13Var.A = er2Var3;
                }
                return 0;
            case 23:
                java.util.LinkedList j66 = aVar2.j(intValue);
                int size16 = j66.size();
                for (int i68 = 0; i68 < size16; i68++) {
                    byte[] bArr17 = (byte[]) j66.get(i68);
                    r45.t13 t13Var3 = new r45.t13();
                    if (bArr17 != null && bArr17.length > 0) {
                        t13Var3.mo11468x92b714fd(bArr17);
                    }
                    s13Var.B = t13Var3;
                }
                return 0;
            case 24:
                java.util.LinkedList j67 = aVar2.j(intValue);
                int size17 = j67.size();
                for (int i69 = 0; i69 < size17; i69++) {
                    byte[] bArr18 = (byte[]) j67.get(i69);
                    r45.tr2 tr2Var3 = new r45.tr2();
                    if (bArr18 != null && bArr18.length > 0) {
                        tr2Var3.mo11468x92b714fd(bArr18);
                    }
                    s13Var.C = tr2Var3;
                }
                return 0;
            case 25:
                java.util.LinkedList j68 = aVar2.j(intValue);
                int size18 = j68.size();
                for (int i76 = 0; i76 < size18; i76++) {
                    byte[] bArr19 = (byte[]) j68.get(i76);
                    r45.cj2 cj2Var3 = new r45.cj2();
                    if (bArr19 != null && bArr19.length > 0) {
                        cj2Var3.mo11468x92b714fd(bArr19);
                    }
                    s13Var.D = cj2Var3;
                }
                return 0;
            case 26:
                java.util.LinkedList j69 = aVar2.j(intValue);
                int size19 = j69.size();
                for (int i77 = 0; i77 < size19; i77++) {
                    byte[] bArr20 = (byte[]) j69.get(i77);
                    r45.ah2 ah2Var3 = new r45.ah2();
                    if (bArr20 != null && bArr20.length > 0) {
                        ah2Var3.mo11468x92b714fd(bArr20);
                    }
                    s13Var.E = ah2Var3;
                }
                return 0;
            case 27:
            case 29:
            case 37:
            default:
                return -1;
            case 28:
                s13Var.F = aVar2.g(intValue);
                return 0;
            case 30:
                java.util.LinkedList j76 = aVar2.j(intValue);
                int size20 = j76.size();
                for (int i78 = 0; i78 < size20; i78++) {
                    byte[] bArr21 = (byte[]) j76.get(i78);
                    r45.a23 a23Var3 = new r45.a23();
                    if (bArr21 != null && bArr21.length > 0) {
                        a23Var3.mo11468x92b714fd(bArr21);
                    }
                    s13Var.G = a23Var3;
                }
                return 0;
            case 31:
                java.util.LinkedList j77 = aVar2.j(intValue);
                int size21 = j77.size();
                for (int i79 = 0; i79 < size21; i79++) {
                    byte[] bArr22 = (byte[]) j77.get(i79);
                    r45.v31 v31Var3 = new r45.v31();
                    if (bArr22 != null && bArr22.length > 0) {
                        v31Var3.mo11468x92b714fd(bArr22);
                    }
                    s13Var.H = v31Var3;
                }
                return 0;
            case 32:
                java.util.LinkedList j78 = aVar2.j(intValue);
                int size22 = j78.size();
                for (int i86 = 0; i86 < size22; i86++) {
                    byte[] bArr23 = (byte[]) j78.get(i86);
                    r45.c32 c32Var3 = new r45.c32();
                    if (bArr23 != null && bArr23.length > 0) {
                        c32Var3.mo11468x92b714fd(bArr23);
                    }
                    s13Var.I = c32Var3;
                }
                return 0;
            case 33:
                java.util.LinkedList j79 = aVar2.j(intValue);
                int size23 = j79.size();
                for (int i87 = 0; i87 < size23; i87++) {
                    byte[] bArr24 = (byte[]) j79.get(i87);
                    r45.h23 h23Var3 = new r45.h23();
                    if (bArr24 != null && bArr24.length > 0) {
                        h23Var3.mo11468x92b714fd(bArr24);
                    }
                    s13Var.f466911J = h23Var3;
                }
                return 0;
            case 34:
                java.util.LinkedList j86 = aVar2.j(intValue);
                int size24 = j86.size();
                for (int i88 = 0; i88 < size24; i88++) {
                    byte[] bArr25 = (byte[]) j86.get(i88);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28626 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
                    if (bArr25 != null && bArr25.length > 0) {
                        c19786x6a1e28626.mo11468x92b714fd(bArr25);
                    }
                    s13Var.K = c19786x6a1e28626;
                }
                return 0;
            case 35:
                java.util.LinkedList j87 = aVar2.j(intValue);
                int size25 = j87.size();
                for (int i89 = 0; i89 < size25; i89++) {
                    byte[] bArr26 = (byte[]) j87.get(i89);
                    r45.x13 x13Var3 = new r45.x13();
                    if (bArr26 != null && bArr26.length > 0) {
                        x13Var3.mo11468x92b714fd(bArr26);
                    }
                    s13Var.L = x13Var3;
                }
                return 0;
            case 36:
                java.util.LinkedList j88 = aVar2.j(intValue);
                int size26 = j88.size();
                for (int i96 = 0; i96 < size26; i96++) {
                    byte[] bArr27 = (byte[]) j88.get(i96);
                    r45.fr2 fr2Var3 = new r45.fr2();
                    if (bArr27 != null && bArr27.length > 0) {
                        fr2Var3.mo11468x92b714fd(bArr27);
                    }
                    s13Var.M = fr2Var3;
                }
                return 0;
            case 38:
                java.util.LinkedList j89 = aVar2.j(intValue);
                int size27 = j89.size();
                for (int i97 = 0; i97 < size27; i97++) {
                    byte[] bArr28 = (byte[]) j89.get(i97);
                    r45.q13 q13Var3 = new r45.q13();
                    if (bArr28 != null && bArr28.length > 0) {
                        q13Var3.mo11468x92b714fd(bArr28);
                    }
                    s13Var.N = q13Var3;
                }
                return 0;
        }
    }
}
