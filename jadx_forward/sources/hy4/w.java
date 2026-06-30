package hy4;

/* loaded from: classes8.dex */
public final class w implements ik1.k0 {

    /* renamed from: f, reason: collision with root package name */
    public static final hy4.v f367733f = new hy4.v(null);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f367734g = jz5.h.b(hy4.u.f367732d);

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f367735d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f367736e;

    public w(android.content.Context mContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        this.f367735d = mContext;
        this.f367736e = "";
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
        if (!android.text.TextUtils.isEmpty(this.f367736e)) {
            return this.f367736e;
        }
        try {
            packageInfo = ik1.b.a(this.f367735d, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        } catch (java.lang.Exception unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.f367736e += com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.a(null, o45.wf.f424562g);
            this.f367736e += '.' + packageInfo.versionCode;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(this.f367736e);
            sb6.append('(');
            java.lang.String format = java.lang.String.format("0x%08X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(o45.wf.f424562g)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            sb6.append(format);
            sb6.append("; MicroMessenger/Prefetcher 2.0)");
            this.f367736e = sb6.toString();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(this.f367736e);
            sb7.append(" WeChat/");
            sb7.append(wo.w0.q() ? "arm64" : "arm32");
            this.f367736e = sb7.toString();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.z8 z8Var = yp5.a.f545942a;
            this.f367736e += " Weixin";
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c()) {
                this.f367736e += " GPVersion/1";
            }
        }
        java.lang.String str2 = this.f367736e;
        if (com.p314xaae8f345.mm.ui.bk.A()) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            if (!str2.contains("Android Tablet")) {
                str2 = str2.concat(" Android Tablet");
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "appendTabletTag(...)");
        this.f367736e = str2;
        return str2;
    }
}
