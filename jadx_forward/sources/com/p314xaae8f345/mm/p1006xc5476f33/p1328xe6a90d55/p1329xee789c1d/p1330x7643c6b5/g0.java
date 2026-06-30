package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f177441a = {"ilink2", "voipComm", "voipChannel", "voipCodec", "confService"};

    /* renamed from: b, reason: collision with root package name */
    public static boolean f177442b = false;

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.p3206x37e841.C27805xcbec6898 f177443c = new com.p314xaae8f345.p3206x37e841.C27805xcbec6898();

    public static r45.u70 a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, int i27, int i28, boolean z17) {
        r45.u70 u70Var = new r45.u70();
        u70Var.f468631d = str;
        u70Var.f468632e = str2;
        u70Var.f468634g = str3;
        u70Var.f468636i = lp0.b.X() + "/openvoice";
        u70Var.f468637m = 0;
        u70Var.f468640p = 1;
        u70Var.f468642q = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40533xfb80ca96() != null ? com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40533xfb80ca96().mo40548xf2ceb016(0L) : 0;
        u70Var.f468644s = i17;
        u70Var.Y = i18;
        u70Var.Z = i19;
        u70Var.f468647v = i28;
        u70Var.f468645t = i27;
        u70Var.H = wo.t.d();
        u70Var.I = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(wo.r.d(), 0);
        u70Var.f468630J = wo.r.a();
        u70Var.L = android.os.Build.MANUFACTURER;
        u70Var.M = wo.w0.m();
        java.lang.String str4 = android.os.Build.VERSION.RELEASE;
        u70Var.N = str4;
        u70Var.P = android.os.Build.VERSION.INCREMENTAL;
        u70Var.Q = android.os.Build.DISPLAY;
        java.lang.String g17 = wo.w0.g(false);
        if (g17 == null || g17.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "getDeviceId failed");
        } else {
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            u70Var.R = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(g17.getBytes()).getBytes());
        }
        u70Var.D = true;
        u70Var.S = str4;
        u70Var.V = java.lang.String.format("0x%x", java.lang.Integer.valueOf(o45.wf.f424562g));
        if (z17) {
            u70Var.U = 0;
        } else {
            u70Var.U = 65536;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "isVoipDoubleLinkSettingOpen false, setsimtype " + u70Var.U);
        }
        return u70Var;
    }

    public static int b(int i17, byte[] bArr, int i18) {
        return f177443c.m120006x7ba2c63b(i17, bArr, i18);
    }
}
