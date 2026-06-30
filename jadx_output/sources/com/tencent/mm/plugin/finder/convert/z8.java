package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class z8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f105090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f105091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f105092f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f105093g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f105094h;

    public z8(boolean[] zArr, in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.qe qeVar, int i17, android.view.View view) {
        this.f105090d = zArr;
        this.f105091e = s0Var;
        this.f105092f = qeVar;
        this.f105093g = i17;
        this.f105094h = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        boolean z17;
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$bindAwesomeLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean[] zArr = this.f105090d;
        if (zArr[0]) {
            zArr[0] = false;
        } else {
            fo3.s sVar = fo3.s.INSTANCE;
            sVar.Z7("ce_feed_like", "<FeedLike>");
            sVar.H2("ce_feed_like", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
            sVar.Qa("ce_feed_like");
        }
        in5.s0 s0Var = this.f105091e;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i;
        boolean c17 = hc2.o0.c(baseFinderFeed.getFeedObject().getFeedObject());
        com.tencent.mm.plugin.finder.convert.qe qeVar = this.f105092f;
        if (!c17) {
            qeVar.L1(s0Var, baseFinderFeed);
            str = "forbid like";
        } else if (qeVar.f104358f.d0()) {
            android.content.Context context = s0Var.f293121e;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer = activity != null ? (com.tencent.mm.plugin.finder.view.FinderLikeDrawer) activity.findViewById(com.tencent.mm.R.id.edo) : null;
            kotlin.jvm.internal.o.d(finderLikeDrawer);
            com.tencent.mm.plugin.finder.view.FinderLikeDrawer.w(finderLikeDrawer, this.f105091e, baseFinderFeed.getFeedObject(), null, 0, null, null, 56, null);
            str = "open like in self scene";
        } else {
            qeVar.getClass();
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j17 = elapsedRealtime - qeVar.f104362m;
            if (!(41 <= j17 && j17 < 300) || (i17 = qeVar.f104364o) >= 5) {
                qeVar.f104364o = 0;
                z17 = true;
            } else {
                qeVar.f104364o = i17 + 1;
                qeVar.f104362m = elapsedRealtime;
                z17 = false;
            }
            if (z17) {
                qeVar.f104362m = android.os.SystemClock.elapsedRealtime();
                this.f105092f.l0(this.f105091e, 1, false, null, this.f105093g);
                str = "can like other";
            } else {
                str = "can't like other";
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "[onClickLike]:" + s0Var.getAdapterPosition() + " feedId:" + pm0.v.u(baseFinderFeed.getItemId()) + " res=" + str);
        d92.s sVar2 = d92.k0.f227486e;
        kotlin.jvm.internal.o.d(view);
        java.lang.String a17 = sVar2.a(view, true);
        android.view.View view2 = this.f105094h;
        view2.announceForAccessibility(a17);
        view2.setContentDescription(sVar2.a(view, false));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$bindAwesomeLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
