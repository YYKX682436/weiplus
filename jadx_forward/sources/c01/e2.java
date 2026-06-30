package c01;

/* loaded from: classes11.dex */
public abstract class e2 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f118651b;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f118653d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f118654e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f118655f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f118656g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f118657h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f118658i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f118659j;

    /* renamed from: k, reason: collision with root package name */
    public static final java.lang.String f118660k;

    /* renamed from: l, reason: collision with root package name */
    public static final java.lang.String f118661l;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f118662m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f118663n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f118664o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f118665p;

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f118650a = new c01.d2();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f118652c = new java.util.HashMap();

    static {
        java.lang.String[] strArr = {"@im.chatroom", "@chatroom", "@openim", "@micromsg.qq.com", "@weclaw"};
        f118653d = strArr;
        f118654e = m("rconversation.username", strArr, new java.lang.String[0]);
        f118655f = o("rcontact.usernameFlag", strArr, false, new java.lang.String[0]);
        m("rconversation.username", new java.lang.String[]{"@chatroom", "@micromsg.qq.com"}, new java.lang.String[0]);
        m("rconversation.username", new java.lang.String[]{"@t.qq.com"}, new java.lang.String[0]);
        f118656g = m("rconversation.username", new java.lang.String[]{"@qqim"}, new java.lang.String[0]);
        f118657h = o("rcontact.usernameFlag", new java.lang.String[]{"@qqim"}, false, new java.lang.String[0]);
        m("rconversation.username", new java.lang.String[]{"@chatroom_exclusive"}, new java.lang.String[0]);
        f118658i = m("rconversation.username", new java.lang.String[]{"@micromsg.qq.com"}, new java.lang.String[0]);
        f118659j = o("rcontact.usernameFlag", new java.lang.String[]{"@micromsg.qq.com"}, false, new java.lang.String[0]);
        f118660k = m("rconversation.username", new java.lang.String[]{"@app"}, new java.lang.String[0]);
        f118661l = o("rcontact.usernameFlag", new java.lang.String[]{"@app"}, false, new java.lang.String[0]);
        f118662m = m("rconversation.username", new java.lang.String[]{"@chatroom"}, new java.lang.String[0]);
        f118663n = o("rcontact.usernameFlag", new java.lang.String[]{"@chatroom"}, false, new java.lang.String[0]);
        m("rconversation.username", new java.lang.String[]{"@im.chatroom"}, new java.lang.String[0]);
        f118664o = m("rconversation.username", new java.lang.String[]{"@kefu.openim"}, new java.lang.String[0]);
        f118665p = new java.lang.String[]{"qqmail", "fmessage", "tmessage", "qmessage", "qqsync", "floatbottle", "lbsapp", "shakeapp", "medianote", "qqfriend", "newsapp", "blogapp", "facebookapp", "topstoryapp", "masssendapp", "feedsapp", "voipapp", "cardpackage", "voicevoipapp", "voiceinputapp", "officialaccounts", "linkedinplugin", "notifymessage", "appbrandcustomerservicemsg", "appbrand_notify_message", "opencustomerservicemsg", "conversationboxservice", "service_officialaccounts", "BrandEcsTemplateMsg@fakeuser", "schedule_message"};
    }

    public static java.lang.String A(java.lang.String str) {
        return Y(str) ? str.replace("http://t.qq.com/", "").replace("t.qq.com/", "") : "";
    }

    public static void A0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        iz5.a.g(null, z3Var != null);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
        if (n17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1())) {
            z3Var = n17;
        }
        z3Var.mo43621x7650bebc(z3Var.m124896xfb85f7b0() & (-1048577));
        h0(z3Var);
    }

    public static int B(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        iz5.a.g(null, (str == null ? "" : str).length() > 0);
        java.lang.String lowerCase = str.trim().toLowerCase();
        if (lowerCase.endsWith("@chatroom")) {
            return 3;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.G4(lowerCase)) {
            return 13;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.s4(lowerCase)) {
            return 39;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(lowerCase)) {
            return 3;
        }
        lowerCase.contains("@");
        return 3;
    }

    public static void B0(java.lang.String str, boolean z17, boolean z18) {
        iz5.a.g(null, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str));
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1())) {
            return;
        }
        n17.mo43621x7650bebc(n17.m124896xfb85f7b0() & (-2049));
        if ((com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(str)) && q() != null) {
            ((np.h) q()).getClass();
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(str)) {
                ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new p41.n(str, 2));
            } else {
                ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new p41.x(str, 2));
            }
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.J3(str)) {
            g(false, str);
        }
        g0(n17, z18);
        if (z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().V(str);
        }
    }

    public static int C(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        iz5.a.g(null, (str == null ? "" : str).length() > 0);
        java.lang.String lowerCase = str.trim().toLowerCase();
        if (lowerCase.endsWith("@chatroom")) {
            return 1;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.G4(lowerCase)) {
            return 11;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.s4(lowerCase)) {
            return 36;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(lowerCase);
        return 1;
    }

    public static void C0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        iz5.a.g(null, z3Var != null);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
        if (n17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1())) {
            z3Var = n17;
        }
        z3Var.mo43621x7650bebc(z3Var.m124896xfb85f7b0() & (-131073));
        h0(z3Var);
    }

    public static boolean D(java.lang.String str) {
        for (java.lang.String str2 : f118665p) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public static void D0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        iz5.a.g(null, z3Var != null);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
        if (n17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1())) {
            z3Var = n17;
        }
        z3Var.mo43621x7650bebc(z3Var.m124896xfb85f7b0() & (-262145));
        h0(z3Var);
    }

    public static boolean E(java.lang.String str) {
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(str)) {
            return false;
        }
        java.util.HashMap hashMap = f118652c;
        java.lang.Boolean bool = hashMap.containsKey(str) ? (java.lang.Boolean) hashMap.get(str) : null;
        if (bool == null) {
            bool = java.lang.Boolean.FALSE;
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
            if (z07 != null && (z07.f69084x8729abea & 131072) == 131072) {
                bool = java.lang.Boolean.TRUE;
            }
            hashMap.put(str, bool);
        }
        return bool.booleanValue();
    }

    public static void E0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        iz5.a.g(null, z3Var != null);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
        if (n17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1())) {
            z3Var = n17;
        }
        z3Var.mo43621x7650bebc(z3Var.m124896xfb85f7b0() & (-524289));
        g0(z3Var, true);
    }

    public static boolean F(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07;
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(str) || (z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str)) == null) {
            return false;
        }
        int i17 = z07.f69084x8729abea;
        return (i17 & 131072) != 131072 && (i17 & 65536) == 65536;
    }

    public static void F0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        iz5.a.g(null, z3Var != null);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
        if (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1())) {
            n17 = z3Var;
        }
        n17.r3();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1()) && q() != null) {
            c01.h8 q17 = q();
            java.lang.String d17 = z3Var.d1();
            ((np.h) q17).getClass();
            new op.c(true).a(new p41.w(d17, 2));
        }
        g0(n17, true);
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(z3Var.d1());
        if (p17 == null || !"@blacklist".equals(p17.W0())) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().P(new java.lang.String[]{p17.h1()}, "");
    }

    public static boolean G(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true)) == null) {
            return false;
        }
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(n17.f1());
    }

    public static void G0(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true)) == null) {
            return;
        }
        n17.j3(0);
        n17.mo43621x7650bebc(0);
        n17.W1(0L);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(str, n17);
    }

    public static boolean H(int i17) {
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(i17);
    }

    public static boolean I(java.lang.String str) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true).T == 1;
    }

    public static boolean J(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return true;
        }
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true).r2();
    }

    public static boolean K(java.lang.String str) {
        return "downloaderapp".equals(str);
    }

    public static boolean L(java.lang.String str) {
        return "1@fackuser".equals(str);
    }

    public static boolean M(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17;
        return str != null && str.length() > 0 && com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) && (n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true)) != null && n17.r2();
    }

    public static boolean N(java.lang.String str) {
        return "gh_579db1f2cf89".equals(str);
    }

    public static boolean O(java.lang.String str) {
        return "msginfo@fakeuser".equals(str);
    }

    public static boolean P(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        if (z3Var == null) {
            return false;
        }
        return (z3Var.m2() && !d(z3Var.d1()) && c01.z1.v()) ? (z3Var.m124896xfb85f7b0() & Integer.MIN_VALUE) == 0 : (z3Var.m124896xfb85f7b0() & 512) != 0;
    }

    public static boolean Q(java.lang.String str) {
        return P(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true));
    }

    public static boolean R(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return str.endsWith("@im.chatroom") || E(str);
    }

    public static boolean S(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorageLogic", "union luckymoney logic：isOpenImIncludeAssociateRoomOrOpenIMUser :(username == null) || (username.length() <= 0) ");
            return false;
        }
        boolean z17 = R(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorageLogic", "union luckymoney logic：isOpenImIncludeAssociateRoomOrOpenIMUser :%s ", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public static boolean T(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
        if (z07 == null) {
            return false;
        }
        return z07.L0(c01.z1.r());
    }

    public static boolean U(java.lang.String str) {
        return D(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.s4(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.G4(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(str);
    }

    public static boolean V(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
        if (z07 == null) {
            return false;
        }
        return z07.P0();
    }

    public static boolean W(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return i().contains(str);
    }

    public static boolean X(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var) {
        boolean k47 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.k4(l4Var.h1());
        if (!k47) {
            k47 = l4Var.d2(2097152);
        }
        if (!k47) {
            k47 = l4Var.d2(8388608);
        }
        if (!k47) {
            k47 = l4Var.d2(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb);
        }
        if (!k47) {
            k47 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.C3(l4Var.h1());
        }
        return !k47 ? com.p314xaae8f345.mm.p2621x8fb0427b.z3.o4(l4Var.h1()) : k47;
    }

    public static boolean Y(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return str.startsWith("t.qq.com/") || str.startsWith("http://t.qq.com/");
    }

    public static boolean Z(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07;
        ((vg3.h4) i95.n0.c(vg3.h4.class)).getClass();
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(str) && (z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str)) != null && z07.P0();
    }

    public static java.lang.String a(boolean z17, int i17) {
        switch (i17) {
            case 1:
                return z17 ? f118655f : f118654e;
            case 2:
                return z17 ? f118657h : f118656g;
            case 3:
                return z17 ? f118659j : f118658i;
            case 4:
                return z17 ? f118661l : f118660k;
            case 5:
                return z17 ? f118663n : f118662m;
            case 6:
                return f118664o;
            default:
                return "";
        }
    }

    public static boolean a0() {
        boolean equalsIgnoreCase;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            equalsIgnoreCase = "CN".equalsIgnoreCase(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("wechat_reg_country").u("reg_country", "CN"));
        } else {
            if (!gm0.j1.a()) {
                return false;
            }
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(274436, null);
            if (android.text.TextUtils.isEmpty(str)) {
                return false;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("wechat_reg_country").D("reg_country", str);
            equalsIgnoreCase = "CN".equalsIgnoreCase(str);
        }
        return !equalsIgnoreCase;
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2, boolean z17, java.lang.String... strArr) {
        if (com.p314xaae8f345.mm.p670x38b72420.d.f146388g.a()) {
            return o("usernameFlag", new java.lang.String[]{str2}, z17, strArr);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(512);
        sb6.append(" and ( ");
        if ("@all.android".equals(str2)) {
            sb6.append(" 1 = 1");
        } else if ("@micromsg.qq.com".equals(str2)) {
            sb6.append(" ");
            sb6.append(str);
            sb6.append(" not like '%@%'");
        } else if ("@chatroom".equals(str2)) {
            sb6.append(" ");
            sb6.append(str);
            sb6.append(" like '%@chatroom'");
        } else if ("@talkroom".equals(str2)) {
            sb6.append(" ");
            sb6.append(str);
            sb6.append(" like '%@talkroom'");
        } else if ("@t.qq.com".equals(str2)) {
            sb6.append(" ");
            sb6.append(str);
            sb6.append(" like '%@t.qq.com'");
        } else if ("@qqim".equals(str2)) {
            sb6.append(" ");
            sb6.append(str);
            sb6.append(" like '%@qqim'");
        } else if ("@chatroom_exclusive".equals(str2)) {
            sb6.append(" ");
            sb6.append(str);
            sb6.append("not like %@chatroom");
        } else if ("@app".equals(str2)) {
            sb6.append(" ");
            sb6.append(str);
            sb6.append(" like '%@app'");
        } else if ("@openim".equals(str2)) {
            sb6.append(" ");
            sb6.append(str);
            sb6.append(" like '%@openim'");
        } else if ("@im.chatroom".equals(str2)) {
            sb6.append(" ");
            sb6.append(str);
            sb6.append(" like '%@im.chatroom'");
        } else if ("@weclaw".equals(str2)) {
            sb6.append(" ");
            sb6.append(str);
            sb6.append(" like '%@weclaw'");
        }
        sb6.append(r(strArr));
        return sb6.toString();
    }

    public static boolean b0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        return (z3Var.i1() & 1) != 0;
    }

    public static java.lang.String c(java.lang.String str, java.lang.String[] strArr, java.lang.String... strArr2) {
        return com.p314xaae8f345.mm.p670x38b72420.d.f146388g.a() ? o("usernameFlag", strArr, false, strArr2) : m(str, strArr, strArr2);
    }

    public static boolean c0(java.lang.String str) {
        return str.equals("weixinsrc") || str.equalsIgnoreCase("gh_6e99ff560306");
    }

    public static boolean d(java.lang.String str) {
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("BizServiceMuteWhitelist");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            java.lang.String[] split = d17.split(",");
            if (split.length > 0) {
                for (java.lang.String str2 : split) {
                    if (str2.equals(str)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return h().contains(str);
    }

    public static void d0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        iz5.a.g(null, z3Var != null);
        iz5.a.g(null, ((int) z3Var.E2) != 0);
        iz5.a.g(null, z3Var.d1().length() > 0);
        z3Var.N2();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(z3Var.d1(), z3Var);
        g0(z3Var, true);
    }

    public static boolean e(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var) {
        java.lang.String h17 = l4Var.h1();
        if (D(h17)) {
            if (!(h17.equalsIgnoreCase("newsapp") || h17.equalsIgnoreCase("qqmail") || h17.equalsIgnoreCase("schedule_message"))) {
                return false;
            }
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.l4(h17) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.k4(h17) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.b4(h17) || l4Var.w0() == -1) {
            return false;
        }
        if (G(h17)) {
            return true;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3.X3(h17);
        return true;
    }

    public static void e0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        iz5.a.g(null, z3Var != null);
        iz5.a.g(null, ((int) z3Var.E2) != 0);
        iz5.a.g(null, z3Var.d1().length() > 0);
        z3Var.mo43621x7650bebc(z3Var.m124896xfb85f7b0() | 32768);
        g0(z3Var, true);
    }

    public static void f(boolean z17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorageLogic", "doBypSetMute isSet:%s, username:%s", java.lang.Boolean.valueOf(z17), str);
        r45.g26 g26Var = new r45.g26();
        g26Var.set(0, str);
        g26Var.set(1, java.lang.Integer.valueOf(z17 ? 1 : 0));
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.a(24, 5, g26Var));
    }

    public static void f0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        g0(z3Var, true);
    }

    public static void g(boolean z17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorageLogic", "doBypSetTop isSet:%s, username:%s", java.lang.Boolean.valueOf(z17), str);
        r45.z26 z26Var = new r45.z26();
        z26Var.set(0, str);
        z26Var.set(1, java.lang.Integer.valueOf(z17 ? 1 : 0));
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.a(24, 4, z26Var));
    }

    public static void g0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17) {
        h0(z3Var);
        if (!z17 || com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(z3Var.d1()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.J3(z3Var.d1())) {
            return;
        }
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(2, n(z3Var)));
    }

    public static java.util.HashSet h() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("qqmail");
        hashSet.add("qmessage");
        hashSet.add("tmessage");
        hashSet.add("floatbottle");
        hashSet.add("facebookapp");
        hashSet.add("qqfriend");
        hashSet.add("newsapp");
        hashSet.add("feedsapp");
        hashSet.add("masssendapp");
        hashSet.add("blogapp");
        hashSet.add("voipapp");
        hashSet.add("voicevoipapp");
        hashSet.add("voiceinputapp");
        hashSet.add("googlecontact");
        hashSet.add("fmessage");
        hashSet.add("medianote");
        hashSet.add("qqsync");
        hashSet.add("lbsapp");
        hashSet.add("shakeapp");
        hashSet.add("linkedinplugin");
        hashSet.add("gh_43f2581f6fd6");
        hashSet.add("schedule_message");
        hashSet.add("gh_3dfda90e39d6");
        hashSet.add("gh_f0a92aa7146c");
        hashSet.add("gh_579db1f2cf89");
        hashSet.add("gh_b4af18eac3d5");
        hashSet.add("gh_e087bb5b95e6");
        hashSet.add("weixin");
        hashSet.add("gh_25d9ac85a4bc");
        hashSet.add("gh_051d9102de63");
        return hashSet;
    }

    public static void h0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        iz5.a.g(null, z3Var != null);
        if (((int) z3Var.E2) == 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().i0(z3Var);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().m(z3Var.d1());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(z3Var.d1(), z3Var);
    }

    public static java.util.HashSet i() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("officialaccounts");
        hashSet.add("newsapp");
        for (java.lang.String str : f118665p) {
            hashSet.add(str);
        }
        hashSet.add("weibo");
        hashSet.add("qqmail");
        hashSet.add("fmessage");
        hashSet.add("tmessage");
        hashSet.add("floatbottle");
        hashSet.add("lbsapp");
        hashSet.add("shakeapp");
        hashSet.add("medianote");
        hashSet.add("qqfriend");
        hashSet.add("readerapp");
        hashSet.add("newsapp");
        hashSet.add("blogapp");
        hashSet.add("facebookapp");
        hashSet.add("masssendapp");
        hashSet.add("meishiapp");
        hashSet.add("feedsapp");
        hashSet.add("voipapp");
        hashSet.add("filehelper");
        hashSet.add("officialaccounts");
        hashSet.add("service_officialaccounts");
        hashSet.add("BrandEcsTemplateMsg@fakeuser");
        hashSet.add("helper_entry");
        hashSet.add("pc_share");
        hashSet.add("cardpackage");
        hashSet.add("voicevoipapp");
        hashSet.add("voiceinputapp");
        hashSet.add("linkedinplugin");
        hashSet.add("appbrandcustomerservicemsg");
        hashSet.add("conversationboxservice");
        hashSet.add("message_fold");
        return hashSet;
    }

    public static void i0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17) {
        iz5.a.g(null, z3Var != null);
        if (((int) z3Var.E2) == 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().i0(z3Var);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().m(z3Var.d1());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(z3Var.d1(), z3Var);
        if (z17) {
            r45.yo4 yo4Var = new r45.yo4();
            yo4Var.f472792d = z3Var.d1();
            if (z3Var.x2()) {
                yo4Var.f472793e = 1;
            } else {
                yo4Var.f472793e = 2;
            }
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(52, yo4Var));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x001b, code lost:
    
        if (r1.moveToFirst() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x001d, code lost:
    
        r2 = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        r2.mo9015xbf5d97fd(r1);
        r0.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (r1.moveToNext() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List j() {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<vg3.x3> r1 = vg3.x3.class
            lm0.a r1 = gm0.j1.s(r1)
            vg3.x3 r1 = (vg3.x3) r1
            com.tencent.mm.plugin.messenger.foundation.h2 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) r1
            com.tencent.mm.storage.k4 r1 = r1.Bi()
            android.database.Cursor r1 = r1.r()
            boolean r2 = r1.moveToFirst()
            if (r2 == 0) goto L2e
        L1d:
            com.tencent.mm.storage.z3 r2 = new com.tencent.mm.storage.z3
            r2.<init>()
            r2.mo9015xbf5d97fd(r1)
            r0.add(r2)
            boolean r2 = r1.moveToNext()
            if (r2 != 0) goto L1d
        L2e:
            r1.close()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c01.e2.j():java.util.List");
    }

    public static void j0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        iz5.a.g(null, z3Var != null);
        if (((int) z3Var.E2) == 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().i0(z3Var);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().m(z3Var.d1());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(z3Var.d1(), z3Var);
        r45.zo4 zo4Var = new r45.zo4();
        zo4Var.f473784d = z3Var.d1();
        if (z3Var.y2()) {
            zo4Var.f473785e = 1;
        } else {
            zo4Var.f473785e = 2;
        }
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(72, zo4Var));
    }

    public static int k() {
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        Bi.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        l75.e0 e0Var = com.p314xaae8f345.mm.p670x38b72420.s.G2;
        android.database.Cursor f17 = Bi.f276604d.f("select count(1) from (select verifyFlag from rcontact where type & 1 !=0 and type & 32 =0 and type & 8 =0  )", null, 2);
        int i17 = 0;
        if (f17 != null && f17.moveToFirst()) {
            i17 = f17.getInt(0);
            f17.close();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorage", "getNormalContactAndHelperCount, sql:%s, result:%d, time:%d", "select count(1) from (select verifyFlag from rcontact where type & 1 !=0 and type & 32 =0 and type & 8 =0  )", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return i17;
    }

    public static void k0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        iz5.a.g(null, z3Var != null);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
        if (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1())) {
            n17 = z3Var;
        }
        n17.E2();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1()) && q() != null) {
            c01.h8 q17 = q();
            java.lang.String d17 = z3Var.d1();
            ((np.h) q17).getClass();
            new op.c(true).a(new p41.w(d17, 1));
        }
        g0(n17, true);
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.z3 l(java.lang.String str) {
        return f118651b ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e0(str) : ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
    }

    public static void l0(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1())) {
            return;
        }
        if (z17) {
            n17.mo43621x7650bebc(n17.m124896xfb85f7b0() | 256);
        } else {
            n17.mo43621x7650bebc(n17.m124896xfb85f7b0() & (-257));
        }
        i0(n17, true);
    }

    public static java.lang.String m(java.lang.String str, java.lang.String[] strArr, java.lang.String... strArr2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(512);
        sb6.append(" and ( 1 != 1 ");
        for (java.lang.String str2 : strArr) {
            if ("@all.android".equals(str2)) {
                sb6.append(" or 1 = 1");
            } else if ("@micromsg.qq.com".equals(str2)) {
                sb6.append(" or ");
                sb6.append(str);
                sb6.append(" not like '%@%'");
            } else if ("@chatroom".equals(str2)) {
                sb6.append(" or ");
                sb6.append(str);
                sb6.append(" like '%@chatroom'");
            } else if ("@talkroom".equals(str2)) {
                sb6.append(" or ");
                sb6.append(str);
                sb6.append(" like '%@talkroom'");
            } else if ("@t.qq.com".equals(str2)) {
                sb6.append(" or ");
                sb6.append(str);
                sb6.append(" like '%@t.qq.com'");
            } else if ("@qqim".equals(str2)) {
                sb6.append(" or ");
                sb6.append(str);
                sb6.append(" like '%@qqim'");
            } else if ("@chatroom_exclusive".equals(str2)) {
                sb6.append(" or ");
                sb6.append(str);
                sb6.append("not like %@chatroom");
            } else if ("@app".equals(str2)) {
                sb6.append(" or ");
                sb6.append(str);
                sb6.append(" like '%@app'");
            } else if ("@openim".equals(str2)) {
                sb6.append(" or ");
                sb6.append(str);
                sb6.append(" like '%@openim'");
            } else if ("@im.chatroom".equals(str2)) {
                sb6.append(" or ");
                sb6.append(str);
                sb6.append(" like '%@im.chatroom'");
            } else if ("@kefu.openim".equalsIgnoreCase(str2)) {
                sb6.append(" or ");
                sb6.append(str);
                sb6.append(" like '%@kefu.openim'");
            } else if ("@weclaw".equals(str2)) {
                sb6.append(" or ");
                sb6.append(str);
                sb6.append(" like '%@weclaw'");
            }
        }
        sb6.append(r(strArr2));
        return sb6.toString();
    }

    public static void m0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        iz5.a.g("MicroMsg.ContactStorageLogic: user is null", z3Var != null);
        iz5.a.g("MicroMsg.ContactStorageLogic: contactId == 0", ((int) z3Var.E2) != 0);
        iz5.a.g("MicroMsg.ContactStorageLogic: username length <= 0", z3Var.d1().length() > 0);
        z3Var.N2();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(z3Var.d1(), z3Var);
    }

    public static r45.tn4 n(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorageLogic", "oplog modContact user:%s remark:%s BitVal:%d BitValue2:%s isInConvBox:%s isTop:%s isMute:%s", z3Var.d1(), z3Var.w0(), java.lang.Integer.valueOf(z3Var.m124896xfb85f7b0()), java.lang.Long.valueOf(z3Var.c1()), java.lang.Boolean.valueOf(z3Var.v2()), java.lang.Boolean.valueOf(z3Var.w2()), java.lang.Boolean.valueOf(P(z3Var)));
        r45.tn4 tn4Var = new r45.tn4();
        r45.du5 du5Var = new r45.du5();
        java.lang.String d17 = z3Var.d1();
        if (d17 == null) {
            d17 = "";
        }
        du5Var.f454289d = d17;
        du5Var.f454290e = true;
        tn4Var.f468122d = du5Var;
        r45.du5 du5Var2 = new r45.du5();
        java.lang.String P0 = z3Var.P0();
        if (P0 == null) {
            P0 = "";
        }
        du5Var2.f454289d = P0;
        du5Var2.f454290e = true;
        tn4Var.f468123e = du5Var2;
        r45.du5 du5Var3 = new r45.du5();
        java.lang.String T0 = z3Var.T0();
        if (T0 == null) {
            T0 = "";
        }
        du5Var3.f454289d = T0;
        du5Var3.f454290e = true;
        tn4Var.f468124f = du5Var3;
        r45.du5 du5Var4 = new r45.du5();
        java.lang.String U0 = z3Var.U0();
        if (U0 == null) {
            U0 = "";
        }
        du5Var4.f454289d = U0;
        du5Var4.f454290e = true;
        tn4Var.f468125g = du5Var4;
        tn4Var.f468126h = z3Var.I;
        tn4Var.f468129m = -90206337;
        tn4Var.f468130n = z3Var.m124896xfb85f7b0();
        tn4Var.U1 = 145L;
        tn4Var.V1 = z3Var.c1();
        r45.du5 du5Var5 = new r45.du5();
        java.lang.String w07 = z3Var.w0();
        if (w07 == null) {
            w07 = "";
        }
        du5Var5.f454289d = w07;
        du5Var5.f454290e = true;
        tn4Var.f468132p = du5Var5;
        r45.du5 du5Var6 = new r45.du5();
        java.lang.String z07 = z3Var.z0();
        if (z07 == null) {
            z07 = "";
        }
        du5Var6.f454289d = z07;
        du5Var6.f454290e = true;
        tn4Var.f468135q = du5Var6;
        r45.du5 du5Var7 = new r45.du5();
        java.lang.String y07 = z3Var.y0();
        if (y07 == null) {
            y07 = "";
        }
        du5Var7.f454289d = y07;
        du5Var7.f454290e = true;
        tn4Var.f468136r = du5Var7;
        tn4Var.f468137s = z3Var.Q;
        r45.du5 du5Var8 = new r45.du5();
        java.lang.String I0 = z3Var.I0();
        if (I0 == null) {
            I0 = "";
        }
        du5Var8.f454289d = I0;
        du5Var8.f454290e = true;
        tn4Var.f468140v = du5Var8;
        tn4Var.f468141w = z3Var.T;
        tn4Var.B = z3Var.U;
        java.lang.String str = z3Var.V;
        if (str == null) {
            str = "";
        }
        tn4Var.A = str;
        tn4Var.f468148z = z3Var.v3();
        tn4Var.f468145y = z3Var.x3();
        java.lang.String str2 = z3Var.f318118x0;
        tn4Var.H = str2 != null ? str2 : "";
        tn4Var.M = z3Var.i1();
        tn4Var.f468131o = 0;
        tn4Var.f468127i = new r45.cu5();
        tn4Var.S = z3Var.w3();
        tn4Var.U1 = 145L;
        tn4Var.V1 = z3Var.c1();
        return tn4Var;
    }

    public static void n0(java.lang.String str) {
        boolean z17;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str);
        if (p17 == null) {
            p17 = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
            p17.f2();
            p17.b2(str);
            z17 = true;
        } else {
            z17 = false;
        }
        p17.n1(java.lang.System.currentTimeMillis());
        if (z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(p17);
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(p17, str);
        }
    }

    public static java.lang.String o(java.lang.String str, java.lang.String[] strArr, boolean z17, java.lang.String... strArr2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(1024);
        if (z17) {
            sb6.append(" and ( ");
            sb6.append(str);
            sb6.append(" not in ( ");
        } else {
            sb6.append(" and ( ");
            sb6.append(str);
            sb6.append(" in ( ");
        }
        int length = strArr.length;
        int i17 = 0;
        for (java.lang.String str2 : strArr) {
            if (i17 > 0 && i17 < length) {
                sb6.append(" , ");
            }
            if ("@all.android".equals(str2)) {
                sb6.append("1 = 1");
            } else if ("@micromsg.qq.com".equals(str2)) {
                sb6.append("0");
            } else if ("@chatroom".equals(str2)) {
                sb6.append(2L);
            } else if ("@talkroom".equals(str2)) {
                sb6.append(16L);
            } else if ("@t.qq.com".equals(str2)) {
                sb6.append(256L);
            } else if ("@qqim".equals(str2)) {
                sb6.append(1024L);
            } else if ("@app".equals(str2)) {
                sb6.append(32768L);
            } else if ("@openim".equals(str2)) {
                sb6.append(65536L);
            } else if ("@im.chatroom".equals(str2)) {
                sb6.append(4L);
            } else if ("@weclaw".equals(str2)) {
                sb6.append(268435456L);
            }
            i17++;
        }
        sb6.append(" ) ");
        sb6.append(r(strArr2));
        return sb6.toString();
    }

    public static void o0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        iz5.a.g(null, z3Var != null);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
        if (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1())) {
            n17 = z3Var;
        }
        n17.mo43621x7650bebc(n17.m124896xfb85f7b0() | 64);
        n17.T1(z3Var.c2());
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1()) && q() != null) {
            c01.h8 q17 = q();
            java.lang.String d17 = z3Var.d1();
            ((np.h) q17).getClass();
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new p41.v(d17, 1));
        }
        g0(n17, true);
    }

    public static int p() {
        int O = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().O(false, f118665p, c01.z1.r(), "weixin", "helper_entry", "filehelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorageLogic", "getNormalContactCnt: count:%s", java.lang.Integer.valueOf(O));
        return O;
    }

    public static void p0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17) {
        iz5.a.g(null, z3Var != null);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
        if (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1())) {
            n17 = z3Var;
        }
        if (n17.m2() && c01.z1.v() && !d(n17.d1())) {
            n17.mo43621x7650bebc(n17.m124896xfb85f7b0() & Integer.MAX_VALUE);
        } else {
            n17.mo43621x7650bebc(n17.m124896xfb85f7b0() | 512);
        }
        if ((com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(z3Var.d1())) && q() != null) {
            c01.h8 q17 = q();
            java.lang.String d17 = z3Var.d1();
            ((np.h) q17).getClass();
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(d17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenImOpLogLogic", "OpenImOpLogLogic OpenIMModContactMuteOplog username:%s switch add", d17);
                ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new p41.q(d17, 1));
            } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(d17)) {
                ((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).getClass();
                if (!(d17 == null || d17.length() == 0) && com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(d17)) {
                    k41.h1 h1Var = k41.h1.f385540d;
                    k41.g0 c17 = k41.o0.c(d17);
                    if (c17 != null && c17.f385530x1 != 0) {
                        java.lang.String str = c17.f68613xdec927b;
                        if (!(str == null || str.length() == 0)) {
                            c17.f68612x2262335f |= 512;
                            k41.o0.f(c17);
                            ((p41.h) ((j41.v) i95.n0.c(j41.v.class))).getClass();
                            if (!(d17 == null || d17.length() == 0)) {
                                ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new p41.f(d17, 1));
                            }
                        }
                    }
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    objArr[0] = d17;
                    objArr[1] = c17 != null ? java.lang.Long.valueOf(c17.f385530x1) : null;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMKefuService", "setMute contact invalid username: %s, contactId: %s", objArr);
                }
            }
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.J3(z3Var.d1())) {
            f(true, z3Var.d1());
        }
        g0(n17, z17);
    }

    public static c01.h8 q() {
        return (c01.h8) i95.n0.c(c01.h8.class);
    }

    public static void q0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
        iz5.a.g(null, (n17 == null || str == null) ? false : true);
        n17.n1(str);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1()) && q() != null) {
            c01.h8 q17 = q();
            java.lang.String d17 = z3Var.d1();
            ((np.h) q17).getClass();
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new p41.t(d17, str));
        }
        g0(n17, true);
    }

    public static java.lang.String r(java.lang.String... strArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(strArr != null ? (strArr.length + 1) << 4 : 8);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(strArr)) {
            for (java.lang.String str : strArr) {
                sb6.append(str);
            }
        }
        sb6.append(" ) ");
        return sb6.toString();
    }

    public static void r0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        x0(z3Var, true, true);
    }

    public static java.lang.String s() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("wechat_reg_country").u("reg_country", "CN");
        }
        if (!gm0.j1.a()) {
            return "CN";
        }
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(274436, null);
        if (android.text.TextUtils.isEmpty(str)) {
            return "CN";
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("wechat_reg_country").D("reg_country", str);
        return str;
    }

    public static void s0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        iz5.a.g(null, z3Var != null);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
        if (n17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1())) {
            z3Var = n17;
        }
        z3Var.mo43621x7650bebc(z3Var.m124896xfb85f7b0() | 1048576);
        h0(z3Var);
    }

    public static java.lang.String t(com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, java.lang.String str, boolean z17) {
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        java.lang.String z07 = (!z17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.w0())) ? a3Var != null ? a3Var.z0(n17.d1()) : null : n17.w0();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07)) {
            z07 = n17.f2();
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07) ? n17.d1() : z07;
    }

    public static void t0(java.lang.String str, boolean z17, boolean z18) {
        iz5.a.g(null, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str));
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1())) {
            return;
        }
        n17.mo43621x7650bebc(n17.m124896xfb85f7b0() | 2048);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(n17.d1())) {
            n17.k3(false);
        } else {
            n17.W1(n17.c1() & (-129));
            n17.k3(false);
        }
        if ((com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(str)) && q() != null) {
            ((np.h) q()).getClass();
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(str)) {
                ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new p41.n(str, 1));
            } else {
                ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new p41.x(str, 1));
            }
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.J3(str)) {
            g(true, str);
        }
        g0(n17, z18);
        if (z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().S(str);
        }
    }

    public static java.lang.String u(java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.String z07;
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        if (!z17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.w0())) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z08 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
            z07 = z08 != null ? z08.z0(n17.d1()) : null;
        } else {
            z07 = n17.w0();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07)) {
            z07 = n17.w0();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07)) {
            z07 = n17.f2();
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07) ? n17.d1() : z07;
    }

    public static void u0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        iz5.a.g(null, z3Var != null);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
        if (n17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1())) {
            z3Var = n17;
        }
        z3Var.mo43621x7650bebc(z3Var.m124896xfb85f7b0() | 131072);
        h0(z3Var);
    }

    public static int[] v(java.util.List list) {
        int[] iArr;
        java.lang.System.currentTimeMillis();
        int[] Y = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().Y(list);
        java.lang.System.currentTimeMillis();
        if (Y.length <= 0) {
            return null;
        }
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        Bi.getClass();
        java.lang.System.currentTimeMillis();
        android.database.Cursor f17 = Bi.f276604d.f(("select count(*) from rcontact where " + Bi.P(list)) + " group by showHead", null, 2);
        java.lang.System.currentTimeMillis();
        java.lang.System.currentTimeMillis();
        int count = f17.getCount();
        java.lang.System.currentTimeMillis();
        int i17 = 0;
        if (count > 0) {
            iArr = new int[count];
            for (int i18 = 0; i18 < count; i18++) {
                f17.moveToPosition(i18);
                iArr[i18] = f17.getInt(0);
            }
        } else {
            iArr = null;
        }
        f17.close();
        java.lang.System.currentTimeMillis();
        if (iArr == null) {
            return null;
        }
        iz5.a.g(null, Y.length == iArr.length);
        int[] iArr2 = new int[iArr.length];
        int i19 = 0;
        int i27 = 0;
        while (i17 < Y.length) {
            iArr2[i19] = i27;
            i27 += iArr[i17];
            i17++;
            i19++;
        }
        return iArr2;
    }

    public static void v0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        iz5.a.g(null, z3Var != null);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
        if (n17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1())) {
            z3Var = n17;
        }
        z3Var.mo43621x7650bebc(z3Var.m124896xfb85f7b0() | 262144);
        h0(z3Var);
    }

    public static int[] w(java.lang.String[] strArr, java.lang.String str, java.lang.String str2, java.util.List list, java.lang.String str3) {
        int[] iArr;
        java.lang.System.currentTimeMillis();
        int[] Z = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().Z(strArr, str, str2, str3, list);
        java.lang.System.currentTimeMillis();
        if (Z.length <= 0) {
            return null;
        }
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        Bi.getClass();
        java.lang.System.currentTimeMillis();
        android.database.Cursor B = Bi.f276604d.B(("select count(*) from rcontact " + Bi.I(str, str2, list) + Bi.c0(strArr) + Bi.T(str3)) + " group by showHead", null);
        java.lang.System.currentTimeMillis();
        java.lang.System.currentTimeMillis();
        int count = B.getCount();
        java.lang.System.currentTimeMillis();
        int i17 = 0;
        if (count > 0) {
            iArr = new int[count];
            for (int i18 = 0; i18 < count; i18++) {
                B.moveToPosition(i18);
                iArr[i18] = B.getInt(0);
            }
        } else {
            iArr = null;
        }
        B.close();
        java.lang.System.currentTimeMillis();
        if (iArr == null) {
            return null;
        }
        if (Z.length != iArr.length) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactStorageLogic", "[%s:%s] filterType:%s filterSearchStr:%s blocklist:%s searchString:%s", java.lang.Integer.valueOf(Z.length), java.lang.Integer.valueOf(iArr.length), str, str2, list, str3);
            return null;
        }
        int[] iArr2 = new int[iArr.length];
        int i19 = 0;
        int i27 = 0;
        while (i17 < Z.length) {
            iArr2[i19] = i27;
            i27 += iArr[i17];
            i17++;
            i19++;
        }
        return iArr2;
    }

    public static void w0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        iz5.a.g(null, z3Var != null);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
        if (n17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1())) {
            z3Var = n17;
        }
        z3Var.mo43621x7650bebc(z3Var.m124896xfb85f7b0() | 524288);
        g0(z3Var, true);
    }

    public static java.lang.String[] x(java.util.List list) {
        int i17;
        java.lang.System.currentTimeMillis();
        int[] Y = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().Y(list);
        java.lang.System.currentTimeMillis();
        if (Y.length <= 0) {
            return null;
        }
        java.lang.String[] strArr = new java.lang.String[Y.length];
        int i18 = 0;
        for (int i19 : Y) {
            char c17 = (char) i19;
            if (c17 == '{') {
                i17 = i18 + 1;
                strArr[i18] = "#";
            } else if (c17 == ' ') {
                i17 = i18 + 1;
                strArr[i18] = "$";
            } else {
                strArr[i18] = "" + c17;
                i18++;
            }
            i18 = i17;
        }
        return strArr;
    }

    public static void x0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, boolean z18) {
        iz5.a.d(null, z3Var);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
        if (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1())) {
            n17 = z3Var;
        }
        if (z17) {
            n17.mo43621x7650bebc(n17.m124896xfb85f7b0() | 256);
        } else {
            n17.mo43621x7650bebc(n17.m124896xfb85f7b0() & (-257));
        }
        n17.T1(z3Var.c2());
        i0(n17, z18);
    }

    public static java.lang.String[] y(java.lang.String[] strArr, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list) {
        int i17;
        java.lang.System.currentTimeMillis();
        int[] Z = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().Z(strArr, str, str2, str3, list);
        java.lang.System.currentTimeMillis();
        if (Z.length <= 0) {
            return null;
        }
        java.lang.String[] strArr2 = new java.lang.String[Z.length];
        int i18 = 0;
        for (int i19 : Z) {
            char c17 = (char) i19;
            if (c17 == '{') {
                i17 = i18 + 1;
                strArr2[i18] = "#";
            } else if (c17 == ' ') {
                i17 = i18 + 1;
                strArr2[i18] = "$";
            } else {
                strArr2[i18] = "" + c17;
                i18++;
            }
            i18 = i17;
        }
        return strArr2;
    }

    public static void y0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        iz5.a.g(null, z3Var != null);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
        if (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1())) {
            n17 = z3Var;
        }
        n17.mo43621x7650bebc(n17.m124896xfb85f7b0() & (-65));
        n17.T1(z3Var.c2());
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1()) && q() != null) {
            c01.h8 q17 = q();
            java.lang.String d17 = z3Var.d1();
            ((np.h) q17).getClass();
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new p41.v(d17, 2));
        }
        g0(n17, true);
    }

    public static java.util.List z() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        android.database.Cursor J2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().J(256, false);
        if (J2.getCount() == 0) {
            J2.close();
            return linkedList;
        }
        J2.moveToFirst();
        do {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
            z3Var.mo9015xbf5d97fd(J2);
            linkedList.add(z3Var.d1());
        } while (J2.moveToNext());
        J2.close();
        linkedList.size();
        return linkedList;
    }

    public static void z0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17) {
        boolean z18 = true;
        iz5.a.g(null, z3Var != null);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
        if (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1())) {
            n17 = z3Var;
        }
        if (n17.m2() && c01.z1.v() && !d(n17.d1())) {
            n17.mo43621x7650bebc(n17.m124896xfb85f7b0() | Integer.MIN_VALUE);
        } else {
            n17.mo43621x7650bebc(n17.m124896xfb85f7b0() & (-513));
        }
        if ((com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(z3Var.d1())) && q() != null) {
            c01.h8 q17 = q();
            java.lang.String d17 = z3Var.d1();
            ((np.h) q17).getClass();
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(d17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenImOpLogLogic", "OpenImOpLogLogic OpenIMModContactMuteOplog username:%s switch cancel", d17);
                ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new p41.q(d17, 2));
            } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(d17)) {
                ((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).getClass();
                if (!(d17 == null || d17.length() == 0) && com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(d17)) {
                    k41.h1 h1Var = k41.h1.f385540d;
                    k41.g0 c17 = k41.o0.c(d17);
                    if (c17 != null && c17.f385530x1 != 0) {
                        java.lang.String str = c17.f68613xdec927b;
                        if (!(str == null || str.length() == 0)) {
                            c17.f68612x2262335f &= -513;
                            k41.o0.f(c17);
                            ((p41.h) ((j41.v) i95.n0.c(j41.v.class))).getClass();
                            if (d17 != null && d17.length() != 0) {
                                z18 = false;
                            }
                            if (!z18) {
                                ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new p41.f(d17, 2));
                            }
                        }
                    }
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    objArr[0] = d17;
                    objArr[1] = c17 != null ? java.lang.Long.valueOf(c17.f385530x1) : null;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMKefuService", "unSetMute contact invalid username: %s, contactId: %s", objArr);
                }
            }
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.J3(z3Var.d1())) {
            f(false, z3Var.d1());
        }
        g0(n17, z17);
    }
}
