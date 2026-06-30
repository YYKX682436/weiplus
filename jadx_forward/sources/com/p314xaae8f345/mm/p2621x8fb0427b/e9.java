package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public final class e9 {
    public java.lang.String A;
    public java.lang.String B;
    public int C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f275404m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f275405n;

    /* renamed from: o, reason: collision with root package name */
    public int f275406o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f275407p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f275408q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f275410s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f275411t;

    /* renamed from: w, reason: collision with root package name */
    public int f275414w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f275415x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f275416y;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f275392a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f275393b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f275394c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f275395d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f275396e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f275397f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f275398g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f275399h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f275400i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f275401j = "";

    /* renamed from: k, reason: collision with root package name */
    public long f275402k = 0;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f275403l = "";

    /* renamed from: r, reason: collision with root package name */
    public int f275409r = 0;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f275412u = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f275413v = "";

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f275417z = "";

    public static com.p314xaae8f345.mm.p2621x8fb0427b.e9 f(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.e9 e9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.e9();
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msg", null);
        if (d17 != null) {
            try {
                e9Var.f275392a = (java.lang.String) d17.get(".msg.$fromusername");
                e9Var.f275393b = (java.lang.String) d17.get(".msg.$alias");
                e9Var.f275394c = (java.lang.String) d17.get(".msg.$fromnickname");
                e9Var.f275395d = (java.lang.String) d17.get(".msg.$fullpy");
                e9Var.f275396e = (java.lang.String) d17.get(".msg.$shortpy");
                e9Var.f275397f = (java.lang.String) d17.get(".msg.$content");
                e9Var.f275398g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.$imagestatus"), 0);
                e9Var.f275399h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.$scene"), 0);
                e9Var.f275400i = (java.lang.String) d17.get(".msg.$mhash");
                e9Var.f275401j = (java.lang.String) d17.get(".msg.$mfullhash");
                if (d17.get(d17.get(".msg.$qqnum")) != null && ((java.lang.String) d17.get(d17.get(".msg.$qqnum"))).length() > 0) {
                    e9Var.f275402k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".msg.$qqnum"), 0L);
                }
                e9Var.f275403l = (java.lang.String) d17.get(".msg.$qqnickname");
                e9Var.f275407p = (java.lang.String) d17.get(".msg.$sign");
                if (d17.get(".msg.$sex") != null && ((java.lang.String) d17.get(".msg.$sex")).length() > 0) {
                    e9Var.f275406o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.$sex"), 0);
                }
                e9Var.f275404m = (java.lang.String) d17.get(".msg.$city");
                e9Var.f275405n = (java.lang.String) d17.get(".msg.$province");
                e9Var.f275408q = (java.lang.String) d17.get(".msg.$country");
                if (d17.get(".msg.$snsflag") != null) {
                    e9Var.f275409r = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.$snsflag"), 0);
                    e9Var.f275410s = (java.lang.String) d17.get(".msg.$snsbgimgid");
                }
                e9Var.f275411t = (java.lang.String) d17.get(".msg.$ticket");
                java.lang.String str2 = (java.lang.String) d17.get(".msg.$bigheadimgurl");
                if (str2 == null) {
                    str2 = "";
                }
                e9Var.f275412u = str2;
                java.lang.String str3 = (java.lang.String) d17.get(".msg.$smallheadimgurl");
                if (str3 == null) {
                    str3 = "";
                }
                e9Var.f275413v = str3;
                java.lang.String str4 = (java.lang.String) d17.get(".msg.$openimappid");
                if (str4 == null) {
                    str4 = "";
                }
                e9Var.H = str4;
                java.lang.String str5 = (java.lang.String) d17.get(".msg.$openimdescwordingid");
                if (str5 == null) {
                    str5 = "";
                }
                e9Var.I = str5;
                e9Var.f275414w = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.$opcode"), 0);
                java.lang.String str6 = (java.lang.String) d17.get(".msg.$encryptusername");
                if (str6 == null) {
                    str6 = "";
                }
                e9Var.f275415x = str6;
                java.lang.String str7 = (java.lang.String) d17.get(".msg.$googlecontact");
                if (str7 == null) {
                    str7 = "";
                }
                e9Var.f275416y = str7;
                java.lang.String str8 = (java.lang.String) d17.get(".msg.$chatroomusername");
                if (str8 == null) {
                    str8 = "";
                }
                e9Var.f275417z = str8;
                e9Var.A = (java.lang.String) d17.get(".msg.$sourceusername");
                e9Var.B = (java.lang.String) d17.get(".msg.$sourcenickname");
                e9Var.F = (java.lang.String) d17.get(".msg.$sharecardusername");
                e9Var.G = (java.lang.String) d17.get(".msg.$sharecardnickname");
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.Antispam.$isSuspiciousUser"), 0);
                e9Var.C = P;
                if (P == 1) {
                    e9Var.D = (java.lang.String) d17.get(".msg.Antispam.safetyWarning");
                    e9Var.E = (java.lang.String) d17.get(".msg.Antispam.safetyWarningDetail");
                }
                g(d17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgInfo", e17, "", new java.lang.Object[0]);
            }
        }
        return e9Var;
    }

    public static r45.dz3 g(java.util.Map map) {
        try {
            java.lang.String str = (java.lang.String) map.get(".msg.images.image.$url");
            java.lang.String str2 = (java.lang.String) map.get(".msg.images.image.$fileid");
            if (android.text.TextUtils.isEmpty(str) && android.text.TextUtils.isEmpty(str2)) {
                return null;
            }
            java.lang.String str3 = (java.lang.String) map.get(".msg.images.image.$aeskey");
            if (android.text.TextUtils.isEmpty(str3)) {
                return null;
            }
            r45.dz3 dz3Var = new r45.dz3();
            java.util.LinkedList linkedList = dz3Var.f454402e;
            r45.v60 v60Var = new r45.v60();
            v60Var.f469465d = str;
            v60Var.f469466e = str3;
            v60Var.f469468g = str2;
            linkedList.add(v60Var);
            dz3Var.f454401d = linkedList.size();
            return dz3Var;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgInfo", th6, "parseImgInfoList fail", new java.lang.Object[0]);
            return null;
        }
    }

    public java.lang.String a() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f275408q) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f275405n)) ? this.f275404m : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f275404m) ? com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().j(this.f275408q, this.f275405n) : com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().h(this.f275408q, this.f275405n, this.f275404m);
    }

    public java.lang.String b() {
        java.lang.String str = this.f275394c;
        if (str != null && str.length() > 0) {
            return this.f275394c;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.MsgInfo", "username is nullOrNil");
        return this.f275392a;
    }

    public java.lang.String c() {
        return this.f275392a;
    }

    public java.lang.String d() {
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f275408q) ? (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f275405n) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f275404m) || !com.p314xaae8f345.mm.p2621x8fb0427b.ha.r(this.f275408q)) ? com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().i(this.f275408q) : com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().j(this.f275408q, this.f275405n) : this.f275405n;
    }

    public int e() {
        return this.f275399h;
    }
}
