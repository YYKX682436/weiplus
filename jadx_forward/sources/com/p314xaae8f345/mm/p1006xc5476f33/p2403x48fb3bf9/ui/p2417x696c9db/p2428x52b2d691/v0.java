package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class v0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.v0 f268099d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.v0();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f268100e = new java.util.concurrent.ConcurrentHashMap();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String mo120156xb5887639;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f422323a.get("mediaUrl");
        java.lang.Object obj = msg.f422323a.get("type");
        if (obj != null && obj.equals("video")) {
            java.lang.String str2 = "MMLive_" + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str);
            dn.o oVar = new dn.o();
            oVar.f323318d = "task_DownloadManager";
            oVar.f69601xaca5bdda = str2;
            oVar.M1 = str;
            oVar.H1 = 0;
            oVar.f69592xf1ebe47b = 100;
            oVar.Z = 3;
            oVar.f323342y0 = 4;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
            sb6.append(lp0.b.h0("WebImageCache").o());
            sb6.append('/');
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes()));
            java.lang.String sb7 = sb6.toString();
            oVar.f69595x6d25b0d9 = sb7;
            f268100e.put(str2, new jz5.l(env, msg));
            oVar.f323348c2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.u0(sb7, str);
            ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
            t21.o2.Di().e(oVar, false);
        } else {
            boolean l17 = gm0.j1.u().l();
            android.content.Context context = env.f422393a;
            zg0.q2 a17 = env.a();
            if (a17 == null || (mo120156xb5887639 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a17).Z()) == null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = env.f422397e;
                mo120156xb5887639 = c22633x83752a59 != null ? c22633x83752a59.mo120156xb5887639() : null;
                if (mo120156xb5887639 == null) {
                    mo120156xb5887639 = "";
                }
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f(context, str, mo120156xb5887639, com.p314xaae8f345.p3210x3857dc.d.g().a(str), l17, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.t0(env, msg));
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 547;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "downloadMediaByUrl";
    }
}
