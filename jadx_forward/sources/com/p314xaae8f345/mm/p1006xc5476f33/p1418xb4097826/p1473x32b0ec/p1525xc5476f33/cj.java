package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class cj implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f193689d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f193690e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f193691f;

    /* renamed from: g, reason: collision with root package name */
    public final cm2.t f193692g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f193693h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f193694i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f193695m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.ViewGroup f193696n;

    /* renamed from: o, reason: collision with root package name */
    public hq0.e0 f193697o;

    /* renamed from: p, reason: collision with root package name */
    public final p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f193698p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f193699q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View.OnAttachStateChangeListener f193700r;

    public cj(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, yz5.l lVar, cm2.t tVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f193689d = context;
        this.f193690e = buContext;
        this.f193691f = statusMonitor;
        this.f193692g = tVar;
        this.f193693h = "FinderLiveGamePromoteBubble";
        this.f193694i = "PORTRAIT_ACTIONFinderLiveGamePromoteBubble";
        this.f193695m = "PORTRAIT_ACTION_BUNDLE_OPEN_GAME_PROMOTION";
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dag, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f193696n = viewGroup;
        this.f193698p = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.b8g);
        this.f193700r = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xi(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGamePromoteBubble", "initGameBubble");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public cm2.t A() {
        return this.f193692g;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (string == null) {
            string = "";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string, this.f193694i)) {
            r45.n63 n63Var = new r45.n63();
            android.os.Bundle bundle2 = obj instanceof android.os.Bundle ? (android.os.Bundle) obj : null;
            byte[] byteArray = bundle2 != null ? bundle2.getByteArray(this.f193695m) : null;
            if (byteArray == null) {
                return;
            }
            try {
                n63Var.mo11468x92b714fd(byteArray);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void U() {
    }

    public final void a(android.view.ViewGroup viewGroup, r45.n63 n63Var, hq0.e0 e0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193693h, "createFrameSetView");
        android.content.Context context = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = new com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d(context, null, 0, 6, null);
        java.lang.String m75945x2fec8307 = n63Var.m75945x2fec8307(0);
        if (m75945x2fec8307 != null) {
            c10867x3e50a04d.e(m75945x2fec8307);
        }
        c10867x3e50a04d.setId(android.view.View.generateViewId());
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-1, -1);
        viewGroup.addView(c10867x3e50a04d);
        c10867x3e50a04d.setLayoutParams(layoutParams);
        c10867x3e50a04d.a(e0Var);
        c10867x3e50a04d.bringToFront();
        c10867x3e50a04d.getId();
        c(n63Var);
    }

    public final void b(cm2.u uVar) {
        android.view.ViewGroup viewGroup = this.f193696n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.eqy);
        ((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.b8g)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yi(this, uVar));
        if (zl2.r4.f555483a.y1(this.f193690e)) {
            c22699x3dcdb352.setVisibility(4);
        } else {
            c22699x3dcdb352.setVisibility(0);
            c22699x3dcdb352.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zi(uVar));
        }
    }

    public final void c(r45.n63 n63Var) {
        hq0.e0 e0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193693h, "updateDynamicBubbleData");
        java.lang.String m75945x2fec8307 = n63Var.m75945x2fec8307(0);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = n63Var.m75934xbce7f2f(1);
        java.lang.String i17 = m75934xbce7f2f != null ? m75934xbce7f2f.i() : null;
        n63Var.m75942xfb822ef2(2);
        if (m75945x2fec8307 == null || i17 == null) {
            return;
        }
        if (m75945x2fec8307.length() > 0) {
            if (!(i17.length() > 0) || (e0Var = this.f193697o) == null) {
                return;
            }
            hq0.e0.b(e0Var, i17, m75945x2fec8307, null, 4, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public int e0() {
        return com.p314xaae8f345.mm.R.id.eqy;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void f0(java.lang.Object data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data instanceof cm2.u) {
            cm2.u uVar = (cm2.u) data;
            b(uVar);
            c(uVar.f124933v);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    /* renamed from: getView */
    public android.view.View mo56902xfb86a31b() {
        return this.f193696n;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cj.l(java.lang.Object):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void l0() {
        java.lang.String str = this.f193693h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onBubbleDel");
        android.view.View.OnAttachStateChangeListener onAttachStateChangeListener = this.f193700r;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.f193698p;
        c1073x7e08a787.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "releaseDynamicCardEnv");
        this.f193699q = false;
        c1073x7e08a787.removeAllViews();
        hq0.e0 e0Var = this.f193697o;
        if (e0Var != null) {
            ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).Bi(e0Var.f364517e);
        }
        this.f193697o = null;
        ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).getClass();
        xg4.m mVar = xg4.m.f535979a;
        if (mVar.c()) {
            xg4.p pVar = xg4.m.f535980b;
            if (pVar != null) {
                pVar.C = null;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SurfaceApp.MagicLiveCardMgr", "setFinderLiveCallback not open!");
        }
        ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).getClass();
        mVar.a(2000L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    /* renamed from: onPause */
    public void mo56918xb01dfb57() {
        hq0.e0 e0Var = this.f193697o;
        if (e0Var != null) {
            e0Var.f();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    /* renamed from: onResume */
    public void mo56919x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193693h, "onResume");
        hq0.e0 e0Var = this.f193697o;
        if (e0Var != null) {
            e0Var.j();
        }
        hq0.e0 e0Var2 = this.f193697o;
        if (e0Var2 != null) {
            e0Var2.g();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public int p0() {
        return com.p314xaae8f345.mm.R.id.b8g;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void r0(android.os.Bundle bundle, long j17) {
    }
}
