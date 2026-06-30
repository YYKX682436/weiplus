package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager */
/* loaded from: classes4.dex */
public class C16346x4deb5237 implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.Set f227334o = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f227335d;

    /* renamed from: e, reason: collision with root package name */
    public int f227336e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f227337f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f227338g = false;

    /* renamed from: h, reason: collision with root package name */
    public final fp.e f227339h = new fp.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);

    /* renamed from: i, reason: collision with root package name */
    public boolean f227340i = false;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f227341m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.a1 f227342n;

    public static java.lang.String a(java.lang.String str) {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16347xceed145b.U1 + "MMVideo_" + str.hashCode() + ".mp4";
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + "_luckymoney_story_video");
    }

    public static boolean c(int i17, java.lang.String str) {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_lucky_money_envelope_load_local_video_res_config, true);
        boolean z17 = i17 > 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && com.p314xaae8f345.mm.vfs.w6.j(str) && fj6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryVideoManager", "[hasLuckyMoneyEnvelopeLocalVideoRes] openConfig ：%s , subTypeID: %s, hasLocalRes: %s", java.lang.Boolean.valueOf(fj6), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public static void g(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, dn.k kVar, dn.n nVar) {
        boolean z18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryVideoManager", "trigger download video: %s, %s, %s", str, str2, str3);
        if (z17) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_close_redenv_story_video_preload_config, 1) == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryVideoManager", "can not preload video");
                z18 = false;
            } else {
                z18 = true;
            }
            if (!z18) {
                return;
            }
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        dn.o oVar = new dn.o();
        oVar.f323318d = "task_EnvelopeStoryVideoManager";
        oVar.f69601xaca5bdda = str;
        oVar.f69591xf9dbbe9c = str;
        oVar.M1 = str3;
        int i17 = z17 ? 2 : 1;
        oVar.H1 = i17;
        oVar.f69608x6ac8fea7 = 20;
        oVar.f323329p0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.u0(str3, elapsedRealtime);
        if (kVar != null) {
            oVar.f323320f = kVar;
        } else {
            oVar.f323320f = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.k0(str2);
        }
        oVar.Z = 3;
        oVar.f69595x6d25b0d9 = str2;
        oVar.f69593x419c9c3d = str4;
        oVar.G = true;
        oVar.f323348c2 = nVar;
        oVar.f69592xf1ebe47b = 4;
        oVar.f69610x4f5245a8 = 1;
        oVar.Y = i17;
        java.util.Set set = f227334o;
        if (z17) {
            if (((java.util.HashSet) set).contains(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EnvelopeStoryVideoManager", "contains preload task: %s", str);
                return;
            } else {
                ((java.util.HashSet) set).add(str);
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(oVar);
                return;
            }
        }
        if (((java.util.HashSet) set).contains(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryVideoManager", "need cancel preload task");
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(str);
        }
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        t21.o2.Di().f(oVar);
    }

    public void d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1) ((java.util.HashMap) this.f227341m).get(java.lang.Integer.valueOf(i17));
        if (b1Var != null) {
            j(b1Var);
            i(b1Var);
        }
    }

    public final void e(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var) {
        if (!b1Var.f227357d) {
            boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(a(b1Var.f227356c));
            boolean z17 = false;
            boolean z18 = b().getInt(b1Var.f227354a, 0) == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryVideoManager", "can play local: %s, %s", java.lang.Boolean.valueOf(j17), java.lang.Boolean.valueOf(z18));
            if (j17 && z18) {
                b1Var.f227362i = 1;
                z17 = true;
            } else {
                if (j17) {
                    b1Var.f227362i = 3;
                } else {
                    b1Var.f227362i = 2;
                }
                b().putInt(b1Var.f227354a, 0);
            }
            if (z17) {
                b1Var.f227366m.m66136x5351a029(true);
            }
        }
        b1Var.f227368o.bringToFront();
        b1Var.f227366m.mo48238x68ac462();
        b1Var.f227363j = 0L;
        b1Var.f227364k = 0L;
        b1Var.f227365l.set(1);
        if (!this.f227340i) {
            this.f227339h.b();
            this.f227340i = true;
        }
        b1Var.f227358e = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.g1.f227396d++;
        ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.g1.f227395c).add(b1Var.f227356c);
    }

    public void f() {
        java.util.Map map = this.f227341m;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((java.util.HashMap) map).size());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryVideoManager", "release video view: %s, %s", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        if (this.f227340i) {
            this.f227339h.a();
            this.f227340i = false;
        }
        for (java.util.Map.Entry entry : ((java.util.HashMap) map).entrySet()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1) entry.getValue();
            if (b1Var.f227360g > 0) {
                b1Var.f227361h = (int) (b1Var.f227361h + ((android.os.SystemClock.elapsedRealtime() / 1000) - b1Var.f227360g));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19228, b1Var.f227356c, java.lang.Integer.valueOf(b1Var.f227366m.mo61527x6d590e18()), 1, java.lang.Integer.valueOf(b1Var.f227362i), java.lang.Integer.valueOf(b1Var.f227366m.m66134xdd2dfd95()), java.lang.Integer.valueOf(b1Var.f227361h), 0, 0);
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1) entry.getValue()).f227366m.getParent() != null) {
                ((android.view.ViewGroup) ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1) entry.getValue()).f227366m.getParent()).removeView(((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1) entry.getValue()).f227366m);
                b1Var.f227366m.mo48239x360802();
            }
        }
        ((java.util.HashMap) map).clear();
        this.f227336e = -1;
    }

    public void h(android.content.Context context, android.widget.FrameLayout frameLayout, android.widget.ImageView imageView, android.widget.ProgressBar progressBar, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, boolean z17, boolean z18, boolean z19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryVideoManager", "update position: %s, %s, %s, %s", java.lang.Integer.valueOf(this.f227336e), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(z19), str);
        java.util.Map map = this.f227341m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i19));
        if (b1Var != null) {
            b1Var.f227359f = z19;
            j(b1Var);
            i(b1Var);
        }
        int i27 = this.f227336e;
        if (i19 == i27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EnvelopeStoryVideoManager", "skip same position");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i27));
        if (b1Var2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryVideoManager", "pause previous video");
            if (b1Var2.f227358e) {
                b1Var2.f227364k = b1Var2.f227366m.mo61523x898ffe25();
                b1Var2.f227366m.e();
            }
        }
        this.f227336e = i19;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryVideoManager", "preapre video view: %s", java.lang.Boolean.valueOf(z18));
            java.util.HashMap hashMap = (java.util.HashMap) map;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1) hashMap.get(java.lang.Integer.valueOf(i19));
            if (b1Var3 != null && b1Var3.f227366m != null) {
                b1Var3.f227359f = z19;
                j(b1Var3);
                i(b1Var3);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.n0(this, b1Var3), 200L);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16347xceed145b c16347xceed145b = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16347xceed145b(context);
            b1Var4.f227366m = c16347xceed145b;
            c16347xceed145b.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjy));
            b1Var4.f227356c = str;
            b1Var4.f227355b = java.util.UUID.randomUUID().toString();
            b1Var4.f227368o = imageView;
            b1Var4.f227372s = progressBar;
            b1Var4.f227357d = z18;
            b1Var4.f227359f = z19;
            b1Var4.f227367n = (android.view.ViewGroup) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.j7j);
            b1Var4.f227369p = (android.widget.ImageView) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.j7k);
            b1Var4.f227370q = (android.widget.ImageView) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.j0d);
            b1Var4.f227371r = (android.view.ViewGroup) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.j0b);
            b1Var4.f227373t = frameLayout;
            b1Var4.f227366m.mo64629xc2e9d13b(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16347xceed145b c16347xceed145b2 = b1Var4.f227366m;
            c16347xceed145b2.S1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.o0(this, b1Var4);
            c16347xceed145b2.mo61532x526554de(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.q0(this, b1Var4, i19));
            b1Var4.f227369p.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.r0(this, b1Var4));
            b1Var4.f227367n.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.s0(this, b1Var4));
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i17, i18);
            layoutParams.gravity = 17;
            frameLayout.addView(b1Var4.f227366m, 0, layoutParams);
            hashMap.put(java.lang.Integer.valueOf(i19), b1Var4);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.m0(this, b1Var4));
            b1Var4.f227366m.m66138x7ffb700f(b1Var4.f227355b);
            b1Var4.f227366m.m48235xbc2f47ad(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.z0(b1Var4, this));
            b1Var4.f227366m.m66137x76130139(b1Var4.f227357d);
            b1Var4.f227366m.h(false, b1Var4.f227356c, 0);
            b1Var4.f227354a = b1Var4.f227366m.mo48228x75e04be9();
            j(b1Var4);
            i(b1Var4);
            e(b1Var4);
        }
    }

    public final void i(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var) {
        boolean z17 = b1Var.f227366m.P1;
        if (z17) {
            b1Var.f227370q.setImageResource(com.p314xaae8f345.mm.R.raw.f80551xb83f56c9);
        } else {
            b1Var.f227370q.setImageResource(com.p314xaae8f345.mm.R.raw.f80561x5ef051d0);
        }
        b1Var.f227373t.setTag(com.p314xaae8f345.mm.R.id.ozk, java.lang.Boolean.valueOf(z17));
    }

    public final void j(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var) {
        if (b1Var.f227359f || !this.f227338g) {
            b1Var.f227370q.setVisibility(4);
            b1Var.f227366m.mo61536x764d819b(true);
        } else {
            b1Var.f227370q.setVisibility(0);
            b1Var.f227366m.mo61536x764d819b(this.f227337f);
        }
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: onUIDestroy */
    public void m66130x20b2fbc7() {
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
    /* renamed from: onUIPause */
    public void m66131xfe061103() {
        if (this.f227340i) {
            this.f227339h.a();
            this.f227340i = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1) ((java.util.HashMap) this.f227341m).get(java.lang.Integer.valueOf(this.f227336e));
        if (b1Var != null) {
            b1Var.f227366m.e();
        }
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
    /* renamed from: onUIResume */
    public void m66132xc65d3ec0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1) ((java.util.HashMap) this.f227341m).get(java.lang.Integer.valueOf(this.f227336e));
        if (b1Var != null) {
            b1Var.f227366m.g();
            if (b1Var.f227366m.mo61531xc00617a4()) {
                this.f227339h.b();
                this.f227340i = true;
            }
        }
    }
}
