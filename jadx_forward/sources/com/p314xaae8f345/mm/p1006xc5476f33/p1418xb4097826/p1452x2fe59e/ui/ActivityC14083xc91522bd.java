package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderRingtoneTimelineLoader;", "Lcom/tencent/mm/plugin/finder/feed/ps;", "Lcom/tencent/mm/plugin/finder/feed/os;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderRingtoneTimelineUI */
/* loaded from: classes2.dex */
public final class ActivityC14083xc91522bd extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13914x1304f7dc, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ps, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.os> {
    public android.widget.TextView A;
    public boolean B = true;
    public final jz5.g C = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.qj(this));
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 D;
    public final jz5.g E;
    public boolean F;
    public int G;
    public long H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public final int f191066J;
    public java.lang.String K;
    public float L;
    public final int M;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.os f191067x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ps f191068y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13914x1304f7dc f191069z;

    public ActivityC14083xc91522bd() {
        jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.yj(this));
        this.E = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.xj(this));
        this.I = "";
        this.f191066J = 2;
        this.K = "";
        this.L = -1.0f;
        this.M = android.view.ViewConfiguration.getTouchSlop();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    public int Y6() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13914x1304f7dc c13914x1304f7dc = this.f191069z;
        if (c13914x1304f7dc != null) {
            return c13914x1304f7dc;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent event) {
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator translationYBy;
        android.view.ViewPropertyAnimator duration2;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator translationYBy2;
        android.view.ViewPropertyAnimator duration3;
        android.view.ViewPropertyAnimator animate2;
        android.view.ViewPropertyAnimator translationYBy3;
        android.view.ViewPropertyAnimator duration4;
        android.view.ViewPropertyAnimator animate3;
        android.view.ViewPropertyAnimator translationYBy4;
        android.view.ViewPropertyAnimator duration5;
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (k7().getVisibility() == 0) {
            int action = event.getAction();
            if (action == 0) {
                this.L = event.getY();
            } else if (action == 1) {
                float y17 = this.L - event.getY();
                if (k7().getVisibility() == 0 && y17 > 0.0f && y17 > this.M) {
                    android.view.View k76 = k7();
                    if (k76.getVisibility() == 0) {
                        float b17 = i65.a.b(mo55332x76847179(), 48);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ps psVar = this.f191068y;
                        if (psVar == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                            throw null;
                        }
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = psVar.m56068x4905e9fa().p0(0);
                        android.view.View findViewById = (p07 == null || (view3 = p07.f3639x46306858) == null) ? null : view3.findViewById(com.p314xaae8f345.mm.R.id.f566019ee3);
                        android.view.View findViewById2 = (p07 == null || (view2 = p07.f3639x46306858) == null) ? null : view2.findViewById(com.p314xaae8f345.mm.R.id.g1y);
                        android.view.View findViewById3 = (p07 == null || (view = p07.f3639x46306858) == null) ? null : view.findViewById(com.p314xaae8f345.mm.R.id.dq6);
                        if (findViewById != null && (animate3 = findViewById.animate()) != null && (translationYBy4 = animate3.translationYBy(b17)) != null && (duration5 = translationYBy4.setDuration(250L)) != null) {
                            duration5.start();
                        }
                        if (findViewById2 != null && (animate2 = findViewById2.animate()) != null && (translationYBy3 = animate2.translationYBy(b17)) != null && (duration4 = translationYBy3.setDuration(250L)) != null) {
                            duration4.start();
                        }
                        if (findViewById3 != null && (animate = findViewById3.animate()) != null && (translationYBy2 = animate.translationYBy(b17)) != null && (duration3 = translationYBy2.setDuration(250L)) != null) {
                            duration3.start();
                        }
                        android.widget.TextView textView = this.A;
                        if (textView == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectTv");
                            throw null;
                        }
                        android.view.ViewPropertyAnimator animate4 = textView.animate();
                        if (animate4 != null && (translationYBy = animate4.translationYBy(b17)) != null && (duration2 = translationYBy.setDuration(250L)) != null) {
                            duration2.start();
                        }
                        android.view.ViewPropertyAnimator animate5 = k76.animate();
                        if (animate5 != null && (alpha = animate5.alpha(0.0f)) != null && (duration = alpha.setDuration(250L)) != null && (listener = duration.setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.rj(k76))) != null) {
                            listener.start();
                        }
                    }
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_RINGTONE_TIMELINE_MORE_VIDEO_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                    this.B = true;
                }
            }
        }
        return super.dispatchTouchEvent(event);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj e7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.os osVar = this.f191067x;
        if (osVar != null) {
            return osVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gj g7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ps psVar = this.f191068y;
        if (psVar != null) {
            return psVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b8a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public void h7() {
        this.H = getIntent().getLongExtra("feed_object_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("feed_object_nonceId");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.I = stringExtra;
        getIntent().getIntExtra("report_scene", 0);
        this.K = getIntent().getStringExtra("from_user");
        boolean z17 = true;
        this.F = this.H == 0;
        this.G = getIntent().getIntExtra("KEY_RINGTONE_LOADER_TYPE", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(this.H);
        if (h17 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("use cache cacheTime=");
            long j17 = 1000;
            sb6.append(k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, h17.getTimestamps() / j17));
            sb6.append(", cacheTime=");
            sb6.append(h17.getTimestamps());
            sb6.append(" current=");
            sb6.append(k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, c01.id.c() / j17));
            sb6.append(", urlValidDuration=");
            sb6.append(h17.getFeedObject().m76835x9191e3f7());
            sb6.append('s');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderRingtoneTimelineUI", sb6.toString());
            if (h17.getTimestamps() <= 0 || c01.id.c() < h17.getTimestamps() + (h17.getFeedObject().m76835x9191e3f7() * 1000)) {
                this.D = cu2.u.f303974a.p(h17);
            }
        }
        if (this.D != null || this.F) {
            l7(false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderRingtoneTimelineUI", "cache null.show progress");
            l7(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.os osVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.os(this, this.F);
        osVar.D = this.D;
        osVar.B = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sj(this);
        osVar.C = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.tj(this);
        this.f191067x = osVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13914x1304f7dc c13914x1304f7dc = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13914x1304f7dc(this.H, this.I, this.G, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6());
        c13914x1304f7dc.m56361x5fd54ec8(getIntent());
        c13914x1304f7dc.m56375x868b9334(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.uj(this, c13914x1304f7dc));
        c13914x1304f7dc.f189175g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.vj(this);
        this.f191069z = c13914x1304f7dc;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.os osVar2 = this.f191067x;
        if (osVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        this.f191068y = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ps(this, osVar2, this.f191066J, ((java.lang.Number) ((jz5.n) this.C).mo141623x754a37bb()).intValue());
        if (this.F && !gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_RINGTONE_TIMELINE_MORE_VIDEO_BOOLEAN_SYNC, false)) {
            z17 = false;
        }
        this.B = z17;
        if (z17) {
            android.view.View k76 = k7();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(k76, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            k76.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(k76, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View k77 = k7();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(k77, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            k77.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(k77, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.opo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.A = textView;
        textView.setText(getString(!this.F ? com.p314xaae8f345.mm.R.C30867xcad56011.ixv : com.p314xaae8f345.mm.R.C30867xcad56011.f571885sk));
        android.widget.TextView textView2 = this.A;
        if (textView2 != null) {
            textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.wj(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectTv");
            throw null;
        }
    }

    public final android.view.View k7() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.E).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final void l7(boolean z17) {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.mst);
        if (findViewById != null) {
            if (z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15086x1d5b7f69, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        ((ed0.c1) i95.n0.c(ed0.c1.class)).getClass();
        set.add(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v.class);
        ((ed0.c1) i95.n0.c(ed0.c1.class)).getClass();
        set.add(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c3.class);
        set.remove(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.j6.class)));
        set.remove(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.z6.class)));
        set.remove(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.i7.class)));
        set.remove(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.b7.class)));
        set.remove(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.i6.class)));
        set.remove(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.d7.class)));
        set.remove(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.b9.class)));
    }
}
