package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public abstract class qe extends com.tencent.mm.plugin.finder.convert.w7 {
    public static boolean Z;

    /* renamed from: x0, reason: collision with root package name */
    public static int f104356x0;
    public kotlinx.coroutines.r2 A;
    public kotlinx.coroutines.r2 B;
    public kotlinx.coroutines.r2 C;
    public android.view.View D;
    public boolean E;
    public al5.u4 F;
    public final jz5.g G;
    public final jz5.g H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f104357J;
    public final int K;
    public boolean L;
    public final int[] M;
    public final android.graphics.Rect N;
    public final boolean P;
    public final boolean Q;
    public final com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$uiLifecycleObserver$1 R;
    public java.lang.Runnable S;
    public final com.tencent.mm.plugin.finder.convert.v9 T;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.k8 f104358f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f104359g;

    /* renamed from: h, reason: collision with root package name */
    public final int f104360h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f104361i;

    /* renamed from: m, reason: collision with root package name */
    public long f104362m;

    /* renamed from: n, reason: collision with root package name */
    public long f104363n;

    /* renamed from: o, reason: collision with root package name */
    public int f104364o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f104365p;

    /* renamed from: q, reason: collision with root package name */
    public android.animation.AnimatorSet f104366q;

    /* renamed from: r, reason: collision with root package name */
    public android.animation.AnimatorSet f104367r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashSet f104368s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f104369t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f104370u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f104371v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f104372w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f104373x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f104374y;

    /* renamed from: z, reason: collision with root package name */
    public in5.s0 f104375z;
    public static final com.tencent.mm.plugin.finder.convert.t8 U = new com.tencent.mm.plugin.finder.convert.t8(null);
    public static final java.util.Map V = new java.util.LinkedHashMap();
    public static final java.lang.Integer[] W = {java.lang.Integer.valueOf(com.tencent.mm.R.id.msw), java.lang.Integer.valueOf(com.tencent.mm.R.id.a_x), java.lang.Integer.valueOf(com.tencent.mm.R.id.c79), java.lang.Integer.valueOf(com.tencent.mm.R.id.f487088ng5), java.lang.Integer.valueOf(com.tencent.mm.R.id.duo), java.lang.Integer.valueOf(com.tencent.mm.R.id.f487278o45)};
    public static final java.lang.Integer[] X = {java.lang.Integer.valueOf(com.tencent.mm.R.id.msm), java.lang.Integer.valueOf(com.tencent.mm.R.id.i1g), java.lang.Integer.valueOf(com.tencent.mm.R.id.c6s), java.lang.Integer.valueOf(com.tencent.mm.R.id.f487086ng3), java.lang.Integer.valueOf(com.tencent.mm.R.id.dty)};
    public static final java.lang.Integer[] Y = {java.lang.Integer.valueOf(com.tencent.mm.R.id.h6p), java.lang.Integer.valueOf(com.tencent.mm.R.id.h6i), java.lang.Integer.valueOf(com.tencent.mm.R.id.h6b), java.lang.Integer.valueOf(com.tencent.mm.R.id.h6s), java.lang.Integer.valueOf(com.tencent.mm.R.id.h6f)};

    /* renamed from: p0, reason: collision with root package name */
    public static float f104355p0 = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.B1().r()).floatValue();

    static {
        int i17;
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i18 = a17.f197135a;
        if (!z17 && i18 > (i17 = a17.f197136b)) {
            i18 = i17;
        }
        f104356x0 = (int) (i18 * f104355p0);
    }

    /* JADX WARN: Type inference failed for: r7v28, types: [com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$uiLifecycleObserver$1] */
    public qe(com.tencent.mm.plugin.finder.feed.k8 contract, boolean z17, int i17, boolean z18) {
        fc2.c Y6;
        int i18;
        kotlin.jvm.internal.o.g(contract, "contract");
        this.f104358f = contract;
        this.f104359g = z17;
        this.f104360h = i17;
        this.f104361i = z18;
        this.f104362m = -1L;
        this.f104363n = -1L;
        this.f104365p = true;
        this.f104368s = new java.util.HashSet();
        this.f104369t = jz5.h.b(com.tencent.mm.plugin.finder.convert.d9.f103134d);
        this.f104370u = jz5.h.b(com.tencent.mm.plugin.finder.convert.ga.f103467d);
        jz5.h.b(new com.tencent.mm.plugin.finder.convert.ne(this));
        this.f104371v = jz5.h.b(new com.tencent.mm.plugin.finder.convert.s9(this));
        this.f104372w = jz5.h.b(new com.tencent.mm.plugin.finder.convert.u9(this));
        jz5.h.b(new com.tencent.mm.plugin.finder.convert.t9(this));
        jz5.h.b(new com.tencent.mm.plugin.finder.convert.h9(this));
        jz5.h.b(new com.tencent.mm.plugin.finder.convert.i9(this));
        this.f104373x = jz5.h.b(new com.tencent.mm.plugin.finder.convert.oe(this));
        this.f104374y = jz5.h.b(com.tencent.mm.plugin.finder.convert.j9.f103737d);
        this.G = jz5.h.b(com.tencent.mm.plugin.finder.convert.x9.f104937d);
        this.H = jz5.h.b(com.tencent.mm.plugin.finder.convert.w9.f104855d);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        float floatValue = ((java.lang.Number) t70Var.B1().r()).floatValue();
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.System.nanoTime();
        boolean z19 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i19 = a17.f197135a;
        if (!z19 && i19 > (i18 = a17.f197136b)) {
            i19 = i18;
        }
        int i27 = (int) (i19 * floatValue);
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "init maxRecommendTvWidthPercentConfig=" + floatValue + "(ori=" + f104355p0 + "),initMaxRecommendTvWidth=" + i27 + "(ori=" + f104356x0 + ')');
        f104355p0 = floatValue;
        f104356x0 = i27;
        this.I = jz5.h.b(com.tencent.mm.plugin.finder.convert.dc.f103140d);
        androidx.appcompat.app.AppCompatActivity context = contract.getF122643d().getContext();
        if (context != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar != null && (Y6 = nyVar.Y6(i17)) != null) {
                Y6.a(new com.tencent.mm.plugin.finder.convert.r8(this, context));
            }
        }
        this.K = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Ba).getValue()).r()).intValue();
        com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f479254u6);
        i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 2.0f);
        this.M = new int[2];
        this.N = new android.graphics.Rect();
        this.P = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127629c0).getValue()).r()).intValue() == 1;
        this.Q = ((java.lang.Number) t70Var.s2().r()).intValue() == 1;
        this.R = new td2.c() { // from class: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$uiLifecycleObserver$1
            @Override // td2.c
            public void onCreate(androidx.lifecycle.y var1) {
                kotlin.jvm.internal.o.g(var1, "var1");
            }

            @Override // td2.c
            public void onDestroy(androidx.lifecycle.y var1) {
                kotlin.jvm.internal.o.g(var1, "var1");
                com.tencent.mm.plugin.finder.convert.qe qeVar = com.tencent.mm.plugin.finder.convert.qe.this;
                java.util.Iterator it = qeVar.f104368s.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$StateListener finderFeedFullConvert$StateListener = (com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$StateListener) it.next();
                    gs2.c cVar = gs2.c.f275072a;
                    in5.s0 holder = finderFeedFullConvert$StateListener.f102827e;
                    kotlin.jvm.internal.o.g(holder, "holder");
                    int hashCode = holder.hashCode();
                    gs2.c.f275073b.remove(java.lang.Integer.valueOf(hashCode));
                    gs2.c.f275074c.remove(java.lang.Integer.valueOf(hashCode));
                    finderFeedFullConvert$StateListener.dead();
                }
                qeVar.f104368s.clear();
                qeVar.q0(var1);
            }

            @Override // td2.c
            public void onPause(androidx.lifecycle.y var1) {
                kotlin.jvm.internal.o.g(var1, "var1");
            }

            @Override // td2.c
            public void onResume(androidx.lifecycle.y var1) {
                kotlin.jvm.internal.o.g(var1, "var1");
            }

            @Override // td2.c
            public void onStart(androidx.lifecycle.y var1) {
                kotlin.jvm.internal.o.g(var1, "var1");
            }

            @Override // td2.c
            public void onStop(androidx.lifecycle.y var1) {
                kotlin.jvm.internal.o.g(var1, "var1");
                com.tencent.mm.plugin.finder.convert.qe.this.r0(var1);
            }
        };
        this.T = new com.tencent.mm.plugin.finder.convert.v9(this);
    }

    public static void B(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 holder, int i17, boolean z17, int i18, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkJumpProfile");
        }
        if ((i19 & 2) != 0) {
            i17 = -1;
        }
        int i27 = i17;
        if ((i19 & 4) != 0) {
            z17 = false;
        }
        boolean z18 = z17;
        if ((i19 & 8) != 0) {
            i18 = 1;
        }
        int i28 = i18;
        qeVar.getClass();
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) holder.f293125i;
        if (ya2.d.f(baseFinderFeed.getContact())) {
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "checkJumpProfile: contact, notExist");
            qeVar.L1(holder, baseFinderFeed);
            return;
        }
        com.tencent.mm.plugin.finder.assist.m3.f102381a.a(holder, baseFinderFeed, qeVar.f104358f, i27, qeVar.R(holder), z18, i28);
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.a4) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.a4.class)).f133730z = new com.tencent.mm.plugin.finder.convert.a9(qeVar, holder);
    }

    public static /* synthetic */ void E0(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17, long j17, com.tencent.mm.plugin.finder.storage.yj0 yj0Var, int i17, int i18, boolean z18, long j18, int i19, int i27, int i28, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openCommentDrawer");
        }
        qeVar.D0(s0Var, baseFinderFeed, (i28 & 4) != 0 ? false : z17, (i28 & 8) != 0 ? 0L : j17, (i28 & 16) != 0 ? null : yj0Var, (i28 & 32) != 0 ? -1 : i17, (i28 & 64) != 0 ? 0 : i18, (i28 & 128) != 0 ? false : z18, (i28 & 256) != 0 ? 1000L : j18, (i28 & 512) != 0 ? 0 : i19, (i28 & 1024) != 0 ? 0 : i27);
    }

    public static /* synthetic */ void G(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkShowFollowLayout");
        }
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        qeVar.F(s0Var, baseFinderFeed, z17);
    }

    public static /* synthetic */ void M0(com.tencent.mm.plugin.finder.convert.qe qeVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshCommentLayout");
        }
        if ((i17 & 4) != 0) {
            str = null;
        }
        qeVar.L0(baseFinderFeed, s0Var, str);
    }

    public static /* synthetic */ void b0(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handlePostFakeOk");
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        qeVar.a0(s0Var, baseFinderFeed, z17);
    }

    public static /* synthetic */ void f0(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initBulletLayout");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        qeVar.e0(s0Var, z17);
    }

    public static void n1(com.tencent.mm.plugin.finder.convert.qe qeVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, in5.s0 holder, boolean z17, int i17, java.lang.Object obj) {
        android.view.View view;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshPostProgress");
        }
        qeVar.getClass();
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        boolean z18 = false;
        if (!item.N0()) {
            android.view.View p17 = holder.p(com.tencent.mm.R.id.f484904fw0);
            if (p17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p18 = holder.p(com.tencent.mm.R.id.gbz);
            if (p18 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "[refreshPostProgress] isPostFinish:" + item.getFeedObject().isPostFinish() + " isFinishPostSoon:" + item.getIsFinishPostSoon() + " postProgress:" + item.getFeedObject().getPostInfo().getInteger(4));
        if (item.getFeedObject().isPostFinish() || item.getFeedObject().getPostInfo().getInteger(4) >= 100 || item.F0()) {
            if (item.getIsFinishPostSoon()) {
                qeVar.w0(item, holder);
                item.j1(false);
                return;
            }
            return;
        }
        if (holder.p(com.tencent.mm.R.id.f484904fw0) == null) {
            try {
                android.view.ViewStub viewStub = (android.view.ViewStub) holder.p(com.tencent.mm.R.id.tfc);
                if (viewStub != null) {
                    viewStub.inflate();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("FinderFeedFullConvert", e17, "", new java.lang.Object[0]);
            }
        }
        com.tencent.mm.view.RingProgressView ringProgressView = (com.tencent.mm.view.RingProgressView) holder.p(com.tencent.mm.R.id.l1z);
        if (ringProgressView == null) {
            return;
        }
        if (qeVar.f104361i) {
            com.tencent.mm.view.RingProgressView ringProgressView2 = (com.tencent.mm.view.RingProgressView) holder.p(com.tencent.mm.R.id.l1z);
            if (ringProgressView2 != null) {
                ringProgressView2.setForeColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f478512u));
            }
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.l1t);
            if (textView != null) {
                textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.BW_0_Alpha_0_8));
            }
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.dph);
            if (textView2 != null) {
                textView2.setTextColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.BW_0_Alpha_0_8));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.f486365l06);
            if (weImageView != null) {
                weImageView.setIconColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.BW_0_Alpha_0_8));
            }
            android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.l08);
            if (textView3 != null) {
                textView3.setTextColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.BW_0_Alpha_0_8));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.l1k);
            if (weImageView2 != null) {
                weImageView2.setIconColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.BW_0_Alpha_0_8));
            }
            android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.l1m);
            if (textView4 != null) {
                textView4.setTextColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.BW_0_Alpha_0_8));
            }
        }
        android.view.View p19 = holder.p(com.tencent.mm.R.id.f484904fw0);
        if (p19 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p27 = holder.p(com.tencent.mm.R.id.gbz);
        if (p27 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.content.Context context = holder.f293121e;
        ringProgressView.setBackColor(context.getResources().getColor(com.tencent.mm.R.color.f479248u0));
        android.view.View p28 = holder.p(com.tencent.mm.R.id.f486379l20);
        android.view.View p29 = holder.p(com.tencent.mm.R.id.l0b);
        android.widget.TextView textView5 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.dph);
        android.view.View p37 = holder.p(com.tencent.mm.R.id.l1l);
        android.view.View p38 = holder.p(com.tencent.mm.R.id.l07);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(p38, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p38.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(p38, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (item.getFeedObject().isPostFailed()) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            view = p38;
            yj0.a.d(p29, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p29.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(p29, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(p28, arrayList7.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (item.getFeedObject().isPostFailedCanRetry()) {
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(p37, arrayList8.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p37.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(p37, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                arrayList9.add(8);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(p37, arrayList9.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p37.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(p37, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            kotlin.jvm.internal.o.d(textView5);
            com.tencent.mm.ui.fk.a(textView5);
            if (item.getFeedObject().isPostNoAuth()) {
                textView5.setText(android.text.Html.fromHtml(context.getResources().getString(com.tencent.mm.R.string.ex6)));
                textView5.setOnClickListener(new com.tencent.mm.plugin.finder.convert.bd(qeVar));
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                arrayList10.add(0);
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(p37, arrayList10.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p37.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                yj0.a.f(p37, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (item.getFeedObject().isEventClosed()) {
                textView5.setText(context.getResources().getString(com.tencent.mm.R.string.f492007ex4));
            } else if (item.getFeedObject().isEventExpired()) {
                textView5.setText(context.getResources().getString(com.tencent.mm.R.string.f492008ex5));
            } else {
                textView5.setText(context.getResources().getString(com.tencent.mm.R.string.nn6));
            }
        } else {
            view = p38;
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            arrayList11.add(8);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(p29, arrayList11.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p29.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(p29, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            arrayList12.add(0);
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(p28, arrayList12.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList13 = new java.util.ArrayList();
            arrayList13.add(8);
            java.util.Collections.reverse(arrayList13);
            yj0.a.d(p37, arrayList13.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p37.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
            yj0.a.f(p37, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView6 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.l1t);
            if (textView6 != null) {
                com.tencent.mm.ui.fk.a(textView6);
            }
            hc2.f1.D(ringProgressView, item.getFeedObject().getPostInfo().getInteger(4), "feed", "Finder.FeedFullConvert");
            android.widget.TextView textView7 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.r8f);
            sr2.t tVar = sr2.t.f411718d;
            long itemId = item.getItemId();
            java.util.Map map = sr2.t.f411719e;
            java.lang.Long l17 = (java.lang.Long) ((java.util.LinkedHashMap) map).get(java.lang.Long.valueOf(itemId));
            if (l17 != null) {
                if (c01.id.a() - l17.longValue() >= ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.M).getValue()).r()).longValue() * 1000) {
                    z18 = true;
                }
            }
            if (z18) {
                textView7.setText(context.getResources().getString(com.tencent.mm.R.string.o0l));
            } else {
                textView7.setText(context.getResources().getString(com.tencent.mm.R.string.o0m));
                long itemId2 = item.getItemId();
                if (!map.containsKey(java.lang.Long.valueOf(itemId2))) {
                    map.put(java.lang.Long.valueOf(itemId2), java.lang.Long.valueOf(c01.id.a()));
                }
                if (qeVar.S == null) {
                    com.tencent.mm.plugin.finder.convert.pe peVar = new com.tencent.mm.plugin.finder.convert.pe(textView7, context);
                    qeVar.S = peVar;
                    long longValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.M).getValue()).r()).longValue() * 1000;
                    java.util.regex.Pattern pattern = pm0.v.f356802a;
                    com.tencent.mm.sdk.platformtools.u3.i(peVar, longValue);
                }
            }
        }
        view.setOnClickListener(new com.tencent.mm.plugin.finder.convert.cd(item));
        p37.setOnClickListener(new com.tencent.mm.plugin.finder.convert.dd(item));
    }

    public static final void q(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var, android.view.MotionEvent motionEvent) {
        qeVar.getClass();
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
        if (finderVideoLayout != null && finderVideoLayout.D()) {
            return;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(com.tencent.mm.R.id.h6s);
        com.tencent.mm.view.MMPAGView L = qeVar.L(s0Var);
        android.content.Context context = s0Var.f293121e;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.addView(L);
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.jdk);
        android.view.ViewGroup viewGroup = p17 instanceof android.view.ViewGroup ? (android.view.ViewGroup) p17 : null;
        if (viewGroup != null) {
            viewGroup.addView(linearLayout);
        }
        L.setVisibility(0);
        int b17 = i65.a.b(context, 8);
        c06.d dVar = c06.e.f37716d;
        int i17 = -b17;
        int e17 = dVar.e(i17, b17);
        int e18 = dVar.e(i17, b17);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (!((java.lang.Boolean) t70Var.O1().r()).booleanValue()) {
            linearLayout.post(new com.tencent.mm.plugin.finder.convert.f9(motionEvent, linearLayout, qeVar, e17, e18));
        }
        L.g();
        uw2.h0 h0Var = uw2.h0.f431674a;
        android.animation.AnimatorSet g17 = uw2.h0.g(h0Var, linearLayout, 0L, 2, null);
        com.tencent.mm.plugin.finder.convert.g9 g9Var = new com.tencent.mm.plugin.finder.convert.g9(s0Var, linearLayout, qeVar);
        g17.addListener(new com.tencent.mm.plugin.finder.convert.e9(g9Var, g9Var));
        if (((java.lang.Boolean) t70Var.O1().r()).booleanValue()) {
            android.animation.AnimatorSet animatorSet = qeVar.f104367r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            qeVar.f104367r = g17;
        }
        g17.start();
        kotlin.jvm.internal.o.d(weImageView);
        uw2.h0.o(h0Var, weImageView, 0L, 2, null);
        hc2.f1.x(s0Var.itemView);
    }

    public static /* synthetic */ void x(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, boolean z17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateMediaLayoutParams");
        }
        if ((i18 & 8) != 0) {
            z17 = false;
        }
        qeVar.w(s0Var, baseFinderFeed, i17, z17);
    }

    public void A(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    public void A0(ec2.f ev6) {
        in5.s0 s0Var;
        com.tencent.mm.plugin.finder.view.w2 w2Var;
        com.tencent.mm.plugin.finder.view.FinderCountDownTextView finderCountDownTextView;
        com.tencent.mm.plugin.finder.view.FinderCountDownTextView finderCountDownTextView2;
        vx2.k fastSeekHelper;
        kotlin.jvm.internal.o.g(ev6, "ev");
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f104357J;
        androidx.recyclerview.widget.f2 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        if (wxRecyclerAdapter == null || (s0Var = (in5.s0) in5.n0.Y(wxRecyclerAdapter, ev6.f250965j, false, 2, null)) == null) {
            return;
        }
        this.f104851e.g(s0Var, ev6);
        com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout finderFeedNewSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout) s0Var.p(com.tencent.mm.R.id.f484896qk3);
        if (finderFeedNewSeekBarLayout != null && (fastSeekHelper = finderFeedNewSeekBarLayout.getFastSeekHelper()) != null) {
            vx2.k.e(fastSeekHelper, 0L, false, 3, null);
        }
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class);
        if (finderSpeedControlUIC != null) {
            finderSpeedControlUIC.X6(s0Var);
        }
        com.tencent.mm.plugin.finder.feed.k8 k8Var = this.f104358f;
        if (k8Var instanceof ac2.t) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i;
            ac2.t tVar = (ac2.t) k8Var;
            kotlin.jvm.internal.o.d(baseFinderFeed);
            tVar.getClass();
            cw2.da videoView = ((com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k)).getVideoView();
            boolean l17 = videoView != null ? videoView.l() : true;
            java.lang.String str = "onVideoPause feedId=" + pm0.v.u(baseFinderFeed.getItemId()) + " isStartingOrPlaying=" + l17 + " isPromotionFeed=" + baseFinderFeed.getFeedObject().isNativeDramaPromotionFeed();
            java.lang.String str2 = tVar.B;
            com.tencent.mars.xlog.Log.i(str2, str);
            if (!tVar.f3056J) {
                if (tVar.T == baseFinderFeed.getItemId()) {
                    if (!l17 && (w2Var = tVar.S) != null && (finderCountDownTextView = (com.tencent.mm.plugin.finder.view.FinderCountDownTextView) w2Var.findViewById(com.tencent.mm.R.id.ukc)) != null) {
                        finderCountDownTextView.a();
                    }
                    com.tencent.mars.xlog.Log.i(str2, "onVideoPause pauseCountDown " + pm0.v.u(baseFinderFeed.getItemId()) + " isStartingOrPlaying " + l17);
                    return;
                }
                return;
            }
            if (tVar.K == baseFinderFeed.getItemId() && !l17) {
                com.tencent.mm.plugin.finder.view.FinderCountDownTextView finderCountDownTextView3 = tVar.L;
                if (finderCountDownTextView3 != null) {
                    finderCountDownTextView3.a();
                }
                com.tencent.mars.xlog.Log.i(str2, "pauseCapsule(" + pm0.v.u(baseFinderFeed.getItemId()) + ')');
            }
            if (tVar.P != baseFinderFeed.getItemId() || l17) {
                return;
            }
            com.tencent.mm.plugin.finder.view.w2 w2Var2 = tVar.M;
            if (w2Var2 != null && (finderCountDownTextView2 = (com.tencent.mm.plugin.finder.view.FinderCountDownTextView) w2Var2.findViewById(com.tencent.mm.R.id.ukc)) != null) {
                finderCountDownTextView2.a();
            }
            tVar.j0(0.0f);
            com.tencent.mars.xlog.Log.i(str2, "pause showPromotionCountDownToast, reason=videoPause hostFeedId=".concat(pm0.v.u(baseFinderFeed.getItemId())));
        }
    }

    public final void A1(in5.s0 s0Var, int i17, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i18) {
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode() || i0()) {
            return;
        }
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.convert.pk) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.convert.pk.class)).Q6(s0Var, i17, baseFinderFeed, i18, this.f104358f, new com.tencent.mm.plugin.finder.convert.wd(this, s0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x094a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0947  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void B0(ec2.f r36) {
        /*
            Method dump skipped, instructions count: 2628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.qe.B0(ec2.f):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0295  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B1(in5.s0 r18, com.tencent.mm.plugin.finder.model.BaseFinderFeed r19) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.qe.B1(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    public final boolean C(com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        kotlin.jvm.internal.o.g(item, "item");
        if (hc2.b0.i(item) && !item.getFeedObject().isPostFinish()) {
            return !item.getFeedObject().isPostFailed() && (item.getFeedObject().isPostFinish() || item.getFeedObject().getPostInfo().getInteger(4) >= 100);
        }
        return true;
    }

    public void C0(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0222, code lost:
    
        if (r0 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0282, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C1(com.tencent.mm.plugin.finder.model.BaseFinderFeed r34, in5.s0 r35) {
        /*
            Method dump skipped, instructions count: 1311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.qe.C1(com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01f1, code lost:
    
        if (kotlin.jvm.internal.o.b(r0, (r15 == null || (r15 = (r45.vx0) r15.getCustom(0)) == null) ? null : java.lang.Integer.valueOf(r15.getInteger(4))) == false) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0302  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(in5.s0 r22, com.tencent.mm.plugin.finder.model.BaseFinderFeed r23) {
        /*
            Method dump skipped, instructions count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.qe.D(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0272, code lost:
    
        if (r12 == null) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D0(in5.s0 r32, com.tencent.mm.plugin.finder.model.BaseFinderFeed r33, boolean r34, long r35, com.tencent.mm.plugin.finder.storage.yj0 r37, int r38, int r39, boolean r40, long r41, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.qe.D0(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed, boolean, long, com.tencent.mm.plugin.finder.storage.yj0, int, int, boolean, long, int, int):void");
    }

    public final void D1(in5.s0 s0Var) {
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    public final void E(in5.s0 s0Var, boolean z17) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i;
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.msw);
        if (p17 != null) {
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.plugin.finder.viewmodel.component.h50) pf5.z.f353948a.a((com.tencent.mm.ui.MMActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.h50.class)).O6(p17, baseFinderFeed.getItemId(), z17 ? 4 : 3);
        }
    }

    public final void E1(com.tencent.mm.plugin.finder.model.BaseFinderFeed item, in5.s0 holder) {
        java.lang.String str;
        r45.fl2 fl2Var;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.ghh);
        if (p17 == null) {
            android.view.ViewStub viewStub = (android.view.ViewStub) holder.p(com.tencent.mm.R.id.ee8);
            p17 = viewStub != null ? viewStub.inflate() : null;
        }
        if (p17 != null) {
            int warnFlag = item.getFeedObject().getFeedObject().getWarnFlag();
            if (warnFlag == 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshWarnWording", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshWarnWording", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshWarnWording", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshWarnWording", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ghj);
            android.content.Context context = holder.f293121e;
            if (textView != null) {
                textView.setText(item.getFeedObject().getFeedObject().getWarnWording());
                textView.setTextSize(0, context.getResources().getDimension(com.tencent.mm.R.dimen.f479628b3));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.ghi);
            if (weImageView != null) {
                if ((warnFlag & 2) != 0) {
                    weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_exclamation_mark_circle);
                } else {
                    weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_error);
                }
            }
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            long itemId = item.getItemId();
            java.lang.String w17 = item.w();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.e6 aj6 = ((c61.p2) ybVar).aj(itemId, w17, nyVar != null ? nyVar.f135380n : 0);
            if (aj6 == null || (fl2Var = aj6.f125012a) == null || (str = fl2Var.getString(1)) == null) {
                str = "";
            }
            com.tencent.mm.plugin.finder.report.d2.m(com.tencent.mm.plugin.finder.report.d2.f124994a, p17, "reminder_bar", 0, 0, kz5.c1.k(new jz5.l("feed_id", pm0.v.u(item.getFeedObject().getId())), new jz5.l("session_buffer", str), new jz5.l("show_word", item.getFeedObject().getFeedObject().getWarnWording()), new jz5.l("promotion_reminder_type", 0)), null, 44, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0183, code lost:
    
        if (r1.f107709f == 8) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(in5.s0 r34, com.tencent.mm.plugin.finder.model.BaseFinderFeed r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 1153
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.qe.F(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed, boolean):void");
    }

    public final void F0(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        sc2.u2 u2Var = sc2.w2.f406328z;
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
        long id6 = baseFinderFeed.getFeedObject().getId();
        am.ia iaVar = feedUpdateEvent.f54252g;
        iaVar.f6918a = id6;
        iaVar.f6924g = baseFinderFeed.getFeedObject().getUserName();
        iaVar.f6919b = 38;
        u2Var.a(s0Var, feedUpdateEvent);
    }

    public final void F1(java.lang.String str, android.view.View view, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, java.lang.CharSequence charSequence) {
        java.lang.String str2;
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        jz5.l[] lVarArr = new jz5.l[2];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getItemId()));
        if (charSequence == null || (str2 = charSequence.toString()) == null) {
            str2 = "";
        }
        lVarArr[1] = new jz5.l("bubble_text", str2);
        com.tencent.mm.plugin.finder.report.d2.m(d2Var, view, str, 32, 0, kz5.c1.k(lVarArr), null, 40, null);
    }

    public final void G0(java.util.List list, java.util.List list2, java.util.List list3, float f17) {
        int i17 = 0;
        for (java.lang.Object obj : list2) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.widget.ImageView imageView = (android.widget.ImageView) obj;
            if (imageView != null) {
                android.view.ViewParent parent = imageView.getParent();
                com.tencent.mm.plugin.finder.feed.RoundLinearLayout roundLinearLayout = parent instanceof com.tencent.mm.plugin.finder.feed.RoundLinearLayout ? (com.tencent.mm.plugin.finder.feed.RoundLinearLayout) parent : null;
                if (roundLinearLayout != null) {
                    roundLinearLayout.setRadius(f17);
                }
                if (i17 >= list.size()) {
                    android.view.View view = (android.view.View) list3.get(i17);
                    if (view != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "realNameLayoutSetAvatar", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "realNameLayoutSetAvatar", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else {
                    android.view.View view2 = (android.view.View) list3.get(i17);
                    if (view2 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "realNameLayoutSetAvatar", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "realNameLayoutSetAvatar", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    int size = list.size();
                    if (size < 0) {
                        size = 0;
                    }
                    if (size > 3) {
                        size = 3;
                    }
                    int i19 = (size - i17) - 1;
                    java.lang.String headUrl = ((com.tencent.mm.protocal.protobuf.FinderCommentInfo) list.get(i19)).getHeadUrl();
                    if (headUrl == null) {
                        headUrl = "";
                    }
                    java.lang.String username = ((com.tencent.mm.protocal.protobuf.FinderCommentInfo) list.get(i19)).getUsername();
                    java.lang.String r17 = c01.z1.r();
                    com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "[setLikeAvatar] " + i17 + ", " + username + ", " + r17 + ", " + headUrl + ", " + imageView);
                    imageView.setImageDrawable(null);
                    boolean b17 = kotlin.jvm.internal.o.b(username, r17);
                    mn2.g1 g1Var = mn2.g1.f329975a;
                    if (b17) {
                        g1Var.i().c(new mn2.n("", null, 2, null), imageView, g1Var.h(mn2.f1.f329960n));
                        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView, r17, 0.0f);
                    } else if (headUrl.length() > 0) {
                        g1Var.i().c(new mn2.n(headUrl, null, 2, null), imageView, g1Var.h(mn2.f1.f329960n));
                    } else {
                        ng5.a.a(imageView, username);
                    }
                }
            }
            i17 = i18;
        }
    }

    public final void G1() {
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment;
        android.view.View view;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        com.tencent.mm.plugin.finder.feed.k8 k8Var = this.f104358f;
        com.tencent.mm.plugin.finder.feed.pz pzVar = k8Var instanceof com.tencent.mm.plugin.finder.feed.pz ? (com.tencent.mm.plugin.finder.feed.pz) k8Var : null;
        if (pzVar == null || (finderHomeTabFragment = pzVar.f108756h) == null || (view = finderHomeTabFragment.f206301h) == null || (refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) view.findViewById(com.tencent.mm.R.id.m6e)) == null) {
            return;
        }
        int i17 = com.tencent.mm.view.RefreshLoadMoreLayout.f213427y1;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        long floatValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Lb).getValue()).r()).floatValue() * 1000;
        com.tencent.mars.xlog.Log.i("MicroMsg.RLMoreLayout", "requestOptLayout forbidVerticalScroll");
        refreshLoadMoreLayout.forbidVerticalScroll = true;
        kotlinx.coroutines.r2 r2Var = refreshLoadMoreLayout.forbidVerticalScrollJob;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        refreshLoadMoreLayout.forbidVerticalScrollJob = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new ym5.v4(floatValue, refreshLoadMoreLayout, null), 3, null);
    }

    public final void H(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) t70Var.L0().r()).booleanValue()) {
            return;
        }
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.V3).getValue()).r()).intValue() == 1;
        jz5.l k17 = nv2.n1.f340551h.k(item.getFeedObject().getFeedObject());
        boolean booleanValue = ((java.lang.Boolean) k17.f302833d).booleanValue();
        ((java.lang.Boolean) k17.f302834e).booleanValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkShowFollowLikeLayout] isLike=");
        sb6.append(booleanValue);
        sb6.append(" tabType=");
        sb6.append(this.f104360h);
        sb6.append(" id=");
        sb6.append(pm0.v.u(item.getItemId()));
        sb6.append(" nickname=");
        ya2.b2 contact = item.getContact();
        sb6.append(contact != null ? contact.w0() : null);
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", sb6.toString());
        if (z17) {
            android.view.View p17 = ((java.lang.Number) t70Var.z0().r()).intValue() == 1 ? holder.p(com.tencent.mm.R.id.gal) : holder.p(com.tencent.mm.R.id.gao);
            android.widget.TextView textView = ((java.lang.Number) t70Var.z0().r()).intValue() == 1 ? (android.widget.TextView) holder.p(com.tencent.mm.R.id.gam) : (android.widget.TextView) holder.p(com.tencent.mm.R.id.gap);
            if (textView == null) {
                return;
            }
            textView.setText(holder.f293121e.getString(com.tencent.mm.R.string.cxg));
            if (p17.getVisibility() == 0 || booleanValue || !k0(item)) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            android.view.View view = p17;
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "checkShowFollowLikeLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "checkShowFollowLikeLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "checkShowFollowLikeLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p17.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "checkShowFollowLikeLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p17.animate().alpha(1.0f).setDuration(300L).setListener(new com.tencent.mm.plugin.finder.convert.c9(p17, holder, item)).start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if ((r0.length() == 0) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H0(com.tencent.mm.plugin.finder.model.BaseFinderFeed r8, in5.s0 r9) {
        /*
            r7 = this;
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r8.getFeedObject()
            boolean r1 = qe2.a.e(r0)
            if (r1 == 0) goto L19
            java.lang.String r0 = qe2.a.b(r0)
            int r1 = r0.length()
            if (r1 != 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 == 0) goto L1d
        L19:
            java.lang.String r0 = r8.n()
        L1d:
            ya2.b2 r8 = r8.getContact()
            boolean r8 = ya2.d.f(r8)
            java.lang.String r1 = "getView(...)"
            r2 = 2131298003(0x7f0906d3, float:1.8213967E38)
            r3 = 2
            mn2.g1 r4 = mn2.g1.f329975a
            r5 = 0
            if (r8 == 0) goto L4e
            vo0.d r8 = r4.a()
            mn2.n r0 = new mn2.n
            java.lang.String r6 = ""
            r0.<init>(r6, r5, r3, r5)
            android.view.View r9 = r9.p(r2)
            kotlin.jvm.internal.o.f(r9, r1)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            mn2.f1 r1 = mn2.f1.f329957h
            yo0.i r1 = r4.h(r1)
            r8.c(r0, r9, r1)
            goto L69
        L4e:
            vo0.d r8 = r4.a()
            mn2.n r6 = new mn2.n
            r6.<init>(r0, r5, r3, r5)
            android.view.View r9 = r9.p(r2)
            kotlin.jvm.internal.o.f(r9, r1)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            mn2.f1 r0 = mn2.f1.f329957h
            yo0.i r0 = r4.h(r0)
            r8.c(r6, r9, r0)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.qe.H0(com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0):void");
    }

    public final void H1(in5.s0 s0Var) {
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.f484486ee3);
        if (p17 != null) {
            p17.setTranslationY(0.0f);
        }
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.g1y);
        if (p18 != null) {
            p18.setTranslationY(0.0f);
        }
        android.view.View p19 = s0Var.p(com.tencent.mm.R.id.dq6);
        if (p19 == null) {
            return;
        }
        p19.setTranslationY(0.0f);
    }

    public void I(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    public final void I0(com.tencent.mm.plugin.finder.model.BaseFinderFeed item, boolean z17, boolean z18, int i17, in5.s0 holder, int i18) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.i1g);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.h6i);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.a_x);
        zy2.s6 s6Var = (zy2.s6) i95.n0.c(zy2.s6.class);
        zy2.r6 r6Var = new zy2.r6();
        r6Var.f477551b = z17;
        r6Var.f477550a = item.getIsPreview();
        r6Var.f477552c = item.getFeedObject().getFeedObject().getObjectType();
        r6Var.f477553d = this.f104358f.d0();
        r6Var.f477554e = this.f104361i;
        r6Var.f477555f = hc2.s.f(item.getContact());
        r6Var.f477556g = z18;
        r6Var.f477557h = cu2.f0.f222391a.e(item.getFeedObject().getFeedObject().getObjectType());
        r6Var.f477558i = item.getFeedObject().getFeedObject();
        r6Var.f477560k = hc2.o0.c(item.getFeedObject().getFeedObject());
        kotlin.jvm.internal.o.d(weImageView);
        ht2.y0 y0Var = (ht2.y0) s6Var;
        y0Var.Di(weImageView, r6Var);
        kotlin.jvm.internal.o.d(textView);
        y0Var.Ui(textView, viewGroup, r6Var);
        if (z17 && ((java.lang.Boolean) ((jz5.n) this.f104371v).getValue()).booleanValue()) {
            A1(holder, 0, item, 3);
        }
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) holder.p(com.tencent.mm.R.id.ghd);
        if (finderFullSeekBarLayout != null) {
            finderFullSeekBarLayout.H = item;
        }
        if (item.getIsDeepEnjoy()) {
            java.lang.Object obj = holder.f293125i;
            kotlin.jvm.internal.o.f(obj, "getAssociatedObject(...)");
            H(holder, (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj);
        }
    }

    public final void I1(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, boolean z17) {
        cw2.da videoView = ((com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k)).getVideoView();
        int currentPlaySecond = videoView != null ? videoView.getCurrentPlaySecond() : 0;
        if (!z17 || currentPlaySecond == 0) {
            r0 = videoView != null ? videoView.r(i17, true, 3) : false;
            baseFinderFeed.o1(r0);
        }
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", pm0.v.u(baseFinderFeed.getItemId()) + " isAuto:" + z17 + " curPlaySec:" + currentPlaySecond + " anchorJump time:" + i17 + " result:" + r0);
    }

    public final void J(in5.s0 s0Var) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.tty);
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            com.tencent.mm.plugin.finder.view.FinderCountDownTextView finderCountDownTextView = (com.tencent.mm.plugin.finder.view.FinderCountDownTextView) viewGroup.findViewById(com.tencent.mm.R.id.f484946tu1);
            if (finderCountDownTextView != null) {
                finderCountDownTextView.a();
                finderCountDownTextView.setOnClickListener(null);
            }
            android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.f484944e9);
            if (findViewById != null) {
                findViewById.setOnClickListener(null);
            }
            android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.e_);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(null);
            }
        }
    }

    public void J0(in5.s0 holder, boolean z17) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    public final void J1(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17, java.lang.String str) {
        int d17 = i65.a.d(s0Var.f293121e, S(z17, baseFinderFeed.getIsPreview(), this.f104361i));
        for (java.lang.Integer num : X) {
            android.widget.TextView textView = (android.widget.TextView) s0Var.p(num.intValue());
            if (textView != null) {
                textView.setTextColor(d17);
            }
        }
        for (java.lang.Integer num2 : Y) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(num2.intValue());
            if (weImageView != null) {
                weImageView.setIconColor(d17);
            }
        }
        for (java.lang.Integer num3 : W) {
            android.view.View p17 = s0Var.p(num3.intValue());
            if (p17 != null) {
                p17.setEnabled(z17);
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "[setOpLayoutStatus] feedId:" + pm0.v.u(baseFinderFeed.getItemId()) + " enable:" + z17 + " source:" + str);
    }

    public abstract void K(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, int i18);

    public final void K0(in5.s0 s0Var) {
        android.view.View R6;
        android.view.View R62;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ld ldVar = (com.tencent.mm.plugin.finder.viewmodel.component.ld) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.ld.class);
        if (ldVar != null && ldVar.d7(s0Var) && (R62 = ldVar.R6(s0Var)) != null) {
            android.view.View findViewById = R62.findViewById(com.tencent.mm.R.id.jyc);
            if (findViewById != null) {
                findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.id(ldVar, s0Var));
            }
            android.view.View findViewById2 = R62.findViewById(com.tencent.mm.R.id.b09);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.jd(ldVar, s0Var));
            }
            ym5.a1.h(R62, null);
            ym5.a1.h(R62, new com.tencent.mm.plugin.finder.viewmodel.component.kd(ldVar, s0Var));
        }
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.yd ydVar = (com.tencent.mm.plugin.finder.viewmodel.component.yd) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).e(com.tencent.mm.plugin.finder.viewmodel.component.yd.class);
        if (ydVar == null || !ydVar.d7(s0Var) || (R6 = ydVar.R6(s0Var)) == null) {
            return;
        }
        android.view.View findViewById3 = R6.findViewById(com.tencent.mm.R.id.jyc);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.pd(ydVar, s0Var));
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) R6.findViewById(com.tencent.mm.R.id.b09);
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.qd(ydVar, s0Var));
        }
        ym5.a1.h(R6, null);
        ym5.a1.h(R6, new com.tencent.mm.plugin.finder.viewmodel.component.rd(ydVar, s0Var));
    }

    public final void K1(android.view.View view, int i17) {
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "setVideoMaskVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "setVideoMaskVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "setVideoMaskVisibility, videoMask: " + view + ", visibility: " + i17);
    }

    public final com.tencent.mm.view.MMPAGView L(in5.s0 s0Var) {
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.view.MMPAGView mMPAGView = new com.tencent.mm.view.MMPAGView(context, null);
        android.content.Context context2 = s0Var.f293121e;
        int dimension = (int) context2.getResources().getDimension(com.tencent.mm.R.dimen.f479675cc);
        mMPAGView.setVisibility(4);
        mMPAGView.setRepeatCount(1);
        mMPAGView.setProgress(0.0d);
        mMPAGView.o(((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.Z0().r()).booleanValue());
        if (mMPAGView.getUseRfx()) {
            mMPAGView.setComposition(com.tencent.mm.rfx.RfxPagFile.Load(context2.getAssets(), "finder_finger_like_animator_new.pag"));
        } else {
            mMPAGView.setComposition(org.libpag.PAGFile.Load(context2.getAssets(), "finder_finger_like_animator_new.pag"));
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(dimension, dimension);
        layoutParams.gravity = 17;
        mMPAGView.setLayoutParams(layoutParams);
        return mMPAGView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b1, code lost:
    
        if ((r7 == 2 || r7 == 3) == false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L0(com.tencent.mm.plugin.finder.model.BaseFinderFeed r17, in5.s0 r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.qe.L0(com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0, java.lang.String):void");
    }

    public final void L1(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String b27 = this.f104358f.b2(item);
        if (b27.length() > 0) {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(holder.f293121e);
            e4Var.f211776c = b27;
            e4Var.c();
        }
    }

    public final r45.zu0 M(java.lang.String username, int i17, boolean z17) {
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        kotlin.jvm.internal.o.g(username, "username");
        r45.zu0 zu0Var = (r45.zu0) ((cq.k) c17).f221225f.c(username, cq.g.f221196d);
        int integer = zu0Var.getInteger(0);
        int integer2 = zu0Var.getInteger(1);
        if (i17 == 1) {
            integer += z17 ? 1 : -1;
        }
        if (i17 == 2) {
            integer2 += z17 ? 1 : -1;
        }
        r45.zu0 zu0Var2 = new r45.zu0();
        zu0Var2.set(0, java.lang.Integer.valueOf(integer));
        zu0Var2.set(1, java.lang.Integer.valueOf(integer2));
        zu0Var2.set(2, zu0Var.getList(2));
        zu0Var2.set(3, java.lang.Long.valueOf(c01.id.c()));
        i95.m c18 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ((cq.k) c18).Vi(username, zu0Var2);
        return zu0Var2;
    }

    public final void M1(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17) {
        android.view.View view;
        android.view.View view2;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.qf qfVar = (com.tencent.mm.plugin.finder.viewmodel.component.qf) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.qf.class);
        if (qfVar != null) {
            kotlin.jvm.internal.o.g(feed, "feed");
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject = feed.getFeedObject();
            qfVar.f135702o = true;
            qfVar.f135696f = feedObject;
            java.lang.String u17 = pm0.v.u(feedObject.getId());
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.finder.assist.o5.f102428a;
            java.lang.String str = (java.lang.String) com.tencent.mm.plugin.finder.assist.o5.f102428a.get(java.lang.Long.valueOf(feedObject.getLocalId()));
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = str;
            com.tencent.mars.xlog.Log.i("FinderFeedShareDescToCommentUIC", "[showRedPacketBubble] bubbleType:" + i17 + " feedId:" + u17 + " localId:" + feedObject.getLocalId() + " exportId:" + str2);
            android.view.View inflate = android.view.View.inflate(qfVar.getContext(), com.tencent.mm.R.layout.f488769ds, null);
            db5.d5 d5Var = qfVar.f135698h;
            if (d5Var != null) {
                d5Var.dismiss();
            }
            db5.d5 d5Var2 = new db5.d5(inflate);
            d5Var2.setAnimationStyle(com.tencent.mm.R.style.f494816x2);
            qfVar.f135698h = d5Var2;
            android.view.ViewGroup viewGroup = inflate != null ? (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.tw9) : null;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            android.widget.TextView textView = inflate != null ? (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.qsy) : null;
            android.widget.TextView textView2 = inflate != null ? (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.qsz) : null;
            android.view.View findViewById = inflate != null ? inflate.findViewById(com.tencent.mm.R.id.qsw) : null;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = inflate != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.f484987qt0) : null;
            if (i17 == 1) {
                view = findViewById;
                cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                aVar.pk(textView2, "make_red_envelope_banner");
                aVar.Tj(textView2, 40, 1, false);
                zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(qfVar.getActivity());
                aVar.Ai(textView2, new com.tencent.mm.plugin.finder.viewmodel.component.ff(Sj != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6() : null, feedObject));
            } else if (i17 != 2) {
                if (i17 == 3) {
                    if (textView != null) {
                        textView.setText(qfVar.getString(com.tencent.mm.R.string.ocp));
                    }
                    if (textView2 != null) {
                        textView2.setText(qfVar.getString(com.tencent.mm.R.string.ocb));
                    }
                    if (textView2 != null) {
                        textView2.setBackgroundResource(com.tencent.mm.R.drawable.f481626yf);
                    }
                    if (textView2 != null) {
                        textView2.setTextColor(qfVar.getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
                    }
                    if (weImageView != null) {
                        weImageView.setVisibility(8);
                    }
                    if (textView2 != null) {
                        view2 = findViewById;
                        hc2.v0.e(textView2, "original_statement_banner", 40, 0, false, false, null, new com.tencent.mm.plugin.finder.viewmodel.component.ef(feedObject), 60, null);
                        view = view2;
                    }
                }
                view2 = findViewById;
                view = view2;
            } else {
                view = findViewById;
                if (textView != null) {
                    textView.setText(qfVar.getString(com.tencent.mm.R.string.mqj));
                }
                if (textView2 != null) {
                    textView2.setBackgroundResource(com.tencent.mm.R.drawable.f481626yf);
                }
                if (textView2 != null) {
                    textView2.setTextColor(qfVar.getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
                }
                if (weImageView != null) {
                    weImageView.setIconColor(qfVar.getColor(com.tencent.mm.R.color.Yellow_100));
                }
                if (weImageView != null) {
                    weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_add_emoji);
                }
                cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                aVar2.pk(textView2, "create_emoji");
                aVar2.ik(textView2, 40, 25496);
                zy2.ra Sj2 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(qfVar.getActivity());
                aVar2.Ai(textView2, new com.tencent.mm.plugin.finder.viewmodel.component.gf(Sj2 != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj2).V6() : null, feedObject));
            }
            if (textView2 != null) {
                textView2.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.hf(i17, qfVar, feed, str2, feedObject));
            }
            if (view != null) {
                view.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.Cif(qfVar));
            }
            db5.d5 d5Var3 = qfVar.f135698h;
            if (d5Var3 != null) {
                d5Var3.setWidth(-1);
            }
            db5.d5 d5Var4 = qfVar.f135698h;
            if (d5Var4 != null) {
                d5Var4.setHeight(-2);
            }
            int dimensionPixelSize = qfVar.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479654bs) + qfVar.getContext().getWindow().getDecorView().getRootWindowInsets().getStableInsetBottom();
            db5.d5 d5Var5 = qfVar.f135698h;
            if (d5Var5 != null) {
                d5Var5.showAtLocation(qfVar.getContext().getWindow().getDecorView(), 80, 0, dimensionPixelSize);
            }
            qfVar.Q6(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0302, code lost:
    
        if ((r0 != null && r0.isRunning()) == false) goto L128;
     */
    /* JADX WARN: Removed duplicated region for block: B:199:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0221 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0261  */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(in5.s0 r43, android.view.MotionEvent r44, int r45) {
        /*
            Method dump skipped, instructions count: 1820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.qe.N(in5.s0, android.view.MotionEvent, int):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(69:1|(1:4)|5|(1:309)(1:9)|10|(5:12|(1:14)(1:307)|(1:16)(1:306)|17|(28:19|20|(1:22)(1:305)|23|24|25|26|(5:294|295|296|297|298)(1:28)|29|(1:31)(1:293)|32|33|(5:269|270|271|(1:(5:273|274|275|(1:277)(1:287)|(1:280)(1:279))(2:291|292))|283)(1:35)|36|37|38|39|40|41|42|43|44|45|(1:255)(1:49)|(1:254)(1:52)|53|(2:(1:56)|57)|(33:243|(2:(1:248)|249)|(3:(1:252)|253|71)|(2:(1:74)|75)(1:242)|76|(1:78)(1:241)|79|(1:81)|(1:83)|(1:85)|(1:87)|88|(4:90|(1:92)(1:239)|93|94)(1:240)|(4:232|233|(1:235)(1:237)|236)|(3:(2:101|(35:(1:104)(1:229)|(1:106)(1:228)|107|(6:114|115|(1:226)|118|(1:120)(1:223)|(19:124|(3:127|(1:129)(1:131)|130)|132|(3:134|(1:(3:136|(1:138)(1:219)|(2:141|142)(1:140))(2:220|221))|143)(1:222)|(1:145)|(1:218)(3:148|(1:(3:150|(1:152)(1:215)|(2:155|156)(1:154))(2:216|217))|157)|158|159|(1:(3:161|(1:163)(1:209)|(3:204|205|206)(2:165|166))(2:213|214))|207|169|(1:171)(1:203)|172|(1:174)|175|(3:177|(1:179)|180)|181|(1:183)(1:202)|(5:191|(1:193)|194|(1:196)(1:201)|(2:198|199)(1:200))(3:(1:187)|188|189)))|227|115|(1:117)(2:224|226)|118|(0)(0)|(1:122)|124|(3:127|(0)(0)|130)|132|(0)(0)|(0)|(0)|218|158|159|(2:(0)(0)|166)|207|169|(0)(0)|172|(0)|175|(0)|181|(0)(0)|(0)|191|(0)|194|(0)(0)|(0)(0)))|230|(0))|231|159|(2:(0)(0)|166)|207|169|(0)(0)|172|(0)|175|(0)|181|(0)(0)|(0)|191|(0)|194|(0)(0)|(0)(0))(32:(2:(1:63)|64)|(3:(1:69)|70|71)|(0)(0)|76|(0)(0)|79|(0)|(0)|(0)|(0)|88|(0)(0)|(0)|(0)|231|159|(2:(0)(0)|166)|207|169|(0)(0)|172|(0)|175|(0)|181|(0)(0)|(0)|191|(0)|194|(0)(0)|(0)(0))))|308|20|(0)(0)|23|24|25|26|(0)(0)|29|(0)(0)|32|33|(0)(0)|36|37|38|39|40|41|42|43|44|45|(1:47)|255|(0)|254|53|(0)|(0)|243|(3:245|(0)|249)|(0)|(0)(0)|76|(0)(0)|79|(0)|(0)|(0)|(0)|88|(0)(0)|(0)|(0)|231|159|(2:(0)(0)|166)|207|169|(0)(0)|172|(0)|175|(0)|181|(0)(0)|(0)|191|(0)|194|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0481, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0482, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0485, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0486, code lost:
    
        r5 = 1;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0489, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x048a, code lost:
    
        r5 = 1;
        r30 = r11;
        r31 = r13;
        r32 = "";
        r33 = r22;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0100, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0103, code lost:
    
        r4 = r4.subSequence(0, r5 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x04ad, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x04ae, code lost:
    
        r33 = com.tencent.mm.plugin.finder.viewmodel.component.ny.class;
        r3 = 0;
        r30 = r11;
        r31 = r13;
        r32 = "";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0377 A[Catch: all -> 0x02c5, TryCatch #2 {all -> 0x02c5, blocks: (B:233:0x02b2, B:235:0x02b8, B:236:0x02be, B:98:0x02cd, B:104:0x02db, B:106:0x02ee, B:107:0x0321, B:109:0x0335, B:111:0x033b, B:115:0x0345, B:118:0x0351, B:122:0x0364, B:124:0x0369, B:127:0x0371, B:129:0x0377, B:130:0x037d, B:132:0x0383, B:134:0x03b3, B:136:0x03ba, B:142:0x03c7, B:143:0x03d5, B:145:0x03f8, B:148:0x0405, B:150:0x040b, B:156:0x0416, B:157:0x0422, B:159:0x0443, B:161:0x044f, B:154:0x041d, B:140:0x03ce, B:224:0x034c, B:229:0x02e4), top: B:232:0x02b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03b3 A[Catch: all -> 0x02c5, TryCatch #2 {all -> 0x02c5, blocks: (B:233:0x02b2, B:235:0x02b8, B:236:0x02be, B:98:0x02cd, B:104:0x02db, B:106:0x02ee, B:107:0x0321, B:109:0x0335, B:111:0x033b, B:115:0x0345, B:118:0x0351, B:122:0x0364, B:124:0x0369, B:127:0x0371, B:129:0x0377, B:130:0x037d, B:132:0x0383, B:134:0x03b3, B:136:0x03ba, B:142:0x03c7, B:143:0x03d5, B:145:0x03f8, B:148:0x0405, B:150:0x040b, B:156:0x0416, B:157:0x0422, B:159:0x0443, B:161:0x044f, B:154:0x041d, B:140:0x03ce, B:224:0x034c, B:229:0x02e4), top: B:232:0x02b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03f8 A[Catch: all -> 0x02c5, TryCatch #2 {all -> 0x02c5, blocks: (B:233:0x02b2, B:235:0x02b8, B:236:0x02be, B:98:0x02cd, B:104:0x02db, B:106:0x02ee, B:107:0x0321, B:109:0x0335, B:111:0x033b, B:115:0x0345, B:118:0x0351, B:122:0x0364, B:124:0x0369, B:127:0x0371, B:129:0x0377, B:130:0x037d, B:132:0x0383, B:134:0x03b3, B:136:0x03ba, B:142:0x03c7, B:143:0x03d5, B:145:0x03f8, B:148:0x0405, B:150:0x040b, B:156:0x0416, B:157:0x0422, B:159:0x0443, B:161:0x044f, B:154:0x041d, B:140:0x03ce, B:224:0x034c, B:229:0x02e4), top: B:232:0x02b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x044f A[Catch: all -> 0x02c5, TRY_LEAVE, TryCatch #2 {all -> 0x02c5, blocks: (B:233:0x02b2, B:235:0x02b8, B:236:0x02be, B:98:0x02cd, B:104:0x02db, B:106:0x02ee, B:107:0x0321, B:109:0x0335, B:111:0x033b, B:115:0x0345, B:118:0x0351, B:122:0x0364, B:124:0x0369, B:127:0x0371, B:129:0x0377, B:130:0x037d, B:132:0x0383, B:134:0x03b3, B:136:0x03ba, B:142:0x03c7, B:143:0x03d5, B:145:0x03f8, B:148:0x0405, B:150:0x040b, B:156:0x0416, B:157:0x0422, B:159:0x0443, B:161:0x044f, B:154:0x041d, B:140:0x03ce, B:224:0x034c, B:229:0x02e4), top: B:232:0x02b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0521 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0465 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0249 A[Catch: all -> 0x0481, TryCatch #0 {all -> 0x0481, blocks: (B:45:0x01b2, B:47:0x01f5, B:56:0x020d, B:57:0x0210, B:63:0x021e, B:64:0x0221, B:66:0x0227, B:69:0x0231, B:70:0x0234, B:74:0x025f, B:75:0x0262, B:76:0x0268, B:78:0x0272, B:79:0x027a, B:81:0x0281, B:83:0x0285, B:85:0x0289, B:87:0x028d, B:88:0x028f, B:90:0x029a, B:92:0x02a0, B:93:0x02a6, B:245:0x023f, B:248:0x0249, B:249:0x024c, B:252:0x0254, B:253:0x0257), top: B:44:0x01b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x00cc A[Catch: all -> 0x04a2, TryCatch #1 {all -> 0x04a2, blocks: (B:298:0x00b4, B:29:0x00c1, B:31:0x00c9, B:32:0x00ce, B:282:0x0103, B:293:0x00cc), top: B:297:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9 A[Catch: all -> 0x04a2, TryCatch #1 {all -> 0x04a2, blocks: (B:298:0x00b4, B:29:0x00c1, B:31:0x00c9, B:32:0x00ce, B:282:0x0103, B:293:0x00cc), top: B:297:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0272 A[Catch: all -> 0x0481, TryCatch #0 {all -> 0x0481, blocks: (B:45:0x01b2, B:47:0x01f5, B:56:0x020d, B:57:0x0210, B:63:0x021e, B:64:0x0221, B:66:0x0227, B:69:0x0231, B:70:0x0234, B:74:0x025f, B:75:0x0262, B:76:0x0268, B:78:0x0272, B:79:0x027a, B:81:0x0281, B:83:0x0285, B:85:0x0289, B:87:0x028d, B:88:0x028f, B:90:0x029a, B:92:0x02a0, B:93:0x02a6, B:245:0x023f, B:248:0x0249, B:249:0x024c, B:252:0x0254, B:253:0x0257), top: B:44:0x01b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0281 A[Catch: all -> 0x0481, TryCatch #0 {all -> 0x0481, blocks: (B:45:0x01b2, B:47:0x01f5, B:56:0x020d, B:57:0x0210, B:63:0x021e, B:64:0x0221, B:66:0x0227, B:69:0x0231, B:70:0x0234, B:74:0x025f, B:75:0x0262, B:76:0x0268, B:78:0x0272, B:79:0x027a, B:81:0x0281, B:83:0x0285, B:85:0x0289, B:87:0x028d, B:88:0x028f, B:90:0x029a, B:92:0x02a0, B:93:0x02a6, B:245:0x023f, B:248:0x0249, B:249:0x024c, B:252:0x0254, B:253:0x0257), top: B:44:0x01b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0285 A[Catch: all -> 0x0481, TryCatch #0 {all -> 0x0481, blocks: (B:45:0x01b2, B:47:0x01f5, B:56:0x020d, B:57:0x0210, B:63:0x021e, B:64:0x0221, B:66:0x0227, B:69:0x0231, B:70:0x0234, B:74:0x025f, B:75:0x0262, B:76:0x0268, B:78:0x0272, B:79:0x027a, B:81:0x0281, B:83:0x0285, B:85:0x0289, B:87:0x028d, B:88:0x028f, B:90:0x029a, B:92:0x02a0, B:93:0x02a6, B:245:0x023f, B:248:0x0249, B:249:0x024c, B:252:0x0254, B:253:0x0257), top: B:44:0x01b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0289 A[Catch: all -> 0x0481, TryCatch #0 {all -> 0x0481, blocks: (B:45:0x01b2, B:47:0x01f5, B:56:0x020d, B:57:0x0210, B:63:0x021e, B:64:0x0221, B:66:0x0227, B:69:0x0231, B:70:0x0234, B:74:0x025f, B:75:0x0262, B:76:0x0268, B:78:0x0272, B:79:0x027a, B:81:0x0281, B:83:0x0285, B:85:0x0289, B:87:0x028d, B:88:0x028f, B:90:0x029a, B:92:0x02a0, B:93:0x02a6, B:245:0x023f, B:248:0x0249, B:249:0x024c, B:252:0x0254, B:253:0x0257), top: B:44:0x01b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x028d A[Catch: all -> 0x0481, TryCatch #0 {all -> 0x0481, blocks: (B:45:0x01b2, B:47:0x01f5, B:56:0x020d, B:57:0x0210, B:63:0x021e, B:64:0x0221, B:66:0x0227, B:69:0x0231, B:70:0x0234, B:74:0x025f, B:75:0x0262, B:76:0x0268, B:78:0x0272, B:79:0x027a, B:81:0x0281, B:83:0x0285, B:85:0x0289, B:87:0x028d, B:88:0x028f, B:90:0x029a, B:92:0x02a0, B:93:0x02a6, B:245:0x023f, B:248:0x0249, B:249:0x024c, B:252:0x0254, B:253:0x0257), top: B:44:0x01b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x029a A[Catch: all -> 0x0481, TryCatch #0 {all -> 0x0481, blocks: (B:45:0x01b2, B:47:0x01f5, B:56:0x020d, B:57:0x0210, B:63:0x021e, B:64:0x0221, B:66:0x0227, B:69:0x0231, B:70:0x0234, B:74:0x025f, B:75:0x0262, B:76:0x0268, B:78:0x0272, B:79:0x027a, B:81:0x0281, B:83:0x0285, B:85:0x0289, B:87:0x028d, B:88:0x028f, B:90:0x029a, B:92:0x02a0, B:93:0x02a6, B:245:0x023f, B:248:0x0249, B:249:0x024c, B:252:0x0254, B:253:0x0257), top: B:44:0x01b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N0(in5.s0 r36, com.tencent.mm.plugin.finder.model.BaseFinderFeed r37) {
        /*
            Method dump skipped, instructions count: 1489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.qe.N0(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    public final void N1(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.autogen.events.FinderPostRefFeedCommentEvent finderPostRefFeedCommentEvent) {
        int L;
        android.text.TextPaint paint;
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(finderPostRefFeedCommentEvent.f54315g.f8074b);
        if (h17 != null) {
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.qf qfVar = (com.tencent.mm.plugin.finder.viewmodel.component.qf) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.qf.class);
            if (qfVar != null) {
                com.tencent.mm.plugin.finder.storage.FinderItem curFinderItem = baseFinderFeed.getFeedObject();
                kotlin.jvm.internal.o.g(curFinderItem, "curFinderItem");
                if (qfVar.f135702o) {
                    return;
                }
                qfVar.f135696f = curFinderItem;
                android.view.View inflate = android.view.View.inflate(qfVar.getContext(), com.tencent.mm.R.layout.aco, null);
                db5.d5 d5Var = qfVar.f135698h;
                if (d5Var != null) {
                    d5Var.dismiss();
                }
                db5.d5 d5Var2 = new db5.d5(inflate);
                d5Var2.setAnimationStyle(com.tencent.mm.R.style.f494816x2);
                qfVar.f135698h = d5Var2;
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.g2q);
                android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.g2n);
                java.lang.String string = qfVar.getActivity().getResources().getString(com.tencent.mm.R.string.f8j);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                if (textView != null) {
                    textView.setText(string);
                }
                d92.f fVar = d92.f.f227470a;
                if (textView != null) {
                    fVar.l(textView, 15.0f, false);
                }
                int measureText = (textView == null || (paint = textView.getPaint()) == null) ? 0 : (int) paint.measureText(string);
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.g2p);
                if (textView2 != null) {
                    fVar.l(textView2, 14.0f, false);
                    textView2.setMaxLines(1);
                    android.content.res.Resources resources = qfVar.getActivity().getResources();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    java.lang.Object nickNameSpan = h17.getNickNameSpan();
                    if (nickNameSpan == null) {
                        nickNameSpan = "";
                    }
                    objArr[0] = nickNameSpan;
                    java.lang.String string2 = resources.getString(com.tencent.mm.R.string.ex9, objArr);
                    kotlin.jvm.internal.o.f(string2, "getString(...)");
                    int b17 = (com.tencent.mm.ui.bh.a(qfVar.getContext()).f197135a - i65.a.b(qfVar.getContext(), 136)) - measureText;
                    if (b17 <= 0) {
                        qfVar.f135698h = null;
                        com.tencent.mars.xlog.Log.i("FinderFeedShareDescToCommentUIC", "showRefFeedCommentPostTips error, availableWidth:" + b17);
                        return;
                    }
                    float measureText2 = textView2.getPaint().measureText(string2);
                    textView2.setText(string2);
                    float f17 = b17;
                    if (measureText2 > f17 && (L = r26.n0.L(string2, "”", 0, false, 6, null)) > 0) {
                        java.lang.String substring = string2.substring(L);
                        kotlin.jvm.internal.o.f(substring, "substring(...)");
                        java.lang.String substring2 = string2.substring(0, L);
                        kotlin.jvm.internal.o.f(substring2, "substring(...)");
                        float measureText3 = f17 - textView2.getPaint().measureText(substring);
                        java.lang.CharSequence ellipsize = android.text.TextUtils.ellipsize(substring2, textView2.getPaint(), measureText3, android.text.TextUtils.TruncateAt.END);
                        java.lang.String str = ((java.lang.Object) ellipsize) + substring;
                        com.tencent.mars.xlog.Log.i("FinderFeedShareDescToCommentUIC", "showRefFeedCommentPostTips: ellipsize, textLen=" + measureText2 + ", availableWidth=" + b17 + ", prefixAvailableLen=" + measureText3 + ", fixPrefix=" + ((java.lang.Object) ellipsize) + ", newStr=" + str);
                        textView2.setText(str);
                    }
                }
                cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                aVar.pk(textView, "already_share_comment_area");
                aVar.ik(textView, 40, 25496);
                zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(qfVar.getActivity());
                aVar.Ai(textView, new com.tencent.mm.plugin.finder.viewmodel.component.jf(Sj != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6() : null, curFinderItem, h17));
                if (textView != null) {
                    textView.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.mf(qfVar, h17, finderPostRefFeedCommentEvent));
                }
                if (findViewById != null) {
                    findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.nf(qfVar));
                }
                db5.d5 d5Var3 = qfVar.f135698h;
                if (d5Var3 != null) {
                    d5Var3.setWidth(-1);
                }
                db5.d5 d5Var4 = qfVar.f135698h;
                if (d5Var4 != null) {
                    d5Var4.setHeight(-2);
                }
                int dimensionPixelSize = qfVar.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479650ab4);
                db5.d5 d5Var5 = qfVar.f135698h;
                if (d5Var5 != null) {
                    d5Var5.showAtLocation(qfVar.getContext().getWindow().getDecorView(), 80, 0, dimensionPixelSize);
                }
                qfVar.Q6(true);
            }
        }
    }

    public final boolean O(in5.s0 s0Var) {
        return !gs2.c.f275072a.c(s0Var.hashCode(), gs2.a.f275058q) || ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.K0().r()).booleanValue();
    }

    public final void O0(in5.s0 s0Var) {
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC finderDescPanelUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.class);
        if (finderDescPanelUIC != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.r9(finderDescPanelUIC, this.f104358f.d0()));
        }
    }

    public abstract int P();

    public final void P0(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.dun);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFav", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFav", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void Q0(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        java.lang.String str;
        android.content.Context context = s0Var.f293121e;
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI = context instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI ? (com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI) context : null;
        if (finderShareFeedRelUI == null || finderShareFeedRelUI.P != 13) {
            return;
        }
        r45.dm2 object_extend = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
        if (object_extend == null || (str = object_extend.getString(22)) == null) {
            str = "";
        }
        finderShareFeedRelUI.setMMTitle(str);
    }

    public int R(in5.s0 holder) {
        int i17;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.content.Context context = holder.f293121e;
        int c17 = com.tencent.mm.ui.bl.c(context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z17) {
            i17 = i19 - c17;
        } else {
            if (i19 >= i18) {
                i18 = i19;
            }
            i17 = i18 - c17;
        }
        return (int) (i17 * kx2.a.f313278a.a(context));
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01af, code lost:
    
        if (tx2.h1.f422575a.contains(r4) != false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void R0(in5.s0 r19, com.tencent.mm.plugin.finder.model.BaseFinderFeed r20, java.lang.Boolean r21) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.qe.R0(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed, java.lang.Boolean):void");
    }

    public final int S(boolean z17, boolean z18, boolean z19) {
        return (!z17 || z18) ? z19 ? com.tencent.mm.R.color.BW_0_Alpha_0_4 : com.tencent.mm.R.color.f478988mr : z19 ? com.tencent.mm.R.color.BW_0_Alpha_0_9 : com.tencent.mm.R.color.f479254u6;
    }

    public void S0(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        jz5.f0 f0Var;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        boolean b17 = vd2.m3.f435809a.b(holder, item);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.efs);
        if (b17) {
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "refreshFinderLivingStatusView is liveNoticeAd, skip");
            if (p17 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFinderLivingStatusView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFinderLivingStatusView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (O(holder)) {
            if (p17 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFinderLivingStatusView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFinderLivingStatusView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "refreshFinderLivingStatusView priority222 not ok, skip");
            return;
        }
        java.lang.String userName = item.getFeedObject().getUserName();
        if (userName == null) {
            userName = "";
        }
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
        ((te2.e4) ((zy2.g8) pf5.z.f353948a.a(mMActivity).c(zy2.g8.class))).f417974d.getClass();
        dk2.sg f17 = com.tencent.mm.plugin.finder.feed.model.i1.f107930a.f(userName);
        if (!(((f17 == null || (finderObject2 = f17.f234082a) == null) ? null : finderObject2.getLiveInfo()) != null)) {
            if (p17 == null) {
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFinderLivingStatusView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFinderLivingStatusView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (p17 == null && (p17 = holder.p(com.tencent.mm.R.id.efs)) == null) {
            try {
                android.view.ViewStub viewStub = (android.view.ViewStub) holder.p(com.tencent.mm.R.id.ted);
                p17 = viewStub != null ? viewStub.inflate() : null;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FeedFullConvert", e17, "", new java.lang.Object[0]);
            }
        }
        ya2.b2 contact = item.getContact();
        int i17 = contact != null ? contact.field_liveStatus : 2;
        if (p17 != null) {
            ym5.a1.h(p17, new com.tencent.mm.plugin.finder.convert.jc(item, holder));
            if (O(holder)) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                android.view.View view = p17;
                yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFinderLivingStatusView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFinderLivingStatusView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "refreshFinderLivingStatusView priority not ok, skip");
                return;
            }
            java.lang.String userName2 = item.getFeedObject().getUserName();
            if (userName2 == null) {
                userName2 = "";
            }
            android.view.View p18 = holder.p(com.tencent.mm.R.id.i_q);
            android.view.ViewGroup.LayoutParams layoutParams = p18.getLayoutParams();
            layoutParams.width = i65.a.b(p18.getContext(), 16);
            layoutParams.height = i65.a.b(p18.getContext(), 16);
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ihp);
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ihn);
            textView.setMaxWidth((int) (context.getResources().getDisplayMetrics().widthPixels * 0.5d));
            textView2.setMaxWidth((int) (context.getResources().getDisplayMetrics().widthPixels * 0.5d));
            textView2.setTextSize(0, context.getResources().getDimension(com.tencent.mm.R.dimen.f479628b3));
            pf5.z zVar = pf5.z.f353948a;
            ((te2.e4) ((zy2.g8) zVar.a(mMActivity).c(zy2.g8.class))).f417974d.getClass();
            dk2.sg f18 = com.tencent.mm.plugin.finder.feed.model.i1.f107930a.f(userName2);
            if (f18 == null || (finderObject = f18.f234082a) == null) {
                f0Var = null;
            } else {
                if (f18.f234084c) {
                    ya2.b2 contact2 = item.getContact();
                    if (contact2 != null) {
                        contact2.field_liveStatus = 2;
                    }
                    com.tencent.mm.protocal.protobuf.FinderContact contact3 = item.getFeedObject().getFeedObject().getContact();
                    if (contact3 != null) {
                        contact3.setLiveStatus(2);
                    }
                    i17 = 2;
                }
                if (item.getFeedObject().getLiveInfo() == null) {
                    item.getFeedObject().setLiveInfo(finderObject.getLiveInfo());
                }
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
                java.lang.String description = objectDesc != null ? objectDesc.getDescription() : null;
                if (description == null || description.length() == 0) {
                    textView2.setVisibility(8);
                } else {
                    com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = finderObject.getObjectDesc();
                    if (objectDesc2 == null || (str = objectDesc2.getDescription()) == null) {
                        str = "";
                    }
                    textView2.setText(hc2.l.d(str));
                    textView2.setVisibility(0);
                }
                java.lang.String recommendReason = finderObject.getRecommendReason();
                if (recommendReason == null || recommendReason.length() == 0) {
                    textView.setText(context.getString(com.tencent.mm.R.string.cvy));
                } else {
                    java.lang.String recommendReason2 = finderObject.getRecommendReason();
                    textView.setText(hc2.l.d(recommendReason2 != null ? recommendReason2 : ""));
                }
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                so2.o2.f410517f.a().g(item.getItemId(), ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n, so2.h2.f410386f);
                if (finderObject.getLiveInfo() != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                    arrayList5.add(0);
                    java.util.Collections.reverse(arrayList5);
                    android.view.View view2 = p17;
                    yj0.a.d(view2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFinderLivingStatusView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p17.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFinderLivingStatusView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    android.view.View view3 = p17;
                    yj0.a.d(view3, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFinderLivingStatusView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p17.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFinderLivingStatusView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                android.view.View view4 = p17;
                yj0.a.d(view4, arrayList7.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFinderLivingStatusView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFinderLivingStatusView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "refreshFinderLivingStatusView live info is null, skip");
            }
            if (textView2.getVisibility() == 0) {
                textView.setTextSize(0, context.getResources().getDimension(com.tencent.mm.R.dimen.f479788f9));
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479252u4));
                com.tencent.mm.ui.fk.c(textView);
            } else {
                textView.setTextSize(0, context.getResources().getDimension(com.tencent.mm.R.dimen.f479628b3));
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479254u6));
                com.tencent.mm.ui.fk.a(textView);
            }
            if (i17 == 1) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(p17, "living_label");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(p17, 40, 26236);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(p17, new com.tencent.mm.plugin.finder.view.ar(item));
            }
            p17.setOnClickListener(new com.tencent.mm.plugin.finder.convert.kc(holder, item));
            t(holder);
            gs2.c.f275072a.e(holder, p17, gs2.a.f275058q, false);
        }
    }

    public final int T() {
        return ((java.lang.Number) ((jz5.n) this.f104374y).getValue()).intValue();
    }

    public void T0(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) holder.f293125i;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.p(com.tencent.mm.R.id.f484351dz5);
        if (frameLayout != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.kh.f134967d.a(holder, frameLayout, baseFinderFeed.getItemId());
            F0(holder, baseFinderFeed);
        }
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        int i17 = nyVar != null ? nyVar.f135380n : 0;
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f485561i44);
        if (textView == null) {
            return;
        }
        textView.setTextSize(0, i65.a.f(textView.getContext(), com.tencent.mm.R.dimen.f479591a1));
        ya2.g gVar = ya2.h.f460484a;
        java.lang.String str = baseFinderFeed.getFeedObject().field_username;
        r45.xk bizInfo = baseFinderFeed.getFeedObject().getBizInfo();
        boolean h17 = ya2.g.h(gVar, str, bizInfo != null ? bizInfo.getString(0) : null, false, false, 12, null);
        if (this.f104359g) {
            holder.w(com.tencent.mm.R.id.f485561i44, 8);
        } else if (this.f104360h != 3 && h17 && i17 != 1 && i17 != 156 && !hc2.b0.i(baseFinderFeed)) {
            textView.setVisibility(0);
            textView.setAlpha(1.0f);
            textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.f492274fw4));
            android.content.res.Resources resources = context.getResources();
            boolean z17 = this.f104361i;
            textView.setTextColor(resources.getColor(z17 ? com.tencent.mm.R.color.BW_0_Alpha_0_3 : com.tencent.mm.R.color.f479252u4));
            textView.setBackgroundResource(z17 ? com.tencent.mm.R.drawable.f481642yx : com.tencent.mm.R.drawable.f481641yw);
            W0(holder);
        } else if (h17) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(8);
            if (baseFinderFeed.getIsDeepEnjoy()) {
                F(holder, baseFinderFeed, false);
            }
        }
        m0(holder, h17 ? xc2.s0.f453291e : xc2.s0.f453292f);
        if (baseFinderFeed.getIsDeepEnjoy() || h17) {
            return;
        }
        textView.setVisibility(8);
    }

    public final boolean U() {
        return ((java.lang.Boolean) ((jz5.n) this.G).getValue()).booleanValue();
    }

    public final void U0(com.tencent.mm.plugin.finder.model.BaseFinderFeed item, in5.s0 holder) {
        android.widget.TextView textView;
        java.lang.String g17;
        com.tencent.mm.plugin.finder.storage.FinderItem h17;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.tencent.mm.R.id.msw);
        hc2.o0.i(item.getFeedObject().getFeedObject());
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) holder.f293125i;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.h6p);
        boolean z17 = this.f104361i;
        if (weImageView != null) {
            weImageView.s(com.tencent.mm.R.raw.finder_full_share_outlined, S(hc2.o0.i(baseFinderFeed.getFeedObject().getFeedObject()), baseFinderFeed.getIsPreview(), z17));
        }
        android.view.View p17 = holder.p(com.tencent.mm.R.id.gbz);
        if (p17 == null || (textView = (android.widget.TextView) p17.findViewById(com.tencent.mm.R.id.msm)) == null) {
            return;
        }
        textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.a(S(hc2.o0.i(item.getFeedObject().getFeedObject()), item.getIsPreview(), z17)));
        int forwardCount = (!(((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.w0().r()).intValue() == 1) || (h17 = bu2.j.f24534a.h(item.getItemId())) == null) ? item.getFeedObject().getForwardCount() : h17.getForwardCount();
        com.tencent.mm.plugin.finder.feed.k8 k8Var = this.f104358f;
        if (forwardCount > 0 || k8Var.d0()) {
            g17 = com.tencent.mm.plugin.finder.assist.w2.g(k8Var.d0() ? 1 : 2, forwardCount);
            kotlin.jvm.internal.o.f(g17, "formatNumber(...)");
            if (linearLayout != null) {
                linearLayout.setTag(com.tencent.mm.R.id.e5u, g17);
            }
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        } else {
            g17 = holder.f293121e.getString(com.tencent.mm.R.string.f4n);
            kotlin.jvm.internal.o.f(g17, "getString(...)");
            if (linearLayout != null) {
                linearLayout.setTag(com.tencent.mm.R.id.e5u, "0");
            }
            com.tencent.mm.ui.bk.t0(textView.getPaint());
        }
        textView.setText(g17);
    }

    public final com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout V(in5.s0 s0Var) {
        com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout trackTipsFrameLayout = (com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout) s0Var.p(com.tencent.mm.R.id.f484958g22);
        if (trackTipsFrameLayout == null) {
            android.view.View inflate = ((android.view.ViewStub) s0Var.p(com.tencent.mm.R.id.f484959g23)).inflate();
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout");
            trackTipsFrameLayout = (com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout) inflate;
            if (((android.widget.TextView) trackTipsFrameLayout.findViewById(com.tencent.mm.R.id.f484957g21)) != null) {
                s0Var.f293121e.getString(com.tencent.mm.R.string.cwt);
            }
        }
        trackTipsFrameLayout.a(new com.tencent.mm.plugin.finder.convert.k9(s0Var));
        return trackTipsFrameLayout;
    }

    public final void V0(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        android.view.View b17;
        android.content.Intent intent;
        androidx.appcompat.app.AppCompatActivity context = this.f104358f.getF122643d().getContext();
        jz5.f0 f0Var = null;
        java.lang.String stringExtra = (context == null || (intent = context.getIntent()) == null) ? null : intent.getStringExtra("key_mention_thank_forward_wording");
        boolean booleanValue = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.L0().r()).booleanValue();
        if (booleanValue) {
            bw2.o oVar = bw2.o.f24869a;
            b17 = ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f24882n).getValue()).invoke(s0Var)).b();
        } else {
            b17 = s0Var.p(com.tencent.mm.R.id.tfa);
        }
        if (stringExtra != null) {
            if (b17 == null && booleanValue) {
                bw2.o oVar2 = bw2.o.f24869a;
                b17 = ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f24882n).getValue()).invoke(s0Var)).a();
            }
            android.widget.TextView textView = b17 != null ? (android.widget.TextView) b17.findViewById(com.tencent.mm.R.id.tvs) : null;
            if (b17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshForwardThankedWording", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(b17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshForwardThankedWording", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (textView != null) {
                textView.setText(stringExtra);
            }
            if (b17 != null) {
                hc2.v0.e(b17, "share_tip_bubble", 0, 0, false, false, null, new com.tencent.mm.plugin.finder.convert.lc(s0Var, baseFinderFeed, stringExtra), 62, null);
                f0Var = jz5.f0.f302826a;
            }
        }
        if (f0Var != null || b17 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        android.view.View view = b17;
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshForwardThankedWording", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshForwardThankedWording", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final android.animation.AnimatorSet W(android.view.View view, long j17, long j18, long j19, long j27) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f).setDuration(j17);
        kotlin.jvm.internal.o.f(duration, "setDuration(...)");
        duration.setStartDelay(j19);
        android.animation.ObjectAnimator duration2 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.0f).setDuration(j18);
        kotlin.jvm.internal.o.f(duration2, "setDuration(...)");
        duration2.setStartDelay(j27);
        animatorSet.playSequentially(duration, duration2);
        animatorSet.addListener(new com.tencent.mm.plugin.finder.convert.l9(this, view));
        animatorSet.addListener(new com.tencent.mm.plugin.finder.convert.m9(this, view));
        return animatorSet;
    }

    public void W0(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.t0 t0Var = (com.tencent.mm.plugin.finder.viewmodel.component.t0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.t0.class);
        boolean z17 = false;
        if (t0Var != null && t0Var.P6(holder)) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "refreshFriendFollowCount return for account update info.");
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ggt);
        if (this.f104361i) {
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5));
        }
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        float f17 = (12.0f * displayMetrics.density) / context.getResources().getDisplayMetrics().density;
        if (textView != null) {
            textView.setTextSize(1, f17);
        }
        com.tencent.mm.ui.widget.FlowTextMixView flowTextMixView = (com.tencent.mm.ui.widget.FlowTextMixView) holder.itemView.findViewById(com.tencent.mm.R.id.g9g);
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (flowTextMixView != null) {
            pm0.v.a(flowTextMixView, new com.tencent.mm.plugin.finder.convert.mc(holder, flowTextMixView, textView, this));
        }
    }

    public final void X(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        if (baseFinderFeed.getAutoShowProductId() <= 0) {
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "product id is empty no need to open");
            return;
        }
        android.content.Context context = s0Var.f293121e;
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null) {
            int i17 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(mMActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n;
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject = baseFinderFeed.getFeedObject();
            r45.in2 in2Var = new r45.in2();
            in2Var.set(0, java.lang.Long.valueOf(feedObject.field_finderObject.getId()));
            in2Var.set(1, feedObject.getObjectNonceId());
            in2Var.set(2, java.lang.Integer.valueOf(feedObject.field_finderObject.getAdFlag()));
            in2Var.set(3, feedObject.field_finderObject.getCookie());
            in2Var.set(6, java.lang.Long.valueOf(baseFinderFeed.getAutoShowProductId()));
            java.util.List c17 = kz5.b0.c(in2Var);
            r45.pl2 pl2Var = new r45.pl2();
            pl2Var.getList(0).add(java.lang.Long.valueOf(baseFinderFeed.getItemId()));
            pl2Var.getList(1).add(baseFinderFeed.w());
            kotlinx.coroutines.y0 y0Var = s0Var.f293120d;
            if (y0Var != null) {
                kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.convert.cc(c17, i17, baseFinderFeed, mMActivity, pl2Var, s0Var, null), 3, null);
            }
        }
    }

    public final void X0(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var) {
        if (baseFinderFeed.getIsShowGuideTips() != 1 || Z) {
            android.view.View p17 = s0Var.p(com.tencent.mm.R.id.gvs);
            if (p17 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFullGuideTips", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFullGuideTips", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.gvs);
        if (p18 == null) {
            p18 = ((android.view.ViewStub) s0Var.p(com.tencent.mm.R.id.f482282a6)).inflate();
        }
        if (p18 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFullGuideTips", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFullGuideTips", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void Y(com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter, fc2.t ev6, com.tencent.mm.sdk.platformtools.n3 uiHandler) {
        in5.s0 s0Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(ev6, "ev");
        kotlin.jvm.internal.o.g(uiHandler, "uiHandler");
        uiHandler.removeCallbacksAndMessages(null);
        com.tencent.mm.plugin.finder.storage.FeedData feedData = ev6.f260996o;
        boolean z17 = false;
        if (!(feedData != null && feedData.getMediaType() == 2)) {
            com.tencent.mm.plugin.finder.storage.FeedData feedData2 = ev6.f260996o;
            if (feedData2 != null && feedData2.getMediaType() == 9) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.X3).getValue()).r()).intValue() != 1 || (s0Var = (in5.s0) in5.n0.Y(adapter, ev6.f260992k, false, 2, null)) == null) {
                    return;
                }
                uiHandler.postDelayed(new com.tencent.mm.plugin.finder.convert.q9(this, s0Var), 30000L);
                return;
            }
            return;
        }
        in5.s0 s0Var2 = (in5.s0) in5.n0.Y(adapter, ev6.f260992k, false, 2, null);
        if (s0Var2 != null) {
            if (T() >= 0 && T() * 1000 < com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
                com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "onEventHappen: post follow anim, finderShowFollowAnimOffset = " + T());
                uiHandler.postDelayed(new com.tencent.mm.plugin.finder.convert.n9(this, s0Var2), ((long) T()) * 1000);
            }
            uiHandler.postDelayed(new com.tencent.mm.plugin.finder.convert.o9(this, s0Var2), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.X3).getValue()).r()).intValue() == 1) {
                uiHandler.postDelayed(new com.tencent.mm.plugin.finder.convert.p9(this, s0Var2), 30000L);
            }
        }
    }

    public final void Y0(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var, java.lang.String str) {
        r45.cl2 cl2Var;
        r45.cl2 cl2Var2;
        pf5.u uVar = pf5.u.f353936a;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int integer = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.b(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6().getInteger(5);
        android.content.Context context2 = s0Var.f293121e;
        if (!(context2 instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) && baseFinderFeed.getFeedObject().getCommentScene() != 0 && baseFinderFeed.getFeedObject().getCommentScene() != integer) {
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "refreshHardAdJumper not same scene object.scene=" + baseFinderFeed.getFeedObject().getCommentScene() + ", commentScene = " + integer + ", source=" + str);
            return;
        }
        if ((context2 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context2 : null) == null) {
            return;
        }
        long itemId = baseFinderFeed.getItemId();
        androidx.lifecycle.j0 W6 = ((xc2.k0) uVar.e(zy2.b6.class).a(xc2.k0.class)).W6(itemId, integer, baseFinderFeed.w());
        java.util.Collection collection = (java.util.Set) W6.getValue();
        if (collection == null) {
            collection = new java.util.HashSet();
        }
        java.util.HashSet<xc2.t> hashSet = new java.util.HashSet(collection);
        for (xc2.t tVar : hashSet) {
            kz5.h0.B(tVar.f453302d, new com.tencent.mm.plugin.finder.convert.pc(tVar));
            tVar.f453305g.clear();
        }
        r45.dm2 object_extend = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (object_extend == null || (cl2Var2 = (r45.cl2) object_extend.getCustom(4)) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderJumpInfo) cl2Var2.getCustom(0);
        r45.dm2 object_extend2 = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderJumpInfo> list = (object_extend2 == null || (cl2Var = (r45.cl2) object_extend2.getCustom(4)) == null) ? null : cl2Var.getList(7);
        if (hc2.o0.D(baseFinderFeed.getFeedObject().getFeedObject(), false)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshHardAdJumper: source=");
            sb6.append(str);
            sb6.append(", feedId=");
            sb6.append(pm0.v.u(baseFinderFeed.getItemId()));
            sb6.append(" jumpInfo=");
            sb6.append(finderJumpInfo != null ? hc2.g0.d(finderJumpInfo) : "null");
            sb6.append(", jumpInfoList=[");
            sb6.append(list != null ? kz5.n0.g0(list, null, null, null, 0, null, com.tencent.mm.plugin.finder.convert.qc.f104353d, 31, null) : null);
            sb6.append(']');
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", sb6.toString());
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("#refreshHardAdJumper jumpInfo=");
        sb7.append(finderJumpInfo != null ? finderJumpInfo.toString() : null);
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", sb7.toString());
        if (finderJumpInfo != null) {
            Z(integer, itemId, finderJumpInfo, hashSet);
            so2.o2.f410517f.a().d(baseFinderFeed.getFeedObject().getFeedObject(), finderJumpInfo);
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("#refreshHardAdJumper jumpInfoList.size=");
        sb8.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", sb8.toString());
        if (list != null) {
            for (com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 : list) {
                com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "#refreshHardAdJumper jumpInfoList element=" + finderJumpInfo2);
                kotlin.jvm.internal.o.d(finderJumpInfo2);
                Z(integer, itemId, finderJumpInfo2, hashSet);
                so2.o2.f410517f.a().d(baseFinderFeed.getFeedObject().getFeedObject(), finderJumpInfo2);
            }
        }
        W6.postValue(hashSet);
    }

    public final void Z(int i17, long j17, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, java.util.Set set) {
        java.lang.Object obj;
        java.lang.String str;
        r45.su suVar;
        java.util.LinkedList<r45.wf6> style = finderJumpInfo.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        for (r45.wf6 wf6Var : style) {
            if (wf6Var.getInteger(2) == 7) {
                r45.zf0 zf0Var = (r45.zf0) wf6Var.getCustom(10);
                if (zf0Var == null || (suVar = (r45.su) zf0Var.getCustom(0)) == null || (str = suVar.getString(1)) == null) {
                    str = "";
                }
                finderJumpInfo.setWording(str);
            }
            java.util.Iterator it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((xc2.t) obj).f453301c == wf6Var.getInteger(1)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            xc2.t tVar = (xc2.t) obj;
            if (tVar == null) {
                tVar = new xc2.t(i17, j17, wf6Var.getInteger(1), new java.util.LinkedList(), false, null, 48, null);
            }
            kz5.h0.B(tVar.f453302d, new com.tencent.mm.plugin.finder.convert.r9(finderJumpInfo));
            tVar.f453302d.add(finderJumpInfo);
            tVar.f453305g.add(java.lang.Integer.valueOf(finderJumpInfo.hashCode()));
            set.remove(tVar);
            set.add(tVar);
        }
    }

    public void Z0(com.tencent.mm.plugin.finder.model.BaseFinderFeed item, in5.s0 holder, int i17, boolean z17) {
        pf5.v a17;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.content.Context context = holder.f293121e;
        android.content.res.Resources resources = context.getResources();
        int color = resources.getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9);
        int color2 = resources.getColor(com.tencent.mm.R.color.aby);
        int color3 = resources.getColor(com.tencent.mm.R.color.BW_F_Alpha_0_5);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ehh);
        boolean z18 = this.f104361i;
        if (textView != null) {
            textView.setTextColor(z18 ? color : color2);
            textView.setBackground(resources.getDrawable(z18 ? com.tencent.mm.R.drawable.f481656za : com.tencent.mm.R.drawable.z_));
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ehb);
        if (textView2 != null) {
            if (z18) {
                color2 = color;
            }
            textView2.setTextColor(color2);
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ehe);
        if (textView3 != null) {
            textView3.setTextColor(z18 ? color : color3);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.ehg);
        if (weImageView != null) {
            weImageView.setImageResource(z18 ? com.tencent.mm.R.raw.finder_full_like_outlined : com.tencent.mm.R.raw.finder_full_like);
            if (!z18) {
                color = color3;
            }
            weImageView.setIconColor(color);
        }
        com.tencent.mm.plugin.finder.feed.k8 k8Var = this.f104358f;
        com.tencent.mm.plugin.finder.feed.pz pzVar = k8Var instanceof com.tencent.mm.plugin.finder.feed.pz ? (com.tencent.mm.plugin.finder.feed.pz) k8Var : null;
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = pzVar != null ? pzVar.f108756h : null;
        if (finderHomeTabFragment != null) {
            a17 = pf5.z.f353948a.b(finderHomeTabFragment);
        } else {
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context);
        }
        com.tencent.mm.plugin.finder.feed.model.l0 l0Var = ((com.tencent.mm.plugin.finder.viewmodel.component.w6) a17.a(com.tencent.mm.plugin.finder.viewmodel.component.w6.class)).f136307d;
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.xc xcVar = (com.tencent.mm.plugin.finder.viewmodel.component.xc) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.xc.class);
        com.tencent.mm.plugin.finder.convert.rc rcVar = new com.tencent.mm.plugin.finder.convert.rc(this, holder, item);
        xcVar.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FeedHotCommentUIC", "onBindView feedId=" + hc2.b0.f(item, true));
        xcVar.f136448s = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.L0().r()).booleanValue();
        xcVar.f136446q = l0Var;
        com.tencent.mm.plugin.finder.view.FinderHotCommentLayout finderHotCommentLayout = (com.tencent.mm.plugin.finder.view.FinderHotCommentLayout) holder.p(com.tencent.mm.R.id.ehd);
        if (finderHotCommentLayout != null) {
            finderHotCommentLayout.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.wc(xcVar, rcVar, holder));
        }
        if (z17) {
            xcVar.c7(holder);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x02c8, code lost:
    
        if (r14 >= r0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a0(in5.s0 r24, com.tencent.mm.plugin.finder.model.BaseFinderFeed r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.qe.a0(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed, boolean):void");
    }

    public final void a1(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var, int i17) {
        android.view.View b17;
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.D2).getValue()).r()).intValue();
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        int i18 = nyVar != null ? nyVar.f135380n : 0;
        boolean booleanValue = ((java.lang.Boolean) t70Var.L0().r()).booleanValue();
        if (booleanValue) {
            bw2.o oVar = bw2.o.f24869a;
            b17 = ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f24870b).getValue()).invoke(s0Var)).b();
        } else {
            b17 = s0Var.p(com.tencent.mm.R.id.eea);
        }
        if (intValue != 1 || i18 == 23 || i18 == 6 || ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode() || i0() || !gs2.c.f275072a.c(s0Var.hashCode(), gs2.a.A) || ((java.lang.Boolean) t70Var.K0().r()).booleanValue()) {
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "hot search not enable");
            if (b17 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            android.view.View view = b17;
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshHotSearch", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshHotSearch", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        r45.im2 hotWordInfo = baseFinderFeed.getFeedObject().getFinderObject().getHotWordInfo();
        if ((hotWordInfo != null ? (r45.lu2) hotWordInfo.getCustom(0) : null) != null) {
            r45.lu2 lu2Var = (r45.lu2) hotWordInfo.getCustom(0);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(lu2Var != null ? lu2Var.getString(0) : null)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hotWordInfo: ");
                r45.lu2 lu2Var2 = (r45.lu2) hotWordInfo.getCustom(0);
                sb6.append(lu2Var2 != null ? lu2Var2.getString(0) : null);
                com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", sb6.toString());
                if (b17 == null && booleanValue) {
                    bw2.o oVar2 = bw2.o.f24869a;
                    b17 = ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f24870b).getValue()).invoke(s0Var)).a();
                }
                android.view.View view2 = b17;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshHotSearch", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshHotSearch", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                r45.lu2 lu2Var3 = (r45.lu2) hotWordInfo.getCustom(0);
                if (lu2Var3 == null || (str = lu2Var3.getString(0)) == null) {
                    str = "";
                }
                java.lang.String str2 = str;
                r45.lu2 lu2Var4 = (r45.lu2) hotWordInfo.getCustom(0);
                com.tencent.mm.protobuf.g byteString = lu2Var4 != null ? lu2Var4.getByteString(4) : null;
                com.tencent.mm.protobuf.g byteString2 = hotWordInfo.getByteString(2);
                android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.dzr);
                if (view2 != null) {
                    view2.setOnClickListener(new com.tencent.mm.plugin.finder.convert.sc(s0Var, str2, baseFinderFeed, byteString, this, hotWordInfo, byteString2));
                }
                if (textView != null) {
                    com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                    android.content.Context context2 = s0Var.f293121e;
                    textView.setTextSize(0, context2.getResources().getDimension(com.tencent.mm.R.dimen.f479628b3));
                    textView.setText(context2.getResources().getString(com.tencent.mm.R.string.d0t, str2));
                    return;
                }
                return;
            }
        }
        if (b17 == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        android.view.View view3 = b17;
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshHotSearch", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshHotSearch", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void b1(com.tencent.mm.plugin.finder.model.BaseFinderFeed item, in5.s0 holder) {
        android.view.View b17;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        boolean booleanValue = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.L0().r()).booleanValue();
        if (booleanValue) {
            bw2.o oVar = bw2.o.f24869a;
            b17 = ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f24871c).getValue()).invoke(holder)).b();
        } else {
            b17 = holder.p(com.tencent.mm.R.id.hd8);
        }
        java.lang.String inner_recommend_reason = item.getFeedObject().getFeedObject().getInner_recommend_reason();
        if (!(inner_recommend_reason == null || inner_recommend_reason.length() == 0)) {
            if (b17 == null && booleanValue) {
                bw2.o oVar2 = bw2.o.f24869a;
                b17 = ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f24871c).getValue()).invoke(holder)).a();
            }
            if (b17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                android.view.View view = b17;
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshInnerRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshInnerRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) b17.findViewById(com.tencent.mm.R.id.hd9);
                java.lang.String inner_recommend_reason2 = item.getFeedObject().getFeedObject().getInner_recommend_reason();
                if (finderCollapsibleTextView != null) {
                    android.content.Context context = holder.f293121e;
                    finderCollapsibleTextView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479254u6));
                    com.tencent.mm.ui.bk.r0(finderCollapsibleTextView.getContentTextView().getPaint(), 0.8f);
                    finderCollapsibleTextView.setTextSize(15.0f);
                    android.text.SpannableString Ui = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).Ui(context, inner_recommend_reason2, (int) finderCollapsibleTextView.getTextSize(), 1);
                    int color = context.getResources().getColor(com.tencent.mm.R.color.f479254u6);
                    com.tencent.mm.pluginsdk.ui.span.z0[] z0VarArr = (com.tencent.mm.pluginsdk.ui.span.z0[]) Ui.getSpans(0, Ui.length(), com.tencent.mm.pluginsdk.ui.span.z0.class);
                    if (z0VarArr != null) {
                        for (com.tencent.mm.pluginsdk.ui.span.z0 z0Var : z0VarArr) {
                            z0Var.setColor(color, com.tencent.mm.R.color.a9e);
                        }
                    }
                    finderCollapsibleTextView.setLimitLine(1);
                    i95.m c17 = i95.n0.c(zy2.s6.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    finderCollapsibleTextView.setText(zy2.s6.l6((zy2.s6) c17, Ui, (int) finderCollapsibleTextView.getTextSize(), false, null, 0, false, null, 124, null));
                    finderCollapsibleTextView.setExpandTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479254u6));
                    finderCollapsibleTextView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0());
                }
            }
        } else if (b17 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            android.view.View view2 = b17;
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshInnerRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshInnerRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (b17 != null) {
            b17.setBackground(null);
        }
        t(holder);
    }

    public final void c0(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        if (baseFinderFeed.getIsPreview()) {
            s0Var.p(com.tencent.mm.R.id.a_4).setEnabled(false);
            s0Var.p(com.tencent.mm.R.id.a8p).setEnabled(false);
            android.view.View p17 = s0Var.p(com.tencent.mm.R.id.h6s);
            if (p17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "handlePreviewStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                p17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "handlePreviewStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            J1(s0Var, baseFinderFeed, false, "previewStatus");
        }
    }

    public void c1(in5.s0 holder, android.graphics.Rect videoViewRect) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(videoViewRect, "videoViewRect");
    }

    public void d0(in5.s0 holder, android.util.Size size) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    public final void d1(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        java.lang.String string;
        java.lang.String g17;
        if (j0(baseFinderFeed)) {
            android.view.View p17 = s0Var.p(com.tencent.mm.R.id.f487088ng5);
            if (p17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshManagerFav", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshManagerFav", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p18 = s0Var.p(com.tencent.mm.R.id.duo);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshManagerFav", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshManagerFav", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setOnClickListener(new com.tencent.mm.plugin.finder.convert.tc(s0Var));
            nv2.o oVar = nv2.o.f340558e;
            int b17 = nv2.o.f340558e.b(baseFinderFeed.getFeedObject().getFeedObject());
            android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.dty);
            java.lang.String str = "";
            if (textView != null) {
                com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                com.tencent.mm.plugin.finder.feed.k8 k8Var = this.f104358f;
                if (b17 > 0 || k8Var.d0()) {
                    g17 = com.tencent.mm.plugin.finder.assist.w2.g(!k8Var.d0() ? 2 : 1, b17);
                    kotlin.jvm.internal.o.f(g17, "formatNumber(...)");
                    p18.setTag(com.tencent.mm.R.id.e7i, g17);
                } else {
                    g17 = "";
                }
                textView.setText(g17);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(com.tencent.mm.R.id.h6f);
            r45.rl2 a17 = cu2.f0.f222391a.a("FinderObjectDynamicImageKey_FinderFavManageIcon");
            if (a17 != null && (string = a17.getString(1)) != null) {
                str = string;
            }
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "favManageIconUrl :" + str + '}');
            if (str.length() > 0) {
                mn2.g1 g1Var = mn2.g1.f329975a;
                wo0.c b18 = g1Var.e().b(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128355e), g1Var.h(mn2.f1.A));
                com.tencent.mm.plugin.finder.convert.vc vcVar = new com.tencent.mm.plugin.finder.convert.vc(weImageView, s0Var);
                b18.getClass();
                b18.f447873d = vcVar;
                b18.f();
                return;
            }
            android.content.Context context = s0Var.f293121e;
            android.graphics.drawable.Drawable e17 = m95.a.e(context.getResources(), com.tencent.mm.R.raw.icons_outlined_channels_good_cell, 0.0f);
            weImageView.setLayerPaint(null);
            weImageView.setIconColor(0);
            weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f479254u6));
            weImageView.setImageDrawable(e17);
        }
    }

    public void e0(in5.s0 holder, boolean z17) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    public final void e1(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var) {
        android.view.View findViewById;
        ya2.b2 contact = baseFinderFeed.getContact();
        if (contact != null) {
            java.lang.String D0 = contact.D0();
            boolean isMemberFeed = baseFinderFeed.getFeedObject().isMemberFeed();
            if (!isMemberFeed) {
                android.view.View p17 = s0Var.p(com.tencent.mm.R.id.efu);
                if (p17 == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberCover", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberCover", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (s0Var.p(com.tencent.mm.R.id.efu) == null) {
                try {
                    android.view.ViewStub viewStub = (android.view.ViewStub) s0Var.p(com.tencent.mm.R.id.tee);
                    if (viewStub != null) {
                        viewStub.inflate();
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("FinderFeedFullConvert", e17, "", new java.lang.Object[0]);
                }
            }
            android.view.View p18 = s0Var.p(com.tencent.mm.R.id.efu);
            if (p18 == null || (findViewById = p18.findViewById(com.tencent.mm.R.id.f485876jf3)) == null) {
                return;
            }
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            int i17 = nyVar != null ? nyVar.f135380n : 0;
            if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.e2().r()).intValue() != 0) {
                eo2.f fVar = eo2.f.f255565a;
                if (!((context instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI) || (context instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberTimelineUI)) && (!hc2.o0.H(baseFinderFeed.getFeedObject().getFeedObject()) || baseFinderFeed.getForceMemberPreviewMode())) {
                    if (!isMemberFeed) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberCover", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberCover", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                    if (hc2.o0.H(baseFinderFeed.getFeedObject().getFeedObject()) && baseFinderFeed.getForceMemberPreviewMode()) {
                        f1(baseFinderFeed, s0Var);
                        return;
                    }
                    r45.dm2 object_extend = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
                    r45.om2 om2Var = object_extend != null ? (r45.om2) object_extend.getCustom(23) : null;
                    if (om2Var != null && om2Var.getInteger(0) == 1) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(p18, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberCover", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        p18.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberCover", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                    if (om2Var != null && fVar.h(i17)) {
                        if (!fVar.a(om2Var)) {
                            f1(baseFinderFeed, s0Var);
                            return;
                        }
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(p18, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberCover", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        p18.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberCover", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                    eo2.d b17 = fVar.b(D0);
                    if (b17 != null) {
                        if (!b17.f255559a || b17.f255561c == 0) {
                            f1(baseFinderFeed, s0Var);
                            return;
                        }
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                        arrayList5.add(8);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(p18, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberCover", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        p18.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberCover", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                    arrayList6.add(0);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(p18, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberCover", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p18.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberCover", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(findViewById, arrayList7.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberCover", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberCover", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
            }
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(p18, arrayList8.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberCover", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberCover", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void f1(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var) {
        android.view.View findViewById;
        int i17;
        ya2.b2 contact = baseFinderFeed.getContact();
        if (contact != null) {
            java.lang.String D0 = contact.D0();
            android.view.View p17 = s0Var.p(com.tencent.mm.R.id.efu);
            if (p17 == null || (findViewById = p17.findViewById(com.tencent.mm.R.id.f485876jf3)) == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberVisitant", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberVisitant", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberVisitant", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberVisitant", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ya2.b2 contact2 = baseFinderFeed.getContact();
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById.findViewById(com.tencent.mm.R.id.kqg);
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.jew);
            android.widget.TextView textView = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.jfb);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById.findViewById(com.tencent.mm.R.id.jex);
            android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.jeu);
            android.content.Context context = s0Var.f293121e;
            viewGroup.setPadding(0, com.tencent.mm.ui.bl.h(context), 0, 0);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.m1 m1Var = ya2.m1.f460511a;
            kotlin.jvm.internal.o.d(imageView2);
            zy2.tb.a(m1Var, imageView2, contact2 != null ? contact2.field_authInfo : null, 0, 4, null);
            if (contact2 != null) {
                mn2.g1 g1Var = mn2.g1.f329975a;
                vo0.d a17 = g1Var.a();
                java.lang.String avatarUrl = contact2.getAvatarUrl();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                mn2.n nVar = new mn2.n(avatarUrl, com.tencent.mm.plugin.finder.storage.y90.X);
                kotlin.jvm.internal.o.d(imageView);
                a17.c(nVar, imageView, g1Var.h(mn2.f1.f329957h));
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String w07 = contact2.w0();
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, w07));
            }
            android.view.View findViewById2 = findViewById.findViewById(com.tencent.mm.R.id.rwy);
            if (baseFinderFeed.getShowMemberScroll()) {
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                if (nyVar != null && nyVar.f135380n == 172) {
                    i17 = 0;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberVisitant", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberVisitant", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    linearLayout.setOnClickListener(new com.tencent.mm.plugin.finder.convert.wc(s0Var, baseFinderFeed, D0));
                }
            }
            i17 = 4;
            java.util.ArrayList arrayList32 = new java.util.ArrayList();
            arrayList32.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList32);
            yj0.a.d(findViewById2, arrayList32.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberVisitant", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList32.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberVisitant", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            linearLayout.setOnClickListener(new com.tencent.mm.plugin.finder.convert.wc(s0Var, baseFinderFeed, D0));
        }
    }

    @Override // in5.r
    public void g(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
        this.f104357J = recyclerView;
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", hc2.b0.l(hc2.d.f280306d, -1, null, null, 0, 0, 28, null));
    }

    public final boolean g0(int i17) {
        switch (i17) {
            case 29:
            case 30:
            case 31:
            case 34:
            case 35:
                return true;
            case 32:
            case 33:
            default:
                return false;
        }
    }

    public final void g1(com.tencent.mm.plugin.finder.model.BaseFinderFeed item, in5.s0 holder) {
        android.view.View b17;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        boolean booleanValue = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.L0().r()).booleanValue();
        if (booleanValue) {
            bw2.o oVar = bw2.o.f24869a;
            b17 = ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f24876h).getValue()).invoke(holder)).b();
        } else {
            b17 = holder.p(com.tencent.mm.R.id.fsk);
        }
        if (!item.getFeedObject().isMemberFeed()) {
            if (b17 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            android.view.View view = b17;
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberWaterMark", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberWaterMark", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (b17 == null && booleanValue) {
            bw2.o oVar2 = bw2.o.f24869a;
            b17 = ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f24876h).getValue()).invoke(holder)).a();
        }
        if (b17 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        android.view.View view2 = b17;
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberWaterMark", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMemberWaterMark", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public boolean h0() {
        return !(this instanceof com.tencent.mm.plugin.finder.convert.yn);
    }

    public final void h1(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.h6o);
        if (p17 != null) {
            boolean z17 = baseFinderFeed.getFeedObject().isPostFinish() || baseFinderFeed.getFeedObject().getPostInfo().getInteger(4) >= 100;
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            int i17 = nyVar != null ? nyVar.f135380n : 0;
            if (((!this.f104358f.d0() || !hc2.b0.i(baseFinderFeed)) && !((java.lang.Boolean) ((jz5.n) this.f104372w).getValue()).booleanValue() && i17 != 21 && i17 != 2) || baseFinderFeed.getFeedObject().isLiveFeed() || !z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMoreBtn", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMoreBtn", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            p17.setOnClickListener(new com.tencent.mm.plugin.finder.convert.xc(this, s0Var));
            int h17 = com.tencent.mm.ui.bl.h(context);
            android.view.ViewGroup.LayoutParams layoutParams = p17.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((android.widget.FrameLayout.LayoutParams) layoutParams).topMargin = h17;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMoreBtn", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMoreBtn", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setContentDescription(context.getString(com.tencent.mm.R.string.ez_));
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        holder.itemView.getLayoutParams().width = -1;
        holder.itemView.getLayoutParams().height = -1;
        recyclerView.getLayoutParams().height = -1;
        recyclerView.getLayoutParams().width = -1;
        android.view.ViewParent parent = recyclerView.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((android.view.ViewGroup) parent).getLayoutParams().width = -1;
        android.view.ViewParent parent2 = recyclerView.getParent();
        kotlin.jvm.internal.o.e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((android.view.ViewGroup) parent2).getLayoutParams().height = -1;
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.a8p);
        com.tencent.mm.ui.widget.FlowTextMixView flowTextMixView = (com.tencent.mm.ui.widget.FlowTextMixView) holder.itemView.findViewById(com.tencent.mm.R.id.g9g);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.content.Context context = holder.f293121e;
        if (flowTextMixView != null) {
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            flowTextMixView.setMaxWidth((int) (((android.app.Activity) context).getBaseContext().getResources().getDisplayMetrics().widthPixels * 0.36f));
        }
        com.tencent.neattextview.textview.view.NeatTextView neatTextView = (com.tencent.neattextview.textview.view.NeatTextView) holder.p(com.tencent.mm.R.id.f487278o45);
        neatTextView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y(neatTextView, new com.tencent.mm.pluginsdk.ui.span.y0(context)));
        com.tencent.mm.plugin.finder.convert.mb mbVar = new com.tencent.mm.plugin.finder.convert.mb(this, holder);
        if (kotlin.jvm.internal.o.b(android.os.Looper.getMainLooper().getThread(), java.lang.Thread.currentThread())) {
            mbVar.run();
        } else {
            holder.itemView.post(mbVar);
        }
        android.view.View p17 = holder.p(com.tencent.mm.R.id.gbz);
        if (p17 != null) {
            if (!((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.D1().r()).booleanValue()) {
                p17.setOnClickListener(com.tencent.mm.plugin.finder.convert.nb.f104089d);
            }
            android.widget.TextView textView2 = (android.widget.TextView) p17.findViewById(com.tencent.mm.R.id.lja);
            if (textView2 != null) {
                textView2.setTextSize(1, 12.0f);
            }
            int round = java.lang.Math.round(j65.f.f() * i65.a.m(context) * 28);
            int round2 = java.lang.Math.round(j65.f.f() * i65.a.m(context) * 40);
            android.widget.TextView textView3 = (android.widget.TextView) p17.findViewById(com.tencent.mm.R.id.lja);
            if (textView3 != null) {
                textView3.setMaxWidth(round2);
            }
            android.view.View findViewById = p17.findViewById(com.tencent.mm.R.id.h6m);
            if (findViewById != null) {
                android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.width = round;
                layoutParams.height = round;
                findViewById.setLayoutParams(layoutParams);
            }
            android.widget.TextView textView4 = (android.widget.TextView) p17.findViewById(com.tencent.mm.R.id.dtx);
            if (textView4 != null) {
                textView4.setTextSize(1, 12.0f);
                textView4.setText(cu2.f0.f222391a.g());
                textView4.setMaxWidth(round2);
            }
            android.view.View findViewById2 = p17.findViewById(com.tencent.mm.R.id.h6e);
            if (findViewById2 != null) {
                android.view.ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
                layoutParams2.width = round;
                layoutParams2.height = round;
                findViewById2.setLayoutParams(layoutParams2);
            }
            android.widget.TextView textView5 = (android.widget.TextView) p17.findViewById(com.tencent.mm.R.id.msm);
            if (textView5 != null) {
                textView5.setTextSize(1, 12.0f);
            }
            android.widget.TextView textView6 = (android.widget.TextView) p17.findViewById(com.tencent.mm.R.id.msm);
            if (textView6 != null) {
                textView6.setMaxWidth(round2);
            }
            android.view.View findViewById3 = p17.findViewById(com.tencent.mm.R.id.h6p);
            if (findViewById3 != null) {
                android.view.ViewGroup.LayoutParams layoutParams3 = findViewById3.getLayoutParams();
                layoutParams3.width = round;
                layoutParams3.height = round;
                findViewById3.setLayoutParams(layoutParams3);
            }
            android.widget.TextView textView7 = (android.widget.TextView) p17.findViewById(com.tencent.mm.R.id.i1g);
            if (textView7 != null) {
                textView7.setTextSize(1, 12.0f);
            }
            android.widget.TextView textView8 = (android.widget.TextView) p17.findViewById(com.tencent.mm.R.id.i1g);
            if (textView8 != null) {
                textView8.setMaxWidth(round2);
            }
            android.view.View findViewById4 = p17.findViewById(com.tencent.mm.R.id.h6i);
            if (findViewById4 != null) {
                android.view.ViewGroup.LayoutParams layoutParams4 = findViewById4.getLayoutParams();
                layoutParams4.width = round;
                layoutParams4.height = round;
                findViewById4.setLayoutParams(layoutParams4);
            }
            android.widget.TextView textView9 = (android.widget.TextView) p17.findViewById(com.tencent.mm.R.id.f487086ng3);
            if (textView9 != null) {
                textView9.setTextSize(1, 12.0f);
            }
            android.widget.TextView textView10 = (android.widget.TextView) p17.findViewById(com.tencent.mm.R.id.f487086ng3);
            if (textView10 != null) {
                textView10.setMaxWidth(round2);
            }
            android.view.View findViewById5 = p17.findViewById(com.tencent.mm.R.id.h6s);
            if (findViewById5 != null) {
                android.view.ViewGroup.LayoutParams layoutParams5 = findViewById5.getLayoutParams();
                layoutParams5.width = round;
                layoutParams5.height = round;
                findViewById5.setLayoutParams(layoutParams5);
            }
            android.widget.TextView textView11 = (android.widget.TextView) p17.findViewById(com.tencent.mm.R.id.c6s);
            if (textView11 != null) {
                textView11.setTextSize(1, 12.0f);
            }
            android.widget.TextView textView12 = (android.widget.TextView) p17.findViewById(com.tencent.mm.R.id.c6s);
            if (textView12 != null) {
                textView12.setMaxWidth(round2);
            }
            android.view.View findViewById6 = p17.findViewById(com.tencent.mm.R.id.h6b);
            if (findViewById6 != null) {
                android.view.ViewGroup.LayoutParams layoutParams6 = findViewById6.getLayoutParams();
                layoutParams6.width = round;
                layoutParams6.height = round;
                findViewById6.setLayoutParams(layoutParams6);
            }
            android.widget.TextView textView13 = (android.widget.TextView) p17.findViewById(com.tencent.mm.R.id.dty);
            if (textView13 != null) {
                textView13.setTextSize(1, 12.0f);
            }
            android.widget.TextView textView14 = (android.widget.TextView) p17.findViewById(com.tencent.mm.R.id.dty);
            if (textView14 != null) {
                textView14.setMaxWidth(round2);
            }
            android.view.View findViewById7 = p17.findViewById(com.tencent.mm.R.id.h6f);
            if (findViewById7 != null) {
                android.view.ViewGroup.LayoutParams layoutParams7 = findViewById7.getLayoutParams();
                layoutParams7.width = round;
                layoutParams7.height = round;
                findViewById7.setLayoutParams(layoutParams7);
            }
            android.widget.TextView textView15 = (android.widget.TextView) p17.findViewById(com.tencent.mm.R.id.rts);
            if (textView15 != null) {
                textView15.setTextSize(1, 12.0f);
            }
            android.widget.TextView textView16 = (android.widget.TextView) p17.findViewById(com.tencent.mm.R.id.rts);
            if (textView16 != null) {
                textView16.setMaxWidth(round2);
            }
            android.widget.TextView textView17 = (android.widget.TextView) p17.findViewById(com.tencent.mm.R.id.s77);
            if (textView17 != null) {
                textView17.setTextSize(1, 12.0f);
            }
            android.widget.TextView textView18 = (android.widget.TextView) p17.findViewById(com.tencent.mm.R.id.s77);
            if (textView18 != null) {
                textView18.setMaxWidth(round2);
            }
        }
        android.widget.TextView textView19 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f485561i44);
        if (textView19 != null) {
            textView19.setTextSize(1, 10.0f);
        }
        android.view.View p18 = holder.p(com.tencent.mm.R.id.f487088ng5);
        if (p18 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "onCreateViewHolder", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "onCreateViewHolder", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        r(holder);
        int h17 = com.tencent.mm.ui.bl.h(context);
        android.view.View p19 = holder.p(com.tencent.mm.R.id.te_);
        if (p19 != null) {
            android.view.ViewGroup.LayoutParams layoutParams8 = p19.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams8 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams8 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = h17;
            }
        }
        android.view.View p27 = holder.p(com.tencent.mm.R.id.teg);
        if (p27 != null) {
            android.widget.TextView textView20 = (android.widget.TextView) p27.findViewById(com.tencent.mm.R.id.tef);
            if (textView20 != null) {
                textView20.setTextSize(1, 12.0f);
            }
            android.view.ViewGroup.LayoutParams layoutParams9 = p27.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams9 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams9 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = i65.a.f(context, com.tencent.mm.R.dimen.f479727dj) + h17;
            }
            p27.setLayoutParams(marginLayoutParams2);
        }
    }

    public boolean i0() {
        return this instanceof com.tencent.mm.plugin.finder.feed.ms;
    }

    public final void i1(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var) {
        r45.qj2 qj2Var;
        r45.dm2 object_extend = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
        java.lang.String str = null;
        r45.bn2 bn2Var = object_extend != null ? (r45.bn2) object_extend.getCustom(51) : null;
        if (bn2Var != null && (qj2Var = (r45.qj2) bn2Var.getCustom(0)) != null) {
            str = qj2Var.getString(7);
        }
        if (!(str == null || str.length() == 0)) {
            android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.tef);
            if (textView == null) {
                return;
            }
            textView.setText(str);
            return;
        }
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.teg);
        if (p17 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshNativeDramaCover", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshNativeDramaCover", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.finder.convert.w7, in5.r
    public void j(androidx.recyclerview.widget.RecyclerView recyclerView) {
        java.lang.Object tag;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.j(recyclerView);
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", hc2.b0.l(hc2.d.f280307e, -1, null, null, 0, 0, 28, null));
        int childCount = recyclerView.getChildCount();
        int i17 = 0;
        while (true) {
            if (i17 >= childCount) {
                this.f104357J = null;
                return;
            }
            androidx.recyclerview.widget.k3 m07 = recyclerView.m0(recyclerView.getChildAt(i17));
            if (m07 != null) {
                in5.s0 s0Var = m07 instanceof in5.s0 ? (in5.s0) m07 : null;
                if (s0Var != null && (tag = s0Var.itemView.getTag(com.tencent.mm.R.id.edv)) != null) {
                    java.lang.Object obj = tag instanceof java.lang.Boolean ? tag : null;
                    if (obj != null && ((java.lang.Boolean) obj).booleanValue()) {
                        z0(s0Var, s0Var.getAdapterPosition(), s0Var.getItemViewType(), false);
                    }
                }
            }
            i17++;
        }
    }

    public final boolean j0(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.I9).getValue()).r()).intValue() == 1 && this.f104358f.d0() && hc2.b0.i(baseFinderFeed) && !(this instanceof com.tencent.mm.plugin.finder.convert.zf);
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "isShowFingerLike: " + z17);
        return z17;
    }

    public final void j1(in5.s0 s0Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, java.lang.String str) {
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        r45.hm2 hotTopics;
        r45.gm2 gm2Var = null;
        java.util.LinkedList list = (finderItem == null || (feedObject2 = finderItem.getFeedObject()) == null || (hotTopics = feedObject2.getHotTopics()) == null) ? null : hotTopics.getList(0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showNewsIndicator objectType: ");
        sb6.append((finderItem == null || (feedObject = finderItem.getFeedObject()) == null) ? null : java.lang.Integer.valueOf(feedObject.getObjectType()));
        sb6.append(" size:");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", sb6.toString());
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r45.gm2 gm2Var2 = (r45.gm2) it.next();
                if (gm2Var2 != null && gm2Var2.getInteger(2) == 5) {
                    gm2Var = gm2Var2;
                    break;
                }
            }
        }
        r45.gm2 gm2Var3 = gm2Var;
        if (gm2Var3 == null) {
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "[refreshNewsLayout] topic null let");
            android.view.View p17 = s0Var.p(com.tencent.mm.R.id.eeb);
            if (p17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshNewsLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshNewsLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p18 = s0Var.p(com.tencent.mm.R.id.eec);
            if (p18 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshNewsLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshNewsLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            t(s0Var);
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "[refreshNewsLayout] topic " + gm2Var3.getLong(0) + ' ' + gm2Var3.getString(1) + ' ' + gm2Var3.getInteger(3));
        if (s0Var.f293121e instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI) {
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "[refreshNewsLayout] topic ui is FinderShareFeedRelUI block");
            android.view.View p19 = s0Var.p(com.tencent.mm.R.id.eeb);
            if (p19 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshNewsLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshNewsLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p27 = s0Var.p(com.tencent.mm.R.id.eec);
            if (p27 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshNewsLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshNewsLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            t(s0Var);
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.dzt);
        if (textView != null) {
            if (gm2Var3.getInteger(3) > 0) {
                textView.setTextColor(textView.getResources().getColor(com.tencent.mm.R.color.f479263uf));
            } else {
                textView.setTextColor(textView.getResources().getColor(com.tencent.mm.R.color.f479252u4));
            }
            textView.setBackgroundResource(com.tencent.mm.R.drawable.f481616y2);
            textView.setTextSize(0, s0Var.f293121e.getResources().getDimension(com.tencent.mm.R.dimen.f479628b3));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(com.tencent.mm.R.id.fx9);
        if (weImageView != null) {
            weImageView.setIconColor(weImageView.getResources().getColor(com.tencent.mm.R.color.f479250u2));
        }
        android.view.View p28 = s0Var.p(com.tencent.mm.R.id.eeb);
        if (p28 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p28, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshNewsLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshNewsLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t(s0Var);
            p28.setOnClickListener(new com.tencent.mm.plugin.finder.convert.zc(gm2Var3, finderItem, this, str, s0Var, p28));
        }
        android.widget.TextView textView2 = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.dzt);
        if (textView2 != null) {
            java.lang.String str2 = textView2.getContext().getResources().getString(com.tencent.mm.R.string.f491952er5) + gm2Var3.getString(1);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            ((ke0.e) xVar).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str2));
        }
        android.widget.TextView textView3 = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.dzs);
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
    }

    public final boolean k0(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        nv2.h1 h1Var = nv2.n1.f340550g;
        nv2.n1 n1Var = nv2.n1.f340551h;
        java.util.LinkedList h17 = n1Var.h(baseFinderFeed.getFeedObject().getFeedObject());
        int g17 = n1Var.g(baseFinderFeed.getFeedObject().getFeedObject());
        boolean d07 = this.f104358f.d0();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127855o4).getValue()).r()).booleanValue();
        boolean z17 = true;
        boolean z18 = this.P;
        if (!booleanValue ? !z18 || com.tencent.mm.sdk.platformtools.t8.L0(h17) || g17 <= 0 || d07 : !z18 || com.tencent.mm.sdk.platformtools.t8.L0(h17) || g17 <= 0) {
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "[isShowRealNameRecommendLayout] result:" + z17 + " isRealNameLike:" + z18 + " likeList.size:" + h17.size() + " totalCount:" + g17 + " isSelfScene:" + d07);
        return z17;
    }

    public final void k1(com.tencent.mm.plugin.finder.model.BaseFinderFeed item, in5.s0 holder) {
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo2;
        r45.xk b17;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo e17;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.view.EllipsizedTextView ellipsizedTextView = (com.tencent.mm.plugin.finder.view.EllipsizedTextView) holder.itemView.findViewById(com.tencent.mm.R.id.a8p);
        boolean z17 = this.f104361i;
        android.content.Context context = holder.f293121e;
        if (z17) {
            ellipsizedTextView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9));
        }
        if (qe2.a.e(item.getFeedObject())) {
            kotlin.jvm.internal.o.d(ellipsizedTextView);
            zy2.s.b(ellipsizedTextView, qe2.a.a(item.getFeedObject()), qe2.a.c(item.getFeedObject()), null);
        } else {
            ellipsizedTextView.setText(item.getFeedObject().getNickNameSpan());
        }
        android.view.View p17 = holder.p(com.tencent.mm.R.id.f485561i44);
        int dimension = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
        if (p17.getVisibility() == 0) {
            dimension += (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
        }
        ellipsizedTextView.setExtraEllipsizeWidth(dimension);
        ya2.b2 contact = item.getContact();
        int i17 = 0;
        if (contact == null || (b17 = ya2.d.b(contact, false)) == null || (e17 = ya2.d.e(b17)) == null) {
            ya2.b2 contact2 = item.getContact();
            finderAuthInfo = contact2 != null ? contact2.field_authInfo : null;
        } else {
            finderAuthInfo = e17;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f460511a;
        android.view.View p18 = holder.p(com.tencent.mm.R.id.f483299a85);
        kotlin.jvm.internal.o.f(p18, "getView(...)");
        zy2.tb.a(m1Var, (android.widget.ImageView) p18, finderAuthInfo, 0, 4, null);
        android.view.View p19 = holder.p(com.tencent.mm.R.id.che);
        if (p19 != null) {
            p19.setOnClickListener(new com.tencent.mm.plugin.finder.convert.ad(holder, item, this));
        }
        ya2.b2 contact3 = item.getContact();
        int i18 = contact3 != null ? contact3.field_friendFollowCount : 0;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.itemView.findViewById(com.tencent.mm.R.id.dzo);
        if (viewGroup != null) {
            viewGroup.setTag(com.tencent.mm.R.id.e79, item.getFeedObject().getNickNameSpan());
            ya2.b2 contact4 = item.getContact();
            if (contact4 != null && (finderAuthInfo2 = contact4.field_authInfo) != null) {
                i17 = finderAuthInfo2.getAuthIconType();
            }
            viewGroup.setTag(com.tencent.mm.R.id.e5i, java.lang.Integer.valueOf(i17));
            viewGroup.setTag(com.tencent.mm.R.id.e5t, java.lang.Integer.valueOf(i18));
        }
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        com.tencent.mm.plugin.finder.viewmodel.component.p0 p0Var;
        com.tencent.mm.plugin.finder.viewmodel.component.p7 p7Var;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        so2.d contextInStream;
        kotlin.jvm.internal.o.g(holder, "holder");
        tc2.b bVar = this.f104851e;
        bVar.getClass();
        bVar.b(holder);
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        itemView.setTag(com.tencent.mm.R.id.vmu, null);
        hc2.d dVar = hc2.d.f280309g;
        java.lang.Object obj = holder.f293125i;
        so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
        int i17 = (u1Var == null || (contextInStream = u1Var.getContextInStream()) == null) ? -1 : contextInStream.f410302a;
        java.lang.Object obj2 = holder.f293125i;
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", hc2.b0.l(dVar, i17, obj2 instanceof so2.u1 ? (so2.u1) obj2 : null, holder, -1, 0, 16, null));
        pf5.u uVar = pf5.u.f353936a;
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ld ldVar = (com.tencent.mm.plugin.finder.viewmodel.component.ld) uVar.b(context).e(com.tencent.mm.plugin.finder.viewmodel.component.ld.class);
        if (ldVar != null) {
            da2.g gVar = ldVar.f135054i;
            if (gVar != null) {
                gVar.j();
            }
            ldVar.f135054i = null;
        }
        if (((com.tencent.mm.plugin.finder.view.FinderMediaLayout) holder.p(com.tencent.mm.R.id.fs6)) != null && (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k)) != null) {
            finderVideoLayout.P();
        }
        java.lang.Object obj3 = holder.f293125i;
        so2.u1 u1Var2 = obj3 instanceof so2.u1 ? (so2.u1) obj3 : null;
        if (u1Var2 != null) {
            u1Var2.U0();
        }
        gs2.c cVar = gs2.c.f275072a;
        int hashCode = holder.hashCode();
        gs2.c.f275073b.remove(java.lang.Integer.valueOf(hashCode));
        gs2.c.f275074c.remove(java.lang.Integer.valueOf(hashCode));
        if (!((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode() && !i0()) {
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            sc2.a8 a8Var = (sc2.a8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(sc2.a8.class);
            a8Var.getClass();
            a8Var.f7(holder);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.s7 s7Var = (com.tencent.mm.plugin.finder.viewmodel.component.s7) uVar.b(context).e(com.tencent.mm.plugin.finder.viewmodel.component.s7.class);
        if (s7Var != null && (p7Var = (com.tencent.mm.plugin.finder.viewmodel.component.p7) s7Var.f135867d.remove(java.lang.Integer.valueOf(holder.hashCode()))) != null) {
            ((xc2.k0) uVar.e(zy2.b6.class).a(xc2.k0.class)).T6(p7Var.f135532d.getItemId()).removeObserver(p7Var);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.e90 e90Var = (com.tencent.mm.plugin.finder.viewmodel.component.e90) uVar.b(context).e(com.tencent.mm.plugin.finder.viewmodel.component.e90.class);
        if (e90Var != null) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) holder.f293125i;
            kotlin.jvm.internal.o.d(baseFinderFeed);
            e90Var.R6(holder, e90Var.V6(baseFinderFeed), false);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.t0 t0Var = (com.tencent.mm.plugin.finder.viewmodel.component.t0) uVar.b(context).e(com.tencent.mm.plugin.finder.viewmodel.component.t0.class);
        if (t0Var != null && (p0Var = (com.tencent.mm.plugin.finder.viewmodel.component.p0) t0Var.f135951d.remove(java.lang.Integer.valueOf(holder.hashCode()))) != null) {
            ((xc2.k0) uVar.e(zy2.b6.class).a(xc2.k0.class)).Q6(p0Var.f135496d.getItemId()).removeObserver(p0Var);
        }
        com.tencent.mm.plugin.finder.highlight.c.a(holder);
        this.L = false;
        java.lang.Runnable runnable = this.S;
        if (runnable != null) {
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            com.tencent.mm.sdk.platformtools.u3.l(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final boolean l0(in5.s0 s0Var, int i17, boolean z17, android.view.MotionEvent motionEvent, int i18) {
        android.content.Context context;
        java.lang.String str;
        boolean z18;
        ec2.d e27;
        yz5.a aVar;
        boolean z19;
        boolean z27;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i;
        long id6 = baseFinderFeed.getFeedObject().getFeedObject().getId();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        yz5.a y9Var = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.N0().r()).booleanValue() ? new com.tencent.mm.plugin.finder.convert.y9(s0Var, h0Var2, this, baseFinderFeed, h0Var, id6) : new com.tencent.mm.plugin.finder.convert.ea(s0Var, h0Var2, ox2.p0.c(this, s0Var), id6, this, baseFinderFeed, h0Var, motionEvent);
        if (i17 < 0) {
            y9Var.invoke();
            return true;
        }
        nv2.n1 n1Var = nv2.n1.f340551h;
        jz5.l k17 = n1Var.k(baseFinderFeed.getFeedObject().getFeedObject());
        boolean booleanValue = ((java.lang.Boolean) k17.f302833d).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) k17.f302834e).booleanValue();
        boolean z28 = !booleanValue;
        h0Var2.f310123d = M(baseFinderFeed.getFeedObject().getUserName(), 1, z28);
        android.content.Context context2 = s0Var.f293121e;
        if (z28) {
            android.view.View p17 = s0Var.p(com.tencent.mm.R.id.msw);
            if (p17 != null) {
                kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                aVar = y9Var;
                ((com.tencent.mm.plugin.finder.viewmodel.component.h50) pf5.z.f353948a.a((com.tencent.mm.ui.MMActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.h50.class)).O6(p17, baseFinderFeed.getItemId(), 2);
            } else {
                aVar = y9Var;
            }
            aVar.invoke();
            if (i17 == 1 || i17 == 2 || z17) {
                hc2.f1.x(s0Var.itemView);
            }
            android.view.View p18 = s0Var.p(com.tencent.mm.R.id.f484958g22);
            if (p18 == null) {
                z27 = true;
                z19 = false;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "likeFeed", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IZLandroid/view/MotionEvent;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                z19 = false;
                p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "likeFeed", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IZLandroid/view/MotionEvent;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                z27 = true;
            }
            baseFinderFeed.e1(z27);
            context = context2;
            z18 = z19;
            G(this, s0Var, baseFinderFeed, false, 4, null);
            str = "getContext(...)";
            kotlin.jvm.internal.o.f(context, str);
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC finderDescPanelUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.class);
            if (finderDescPanelUIC != null) {
                finderDescPanelUIC.g7(com.tencent.mm.plugin.finder.viewmodel.component.g9.f134480f, s0Var, z18);
            }
            W0(s0Var);
            m0(s0Var, xc2.s0.f453290d);
            com.tencent.mm.plugin.finder.viewmodel.component.hs a17 = com.tencent.mm.plugin.finder.viewmodel.component.hs.f134650z.a(context);
            if (a17 != null) {
                a17.h7(s0Var, 2);
            }
            baseFinderFeed.C1(z18);
        } else {
            context = context2;
            str = "getContext(...)";
            z18 = false;
            baseFinderFeed.C1(true);
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127996w2).getValue()).r()).intValue() == 1) {
                baseFinderFeed.T1(false);
            }
            kotlin.jvm.internal.o.f(context, str);
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.d7 d7Var = (com.tencent.mm.plugin.finder.viewmodel.component.d7) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.d7.class);
            if (d7Var != null) {
                cq.k1.a();
                if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127692f6).getValue()).r()).booleanValue()) {
                    d7Var.P6(kz5.b0.c(r45.ki0.EDU_BIZ_TYPE_CANCEL_LIKE));
                }
            }
        }
        boolean z29 = z28 ? z18 : booleanValue2;
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ni(s0Var, baseFinderFeed.getItemId(), baseFinderFeed.getFeedObject());
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(context, str);
        long itemId = baseFinderFeed.getItemId();
        java.lang.String w17 = baseFinderFeed.w();
        uw2.h0 h0Var3 = uw2.h0.f431674a;
        h0Var3.h();
        o3Var.Ri(context, itemId, w17, "animation_effects_type", java.lang.Integer.valueOf((int) (h0Var3.h() != 0 ? 1 : z18)));
        this.f104358f.W4(baseFinderFeed, z28, z17, i17, z29, (r45.bc1) h0Var.f310123d);
        boolean z37 = context instanceof com.tencent.mm.ui.MMFragmentActivity;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = z37 ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar != null) {
            nyVar.V6();
        }
        I0(baseFinderFeed, z28, z17, n1Var.l(baseFinderFeed.getFeedObject().getFeedObject()), s0Var, i18);
        if (baseFinderFeed.getFeedObject().isMsgLikeEvent() && !z17) {
            if (z28) {
                com.tencent.mm.protocal.protobuf.FinderObject feedObject = baseFinderFeed.getFeedObject().getFeedObject();
                feedObject.setIncFriendLikeCount(feedObject.getIncFriendLikeCount() + 1);
            } else if (!booleanValue2) {
                com.tencent.mm.protocal.protobuf.FinderObject feedObject2 = baseFinderFeed.getFeedObject().getFeedObject();
                feedObject2.setIncFriendLikeCount(feedObject2.getIncFriendLikeCount() - 1);
            }
        }
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
        long itemId2 = baseFinderFeed.getItemId();
        am.ia iaVar = feedUpdateEvent.f54252g;
        iaVar.f6918a = itemId2;
        iaVar.f6919b = 4;
        iaVar.f6922e = (z28 && z17) ? 2 : z28 ? 1 : 0;
        feedUpdateEvent.e();
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = z37 ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar2 != null && (e27 = zy2.ra.e2(nyVar2, 0, 1, null)) != null) {
            if (z28) {
                e27.a(new ec2.a(7, baseFinderFeed.getItemId(), baseFinderFeed.w()));
            } else {
                e27.a(new ec2.a(8, baseFinderFeed.getItemId(), baseFinderFeed.w()));
            }
        }
        if (z28 && s0Var.getAdapterPosition() == 0) {
            if (i17 == 2) {
                pf5.z zVar3 = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                zu2.q qVar = ((zu2.a0) zVar3.a((androidx.appcompat.app.AppCompatActivity) context).a(zu2.a0.class)).f475694f;
                if (qVar != null) {
                    qVar.a();
                    qVar.d("double_like");
                }
            }
            pf5.z zVar4 = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            zu2.q qVar2 = ((zu2.a0) zVar4.a((androidx.appcompat.app.AppCompatActivity) context).a(zu2.a0.class)).f475694f;
            if (qVar2 != null) {
                qVar2.a();
                qVar2.d("like");
            }
        }
        s0Var.p(com.tencent.mm.R.id.a_x).setTag(com.tencent.mm.R.id.e5w, java.lang.Boolean.valueOf(z28));
        G1();
        ju2.g.a(this, s0Var, baseFinderFeed, s0Var.getAdapterPosition());
        return z28;
    }

    public final void l1(in5.s0 s0Var) {
        r45.zk2 zk2Var;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar = (com.tencent.mm.plugin.finder.viewmodel.component.hs) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.hs.class);
        if (hsVar != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "onBindView");
            hsVar.f134668x = java.lang.System.currentTimeMillis();
            if (!hsVar.e7(s0Var)) {
                if (hsVar.z7(s0Var).f135581a == com.tencent.mm.plugin.finder.viewmodel.component.rq.f135824e) {
                    hsVar.P6(s0Var);
                    return;
                } else {
                    hsVar.d7(s0Var);
                    return;
                }
            }
            if (hsVar.g7(s0Var)) {
                return;
            }
            r45.yk2 w76 = com.tencent.mm.plugin.finder.viewmodel.component.hs.w7(hsVar, s0Var, null, 2, null);
            com.tencent.mm.plugin.finder.viewmodel.component.pq z76 = hsVar.z7(s0Var);
            if (w76 == null || (zk2Var = z76.f135590j) == null) {
                return;
            }
            if (!(zk2Var.getInteger(3) != 1)) {
                hsVar.y7(s0Var, com.tencent.mm.plugin.finder.viewmodel.component.rq.f135825f);
                android.view.View X6 = hsVar.X6(s0Var);
                if (X6 != null) {
                    hsVar.t7(s0Var, zk2Var, X6);
                    java.lang.Object parent = X6.getParent();
                    if ((parent instanceof android.view.View ? (android.view.View) parent : null) != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(X6, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "showSurveyHeaderWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        X6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(X6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "showSurveyHeaderWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                    return;
                }
                return;
            }
            int integer = zk2Var.getInteger(4);
            if (integer != 1) {
                if (integer != 2) {
                    return;
                }
                hsVar.y7(s0Var, com.tencent.mm.plugin.finder.viewmodel.component.rq.f135827h);
                android.view.View x76 = hsVar.x7(s0Var);
                if (x76 != null) {
                    hsVar.u7(s0Var, zk2Var, x76);
                    java.lang.Object parent2 = x76.getParent();
                    if ((parent2 instanceof android.view.View ? (android.view.View) parent2 : null) != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(x76, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "showScoreLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        x76.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(x76, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "showScoreLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                    return;
                }
                return;
            }
            hsVar.y7(s0Var, com.tencent.mm.plugin.finder.viewmodel.component.rq.f135826g);
            android.view.View X62 = hsVar.X6(s0Var);
            android.view.View Q6 = hsVar.Q6(s0Var);
            if (X62 == null || Q6 == null) {
                return;
            }
            hsVar.t7(s0Var, zk2Var, X62);
            hsVar.s7(Q6, zk2Var);
            java.lang.Object parent3 = Q6.getParent();
            if ((parent3 instanceof android.view.View ? (android.view.View) parent3 : null) != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(X62, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "showSurveyLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                X62.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(X62, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "showSurveyLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(Q6, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "showSurveyLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                Q6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(Q6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "showSurveyLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public final void m0(in5.s0 s0Var, xc2.s0 s0Var2) {
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode() || i0()) {
            return;
        }
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sc2.a8 a8Var = (sc2.a8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(sc2.a8.class);
        xc2.t0 t0Var = new xc2.t0(s0Var2);
        a8Var.getClass();
        a8Var.T6(s0Var, new sc2.b7(s0Var, t0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1(in5.s0 r28, com.tencent.mm.plugin.finder.model.BaseFinderFeed r29) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.qe.m1(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    public void n0(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, android.view.View it, int i17) {
        boolean z17;
        java.lang.String str;
        java.lang.Object obj;
        com.tencent.mm.plugin.finder.view.uj ujVar;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        r45.c03 tips_info;
        com.tencent.mm.plugin.finder.view.e3 e3Var;
        android.view.View view;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(it, "it");
        w04.l.INSTANCE.b(540999702);
        if (!hc2.o0.i(item.getFeedObject().getFeedObject())) {
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "disableShowForwardSheet");
            L1(holder, item);
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j17 = elapsedRealtime - this.f104363n;
        if (41 <= j17 && j17 < 300) {
            this.f104363n = elapsedRealtime;
            z17 = false;
        } else {
            this.f104363n = elapsedRealtime;
            z17 = true;
        }
        if (z17) {
            int adapterPosition = holder.getAdapterPosition();
            android.content.Context context = holder.f293121e;
            if (adapterPosition == 0) {
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                zu2.q qVar = ((zu2.a0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(zu2.a0.class)).f475694f;
                if (qVar != null) {
                    qVar.a();
                    qVar.d("forward");
                }
            }
            A(holder);
            com.tencent.mm.plugin.finder.convert.lb lbVar = new com.tencent.mm.plugin.finder.convert.lb(it, this, item, i17);
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            boolean d17 = hc2.t.d(context);
            item.x1(i17);
            com.tencent.mm.plugin.finder.feed.k8 contract = this.f104358f;
            if (d17) {
                pf5.z zVar2 = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.tencent.mm.plugin.finder.viewmodel.component.t10 t10Var = (com.tencent.mm.plugin.finder.viewmodel.component.t10) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.t10.class);
                t10Var.getClass();
                kotlin.jvm.internal.o.g(contract, "contract");
                t10Var.f135959e = item;
                t10Var.f135960f = i17;
                t10Var.f135961g = holder;
                t10Var.f135962h = contract;
                androidx.appcompat.app.AppCompatActivity activity = t10Var.getActivity();
                if (t10Var.f135958d == null) {
                    t10Var.f135958d = new com.tencent.mm.plugin.finder.view.uj(activity);
                }
                com.tencent.mm.plugin.finder.view.uj ujVar2 = t10Var.f135958d;
                android.view.View findViewById = (ujVar2 == null || (e3Var = (com.tencent.mm.plugin.finder.view.e3) ((jz5.n) ujVar2.f133184c).getValue()) == null || (view = e3Var.f131959f) == null) ? null : view.findViewById(com.tencent.mm.R.id.s5b);
                if (findViewById != null) {
                    int b17 = i65.a.b(t10Var.getContext(), 16);
                    findViewById.findViewById(com.tencent.mm.R.id.f486840v34).setPadding(b17, b17 / 2, b17, b17);
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = t10Var.f135959e;
                    java.lang.String string = (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null || (tips_info = feedObject2.getTips_info()) == null) ? null : tips_info.getString(0);
                    if (string == null || string.length() == 0) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        android.view.View view2 = findViewById;
                        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfShareDrawerUIC", "prepareSelfHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfShareDrawerUIC", "prepareSelfHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        android.widget.TextView textView = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.g2u);
                        textView.setText(string);
                        com.tencent.mm.ui.fk.a(textView);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        android.view.View view3 = findViewById;
                        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfShareDrawerUIC", "prepareSelfHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfShareDrawerUIC", "prepareSelfHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = t10Var.f135959e;
                if (baseFinderFeed2 != null && (ujVar = t10Var.f135958d) != null) {
                    ujVar.f133198q = new com.tencent.mm.plugin.finder.viewmodel.component.n10(t10Var, baseFinderFeed2);
                }
                com.tencent.mm.plugin.finder.view.uj ujVar3 = t10Var.f135958d;
                if (ujVar3 != null) {
                    ujVar3.f133199r = new com.tencent.mm.plugin.finder.viewmodel.component.j10(t10Var);
                }
                if (ujVar3 != null) {
                    ujVar3.f133200s = new com.tencent.mm.plugin.finder.viewmodel.component.i10(t10Var);
                }
                if (ujVar3 != null) {
                    ujVar3.f133201t = new com.tencent.mm.plugin.finder.viewmodel.component.k10(t10Var);
                }
                db5.t4 t4Var = t10Var.f135965n;
                if (ujVar3 != null) {
                    ujVar3.f133192k.f132793e = t4Var;
                }
                if (ujVar3 != null) {
                    ujVar3.f133193l.f132793e = t4Var;
                }
                if (ujVar3 != null) {
                    ujVar3.f133194m.f132793e = t4Var;
                }
                if (ujVar3 != null) {
                    ((com.tencent.mm.plugin.finder.view.e3) ((jz5.n) ujVar3.f133184c).getValue()).f131968r = new com.tencent.mm.plugin.finder.viewmodel.component.p00(t10Var);
                }
                com.tencent.mm.plugin.finder.view.uj ujVar4 = t10Var.f135958d;
                if (ujVar4 != null) {
                    db5.o4 o4Var = ujVar4.f133198q;
                    jz5.g gVar = ujVar4.f133185d;
                    if (o4Var != null) {
                        o4Var.onCreateMMMenu((db5.g4) ((jz5.n) gVar).getValue());
                    }
                    db5.g4 g4Var = (db5.g4) ((jz5.n) gVar).getValue();
                    com.tencent.mm.plugin.finder.view.oj ojVar = ujVar4.f133192k;
                    ojVar.f132792d = g4Var;
                    ojVar.notifyDataSetChanged();
                    db5.o4 o4Var2 = ujVar4.f133199r;
                    jz5.g gVar2 = ujVar4.f133186e;
                    if (o4Var2 != null) {
                        o4Var2.onCreateMMMenu((db5.g4) ((jz5.n) gVar2).getValue());
                    }
                    db5.g4 g4Var2 = (db5.g4) ((jz5.n) gVar2).getValue();
                    com.tencent.mm.plugin.finder.view.oj ojVar2 = ujVar4.f133193l;
                    ojVar2.f132792d = g4Var2;
                    ojVar2.notifyDataSetChanged();
                    db5.o4 o4Var3 = ujVar4.f133200s;
                    jz5.g gVar3 = ujVar4.f133187f;
                    if (o4Var3 != null) {
                        o4Var3.onCreateMMMenu((db5.g4) ((jz5.n) gVar3).getValue());
                    }
                    db5.g4 g4Var3 = (db5.g4) ((jz5.n) gVar3).getValue();
                    com.tencent.mm.plugin.finder.view.oj ojVar3 = ujVar4.f133194m;
                    ojVar3.f132792d = g4Var3;
                    ojVar3.notifyDataSetChanged();
                    ((com.tencent.mm.plugin.finder.view.e3) ((jz5.n) ujVar4.f133184c).getValue()).i();
                }
                com.tencent.mm.plugin.finder.view.uj ujVar5 = t10Var.f135958d;
                it.setTag(java.lang.Boolean.TRUE);
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ni(holder, item.getItemId(), item.getFeedObject());
                if (ujVar5 != null) {
                    ((com.tencent.mm.plugin.finder.view.e3) ((jz5.n) ujVar5.f133184c).getValue()).f131968r = new com.tencent.mm.plugin.finder.convert.hb(it, holder, this, item, i17);
                }
                com.tencent.mm.plugin.finder.report.x3.f125433b = c01.id.c();
                obj = "Check failed.";
            } else {
                r45.c03 tips_info2 = item.getFeedObject().getFeedObject().getTips_info();
                if (tips_info2 == null || (str = tips_info2.getString(0)) == null) {
                    str = "";
                }
                boolean z18 = !com.tencent.mm.sdk.platformtools.t8.K0(str) && item.getFeedObject().isNotShare();
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 0, z18);
                if (z18) {
                    obj = "Check failed.";
                    android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f489096b95, (android.view.ViewGroup) null);
                    android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.g2u);
                    if (textView2 != null) {
                        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
                        textView2.setText(str);
                    }
                    k0Var.s(inflate, true);
                } else {
                    obj = "Check failed.";
                }
                com.tencent.mm.plugin.finder.report.x3.f125434c = new org.json.JSONObject();
                k0Var.f211872n = contract.w4(item, k0Var, i17);
                k0Var.f211874o = contract.A0(item, k0Var, holder);
                k0Var.f211881s = contract.D1(item, i17, holder, lbVar);
                k0Var.f211884v = contract.D1(item, i17, holder, lbVar);
                k0Var.f211876p = contract.p1(item, k0Var);
                k0Var.f211885w = contract.D1(item, i17, holder, lbVar);
                k0Var.f211886x = contract.K0(k0Var, item, i17, holder);
                k0Var.f211892z = contract.z6(item, k0Var);
                it.setTag(java.lang.Boolean.TRUE);
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ni(holder, item.getItemId(), item.getFeedObject());
                k0Var.f211854d = new com.tencent.mm.plugin.finder.convert.ib(it, holder, this, item, i17);
                k0Var.f211856e = com.tencent.mm.plugin.finder.convert.jb.f103739a;
                k0Var.C = new com.tencent.mm.plugin.finder.convert.kb(this, item, i17);
                k0Var.v();
            }
            pf5.z zVar3 = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException(obj.toString());
            }
            androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC finderDescPanelUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) zVar3.a(appCompatActivity).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.class);
            if (finderDescPanelUIC != null) {
                finderDescPanelUIC.Y6();
            }
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar3.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            if (V6 != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("share_menu", "view_clk", kz5.c1.k(new jz5.l("feed_id", pm0.v.u(item.getItemId())), new jz5.l("finder_context_id", V6.getString(1)), new jz5.l("finder_tab_context_id", V6.getString(2)), new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5))), new jz5.l("session_buffer", r26.i0.t(((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(item.getItemId(), item.w(), V6.getInteger(5)), ",", ";", false)), new jz5.l("finder_username", item.getFeedObject().getUserName()), new jz5.l("extra_info", V6.getString(11))), 1, false);
            }
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "[onClickToShare] feedId:" + pm0.v.u(item.getItemId()) + " isSelf:" + d17);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x016e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0296  */
    @Override // com.tencent.mm.plugin.finder.convert.w7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(in5.s0 r43, com.tencent.mm.plugin.finder.model.BaseFinderFeed r44, int r45, int r46, boolean r47, java.util.List r48) {
        /*
            Method dump skipped, instructions count: 3940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.qe.o(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed, int, int, boolean, java.util.List):void");
    }

    public void o0(in5.s0 holder, int i17, int i18, int i19) {
        sc2.a8 a8Var;
        android.view.View view;
        java.util.Iterator it;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) holder.f293125i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onDeepEnjoyMedia] ");
        ya2.b2 contact = baseFinderFeed.getContact();
        sb6.append(contact != null ? contact.w0() : null);
        sb6.append(" position=");
        sb6.append(i17);
        sb6.append(" type=");
        sb6.append(i18);
        sb6.append(" source=");
        sb6.append(i19);
        sb6.append(" feedId=");
        sb6.append(pm0.v.u(baseFinderFeed.getItemId()));
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", sb6.toString());
        if (i19 == 0) {
            D(holder, baseFinderFeed);
            cu2.u.f222442b.put(java.lang.Long.valueOf(baseFinderFeed.getItemId()), java.lang.Boolean.TRUE);
        }
        if (this.f104358f.d0()) {
            return;
        }
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        boolean z17 = context instanceof androidx.appcompat.app.AppCompatActivity;
        if (!z17) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
        sc2.a8 a8Var2 = (sc2.a8) zVar.a(appCompatActivity).a(sc2.a8.class);
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        a8Var2.getClass();
        java.util.Iterator it6 = ((java.util.Map) ((jz5.n) a8Var2.f406211g).getValue()).entrySet().iterator();
        while (it6.hasNext()) {
            android.view.ViewGroup a17 = ((ad2.j) ((java.util.Map.Entry) it6.next()).getValue()).a(itemView);
            if (a17 != null) {
                int childCount = a17.getChildCount();
                int i27 = 0;
                while (i27 < childCount) {
                    java.lang.Object tag = a17.getChildAt(i27).getTag(a8Var2.f406212h);
                    ad2.h hVar = tag instanceof ad2.h ? (ad2.h) tag : null;
                    if (hVar != null) {
                        in5.s0 s0Var = hVar.f3148i;
                        a8Var = a8Var2;
                        android.view.View view2 = hVar.f3143d;
                        view = itemView;
                        xc2.p0 p0Var = hVar.f3147h;
                        if (s0Var != null && view2 != null && p0Var != null) {
                            it = it6;
                            hVar.B(s0Var, view2, p0Var, hVar.f3144e);
                            i27++;
                            a8Var2 = a8Var;
                            itemView = view;
                            it6 = it;
                        }
                    } else {
                        a8Var = a8Var2;
                        view = itemView;
                    }
                    it = it6;
                    i27++;
                    a8Var2 = a8Var;
                    itemView = view;
                    it6 = it;
                }
            }
        }
        if (baseFinderFeed.getIsDeepEnjoy()) {
            return;
        }
        baseFinderFeed.e1(true);
        G(this, holder, baseFinderFeed, false, 4, null);
        H(holder, baseFinderFeed);
        k1(baseFinderFeed, holder);
        W0(holder);
        pf5.z zVar2 = pf5.z.f353948a;
        if (!z17) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sc2.a8 a8Var3 = (sc2.a8) zVar2.a(appCompatActivity).a(sc2.a8.class);
        android.view.View itemView2 = holder.itemView;
        kotlin.jvm.internal.o.f(itemView2, "itemView");
        a8Var3.getClass();
        java.util.Iterator it7 = ((java.util.Map) ((jz5.n) a8Var3.f406211g).getValue()).entrySet().iterator();
        while (it7.hasNext()) {
            android.view.ViewGroup a18 = ((ad2.j) ((java.util.Map.Entry) it7.next()).getValue()).a(itemView2);
            if (a18 != null) {
                int childCount2 = a18.getChildCount();
                for (int i28 = 0; i28 < childCount2; i28++) {
                    java.lang.Object tag2 = a18.getChildAt(i28).getTag(a8Var3.f406212h);
                    ad2.h hVar2 = tag2 instanceof ad2.h ? (ad2.h) tag2 : null;
                    if (hVar2 != null) {
                        in5.s0 s0Var2 = hVar2.f3148i;
                        android.view.View view3 = hVar2.f3143d;
                        xc2.p0 p0Var2 = hVar2.f3147h;
                        if (s0Var2 != null && view3 != null && p0Var2 != null) {
                            java.lang.String source = hVar2.f3144e;
                            kotlin.jvm.internal.o.g(source, "source");
                        }
                    }
                }
            }
        }
        pf5.z zVar3 = pf5.z.f353948a;
        if (!z17) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.h50 h50Var = (com.tencent.mm.plugin.finder.viewmodel.component.h50) zVar3.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.h50.class);
        h50Var.getClass();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) holder.f293125i;
        android.view.View p17 = holder.p(com.tencent.mm.R.id.msw);
        if (p17 != null) {
            h50Var.O6(p17, baseFinderFeed2.getItemId(), 1);
        }
    }

    public final void o1(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var) {
        android.view.View b17;
        boolean booleanValue = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.L0().r()).booleanValue();
        if (booleanValue) {
            bw2.o oVar = bw2.o.f24869a;
            b17 = ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f24872d).getValue()).invoke(s0Var)).b();
        } else {
            b17 = s0Var.p(com.tencent.mm.R.id.f484487ee5);
        }
        r45.ur2 publisher_info = baseFinderFeed.getFeedObject().getFeedObject().getPublisher_info();
        if (publisher_info == null) {
            if (b17 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            android.view.View view = b17;
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (b17 == null && booleanValue) {
            bw2.o oVar2 = bw2.o.f24869a;
            b17 = ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f24872d).getValue()).invoke(s0Var)).a();
        }
        if (b17 != null) {
            com.tencent.mm.plugin.finder.feed.RoundLinearLayout roundLinearLayout = (com.tencent.mm.plugin.finder.feed.RoundLinearLayout) b17.findViewById(com.tencent.mm.R.id.f486357l01);
            if (roundLinearLayout != null) {
                roundLinearLayout.setRadius(0.1f);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            android.view.View view2 = b17;
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = (android.widget.TextView) b17.findViewById(com.tencent.mm.R.id.kzz);
            if (textView != null) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = b17.getContext();
                java.lang.String string = b17.getContext().getResources().getString(com.tencent.mm.R.string.f_b, publisher_info.getString(0));
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string));
                textView.setTextSize(0, s0Var.f293121e.getResources().getDimension(com.tencent.mm.R.dimen.f479628b3));
            }
            android.widget.ImageView imageView = (android.widget.ImageView) b17.findViewById(com.tencent.mm.R.id.f486356l00);
            if (imageView != null) {
                mn2.g1 g1Var = mn2.g1.f329975a;
                g1Var.i().c(new mn2.n(publisher_info.getString(1), null, 2, null), imageView, g1Var.h(mn2.f1.f329960n));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x09ef  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0aa4  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x077c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x074a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x06e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0539  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p0(in5.s0 r39) {
        /*
            Method dump skipped, instructions count: 2744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.qe.p0(in5.s0):void");
    }

    public final void p1(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        if (baseFinderFeed.getFeedObject().isPrivate() && hc2.b0.i(baseFinderFeed)) {
            android.view.View p17 = s0Var.p(com.tencent.mm.R.id.f484354e03);
            if (p17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPrivateIcon", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPrivateIcon", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p18 = s0Var.p(com.tencent.mm.R.id.f484353e02);
            if (p18 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPrivateIcon", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPrivateIcon", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View p19 = s0Var.p(com.tencent.mm.R.id.f484354e03);
        if (p19 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPrivateIcon", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPrivateIcon", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p27 = s0Var.p(com.tencent.mm.R.id.f484353e02);
        if (p27 == null) {
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPrivateIcon", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPrivateIcon", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void q0(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
    }

    public final void q1(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var) {
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) s0Var.p(com.tencent.mm.R.id.ran);
        if (mMNeat7extView != null) {
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            int i17 = nyVar != null ? nyVar.f135380n : 0;
            r45.dm2 object_extend = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
            boolean z17 = ((object_extend != null ? object_extend.getLong(30) : 0L) & 512) == 512;
            if (i17 != 1 && i17 != 120 && !z17) {
                mMNeat7extView.setVisibility(8);
                return;
            }
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            jz5.g gVar = com.tencent.mm.plugin.finder.storage.t70.Jb;
            ((lb2.j) ((jz5.n) gVar).getValue()).l();
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() != 1 && !hc2.t.d(context) && !z17) {
                mMNeat7extView.setVisibility(8);
                return;
            }
            mMNeat7extView.b(com.tencent.mm.plugin.finder.assist.w2.k(context, baseFinderFeed.getFeedObject().getCreateTime() * 1000));
            mMNeat7extView.setVisibility(0);
            mMNeat7extView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.ed(this, s0Var, baseFinderFeed));
        }
    }

    public final void r(in5.s0 holder) {
        jz5.g gVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.Iterator it = kz5.c0.i(java.lang.Integer.valueOf(com.tencent.mm.R.id.h6t), java.lang.Integer.valueOf(com.tencent.mm.R.id.h6q), java.lang.Integer.valueOf(com.tencent.mm.R.id.h6k), java.lang.Integer.valueOf(com.tencent.mm.R.id.h6c)).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            gVar = this.I;
            if (!hasNext) {
                break;
            }
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.p(((java.lang.Number) it.next()).intValue());
            if (frameLayout != null) {
                int round = java.lang.Math.round(((java.lang.Number) ((jz5.n) gVar).getValue()).floatValue() * 10);
                frameLayout.setPadding(round, 0, round, 0);
            }
        }
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) holder.p(com.tencent.mm.R.id.h6c);
        int round2 = java.lang.Math.round(((java.lang.Number) ((jz5.n) gVar).getValue()).floatValue() * 16) - (frameLayout2 != null ? frameLayout2.getPaddingEnd() : 0);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.f486682m44);
        if (p17 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = p17.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(round2);
            p17.setLayoutParams(marginLayoutParams);
        }
    }

    public void r0(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
    }

    public final void r1(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        com.tencent.mm.plugin.finder.view.FinderCountDownTextView finderCountDownTextView;
        android.view.View findViewById;
        android.view.View findViewById2;
        android.view.View findViewById3;
        java.lang.String string;
        r45.kr2 kr2Var;
        android.view.View view;
        android.view.View view2;
        r45.lr2 lr2Var;
        r45.lr2 lr2Var2;
        r45.lr2 lr2Var3;
        com.tencent.mm.plugin.finder.feed.k8 k8Var = this.f104358f;
        ac2.t tVar = k8Var instanceof ac2.t ? (ac2.t) k8Var : null;
        if (!(tVar != null ? tVar.f3056J : false)) {
            J(s0Var);
            return;
        }
        if (!baseFinderFeed.getFeedObject().isNativeDramaPromotionFeed()) {
            J(s0Var);
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.tty);
        if (viewGroup == null) {
            android.view.ViewStub viewStub = (android.view.ViewStub) s0Var.p(com.tencent.mm.R.id.f484945tu0);
            if (viewStub != null) {
                try {
                    android.view.View inflate = viewStub.inflate();
                    if (inflate instanceof android.view.ViewGroup) {
                        viewGroup = (android.view.ViewGroup) inflate;
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FeedFullConvert", th6, "[NewPromotionUnlockStyle] inflate capsule stub failed in convert", new java.lang.Object[0]);
                }
            }
            viewGroup = null;
        }
        if (viewGroup == null || (finderCountDownTextView = (com.tencent.mm.plugin.finder.view.FinderCountDownTextView) viewGroup.findViewById(com.tencent.mm.R.id.f484946tu1)) == null || (findViewById = viewGroup.findViewById(com.tencent.mm.R.id.ttz)) == null || (findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.f484944e9)) == null || (findViewById3 = viewGroup.findViewById(com.tencent.mm.R.id.e_)) == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        android.content.Context context = s0Var.f293121e;
        if (layoutParams != null && (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = com.tencent.mm.ui.bl.h(context);
        }
        r45.dm2 object_extend = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
        r45.kr2 kr2Var2 = object_extend != null ? (r45.kr2) object_extend.getCustom(53) : null;
        int integer = (kr2Var2 == null || (lr2Var3 = (r45.lr2) kr2Var2.getCustom(0)) == null) ? 0 : lr2Var3.getInteger(0);
        viewGroup.setVisibility(0);
        if (kr2Var2 == null || (lr2Var2 = (r45.lr2) kr2Var2.getCustom(0)) == null || (string = lr2Var2.getString(3)) == null) {
            string = context.getResources().getString(com.tencent.mm.R.string.oww);
        }
        finderCountDownTextView.setWording(string);
        finderCountDownTextView.setFinishWordingResId(com.tencent.mm.R.string.p3s);
        finderCountDownTextView.setKeepFinish(baseFinderFeed.getNativeDramaUnlockCountDownFinish());
        if (integer > 0) {
            finderCountDownTextView.setTotalCountDownMs(integer * 1000);
        }
        if (baseFinderFeed.getNativeDramaUnlockCountDownFinish()) {
            finderCountDownTextView.setVisibility(0);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            kr2Var = kr2Var2;
            view = findViewById3;
            view2 = findViewById2;
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPromotionUnlockCountDownCapsule", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPromotionUnlockCountDownCapsule", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            kr2Var = kr2Var2;
            view = findViewById3;
            view2 = findViewById2;
            finderCountDownTextView.setVisibility(8);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPromotionUnlockCountDownCapsule", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPromotionUnlockCountDownCapsule", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        finderCountDownTextView.c();
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (kr2Var == null || (lr2Var = (r45.lr2) kr2Var.getCustom(0)) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderJumpInfo) lr2Var.getCustom(4);
        if (finderJumpInfo != null) {
            com.tencent.mm.plugin.finder.convert.gd gdVar = new com.tencent.mm.plugin.finder.convert.gd(baseFinderFeed, s0Var, finderJumpInfo);
            view2.setOnClickListener(gdVar);
            view.setOnClickListener(gdVar);
        } else {
            view2.setOnClickListener(null);
            view.setOnClickListener(null);
        }
        finderCountDownTextView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.fd(baseFinderFeed, this));
    }

    public final void s(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.r2o);
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        sc2.m3.A.d(holder, "adjustRedPacketCover");
    }

    public boolean s0(in5.s0 holder, android.view.View view, com.tencent.mm.protocal.protobuf.FinderObject finderObj, android.view.MotionEvent motionEvent, android.content.Intent intent) {
        int i17;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        v0(holder, com.tencent.mm.plugin.finder.convert.u8.f104685d);
        this.f104851e.e(holder, view, intent);
        pf5.u uVar = pf5.u.f353936a;
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC finderDescPanelUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) uVar.b(context).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.class);
        finderDescPanelUIC.getClass();
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127877p8).getValue()).r()).booleanValue()) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = finderDescPanelUIC.f133517f;
            if ((baseFinderFeed != null ? baseFinderFeed.getCurrentCarouselItemType() : null) == so2.c.f410284n) {
                finderDescPanelUIC.b7(holder);
            }
        }
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
        if (finderVideoLayout != null) {
            finderVideoLayout.setRequestNotPlay(false);
        }
        t(holder);
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) holder.p(com.tencent.mm.R.id.ghd);
        if (finderFullSeekBarLayout != null) {
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout.I(finderFullSeekBarLayout, null, false, 3, null);
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            java.lang.Number valueOf = motionEvent != null ? java.lang.Float.valueOf(motionEvent.getX()) : 0;
            java.lang.Number valueOf2 = motionEvent != null ? java.lang.Float.valueOf(motionEvent.getY()) : 0;
            float f17 = 100;
            int floatValue = (int) ((valueOf.floatValue() / context.getResources().getDisplayMetrics().widthPixels) * f17);
            int floatValue2 = (int) ((valueOf2.floatValue() / context.getResources().getDisplayMetrics().heightPixels) * f17);
            if (finderFullSeekBarLayout.isSeekMode) {
                com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC finderDescPanelUIC2 = (com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) uVar.b(context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.class);
                if (finderDescPanelUIC2 != null) {
                    finderDescPanelUIC2.Y6();
                }
                holder.p(com.tencent.mm.R.id.jdk).setContentDescription(context.getResources().getString(com.tencent.mm.R.string.mgh));
                i17 = 1;
            } else {
                com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC finderDescPanelUIC3 = (com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) uVar.b(context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.class);
                if (finderDescPanelUIC3 != null) {
                    finderDescPanelUIC3.c7(holder);
                }
                holder.p(com.tencent.mm.R.id.jdk).setContentDescription(context.getResources().getString(com.tencent.mm.R.string.mgg));
                i17 = 2;
            }
            com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedid", pm0.v.u(finderObj.getId()));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(floatValue);
            sb6.append('_');
            sb6.append(floatValue2);
            jSONObject.put("push_area", sb6.toString());
            jSONObject.put("action_type", i17);
            com.tencent.mm.plugin.finder.report.b6.d(b6Var, V6, "video_card", 1, jSONObject, false, null, 48, null);
        }
        return false;
    }

    public final void s1(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        android.view.View view;
        int i17;
        int i18;
        int i19;
        r45.le0 le0Var;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        android.widget.TextView textView;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.ljb);
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.s1w);
        r45.le0 c17 = com.tencent.mm.plugin.finder.feed.model.i1.f107930a.c(baseFinderFeed.getItemId(), true);
        if (!this.f104358f.d0()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshRead", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshRead", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshRead", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshRead", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        jz5.g gVar = com.tencent.mm.plugin.finder.storage.t70.C9;
        boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) gVar).getValue()).r()).booleanValue();
        ((lb2.j) ((jz5.n) gVar).getValue()).l();
        android.view.View view2 = booleanValue ? p18 : p17;
        if (booleanValue) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            view = view2;
            yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshRead", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshRead", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            i17 = 0;
            yj0.a.d(p18, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshRead", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshRead", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(com.tencent.mm.R.id.s1t);
            android.widget.TextView textView2 = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.s1v);
            if (baseFinderFeed.getFeedObject().isOnlySelfSee()) {
                weImageView.setVisibility(0);
                weImageView.s(com.tencent.mm.R.raw.icons_outlined_lock, com.tencent.mm.R.color.f479254u6);
                textView2.setText(context.getResources().getString(com.tencent.mm.R.string.mrt));
                i19 = 1;
                le0Var = c17;
                i18 = 3;
            } else {
                if (c17 != null && c17.getInteger(3) == 1) {
                    weImageView.setVisibility(0);
                    weImageView.s(com.tencent.mm.R.raw.icons_outlined_exclamation_mark_circle, com.tencent.mm.R.color.Red_100);
                    textView2.setText(context.getResources().getString(com.tencent.mm.R.string.mrs));
                } else {
                    if (!(((java.lang.Number) t70Var.w0().r()).intValue() == 1) || (feedObject2 = bu2.j.f24534a.h(baseFinderFeed.getItemId())) == null) {
                        feedObject2 = baseFinderFeed.getFeedObject();
                    }
                    java.lang.String i27 = com.tencent.mm.plugin.finder.assist.w2.i(feedObject2.getReadCount());
                    weImageView.setVisibility(8);
                    textView2.setText(context.getResources().getString(com.tencent.mm.R.string.mrr, i27));
                }
                i19 = 1;
                i18 = 3;
                le0Var = c17;
            }
        } else {
            view = view2;
            i17 = 0;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p18, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshRead", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            i18 = 3;
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshRead", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            i19 = 1;
            yj0.a.d(p17, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshRead", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshRead", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(com.tencent.mm.R.id.h6m);
            android.widget.TextView textView3 = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.lja);
            le0Var = c17;
            if (le0Var != null && le0Var.getInteger(3) == 1) {
                weImageView2.setClearColorFilter(true);
                weImageView2.setImageResource(com.tencent.mm.R.raw.icons_outlined_eyes_abnormal);
            } else {
                weImageView2.s(com.tencent.mm.R.raw.icons_outlined_eyes_on, com.tencent.mm.R.color.f479254u6);
            }
            if (!(((java.lang.Number) t70Var.w0().r()).intValue() == 1) || (feedObject = bu2.j.f24534a.h(baseFinderFeed.getItemId())) == null) {
                feedObject = baseFinderFeed.getFeedObject();
            }
            java.lang.String i28 = com.tencent.mm.plugin.finder.assist.w2.i(feedObject.getReadCount());
            if (textView3 != null) {
                com.tencent.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
                textView3.setText(i28);
            }
        }
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Se).getValue()).r()).booleanValue() && (textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.rrf)) != null) {
            textView.setText(context.getResources().getString(com.tencent.mm.R.string.ded));
        }
        jz5.l[] lVarArr = new jz5.l[7];
        lVarArr[i17] = new jz5.l("view_id", "profile_feed_vv");
        lVarArr[i19] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
        lVarArr[2] = new jz5.l("finder_context_id", V6 != null ? V6.getString(i19) : null);
        lVarArr[i18] = new jz5.l("behaviour_session_id", V6 != null ? V6.getString(i17) : null);
        lVarArr[4] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
        lVarArr[5] = new jz5.l("feedid", pm0.v.u(baseFinderFeed.getItemId()));
        lVarArr[6] = new jz5.l("eye_state", java.lang.Integer.valueOf((le0Var == null || le0Var.getInteger(i18) != i19) ? i17 : i19));
        java.util.Map k17 = kz5.c1.k(lVarArr);
        android.view.View view3 = view;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_exp", view3, k17, 25496);
        view3.setOnClickListener(new com.tencent.mm.plugin.finder.convert.hd(view3, k17, baseFinderFeed, s0Var));
    }

    public void t(in5.s0 holder) {
        android.view.View p17;
        android.view.View findViewById;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View p18 = holder.p(com.tencent.mm.R.id.f484869fs3);
        if (p18 == null || (p17 = holder.p(com.tencent.mm.R.id.g1y)) == null || (findViewById = p17.findViewById(com.tencent.mm.R.id.kp7)) == null) {
            return;
        }
        findViewById.post(new com.tencent.mm.plugin.finder.convert.x8(holder, p18, p17, findViewById, this));
    }

    public void t0(in5.s0 holder, android.view.View view, android.view.MotionEvent e17, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) holder.f293125i;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
        boolean z17 = false;
        if (finderVideoLayout != null && finderVideoLayout.D()) {
            z17 = true;
        }
        if (!z17 && baseFinderFeed.getFeedObject().isPostFinish()) {
            com.tencent.mm.plugin.finder.feed.k8 k8Var = this.f104358f;
            if (k8Var.d0() || k8Var.z5() || baseFinderFeed.getIsPreview() || !hc2.o0.c(baseFinderFeed.getFeedObject().getFeedObject())) {
                return;
            }
            if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.q0().r()).intValue() == 1) {
                N(holder, e17, 3);
                v0(holder, com.tencent.mm.plugin.finder.convert.u8.f104687f);
                return;
            }
            nv2.h1 h1Var = nv2.n1.f340550g;
            jz5.l k17 = nv2.n1.f340551h.k(baseFinderFeed.getFeedObject().getFeedObject());
            boolean booleanValue = ((java.lang.Boolean) k17.f302833d).booleanValue();
            boolean booleanValue2 = ((java.lang.Boolean) k17.f302834e).booleanValue();
            if (booleanValue && booleanValue2) {
                return;
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("feed_like_double_tap", view, null, 24617);
            if (booleanValue) {
                l0(holder, -1, false, e17, i17);
                v0(holder, com.tencent.mm.plugin.finder.convert.u8.f104687f);
            } else {
                l0(holder, 2, false, e17, i17);
                v0(holder, com.tencent.mm.plugin.finder.convert.u8.f104687f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0bdd  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0c0e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0c11  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0c2b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0a28  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0a05  */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r47v0, types: [com.tencent.mm.plugin.finder.convert.w7, com.tencent.mm.plugin.finder.convert.qe] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t1(com.tencent.mm.plugin.finder.model.BaseFinderFeed r48, in5.s0 r49, boolean r50, int r51) {
        /*
            Method dump skipped, instructions count: 3137
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.qe.t1(com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0, boolean, int):void");
    }

    public final void u(in5.s0 holder) {
        android.view.View findViewById;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.g1y);
        if (p17 == null) {
            android.content.Context context = holder.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.viewmodel.component.l70) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.l70.class)).O6(holder);
            return;
        }
        android.view.View findViewById2 = p17.findViewById(com.tencent.mm.R.id.kp7);
        com.tencent.mm.plugin.finder.feed.k8 k8Var = this.f104358f;
        if (findViewById2 == null) {
            com.tencent.mm.ui.MMActivity activity = k8Var.getF122643d();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.finder.viewmodel.component.l70) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.l70.class)).O6(holder);
            return;
        }
        com.tencent.mm.ui.MMActivity activity2 = k8Var.getF122643d();
        kotlin.jvm.internal.o.g(activity2, "activity");
        ((com.tencent.mm.plugin.finder.viewmodel.component.l70) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.l70.class)).getClass();
        android.view.View view = holder.itemView;
        if (view == null || (findViewById = view.findViewById(com.tencent.mm.R.id.tvl)) == null) {
            return;
        }
        int[] iArr = new int[2];
        findViewById2.getLocationInWindow(iArr);
        int dimensionPixelSize = (com.tencent.mm.ui.bh.a(findViewById.getContext()).f197136b - iArr[1]) + findViewById.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs);
        if (dimensionPixelSize > 0) {
            findViewById.getLayoutParams();
            com.tencent.mm.ui.kk.d(findViewById, dimensionPixelSize);
        }
    }

    public void u0(in5.s0 holder, android.view.View view, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        boolean r17 = hc2.o0.r(item.getFeedObject().getFeedObject());
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "[onMediaLongClick] feedId=" + pm0.v.u(item.getItemId()) + ",isDisableSpeedControl=" + r17);
        if (C(item)) {
            if ((item.h() == 4 || item.h() == 2) && !item.getIsPreview()) {
                pf5.u uVar = pf5.u.f353936a;
                android.content.Context context = holder.f293121e;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC) uVar.b(context).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class);
                if (finderBulletUIC != null) {
                    finderBulletUIC.R6();
                }
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.J3).getValue()).r()).intValue() == 1 && !r17) {
                    if (item.h() == 4 || item.h() == 2) {
                        androidx.lifecycle.c1 a17 = uVar.b(context).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class);
                        kotlin.jvm.internal.o.f(a17, "get(...)");
                        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC) a17).c7(holder, motionEvent, -1);
                        if (item.h() == 4) {
                            com.tencent.mm.plugin.finder.viewmodel.component.i60 i60Var = (com.tencent.mm.plugin.finder.viewmodel.component.i60) uVar.b(context).a(com.tencent.mm.plugin.finder.viewmodel.component.i60.class);
                            i60Var.getClass();
                            java.lang.System.currentTimeMillis();
                            i60Var.f134703e = true;
                        }
                        v0(holder, com.tencent.mm.plugin.finder.convert.u8.f104688g);
                        return;
                    }
                    return;
                }
                if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Aa).getValue()).r()).intValue() == 1) {
                    com.tencent.mm.plugin.finder.feed.k8 k8Var = this.f104358f;
                    if (!k8Var.d0()) {
                        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
                        k0Var.f211872n = k8Var.Y(item, k0Var);
                        k0Var.f211881s = k8Var.c4(item, holder);
                        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ni(holder, item.getItemId(), item.getFeedObject());
                        db5.g4 g4Var = new db5.g4(context);
                        k8Var.Y(item, k0Var).onCreateMMMenu(g4Var);
                        if (!com.tencent.mm.sdk.platformtools.t8.L0(g4Var.f228344d)) {
                            view.performHapticFeedback(0, 2);
                            k0Var.v();
                        }
                        v0(holder, com.tencent.mm.plugin.finder.convert.u8.f104686e);
                    }
                }
                view.performHapticFeedback(0, 2);
                n0(holder, item, view, 2);
                v0(holder, com.tencent.mm.plugin.finder.convert.u8.f104686e);
            }
        }
    }

    public final void u1(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var, boolean z17, java.lang.String tips) {
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.gac);
        if (z17 && p17.getVisibility() == 0) {
            ya2.g gVar = ya2.h.f460484a;
            java.lang.String str = baseFinderFeed.getFeedObject().field_username;
            r45.xk bizInfo = baseFinderFeed.getFeedObject().getBizInfo();
            if (ya2.g.h(gVar, str, bizInfo != null ? bizInfo.getString(0) : null, false, false, 12, null)) {
                return;
            }
            V(s0Var).setVisibility(8);
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.view.rm rmVar = new com.tencent.mm.plugin.finder.view.rm(context, null);
            rmVar.f132974m = 5000L;
            kotlin.jvm.internal.o.g(tips, "tips");
            rmVar.f132968g.setText(tips);
            rmVar.f132967f = true;
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479672c9);
            android.view.View view = rmVar.f132970i;
            view.setPadding(dimensionPixelOffset, view.getPaddingTop(), dimensionPixelOffset, view.getPaddingBottom());
            rmVar.f132972k = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
            rmVar.a(0, context.getResources().getDimension(com.tencent.mm.R.dimen.f479850gz));
            rmVar.c(p17);
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar != null) {
                r45.qt2 V6 = nyVar.V6();
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(rmVar.getContentView(), "follow_prompt_bubble");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(rmVar.getContentView(), 40, 25496);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(rmVar.getContentView(), kz5.c1.k(new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5))), new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getItemId()))));
            }
            rmVar.b();
        }
    }

    public final void v(in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.a_x);
        boolean[] zArr = {false};
        p17.setOnTouchListener(new com.tencent.mm.plugin.finder.convert.y8(zArr));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(p17, "finder_feed_like");
        p17.setOnClickListener(new com.tencent.mm.plugin.finder.convert.z8(zArr, holder, this, i17, p17));
        p17.setHapticFeedbackEnabled(false);
    }

    public void v0(in5.s0 holder, com.tencent.mm.plugin.finder.convert.u8 event) {
        android.view.View view;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.plugin.finder.convert.u8 u8Var = com.tencent.mm.plugin.finder.convert.u8.f104685d;
        android.content.Context context = holder.f293121e;
        if (event == u8Var || event == com.tencent.mm.plugin.finder.convert.u8.f104686e) {
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.viewmodel.component.o00) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.o00.class)).P6();
        }
        if (event == com.tencent.mm.plugin.finder.convert.u8.f104688g) {
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            qt2.h0 h0Var = (qt2.h0) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).a(qt2.h0.class);
            boolean z17 = false;
            if (h0Var != null && (view = h0Var.f366588e) != null && view.getVisibility() == 0) {
                z17 = true;
            }
            if (z17) {
                androidx.recyclerview.widget.RecyclerView o17 = holder.o();
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = o17 != null ? o17.getLayoutManager() : null;
                com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
                if (finderLinearLayoutManager != null) {
                    finderLinearLayoutManager.C = true;
                }
                androidx.recyclerview.widget.RecyclerView o18 = holder.o();
                if (o18 != null) {
                    o18.i(new com.tencent.mm.plugin.finder.convert.vb(holder));
                }
            }
        }
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar3 = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        qt2.h0 h0Var2 = (qt2.h0) zVar3.a((androidx.appcompat.app.AppCompatActivity) context).a(qt2.h0.class);
        if (h0Var2 != null) {
            h0Var2.a7();
        }
    }

    public void v1(com.tencent.mm.plugin.finder.model.BaseFinderFeed item, in5.s0 holder) {
        android.view.View b17;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        boolean j17 = item.j(context);
        java.lang.String D = j17 ? item.D(context) : item.getFeedObject().getFeedObject().getRecommendReason();
        boolean booleanValue = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.L0().r()).booleanValue();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        if (booleanValue) {
            bw2.o oVar = bw2.o.f24869a;
            b17 = ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f24878j).getValue()).invoke(holder)).b();
        } else {
            b17 = holder.p(com.tencent.mm.R.id.lo6);
        }
        h0Var.f310123d = b17;
        int recommendReasonType = item.getFeedObject().getFeedObject().getRecommendReasonType();
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "[refreshRecommendLayout] feedId:" + pm0.v.u(item.getItemId()) + " recommendReason:" + D + " recommendType:" + recommendReasonType + " isCoexist:" + g0(recommendReasonType) + " canShowFromSns:" + j17);
        if (this.P && (!com.tencent.mm.sdk.platformtools.t8.L0(nv2.n1.f340551h.h(item.getFeedObject().getFeedObject())) || g0(recommendReasonType))) {
            android.view.View view = (android.view.View) h0Var.f310123d;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            t(holder);
            return;
        }
        if ((D == null || D.length() == 0) || item.getFeedObject().isMemberFeed()) {
            android.view.View view2 = (android.view.View) h0Var.f310123d;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            t(holder);
        } else {
            if (h0Var.f310123d == null && booleanValue) {
                bw2.o oVar2 = bw2.o.f24869a;
                h0Var.f310123d = ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f24878j).getValue()).invoke(holder)).a();
            }
            if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127968ua).getValue()).r()).booleanValue()) {
                android.view.View view3 = (android.view.View) h0Var.f310123d;
                if (view3 != null) {
                    view3.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.f481495uk));
                }
            } else {
                android.view.View view4 = (android.view.View) h0Var.f310123d;
                if (view4 != null) {
                    view4.setBackground(null);
                }
            }
            android.view.View view5 = (android.view.View) h0Var.f310123d;
            if (view5 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            t(holder);
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.lo8);
            if (textView != null) {
                ym5.a1.h(textView, new com.tencent.mm.plugin.finder.convert.zd(item, holder, D));
            }
            if (f104355p0 > 0.0f && f104356x0 > 0) {
                android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.lo8);
                if (textView2 != null) {
                    textView2.setMaxWidth(f104356x0);
                }
                com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "set recommend reason tv max width " + f104356x0);
            }
            android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.lo8);
            if (textView3 != null) {
                android.content.res.Resources resources = context.getResources();
                int i17 = com.tencent.mm.R.color.f479254u6;
                textView3.setTextColor(resources.getColor(com.tencent.mm.R.color.f479254u6));
                com.tencent.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
                textView3.setTextSize(1, 14.0f);
                android.text.SpannableString Ui = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).Ui(context, D, (int) textView3.getTextSize(), 1);
                int color = context.getResources().getColor(com.tencent.mm.R.color.f479249u1);
                android.content.res.Resources resources2 = context.getResources();
                if (!((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
                    i17 = com.tencent.mm.R.color.f479263uf;
                }
                int color2 = resources2.getColor(i17);
                com.tencent.mm.pluginsdk.ui.span.z0[] z0VarArr = (com.tencent.mm.pluginsdk.ui.span.z0[]) Ui.getSpans(0, Ui.length(), com.tencent.mm.pluginsdk.ui.span.z0.class);
                if (z0VarArr != null) {
                    for (com.tencent.mm.pluginsdk.ui.span.z0 z0Var : z0VarArr) {
                        z0Var.setColor(color2, color);
                    }
                }
                i95.m c17 = i95.n0.c(zy2.s6.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                textView3.setText(zy2.s6.l6((zy2.s6) c17, Ui, (int) textView3.getTextSize(), false, null, 0, false, null, 124, null));
                textView3.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0());
            }
        }
        if (!j17 || (obj = h0Var.f310123d) == null) {
            return;
        }
        ((android.view.View) obj).postDelayed(new com.tencent.mm.plugin.finder.convert.rd(h0Var), 300L);
    }

    public void w(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, int i17, boolean z17) {
        int bottom;
        float e17;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.content.Context context = holder.f293121e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null) {
            return;
        }
        com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout = (com.tencent.mm.plugin.finder.view.FinderMediaLayout) holder.p(com.tencent.mm.R.id.fs6);
        java.util.LinkedList<r45.mb4> mediaList = item.getFeedObject().getMediaList();
        if (hc2.f1.f280320f) {
            bottom = com.tencent.mm.ui.bl.b(context).y;
        } else {
            android.view.ViewParent parent = holder.o().getParent();
            java.lang.Object parent2 = parent != null ? parent.getParent() : null;
            android.view.View view = parent2 instanceof android.view.View ? (android.view.View) parent2 : null;
            bottom = view != null ? view.getBottom() : context.getResources().getDisplayMetrics().heightPixels;
        }
        int i18 = bottom;
        android.util.Size resizedWidthHeight = item.getResizedWidthHeight();
        java.lang.Float valueOf = resizedWidthHeight != null ? java.lang.Float.valueOf(resizedWidthHeight.getWidth()) : null;
        java.lang.Float valueOf2 = resizedWidthHeight != null ? java.lang.Float.valueOf(resizedWidthHeight.getHeight()) : null;
        if (valueOf == null || valueOf2 == null || valueOf.floatValue() <= 0.0f || valueOf2.floatValue() <= 0.0f) {
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "calculateMediaLayoutParams " + item + ' ' + z17);
            e17 = z17 ? bu2.z.e(mediaList, "FinderFeedFullConvert", true) : bu2.z.f(mediaList, "FinderFeedFullConvert", false, 2, null);
        } else {
            e17 = valueOf2.floatValue() / valueOf.floatValue();
        }
        float f17 = e17;
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "calculateMediaLayoutParams, case:resizedWidthHeight, width: %s, height: %s, feedId: %s", valueOf, valueOf2, java.lang.Long.valueOf(item.getItemId()));
        ya2.b2 contact = item.getContact();
        java.lang.String w07 = contact != null ? contact.w0() : null;
        long itemId = item.getItemId();
        r45.dm2 object_extend = item.getFeedObject().getFeedObject().getObject_extend();
        jz5.l a17 = hc2.f1.a(activity, f17, i18, w07, itemId, object_extend != null ? object_extend.getInteger(13) : 0, 0, 32, null);
        android.view.ViewGroup.LayoutParams layoutParams = finderMediaLayout.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        java.lang.Object obj = a17.f302833d;
        layoutParams2.topMargin = ((java.lang.Number) ((jz5.o) obj).f302841d).intValue();
        layoutParams2.bottomMargin = ((java.lang.Number) ((jz5.o) obj).f302842e).intValue();
        layoutParams2.gravity = ((java.lang.Number) ((jz5.o) obj).f302843f).intValue();
        android.view.ViewGroup.LayoutParams layoutParams3 = finderMediaLayout.c().getLayoutParams();
        java.lang.Object obj2 = a17.f302834e;
        layoutParams3.width = ((java.lang.Number) ((jz5.l) obj2).f302833d).intValue();
        layoutParams3.height = ((java.lang.Number) ((jz5.l) obj2).f302834e).intValue();
        finderMediaLayout.requestLayout();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isLiveFeed:");
        sb6.append(zl2.q4.f473933a.C(item));
        sb6.append(" desc: ");
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = item.getFeedObject().getFeedObject().getObjectDesc();
        sb6.append(objectDesc != null ? objectDesc.getDescription() : null);
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", sb6.toString());
    }

    public void w0(com.tencent.mm.plugin.finder.model.BaseFinderFeed item, in5.s0 holder) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "[onPostFinished] feed=".concat(pm0.v.u(item.getItemId())));
        t(holder);
        h1(holder, item);
        z1(holder, item);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.f484904fw0);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "onPostFinished", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "onPostFinished", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p18 = holder.p(com.tencent.mm.R.id.gbz);
        if (p18 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "onPostFinished", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "onPostFinished", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) holder.p(com.tencent.mm.R.id.ghd);
        if (finderFullSeekBarLayout != null) {
            com.tencent.mm.plugin.finder.feed.k8 k8Var = this.f104358f;
            boolean d07 = k8Var.d0();
            cw2.f8 s17 = k8Var.getS();
            int i17 = com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout.f130546x0;
            finderFullSeekBarLayout.E(holder, d07, item, false, s17);
        }
        J1(holder, item, true, "postFinished");
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        m92.b j37 = g92.a.j3(g92.b.f269769e, xy2.c.e(context), false, 2, null);
        if ((((j37 != null ? j37.field_extFlag : 0) & 32) != 0) || hc2.s.f(item.getContact())) {
            return;
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_SHOW_SELF_FEED_LIKE_TIPS_TIMES_INT, 0) < 3) {
            com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout V2 = V(holder);
            V2.postDelayed(new com.tencent.mm.plugin.finder.convert.fe(V2), 300L);
        }
    }

    public final void w1(in5.s0 s0Var) {
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.oe oeVar = (com.tencent.mm.plugin.finder.viewmodel.component.oe) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.oe.class);
        if (oeVar != null) {
            oeVar.g7(s0Var);
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.edx);
        if (viewGroup == null) {
            return;
        }
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a((com.tencent.mm.ui.MMActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.je.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.je jeVar = (com.tencent.mm.plugin.finder.viewmodel.component.je) a17;
        com.tencent.mm.plugin.finder.feed.k8 k8Var = this.f104358f;
        android.content.Intent intent = k8Var.getF122643d().getIntent();
        if (intent != null ? intent.getBooleanExtra("key_enable_ringtone_bubble", false) : false) {
            viewGroup.setVisibility(8);
            android.content.Intent intent2 = k8Var.getF122643d().getIntent();
            java.lang.String stringExtra = intent2 != null ? intent2.getStringExtra("KEY_RINGTONE_REPORT_JSON") : null;
            if (stringExtra == null) {
                stringExtra = "";
            }
            jeVar.f134267g = stringExtra;
            jeVar.g7(s0Var);
        }
    }

    public void x0(long j17, in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.hih);
        if (!(findViewById instanceof android.view.View)) {
            findViewById = null;
        }
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "onScrollIdle", "(JLcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "onScrollIdle", "(JLcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.n1().r()).booleanValue()) {
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
            cw2.da videoView = finderVideoLayout != null ? finderVideoLayout.getVideoView() : null;
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView : null;
            if (finderThumbPlayerProxy == null || !finderThumbPlayerProxy.isPlaying()) {
                return;
            }
            kotlinx.coroutines.r2 r2Var = this.A;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            this.A = kotlinx.coroutines.l.d(v65.m.b(this.f104358f.getF122643d()), null, null, new com.tencent.mm.plugin.finder.convert.wb(this, holder, null), 3, null);
        }
    }

    public void x1(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    public boolean y(int i17) {
        return true;
    }

    public void y0(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) holder.f293125i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onTenSecEnjoy] ");
        ya2.b2 contact = baseFinderFeed.getContact();
        sb6.append(contact != null ? contact.w0() : null);
        sb6.append(" position=");
        sb6.append(holder.getAdapterPosition());
        sb6.append(" feedId=");
        sb6.append(pm0.v.u(baseFinderFeed.getItemId()));
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", sb6.toString());
        if (baseFinderFeed.getHasShowFollowAnim()) {
            return;
        }
        baseFinderFeed.q1(true);
        G(this, holder, baseFinderFeed, false, 4, null);
        k1(baseFinderFeed, holder);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y1(com.tencent.mm.plugin.finder.model.BaseFinderFeed r21, in5.s0 r22) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.qe.y1(com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0):void");
    }

    public final void z(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        cw2.ca seekBarLayout;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        if (item instanceof so2.u1) {
            if (((ey2.v2) pf5.u.f353936a.e(c61.l7.class).a(ey2.v2.class)).Q6(item.getItemId()) != null) {
                com.tencent.mars.xlog.Log.w("Finder.FeedFullConvert", "checkAutoSeek return for mp jump.");
                return;
            }
            r45.no2 playhistory_info = item.getFeedObject().getFeedObject().getPlayhistory_info();
            long integer = playhistory_info != null ? playhistory_info.getInteger(0) : 0;
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "checkAutoSeek " + integer);
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout2 = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
            if (finderVideoLayout2 != null) {
                cw2.bb bbVar = new cw2.bb(integer, 3, "getCommentDetail");
                int i17 = com.tencent.mm.plugin.finder.video.FinderVideoLayout.f130704x0;
                int i18 = finderVideoLayout2.F;
                cw2.b0 b0Var = finderVideoLayout2.E;
                b0Var.getClass();
                cw2.h8 g17 = b0Var.g();
                if (g17 != null && (seekBarLayout = (finderVideoLayout = b0Var.f223578a).getSeekBarLayout()) != null) {
                    if (seekBarLayout.l()) {
                        cw2.da videoView = finderVideoLayout.getVideoView();
                        long videoDurationMs = finderVideoLayout.getVideoDurationMs();
                        if (videoDurationMs == 0) {
                            videoDurationMs = g17.f223747c.f330002e.getLong(24);
                        }
                        long j17 = videoDurationMs;
                        cw2.bb c17 = b0Var.c(i18, null, bbVar, -1L);
                        long j18 = c17.f223606a;
                        if (j18 >= 0) {
                            pm0.v.X(new cw2.a0(b0Var, j18, c17.f223607b, 1.0f, !finderVideoLayout.G(), null));
                            long j19 = 1000;
                            int i19 = (int) (j18 / j19);
                            int i27 = (int) (j17 / j19);
                            seekBarLayout.p(i19, i27);
                            if (!g17.f223751g) {
                                g17 = null;
                            }
                            if (g17 != null) {
                                ec2.g videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior();
                                com.tencent.mm.plugin.finder.storage.FeedData feedData = g17.f223745a;
                                if (videoPlayBehavior != null) {
                                    long expectId = feedData.getExpectId();
                                    java.lang.String dupFlag = feedData.getDupFlag();
                                    mn2.g4 g4Var = g17.f223747c;
                                    ((ec2.h) videoPlayBehavior).d(expectId, dupFlag, g4Var.f330002e, i27, i19, g4Var);
                                }
                                b0Var.f223578a.R(feedData.getExpectId(), videoView != null ? videoView.getVideoMediaId() : null, i27, i19);
                            }
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i(b0Var.f223580c, "checkAutoSeek not seekBarLayout.canAutoSeek() " + bbVar + " param:null");
                    }
                }
            }
            ((so2.u1) item).f410632f = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z0(in5.s0 r22, int r23, int r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.qe.z0(in5.s0, int, int, boolean):void");
    }

    public final void z1(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        if (!this.f104358f.d0() || (!baseFinderFeed.getFeedObject().isPostFinish() && !baseFinderFeed.F0())) {
            android.view.View p17 = s0Var.p(com.tencent.mm.R.id.e0d);
            if (p17 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshSelfScene", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshSelfScene", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.tencent.mm.ui.widget.FlowTextMixView flowTextMixView = (com.tencent.mm.ui.widget.FlowTextMixView) s0Var.p(com.tencent.mm.R.id.e0d);
        if (flowTextMixView != null) {
            flowTextMixView.setMaxWidth(a06.d.b(s0Var.f293121e.getResources().getDisplayMetrics().widthPixels / 1.6f));
        }
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.e0d);
        if (p18 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshSelfScene", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshSelfScene", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p19 = s0Var.p(com.tencent.mm.R.id.ggt);
        if (p19 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshSelfScene", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshSelfScene", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p27 = s0Var.p(com.tencent.mm.R.id.f484351dz5);
        if (p27 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshSelfScene", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshSelfScene", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (baseFinderFeed.getFeedObject().getPrivate_flag() == 1) {
            android.view.View p28 = s0Var.p(com.tencent.mm.R.id.kij);
            if (p28 == null) {
                return;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p28, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshSelfScene", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshSelfScene", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View p29 = s0Var.p(com.tencent.mm.R.id.kij);
        if (p29 == null) {
            return;
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(p29, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshSelfScene", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p29.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(p29, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshSelfScene", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
