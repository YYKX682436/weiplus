package r45;

/* loaded from: classes8.dex */
public class in6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public r45.o33 A;
    public java.lang.String B;
    public java.lang.String C;
    public boolean D;
    public java.lang.String E;
    public boolean F;
    public boolean G;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public r45.rn6 f458714J;
    public int K;
    public java.lang.String L;
    public int M;
    public long N;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458715d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458716e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458717f;

    /* renamed from: g, reason: collision with root package name */
    public int f458718g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f458719h;

    /* renamed from: i, reason: collision with root package name */
    public int f458720i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f458721m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f458722n;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f458724p;

    /* renamed from: r, reason: collision with root package name */
    public int f458726r;

    /* renamed from: s, reason: collision with root package name */
    public int f458727s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f458728t;

    /* renamed from: u, reason: collision with root package name */
    public int f458729u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f458730v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f458731w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f458732x;

    /* renamed from: z, reason: collision with root package name */
    public int f458734z;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f458723o = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f458725q = new java.util.LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public final java.util.LinkedList f458733y = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.in6)) {
            return false;
        }
        r45.in6 in6Var = (r45.in6) fVar;
        return n51.f.a(this.f458715d, in6Var.f458715d) && n51.f.a(this.f458716e, in6Var.f458716e) && n51.f.a(this.f458717f, in6Var.f458717f) && n51.f.a(java.lang.Integer.valueOf(this.f458718g), java.lang.Integer.valueOf(in6Var.f458718g)) && n51.f.a(this.f458719h, in6Var.f458719h) && n51.f.a(java.lang.Integer.valueOf(this.f458720i), java.lang.Integer.valueOf(in6Var.f458720i)) && n51.f.a(this.f458721m, in6Var.f458721m) && n51.f.a(this.f458722n, in6Var.f458722n) && n51.f.a(this.f458723o, in6Var.f458723o) && n51.f.a(this.f458724p, in6Var.f458724p) && n51.f.a(this.f458725q, in6Var.f458725q) && n51.f.a(java.lang.Integer.valueOf(this.f458726r), java.lang.Integer.valueOf(in6Var.f458726r)) && n51.f.a(java.lang.Integer.valueOf(this.f458727s), java.lang.Integer.valueOf(in6Var.f458727s)) && n51.f.a(this.f458728t, in6Var.f458728t) && n51.f.a(java.lang.Integer.valueOf(this.f458729u), java.lang.Integer.valueOf(in6Var.f458729u)) && n51.f.a(this.f458730v, in6Var.f458730v) && n51.f.a(this.f458731w, in6Var.f458731w) && n51.f.a(this.f458732x, in6Var.f458732x) && n51.f.a(this.f458733y, in6Var.f458733y) && n51.f.a(java.lang.Integer.valueOf(this.f458734z), java.lang.Integer.valueOf(in6Var.f458734z)) && n51.f.a(this.A, in6Var.A) && n51.f.a(this.B, in6Var.B) && n51.f.a(this.C, in6Var.C) && n51.f.a(java.lang.Boolean.valueOf(this.D), java.lang.Boolean.valueOf(in6Var.D)) && n51.f.a(this.E, in6Var.E) && n51.f.a(java.lang.Boolean.valueOf(this.F), java.lang.Boolean.valueOf(in6Var.F)) && n51.f.a(java.lang.Boolean.valueOf(this.G), java.lang.Boolean.valueOf(in6Var.G)) && n51.f.a(this.H, in6Var.H) && n51.f.a(java.lang.Boolean.valueOf(this.I), java.lang.Boolean.valueOf(in6Var.I)) && n51.f.a(this.f458714J, in6Var.f458714J) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(in6Var.K)) && n51.f.a(this.L, in6Var.L) && n51.f.a(java.lang.Integer.valueOf(this.M), java.lang.Integer.valueOf(in6Var.M)) && n51.f.a(java.lang.Long.valueOf(this.N), java.lang.Long.valueOf(in6Var.N));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f458733y;
        java.util.LinkedList linkedList2 = this.f458725q;
        java.util.LinkedList linkedList3 = this.f458723o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f458715d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f458716e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f458717f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f458718g);
            java.lang.String str4 = this.f458719h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f458720i);
            java.lang.String str5 = this.f458721m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f458722n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            fVar.g(9, 8, linkedList3);
            java.lang.String str7 = this.f458724p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            fVar.g(11, 8, linkedList2);
            fVar.e(12, this.f458726r);
            fVar.e(13, this.f458727s);
            java.lang.String str8 = this.f458728t;
            if (str8 != null) {
                fVar.j(14, str8);
            }
            fVar.e(15, this.f458729u);
            java.lang.String str9 = this.f458730v;
            if (str9 != null) {
                fVar.j(16, str9);
            }
            java.lang.String str10 = this.f458731w;
            if (str10 != null) {
                fVar.j(17, str10);
            }
            java.lang.String str11 = this.f458732x;
            if (str11 != null) {
                fVar.j(18, str11);
            }
            fVar.g(19, 1, linkedList);
            fVar.e(20, this.f458734z);
            r45.o33 o33Var = this.A;
            if (o33Var != null) {
                fVar.i(21, o33Var.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str12 = this.B;
            if (str12 != null) {
                fVar.j(22, str12);
            }
            java.lang.String str13 = this.C;
            if (str13 != null) {
                fVar.j(23, str13);
            }
            fVar.a(24, this.D);
            java.lang.String str14 = this.E;
            if (str14 != null) {
                fVar.j(25, str14);
            }
            fVar.a(26, this.F);
            fVar.a(27, this.G);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.H;
            if (gVar != null) {
                fVar.b(28, gVar);
            }
            fVar.a(29, this.I);
            r45.rn6 rn6Var = this.f458714J;
            if (rn6Var != null) {
                fVar.i(30, rn6Var.mo75928xcd1e8d8());
                this.f458714J.mo75956x3d5d1f78(fVar);
            }
            fVar.e(31, this.K);
            java.lang.String str15 = this.L;
            if (str15 != null) {
                fVar.j(32, str15);
            }
            fVar.e(33, this.M);
            fVar.h(34, this.N);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str16 = this.f458715d;
            int j17 = str16 != null ? b36.f.j(1, str16) + 0 : 0;
            java.lang.String str17 = this.f458716e;
            if (str17 != null) {
                j17 += b36.f.j(2, str17);
            }
            java.lang.String str18 = this.f458717f;
            if (str18 != null) {
                j17 += b36.f.j(3, str18);
            }
            int e17 = j17 + b36.f.e(4, this.f458718g);
            java.lang.String str19 = this.f458719h;
            if (str19 != null) {
                e17 += b36.f.j(5, str19);
            }
            int e18 = e17 + b36.f.e(6, this.f458720i);
            java.lang.String str20 = this.f458721m;
            if (str20 != null) {
                e18 += b36.f.j(7, str20);
            }
            java.lang.String str21 = this.f458722n;
            if (str21 != null) {
                e18 += b36.f.j(8, str21);
            }
            int g17 = e18 + b36.f.g(9, 8, linkedList3);
            java.lang.String str22 = this.f458724p;
            if (str22 != null) {
                g17 += b36.f.j(10, str22);
            }
            int g18 = g17 + b36.f.g(11, 8, linkedList2) + b36.f.e(12, this.f458726r) + b36.f.e(13, this.f458727s);
            java.lang.String str23 = this.f458728t;
            if (str23 != null) {
                g18 += b36.f.j(14, str23);
            }
            int e19 = g18 + b36.f.e(15, this.f458729u);
            java.lang.String str24 = this.f458730v;
            if (str24 != null) {
                e19 += b36.f.j(16, str24);
            }
            java.lang.String str25 = this.f458731w;
            if (str25 != null) {
                e19 += b36.f.j(17, str25);
            }
            java.lang.String str26 = this.f458732x;
            if (str26 != null) {
                e19 += b36.f.j(18, str26);
            }
            int g19 = e19 + b36.f.g(19, 1, linkedList) + b36.f.e(20, this.f458734z);
            r45.o33 o33Var2 = this.A;
            if (o33Var2 != null) {
                g19 += b36.f.i(21, o33Var2.mo75928xcd1e8d8());
            }
            java.lang.String str27 = this.B;
            if (str27 != null) {
                g19 += b36.f.j(22, str27);
            }
            java.lang.String str28 = this.C;
            if (str28 != null) {
                g19 += b36.f.j(23, str28);
            }
            int a17 = g19 + b36.f.a(24, this.D);
            java.lang.String str29 = this.E;
            if (str29 != null) {
                a17 += b36.f.j(25, str29);
            }
            int a18 = a17 + b36.f.a(26, this.F) + b36.f.a(27, this.G);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.H;
            if (gVar2 != null) {
                a18 += b36.f.b(28, gVar2);
            }
            int a19 = a18 + b36.f.a(29, this.I);
            r45.rn6 rn6Var2 = this.f458714J;
            if (rn6Var2 != null) {
                a19 += b36.f.i(30, rn6Var2.mo75928xcd1e8d8());
            }
            int e27 = a19 + b36.f.e(31, this.K);
            java.lang.String str30 = this.L;
            if (str30 != null) {
                e27 += b36.f.j(32, str30);
            }
            return e27 + b36.f.e(33, this.M) + b36.f.h(34, this.N);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
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
        r45.in6 in6Var = (r45.in6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                in6Var.f458715d = aVar2.k(intValue);
                return 0;
            case 2:
                in6Var.f458716e = aVar2.k(intValue);
                return 0;
            case 3:
                in6Var.f458717f = aVar2.k(intValue);
                return 0;
            case 4:
                in6Var.f458718g = aVar2.g(intValue);
                return 0;
            case 5:
                in6Var.f458719h = aVar2.k(intValue);
                return 0;
            case 6:
                in6Var.f458720i = aVar2.g(intValue);
                return 0;
            case 7:
                in6Var.f458721m = aVar2.k(intValue);
                return 0;
            case 8:
                in6Var.f458722n = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.x50 x50Var = new r45.x50();
                    if (bArr2 != null && bArr2.length > 0) {
                        x50Var.mo11468x92b714fd(bArr2);
                    }
                    in6Var.f458723o.add(x50Var);
                }
                return 0;
            case 10:
                in6Var.f458724p = aVar2.k(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.tn6 tn6Var = new r45.tn6();
                    if (bArr3 != null && bArr3.length > 0) {
                        tn6Var.mo11468x92b714fd(bArr3);
                    }
                    in6Var.f458725q.add(tn6Var);
                }
                return 0;
            case 12:
                in6Var.f458726r = aVar2.g(intValue);
                return 0;
            case 13:
                in6Var.f458727s = aVar2.g(intValue);
                return 0;
            case 14:
                in6Var.f458728t = aVar2.k(intValue);
                return 0;
            case 15:
                in6Var.f458729u = aVar2.g(intValue);
                return 0;
            case 16:
                in6Var.f458730v = aVar2.k(intValue);
                return 0;
            case 17:
                in6Var.f458731w = aVar2.k(intValue);
                return 0;
            case 18:
                in6Var.f458732x = aVar2.k(intValue);
                return 0;
            case 19:
                in6Var.f458733y.add(aVar2.k(intValue));
                return 0;
            case 20:
                in6Var.f458734z = aVar2.g(intValue);
                return 0;
            case 21:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.o33 o33Var3 = new r45.o33();
                    if (bArr4 != null && bArr4.length > 0) {
                        o33Var3.mo11468x92b714fd(bArr4);
                    }
                    in6Var.A = o33Var3;
                }
                return 0;
            case 22:
                in6Var.B = aVar2.k(intValue);
                return 0;
            case 23:
                in6Var.C = aVar2.k(intValue);
                return 0;
            case 24:
                in6Var.D = aVar2.c(intValue);
                return 0;
            case 25:
                in6Var.E = aVar2.k(intValue);
                return 0;
            case 26:
                in6Var.F = aVar2.c(intValue);
                return 0;
            case 27:
                in6Var.G = aVar2.c(intValue);
                return 0;
            case 28:
                in6Var.H = aVar2.d(intValue);
                return 0;
            case 29:
                in6Var.I = aVar2.c(intValue);
                return 0;
            case 30:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.rn6 rn6Var3 = new r45.rn6();
                    if (bArr5 != null && bArr5.length > 0) {
                        rn6Var3.mo11468x92b714fd(bArr5);
                    }
                    in6Var.f458714J = rn6Var3;
                }
                return 0;
            case 31:
                in6Var.K = aVar2.g(intValue);
                return 0;
            case 32:
                in6Var.L = aVar2.k(intValue);
                return 0;
            case 33:
                in6Var.M = aVar2.g(intValue);
                return 0;
            case 34:
                in6Var.N = aVar2.i(intValue);
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
            java.lang.String str = this.f458715d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "searchId", str, false);
            eVar.d(jSONObject, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, this.f458716e, false);
            eVar.d(jSONObject, "subSessionId", this.f458717f, false);
            eVar.d(jSONObject, "offset", java.lang.Integer.valueOf(this.f458718g), false);
            eVar.d(jSONObject, "keyword", this.f458719h, false);
            eVar.d(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f458720i), false);
            eVar.d(jSONObject, "url", this.f458721m, false);
            eVar.d(jSONObject, "requestId", this.f458722n, false);
            eVar.d(jSONObject, "extReqParams", this.f458723o, false);
            eVar.d(jSONObject, "contextId", this.f458724p, false);
            eVar.d(jSONObject, "stageList", this.f458725q, false);
            eVar.d(jSONObject, "firstLoadWebView", java.lang.Integer.valueOf(this.f458726r), false);
            eVar.d(jSONObject, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56315xfd38653e, java.lang.Integer.valueOf(this.f458727s), false);
            eVar.d(jSONObject, "navigationId", this.f458728t, false);
            eVar.d(jSONObject, "pageId", java.lang.Integer.valueOf(this.f458729u), false);
            eVar.d(jSONObject, "pageTitle", this.f458730v, false);
            eVar.d(jSONObject, com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56087x98abae37, this.f458731w, false);
            eVar.d(jSONObject, "webviewType", this.f458732x, false);
            eVar.d(jSONObject, "checkDocidList", this.f458733y, false);
            eVar.d(jSONObject, "actionBarColor", java.lang.Integer.valueOf(this.f458734z), false);
            eVar.d(jSONObject, "floatingWindow", this.A, false);
            eVar.d(jSONObject, "homeMsgId", this.B, false);
            eVar.d(jSONObject, "redPointMsgId", this.C, false);
            eVar.d(jSONObject, "directRequest", java.lang.Boolean.valueOf(this.D), false);
            eVar.d(jSONObject, "newlifeSearchByPassInfo", this.E, false);
            eVar.d(jSONObject, "isNewLifeRedDotEntranceShow", java.lang.Boolean.valueOf(this.F), false);
            eVar.d(jSONObject, "isJumpTabFindWhenBack", java.lang.Boolean.valueOf(this.G), false);
            eVar.d(jSONObject, "redDotBytes", this.H, false);
            eVar.d(jSONObject, "highLightTopStoryEntry", java.lang.Boolean.valueOf(this.I), false);
            eVar.d(jSONObject, "redDotModel", this.f458714J, false);
            eVar.d(jSONObject, "enterTabStrategy", java.lang.Integer.valueOf(this.K), false);
            eVar.d(jSONObject, "newlifePostFeedId", this.L, false);
            eVar.d(jSONObject, "newlifeFrontpageEnterSource", java.lang.Integer.valueOf(this.M), false);
            eVar.d(jSONObject, "clickK1KTimeMs", java.lang.Long.valueOf(this.N), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
