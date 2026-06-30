package r45;

/* loaded from: classes2.dex */
public class z97 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public java.lang.String A;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g B;
    public r45.h86 C;
    public r45.fb0 D;
    public r45.j95 E;
    public int F;
    public r45.j30 G;
    public r45.zj6 H;

    /* renamed from: d, reason: collision with root package name */
    public int f473354d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473355e;

    /* renamed from: f, reason: collision with root package name */
    public int f473356f;

    /* renamed from: g, reason: collision with root package name */
    public long f473357g;

    /* renamed from: h, reason: collision with root package name */
    public int f473358h;

    /* renamed from: i, reason: collision with root package name */
    public r45.e64 f473359i;

    /* renamed from: n, reason: collision with root package name */
    public int f473361n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f473362o;

    /* renamed from: p, reason: collision with root package name */
    public int f473363p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f473364q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f473365r;

    /* renamed from: s, reason: collision with root package name */
    public int f473366s;

    /* renamed from: v, reason: collision with root package name */
    public r45.dk6 f473369v;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f473372y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f473373z;

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f473360m = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public java.util.LinkedList f473367t = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public int f473368u = 2;

    /* renamed from: w, reason: collision with root package name */
    public java.util.LinkedList f473370w = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public java.util.LinkedList f473371x = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z97)) {
            return false;
        }
        r45.z97 z97Var = (r45.z97) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f473354d), java.lang.Integer.valueOf(z97Var.f473354d)) && n51.f.a(this.f473355e, z97Var.f473355e) && n51.f.a(java.lang.Integer.valueOf(this.f473356f), java.lang.Integer.valueOf(z97Var.f473356f)) && n51.f.a(java.lang.Long.valueOf(this.f473357g), java.lang.Long.valueOf(z97Var.f473357g)) && n51.f.a(java.lang.Integer.valueOf(this.f473358h), java.lang.Integer.valueOf(z97Var.f473358h)) && n51.f.a(this.f473359i, z97Var.f473359i) && n51.f.a(this.f473360m, z97Var.f473360m) && n51.f.a(java.lang.Integer.valueOf(this.f473361n), java.lang.Integer.valueOf(z97Var.f473361n)) && n51.f.a(this.f473362o, z97Var.f473362o) && n51.f.a(java.lang.Integer.valueOf(this.f473363p), java.lang.Integer.valueOf(z97Var.f473363p)) && n51.f.a(this.f473364q, z97Var.f473364q) && n51.f.a(this.f473365r, z97Var.f473365r) && n51.f.a(java.lang.Integer.valueOf(this.f473366s), java.lang.Integer.valueOf(z97Var.f473366s)) && n51.f.a(this.f473367t, z97Var.f473367t) && n51.f.a(java.lang.Integer.valueOf(this.f473368u), java.lang.Integer.valueOf(z97Var.f473368u)) && n51.f.a(this.f473369v, z97Var.f473369v) && n51.f.a(this.f473370w, z97Var.f473370w) && n51.f.a(this.f473371x, z97Var.f473371x) && n51.f.a(this.f473372y, z97Var.f473372y) && n51.f.a(this.f473373z, z97Var.f473373z) && n51.f.a(this.A, z97Var.A) && n51.f.a(this.B, z97Var.B) && n51.f.a(this.C, z97Var.C) && n51.f.a(this.D, z97Var.D) && n51.f.a(this.E, z97Var.E) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(z97Var.F)) && n51.f.a(this.G, z97Var.G) && n51.f.a(this.H, z97Var.H);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f473354d);
            java.lang.String str = this.f473355e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f473356f);
            fVar.h(4, this.f473357g);
            fVar.e(5, this.f473358h);
            r45.e64 e64Var = this.f473359i;
            if (e64Var != null) {
                fVar.i(6, e64Var.mo75928xcd1e8d8());
                this.f473359i.mo75956x3d5d1f78(fVar);
            }
            fVar.g(7, 8, this.f473360m);
            fVar.e(8, this.f473361n);
            java.lang.String str2 = this.f473362o;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            fVar.e(10, this.f473363p);
            java.lang.String str3 = this.f473364q;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            java.lang.String str4 = this.f473365r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            fVar.e(13, this.f473366s);
            fVar.g(14, 1, this.f473367t);
            fVar.e(15, this.f473368u);
            r45.dk6 dk6Var = this.f473369v;
            if (dk6Var != null) {
                fVar.i(16, dk6Var.mo75928xcd1e8d8());
                this.f473369v.mo75956x3d5d1f78(fVar);
            }
            fVar.g(17, 8, this.f473370w);
            fVar.g(18, 8, this.f473371x);
            java.lang.String str5 = this.f473372y;
            if (str5 != null) {
                fVar.j(19, str5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f473373z;
            if (gVar != null) {
                fVar.b(20, gVar);
            }
            java.lang.String str6 = this.A;
            if (str6 != null) {
                fVar.j(21, str6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.B;
            if (gVar2 != null) {
                fVar.b(22, gVar2);
            }
            r45.h86 h86Var = this.C;
            if (h86Var != null) {
                fVar.i(23, h86Var.mo75928xcd1e8d8());
                this.C.mo75956x3d5d1f78(fVar);
            }
            r45.fb0 fb0Var = this.D;
            if (fb0Var != null) {
                fVar.i(24, fb0Var.mo75928xcd1e8d8());
                this.D.mo75956x3d5d1f78(fVar);
            }
            r45.j95 j95Var = this.E;
            if (j95Var != null) {
                fVar.i(25, j95Var.mo75928xcd1e8d8());
                this.E.mo75956x3d5d1f78(fVar);
            }
            fVar.e(26, this.F);
            r45.j30 j30Var = this.G;
            if (j30Var != null) {
                fVar.i(27, j30Var.mo75928xcd1e8d8());
                this.G.mo75956x3d5d1f78(fVar);
            }
            r45.zj6 zj6Var = this.H;
            if (zj6Var != null) {
                fVar.i(28, zj6Var.mo75928xcd1e8d8());
                this.H.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f473354d) + 0;
            java.lang.String str7 = this.f473355e;
            if (str7 != null) {
                e17 += b36.f.j(2, str7);
            }
            int e18 = e17 + b36.f.e(3, this.f473356f) + b36.f.h(4, this.f473357g) + b36.f.e(5, this.f473358h);
            r45.e64 e64Var2 = this.f473359i;
            if (e64Var2 != null) {
                e18 += b36.f.i(6, e64Var2.mo75928xcd1e8d8());
            }
            int g17 = e18 + b36.f.g(7, 8, this.f473360m) + b36.f.e(8, this.f473361n);
            java.lang.String str8 = this.f473362o;
            if (str8 != null) {
                g17 += b36.f.j(9, str8);
            }
            int e19 = g17 + b36.f.e(10, this.f473363p);
            java.lang.String str9 = this.f473364q;
            if (str9 != null) {
                e19 += b36.f.j(11, str9);
            }
            java.lang.String str10 = this.f473365r;
            if (str10 != null) {
                e19 += b36.f.j(12, str10);
            }
            int e27 = e19 + b36.f.e(13, this.f473366s) + b36.f.g(14, 1, this.f473367t) + b36.f.e(15, this.f473368u);
            r45.dk6 dk6Var2 = this.f473369v;
            if (dk6Var2 != null) {
                e27 += b36.f.i(16, dk6Var2.mo75928xcd1e8d8());
            }
            int g18 = e27 + b36.f.g(17, 8, this.f473370w) + b36.f.g(18, 8, this.f473371x);
            java.lang.String str11 = this.f473372y;
            if (str11 != null) {
                g18 += b36.f.j(19, str11);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f473373z;
            if (gVar3 != null) {
                g18 += b36.f.b(20, gVar3);
            }
            java.lang.String str12 = this.A;
            if (str12 != null) {
                g18 += b36.f.j(21, str12);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.B;
            if (gVar4 != null) {
                g18 += b36.f.b(22, gVar4);
            }
            r45.h86 h86Var2 = this.C;
            if (h86Var2 != null) {
                g18 += b36.f.i(23, h86Var2.mo75928xcd1e8d8());
            }
            r45.fb0 fb0Var2 = this.D;
            if (fb0Var2 != null) {
                g18 += b36.f.i(24, fb0Var2.mo75928xcd1e8d8());
            }
            r45.j95 j95Var2 = this.E;
            if (j95Var2 != null) {
                g18 += b36.f.i(25, j95Var2.mo75928xcd1e8d8());
            }
            int e28 = g18 + b36.f.e(26, this.F);
            r45.j30 j30Var2 = this.G;
            if (j30Var2 != null) {
                e28 += b36.f.i(27, j30Var2.mo75928xcd1e8d8());
            }
            r45.zj6 zj6Var2 = this.H;
            return zj6Var2 != null ? e28 + b36.f.i(28, zj6Var2.mo75928xcd1e8d8()) : e28;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f473360m.clear();
            this.f473367t.clear();
            this.f473370w.clear();
            this.f473371x.clear();
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
        r45.z97 z97Var = (r45.z97) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                z97Var.f473354d = aVar2.g(intValue);
                return 0;
            case 2:
                z97Var.f473355e = aVar2.k(intValue);
                return 0;
            case 3:
                z97Var.f473356f = aVar2.g(intValue);
                return 0;
            case 4:
                z97Var.f473357g = aVar2.i(intValue);
                return 0;
            case 5:
                z97Var.f473358h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.e64 e64Var3 = new r45.e64();
                    if (bArr2 != null && bArr2.length > 0) {
                        e64Var3.mo11468x92b714fd(bArr2);
                    }
                    z97Var.f473359i = e64Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.fw6 fw6Var = new r45.fw6();
                    if (bArr3 != null && bArr3.length > 0) {
                        fw6Var.mo11468x92b714fd(bArr3);
                    }
                    z97Var.f473360m.add(fw6Var);
                }
                return 0;
            case 8:
                z97Var.f473361n = aVar2.g(intValue);
                return 0;
            case 9:
                z97Var.f473362o = aVar2.k(intValue);
                return 0;
            case 10:
                z97Var.f473363p = aVar2.g(intValue);
                return 0;
            case 11:
                z97Var.f473364q = aVar2.k(intValue);
                return 0;
            case 12:
                z97Var.f473365r = aVar2.k(intValue);
                return 0;
            case 13:
                z97Var.f473366s = aVar2.g(intValue);
                return 0;
            case 14:
                z97Var.f473367t.add(aVar2.k(intValue));
                return 0;
            case 15:
                z97Var.f473368u = aVar2.g(intValue);
                return 0;
            case 16:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.dk6 dk6Var3 = new r45.dk6();
                    if (bArr4 != null && bArr4.length > 0) {
                        dk6Var3.mo11468x92b714fd(bArr4);
                    }
                    z97Var.f473369v = dk6Var3;
                }
                return 0;
            case 17:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.x50 x50Var = new r45.x50();
                    if (bArr5 != null && bArr5.length > 0) {
                        x50Var.mo11468x92b714fd(bArr5);
                    }
                    z97Var.f473370w.add(x50Var);
                }
                return 0;
            case 18:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.hx4 hx4Var = new r45.hx4();
                    if (bArr6 != null && bArr6.length > 0) {
                        hx4Var.mo11468x92b714fd(bArr6);
                    }
                    z97Var.f473371x.add(hx4Var);
                }
                return 0;
            case 19:
                z97Var.f473372y = aVar2.k(intValue);
                return 0;
            case 20:
                z97Var.f473373z = aVar2.d(intValue);
                return 0;
            case 21:
                z97Var.A = aVar2.k(intValue);
                return 0;
            case 22:
                z97Var.B = aVar2.d(intValue);
                return 0;
            case 23:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.h86 h86Var3 = new r45.h86();
                    if (bArr7 != null && bArr7.length > 0) {
                        h86Var3.mo11468x92b714fd(bArr7);
                    }
                    z97Var.C = h86Var3;
                }
                return 0;
            case 24:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j37.get(i38);
                    r45.fb0 fb0Var3 = new r45.fb0();
                    if (bArr8 != null && bArr8.length > 0) {
                        fb0Var3.mo11468x92b714fd(bArr8);
                    }
                    z97Var.D = fb0Var3;
                }
                return 0;
            case 25:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr9 = (byte[]) j38.get(i39);
                    r45.j95 j95Var3 = new r45.j95();
                    if (bArr9 != null && bArr9.length > 0) {
                        j95Var3.mo11468x92b714fd(bArr9);
                    }
                    z97Var.E = j95Var3;
                }
                return 0;
            case 26:
                z97Var.F = aVar2.g(intValue);
                return 0;
            case 27:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr10 = (byte[]) j39.get(i47);
                    r45.j30 j30Var3 = new r45.j30();
                    if (bArr10 != null && bArr10.length > 0) {
                        j30Var3.mo11468x92b714fd(bArr10);
                    }
                    z97Var.G = j30Var3;
                }
                return 0;
            case 28:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr11 = (byte[]) j47.get(i48);
                    r45.zj6 zj6Var3 = new r45.zj6();
                    if (bArr11 != null && bArr11.length > 0) {
                        zj6Var3.mo11468x92b714fd(bArr11);
                    }
                    z97Var.H = zj6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f473354d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "IsHomePage", valueOf, false);
            eVar.d(jSONObject, "Keyword", this.f473355e, false);
            eVar.d(jSONObject, "Offset", java.lang.Integer.valueOf(this.f473356f), false);
            eVar.d(jSONObject, "BusinessType", java.lang.Long.valueOf(this.f473357g), false);
            eVar.d(jSONObject, "CliVersion", java.lang.Integer.valueOf(this.f473358h), false);
            eVar.d(jSONObject, "Location", this.f473359i, false);
            eVar.d(jSONObject, "MatchUserList", this.f473360m, false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f473361n), false);
            eVar.d(jSONObject, "SearchID", this.f473362o, false);
            eVar.d(jSONObject, "SceneActionType", java.lang.Integer.valueOf(this.f473363p), false);
            eVar.d(jSONObject, "SugID", this.f473364q, false);
            eVar.d(jSONObject, "PrefixSug", this.f473365r, false);
            eVar.d(jSONObject, "SugType", java.lang.Integer.valueOf(this.f473366s), false);
            eVar.d(jSONObject, "PrefixQuery", this.f473367t, false);
            eVar.d(jSONObject, "DisplayPattern", java.lang.Integer.valueOf(this.f473368u), false);
            eVar.d(jSONObject, "TagInfo", this.f473369v, false);
            eVar.d(jSONObject, "ExtReqParams", this.f473370w, false);
            eVar.d(jSONObject, "NumConditions", this.f473371x, false);
            eVar.d(jSONObject, "Language", this.f473372y, false);
            eVar.d(jSONObject, "WeAppCtrlInfo", this.f473373z, false);
            eVar.d(jSONObject, "SessionID", this.A, false);
            eVar.d(jSONObject, "BoxCtrlInfo", this.B, false);
            eVar.d(jSONObject, dm.va.f68838xc4fe047c, this.C, false);
            eVar.d(jSONObject, "DebugCtrlInfo", this.D, false);
            eVar.d(jSONObject, "PoiInfo", this.E, false);
            eVar.d(jSONObject, "DarkMode", java.lang.Integer.valueOf(this.F), false);
            eVar.d(jSONObject, "ChildMode", this.G, false);
            eVar.d(jSONObject, "TagExtInfo", this.H, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
