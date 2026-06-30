package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* renamed from: com.tencent.mm.ui.chatting.BaseChattingUIFragment */
/* loaded from: classes11.dex */
public abstract class AbstractC21611x7536149b extends com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.fb, com.p314xaae8f345.mm.ui.p2650x55bb7a46.gb {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f279682r = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f279683d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f279684e;

    /* renamed from: f, reason: collision with root package name */
    public final yb5.d f279685f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y4 f279686g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w3 f279687h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f279688i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f279689m;

    /* renamed from: n, reason: collision with root package name */
    public pd5.l f279690n;

    /* renamed from: o, reason: collision with root package name */
    public long f279691o;

    /* renamed from: p, reason: collision with root package name */
    public long f279692p;

    /* renamed from: q, reason: collision with root package name */
    public int f279693q;

    public AbstractC21611x7536149b() {
        this.f279685f = new yb5.d(this, this, this);
        this.f279686g = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y4();
        this.f279687h = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w3();
        this.f279688i = false;
        this.f279689m = false;
        this.f279693q = 0;
        V0();
    }

    public abstract com.p314xaae8f345.mm.ui.zb A0();

    public ke5.f0 B0() {
        return null;
    }

    public abstract com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 C0();

    public boolean F0() {
        return true;
    }

    public boolean G0() {
        return J0(256) && !J0(128);
    }

    public boolean H0() {
        return J0(1024) && !J0(512);
    }

    public boolean J0(int i17) {
        return (i17 & this.f279693q) == 0;
    }

    public boolean K0() {
        yb5.d dVar = this.f279685f;
        boolean z17 = dVar.f542257s;
        boolean z18 = dVar.f542258t;
        boolean F0 = F0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseChattingUIFragment", "isOnDataSetChangedCalled = %s, isEnterOverTimeCalled = %s, hasLayoutAfterDataSetChanged = %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(F0));
        return (z17 && F0) || z18;
    }

    public void L0() {
        p0(128, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.o1(this));
    }

    public void M0() {
        p0(256, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p1(this));
    }

    public void N0() {
        p0(512, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.e1(this));
    }

    public void P0() {
        p0(1024, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.f1(this));
    }

    public void Q0(android.content.Context context) {
    }

    public void R0() {
    }

    public void T0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseChattingUIFragment", "resetEnterChattingAnimFlag() called");
        yb5.d dVar = this.f279685f;
        dVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingContext", "setOnDataSetChangedCalled:false");
        dVar.f542257s = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingContext", "setIsEnterOverTimeCalled:false");
        dVar.f542258t = false;
    }

    public void U0() {
    }

    public void V0() {
        android.os.Bundle bundle = new android.os.Bundle();
        if (!bundle.containsKey(getClass().getName())) {
            bundle.putInt(getClass().getName(), Integer.MAX_VALUE);
        }
        mo7562xe26dab14(bundle);
        this.f279690n = new pd5.l();
    }

    public abstract boolean W0();

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.fb
    /* renamed from: getFirstVisiblePosition */
    public int mo79389x2ce24761() {
        return C0().mo75757x2ce24761();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: getIdentityString */
    public s75.b mo78649xe9868365() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 u17 = this.f279685f.u();
        if (u17 == null || ((int) u17.E2) == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u17.d1())) {
            return new s75.b("");
        }
        if (u17.k2()) {
            return new s75.b("_bizContact");
        }
        java.lang.String d17 = u17.d1();
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.g1 g1Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.g1(this, d17);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        return new s75.b(t0Var.m(g1Var, 0L));
    }

    public void l0() {
        if (this.f279685f.f542247i || m78397x697ca065()) {
            if (J0(8) && !m78397x697ca065() && !H0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseChattingUIFragment", "[onPause] is never doResume before doPause! Because while entering ChattingUI, the app back to background.");
                x0();
                M0();
            }
            w0();
        }
    }

    public void m0() {
        yb5.d dVar = this.f279685f;
        if (dVar.f542247i) {
            x0();
            if (l75.d1.f398480c) {
                jx3.f.INSTANCE.d(25984, 401, "", "", "");
                l75.d1.f398481d = true;
                fp.r0.f346765a.f(mo78409x676b27cd());
            }
            if (this.f39298x5262fd1e || this.f279688i) {
                M0();
            }
            if (this.f39298x5262fd1e) {
                dVar.f542243e.l0();
            }
        }
    }

    public void n0() {
        if (this.f279685f.f542247i) {
            p0(4, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.j1(this));
        }
        if (getClass() == com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea.class) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) ((ob0.c3) i95.n0.c(ob0.c3.class))).Ai("Chat");
        }
    }

    public void o0() {
        if ((this.f279685f.f542247i || m78397x697ca065()) && !G0()) {
            if (J0(16)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseChattingUIFragment.Sys", "[onStop] activity:%s is never pause when stop coming!", this.f279684e);
                w0();
            }
            p0(32, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.m1(this));
        }
        if (getClass() == com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea.class) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) ((ob0.c3) i95.n0.c(ob0.c3.class))).Bi("Chat");
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityCreated */
    public final void mo7495x78cb4fa(android.os.Bundle bundle) {
        super.mo7495x78cb4fa(bundle);
        s0();
        if (this.f39298x5262fd1e || this.f279688i) {
            L0();
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityResult */
    public void mo7496x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo7496x9d4787cb(i17, i18, intent);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = java.lang.Boolean.valueOf(intent == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseChattingUIFragment", "onActivityResult return, requestCode:%d resultCode:%s data is null? %s", objArr);
        yb5.d dVar = this.f279685f;
        if (!dVar.f542247i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseChattingUIFragment", "[onActivityResult] not foreground, return, requestCode:%d", java.lang.Integer.valueOf(i17));
            return;
        }
        yb5.d dVar2 = (yb5.d) dVar.f542242d.f283499a.get();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = dVar2 != null ? dVar2.f542250l : null;
        if (abstractC21611x7536149b != null) {
            java.util.HashMap hashMap = (java.util.HashMap) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.e.f283498b.get(abstractC21611x7536149b);
            j45.g gVar = hashMap != null ? (j45.g) hashMap.remove(java.lang.Integer.valueOf(i17)) : null;
            if (gVar != null) {
                gVar.mo79431x9d4787cb(i17, i18, intent);
            }
        }
        dVar.f542243e.N(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onAttach */
    public final void mo7397x3b13c504(android.content.Context context) {
        super.mo7397x3b13c504(context);
        this.f279683d = mo7430x19263085().getClass().getName() + "@" + m7479x8cdac1b() + " @talker:%s";
        r0(context);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y4 y4Var = this.f279686g;
        yb5.d dVar = this.f279685f;
        dVar.z(yn.j.class, y4Var);
        dVar.z(yn.k.class, dVar.f542243e);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w3 w3Var = this.f279687h;
        dVar.z(yn.i.class, w3Var);
        dVar.z(yn.i.class, w3Var);
        for (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a3 a3Var : (java.util.List) ((jz5.n) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.d3.f280455b).mo141623x754a37bb()) {
            dVar.z(a3Var.f280136a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.d3.b(a3Var.f280137b));
        }
        java.util.ArrayList<java.lang.String> m78393x5ef8d750 = m78393x5ef8d750("key_intent_chatting_components");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (m78393x5ef8d750 != null) {
            java.util.Iterator<T> it = m78393x5ef8d750.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(java.lang.Class.forName((java.lang.String) it.next()));
                } catch (java.lang.Exception unused) {
                }
            }
        }
        java.util.Iterator it6 = ((java.util.ArrayList) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.d3.a(arrayList)).iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a3 a3Var2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a3) it6.next();
            dVar.z(a3Var2.f280136a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.d3.b(a3Var2.f280137b));
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        yb5.d dVar = this.f279685f;
        if (dVar.f542247i) {
            dVar.f542243e.R(configuration);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public final void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public final android.view.View mo7503x18bad100(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View mo7503x18bad100 = super.mo7503x18bad100(layoutInflater, viewGroup, bundle);
        android.view.ViewGroup.LayoutParams layoutParams = mo7503x18bad100.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        }
        mo7503x18bad100.setLayoutParams(layoutParams);
        return mo7503x18bad100;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public final void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseChattingUIFragment.Sys", "[onDestroy] activity:%s isForeground:%s isFinishing:%s", this.f279684e, java.lang.Boolean.valueOf(this.f279685f.f542247i), java.lang.Boolean.valueOf(m78397x697ca065()));
        p0(512, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.h1(this));
        t0();
        P0();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDetach */
    public final void mo7400x3f5eee52() {
        super.mo7400x3f5eee52();
        u0();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: onDragBegin */
    public void mo78674xe9fcb8b6() {
        this.f279685f.f542243e.T();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: onKeyDown */
    public boolean mo78345x1f03f0c2(int i17, android.view.KeyEvent keyEvent) {
        return this.f279685f.f542243e.d0(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public final void mo7512xb01dfb57() {
        super.mo7512xb01dfb57();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseChattingUIFragment.Sys", "[onPause] activity:%s isForeground:%s isFinishing:%s isExiting:%s", this.f279684e, java.lang.Boolean.valueOf(this.f279685f.f542247i), java.lang.Boolean.valueOf(m78397x697ca065()), java.lang.Boolean.valueOf(H0()));
        l0();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onRequestPermissionsResult */
    public void mo7516x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        super.mo7516x953457f1(i17, strArr, iArr);
        this.f279685f.f542243e.h0(i17, strArr, iArr);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public final void mo7517x57429eec() {
        super.mo7517x57429eec();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseChattingUIFragment.Sys", "[onResume] activity:%s isForeground:%s isFinishing:%s", this.f279684e, java.lang.Boolean.valueOf(this.f279685f.f542247i), java.lang.Boolean.valueOf(m78397x697ca065()));
        m0();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStart */
    public final void mo7405xb05099c3() {
        super.mo7405xb05099c3();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseChattingUIFragment.Sys", "[onStart] activity:%s isForeground:%s isFinishing:%s", this.f279684e, java.lang.Boolean.valueOf(this.f279685f.f542247i), java.lang.Boolean.valueOf(m78397x697ca065()));
        n0();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStop */
    public final void mo7406xc39f8281() {
        super.mo7406xc39f8281();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseChattingUIFragment.Sys", "[onStop] activity:%s isForeground:%s isFinishing:%s isEntering:%s", this.f279684e, java.lang.Boolean.valueOf(this.f279685f.f542247i), java.lang.Boolean.valueOf(m78397x697ca065()), java.lang.Boolean.valueOf(G0()));
        o0();
    }

    public final void p0(int i17, java.lang.Runnable runnable) {
        boolean z17 = false;
        if ((4 != i17 || !J0(2)) && ((8 != i17 || !J0(4)) && ((16 != i17 || !J0(8)) && ((32 != i17 || !J0(4)) && ((64 != i17 || !J0(2)) && (512 != i17 || !J0(256))))))) {
            z17 = true;
        }
        boolean J0 = J0(i17);
        if (!J0 || !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseChattingUIFragment", "catch! [check] %s flag:%x isNever:%s isStrict:%s", this.f279684e, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(J0), java.lang.Boolean.valueOf(z17));
            return;
        }
        this.f279693q |= i17;
        if (2 == i17) {
            q0(64);
        } else if (64 == i17) {
            q0(2);
        } else if (4 == i17) {
            q0(32);
        } else if (32 == i17) {
            q0(4);
        } else if (8 == i17) {
            q0(16);
        } else if (16 == i17) {
            q0(8);
        } else if (128 == i17) {
            q0(256);
        } else if (256 == i17) {
            q0(128);
        } else if (512 == i17) {
            q0(1024);
        } else if (1024 == i17) {
            q0(512);
        }
        runnable.run();
    }

    public final void q0(int i17) {
        this.f279693q = (~i17) & this.f279693q;
    }

    public void r0(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseChattingUIFragment", "[doAttach] activity:%s isPreLoaded:%b", this.f279684e, java.lang.Boolean.valueOf(this.f279688i));
    }

    public void s0() {
        p0(2, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.i1(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: supportNavigationSwipeBack */
    public boolean mo25471x430f73e() {
        if (this.f39298x5262fd1e) {
            return false;
        }
        gm0.j1.i();
        if (!zo.e.e(((km0.c) gm0.j1.p().a()).f390522c)) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseChattingUIFragment", "Running on a Chromebook, so we not support swipeback and so on");
        return false;
    }

    public void t0() {
        p0(64, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.n1(this));
    }

    public void u0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseChattingUIFragment", "[doDetach] activity:%s isPreLoaded:%b", this.f279684e, java.lang.Boolean.valueOf(this.f279688i));
        for (java.util.Map.Entry entry : this.f279685f.f542241c.f283495a.entrySet()) {
            if (entry.getValue() instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg) entry.getValue()).I();
            }
        }
    }

    public void w0() {
        p0(16, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.l1(this));
    }

    public void x0() {
        p0(8, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.k1(this));
    }

    public void y0(boolean z17, int i17) {
    }

    public abstract sb5.z z0();

    public AbstractC21611x7536149b(boolean z17) {
        super(z17);
        this.f279685f = new yb5.d(this, this, this);
        this.f279686g = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y4();
        this.f279687h = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w3();
        this.f279688i = false;
        this.f279689m = false;
        this.f279693q = 0;
        V0();
    }
}
