package iu3;

/* loaded from: classes5.dex */
public final class e implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f376524d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f376525e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f376526f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f376527g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f376528h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f376529i;

    /* renamed from: m, reason: collision with root package name */
    public final iu3.i f376530m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f376531n;

    /* renamed from: o, reason: collision with root package name */
    public st3.k f376532o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f376533p;

    public e(android.view.ViewGroup parent, ju3.d0 status, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f376524d = parent;
        this.f376525e = status;
        this.f376526f = z17;
        android.view.View findViewById = parent.findViewById(com.p314xaae8f345.mm.R.id.d7_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = parent.findViewById(com.p314xaae8f345.mm.R.id.d7a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById2;
        this.f376527g = imageView2;
        android.view.View findViewById3 = parent.findViewById(com.p314xaae8f345.mm.R.id.d7b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f376528h = findViewById3;
        this.f376529i = jz5.h.b(new iu3.d(this));
        android.content.Context context = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f376530m = new iu3.i(context);
        this.f376532o = new st3.k();
        this.f376533p = true;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_show_mediacomponent_audio, true);
        this.f376533p = fj6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditAddMusicPlugin", "forceEnable " + fj6);
        imageView2.setImageDrawable(parent.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80880xec2114a5));
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(parent.getContext(), com.p314xaae8f345.mm.R.raw.f79821x41d75e0d, -1));
        imageView.setOnClickListener(this);
        if (fj6) {
            b().mo68199x466a35c6(new iu3.a(this));
            b().mo68194x6c4ebec7(new iu3.b(this));
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/music/EditAddMusicPlugin", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/recordvideo/plugin/music/EditAddMusicPlugin", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void a() {
        st3.k kVar = this.f376532o;
        if (kVar.f494084f == st3.v.f494138d && kVar.f494083e) {
            b().mo68201x76500a7f(true);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2003xde351112.InterfaceC17057x18e3a43c b() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2003xde351112.InterfaceC17057x18e3a43c) this.f376529i.mo141623x754a37bb();
    }

    public final boolean c() {
        return b().getMuteOrigin();
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        if (!b().mo68187xb9a8b747()) {
            return false;
        }
        b().mo68176x2e04e7();
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/music/EditAddMusicPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionMusic.k(view != null ? view.getContext() : null, null)) {
            yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/music/EditAddMusicPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        b().mo68201x76500a7f(true);
        nu3.i iVar = nu3.i.f421751a;
        nu3.i.c(iVar, "KEY_CLICK_MUSIC_COUNT_INT", 0, 2, null);
        iVar.b(6);
        iVar.d(5);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/music/EditAddMusicPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        b().mo68191x6761d4f();
        wt3.u uVar = wt3.v.f531037h;
        wt3.v vVar = wt3.v.f531038i;
        if (vVar != null) {
            vVar.a();
        }
    }

    @Override // yt3.r2
    /* renamed from: onPause */
    public void mo11000xb01dfb57() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditAddMusicPlugin", "pauseAudio");
        this.f376530m.a();
    }

    @Override // yt3.r2
    /* renamed from: onResume */
    public void mo11001x57429eec() {
        if (b().getWithMusic()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditAddMusicPlugin", "resumeMusic");
            this.f376530m.e();
        }
    }

    @Override // yt3.r2
    public void q() {
        kk4.v vVar = this.f376530m.f376541c;
        if (vVar != null) {
            vVar.C(true);
        }
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        mo9066x6761d4f();
        this.f376531n = null;
        this.f376530m.d();
        b().mo68177x5cd39ffa();
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        this.f376527g.setVisibility(8);
        android.view.View view = this.f376528h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        view.setTag(com.p314xaae8f345.mm.R.id.f564306nl, i65.a.r(view.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f571504h0));
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        if (this.f376533p) {
            android.view.View view = this.f376528h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/music/EditAddMusicPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/music/EditAddMusicPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // yt3.r2
    public void v() {
        kk4.v vVar;
        if (!b().getWithMusic() || (vVar = this.f376530m.f376541c) == null) {
            return;
        }
        vVar.C(false);
    }
}
