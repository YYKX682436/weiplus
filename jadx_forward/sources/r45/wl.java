package r45;

/* loaded from: classes11.dex */
public class wl extends r45.js5 {
    public r45.ld7 A;
    public int B;
    public r45.tj6 C;
    public r45.tj6 D;
    public r45.tj6 E;
    public r45.i32 F;
    public r45.x6 G;
    public int H;
    public r45.z6 I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f470765J;
    public int K;
    public java.lang.String L;
    public r45.el M;
    public r45.om N;

    /* renamed from: d, reason: collision with root package name */
    public r45.pi f470766d;

    /* renamed from: e, reason: collision with root package name */
    public r45.lj f470767e;

    /* renamed from: f, reason: collision with root package name */
    public r45.gl f470768f;

    /* renamed from: g, reason: collision with root package name */
    public r45.nj f470769g;

    /* renamed from: h, reason: collision with root package name */
    public r45.gl f470770h;

    /* renamed from: i, reason: collision with root package name */
    public r45.km f470771i;

    /* renamed from: m, reason: collision with root package name */
    public int f470772m;

    /* renamed from: o, reason: collision with root package name */
    public int f470774o;

    /* renamed from: p, reason: collision with root package name */
    public r45.qd5 f470775p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f470776q;

    /* renamed from: r, reason: collision with root package name */
    public r45.vm f470777r;

    /* renamed from: s, reason: collision with root package name */
    public r45.an f470778s;

    /* renamed from: t, reason: collision with root package name */
    public int f470779t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f470781v;

    /* renamed from: w, reason: collision with root package name */
    public r45.td5 f470782w;

    /* renamed from: x, reason: collision with root package name */
    public r45.kl f470783x;

    /* renamed from: y, reason: collision with root package name */
    public r45.f32 f470784y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f470785z;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f470773n = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f470780u = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wl)) {
            return false;
        }
        r45.wl wlVar = (r45.wl) fVar;
        return n51.f.a(this.f76492x92037252, wlVar.f76492x92037252) && n51.f.a(this.f470766d, wlVar.f470766d) && n51.f.a(this.f470767e, wlVar.f470767e) && n51.f.a(this.f470768f, wlVar.f470768f) && n51.f.a(this.f470769g, wlVar.f470769g) && n51.f.a(this.f470770h, wlVar.f470770h) && n51.f.a(this.f470771i, wlVar.f470771i) && n51.f.a(java.lang.Integer.valueOf(this.f470772m), java.lang.Integer.valueOf(wlVar.f470772m)) && n51.f.a(this.f470773n, wlVar.f470773n) && n51.f.a(java.lang.Integer.valueOf(this.f470774o), java.lang.Integer.valueOf(wlVar.f470774o)) && n51.f.a(this.f470775p, wlVar.f470775p) && n51.f.a(this.f470776q, wlVar.f470776q) && n51.f.a(this.f470777r, wlVar.f470777r) && n51.f.a(this.f470778s, wlVar.f470778s) && n51.f.a(java.lang.Integer.valueOf(this.f470779t), java.lang.Integer.valueOf(wlVar.f470779t)) && n51.f.a(this.f470780u, wlVar.f470780u) && n51.f.a(java.lang.Boolean.valueOf(this.f470781v), java.lang.Boolean.valueOf(wlVar.f470781v)) && n51.f.a(this.f470782w, wlVar.f470782w) && n51.f.a(this.f470783x, wlVar.f470783x) && n51.f.a(this.f470784y, wlVar.f470784y) && n51.f.a(this.f470785z, wlVar.f470785z) && n51.f.a(this.A, wlVar.A) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(wlVar.B)) && n51.f.a(this.C, wlVar.C) && n51.f.a(this.D, wlVar.D) && n51.f.a(this.E, wlVar.E) && n51.f.a(this.F, wlVar.F) && n51.f.a(this.G, wlVar.G) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(wlVar.H)) && n51.f.a(this.I, wlVar.I) && n51.f.a(java.lang.Boolean.valueOf(this.f470765J), java.lang.Boolean.valueOf(wlVar.f470765J)) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(wlVar.K)) && n51.f.a(this.L, wlVar.L) && n51.f.a(this.M, wlVar.M) && n51.f.a(this.N, wlVar.N);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f470780u;
        java.util.LinkedList linkedList2 = this.f470773n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            r45.pi piVar = this.f470766d;
            if (piVar != null) {
                fVar.i(2, piVar.mo75928xcd1e8d8());
                this.f470766d.mo75956x3d5d1f78(fVar);
            }
            r45.lj ljVar = this.f470767e;
            if (ljVar != null) {
                fVar.i(3, ljVar.mo75928xcd1e8d8());
                this.f470767e.mo75956x3d5d1f78(fVar);
            }
            r45.gl glVar = this.f470768f;
            if (glVar != null) {
                fVar.i(4, glVar.mo75928xcd1e8d8());
                this.f470768f.mo75956x3d5d1f78(fVar);
            }
            r45.nj njVar = this.f470769g;
            if (njVar != null) {
                fVar.i(5, njVar.mo75928xcd1e8d8());
                this.f470769g.mo75956x3d5d1f78(fVar);
            }
            r45.gl glVar2 = this.f470770h;
            if (glVar2 != null) {
                fVar.i(6, glVar2.mo75928xcd1e8d8());
                this.f470770h.mo75956x3d5d1f78(fVar);
            }
            r45.km kmVar = this.f470771i;
            if (kmVar != null) {
                fVar.i(7, kmVar.mo75928xcd1e8d8());
                this.f470771i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(8, this.f470772m);
            fVar.g(9, 8, linkedList2);
            fVar.e(10, this.f470774o);
            r45.qd5 qd5Var = this.f470775p;
            if (qd5Var != null) {
                fVar.i(11, qd5Var.mo75928xcd1e8d8());
                this.f470775p.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f470776q;
            if (str != null) {
                fVar.j(12, str);
            }
            r45.vm vmVar = this.f470777r;
            if (vmVar != null) {
                fVar.i(13, vmVar.mo75928xcd1e8d8());
                this.f470777r.mo75956x3d5d1f78(fVar);
            }
            r45.an anVar = this.f470778s;
            if (anVar != null) {
                fVar.i(14, anVar.mo75928xcd1e8d8());
                this.f470778s.mo75956x3d5d1f78(fVar);
            }
            fVar.e(17, this.f470779t);
            fVar.g(20, 8, linkedList);
            fVar.a(21, this.f470781v);
            r45.td5 td5Var = this.f470782w;
            if (td5Var != null) {
                fVar.i(22, td5Var.mo75928xcd1e8d8());
                this.f470782w.mo75956x3d5d1f78(fVar);
            }
            r45.kl klVar = this.f470783x;
            if (klVar != null) {
                fVar.i(23, klVar.mo75928xcd1e8d8());
                this.f470783x.mo75956x3d5d1f78(fVar);
            }
            r45.f32 f32Var = this.f470784y;
            if (f32Var != null) {
                fVar.i(24, f32Var.mo75928xcd1e8d8());
                this.f470784y.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f470785z;
            if (str2 != null) {
                fVar.j(25, str2);
            }
            r45.ld7 ld7Var = this.A;
            if (ld7Var != null) {
                fVar.i(26, ld7Var.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            fVar.e(27, this.B);
            r45.tj6 tj6Var = this.C;
            if (tj6Var != null) {
                fVar.i(31, tj6Var.mo75928xcd1e8d8());
                this.C.mo75956x3d5d1f78(fVar);
            }
            r45.tj6 tj6Var2 = this.D;
            if (tj6Var2 != null) {
                fVar.i(32, tj6Var2.mo75928xcd1e8d8());
                this.D.mo75956x3d5d1f78(fVar);
            }
            r45.tj6 tj6Var3 = this.E;
            if (tj6Var3 != null) {
                fVar.i(33, tj6Var3.mo75928xcd1e8d8());
                this.E.mo75956x3d5d1f78(fVar);
            }
            r45.i32 i32Var = this.F;
            if (i32Var != null) {
                fVar.i(34, i32Var.mo75928xcd1e8d8());
                this.F.mo75956x3d5d1f78(fVar);
            }
            r45.x6 x6Var = this.G;
            if (x6Var != null) {
                fVar.i(35, x6Var.mo75928xcd1e8d8());
                this.G.mo75956x3d5d1f78(fVar);
            }
            fVar.e(36, this.H);
            r45.z6 z6Var = this.I;
            if (z6Var != null) {
                fVar.i(37, z6Var.mo75928xcd1e8d8());
                this.I.mo75956x3d5d1f78(fVar);
            }
            fVar.a(38, this.f470765J);
            fVar.e(39, this.K);
            java.lang.String str3 = this.L;
            if (str3 != null) {
                fVar.j(40, str3);
            }
            r45.el elVar = this.M;
            if (elVar != null) {
                fVar.i(41, elVar.mo75928xcd1e8d8());
                this.M.mo75956x3d5d1f78(fVar);
            }
            r45.om omVar = this.N;
            if (omVar != null) {
                fVar.i(42, omVar.mo75928xcd1e8d8());
                this.N.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0;
            r45.pi piVar2 = this.f470766d;
            if (piVar2 != null) {
                i18 += b36.f.i(2, piVar2.mo75928xcd1e8d8());
            }
            r45.lj ljVar2 = this.f470767e;
            if (ljVar2 != null) {
                i18 += b36.f.i(3, ljVar2.mo75928xcd1e8d8());
            }
            r45.gl glVar3 = this.f470768f;
            if (glVar3 != null) {
                i18 += b36.f.i(4, glVar3.mo75928xcd1e8d8());
            }
            r45.nj njVar2 = this.f470769g;
            if (njVar2 != null) {
                i18 += b36.f.i(5, njVar2.mo75928xcd1e8d8());
            }
            r45.gl glVar4 = this.f470770h;
            if (glVar4 != null) {
                i18 += b36.f.i(6, glVar4.mo75928xcd1e8d8());
            }
            r45.km kmVar2 = this.f470771i;
            if (kmVar2 != null) {
                i18 += b36.f.i(7, kmVar2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(8, this.f470772m) + b36.f.g(9, 8, linkedList2) + b36.f.e(10, this.f470774o);
            r45.qd5 qd5Var2 = this.f470775p;
            if (qd5Var2 != null) {
                e17 += b36.f.i(11, qd5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f470776q;
            if (str4 != null) {
                e17 += b36.f.j(12, str4);
            }
            r45.vm vmVar2 = this.f470777r;
            if (vmVar2 != null) {
                e17 += b36.f.i(13, vmVar2.mo75928xcd1e8d8());
            }
            r45.an anVar2 = this.f470778s;
            if (anVar2 != null) {
                e17 += b36.f.i(14, anVar2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(17, this.f470779t) + b36.f.g(20, 8, linkedList) + b36.f.a(21, this.f470781v);
            r45.td5 td5Var2 = this.f470782w;
            if (td5Var2 != null) {
                e18 += b36.f.i(22, td5Var2.mo75928xcd1e8d8());
            }
            r45.kl klVar2 = this.f470783x;
            if (klVar2 != null) {
                e18 += b36.f.i(23, klVar2.mo75928xcd1e8d8());
            }
            r45.f32 f32Var2 = this.f470784y;
            if (f32Var2 != null) {
                e18 += b36.f.i(24, f32Var2.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.f470785z;
            if (str5 != null) {
                e18 += b36.f.j(25, str5);
            }
            r45.ld7 ld7Var2 = this.A;
            if (ld7Var2 != null) {
                e18 += b36.f.i(26, ld7Var2.mo75928xcd1e8d8());
            }
            int e19 = e18 + b36.f.e(27, this.B);
            r45.tj6 tj6Var4 = this.C;
            if (tj6Var4 != null) {
                e19 += b36.f.i(31, tj6Var4.mo75928xcd1e8d8());
            }
            r45.tj6 tj6Var5 = this.D;
            if (tj6Var5 != null) {
                e19 += b36.f.i(32, tj6Var5.mo75928xcd1e8d8());
            }
            r45.tj6 tj6Var6 = this.E;
            if (tj6Var6 != null) {
                e19 += b36.f.i(33, tj6Var6.mo75928xcd1e8d8());
            }
            r45.i32 i32Var2 = this.F;
            if (i32Var2 != null) {
                e19 += b36.f.i(34, i32Var2.mo75928xcd1e8d8());
            }
            r45.x6 x6Var2 = this.G;
            if (x6Var2 != null) {
                e19 += b36.f.i(35, x6Var2.mo75928xcd1e8d8());
            }
            int e27 = e19 + b36.f.e(36, this.H);
            r45.z6 z6Var2 = this.I;
            if (z6Var2 != null) {
                e27 += b36.f.i(37, z6Var2.mo75928xcd1e8d8());
            }
            int a17 = e27 + b36.f.a(38, this.f470765J) + b36.f.e(39, this.K);
            java.lang.String str6 = this.L;
            if (str6 != null) {
                a17 += b36.f.j(40, str6);
            }
            r45.el elVar2 = this.M;
            if (elVar2 != null) {
                a17 += b36.f.i(41, elVar2.mo75928xcd1e8d8());
            }
            r45.om omVar2 = this.N;
            return omVar2 != null ? a17 + b36.f.i(42, omVar2.mo75928xcd1e8d8()) : a17;
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
        r45.wl wlVar = (r45.wl) objArr[1];
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
                    wlVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.pi piVar3 = new r45.pi();
                    if (bArr3 != null && bArr3.length > 0) {
                        piVar3.mo11468x92b714fd(bArr3);
                    }
                    wlVar.f470766d = piVar3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.lj ljVar3 = new r45.lj();
                    if (bArr4 != null && bArr4.length > 0) {
                        ljVar3.mo11468x92b714fd(bArr4);
                    }
                    wlVar.f470767e = ljVar3;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.gl glVar5 = new r45.gl();
                    if (bArr5 != null && bArr5.length > 0) {
                        glVar5.mo11468x92b714fd(bArr5);
                    }
                    wlVar.f470768f = glVar5;
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.nj njVar3 = new r45.nj();
                    if (bArr6 != null && bArr6.length > 0) {
                        njVar3.mo11468x92b714fd(bArr6);
                    }
                    wlVar.f470769g = njVar3;
                }
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.gl glVar6 = new r45.gl();
                    if (bArr7 != null && bArr7.length > 0) {
                        glVar6.mo11468x92b714fd(bArr7);
                    }
                    wlVar.f470770h = glVar6;
                }
                return 0;
            case 7:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.km kmVar3 = new r45.km();
                    if (bArr8 != null && bArr8.length > 0) {
                        kmVar3.mo11468x92b714fd(bArr8);
                    }
                    wlVar.f470771i = kmVar3;
                }
                return 0;
            case 8:
                wlVar.f470772m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.l53 l53Var = new r45.l53();
                    if (bArr9 != null && bArr9.length > 0) {
                        l53Var.mo11468x92b714fd(bArr9);
                    }
                    wlVar.f470773n.add(l53Var);
                }
                return 0;
            case 10:
                wlVar.f470774o = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    r45.qd5 qd5Var3 = new r45.qd5();
                    if (bArr10 != null && bArr10.length > 0) {
                        qd5Var3.mo11468x92b714fd(bArr10);
                    }
                    wlVar.f470775p = qd5Var3;
                }
                return 0;
            case 12:
                wlVar.f470776q = aVar2.k(intValue);
                return 0;
            case 13:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr11 = (byte[]) j47.get(i49);
                    r45.vm vmVar3 = new r45.vm();
                    if (bArr11 != null && bArr11.length > 0) {
                        vmVar3.mo11468x92b714fd(bArr11);
                    }
                    wlVar.f470777r = vmVar3;
                }
                return 0;
            case 14:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr12 = (byte[]) j48.get(i57);
                    r45.an anVar3 = new r45.an();
                    if (bArr12 != null && bArr12.length > 0) {
                        anVar3.mo11468x92b714fd(bArr12);
                    }
                    wlVar.f470778s = anVar3;
                }
                return 0;
            case 15:
            case 16:
            case 18:
            case 19:
            case 28:
            case 29:
            case 30:
            default:
                return -1;
            case 17:
                wlVar.f470779t = aVar2.g(intValue);
                return 0;
            case 20:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr13 = (byte[]) j49.get(i58);
                    r45.mk mkVar = new r45.mk();
                    if (bArr13 != null && bArr13.length > 0) {
                        mkVar.mo11468x92b714fd(bArr13);
                    }
                    wlVar.f470780u.add(mkVar);
                }
                return 0;
            case 21:
                wlVar.f470781v = aVar2.c(intValue);
                return 0;
            case 22:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr14 = (byte[]) j57.get(i59);
                    r45.td5 td5Var3 = new r45.td5();
                    if (bArr14 != null && bArr14.length > 0) {
                        td5Var3.mo11468x92b714fd(bArr14);
                    }
                    wlVar.f470782w = td5Var3;
                }
                return 0;
            case 23:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr15 = (byte[]) j58.get(i66);
                    r45.kl klVar3 = new r45.kl();
                    if (bArr15 != null && bArr15.length > 0) {
                        klVar3.mo11468x92b714fd(bArr15);
                    }
                    wlVar.f470783x = klVar3;
                }
                return 0;
            case 24:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i67 = 0; i67 < size15; i67++) {
                    byte[] bArr16 = (byte[]) j59.get(i67);
                    r45.f32 f32Var3 = new r45.f32();
                    if (bArr16 != null && bArr16.length > 0) {
                        f32Var3.mo11468x92b714fd(bArr16);
                    }
                    wlVar.f470784y = f32Var3;
                }
                return 0;
            case 25:
                wlVar.f470785z = aVar2.k(intValue);
                return 0;
            case 26:
                java.util.LinkedList j66 = aVar2.j(intValue);
                int size16 = j66.size();
                for (int i68 = 0; i68 < size16; i68++) {
                    byte[] bArr17 = (byte[]) j66.get(i68);
                    r45.ld7 ld7Var3 = new r45.ld7();
                    if (bArr17 != null && bArr17.length > 0) {
                        ld7Var3.mo11468x92b714fd(bArr17);
                    }
                    wlVar.A = ld7Var3;
                }
                return 0;
            case 27:
                wlVar.B = aVar2.g(intValue);
                return 0;
            case 31:
                java.util.LinkedList j67 = aVar2.j(intValue);
                int size17 = j67.size();
                for (int i69 = 0; i69 < size17; i69++) {
                    byte[] bArr18 = (byte[]) j67.get(i69);
                    r45.tj6 tj6Var7 = new r45.tj6();
                    if (bArr18 != null && bArr18.length > 0) {
                        tj6Var7.mo11468x92b714fd(bArr18);
                    }
                    wlVar.C = tj6Var7;
                }
                return 0;
            case 32:
                java.util.LinkedList j68 = aVar2.j(intValue);
                int size18 = j68.size();
                for (int i76 = 0; i76 < size18; i76++) {
                    byte[] bArr19 = (byte[]) j68.get(i76);
                    r45.tj6 tj6Var8 = new r45.tj6();
                    if (bArr19 != null && bArr19.length > 0) {
                        tj6Var8.mo11468x92b714fd(bArr19);
                    }
                    wlVar.D = tj6Var8;
                }
                return 0;
            case 33:
                java.util.LinkedList j69 = aVar2.j(intValue);
                int size19 = j69.size();
                for (int i77 = 0; i77 < size19; i77++) {
                    byte[] bArr20 = (byte[]) j69.get(i77);
                    r45.tj6 tj6Var9 = new r45.tj6();
                    if (bArr20 != null && bArr20.length > 0) {
                        tj6Var9.mo11468x92b714fd(bArr20);
                    }
                    wlVar.E = tj6Var9;
                }
                return 0;
            case 34:
                java.util.LinkedList j76 = aVar2.j(intValue);
                int size20 = j76.size();
                for (int i78 = 0; i78 < size20; i78++) {
                    byte[] bArr21 = (byte[]) j76.get(i78);
                    r45.i32 i32Var3 = new r45.i32();
                    if (bArr21 != null && bArr21.length > 0) {
                        i32Var3.mo11468x92b714fd(bArr21);
                    }
                    wlVar.F = i32Var3;
                }
                return 0;
            case 35:
                java.util.LinkedList j77 = aVar2.j(intValue);
                int size21 = j77.size();
                for (int i79 = 0; i79 < size21; i79++) {
                    byte[] bArr22 = (byte[]) j77.get(i79);
                    r45.x6 x6Var3 = new r45.x6();
                    if (bArr22 != null && bArr22.length > 0) {
                        x6Var3.mo11468x92b714fd(bArr22);
                    }
                    wlVar.G = x6Var3;
                }
                return 0;
            case 36:
                wlVar.H = aVar2.g(intValue);
                return 0;
            case 37:
                java.util.LinkedList j78 = aVar2.j(intValue);
                int size22 = j78.size();
                for (int i86 = 0; i86 < size22; i86++) {
                    byte[] bArr23 = (byte[]) j78.get(i86);
                    r45.z6 z6Var3 = new r45.z6();
                    if (bArr23 != null && bArr23.length > 0) {
                        z6Var3.mo11468x92b714fd(bArr23);
                    }
                    wlVar.I = z6Var3;
                }
                return 0;
            case 38:
                wlVar.f470765J = aVar2.c(intValue);
                return 0;
            case 39:
                wlVar.K = aVar2.g(intValue);
                return 0;
            case 40:
                wlVar.L = aVar2.k(intValue);
                return 0;
            case 41:
                java.util.LinkedList j79 = aVar2.j(intValue);
                int size23 = j79.size();
                for (int i87 = 0; i87 < size23; i87++) {
                    byte[] bArr24 = (byte[]) j79.get(i87);
                    r45.el elVar3 = new r45.el();
                    if (bArr24 != null && bArr24.length > 0) {
                        elVar3.mo11468x92b714fd(bArr24);
                    }
                    wlVar.M = elVar3;
                }
                return 0;
            case 42:
                java.util.LinkedList j86 = aVar2.j(intValue);
                int size24 = j86.size();
                for (int i88 = 0; i88 < size24; i88++) {
                    byte[] bArr25 = (byte[]) j86.get(i88);
                    r45.om omVar3 = new r45.om();
                    if (bArr25 != null && bArr25.length > 0) {
                        omVar3.mo11468x92b714fd(bArr25);
                    }
                    wlVar.N = omVar3;
                }
                return 0;
        }
    }
}
