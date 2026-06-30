package fo0;

/* loaded from: classes14.dex */
public final class n implements mn0.c0 {

    /* renamed from: d, reason: collision with root package name */
    public final fo0.a f346353d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f346354e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.PowerManager.WakeLock f346355f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Intent f346356g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p832x332457.AbstractC10841x92aba21a f346357h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.FrameLayout f346358i;

    /* renamed from: m, reason: collision with root package name */
    public fo0.q f346359m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f346360n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f346361o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f346362p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f346363q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Bitmap f346364r;

    /* renamed from: s, reason: collision with root package name */
    public final fo0.j f346365s;

    public n(fo0.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f346353d = callback;
        this.f346354e = jz5.h.b(fo0.i.f346346d);
        this.f346356g = new android.content.Intent();
        this.f346358i = new android.widget.FrameLayout(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.LiveCoreMini", "dl: LiveMiniManager acquire wake lock", new java.lang.Object[0]);
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("power");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) systemService).newWakeLock(536870922, "MicroMsg.LiveCoreMini");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newWakeLock, "newWakeLock(...)");
        this.f346355f = newWakeLock;
        if (!newWakeLock.isHeld()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreMini", "acquire wakeLock");
            yj0.a.c(newWakeLock, "com/tencent/mm/live/core/mini/LiveMiniManager", "<init>", "(Lcom/tencent/mm/live/core/mini/IliveMiniCallback;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            newWakeLock.acquire();
            yj0.a.f(newWakeLock, "com/tencent/mm/live/core/mini/LiveMiniManager", "<init>", "(Lcom/tencent/mm/live/core/mini/IliveMiniCallback;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        }
        this.f346365s = new fo0.j(this);
    }

    public static final void a(fo0.n nVar) {
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p832x332457.AbstractC10841x92aba21a abstractC10841x92aba21a = nVar.f346357h;
        int f197567f = abstractC10841x92aba21a != null ? abstractC10841x92aba21a.getF197567f() : 0;
        if (pm0.v.z(f197567f, 4) || pm0.v.z(f197567f, 2) || pm0.v.z(f197567f, 1) || pm0.v.z(f197567f, 8)) {
            gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
            fo0.c.f346331a.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) fo0.c.f346332b.f346340a).f174665d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo = c12886x91aa2b6d.f174587o;
            ballButtonInfo.f174602d = false;
            ballButtonInfo.f174604f = false;
            ballButtonInfo.f174605g = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.w_);
            Bi.b(c12886x91aa2b6d);
            return;
        }
        gp1.v Bi2 = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        fo0.c.f346331a.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) fo0.c.f346332b.f346340a).f174665d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo2 = c12886x91aa2b6d2.f174587o;
        ballButtonInfo2.f174602d = true;
        ballButtonInfo2.f174604f = true;
        ballButtonInfo2.f174605g = -1;
        Bi2.b(c12886x91aa2b6d2);
    }

    public final void b(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f346362p = view;
        view.setClipToOutline(true);
        view.setOutlineProvider(new fo0.p(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8)));
        android.widget.FrameLayout frameLayout = this.f346358i;
        frameLayout.removeView(this.f346362p);
        frameLayout.addView(view, new android.widget.RelativeLayout.LayoutParams(-1, -1));
    }

    public final void c(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f346360n = view;
        view.setClipToOutline(true);
        view.setOutlineProvider(new fo0.p(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8)));
        android.widget.FrameLayout frameLayout = this.f346358i;
        frameLayout.removeAllViews();
        frameLayout.addView(view, new android.widget.RelativeLayout.LayoutParams(-1, -1));
    }

    public final void d(android.graphics.Point point, long j17, boolean z17, int i17, int i18, fo0.s ballInfo) {
        android.graphics.Point size = point;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(size, "size");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ballInfo, "ballInfo");
        boolean z18 = this.f346361o;
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p832x332457.AbstractC10841x92aba21a abstractC10841x92aba21a = this.f346357h;
        fo0.t tVar = new fo0.t(z18, j17, z17, i17, abstractC10841x92aba21a != null ? abstractC10841x92aba21a.c() : 0, i18);
        fo0.a aVar = this.f346353d;
        fo0.b d17 = aVar.d();
        ballInfo.f346379f = d17 != null ? d17.a() : null;
        fo0.b d18 = aVar.d();
        ballInfo.f346380g = d18 != null ? d18.b() : null;
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p832x332457.AbstractC10841x92aba21a abstractC10841x92aba21a2 = this.f346357h;
        if (abstractC10841x92aba21a2 != null) {
            int i19 = com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p832x332457.AbstractC10841x92aba21a.f150106d;
            abstractC10841x92aba21a2.b(ballInfo.f346381h, true);
        }
        fo0.q qVar = this.f346359m;
        if (qVar != null) {
            android.view.View view = qVar.f346369a;
            if (view != null) {
                android.widget.FrameLayout frameLayout = this.f346358i;
                if (!(frameLayout.indexOfChild(view) != -1)) {
                    android.view.ViewParent parent = view.getParent();
                    android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(view);
                    }
                    frameLayout.removeAllViews();
                    frameLayout.addView(view, new android.widget.RelativeLayout.LayoutParams(-1, -1));
                    frameLayout.setBackground(null);
                    android.view.ViewParent parent2 = frameLayout.getParent();
                    android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
                    if (viewGroup2 != null) {
                        viewGroup2.setBackground(null);
                    }
                    com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p832x332457.AbstractC10841x92aba21a abstractC10841x92aba21a3 = this.f346357h;
                    if (abstractC10841x92aba21a3 != null) {
                        abstractC10841x92aba21a3.mo46511x732d1f79(8);
                    }
                }
            }
            android.graphics.Point point2 = qVar.f346370b;
            if (point2 != null) {
                size = point2;
            }
        }
        fo0.c.f346331a.getClass();
        fo0.f fVar = fo0.c.f346332b;
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p832x332457.AbstractC10841x92aba21a abstractC10841x92aba21a4 = this.f346357h;
        fo0.q qVar2 = this.f346359m;
        java.lang.Integer num = qVar2 != null ? qVar2.f346371c : null;
        java.lang.Integer num2 = qVar2 != null ? qVar2.f346372d : null;
        fVar.getClass();
        fVar.b();
        if (abstractC10841x92aba21a4 != null) {
            gp1.r rVar = fVar.f346340a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = dVar.f174665d;
            c12886x91aa2b6d.f174591s = false;
            c12886x91aa2b6d.f174586n = num != null ? num.intValue() : 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = dVar.f174665d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo = c12886x91aa2b6d2.f174587o;
            ballButtonInfo.f174605g = ballInfo.f346375b;
            ballButtonInfo.f174604f = ballInfo.f346376c;
            ballButtonInfo.f174602d = ballInfo.f346374a;
            ballButtonInfo.f174603e = ballInfo.f346377d;
            ballButtonInfo.f174606h = ballInfo.f346378e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallBlurInfo ballBlurInfo = c12886x91aa2b6d2.f174588p;
            android.graphics.Bitmap bitmap = ballInfo.f346380g;
            ballBlurInfo.f174600e = bitmap;
            ballBlurInfo.f174599d = (bitmap == null || bitmap.isRecycled()) ? ballInfo.f346379f : "";
            if (num2 == null) {
                num2 = ballBlurInfo.f174601f;
            }
            ballBlurInfo.f174601f = num2;
            if (dVar.u()) {
                if (dVar.f174665d.f174583h != abstractC10841x92aba21a4) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveFloatBallHelper", "addVoipView, has ball, but view is different, state:%s, view:%s, ballInfo.customView:%s", 4, abstractC10841x92aba21a4, dVar.f174665d.f174583h);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d3 = dVar.f174665d;
                    c12886x91aa2b6d3.I = true;
                    c12886x91aa2b6d3.H = 4;
                    c12886x91aa2b6d3.f174583h = abstractC10841x92aba21a4;
                    c12886x91aa2b6d3.f174578J = false;
                    c12886x91aa2b6d3.F = true;
                    c12886x91aa2b6d3.L = z18;
                    fVar.f(tVar);
                    fVar.e(size);
                    rVar.j();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveFloatBallHelper", "addVoipView, has ball, state:%s, view:%s", 4, abstractC10841x92aba21a4);
                }
                dVar.S(dVar.f174665d.f174587o);
                dVar.R(dVar.f174665d.f174588p);
            } else {
                fo0.d dVar2 = new fo0.d(4, abstractC10841x92aba21a4, fVar, z18, tVar, size);
                long j18 = fVar.f346341b + 200;
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long currentTimeMillis = j18 - java.lang.System.currentTimeMillis();
                if (currentTimeMillis <= 0) {
                    dVar2.run();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveFloatBallHelper", "addVoipView, no ball, add delayed:%s", java.lang.Long.valueOf(currentTimeMillis));
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(dVar2, currentTimeMillis);
                }
            }
        }
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().a0(21, this.f346365s);
        this.f346361o = true;
    }

    public final void e() {
        fo0.c cVar = fo0.c.f346331a;
        boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) fo0.c.f346332b.f346340a).f174665d.G.getBoolean("is_pause_replace_state") && ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().Y();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dl: LiveMiniManager release ");
        android.os.PowerManager.WakeLock wakeLock = this.f346355f;
        sb6.append(wakeLock.isHeld());
        sb6.append(", enableRemoveAllViewsWhenRelease:");
        jz5.g gVar = this.f346354e;
        sb6.append(((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue());
        sb6.append(" floatReplaceState: ");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreMini", sb6.toString());
        if (((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue() && !z17) {
            this.f346358i.removeAllViews();
        }
        if (wakeLock.isHeld()) {
            android.os.PowerManager.WakeLock wakeLock2 = this.f346355f;
            yj0.a.c(wakeLock2, "com/tencent/mm/live/core/mini/LiveMiniManager", "release", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock2.release();
            yj0.a.f(wakeLock2, "com/tencent/mm/live/core/mini/LiveMiniManager", "release", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        }
    }

    public final void f() {
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).f(46);
        fo0.c cVar = fo0.c.f346331a;
        fo0.f fVar = fo0.c.f346332b;
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) fVar.f346340a).f174665d.G.getBoolean("is_pause_replace_state") || !((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().Y()) {
            fVar.d(this.f346357h);
            this.f346358i.removeView(this.f346362p);
        }
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().L(21, this.f346365s);
    }

    public final void g(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p832x332457.AbstractC10841x92aba21a abstractC10841x92aba21a) {
        fo0.p pVar = new fo0.p(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8));
        this.f346357h = abstractC10841x92aba21a;
        if (abstractC10841x92aba21a != null) {
            abstractC10841x92aba21a.setClipToOutline(true);
        }
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p832x332457.AbstractC10841x92aba21a abstractC10841x92aba21a2 = this.f346357h;
        if (abstractC10841x92aba21a2 != null) {
            abstractC10841x92aba21a2.setOutlineProvider(pVar);
        }
        android.widget.FrameLayout frameLayout = this.f346358i;
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(pVar);
        if (frameLayout.getParent() != null && (frameLayout.getParent() instanceof android.view.ViewGroup)) {
            android.view.ViewParent parent = frameLayout.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(frameLayout);
        }
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p832x332457.AbstractC10841x92aba21a abstractC10841x92aba21a3 = this.f346357h;
        if (abstractC10841x92aba21a3 != null) {
            abstractC10841x92aba21a3.addView(frameLayout, 0);
        }
    }

    @Override // mn0.c0
    public void j6() {
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        fo0.c.f346331a.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) fo0.c.f346332b.f346340a).f174665d;
        c12886x91aa2b6d.f174587o.f174602d = false;
        Bi.b(c12886x91aa2b6d);
    }

    @Override // mn0.c0
    public void u() {
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        fo0.c.f346331a.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) fo0.c.f346332b.f346340a).f174665d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo = c12886x91aa2b6d.f174587o;
        ballButtonInfo.f174602d = true;
        ballButtonInfo.f174604f = true;
        ballButtonInfo.f174605g = -1;
        Bi.b(c12886x91aa2b6d);
    }
}
