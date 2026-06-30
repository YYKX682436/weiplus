package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class z3 extends com.p314xaae8f345.mm.p670x38b72420.s implements java.lang.Cloneable {
    public static long L2 = 86400;
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 M2 = new com.p314xaae8f345.mm.p2621x8fb0427b.y3(64);
    public java.lang.CharSequence J2;
    public java.lang.String K2;

    public z3(java.lang.String str) {
        X1(str == null ? "" : str);
        this.K2 = null;
    }

    public static boolean A4(java.lang.String str) {
        return "schedule_message".equals(str);
    }

    public static boolean B3(java.lang.String str) {
        return str != null && str.equalsIgnoreCase("appbrand_notify_message");
    }

    public static boolean B4(java.lang.String str) {
        return str != null && str.equalsIgnoreCase("service_officialaccounts");
    }

    public static boolean C3(java.lang.String str) {
        return str != null && str.equalsIgnoreCase("appbrandcustomerservicemsg");
    }

    public static boolean C4(java.lang.String str) {
        return str != null && str.equalsIgnoreCase("shakeapp");
    }

    public static boolean D3(int i17) {
        return (i17 & 8) > 0;
    }

    public static boolean D4(java.lang.String str) {
        return "gh_43f2581f6fd6".equals(str);
    }

    public static boolean E3(java.lang.String str) {
        return str != null && str.endsWith("@bizfansmsg");
    }

    public static boolean E4(java.lang.String str) {
        return str != null && str.endsWith("@stranger");
    }

    public static boolean F3(java.lang.String str) {
        return str != null && str.startsWith("phacct_");
    }

    public static boolean F4(java.lang.String str) {
        return str != null && str.equalsIgnoreCase("BrandEcsTemplateMsg@fakeuser");
    }

    public static boolean G3(java.lang.String str) {
        return str != null && str.endsWith("@picfansmsg");
    }

    public static boolean G4(java.lang.String str) {
        return str != null && str.endsWith("@t.qq.com");
    }

    public static boolean H3(java.lang.String str) {
        return str != null && (str.contains("@bottle:") || str.endsWith("@bottle"));
    }

    public static boolean H4(java.lang.String str) {
        if (str != null) {
            java.lang.String str2 = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a;
            if (str.endsWith("@status")) {
                return true;
            }
        }
        return false;
    }

    public static boolean I4(java.lang.String str) {
        return str != null && str.equalsIgnoreCase("gh_22b87fa7cb3c");
    }

    public static boolean J3(java.lang.String str) {
        return str != null && str.endsWith("@weclaw");
    }

    public static boolean J4(java.lang.String str) {
        return str != null && (str.endsWith("@zhugemsg") || str.endsWith("@zhugeprivate") || str.endsWith("@zhugepublic"));
    }

    public static boolean K3(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        if (!str.endsWith("@findermsg") && !str.endsWith("@gamelifesess")) {
            java.lang.String str2 = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a;
            if (!str.endsWith("@status") && !str.endsWith("@bizfansmsg") && !str.endsWith("@picfansmsg") && !str.endsWith("@zhugemsg") && !str.endsWith("@zhugepublic") && !str.endsWith("@weclaw") && !str.endsWith("@zhugeprivate")) {
                return false;
            }
        }
        return true;
    }

    public static boolean K4(java.lang.String str) {
        return str != null && str.endsWith("@zhugepublic");
    }

    public static boolean L3(java.lang.String str) {
        return (str != null && str.startsWith("wxid_wi_")) || L4(str);
    }

    public static boolean L4(java.lang.String str) {
        return str != null && str.endsWith("@weclaw");
    }

    public static boolean M3(java.lang.String str) {
        return "@placeholder_foldgroup".equals(str);
    }

    public static boolean M4(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return str.equalsIgnoreCase("weixin");
    }

    public static boolean N3(java.lang.String str) {
        return str != null && str.equalsIgnoreCase("conversationboxservice");
    }

    public static boolean N4(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return str.endsWith("@chatroom");
    }

    public static boolean O4(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return Q4(str);
    }

    public static boolean P3(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return true;
        }
        for (java.lang.String str2 : "wx_;wxid_;gh_;a0;a1;a2;a3;a4;a5;a6;a7;a8;a9;q0;q1;q2;q3;q4;q5;q6;q7;q8;q9;qq0;qq1;qq2;qq3;qq4;qq5;qq6;qq7;qq8;qq9;f0;f1;f2;f3;f4;f5;f6;f7;f8;f9;F0;F1;F2;F3;F4;F5;F6;F7;F8;F9;".split(";")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean P4(java.lang.String str) {
        return "gh_25d9ac85a4bc".equals(str);
    }

    public static boolean Q3(java.lang.String str) {
        return str != null && str.equalsIgnoreCase("facebookapp");
    }

    public static boolean Q4(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return !str.contains("@") || str.endsWith("@micromsg.qq.com");
    }

    public static boolean R3(java.lang.String str) {
        return "filehelper".equalsIgnoreCase(str);
    }

    public static boolean R4(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return str.endsWith("@chatroom") || str.endsWith("@im.chatroom");
    }

    public static boolean S3(java.lang.String str) {
        return str != null && str.endsWith("@finder");
    }

    public static boolean S4(java.lang.String str) {
        return "gh_3dfda90e39d6".equals(str);
    }

    public static boolean T3(java.lang.String str) {
        return str != null && str.endsWith("@findermsgalias");
    }

    public static boolean T4(java.lang.String str) {
        return "gh_f0a92aa7146c".equals(str);
    }

    public static boolean U3(java.lang.String str) {
        return str != null && str.endsWith("@findermsgstranger");
    }

    public static boolean U4(java.lang.String str) {
        return S4(str) || "gh_b4af18eac3d5".equals(str) || T4(str) || "gh_e087bb5b95e6".equals(str);
    }

    public static boolean V3(java.lang.String str) {
        return str != null && str.endsWith("@findermsg");
    }

    public static boolean V4(java.lang.String str) {
        return (!O4(str) || c01.e2.W(str) || c01.e2.G(str)) ? false : true;
    }

    public static boolean W3(java.lang.String str) {
        return str != null && str.equalsIgnoreCase("floatbottle");
    }

    public static boolean W4(java.lang.String str) {
        return str != null && str.equals("wxid_wi_1d142z0zdj03");
    }

    public static boolean X3(java.lang.String str) {
        return str != null && str.equalsIgnoreCase("message_fold");
    }

    public static boolean Y3(java.lang.String str) {
        return str != null && str.equalsIgnoreCase("fmessage");
    }

    public static java.lang.String Y4(java.lang.String str) {
        if (H3(str)) {
            java.lang.String[] split = str.split(":");
            return (split == null || split.length < 1) ? str : split[0];
        }
        if (str != null && str.contains("@")) {
            return "";
        }
        return str + "@bottle";
    }

    public static boolean Z3(java.lang.String str) {
        return str != null && str.endsWith("@gamelife");
    }

    public static boolean a4(java.lang.String str) {
        return str != null && str.endsWith("@gamelifesess");
    }

    public static boolean b4(java.lang.String str) {
        return str != null && str.equalsIgnoreCase("helper_entry");
    }

    public static boolean c4(java.lang.String str) {
        return str != null && str.equalsIgnoreCase("lbsapp");
    }

    public static boolean d4(java.lang.String str) {
        return str != null && str.equalsIgnoreCase("masssendapp");
    }

    public static boolean e4(java.lang.String str) {
        return str != null && str.equalsIgnoreCase("medianote");
    }

    public static boolean f4(java.lang.String str) {
        return str != null && str.equalsIgnoreCase("tmessage");
    }

    public static boolean g4(java.lang.String str) {
        return str != null && str.equalsIgnoreCase("notification_messages");
    }

    public static boolean h4(java.lang.String str) {
        return str != null && str.equalsIgnoreCase("schedule_message");
    }

    public static boolean i4(java.lang.String str) {
        return R4(str) || m4(str) || V4(str);
    }

    public static boolean j4(java.lang.String str) {
        return str != null && str.equalsIgnoreCase("notifymessage");
    }

    public static boolean k4(java.lang.String str) {
        return str != null && str.equalsIgnoreCase("officialaccounts");
    }

    public static boolean l4(java.lang.String str) {
        if ("weixin".equalsIgnoreCase(str)) {
            return true;
        }
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(21, null);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        return str2.equalsIgnoreCase(str);
    }

    public static boolean m4(java.lang.String str) {
        return str != null && str.endsWith("@openim");
    }

    public static boolean n4(java.lang.String str) {
        return str != null && str.endsWith("@im.chatroom");
    }

    public static boolean o4(java.lang.String str) {
        return str != null && str.equalsIgnoreCase("opencustomerservicemsg");
    }

    public static boolean p4(java.lang.String str) {
        return str != null && str.endsWith("@kefu.openim");
    }

    public static boolean q4(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return str.endsWith("@im.chatroom");
    }

    public static boolean r4(java.lang.String str) {
        return "gh_051d9102de63".equals(str);
    }

    public static boolean s4(java.lang.String str) {
        return str != null && str.endsWith("@qqim");
    }

    public static boolean t4(java.lang.String str) {
        return str != null && str.equalsIgnoreCase("qqmail");
    }

    public static java.util.HashSet u3() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("gh_3dfda90e39d6");
        hashSet.add("gh_b4af18eac3d5");
        hashSet.add("gh_f0a92aa7146c");
        hashSet.add("gh_e087bb5b95e6");
        return hashSet;
    }

    public static boolean u4(java.lang.String str) {
        return str != null && str.equalsIgnoreCase("qmessage");
    }

    public static boolean v4(java.lang.String str) {
        return "qqsync".equalsIgnoreCase(str);
    }

    public static boolean w4(java.lang.String str) {
        return str != null && str.equalsIgnoreCase("newsapp");
    }

    public static boolean x4(java.lang.String str) {
        return str != null && str.equalsIgnoreCase("blogapp");
    }

    public static boolean y3(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Contact", "Contact invisibleUsername username == null or nil");
            return false;
        }
        if (m4(str)) {
            return true;
        }
        java.lang.String b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).a().b(1, "HideWechatID", "idprefix");
        if (b17 != null) {
            for (java.lang.String str2 : b17.split(";")) {
                if (str2 != null && str.startsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean y4(java.lang.String str) {
        return l4(str) || c01.e2.D(str) || k4(str) || b4(str) || F4(str);
    }

    public static boolean z3(java.lang.String str) {
        return str != null && str.endsWith("@app");
    }

    public static boolean z4(java.lang.String str) {
        return str != null && (str.equalsIgnoreCase("weixin") || str.equalsIgnoreCase("gh_9639b5a92773"));
    }

    @Override // com.p314xaae8f345.mm.p670x38b72420.s
    public void L2(java.lang.String str) {
        super.L2(str);
    }

    @Override // dm.e2
    public java.lang.String R0() {
        return this.W;
    }

    public boolean X4() {
        return ((long) (((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()) - this.f318109p1)) > L2;
    }

    public void Z4() {
        java.lang.String str = this.f318103l1;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.lang.String[] strArr = (java.lang.String[]) M2.get(str);
        if (strArr.length > 0) {
            if (strArr.length > 2) {
                if (com.p314xaae8f345.mm.p2621x8fb0427b.ha.r(strArr[0])) {
                    super.b3(com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().j(strArr[0], strArr[1]));
                } else {
                    super.b3(com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().i(strArr[0]));
                }
                super.L2(com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().h(strArr[0], strArr[1], strArr[2]));
                return;
            }
            if (strArr.length == 2) {
                super.b3(com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().i(strArr[0]));
                super.L2(com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().j(strArr[0], strArr[1]));
            } else {
                super.b3(com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().i(strArr[0]));
                super.L2("");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p670x38b72420.s
    public void b3(java.lang.String str) {
        super.b3(str);
    }

    @Override // com.p314xaae8f345.mm.p670x38b72420.s
    public void c3(java.lang.String str) {
        super.c3(str);
        Z4();
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 t3() {
        try {
            return (com.p314xaae8f345.mm.p2621x8fb0427b.z3) clone();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Contact", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Contact", "clone Contact error. e: " + e17.toString());
            return null;
        }
    }

    @Override // dm.e2
    public java.lang.String v0() {
        return this.X;
    }

    public java.lang.String v3() {
        java.lang.String[] split;
        java.lang.String str;
        java.lang.String str2 = this.f318103l1;
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || (split = str2.split("_")) == null || split.length < 3 || (str = split[2]) == null) ? "" : str;
    }

    public java.lang.String w3() {
        java.lang.String[] split;
        java.lang.String str;
        java.lang.String str2 = this.f318103l1;
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || (split = str2.split("_")) == null || split.length < 1 || (str = split[0]) == null) ? "" : str;
    }

    public java.lang.String x3() {
        java.lang.String[] split;
        java.lang.String str;
        java.lang.String str2 = this.f318103l1;
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || (split = str2.split("_")) == null || split.length < 2 || (str = split[1]) == null) ? "" : str;
    }

    public z3() {
        this.K2 = null;
    }
}
