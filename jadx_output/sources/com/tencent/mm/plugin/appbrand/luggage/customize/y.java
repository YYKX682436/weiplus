package com.tencent.mm.plugin.appbrand.luggage.customize;

/* loaded from: classes8.dex */
public class y implements ik1.k0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f85550d = "";

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f85551e;

    public y(android.content.Context context) {
        this.f85551e = context;
    }

    @Override // ik1.k0
    public java.lang.String identity() {
        return " MicroMessenger/";
    }

    @Override // ik1.k0
    public java.lang.String version() {
        android.content.pm.PackageInfo packageInfo;
        if (!android.text.TextUtils.isEmpty(this.f85550d)) {
            return this.f85550d;
        }
        try {
            packageInfo = ik1.b.a(this.f85551e, com.tencent.mm.sdk.platformtools.x2.f193072b);
        } catch (java.lang.Exception unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.f85550d += com.tencent.mm.sdk.platformtools.a0.a(null, o45.wf.f343029g);
            this.f85550d += "." + packageInfo.versionCode;
            this.f85550d += "(" + java.lang.String.format("0x%08X", java.lang.Integer.valueOf(o45.wf.f343029g)) + ")";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(this.f85550d);
            sb6.append(" WeChat/");
            sb6.append(wo.w0.q() ? "arm64" : "arm32");
            this.f85550d = sb6.toString();
            java.lang.String str = com.tencent.mm.sdk.platformtools.a9.f192463a;
            com.tencent.mm.sdk.platformtools.z8 z8Var = yp5.a.f464409a;
            this.f85550d += " Weixin";
            if (com.tencent.mm.sdk.platformtools.a0.c()) {
                this.f85550d += " GPVersion/1";
            }
        }
        java.lang.String str2 = this.f85550d;
        if (com.tencent.mm.ui.bk.A()) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            if (!str2.contains("Android Tablet")) {
                str2 = str2.concat(" Android Tablet");
            }
        }
        this.f85550d = str2;
        return str2;
    }
}
