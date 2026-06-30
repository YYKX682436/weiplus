package te;

/* loaded from: classes7.dex */
public final class a implements te.b {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f499297d;

    public a(java.lang.String uin, java.lang.String appId) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uin, "uin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f499297d = "";
        synchronized (lp0.b.class) {
            str = lp0.b.D() + "appbrand/wxaudio/";
        }
        com.p314xaae8f345.mm.vfs.r6 j17 = com.p314xaae8f345.mm.vfs.r6.j(new java.io.File(str));
        if (j17 != null) {
            java.lang.String o17 = j17.o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            o17 = r26.i0.n(o17, "/", false) ? o17 : o17.concat("/");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(o17);
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(uin + '#' + appId));
            java.lang.String sb7 = sb6.toString();
            this.f499297d = sb7;
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(sb7);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!a17.f294812f.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
                return;
            }
            com.p314xaae8f345.mm.vfs.w6.u(sb7);
        }
    }
}
