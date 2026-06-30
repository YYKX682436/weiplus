package b52;

/* loaded from: classes15.dex */
public abstract class b {
    public static r45.jw3 a(java.lang.String str) {
        java.util.List f17 = y52.b.f(str);
        if (f17 == null) {
            return null;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) f17;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (r45.jw3) arrayList.get(arrayList.size() - 1);
    }

    public static java.lang.String b() {
        try {
            if (!gm0.j1.a()) {
                return "";
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFinderContextId USERINFO_FINDER_CONTEXT_ID_STRING:");
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_CONTEXT_ID_STRING;
            sb6.append((java.lang.String) c17.m(u3Var, ""));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellhoundUtil", sb6.toString());
            return (java.lang.String) gm0.j1.u().c().m(u3Var, "");
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static java.lang.String c() {
        try {
            return !gm0.j1.a() ? "" : (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_ALL_CLICK_TAB_CONTEXT_ID_STRING, "");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellhoundUtil", e17, "getFinderCurTabContextId crash: %s", e17.getMessage());
            return "";
        }
    }

    public static java.lang.String d() {
        try {
            return !gm0.j1.a() ? "" : (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TAB_CLICK_TAB_CONTEXT_ID_STRING, "");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellhoundUtil", e17, "getFinderReportTabContextId crash: %s", e17.getMessage());
            return "";
        }
    }

    public static p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 e(java.lang.String str) {
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d mo7595x9cdc264;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f f17 = f();
        java.util.List<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> m7675x1626d96d = (f17 == null || (mo7595x9cdc264 = f17.mo7595x9cdc264()) == null) ? null : mo7595x9cdc264.m7675x1626d96d();
        if (m7675x1626d96d != null) {
            for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 : m7675x1626d96d) {
                if (componentCallbacksC1101xa17d4670 != null && componentCallbacksC1101xa17d4670.getClass().getSimpleName().equals(str)) {
                    return componentCallbacksC1101xa17d4670;
                }
            }
        }
        return null;
    }

    public static p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f f() {
        try {
            java.util.ArrayList arrayList = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.f278359y;
            java.lang.reflect.Method declaredMethod = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class.getDeclaredMethod("getInstance", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            return (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) declaredMethod.invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.lang.String g(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.lang.String replace = str.replace("/", ".");
        int lastIndexOf = replace.lastIndexOf(".");
        return (lastIndexOf < 0 || lastIndexOf >= replace.length() + (-1)) ? replace : replace.substring(lastIndexOf + 1);
    }

    public static int h() {
        int n17 = j62.e.g().n();
        if (n17 == 0) {
            return 0;
        }
        return n17;
    }

    public static boolean i(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return java.util.regex.Pattern.matches("^(AppBrandUI)[0-9]*$", str);
    }

    public static boolean j(java.lang.String str) {
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.f181318c;
        return i(str) && ("143".equals(str2) || "155".equals(str2));
    }

    public static boolean k(java.lang.String str) {
        return "com.tencent.mm.ui.LauncherUI".equals(str);
    }

    public static boolean l(java.lang.String str) {
        if (str == null) {
            return false;
        }
        return str.contains(".") ? "com.tencent.mm.ui.conversation.MainUI".equals(str) || "com.tencent.mm.ui.contact.AddressUI.AddressUIFragment".equals(str) || "com.tencent.mm.ui.contact.address.MvvmAddressUIFragment".equals(str) || "com.tencent.mm.ui.FindMoreFriendsUI".equals(str) || "com.tencent.mm.ui.MoreTabUI".equals(str) || "com.tencent.mm.ui.chatting.ChattingUIFragment".equals(str) : "MainUI".equals(str) || "AddressUIFragment".equals(str) || "MvvmAddressUIFragment".equals(str) || "FindMoreFriendsUI".equals(str) || "MoreTabUI".equals(str) || "ChattingUIFragment".equals(str);
    }

    public static boolean m() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String str = ((km0.c) gm0.j1.p().a()).f390520a;
        if (str == null) {
            return false;
        }
        return context.getPackageName().equals(str);
    }

    public static boolean n(java.lang.String str) {
        if (str == null) {
            return false;
        }
        return str.contains(".") ? "com.tencent.mm.ui.conversation.MainUI".equals(str) || "com.tencent.mm.ui.contact.AddressUI.AddressUIFragment".equals(str) || "com.tencent.mm.ui.contact.address.MvvmAddressUIFragment".equals(str) || "com.tencent.mm.ui.FindMoreFriendsUI".equals(str) || "com.tencent.mm.ui.MoreTabUI".equals(str) : "MainUI".equals(str) || "AddressUIFragment".equals(str) || "MvvmAddressUIFragment".equals(str) || "FindMoreFriendsUI".equals(str) || "MoreTabUI".equals(str);
    }

    public static boolean o(java.lang.String str) {
        return (str == null || "".equals(str.trim()) || !str.matches("^[0-9]*$")) ? false : true;
    }

    public static boolean p(java.lang.String str) {
        return "com.tencent.mm.app.WeChatSplashActivity".equals(str);
    }

    public static java.lang.String q(long j17) {
        return new java.math.BigInteger(java.lang.Long.toBinaryString(j17), 2).toString();
    }

    public static java.lang.String r(int i17) {
        if (i17 == -1) {
            return "-1";
        }
        return "0x" + java.lang.Integer.toHexString(i17);
    }
}
