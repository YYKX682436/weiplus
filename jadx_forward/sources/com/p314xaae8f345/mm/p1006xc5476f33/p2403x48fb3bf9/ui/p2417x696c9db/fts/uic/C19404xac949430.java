package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC */
/* loaded from: classes8.dex */
public final class C19404xac949430 extends wm3.a implements qx4.a {

    /* renamed from: d, reason: collision with root package name */
    public int f266173d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f266174e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f266175f;

    /* renamed from: g, reason: collision with root package name */
    public final long f266176g;

    /* renamed from: h, reason: collision with root package name */
    public final tg0.r1 f266177h;

    /* renamed from: i, reason: collision with root package name */
    public final tg0.q1 f266178i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19405x23ae79b9 f266179m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f266180n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f266181o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC$onFullScreenEvent$1] */
    public C19404xac949430(final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f266176g = java.lang.System.currentTimeMillis();
        this.f266177h = (tg0.r1) i95.n0.c(tg0.r1.class);
        this.f266178i = new rx4.e(activity, this);
        this.f266179m = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6264x49f83c2>() { // from class: com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC$onFullScreenEvent$1
            {
                super(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112.this);
                this.f39173x3fe91575 = 1712514994;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6264x49f83c2 c6264x49f83c2) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6264x49f83c2 event = c6264x49f83c2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112.this;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19396xdd9ccea5 activityC19396xdd9ccea5 = activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19396xdd9ccea5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19396xdd9ccea5) activityC0065xcd7aa112 : null;
                if (!(activityC19396xdd9ccea5 != null && activityC19396xdd9ccea5.M3)) {
                    return true;
                }
                if (event.f136514g.f88429a != ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19396xdd9ccea5) activityC0065xcd7aa112).f265799x4) {
                    return false;
                }
                ((ku5.t0) ku5.t0.f394148d).B(rx4.g.f482687d);
                return true;
            }
        };
        this.f266181o = new rx4.f(this);
    }

    public final void T6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "Hide flutter");
        this.f266180n = false;
        android.view.ViewGroup viewGroup = this.f266174e;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        new android.os.Handler(android.os.Looper.getMainLooper()).removeCallbacks(this.f266181o);
        ((sg0.w2) this.f266177h).nj(false, java.lang.Long.valueOf(this.f266176g));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x02c3, code lost:
    
        if (r8 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x02e0, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02de, code lost:
    
        if (r8 == false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0300  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U6(java.lang.String r28, boolean r29, boolean r30, java.util.Map r31) {
        /*
            Method dump skipped, instructions count: 1203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430.U6(java.lang.String, boolean, boolean, java.util.Map):void");
    }

    public final void V6(java.lang.String query, boolean z17, java.util.Map map) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showFlutterAndStartSearch visibility ");
        android.view.ViewGroup viewGroup = this.f266174e;
        sb6.append(viewGroup != null ? java.lang.Integer.valueOf(viewGroup.getVisibility()) : null);
        sb6.append(" flutterInit ");
        sb6.append(this.f266175f);
        sb6.append(" query ");
        sb6.append(query);
        sb6.append(" cgiParams ");
        sb6.append(map);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", sb6.toString());
        U6(query, z17, false, map);
        java.lang.Long valueOf = java.lang.Long.valueOf(this.f266176g);
        sg0.w2 w2Var = (sg0.w2) this.f266177h;
        w2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3325xe03a0797.p3326xc267989b.y0 b17 = p3325xe03a0797.p3326xc267989b.z0.b();
        p3325xe03a0797.p3326xc267989b.l.d(b17, null, null, new sg0.q2(w2Var, valueOf, query, z17, map, b17, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        jz5.f0 f0Var;
        mo48813x58998cd();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "onCreate");
        if (bundle != null) {
            this.f266173d = bundle.getInt("ftsbizscene", 0);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f266173d = m158354x19263085().getIntent().getIntExtra("ftsbizscene", 0);
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.cg7);
        if (frameLayout != null) {
            float f17 = m158354x19263085().getResources().getDisplayMetrics().density;
            android.view.View inflate = android.view.LayoutInflater.from(m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.efd, (android.view.ViewGroup) null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
            frameLayout.addView(viewGroup);
            this.f266174e = viewGroup;
            viewGroup.setVisibility(8);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate, add flutter container, width: ");
            android.view.ViewGroup viewGroup2 = this.f266174e;
            sb6.append(viewGroup2 != null ? java.lang.Integer.valueOf(viewGroup2.getWidth()) : null);
            sb6.append(", height: ");
            android.view.ViewGroup viewGroup3 = this.f266174e;
            sb6.append(viewGroup3 != null ? java.lang.Integer.valueOf(viewGroup3.getHeight()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", sb6.toString());
        }
        ((yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class))).aj(0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "onDestroy");
        mo48814x2efc64();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "Destroy flutter");
        long j17 = this.f266176g;
        sg0.w2 w2Var = (sg0.w2) this.f266177h;
        w2Var.getClass();
        p3325xe03a0797.p3326xc267989b.y0 b17 = p3325xe03a0797.p3326xc267989b.z0.b();
        p3325xe03a0797.p3326xc267989b.l.d(b17, null, null, new sg0.l2(j17, w2Var, b17, null), 3, null);
        new android.os.Handler(android.os.Looper.getMainLooper()).removeCallbacks(this.f266181o);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "onPause");
        this.f266177h.getClass();
        super.mo2281xb01dfb57();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "onResume");
        ((sg0.w2) this.f266177h).f489386q = java.lang.Long.valueOf(this.f266176g);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65473x269eedd3(null, "wxalite13df24d39cdd33868c7c01a247000f87");
    }
}
