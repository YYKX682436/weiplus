package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI2;", "Lcom/tencent/mm/ui/fluent/ViewFluentTransparentActivity;", "<init>", "()V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes3.dex */
public class OccupyFinderUI2 extends com.tencent.mm.ui.fluent.ViewFluentTransparentActivity {

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f109583h;

    /* renamed from: m, reason: collision with root package name */
    public int f109585m;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2$leftMarginChangeListener$1 f109587o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2$visibleChangeListener$1 f109588p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2$listener$1 f109589q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2$finishListener$1 f109590r;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f109584i = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f109586n = new com.tencent.mm.plugin.finder.feed.ui.ao(this);

    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2$leftMarginChangeListener$1] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2$visibleChangeListener$1] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2$listener$1] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2$finishListener$1] */
    public OccupyFinderUI2() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f109587o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveBgPositionChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2$leftMarginChangeListener$1
            {
                this.__eventId = 1194680346;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderLiveBgPositionChangeEvent finderLiveBgPositionChangeEvent) {
                com.tencent.mm.autogen.events.FinderLiveBgPositionChangeEvent event = finderLiveBgPositionChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("receive FinderLiveBgLeftPositionChangeEvent5 leftMargin:");
                am.nb nbVar = event.f54283g;
                sb6.append(nbVar.f7416a);
                sb6.append(" topMargin:");
                sb6.append(nbVar.f7417b);
                com.tencent.mars.xlog.Log.i("ViewFluentTransparentActivity", sb6.toString());
                com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2 occupyFinderUI2 = com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2.this;
                android.widget.ImageView imageView = occupyFinderUI2.f109583h;
                if (imageView == null) {
                    kotlin.jvm.internal.o.o("bgView");
                    throw null;
                }
                imageView.setTranslationX(nbVar.f7416a);
                android.widget.ImageView imageView2 = occupyFinderUI2.f109583h;
                if (imageView2 == null) {
                    kotlin.jvm.internal.o.o("bgView");
                    throw null;
                }
                imageView2.setTranslationY(nbVar.f7417b);
                android.widget.ImageView imageView3 = occupyFinderUI2.f109583h;
                if (imageView3 == null) {
                    kotlin.jvm.internal.o.o("bgView");
                    throw null;
                }
                imageView3.setScaleX(nbVar.f7418c);
                android.widget.ImageView imageView4 = occupyFinderUI2.f109583h;
                if (imageView4 != null) {
                    imageView4.setScaleY(nbVar.f7418c);
                    return false;
                }
                kotlin.jvm.internal.o.o("bgView");
                throw null;
            }
        };
        this.f109588p = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveBgVisibleChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2$visibleChangeListener$1
            {
                this.__eventId = -398527073;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderLiveBgVisibleChangeEvent finderLiveBgVisibleChangeEvent) {
                com.tencent.mm.autogen.events.FinderLiveBgVisibleChangeEvent event = finderLiveBgVisibleChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("receive FinderLiveBgVisibleChangeEvent visible:");
                am.ob obVar = event.f54284g;
                sb6.append(obVar.f7519a);
                com.tencent.mars.xlog.Log.i("ViewFluentTransparentActivity", sb6.toString());
                android.widget.ImageView imageView = com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2.this.f109583h;
                if (imageView == null) {
                    kotlin.jvm.internal.o.o("bgView");
                    throw null;
                }
                java.lang.Boolean visible = obVar.f7519a;
                kotlin.jvm.internal.o.f(visible, "visible");
                imageView.setAlpha(visible.booleanValue() ? 1.0f : 0.0f);
                return false;
            }
        };
        this.f109589q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveBgChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2$listener$1
            {
                this.__eventId = 1009303043;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderLiveBgChangeEvent finderLiveBgChangeEvent) {
                com.tencent.mm.autogen.events.FinderLiveBgChangeEvent event = finderLiveBgChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2 occupyFinderUI2 = com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2.this;
                android.widget.ImageView imageView = occupyFinderUI2.f109583h;
                if (imageView == null) {
                    kotlin.jvm.internal.o.o("bgView");
                    throw null;
                }
                imageView.setVisibility(0);
                android.widget.ImageView imageView2 = occupyFinderUI2.f109583h;
                if (imageView2 == null) {
                    kotlin.jvm.internal.o.o("bgView");
                    throw null;
                }
                am.mb mbVar = event.f54282g;
                imageView2.setImageDrawable(mbVar.f7333a);
                int i17 = mbVar.f7334b;
                com.tencent.mars.xlog.Log.i("ViewFluentTransparentActivity", "receive FinderLiveBgChangeEvent bindActivityHashCode :" + i17 + " targetActivityHash: " + occupyFinderUI2.f109585m);
                if (occupyFinderUI2.f109585m == 0) {
                    occupyFinderUI2.f109585m = i17;
                }
                return false;
            }
        };
        this.f109590r = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveFinishEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2$finishListener$1
            {
                this.__eventId = 1975731205;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderLiveFinishEvent finderLiveFinishEvent) {
                com.tencent.mm.autogen.events.FinderLiveFinishEvent event = finderLiveFinishEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.qb qbVar = event.f54286g;
                int i17 = qbVar.f7703a;
                java.lang.Boolean bool = qbVar.f7704b;
                com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2 occupyFinderUI2 = com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2.this;
                if (i17 == occupyFinderUI2.f109585m && !bool.booleanValue()) {
                    android.view.View decorView = occupyFinderUI2.getWindow().getDecorView();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(decorView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI2$finishListener$1", "callback", "(Lcom/tencent/mm/autogen/events/FinderLiveFinishEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    decorView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(decorView, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI2$finishListener$1", "callback", "(Lcom/tencent/mm/autogen/events/FinderLiveFinishEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    com.tencent.mars.xlog.Log.i("ViewFluentTransparentActivity", "FinderLiveFinishEvent to finish by activityHash match");
                    occupyFinderUI2.finish();
                }
                return false;
            }
        };
    }

    @Override // com.tencent.mm.ui.fluent.ViewFluentTransparentActivity
    public boolean K6(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String simpleName = activity.getClass().getSimpleName();
        boolean z17 = r26.i0.n(simpleName, "FinderLiveVisitorWithoutAffinityUI", false) || r26.i0.n(simpleName, "FinderLiveVisitorAffinityUI", false) || r26.i0.n(simpleName, "FinderLiveVisitorTopStoryAffinityUI", false);
        if (z17) {
            this.f109585m = activity.hashCode();
            this.f109584i.removeCallbacks(this.f109586n);
        }
        return z17;
    }

    @Override // com.tencent.mm.ui.fluent.ViewFluentTransparentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (com.tencent.mm.ui.bk.C()) {
            setTheme(com.tencent.mm.R.style.f494372la);
        } else {
            setTheme(com.tencent.mm.R.style.f494372la);
        }
        super.onCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
            kotlin.jvm.internal.o.f(attributes, "getAttributes(...)");
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) decorView;
        ez2.e eVar = ez2.g.f257902a;
        if (eVar != null) {
            eVar.b();
        }
        android.widget.ImageView imageView = new android.widget.ImageView(this);
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        this.f109583h = imageView;
        viewGroup.addView(imageView, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.widget.ImageView imageView2 = this.f109583h;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("bgView");
            throw null;
        }
        imageView2.setVisibility(8);
        android.widget.ImageView imageView3 = this.f109583h;
        if (imageView3 == null) {
            kotlin.jvm.internal.o.o("bgView");
            throw null;
        }
        imageView3.setImageDrawable(new android.graphics.drawable.ColorDrawable(-16777216));
        alive();
        alive();
        alive();
        alive();
        com.tencent.mars.xlog.Log.i("ViewFluentTransparentActivity", "OccupyFinderUI2 create: " + hashCode());
        this.f109584i.postDelayed(this.f109586n, 2000L);
    }

    @Override // com.tencent.mm.ui.fluent.ViewFluentTransparentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f109584i.removeCallbacks(this.f109586n);
        dead();
        dead();
        dead();
        dead();
    }
}
