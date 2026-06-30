package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f95908a = {"ilink2", "voipComm", "voipChannel", "voipCodec", "confService"};

    /* renamed from: b, reason: collision with root package name */
    public static boolean f95909b = false;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wxmm.v2conference f95910c = new com.tencent.wxmm.v2conference();

    public static r45.u70 a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, int i27, int i28, boolean z17) {
        r45.u70 u70Var = new r45.u70();
        u70Var.f387098d = str;
        u70Var.f387099e = str2;
        u70Var.f387101g = str3;
        u70Var.f387103i = lp0.b.X() + "/openvoice";
        u70Var.f387104m = 0;
        u70Var.f387107p = 1;
        u70Var.f387109q = com.tencent.mars.xlog.Log.getImpl() != null ? com.tencent.mars.xlog.Log.getImpl().getLogLevel(0L) : 0;
        u70Var.f387111s = i17;
        u70Var.Y = i18;
        u70Var.Z = i19;
        u70Var.f387114v = i28;
        u70Var.f387112t = i27;
        u70Var.H = wo.t.d();
        u70Var.I = com.tencent.mm.sdk.platformtools.t8.P(wo.r.d(), 0);
        u70Var.f387097J = wo.r.a();
        u70Var.L = android.os.Build.MANUFACTURER;
        u70Var.M = wo.w0.m();
        java.lang.String str4 = android.os.Build.VERSION.RELEASE;
        u70Var.N = str4;
        u70Var.P = android.os.Build.VERSION.INCREMENTAL;
        u70Var.Q = android.os.Build.DISPLAY;
        java.lang.String g17 = wo.w0.g(false);
        if (g17 == null || g17.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "getDeviceId failed");
        } else {
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            u70Var.R = com.tencent.mm.protobuf.g.b(com.tencent.mm.sdk.platformtools.w2.b(g17.getBytes()).getBytes());
        }
        u70Var.D = true;
        u70Var.S = str4;
        u70Var.V = java.lang.String.format("0x%x", java.lang.Integer.valueOf(o45.wf.f343029g));
        if (z17) {
            u70Var.U = 0;
        } else {
            u70Var.U = 65536;
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "isVoipDoubleLinkSettingOpen false, setsimtype " + u70Var.U);
        }
        return u70Var;
    }

    public static int b(int i17, byte[] bArr, int i18) {
        return f95910c.SetAppCmd(i17, bArr, i18);
    }
}
