package n62;

@j95.b
/* loaded from: classes12.dex */
public class k extends i95.w {

    /* renamed from: t, reason: collision with root package name */
    public static boolean f416729t;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.n3 f416730d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.ba f416731e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.fb f416732f;

    /* renamed from: g, reason: collision with root package name */
    public o62.a f416733g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f416734h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.j2 f416735i = new n62.e(this);

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f416736m = new n62.f(this, android.os.Looper.getMainLooper());

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f416737n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f416738o = new n62.g(this, android.os.Looper.getMainLooper());

    /* renamed from: p, reason: collision with root package name */
    public final l75.q0 f416739p = new n62.h(this);

    /* renamed from: q, reason: collision with root package name */
    public final l75.z0 f416740q = new n62.i(this);

    /* renamed from: r, reason: collision with root package name */
    public boolean f416741r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f416742s = false;

    static {
        int a17 = wo.r.a();
        try {
            if (!android.os.Build.CPU_ABI.contains("armeabi")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("hakon SilkCodec", "x86 machines not supported.");
            } else if ((a17 & 1024) != 0) {
                n62.k.class.getClassLoader();
                fp.d0.n("wechatvoicesilk");
            } else if ((a17 & 512) != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("hakon SilkCodec", "load library failed! silk don't support armv6!!!!");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("hakon SilkCodec", "load library failed! silk don't support armv5!!!!");
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("hakon SilkCodec", "load library failed!");
        }
        f416729t = false;
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.n3 Ai() {
        gm0.j1.b().c();
        if (Di().f416730d == null) {
            Di().f416730d = new com.p314xaae8f345.mm.p2621x8fb0427b.n3(c01.d9.b().s());
        }
        return Di().f416730d;
    }

    public static n62.k Di() {
        return (n62.k) i95.n0.c(n62.k.class);
    }

    public static o62.a Ni() {
        gm0.j1.b().c();
        if (Di().f416733g == null) {
            Di().f416733g = new o62.a(c01.d9.b().s());
        }
        return Di().f416733g;
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.ba Ri() {
        gm0.j1.b().c();
        if (Di().f416731e == null) {
            Di().f416731e = new com.p314xaae8f345.mm.p2621x8fb0427b.ba(c01.d9.b().s());
        }
        return Di().f416731e;
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.fb Ui() {
        gm0.j1.b().c();
        if (Di().f416732f == null) {
            Di().f416732f = new com.p314xaae8f345.mm.p2621x8fb0427b.fb(c01.d9.b().s());
        }
        return Di().f416732f;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 Bi(long j17) {
        if (!gm0.j1.a() || j17 <= 0) {
            return null;
        }
        return ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).p(j17);
    }

    public final void Vi(boolean z17) {
        if (this.f416741r) {
            if (z17 && this.f416742s) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreExt", "fromStartApp and already try to init");
            } else if (z17 || f416729t) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreExt", "initLocalVoiceControl,fromStartApp:%s,hasTryToInit:%s,hasCallApi:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f416742s), java.lang.Boolean.valueOf(f416729t));
                this.f416741r = false;
                gm0.j1.e().k(new n62.j(this), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            }
        }
    }

    public void Zi(long j17, java.lang.String str) {
        boolean z17;
        if (j17 <= 0) {
            return;
        }
        try {
            com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u();
            int i17 = 0;
            while (true) {
                java.util.List list = g9Var.f275514g;
                if (i17 >= ((java.util.LinkedList) list).size()) {
                    z17 = false;
                    break;
                } else {
                    if (((xg3.k0) ((java.util.LinkedList) list).get(i17)).c(j17)) {
                        z17 = true;
                        break;
                    }
                    i17++;
                }
            }
            if (z17) {
                ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).Ba(pt0.f0.Li(str, j17));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreExt", "msgId is out of range, " + j17);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreExt", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SubCoreExt", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z Di = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Di();
        if (Di != null) {
            Di.add(this.f416739p);
        }
        android.content.SharedPreferences d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();
        this.f416742s = d17.getBoolean("hasTryToInitVoiceControlData", false);
        f416729t = d17.getBoolean("hasCallVoiceControlApi", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreExt", "onAccountPostReset,hasTryToInit:%s,hasCallApi:%s", java.lang.Boolean.valueOf(this.f416742s), java.lang.Boolean.valueOf(f416729t));
        Vi(true);
        v62.e.d();
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(gm0.j1.u().d());
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
        com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
            if (m18.a()) {
                m18.f294799a.r(m18.f294800b);
            }
        }
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(gm0.j1.u().d() + "image/ext/pcm");
        java.lang.String str2 = a18.f294812f;
        if (str2 != null) {
            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l18)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m19 = b3Var.m(a18, null);
        if (!(m19.a() ? m19.f294799a.F(m19.f294800b) : false)) {
            com.p314xaae8f345.mm.vfs.z2 m27 = b3Var.m(a18, m19);
            if (m27.a()) {
                m27.f294799a.r(m27.f294800b);
            }
        }
        java.lang.String d18 = gm0.j1.u().d();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreExt", "summerpcm accPath[%s] [%s]", d18, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z Di = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Di();
        if (Di != null) {
            Di.mo49775xc84af884(this.f416739p);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5387x9a040bda c5387x9a040bda = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5387x9a040bda();
        c5387x9a040bda.f135721g.getClass();
        if (!c5387x9a040bda.e()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreExt", "ExtAgentLifeEvent event fail in onAccountRelease");
        }
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.l2.f270895f == null) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.l2.f270895f = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.l2();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.l2 l2Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.l2.f270895f;
        l2Var.getClass();
        if (gm0.j1.a()) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.l2.f270894e = false;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Ai().a(14, l2Var);
        }
        java.util.HashSet hashSet = v62.e.f515035a;
    }

    public void wi(java.lang.String str, java.util.LinkedList linkedList) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || linkedList == null || linkedList.size() <= 0) {
            return;
        }
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.l2.f270895f == null) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.l2.f270895f = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.l2();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.l2 l2Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.l2.f270895f;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.j2 j2Var = this.f416735i;
        l2Var.getClass();
        if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.l2.f270894e && gm0.j1.a()) {
            ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f Bi = zo3.p.Bi();
            Bi.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g(Bi, 14, l2Var));
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.l2.f270894e = true;
        }
        if (!gm0.j1.a() || context == null || linkedList.size() == 0) {
            return;
        }
        l2Var.f270896d = j2Var;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.k3 k3Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.k3(str, linkedList);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Ai().getClass();
        gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.v3(14, k3Var));
    }
}
