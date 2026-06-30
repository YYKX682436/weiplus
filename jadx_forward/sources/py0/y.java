package py0;

/* loaded from: classes5.dex */
public abstract class y extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements dz0.k {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f440562d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f440563e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.SurfaceView f440564f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f440565g;

    /* renamed from: h, reason: collision with root package name */
    public ty0.b1 f440566h;

    /* renamed from: i, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f440567i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f440568m;

    /* renamed from: n, reason: collision with root package name */
    public final ry0.e f440569n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f440562d = jz5.h.b(new py0.c(this));
        this.f440563e = jz5.h.b(new py0.t(this));
        this.f440565g = jz5.h.b(new py0.j(this));
        ry0.e eVar = new ry0.e(m158345xefc66565());
        new py0.x(this, eVar, null);
        this.f440569n = eVar;
    }

    @Override // dz0.k
    public void A(float f17) {
        py0.f0 P6 = P6();
        java.lang.String string = m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gvr, java.lang.Integer.valueOf(a06.d.b(f17 * 100)));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        P6.c(string);
    }

    @Override // dz0.k
    public java.lang.Object H6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return jz5.f0.f384359a;
    }

    public abstract jz5.l O6();

    public final py0.f0 P6() {
        return (py0.f0) ((jz5.n) this.f440565g).mo141623x754a37bb();
    }

    @Override // dz0.k
    public void Q1() {
        ((com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197) ((jz5.n) this.f440562d).mo141623x754a37bb()).setVisibility(0);
        android.view.SurfaceView surfaceView = this.f440564f;
        if (surfaceView != null) {
            surfaceView.setVisibility(0);
        }
        P6().dismiss();
    }

    public abstract void Q6();

    @Override // dz0.k
    public java.lang.Object R1(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return jz5.f0.f384359a;
    }

    public void R6(java.lang.String path, java.lang.String str) {
        r45.ko6 ko6Var;
        n0.e5 e5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.app.Activity context = m80379x76847179();
        android.content.Intent intent = new android.content.Intent();
        qc0.d1 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p2015x36f002.C17096x4dad80a5.f237984a.b(path);
        boolean z17 = (b17 != null ? b17.f442899d : 0L) > 60000;
        intent.putExtras(m158359x1e885992());
        intent.putExtra("ORIGIN_MUSIC_INFO", m158359x1e885992().getByteArrayExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO"));
        intent.putExtra("ORIGIN_MUSIC_ID", m158359x1e885992().getStringExtra("KEY_FINDER_POST_ORIGIN_MUSIC_ID"));
        if (!intent.hasExtra("post_id")) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(gm0.j1.b().j());
            sb6.append('_');
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(java.lang.System.currentTimeMillis());
            intent.putExtra("post_id", sb6.toString());
        }
        intent.putExtra("postType", 4);
        intent.putExtra("postMediaList", kz5.c0.d(path));
        intent.putExtra("postTypeList", kz5.c0.d(4));
        r45.q23 q23Var = new r45.q23();
        jz5.l O6 = O6();
        q23Var.f465118d = (java.lang.String) O6.f384366d;
        q23Var.f465119e = 1;
        q23Var.f465120f = com.p314xaae8f345.p457x3304c6.C3964x9fa34f55.f15759x86570412;
        q23Var.f465122h = m158359x1e885992().getIntExtra("key_maas_entrance", 0);
        ty0.b1 b1Var = this.f440566h;
        if ((b1Var == null || (e5Var = b1Var.f504327d) == null || ((java.lang.Boolean) e5Var.mo128745x754a37bb()).booleanValue()) ? false : true) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasBaseUILogicUIC", "performPost has music id");
            q23Var.f465124m = (java.lang.String) O6.f384367e;
        }
        if (str != null) {
            ko6Var = new r45.ko6();
            ko6Var.f460417i = str;
        } else {
            ko6Var = null;
        }
        q23Var.f465134w = ko6Var;
        intent.putExtra("KEY_POST_VIDEO_TEMPLATE", q23Var.mo14344x5f01b1f6());
        intent.putExtra("isLongVideoPost", z17);
        intent.putExtra("edit_id", bz0.a.f118255a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).hk(context, intent);
    }

    public final void S6(int i17) {
        if (this.f440568m) {
            return;
        }
        bz0.f fVar = bz0.f.f118268a;
        bz0.f.f118271d = p3325xe03a0797.p3326xc267989b.l.d(bz0.f.f118269b, null, null, new bz0.e(bz0.f.f118271d, i17, null), 3, null);
        this.f440568m = true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBeforeFinish */
    public void mo2275x62f76871(android.content.Intent intent) {
        super.mo2275x62f76871(intent);
        S6(1);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        Q6();
        P6().e(false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        super.mo2277xb2f1ab1a(bundle);
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        dz0.l lVar = (dz0.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(dz0.l.class);
        ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) lVar).f151332w = py0.a.f440498a;
        ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) lVar).f151318f = this;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        this.f440564f = null;
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) ((dz0.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(dz0.l.class))).f151318f = null;
        S6(5);
    }

    @Override // dz0.k
    public void y1() {
        android.view.SurfaceHolder holder;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasBaseUILogicUIC", "onMovieSessionCreated: ");
        android.view.SurfaceView surfaceView = new android.view.SurfaceView(m158354x19263085());
        this.f440564f = surfaceView;
        surfaceView.setVisibility(4);
        android.view.SurfaceView surfaceView2 = this.f440564f;
        if (surfaceView2 != null && (holder = surfaceView2.getHolder()) != null) {
            holder.addCallback(new py0.k(this));
        }
        ((android.widget.FrameLayout) ((jz5.n) this.f440563e).mo141623x754a37bb()).addView(this.f440564f, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    @Override // dz0.k
    public java.lang.Object z2(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return jz5.f0.f384359a;
    }
}
