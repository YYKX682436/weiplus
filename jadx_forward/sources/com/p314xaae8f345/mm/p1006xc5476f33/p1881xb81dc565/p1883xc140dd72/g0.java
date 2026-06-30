package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f231116a = {"ilink2", "voipComm", "voipChannel", "voipCodec", "confService"};

    /* renamed from: b, reason: collision with root package name */
    public static boolean f231117b = false;

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.p3206x37e841.C27805xcbec6898 f231118c = new com.p314xaae8f345.p3206x37e841.C27805xcbec6898();

    public static java.lang.String a() {
        boolean z17;
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity");
        try {
            java.lang.reflect.Method declaredMethod = android.net.ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            z17 = ((java.lang.Boolean) declaredMethod.invoke(connectivityManager, new java.lang.Object[0])).booleanValue();
        } catch (java.lang.Exception unused) {
            z17 = false;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkNativeEngine", "mobile network not connectedorconnecting");
            return "";
        }
        java.lang.String simOperator = ((android.telephony.TelephonyManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("phone")).getSimOperator();
        if (simOperator == null || simOperator.length() < 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkNativeEngine", "nic_op NULL");
            return "";
        }
        return simOperator.substring(0, 3) + ":" + simOperator.substring(3, simOperator.length());
    }

    public static r45.u70 b(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        r45.u70 u70Var = new r45.u70();
        u70Var.f468631d = "wechat";
        u70Var.f468632e = "voip-mt";
        u70Var.f468636i = lp0.b.X() + "/ilink";
        u70Var.f468648w = 1;
        u70Var.f468637m = 0;
        u70Var.f468640p = 1;
        u70Var.f468642q = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40533xfb80ca96() != null ? com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40533xfb80ca96().mo40548xf2ceb016(0L) : 0;
        u70Var.f468644s = i17;
        u70Var.f468645t = i18;
        u70Var.f468646u = i19;
        u70Var.H = wo.t.d();
        u70Var.I = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(wo.r.d(), 0);
        u70Var.f468630J = wo.r.a();
        u70Var.L = android.os.Build.MANUFACTURER;
        u70Var.M = wo.w0.m();
        java.lang.String str3 = android.os.Build.VERSION.RELEASE;
        u70Var.N = str3;
        u70Var.P = android.os.Build.VERSION.INCREMENTAL;
        u70Var.Q = android.os.Build.DISPLAY;
        u70Var.T = a();
        u70Var.f468641p0 = true;
        u70Var.f468651z = 1;
        u70Var.C = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().f354681a.a(1));
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ilink_codeclist_param, 2);
        u70Var.D = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkNativeEngine", "iCodecListParam: " + Ni);
        u70Var.f468647v = 1;
        if (Ni == 1) {
            u70Var.f468647v = 5;
        } else if (Ni == 0) {
            u70Var.f468647v = 21;
        }
        if (zj3.j.g()) {
            u70Var.f468647v = u70Var.f468647v | 65536 | 4194304;
        }
        int Ai = ((lh3.n) ((kh3.f) i95.n0.c(kh3.f.class))).Ai(2);
        int i27 = Ai != 3 ? Ai : 1;
        if (gq4.v.Ni()) {
            u70Var.U = i27;
        } else {
            u70Var.U = i27 + 65536;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkNativeEngine", "isVoipDoubleLinkSettingOpen false, setsimtype " + u70Var.U);
        }
        java.lang.String g17 = wo.w0.g(false);
        if (g17 == null || g17.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Multitalk.ILinkNativeEngine", "getDeviceId failed");
        } else {
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            u70Var.R = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(g17.getBytes()).getBytes());
        }
        u70Var.S = str3;
        u70Var.V = java.lang.String.format("0x%x", java.lang.Integer.valueOf(o45.wf.f424562g));
        return u70Var;
    }

    public static int c(int i17, byte[] bArr, int i18) {
        return f231118c.m120006x7ba2c63b(i17, bArr, i18);
    }

    public static int d(r45.ai6 ai6Var) {
        int i17 = -1;
        if (ai6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Multitalk.ILinkNativeEngine", "steve: videoResParam is null");
            return -1;
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkNativeEngine", "videoResParam:" + ai6Var + ",length:" + ai6Var.mo14344x5f01b1f6().length);
            i17 = f231118c.m120012x1d2cd171(ai6Var.mo14344x5f01b1f6(), ai6Var.mo14344x5f01b1f6().length);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("steve: subScribeVideoAndResList ret:");
            sb6.append(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkNativeEngine", sb6.toString());
            return i17;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Multitalk.ILinkNativeEngine", e17, "SetVideoResolution exception", new java.lang.Object[0]);
            return i17;
        }
    }
}
