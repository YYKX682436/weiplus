package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI2;", "Lcom/tencent/mm/ui/fluent/ViewFluentTransparentActivity;", "<init>", "()V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2 */
/* loaded from: classes3.dex */
public class ActivityC14109x83bd09 extends com.p314xaae8f345.mm.ui.p2705xb436f21c.AbstractActivityC22405xf322b380 {

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f191116h;

    /* renamed from: m, reason: collision with root package name */
    public int f191118m;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14111x1c8e6b41 f191120o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14113xc9291a08 f191121p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14112x303a82bc f191122q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14110xe39f876f f191123r;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f191117i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f191119n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ao(this);

    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2$leftMarginChangeListener$1] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2$visibleChangeListener$1] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2$listener$1] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2$finishListener$1] */
    public ActivityC14109x83bd09() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f191120o = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5478xe7e70c2a>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2$leftMarginChangeListener$1
            {
                this.f39173x3fe91575 = 1194680346;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5478xe7e70c2a c5478xe7e70c2a) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5478xe7e70c2a event = c5478xe7e70c2a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("receive FinderLiveBgLeftPositionChangeEvent5 leftMargin:");
                am.nb nbVar = event.f135816g;
                sb6.append(nbVar.f88949a);
                sb6.append(" topMargin:");
                sb6.append(nbVar.f88950b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentTransparentActivity", sb6.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14109x83bd09 activityC14109x83bd09 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14109x83bd09.this;
                android.widget.ImageView imageView = activityC14109x83bd09.f191116h;
                if (imageView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgView");
                    throw null;
                }
                imageView.setTranslationX(nbVar.f88949a);
                android.widget.ImageView imageView2 = activityC14109x83bd09.f191116h;
                if (imageView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgView");
                    throw null;
                }
                imageView2.setTranslationY(nbVar.f88950b);
                android.widget.ImageView imageView3 = activityC14109x83bd09.f191116h;
                if (imageView3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgView");
                    throw null;
                }
                imageView3.setScaleX(nbVar.f88951c);
                android.widget.ImageView imageView4 = activityC14109x83bd09.f191116h;
                if (imageView4 != null) {
                    imageView4.setScaleY(nbVar.f88951c);
                    return false;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgView");
                throw null;
            }
        };
        this.f191121p = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5479xb39f878f>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2$visibleChangeListener$1
            {
                this.f39173x3fe91575 = -398527073;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5479xb39f878f c5479xb39f878f) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5479xb39f878f event = c5479xb39f878f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("receive FinderLiveBgVisibleChangeEvent visible:");
                am.ob obVar = event.f135817g;
                sb6.append(obVar.f89052a);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentTransparentActivity", sb6.toString());
                android.widget.ImageView imageView = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14109x83bd09.this.f191116h;
                if (imageView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgView");
                    throw null;
                }
                java.lang.Boolean visible = obVar.f89052a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(visible, "visible");
                imageView.setAlpha(visible.booleanValue() ? 1.0f : 0.0f);
                return false;
            }
        };
        this.f191122q = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5477x9d0f7a13>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2$listener$1
            {
                this.f39173x3fe91575 = 1009303043;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5477x9d0f7a13 c5477x9d0f7a13) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5477x9d0f7a13 event = c5477x9d0f7a13;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14109x83bd09 activityC14109x83bd09 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14109x83bd09.this;
                android.widget.ImageView imageView = activityC14109x83bd09.f191116h;
                if (imageView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgView");
                    throw null;
                }
                imageView.setVisibility(0);
                android.widget.ImageView imageView2 = activityC14109x83bd09.f191116h;
                if (imageView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgView");
                    throw null;
                }
                am.mb mbVar = event.f135815g;
                imageView2.setImageDrawable(mbVar.f88866a);
                int i17 = mbVar.f88867b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentTransparentActivity", "receive FinderLiveBgChangeEvent bindActivityHashCode :" + i17 + " targetActivityHash: " + activityC14109x83bd09.f191118m);
                if (activityC14109x83bd09.f191118m == 0) {
                    activityC14109x83bd09.f191118m = i17;
                }
                return false;
            }
        };
        this.f191123r = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5484xde49c415>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2$finishListener$1
            {
                this.f39173x3fe91575 = 1975731205;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5484xde49c415 c5484xde49c415) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5484xde49c415 event = c5484xde49c415;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.qb qbVar = event.f135819g;
                int i17 = qbVar.f89236a;
                java.lang.Boolean bool = qbVar.f89237b;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14109x83bd09 activityC14109x83bd09 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14109x83bd09.this;
                if (i17 == activityC14109x83bd09.f191118m && !bool.booleanValue()) {
                    android.view.View decorView = activityC14109x83bd09.getWindow().getDecorView();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(decorView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI2$finishListener$1", "callback", "(Lcom/tencent/mm/autogen/events/FinderLiveFinishEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    decorView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(decorView, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI2$finishListener$1", "callback", "(Lcom/tencent/mm/autogen/events/FinderLiveFinishEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentTransparentActivity", "FinderLiveFinishEvent to finish by activityHash match");
                    activityC14109x83bd09.finish();
                }
                return false;
            }
        };
    }

    @Override // com.p314xaae8f345.mm.ui.p2705xb436f21c.AbstractActivityC22405xf322b380
    public boolean K6(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String simpleName = activity.getClass().getSimpleName();
        boolean z17 = r26.i0.n(simpleName, "FinderLiveVisitorWithoutAffinityUI", false) || r26.i0.n(simpleName, "FinderLiveVisitorAffinityUI", false) || r26.i0.n(simpleName, "FinderLiveVisitorTopStoryAffinityUI", false);
        if (z17) {
            this.f191118m = activity.hashCode();
            this.f191117i.mo50300x3fa464aa(this.f191119n);
        }
        return z17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2705xb436f21c.AbstractActivityC22405xf322b380, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575905la);
        } else {
            setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575905la);
        }
        super.onCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(attributes, "getAttributes(...)");
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        android.view.View decorView = getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) decorView;
        ez2.e eVar = ez2.g.f339435a;
        if (eVar != null) {
            eVar.b();
        }
        android.widget.ImageView imageView = new android.widget.ImageView(this);
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        this.f191116h = imageView;
        viewGroup.addView(imageView, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.widget.ImageView imageView2 = this.f191116h;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgView");
            throw null;
        }
        imageView2.setVisibility(8);
        android.widget.ImageView imageView3 = this.f191116h;
        if (imageView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgView");
            throw null;
        }
        imageView3.setImageDrawable(new android.graphics.drawable.ColorDrawable(-16777216));
        mo48813x58998cd();
        mo48813x58998cd();
        mo48813x58998cd();
        mo48813x58998cd();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentTransparentActivity", "OccupyFinderUI2 create: " + hashCode());
        this.f191117i.mo50297x7c4d7ca2(this.f191119n, 2000L);
    }

    @Override // com.p314xaae8f345.mm.ui.p2705xb436f21c.AbstractActivityC22405xf322b380, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f191117i.mo50300x3fa464aa(this.f191119n);
        mo48814x2efc64();
        mo48814x2efc64();
        mo48814x2efc64();
        mo48814x2efc64();
    }
}
