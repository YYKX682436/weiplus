package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43;

/* loaded from: classes8.dex */
public class y implements ik1.k0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f167083d = "";

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f167084e;

    public y(android.content.Context context) {
        this.f167084e = context;
    }

    @Override // ik1.k0
    /* renamed from: identity */
    public java.lang.String mo49172xf7e870be() {
        return " MicroMessenger/";
    }

    @Override // ik1.k0
    /* renamed from: version */
    public java.lang.String mo32090x14f51cd8() {
        android.content.pm.PackageInfo packageInfo;
        if (!android.text.TextUtils.isEmpty(this.f167083d)) {
            return this.f167083d;
        }
        try {
            packageInfo = ik1.b.a(this.f167084e, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        } catch (java.lang.Exception unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.f167083d += com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.a(null, o45.wf.f424562g);
            this.f167083d += "." + packageInfo.versionCode;
            this.f167083d += "(" + java.lang.String.format("0x%08X", java.lang.Integer.valueOf(o45.wf.f424562g)) + ")";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(this.f167083d);
            sb6.append(" WeChat/");
            sb6.append(wo.w0.q() ? "arm64" : "arm32");
            this.f167083d = sb6.toString();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.z8 z8Var = yp5.a.f545942a;
            this.f167083d += " Weixin";
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c()) {
                this.f167083d += " GPVersion/1";
            }
        }
        java.lang.String str2 = this.f167083d;
        if (com.p314xaae8f345.mm.ui.bk.A()) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            if (!str2.contains("Android Tablet")) {
                str2 = str2.concat(" Android Tablet");
            }
        }
        this.f167083d = str2;
        return str2;
    }
}
