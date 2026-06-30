package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.q2.class)
/* loaded from: classes9.dex */
public class ro extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.q2, com.p314xaae8f345.mm.p944x882e457a.u0 {
    public final c01.r8 A;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d B;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d C;
    public android.view.View D;
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.a5 E;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d F;
    public final java.util.List G;

    /* renamed from: e, reason: collision with root package name */
    public boolean f281398e = false;

    /* renamed from: f, reason: collision with root package name */
    public final bm5.w0 f281399f;

    /* renamed from: g, reason: collision with root package name */
    public bm5.x0 f281400g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f281401h;

    /* renamed from: i, reason: collision with root package name */
    public long f281402i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.ref.WeakReference f281403m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f281404n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f281405o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.t2 f281406p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f281407q;

    /* renamed from: r, reason: collision with root package name */
    public int f281408r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f281409s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.concurrent.Future f281410t;

    /* renamed from: u, reason: collision with root package name */
    public long f281411u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f281412v;

    /* renamed from: w, reason: collision with root package name */
    public long f281413w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ap f281414x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.concurrent.Future f281415y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f281416z;

    public ro() {
        bm5.w0 w0Var = new bm5.w0() { // from class: com.tencent.mm.ui.chatting.component.ro$$a
            @Override // bm5.w0
            public final java.lang.Object a() {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro roVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro.this;
                yb5.d dVar = roVar.f280113d;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 v0Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0(dVar, roVar, dVar.x());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VoiceComponent", "getAutoPlayInstance autoPlay=%s", v0Var);
                roVar.f281416z = roVar.f280113d.x();
                w21.z0.f524052d.add(v0Var);
                java.util.ArrayList arrayList = (java.util.ArrayList) w21.k.f523934v;
                if (!arrayList.contains(v0Var)) {
                    arrayList.add(v0Var);
                }
                ig0.o oVar = (ig0.o) ((dg0.f) i95.n0.c(dg0.f.class));
                oVar.getClass();
                oVar.f372868o = new java.lang.ref.WeakReference(v0Var);
                roVar.v0(v0Var);
                v0Var.G(!roVar.f281398e);
                return v0Var;
            }
        };
        this.f281399f = w0Var;
        this.f281400g = new bm5.x0(w0Var);
        this.f281401h = false;
        this.f281404n = new java.util.concurrent.ConcurrentHashMap();
        this.f281405o = false;
        this.f281406p = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.to(this);
        this.f281407q = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f281408r = -1;
        this.f281409s = false;
        this.f281410t = null;
        this.f281411u = -1L;
        this.f281412v = false;
        this.f281413w = -1L;
        this.f281414x = null;
        this.f281415y = null;
        this.A = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.vo(this);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.B = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21680xcf828dda(this, a0Var);
        this.C = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6221xe44826f2>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.VoiceComponent$4
            {
                this.f39173x3fe91575 = 1250962690;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6221xe44826f2 c6221xe44826f2) {
                if (c6221xe44826f2 != null) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro roVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro.this;
                    roVar.f281407q.set(false);
                    roVar.f281412v = false;
                    roVar.x0();
                }
                return false;
            }
        };
        this.D = null;
        this.E = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xo(this);
        this.F = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6219xe6f3eb50>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.VoiceComponent$6
            {
                this.f39173x3fe91575 = -615338656;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6219xe6f3eb50 c6219xe6f3eb50) {
                if (!c6219xe6f3eb50.f136468g.f89034a) {
                    return false;
                }
                com.p314xaae8f345.mm.ui.p2740x696c9db.sd.f292275a.b(true);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro.this.n0();
                return false;
            }
        };
        this.G = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        c01.d9.e().a(127, this);
        this.B.mo48813x58998cd();
        this.C.mo48813x58998cd();
        this.f281407q.set(false);
        x0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 o07 = o0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VoiceComponent", "doDestroy, autoPlay:%s", o07);
        c01.d9.e().q(127, this);
        u0();
        if (o07 != null) {
            w21.z0.f524052d.remove(o07);
            ((java.util.ArrayList) w21.k.f523934v).remove(o07);
            ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).f372868o = null;
            if (o07.m()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AutoPlay", "destroySwitchToBack: ");
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0.U = o07;
                o07.f284305r = null;
                o07.f284304q = null;
                o07.A();
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro roVar = o07.f284306s;
                o07.M = roVar != null ? roVar.f281398e : o07.M;
                o07.f284306s = null;
            } else {
                o07.h();
                o07.r();
            }
            this.f281400g = new bm5.x0(this.f281399f);
        }
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p944x882e457a.c.f152127a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AsyncMediaPlayerWrapper", "dead, tag:".concat("VoiceComponent_playUploadVoiceSound"));
        java.util.HashMap hashMap2 = com.p314xaae8f345.mm.p944x882e457a.c.f152127a;
        com.p314xaae8f345.mm.p944x882e457a.j0 j0Var = (com.p314xaae8f345.mm.p944x882e457a.j0) hashMap2.get("VoiceComponent_playUploadVoiceSound");
        if (j0Var != null) {
            j0Var.f152188a.quitSafely();
        }
        hashMap2.remove("VoiceComponent_playUploadVoiceSound");
        this.F.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        c01.d9.e().q(127, this);
        java.util.concurrent.Future future = this.f281415y;
        if (future != null) {
            future.cancel(false);
        }
        this.B.mo48814x2efc64();
        this.C.mo48814x2efc64();
        this.f281404n.clear();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        this.F.mo48813x58998cd();
    }

    @Override // yn.d
    public void i0(android.view.View view, int i17, int i18, int i19, int i27) {
        if (i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingUI.VoiceComponent", "onScroll visibleItemCount == 0");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.f281413w;
        if (j17 != -1 && currentTimeMillis - j17 > 2000) {
            this.f281412v = false;
        }
        this.f281413w = currentTimeMillis;
        sb5.z zVar = (sb5.z) this.f280113d.f542241c.a(sb5.z.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ap apVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ap();
        int m17 = this.f280113d.m();
        int i28 = i17 - m17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e389 = kVar.mo75871xfb80e389(i28);
        if (mo75871xfb80e389 != null) {
            apVar.f280194a = mo75871xfb80e389.m124847x74d37ac6();
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e3892 = kVar.mo75871xfb80e389((i17 + 1) - m17);
            if (mo75871xfb80e3892 != null) {
                apVar.f280194a = mo75871xfb80e3892.m124847x74d37ac6();
            }
        }
        int i29 = i28 + i18 + 2;
        if (i29 > kVar.mo8143x7444f759() - 1) {
            i29 = kVar.mo8143x7444f759() - 1;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e3893 = kVar.mo75871xfb80e389(i29);
        if (mo75871xfb80e3893 != null) {
            apVar.f280195b = mo75871xfb80e3893.m124847x74d37ac6();
        }
        this.f281414x = apVar;
        if (!this.f281409s) {
            if (this.f281407q.get()) {
                this.f281412v = false;
                return;
            } else if (this.f281412v) {
                this.f281412v = false;
                return;
            } else {
                this.f281412v = true;
                x0();
                return;
            }
        }
        this.f281412v = false;
        java.util.concurrent.Future future = this.f281410t;
        if (future != null) {
            future.cancel(false);
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.yo yoVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.yo(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f281410t = t0Var.z(yoVar, 300L, false);
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VoiceComponent", "onScrollStateChanged %s", java.lang.Integer.valueOf(i17));
        this.f281412v = false;
        if (i17 != 0) {
            this.f281409s = true;
            return;
        }
        this.f281409s = false;
        if (this.f281407q.get()) {
            return;
        }
        x0();
    }

    public boolean m0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (!f9Var.g3()) {
            return false;
        }
        if (!c01.d9.b().E()) {
            db5.t7.k(this.f280113d.g(), this.f280113d.f542250l.m78646xc2a54588());
            return true;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 o07 = o0();
        if (o07 != null && f9Var.m124847x74d37ac6() == o07.f284299i) {
            o07.J(true);
        }
        if (!this.f280113d.x().equals("medianote")) {
            ((e21.z0) c01.d9.b().w()).c(new e21.n(f9Var.Q0(), f9Var.I0()));
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ic.f(f9Var);
        return true;
    }

    public final void n0() {
        boolean isHeld;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VoiceComponent", "voiceComponent doPause");
        this.f281401h = false;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.I4(this.f280113d.x())) {
            c01.n8.c();
            c01.t8 c17 = c01.n8.c();
            c01.r8 r8Var = this.A;
            zf4.l lVar = (zf4.l) c17;
            if (r8Var != null) {
                ((java.util.HashSet) lVar.f554209h).remove(r8Var);
            }
        }
        android.view.View view = this.D;
        if (view != null && view.getVisibility() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VoiceComponent", "doPause set voiceinputMask GONE");
            android.view.View view2 = this.D;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/VoiceComponent", "doPause", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/component/VoiceComponent", "doPause", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) this.f280113d.f542241c.a(sb5.s0.class))).f280796e.m75519x83731b3c(null);
        c01.d9.b().p().w(26, java.lang.Boolean.valueOf(this.f281398e));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 o07 = o0();
        if (o07 != null && o07.n()) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.sd sdVar = com.p314xaae8f345.mm.ui.p2740x696c9db.sd.f292275a;
            if (!(com.p314xaae8f345.mm.ui.p2740x696c9db.sd.f292278d ? com.p314xaae8f345.mm.ui.p2740x696c9db.sd.f292277c : true)) {
                this.f281405o = true;
                sdVar.b(true);
                com.p314xaae8f345.mm.app.w.INSTANCE.a(this.f281406p);
                return;
            }
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.sd.f292275a.b(true);
        synchronized (com.p314xaae8f345.mm.ui.ga.f290163x0) {
            android.os.PowerManager.WakeLock wakeLock = com.p314xaae8f345.mm.ui.ga.f290162w0;
            isHeld = wakeLock != null ? wakeLock.isHeld() : false;
        }
        if (isHeld || o07 == null) {
            return;
        }
        o07.h();
        o07.J(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlay", "AutoPlay release");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.s7 s7Var = o07.f284309v;
        if (s7Var != null) {
            s7Var.b();
        }
    }

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 o0() {
        return (com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0) this.f281400g.d();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        w21.w0 w0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VoiceComponent", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " sceneType:" + m1Var.mo808xfb85f7b0());
        this.f280113d.b();
        yb5.d dVar = this.f280113d;
        if (!dVar.f542247i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VoiceComponent", "onSceneEnd fragment not foreground, return");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.U0(dVar.g())) {
            android.app.Activity g17 = this.f280113d.g();
            boolean z17 = true;
            if (!com.p314xaae8f345.mm.ui.pc.a(g17, i17, i18, str, 7) && !com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.d.a(g17, i17, i18, new android.content.Intent().setClass(g17, com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), str)) {
                z17 = false;
            }
            if (!z17 && i17 == 0 && i18 == 0 && m1Var.mo808xfb85f7b0() == 127) {
                if (m1Var instanceof w21.o) {
                    w0Var = w21.x0.j(((w21.o) m1Var).f523965f);
                } else if ((m1Var.mo47948x7f0c4558() instanceof com.p314xaae8f345.mm.p944x882e457a.o) && (((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a instanceof r45.dv6)) {
                    return;
                } else {
                    w0Var = null;
                }
                if (w0Var == null || w0Var.f524025i != 99) {
                    return;
                }
                ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ri(this.f280113d.g());
            }
        }
    }

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 p0() {
        return (com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0) this.f281400g.b();
    }

    public boolean q0(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f281404n;
        if (concurrentHashMap.containsKey(java.lang.Long.valueOf(j17))) {
            return ((java.lang.Boolean) concurrentHashMap.get(java.lang.Long.valueOf(j17))).booleanValue();
        }
        return false;
    }

    public boolean r0() {
        boolean z17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) this.f280113d.f542241c.a(sb5.f.class))).f280286r;
        boolean z18 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) this.f280113d.f542241c.a(sb5.f.class))).f280287s;
        return z17 ? z18 ? ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) this.f280113d.f542241c.a(sb5.f.class))).f280277f.t0(1) : ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) this.f280113d.f542241c.a(sb5.f.class))).f280278g.t0(1) : ((this.f280113d.C() || z18) && this.f280113d.u().T == 0) || c01.e2.P(this.f280113d.u());
    }

    public boolean s0(long j17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 o07 = o0();
        return o07 != null && o07.n() && o07.f284299i == j17;
    }

    public void t0(com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010, boolean z17) {
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010.m78650x44cc8748()) {
            if (!z17) {
                abstractViewOnAttachStateChangeListenerC21400xb429b010.m78405xf1bfa104(-1);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VoiceComponent", "rotation %d", java.lang.Integer.valueOf(abstractViewOnAttachStateChangeListenerC21400xb429b010.m78396x537339e7().getDefaultDisplay().getOrientation()));
            int orientation = abstractViewOnAttachStateChangeListenerC21400xb429b010.m78396x537339e7().getDefaultDisplay().getOrientation();
            if (orientation == 0) {
                abstractViewOnAttachStateChangeListenerC21400xb429b010.m78405xf1bfa104(1);
                return;
            }
            if (orientation == 1) {
                abstractViewOnAttachStateChangeListenerC21400xb429b010.m78405xf1bfa104(0);
            } else if (orientation == 2) {
                abstractViewOnAttachStateChangeListenerC21400xb429b010.m78405xf1bfa104(9);
            } else {
                if (orientation != 3) {
                    return;
                }
                abstractViewOnAttachStateChangeListenerC21400xb429b010.m78405xf1bfa104(8);
            }
        }
    }

    public void u0() {
        this.f280113d.Q(false);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 o07 = o0();
        if (o07 != null && this.f281405o) {
            this.f281405o = false;
            o07.h();
            o07.J(false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlay", "AutoPlay release");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.s7 s7Var = o07.f284309v;
            if (s7Var != null) {
                s7Var.b();
            }
        }
        com.p314xaae8f345.mm.app.w.INSTANCE.p(this.f281406p);
        this.f281405o = false;
    }

    public final void v0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 v0Var) {
        qk.n D0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VoiceComponent", "resetAutoPlay autoPlay is:%s tid:%d looper:%s", v0Var, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), android.os.Looper.myLooper());
        java.lang.String str = this.f281416z;
        if (str == null || !str.equals(this.f280113d.x())) {
            java.lang.String x17 = this.f280113d.x();
            this.f281416z = x17;
            v0Var.g(x17);
        }
        boolean m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1((java.lang.Boolean) c01.d9.b().p().l(16387, null), true);
        if (!v0Var.C) {
            v0Var.f284312y = m17;
            v0Var.h();
        }
        qk.o x07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) this.f280113d.f542241c.a(sb5.f.class))).x0();
        if (x07 == null || (D0 = x07.D0(false)) == null) {
            return;
        }
        org.json.JSONObject jSONObject = D0.f445789a;
        if (jSONObject != null) {
            D0.f445803o = jSONObject.optInt("AudioPlayType", 0) == 1;
        }
        if (D0.f445803o) {
            v0Var.B = false;
        }
    }

    public void w0(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.ChattingUI.VoiceComponent", "setForceSpeakOff value is %s", java.lang.Boolean.valueOf(z17));
        sb5.z0 z0Var = (sb5.z0) this.f280113d.f542241c.a(sb5.z0.class);
        if (z17) {
            this.f281398e = true;
            c01.d9.b().p().w(26, java.lang.Boolean.TRUE);
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) z0Var).G0(0);
            dp.a.m125854x26a183b(this.f280113d.g(), this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdo), 0).show();
            yb5.d dVar = this.f280113d;
            dVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingContext", "[updateOptionMenuIcon] menuID:%d iconID:%s", 2, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78346x23500ba4));
            dVar.f542251m.m79564xf6ad1736(2, com.p314xaae8f345.mm.R.raw.f78346x23500ba4);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 o07 = o0();
            if (o07 != null) {
                o07.G(false);
                o07.K();
                return;
            }
            return;
        }
        this.f281398e = false;
        c01.d9.b().p().w(26, java.lang.Boolean.FALSE);
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) z0Var).G0(8);
        dp.a.m125854x26a183b(this.f280113d.g(), this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdp), 0).show();
        yb5.d dVar2 = this.f280113d;
        dVar2.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingContext", "[updateOptionMenuIcon] menuID:%d iconID:%s", 2, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78363xa99175a4));
        dVar2.f542251m.m79564xf6ad1736(2, com.p314xaae8f345.mm.R.raw.f78363xa99175a4);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 o08 = o0();
        if (o08 != null) {
            if (ym1.f.Ni()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VoiceComponent", "setForceSpeakOff true but isBluetoothOn");
            } else {
                o08.G(true);
            }
            o08.K();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VoiceComponent", "summeranrt resetAutoPlay looper[%s]", android.os.Looper.myLooper());
        this.f281401h = true;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 o07 = o0();
        if (!this.f281405o && o07 != null && !o07.m()) {
            v0(o07);
            o07.G(!this.f281398e);
            o07.s();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VoiceComponent", "summeranrt resetAutoPlay complete");
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.I4(this.f280113d.x())) {
            c01.n8.c();
            c01.t8 c17 = c01.n8.c();
            c01.r8 r8Var = this.A;
            zf4.l lVar = (zf4.l) c17;
            if (r8Var != null) {
                ((java.util.HashSet) lVar.f554209h).add(r8Var);
            }
        }
        if (!u11.c.g()) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) this.f280113d.f542241c.a(sb5.s0.class))).f280796e.m75519x83731b3c(this.E);
        }
        y0();
        com.p314xaae8f345.mm.app.w.INSTANCE.p(this.f281406p);
        com.p314xaae8f345.mm.ui.p2740x696c9db.sd.f292275a.b(true);
    }

    public void x0() {
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ej) ((sb5.p1) this.f280113d.f542241c.a(sb5.p1.class))).f280510e) {
            return;
        }
        sb5.z zVar = (sb5.z) this.f280113d.f542241c.a(sb5.z.class);
        java.util.ArrayList arrayList = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).I.f233598o;
        if (arrayList != null) {
            this.f281415y = ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.zo(this, arrayList, zVar));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 o07 = o0();
        if (o07 == null || !o07.m()) {
            n0();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VoiceComponent", "onChattingPause: background playing, skip pause");
        }
    }

    public void y0() {
        sb5.z0 z0Var = (sb5.z0) this.f280113d.f542241c.a(sb5.z0.class);
        sb5.d0 d0Var = (sb5.d0) this.f280113d.f542241c.a(sb5.d0.class);
        sb5.p1 p1Var = (sb5.p1) this.f280113d.f542241c.a(sb5.p1.class);
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5) d0Var).f280229g || ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ej) p1Var).f280510e || this.f280113d.E()) {
            this.f280113d.X(2, false);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe peVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) z0Var;
            peVar.G0(8);
            peVar.F0(8);
            return;
        }
        if (r0()) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) z0Var).F0(0);
        } else {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) z0Var).F0(8);
        }
        java.lang.Boolean bool = (java.lang.Boolean) c01.d9.b().p().l(26, null);
        if (bool == null) {
            this.f281398e = false;
        } else {
            this.f281398e = bool.booleanValue();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VoiceComponent", "triggerTitleIcon and setForceSpeakOff value is %s", java.lang.Boolean.valueOf(this.f281398e));
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) z0Var).G0(this.f281398e ? 0 : 8);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        y0();
    }
}
