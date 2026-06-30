package pj4;

/* loaded from: classes11.dex */
public class b0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public int A;
    public int B;
    public java.lang.String C;
    public java.lang.String D;
    public int E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f436504J;
    public pj4.z K;
    public java.lang.String L;
    public long P;
    public java.lang.String Q;
    public long S;
    public boolean T;

    /* renamed from: d, reason: collision with root package name */
    public double f436505d;

    /* renamed from: e, reason: collision with root package name */
    public double f436506e;

    /* renamed from: f, reason: collision with root package name */
    public int f436507f;

    /* renamed from: g, reason: collision with root package name */
    public pj4.o0 f436508g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f436509h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f436510i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f436511m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f436512n;

    /* renamed from: o, reason: collision with root package name */
    public int f436513o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f436514p;

    /* renamed from: q, reason: collision with root package name */
    public int f436515q;

    /* renamed from: r, reason: collision with root package name */
    public int f436516r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f436517s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f436518t;

    /* renamed from: u, reason: collision with root package name */
    public long f436519u;

    /* renamed from: v, reason: collision with root package name */
    public int f436520v;

    /* renamed from: w, reason: collision with root package name */
    public int f436521w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f436522x;

    /* renamed from: y, reason: collision with root package name */
    public pj4.z f436523y;

    /* renamed from: z, reason: collision with root package name */
    public int f436524z;
    public java.util.LinkedList M = new java.util.LinkedList();
    public java.util.LinkedList N = new java.util.LinkedList();
    public final java.util.LinkedList R = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.b0)) {
            return false;
        }
        pj4.b0 b0Var = (pj4.b0) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f436505d), java.lang.Double.valueOf(b0Var.f436505d)) && n51.f.a(java.lang.Double.valueOf(this.f436506e), java.lang.Double.valueOf(b0Var.f436506e)) && n51.f.a(java.lang.Integer.valueOf(this.f436507f), java.lang.Integer.valueOf(b0Var.f436507f)) && n51.f.a(this.f436508g, b0Var.f436508g) && n51.f.a(this.f436509h, b0Var.f436509h) && n51.f.a(this.f436510i, b0Var.f436510i) && n51.f.a(this.f436511m, b0Var.f436511m) && n51.f.a(this.f436512n, b0Var.f436512n) && n51.f.a(java.lang.Integer.valueOf(this.f436513o), java.lang.Integer.valueOf(b0Var.f436513o)) && n51.f.a(this.f436514p, b0Var.f436514p) && n51.f.a(java.lang.Integer.valueOf(this.f436515q), java.lang.Integer.valueOf(b0Var.f436515q)) && n51.f.a(java.lang.Integer.valueOf(this.f436516r), java.lang.Integer.valueOf(b0Var.f436516r)) && n51.f.a(this.f436517s, b0Var.f436517s) && n51.f.a(this.f436518t, b0Var.f436518t) && n51.f.a(java.lang.Long.valueOf(this.f436519u), java.lang.Long.valueOf(b0Var.f436519u)) && n51.f.a(java.lang.Integer.valueOf(this.f436520v), java.lang.Integer.valueOf(b0Var.f436520v)) && n51.f.a(java.lang.Integer.valueOf(this.f436521w), java.lang.Integer.valueOf(b0Var.f436521w)) && n51.f.a(this.f436522x, b0Var.f436522x) && n51.f.a(this.f436523y, b0Var.f436523y) && n51.f.a(java.lang.Integer.valueOf(this.f436524z), java.lang.Integer.valueOf(b0Var.f436524z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(b0Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(b0Var.B)) && n51.f.a(this.C, b0Var.C) && n51.f.a(this.D, b0Var.D) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(b0Var.E)) && n51.f.a(this.F, b0Var.F) && n51.f.a(this.G, b0Var.G) && n51.f.a(this.H, b0Var.H) && n51.f.a(java.lang.Long.valueOf(this.I), java.lang.Long.valueOf(b0Var.I)) && n51.f.a(this.f436504J, b0Var.f436504J) && n51.f.a(this.K, b0Var.K) && n51.f.a(this.L, b0Var.L) && n51.f.a(this.M, b0Var.M) && n51.f.a(this.N, b0Var.N) && n51.f.a(java.lang.Long.valueOf(this.P), java.lang.Long.valueOf(b0Var.P)) && n51.f.a(this.Q, b0Var.Q) && n51.f.a(this.R, b0Var.R) && n51.f.a(java.lang.Long.valueOf(this.S), java.lang.Long.valueOf(b0Var.S)) && n51.f.a(java.lang.Boolean.valueOf(this.T), java.lang.Boolean.valueOf(b0Var.T));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.R;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.c(1, this.f436505d);
            fVar.c(2, this.f436506e);
            fVar.e(3, this.f436507f);
            pj4.o0 o0Var = this.f436508g;
            if (o0Var != null) {
                fVar.i(4, o0Var.mo75928xcd1e8d8());
                this.f436508g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f436509h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f436510i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f436511m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f436512n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f436513o);
            java.lang.String str5 = this.f436514p;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            fVar.e(11, this.f436515q);
            fVar.e(12, this.f436516r);
            java.lang.String str6 = this.f436517s;
            if (str6 != null) {
                fVar.j(13, str6);
            }
            java.lang.String str7 = this.f436518t;
            if (str7 != null) {
                fVar.j(14, str7);
            }
            fVar.h(15, this.f436519u);
            fVar.e(16, this.f436520v);
            fVar.e(17, this.f436521w);
            java.lang.String str8 = this.f436522x;
            if (str8 != null) {
                fVar.j(18, str8);
            }
            pj4.z zVar = this.f436523y;
            if (zVar != null) {
                fVar.i(20, zVar.mo75928xcd1e8d8());
                this.f436523y.mo75956x3d5d1f78(fVar);
            }
            fVar.e(21, this.f436524z);
            fVar.e(22, this.A);
            fVar.e(23, this.B);
            java.lang.String str9 = this.C;
            if (str9 != null) {
                fVar.j(24, str9);
            }
            java.lang.String str10 = this.D;
            if (str10 != null) {
                fVar.j(25, str10);
            }
            fVar.e(26, this.E);
            java.lang.String str11 = this.F;
            if (str11 != null) {
                fVar.j(27, str11);
            }
            java.lang.String str12 = this.G;
            if (str12 != null) {
                fVar.j(28, str12);
            }
            java.lang.String str13 = this.H;
            if (str13 != null) {
                fVar.j(29, str13);
            }
            fVar.h(30, this.I);
            java.lang.String str14 = this.f436504J;
            if (str14 != null) {
                fVar.j(31, str14);
            }
            pj4.z zVar2 = this.K;
            if (zVar2 != null) {
                fVar.i(32, zVar2.mo75928xcd1e8d8());
                this.K.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str15 = this.L;
            if (str15 != null) {
                fVar.j(33, str15);
            }
            fVar.g(34, 2, this.M);
            fVar.g(35, 1, this.N);
            fVar.h(37, this.P);
            java.lang.String str16 = this.Q;
            if (str16 != null) {
                fVar.j(38, str16);
            }
            fVar.g(39, 8, linkedList);
            fVar.h(40, this.S);
            fVar.a(41, this.T);
            return 0;
        }
        if (i17 == 1) {
            int c17 = b36.f.c(1, this.f436505d) + 0 + b36.f.c(2, this.f436506e) + b36.f.e(3, this.f436507f);
            pj4.o0 o0Var2 = this.f436508g;
            if (o0Var2 != null) {
                c17 += b36.f.i(4, o0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str17 = this.f436509h;
            if (str17 != null) {
                c17 += b36.f.j(5, str17);
            }
            java.lang.String str18 = this.f436510i;
            if (str18 != null) {
                c17 += b36.f.j(6, str18);
            }
            java.lang.String str19 = this.f436511m;
            if (str19 != null) {
                c17 += b36.f.j(7, str19);
            }
            java.lang.String str20 = this.f436512n;
            if (str20 != null) {
                c17 += b36.f.j(8, str20);
            }
            int e17 = c17 + b36.f.e(9, this.f436513o);
            java.lang.String str21 = this.f436514p;
            if (str21 != null) {
                e17 += b36.f.j(10, str21);
            }
            int e18 = e17 + b36.f.e(11, this.f436515q) + b36.f.e(12, this.f436516r);
            java.lang.String str22 = this.f436517s;
            if (str22 != null) {
                e18 += b36.f.j(13, str22);
            }
            java.lang.String str23 = this.f436518t;
            if (str23 != null) {
                e18 += b36.f.j(14, str23);
            }
            int h17 = e18 + b36.f.h(15, this.f436519u) + b36.f.e(16, this.f436520v) + b36.f.e(17, this.f436521w);
            java.lang.String str24 = this.f436522x;
            if (str24 != null) {
                h17 += b36.f.j(18, str24);
            }
            pj4.z zVar3 = this.f436523y;
            if (zVar3 != null) {
                h17 += b36.f.i(20, zVar3.mo75928xcd1e8d8());
            }
            int e19 = h17 + b36.f.e(21, this.f436524z) + b36.f.e(22, this.A) + b36.f.e(23, this.B);
            java.lang.String str25 = this.C;
            if (str25 != null) {
                e19 += b36.f.j(24, str25);
            }
            java.lang.String str26 = this.D;
            if (str26 != null) {
                e19 += b36.f.j(25, str26);
            }
            int e27 = e19 + b36.f.e(26, this.E);
            java.lang.String str27 = this.F;
            if (str27 != null) {
                e27 += b36.f.j(27, str27);
            }
            java.lang.String str28 = this.G;
            if (str28 != null) {
                e27 += b36.f.j(28, str28);
            }
            java.lang.String str29 = this.H;
            if (str29 != null) {
                e27 += b36.f.j(29, str29);
            }
            int h18 = e27 + b36.f.h(30, this.I);
            java.lang.String str30 = this.f436504J;
            if (str30 != null) {
                h18 += b36.f.j(31, str30);
            }
            pj4.z zVar4 = this.K;
            if (zVar4 != null) {
                h18 += b36.f.i(32, zVar4.mo75928xcd1e8d8());
            }
            java.lang.String str31 = this.L;
            if (str31 != null) {
                h18 += b36.f.j(33, str31);
            }
            int g17 = h18 + b36.f.g(34, 2, this.M) + b36.f.g(35, 1, this.N) + b36.f.h(37, this.P);
            java.lang.String str32 = this.Q;
            if (str32 != null) {
                g17 += b36.f.j(38, str32);
            }
            return g17 + b36.f.g(39, 8, linkedList) + b36.f.h(40, this.S) + b36.f.a(41, this.T);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.M.clear();
            this.N.clear();
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
        pj4.b0 b0Var = (pj4.b0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                b0Var.f436505d = aVar2.e(intValue);
                return 0;
            case 2:
                b0Var.f436506e = aVar2.e(intValue);
                return 0;
            case 3:
                b0Var.f436507f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    pj4.o0 o0Var3 = new pj4.o0();
                    if (bArr2 != null && bArr2.length > 0) {
                        o0Var3.mo11468x92b714fd(bArr2);
                    }
                    b0Var.f436508g = o0Var3;
                }
                return 0;
            case 5:
                b0Var.f436509h = aVar2.k(intValue);
                return 0;
            case 6:
                b0Var.f436510i = aVar2.k(intValue);
                return 0;
            case 7:
                b0Var.f436511m = aVar2.k(intValue);
                return 0;
            case 8:
                b0Var.f436512n = aVar2.k(intValue);
                return 0;
            case 9:
                b0Var.f436513o = aVar2.g(intValue);
                return 0;
            case 10:
                b0Var.f436514p = aVar2.k(intValue);
                return 0;
            case 11:
                b0Var.f436515q = aVar2.g(intValue);
                return 0;
            case 12:
                b0Var.f436516r = aVar2.g(intValue);
                return 0;
            case 13:
                b0Var.f436517s = aVar2.k(intValue);
                return 0;
            case 14:
                b0Var.f436518t = aVar2.k(intValue);
                return 0;
            case 15:
                b0Var.f436519u = aVar2.i(intValue);
                return 0;
            case 16:
                b0Var.f436520v = aVar2.g(intValue);
                return 0;
            case 17:
                b0Var.f436521w = aVar2.g(intValue);
                return 0;
            case 18:
                b0Var.f436522x = aVar2.k(intValue);
                return 0;
            case 19:
            case 36:
            default:
                return -1;
            case 20:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    pj4.z zVar5 = new pj4.z();
                    if (bArr3 != null && bArr3.length > 0) {
                        zVar5.mo11468x92b714fd(bArr3);
                    }
                    b0Var.f436523y = zVar5;
                }
                return 0;
            case 21:
                b0Var.f436524z = aVar2.g(intValue);
                return 0;
            case 22:
                b0Var.A = aVar2.g(intValue);
                return 0;
            case 23:
                b0Var.B = aVar2.g(intValue);
                return 0;
            case 24:
                b0Var.C = aVar2.k(intValue);
                return 0;
            case 25:
                b0Var.D = aVar2.k(intValue);
                return 0;
            case 26:
                b0Var.E = aVar2.g(intValue);
                return 0;
            case 27:
                b0Var.F = aVar2.k(intValue);
                return 0;
            case 28:
                b0Var.G = aVar2.k(intValue);
                return 0;
            case 29:
                b0Var.H = aVar2.k(intValue);
                return 0;
            case 30:
                b0Var.I = aVar2.i(intValue);
                return 0;
            case 31:
                b0Var.f436504J = aVar2.k(intValue);
                return 0;
            case 32:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    pj4.z zVar6 = new pj4.z();
                    if (bArr4 != null && bArr4.length > 0) {
                        zVar6.mo11468x92b714fd(bArr4);
                    }
                    b0Var.K = zVar6;
                }
                return 0;
            case 33:
                b0Var.L = aVar2.k(intValue);
                return 0;
            case 34:
                b0Var.M.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 35:
                b0Var.N.add(aVar2.k(intValue));
                return 0;
            case 37:
                b0Var.P = aVar2.i(intValue);
                return 0;
            case 38:
                b0Var.Q = aVar2.k(intValue);
                return 0;
            case 39:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    pj4.m0 m0Var = new pj4.m0();
                    if (bArr5 != null && bArr5.length > 0) {
                        m0Var.mo11468x92b714fd(bArr5);
                    }
                    b0Var.R.add(m0Var);
                }
                return 0;
            case 40:
                b0Var.S = aVar2.i(intValue);
                return 0;
            case 41:
                b0Var.T = aVar2.c(intValue);
                return 0;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Double valueOf = java.lang.Double.valueOf(this.f436505d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "longitude", valueOf, false);
            eVar.d(jSONObject, "latitude", java.lang.Double.valueOf(this.f436506e), false);
            eVar.d(jSONObject, "mediaType", java.lang.Integer.valueOf(this.f436507f), false);
            eVar.d(jSONObject, "topicInfo", this.f436508g, false);
            eVar.d(jSONObject, "mediaUrl", this.f436509h, false);
            eVar.d(jSONObject, "mediaAesKey", this.f436510i, false);
            eVar.d(jSONObject, "mediaThumbUrl", this.f436511m, false);
            eVar.d(jSONObject, "mediaThumbAesKey", this.f436512n, false);
            eVar.d(jSONObject, "visibility", java.lang.Integer.valueOf(this.f436513o), false);
            eVar.d(jSONObject, "description", this.f436514p, false);
            eVar.d(jSONObject, "createTime", java.lang.Integer.valueOf(this.f436515q), false);
            eVar.d(jSONObject, "expireTime", java.lang.Integer.valueOf(this.f436516r), false);
            eVar.d(jSONObject, "poiId", this.f436517s, false);
            eVar.d(jSONObject, "poiName", this.f436518t, false);
            eVar.d(jSONObject, "option", java.lang.Long.valueOf(this.f436519u), false);
            eVar.d(jSONObject, "mediaWidth", java.lang.Integer.valueOf(this.f436520v), false);
            eVar.d(jSONObject, "mediaHeight", java.lang.Integer.valueOf(this.f436521w), false);
            eVar.d(jSONObject, "backgroundId", this.f436522x, false);
            eVar.d(jSONObject, "emojiInfo", this.f436523y, false);
            eVar.d(jSONObject, "modifyTime", java.lang.Integer.valueOf(this.f436524z), false);
            eVar.d(jSONObject, "modifyCount", java.lang.Integer.valueOf(this.A), false);
            eVar.d(jSONObject, "serverCreateTime", java.lang.Integer.valueOf(this.B), false);
            eVar.d(jSONObject, "referenceUsername", this.C, false);
            eVar.d(jSONObject, "referenceTextStatusId", this.D, false);
            eVar.d(jSONObject, "sceneType", java.lang.Integer.valueOf(this.E), false);
            eVar.d(jSONObject, "duplicateUsername", this.F, false);
            eVar.d(jSONObject, "duplicateTextStatusId", this.G, false);
            eVar.d(jSONObject, "brand_key_info", this.H, false);
            eVar.d(jSONObject, "profile_seq", java.lang.Long.valueOf(this.I), false);
            eVar.d(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, this.f436504J, false);
            eVar.d(jSONObject, "emoji", this.K, false);
            eVar.d(jSONObject, "clientMsgId", this.L, false);
            eVar.d(jSONObject, "blackContactLabelIds", this.M, false);
            eVar.d(jSONObject, "blackContactUsernames", this.N, false);
            eVar.d(jSONObject, "enter_scene", java.lang.Long.valueOf(this.P), false);
            eVar.d(jSONObject, "city", this.Q, false);
            eVar.d(jSONObject, "medias", this.R, false);
            eVar.d(jSONObject, "media_duration_ms", java.lang.Long.valueOf(this.S), false);
            eVar.d(jSONObject, "has_hb", java.lang.Boolean.valueOf(this.T), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
