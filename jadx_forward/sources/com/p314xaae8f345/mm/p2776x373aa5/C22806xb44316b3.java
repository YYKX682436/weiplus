package com.p314xaae8f345.mm.p2776x373aa5;

/* renamed from: com.tencent.mm.view.SmileyPanelImpl */
/* loaded from: classes15.dex */
public class C22806xb44316b3 extends com.p314xaae8f345.mm.api.AbstractC4989x9e6071f3 implements p012xc85e97e9.p093xedfae76a.v {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d f294995f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f294996g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f294997h;

    public C22806xb44316b3(android.content.Context context, boolean z17) {
        this(context, null, z17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    public void a() {
        if (this.f294997h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "destroy: has destroyed");
            return;
        }
        this.f294997h = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "destroy: ");
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = this.f294995f;
        dVar.Z.mo48814x2efc64();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "onDestroy %s", dVar);
        dVar.c();
        dVar.E.a();
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().a();
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().mo132987xac79a11b();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    public void b() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    public void c() {
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = this.f294995f;
        dVar.g(false, false);
        dVar.f(false, false);
        dVar.j(false);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    public void d(boolean z17) {
        this.f294995f.i(false);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    public void e(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "hideSmiley: %B, hideEmojiSmiley: %B", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    public void f(boolean z17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f294995f.f295163f;
        if (c1163xf1deaba4 instanceof com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.C10438x8ba389e6) {
            ((com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.C10438x8ba389e6) c1163xf1deaba4).f146432d2 = z17;
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    public void g(int i17, boolean z17) {
        p012xc85e97e9.p016x746ad0e3.app.n nVar = this.f294995f.F;
        if (nVar instanceof com.p314xaae8f345.mm.ui.p2740x696c9db.c5) {
            ((com.p314xaae8f345.mm.ui.p2740x696c9db.c5) nVar).w2(i17, z17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: getPanelSlideIndicator */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.h1 mo75327x3779534c() {
        return this.f294995f.f295168k;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onPause");
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().a();
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = this.f294995f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "saveSelectedTab: %s", dVar.f295160c);
        gr.t g17 = gr.t.g();
        g17.f356227m = dVar.f295160c;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            gm0.j1.u().c().w(-29414086, g17.f356227m);
        } else {
            h65.c.f360853b.a(-29414086, g17.f356227m);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    public void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onResume");
        boolean z17 = this.f294996g;
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = this.f294995f;
        if (!z17) {
            this.f294996g = true;
            dVar.f295176s.b();
            dVar.f295175r.getClass();
        }
        dVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "onResumeAgain");
        if (dVar.f295159b) {
            dVar.b(dVar.f295157a);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    public void j() {
        this.f294995f.a();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    public void k() {
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = this.f294995f;
        dVar.getClass();
        dVar.f295175r.f375385k = gr.v.f356229a.c();
        dVar.f295176s.b();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    public void l() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    public void m() {
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = this.f294995f;
        dVar.getClass();
        boolean z17 = !((se0.e) ((te0.e) i95.n0.c(te0.e.class))).m164332x74219ae7();
        ir.h hVar = dVar.f295175r;
        hVar.f375376b = z17;
        hVar.f375377c = true;
        hVar.f375378d = true;
        hVar.f375379e = true;
        hVar.f375381g = true;
        hVar.f375383i = true;
        hVar.f375389o = null;
        hVar.f375382h = true;
        hVar.f375380f = true;
        hVar.f375385k = gr.v.f356229a.c();
        dVar.f295176s.b();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    public void n() {
        this.f294995f.e(0);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    public void o(boolean z17, boolean z18) {
        this.f294995f.f(z17, z18);
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: onActivityDestroy */
    public void m82740x2711d60c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onActivityDestroy:%s", getContext());
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onAttachedToWindow");
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = this.f294995f;
        if (dVar.f295162e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "listener added %s", dVar);
            return;
        }
        dVar.f295162e = true;
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().f(dVar.T);
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().b(dVar.U);
        dVar.V.mo48813x58998cd();
        dVar.W.mo48813x58998cd();
        pr.z zVar = pr.k0.f439256q;
        pr.b1 b17 = zVar.b(false);
        pr.e0 e0Var = dVar.f295158a0;
        b17.f(e0Var);
        zVar.a(false).f(e0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "SmileyPanelManager add listener. %s", dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onDetachedFromWindow");
        this.f294995f.c();
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.g1 g1Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onSizeChanged: %s, %s; %s, %s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        super.onSizeChanged(i17, i18, i19, i27);
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = this.f294995f;
        if (dVar != null) {
            android.content.Context context = dVar.f295157a;
            boolean z17 = context.getResources().getConfiguration().orientation == 1;
            lr.a1 a1Var = dVar.B;
            a1Var.d(i17);
            lr.b0 b0Var = dVar.A;
            b0Var.d(i17);
            int i28 = a1Var.f402094b;
            ir.h hVar = dVar.f295175r;
            hVar.f375393s = i28;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.w_);
            android.view.ViewGroup.LayoutParams layoutParams = dVar.f295172o.getLayoutParams();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "updateViewSize: %s, %s, %s, canShowIntro:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(dimensionPixelSize), java.lang.Boolean.valueOf(z17));
            if (i18 >= dimensionPixelSize * 4) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561911w9);
            }
            if (layoutParams.height != dimensionPixelSize) {
                layoutParams.height = dimensionPixelSize;
                dVar.f295172o.setLayoutParams(layoutParams);
                dVar.f295172o.post(new com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.l(dVar));
            }
            if (hVar.f375384j != z17) {
                hVar.f375384j = z17;
                dVar.f295176s.b();
            }
            dVar.O.f420570d = a1Var.f402094b;
            dVar.Q.f420592g = b0Var.f402094b;
            ym5.f0 f0Var = dVar.f295168k;
            if (f0Var == null || (g1Var = f0Var.f544811d) == null) {
                return;
            }
            g1Var.c(i19, i27, i17, i18);
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.m mVar) {
        if (mVar == p012xc85e97e9.p093xedfae76a.m.ON_DESTROY) {
            m82740x2711d60c();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    public void p(boolean z17, boolean z18) {
        this.f294995f.g(z17, z18);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    public void q(android.content.Context context, int i17, java.lang.Runnable runnable) {
        this.f294995f.l(context, i17, runnable);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setCallback */
    public void mo75328x6c4ebec7(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.j6 j6Var) {
        super.mo75328x6c4ebec7(j6Var);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9 v9Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9) j6Var;
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = this.f294995f;
        dVar.C = v9Var;
        dVar.f295167j.f402101d = v9Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setDefaultEmojiByDetail */
    public void mo75329x5b0da8af(java.lang.String str) {
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = this.f294995f;
        dVar.d(str);
        dVar.Z.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setEmojiPanelBackground */
    public void mo75330x69d254ae(int i17) {
        this.f294995f.f295173p.setBackgroundResource(i17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (r3 != 3) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setEntranceScene */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo75331xef640234(int r7) {
        /*
            r6 = this;
            com.tencent.mm.view.manager.d r0 = r6.f294995f
            nr.j r1 = r0.Q
            r1.f420588c = r7
            nr.c r1 = r0.O
            r1.f420569c = r7
            nr.h r1 = r0.R
            r1.f420581b = r7
            nr.i r1 = r0.P
            r1.f420584b = r7
            ir.h r1 = r0.f295175r
            int r2 = r1.f375375a
            r1.f375375a = r7
            int r3 = r0.f295156J
            java.lang.Class<k12.s> r4 = k12.s.class
            i95.m r4 = i95.n0.c(r4)
            k12.s r4 = (k12.s) r4
            g30.h r4 = (g30.h) r4
            s25.b r4 = r4.Bi()
            boolean r4 = r4.p()
            if (r4 == 0) goto L3a
            r4 = 1
            if (r7 == r4) goto L3b
            if (r3 == r4) goto L3b
            r5 = 2
            if (r3 == r5) goto L3b
            r5 = 3
            if (r3 != r5) goto L3a
            goto L3b
        L3a:
            r4 = 0
        L3b:
            r1.f375382h = r4
            if (r2 == r7) goto L44
            ir.o r1 = r0.f295176s
            r1.b()
        L44:
            lr.p r1 = r0.f295167j
            r1.f402098a = r7
            r0.G = r7
            nr.e r7 = r0.N
            r7.getClass()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2776x373aa5.C22806xb44316b3.mo75331xef640234(int):void");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setExpandedForReport */
    public void mo75332x1639a62(boolean z17) {
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = this.f294995f;
        nr.j jVar = dVar.Q;
        jVar.getClass();
        jVar.f420596k = z17 ? 1 : 2;
        nr.c cVar = dVar.O;
        cVar.getClass();
        cVar.f420572f = z17 ? 1 : 2;
    }

    @Override // com.p314xaae8f345.mm.api.AbstractC4989x9e6071f3
    /* renamed from: setExtraInfoForReport */
    public void mo42940x1cc70c21(java.lang.String str) {
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = this.f294995f;
        nr.i iVar = dVar.P;
        iVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        iVar.f420585c = str;
        dVar.O.f420573g = str;
        dVar.Q.f420593h = str;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setFinishButtonTitle */
    public void mo75333x567edf71(java.lang.String value) {
        ir.h hVar = this.f294995f.f295175r;
        hVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        hVar.f375390p = value;
        java.util.Iterator it = hVar.f375394t.iterator();
        while (it.hasNext()) {
            ((yz5.a) it.next()).mo152xb9724478();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setHBScene */
    public void mo75335xa4269d10(int i17) {
        this.f294995f.f295156J = i17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setHideSearchJumpMoreEntrance */
    public void mo75336x2f0ae025(boolean z17) {
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = this.f294995f;
        dVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "setHideSearchDialogJumpMoreEntrance: %b", java.lang.Boolean.valueOf(z17));
        dVar.f295181x = z17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setInitSelectTab */
    public void mo75337x4687b087(java.lang.String str) {
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = this.f294995f;
        dVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "setInitSelectTab: %s", str);
        dVar.K = str;
        dVar.d(str);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setOnEmojiSelectTabChangeListener */
    public void mo75338xb079d938(com.p314xaae8f345.mm.p2470x93e71c27.ui.j0 j0Var) {
        super.mo75338xb079d938(j0Var);
        this.f294995f.L = j0Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setOnTextOperationListener */
    public void mo75339x5e04422d(com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 k0Var) {
        super.mo75339x5e04422d(k0Var);
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = this.f294995f;
        dVar.D = k0Var;
        dVar.f295167j.f402102e = k0Var;
        dVar.f295164g.f402142p = k0Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setPanelBackgroundColor */
    public void mo75340xf103c7b3(int i17) {
        this.f294995f.f295173p.setBackgroundColor(i17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setPanelForeground */
    public void mo75341x433905a5(android.graphics.drawable.Drawable drawable) {
        this.f294995f.f295173p.setForeground(drawable);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setPortHeightPx */
    public void mo75342x4b0766b2(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setSearchDialogForceDarkMode */
    public void mo75343xf6f3b4d2(boolean z17) {
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = this.f294995f;
        dVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "setSearchDialogForceDarkMode: %b", java.lang.Boolean.valueOf(z17));
        dVar.f295180w = z17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setSearchIncludeCustom */
    public void mo75344xc0fe85af(boolean z17) {
        this.f294995f.I = z17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setSearchSource */
    public void mo75345x9e226965(int i17) {
        this.f294995f.H = i17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setSendButtonEnable */
    public void mo75346x768d9f7f(boolean z17) {
        ir.h hVar = this.f294995f.f295175r;
        hVar.f375392r = z17;
        java.util.Iterator it = hVar.f375394t.iterator();
        while (it.hasNext()) {
            ((yz5.a) it.next()).mo152xb9724478();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setShowClose */
    public void mo75347xe8c09ab9(boolean z17) {
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = this.f294995f;
        dVar.f295171n.setVisibility(z17 ? 0 : 8);
        if (z17) {
            dVar.f295170m.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f78022xcc9732f1);
            return;
        }
        android.view.View view = dVar.f295170m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        android.util.TypedValue typedValue = new android.util.TypedValue();
        view.getContext().getTheme().resolveAttribute(com.p314xaae8f345.mm.R.C30857x2dd9f1.f559779en, typedValue, true);
        dVar.f295170m.setBackgroundResource(typedValue.resourceId);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setShowGame */
    public void mo75348x625a7311(boolean z17) {
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = this.f294995f;
        ir.h hVar = dVar.f295175r;
        boolean z18 = z17 != hVar.f375379e;
        hVar.f375379e = z17;
        if (z18) {
            dVar.f295176s.b();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setShowSearch */
    public void mo75349x4a374107(boolean z17) {
        boolean m164332x74219ae7 = ((se0.e) ((te0.e) i95.n0.c(te0.e.class))).m164332x74219ae7();
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = this.f294995f;
        if (!m164332x74219ae7) {
            dVar.h(z17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "is teenMode, not show search");
            dVar.h(false);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setShowSend */
    public void mo75350x625ff6a7(boolean z17) {
        this.f294995f.i(z17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setShowSmiley */
    public void mo75351x4aab89d0(boolean z17) {
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = this.f294995f;
        dVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "setShowSmiley: %s", java.lang.Boolean.valueOf(z17));
        dVar.f295175r.f375377c = z17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setShowStore */
    public void mo75352xe9a5b5a2(boolean z17) {
        this.f294995f.j(z17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setSmileyPanelExpandable */
    public void mo75353x743d8625(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "setSmileyPanelExpandable: %s", java.lang.String.valueOf(z17));
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = this.f294995f;
        ir.h hVar = dVar.f295175r;
        if (z17 != hVar.f375387m) {
            hVar.f375387m = z17;
            dVar.f295164g.m8146xced61ae5();
        }
        ym5.f0 f0Var = dVar.f295168k;
        if (f0Var == null) {
            return;
        }
        if (z17) {
            f0Var.f544820m = null;
            f0Var.f544821n = true;
            return;
        }
        if (!f0Var.c()) {
            f0Var.f544821n = false;
            return;
        }
        f0Var.f544820m = new ym5.c0(f0Var);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.g1 g1Var = f0Var.f544811d;
        if (g1Var != null) {
            g1Var.d();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6406xa2da930f c6406xa2da930f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6406xa2da930f();
        c6406xa2da930f.f137538d = java.lang.System.currentTimeMillis();
        f0Var.f(0, 500);
        c6406xa2da930f.f137539e = 2L;
        c6406xa2da930f.f137540f = (f0Var.f544827t != null ? r3.f420576a : 0) + 1;
        c6406xa2da930f.k();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.g1 g1Var2 = f0Var.f544811d;
        if (g1Var2 != null) {
            g1Var2.f(f0Var.f544826s == f0Var.f544823p);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setSmileyPanelExpandableOnSimpleMode */
    public void mo75354x8aa5e079(boolean z17) {
        mo75353x743d8625(z17);
        ym5.f0 f0Var = this.f294995f.f295168k;
        if (f0Var != null) {
            if (z17) {
                f0Var.f544811d = new com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.c(f0Var, this);
            } else {
                f0Var.f544811d = null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setTabBackgroundColor */
    public void mo75355xb8211682(int i17) {
        this.f294995f.f295170m.setBackgroundColor(i17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setTabBackgroundResource */
    public void mo75356x63a2948f(int i17) {
        this.f294995f.f295170m.setBackgroundResource(i17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setTalkerName */
    public void mo75357x9d98e686(java.lang.String str) {
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = this.f294995f;
        dVar.f295178u = str;
        dVar.f295167j.f402103f = str;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !(com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(str));
        ir.h hVar = dVar.f295175r;
        boolean z18 = hVar.f375379e;
        ir.o oVar = dVar.f295176s;
        if (z18 != z17) {
            hVar.f375379e = z17;
            oVar.b();
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.a4(dVar.f295178u) && hVar.f375381g) {
            hVar.f375381g = false;
            oVar.b();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291
    /* renamed from: setToSendText */
    public void mo75358x658d5272(java.lang.String str) {
        this.f294995f.f295179v = str;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291, android.view.View
    public void setVisibility(int i17) {
        int i18;
        super.setVisibility(i17);
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = this.f294995f;
        if (i17 == 0) {
            dVar.a();
            dVar.getClass();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            nr.c cVar = dVar.O;
            cVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmojiClickReport", "panelShow");
            cVar.f420567a = currentTimeMillis;
            cVar.f420568b = 1;
            nr.j jVar = dVar.Q;
            jVar.f420586a = currentTimeMillis;
            jVar.f420587b = 1;
            nr.h hVar = dVar.R;
            hVar.f420580a = currentTimeMillis;
            hVar.f420582c = 1;
            nr.i iVar = dVar.P;
            iVar.f420583a = currentTimeMillis;
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(dVar.f295177t == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "panelData is null: %b", objArr);
            ir.j0 j0Var = dVar.f295177t;
            if (j0Var != null && (i18 = dVar.f295161d) >= 0 && i18 < ((ir.q) j0Var).f375424b.size()) {
                ir.j0 j0Var2 = dVar.f295177t;
                int i19 = dVar.f295161d;
                ir.q qVar = (ir.q) j0Var2;
                iVar.a(qVar.f375426d + i19, ((ir.r) qVar.f375424b.get(i19)).c());
            }
        } else {
            dVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "onPause: ");
            dVar.f295159b = false;
            dVar.E.a();
            if (!com.p314xaae8f345.mm.p2614xca6eae71.c0.f274765h) {
                com.p314xaae8f345.mm.p2614xca6eae71.c0.f274765h = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiOcrService", "pause");
                p3325xe03a0797.p3326xc267989b.l.d(com.p314xaae8f345.mm.p2614xca6eae71.c0.f274760c, null, null, new com.p314xaae8f345.mm.p2614xca6eae71.u(null), 3, null);
            }
        }
        ym5.f0 f0Var = dVar.f295168k;
        if (f0Var != null) {
            boolean z17 = i17 == 0;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.g1 g1Var = f0Var.f544811d;
            if (g1Var != null) {
                g1Var.e(z17);
            }
        }
    }

    public C22806xb44316b3(android.content.Context context, android.util.AttributeSet attributeSet, boolean z17) {
        super(new com.p314xaae8f345.mm.ui.xb(context, z17 ? com.p314xaae8f345.mm.R.C30868x68b1db1.f575689fo : com.p314xaae8f345.mm.R.C30868x68b1db1.f575688fn), attributeSet);
        this.f294996g = false;
        this.f294997h = false;
        final com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = new com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d(getContext());
        this.f294995f = dVar;
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a77, this);
        ym5.f0 f0Var = dVar.f295168k;
        f0Var.f544809b = inflate;
        dVar.f295163f = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) inflate.findViewById(com.p314xaae8f345.mm.R.id.dcv);
        dVar.f295173p = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22717x128919c4) inflate.findViewById(com.p314xaae8f345.mm.R.id.dcb);
        lr.p pVar = new lr.p(dVar.f295175r.f375375a, dVar.Q, dVar.O);
        dVar.f295167j = pVar;
        pVar.f402105h = dVar.f295156J;
        lr.x xVar = dVar.f295164g;
        xVar.f402141o = pVar;
        dVar.f295163f.mo7967x900dcbe1(dVar.f295165h);
        dVar.f295163f.mo7960x6cab2c8d(xVar);
        dVar.f295163f.m7963x830bc99d(true);
        dVar.f295163f.setFocusable(false);
        mr.i iVar = dVar.f295166i;
        iVar.f412359n = new mr.a() { // from class: com.tencent.mm.view.manager.d$$b
            @Override // mr.a
            /* renamed from: onPageSelected */
            public final void mo71861x510f45c9(int i17) {
                com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d.this.k(i17, true);
            }
        };
        iVar.b(dVar.f295163f);
        dVar.f295169l = inflate.findViewById(com.p314xaae8f345.mm.R.id.t7s);
        dVar.f295172o = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) inflate.findViewById(com.p314xaae8f345.mm.R.id.n0t);
        lr.c1 onItemClickListener = dVar.X;
        lr.f1 f1Var = dVar.f295174q;
        f1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemClickListener, "onItemClickListener");
        f1Var.f402051f = onItemClickListener;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = dVar.f295172o;
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c1163xf1deaba4.getContext(), 0, false));
        dVar.f295172o.mo7960x6cab2c8d(f1Var);
        dVar.f295172o.m7964x8d4ad49c(null);
        dVar.f295172o.i(dVar.Y);
        dVar.f295170m = inflate.findViewById(com.p314xaae8f345.mm.R.id.dcy);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.dcc);
        dVar.f295171n = imageView;
        imageView.setOnClickListener(new com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.j(dVar));
        f0Var.f544827t = dVar.N;
        pVar.f402104g = new yz5.a() { // from class: com.tencent.mm.view.manager.d$$c
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar2 = com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d.this;
                java.lang.String str = dVar2.f295160c;
                ir.h hVar = dVar2.f295175r;
                hVar.f375389o = str;
                hVar.f375385k = gr.v.f356229a.c();
                dVar2.f295176s.b();
                return jz5.f0.f384359a;
            }
        };
        if (context instanceof p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) {
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) context;
            activityC1102x9ee2d9f.runOnUiThread(new ym5.d5(this, activityC1102x9ee2d9f));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            pr.z zVar = pr.k0.f439256q;
            zVar.b(false).b(true);
            zVar.a(false).b(true);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                pm0.v.L("EmojiPackSyncManager_checkStart", true, pr.l.f439277d);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                pm0.v.L("EmojiSuggestWordsSync_checkWordListUpdate", true, jr.k.f382842d);
            }
            ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).getClass();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ai().b();
        }
    }
}
