package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderRingtoneTimelineLoader;", "Lcom/tencent/mm/plugin/finder/feed/ps;", "Lcom/tencent/mm/plugin/finder/feed/os;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderRingtoneTimelineUI extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI<com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader, com.tencent.mm.plugin.finder.feed.ps, com.tencent.mm.plugin.finder.feed.os> {
    public android.widget.TextView A;
    public boolean B = true;
    public final jz5.g C = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.qj(this));
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed D;
    public final jz5.g E;
    public boolean F;
    public int G;
    public long H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public final int f109533J;
    public java.lang.String K;
    public float L;
    public final int M;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.os f109534x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.ps f109535y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader f109536z;

    public FinderRingtoneTimelineUI() {
        jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.yj(this));
        this.E = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.xj(this));
        this.I = "";
        this.f109533J = 2;
        this.K = "";
        this.L = -1.0f;
        this.M = android.view.ViewConfiguration.getTouchSlop();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7() {
        com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader finderRingtoneTimelineLoader = this.f109536z;
        if (finderRingtoneTimelineLoader != null) {
            return finderRingtoneTimelineLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, android.app.Activity, android.view.Window.Callback
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
        kotlin.jvm.internal.o.g(event, "event");
        if (k7().getVisibility() == 0) {
            int action = event.getAction();
            if (action == 0) {
                this.L = event.getY();
            } else if (action == 1) {
                float y17 = this.L - event.getY();
                if (k7().getVisibility() == 0 && y17 > 0.0f && y17 > this.M) {
                    android.view.View k76 = k7();
                    if (k76.getVisibility() == 0) {
                        float b17 = i65.a.b(getContext(), 48);
                        com.tencent.mm.plugin.finder.feed.ps psVar = this.f109535y;
                        if (psVar == null) {
                            kotlin.jvm.internal.o.o("viewCallback");
                            throw null;
                        }
                        androidx.recyclerview.widget.k3 p07 = psVar.getRecyclerView().p0(0);
                        android.view.View findViewById = (p07 == null || (view3 = p07.itemView) == null) ? null : view3.findViewById(com.tencent.mm.R.id.f484486ee3);
                        android.view.View findViewById2 = (p07 == null || (view2 = p07.itemView) == null) ? null : view2.findViewById(com.tencent.mm.R.id.g1y);
                        android.view.View findViewById3 = (p07 == null || (view = p07.itemView) == null) ? null : view.findViewById(com.tencent.mm.R.id.dq6);
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
                            kotlin.jvm.internal.o.o("selectTv");
                            throw null;
                        }
                        android.view.ViewPropertyAnimator animate4 = textView.animate();
                        if (animate4 != null && (translationYBy = animate4.translationYBy(b17)) != null && (duration2 = translationYBy.setDuration(250L)) != null) {
                            duration2.start();
                        }
                        android.view.ViewPropertyAnimator animate5 = k76.animate();
                        if (animate5 != null && (alpha = animate5.alpha(0.0f)) != null && (duration = alpha.setDuration(250L)) != null && (listener = duration.setListener(new com.tencent.mm.plugin.finder.feed.ui.rj(k76))) != null) {
                            listener.start();
                        }
                    }
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_RINGTONE_TIMELINE_MORE_VIDEO_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                    this.B = true;
                }
            }
        }
        return super.dispatchTouchEvent(event);
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.dj e7() {
        com.tencent.mm.plugin.finder.feed.os osVar = this.f109534x;
        if (osVar != null) {
            return osVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.gj g7() {
        com.tencent.mm.plugin.finder.feed.ps psVar = this.f109535y;
        if (psVar != null) {
            return psVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b8a;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
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
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(this.H);
        if (h17 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("use cache cacheTime=");
            long j17 = 1000;
            sb6.append(k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, h17.getTimestamps() / j17));
            sb6.append(", cacheTime=");
            sb6.append(h17.getTimestamps());
            sb6.append(" current=");
            sb6.append(k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, c01.id.c() / j17));
            sb6.append(", urlValidDuration=");
            sb6.append(h17.getFeedObject().getUrlValidDuration());
            sb6.append('s');
            com.tencent.mars.xlog.Log.i("Finder.FinderRingtoneTimelineUI", sb6.toString());
            if (h17.getTimestamps() <= 0 || c01.id.c() < h17.getTimestamps() + (h17.getFeedObject().getUrlValidDuration() * 1000)) {
                this.D = cu2.u.f222441a.p(h17);
            }
        }
        if (this.D != null || this.F) {
            l7(false);
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderRingtoneTimelineUI", "cache null.show progress");
            l7(true);
        }
        com.tencent.mm.plugin.finder.feed.os osVar = new com.tencent.mm.plugin.finder.feed.os(this, this.F);
        osVar.D = this.D;
        osVar.B = new com.tencent.mm.plugin.finder.feed.ui.sj(this);
        osVar.C = new com.tencent.mm.plugin.finder.feed.ui.tj(this);
        this.f109534x = osVar;
        com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader finderRingtoneTimelineLoader = new com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader(this.H, this.I, this.G, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
        finderRingtoneTimelineLoader.initFromCache(getIntent());
        finderRingtoneTimelineLoader.setInitDone(new com.tencent.mm.plugin.finder.feed.ui.uj(this, finderRingtoneTimelineLoader));
        finderRingtoneTimelineLoader.f107642g = new com.tencent.mm.plugin.finder.feed.ui.vj(this);
        this.f109536z = finderRingtoneTimelineLoader;
        com.tencent.mm.plugin.finder.feed.os osVar2 = this.f109534x;
        if (osVar2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        this.f109535y = new com.tencent.mm.plugin.finder.feed.ps(this, osVar2, this.f109533J, ((java.lang.Number) ((jz5.n) this.C).getValue()).intValue());
        if (this.F && !gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_RINGTONE_TIMELINE_MORE_VIDEO_BOOLEAN_SYNC, false)) {
            z17 = false;
        }
        this.B = z17;
        if (z17) {
            android.view.View k76 = k7();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(k76, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            k76.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(k76, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View k77 = k7();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(k77, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            k77.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(k77, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.opo);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.A = textView;
        textView.setText(getString(!this.F ? com.tencent.mm.R.string.ixv : com.tencent.mm.R.string.f490352sk));
        android.widget.TextView textView2 = this.A;
        if (textView2 != null) {
            textView2.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.wj(this));
        } else {
            kotlin.jvm.internal.o.o("selectTv");
            throw null;
        }
    }

    public final android.view.View k7() {
        java.lang.Object value = ((jz5.n) this.E).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final void l7(boolean z17) {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.mst);
        if (findViewById != null) {
            if (z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        ((ed0.c1) i95.n0.c(ed0.c1.class)).getClass();
        set.add(com.tencent.mm.plugin.ringtone.uic.v.class);
        ((ed0.c1) i95.n0.c(ed0.c1.class)).getClass();
        set.add(com.tencent.mm.plugin.ringtone.uic.c3.class);
        set.remove(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.j6.class)));
        set.remove(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.z6.class)));
        set.remove(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.i7.class)));
        set.remove(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.b7.class)));
        set.remove(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.i6.class)));
        set.remove(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.d7.class)));
        set.remove(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.b9.class)));
    }
}
