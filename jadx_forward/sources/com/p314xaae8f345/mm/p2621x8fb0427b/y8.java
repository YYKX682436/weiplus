package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes9.dex */
public final class y8 {

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f277903m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f277904n;

    /* renamed from: o, reason: collision with root package name */
    public int f277905o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f277906p;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f277891a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f277892b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f277893c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f277894d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f277895e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f277896f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f277897g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f277898h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f277899i = "";

    /* renamed from: j, reason: collision with root package name */
    public long f277900j = 0;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f277901k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f277902l = "";

    /* renamed from: q, reason: collision with root package name */
    public int f277907q = 0;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f277908r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f277909s = "";

    /* renamed from: t, reason: collision with root package name */
    public int f277910t = 0;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f277911u = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f277912v = "";

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f277913w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f277914x = "";

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f277915y = "";

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f277916z = "";
    public java.lang.String A = "";
    public java.lang.String B = "";
    public java.lang.String C = "";
    public java.lang.String D = "";

    /* JADX WARN: Removed duplicated region for block: B:16:0x026c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p314xaae8f345.mm.p2621x8fb0427b.y8 i(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.y8.i(java.lang.String):com.tencent.mm.storage.y8");
    }

    public static void j(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.y8 y8Var) {
        int i17 = y8Var.f277907q;
        java.util.Set set = c01.e2.f118650a;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(i17)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfo", "parseBizNameCard bizNameCardStr is null");
                y8Var.f277907q = y8Var.f277907q & (-17) & (-513);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfo", "parseBizNameCard bizNameCardStr size %d", java.lang.Integer.valueOf(str.length()));
            r45.kl klVar = new r45.kl();
            try {
                klVar.mo11468x92b714fd(android.util.Base64.decode(str, 2));
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(klVar.f460330d)) {
                    return;
                }
                r45.ll llVar = new r45.ll();
                llVar.mo11468x92b714fd(android.util.Base64.decode(klVar.f460330d, 2));
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(llVar.f461101i)) {
                    y8Var.f277891a = llVar.f461101i;
                }
                int i18 = llVar.f461097e;
                if (i18 > 0) {
                    y8Var.f277907q = i18;
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(llVar.f461096d)) {
                    y8Var.f277892b = llVar.f461096d;
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(llVar.f461098f)) {
                    y8Var.C = llVar.f461098f;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfo", "parseBizNameCard user:[%s] nickname:[%s] verifyflag:[%d] verifyName:[%s]", y8Var.f277891a, y8Var.f277892b, java.lang.Integer.valueOf(y8Var.f277907q), y8Var.C);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgInfo", "parseBizNameCard ex %s", e17.getMessage());
            }
        }
    }

    public int a() {
        return this.f277910t;
    }

    public java.lang.String b() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f277911u)) {
            java.lang.String[] split = this.f277911u.split("_");
            if (split.length > 0) {
                if (split.length > 2) {
                    this.f277903m = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().h(split[0], split[1], split[2]);
                } else if (split.length == 2) {
                    this.f277903m = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().j(split[0], split[1]);
                } else {
                    this.f277903m = "";
                }
            }
        }
        return this.f277903m;
    }

    public java.lang.String c() {
        if (!android.text.TextUtils.isEmpty(this.f277892b)) {
            return this.f277892b;
        }
        if (!android.text.TextUtils.isEmpty(this.f277893c)) {
            return this.f277893c;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.MsgInfo", "username is nullOrNil");
        java.lang.String str = this.f277891a;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str == null ? "" : str;
    }

    public java.lang.String d() {
        return this.f277891a;
    }

    public java.lang.String e() {
        return this.f277916z;
    }

    public java.lang.String f() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f277911u)) {
            java.lang.String[] split = this.f277911u.split("_");
            if (split.length > 0) {
                if (split.length <= 2 || !com.p314xaae8f345.mm.p2621x8fb0427b.ha.r(split[0])) {
                    this.f277904n = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().i(split[0]);
                } else {
                    this.f277904n = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().j(split[0], split[1]);
                }
            }
        }
        return this.f277904n;
    }

    public java.lang.String g() {
        java.lang.String str = this.f277902l;
        if (str != null && str.length() > 0) {
            return this.f277902l;
        }
        java.lang.String str2 = this.f277901k;
        return (str2 == null || str2.length() <= 0) ? java.lang.Long.toString(this.f277900j) : this.f277901k;
    }

    public int h() {
        return this.f277907q;
    }
}
