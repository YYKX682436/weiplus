package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class hs extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements kr2.k {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f216184d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f216185e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f216186f;

    /* renamed from: g, reason: collision with root package name */
    public pi0.n1 f216187g;

    /* renamed from: h, reason: collision with root package name */
    public kr2.j f216188h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lq f216189i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.FrameLayout f216190m;

    /* renamed from: n, reason: collision with root package name */
    public int f216191n;

    /* renamed from: o, reason: collision with root package name */
    public long f216192o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f216193p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f216194q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f216195r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f216196s;

    /* renamed from: t, reason: collision with root package name */
    public android.animation.ValueAnimator f216197t;

    /* renamed from: u, reason: collision with root package name */
    public android.animation.ValueAnimator f216198u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f216199v;

    /* renamed from: w, reason: collision with root package name */
    public long f216200w;

    /* renamed from: x, reason: collision with root package name */
    public long f216201x;

    /* renamed from: y, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.k0 f216202y;

    /* renamed from: z, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.oq f216183z = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.oq(null);
    public static final java.util.Set A = new java.util.LinkedHashSet();
    public static final java.util.concurrent.ConcurrentHashMap B = new java.util.concurrent.ConcurrentHashMap();
    public static final java.util.concurrent.ConcurrentHashMap C = new java.util.concurrent.ConcurrentHashMap();
    public static final java.util.concurrent.ConcurrentHashMap D = new java.util.concurrent.ConcurrentHashMap();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f216185e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f216186f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f216193p = true;
        this.f216194q = true;
        this.f216195r = true;
        this.f216196s = new java.util.concurrent.ConcurrentHashMap();
    }

    public static /* synthetic */ void D7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs hsVar, android.view.View view, boolean z17, java.lang.String str, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            str = "";
        }
        if ((i17 & 8) != 0) {
            z18 = false;
        }
        hsVar.C7(view, z17, str, z18);
    }

    public static final boolean O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs hsVar, in5.s0 s0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 v76 = hsVar.v7(s0Var, null);
        if (v76 == null) {
            return false;
        }
        boolean z17 = (hsVar.g7(s0Var) && (com.p314xaae8f345.mm.ui.bk.A() || com.p314xaae8f345.mm.ui.bk.Q())) ? false : true;
        boolean z18 = v76.mo2128x1ed62e84() == hsVar.f216192o;
        r45.al2 al2Var = (r45.al2) C.get(java.lang.Long.valueOf(v76.mo2128x1ed62e84()));
        boolean contains = A.contains(java.lang.Long.valueOf(v76.mo2128x1ed62e84()));
        android.app.Activity context = hsVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2 c15447x4ebc90c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2.class);
        boolean W6 = c15447x4ebc90c2 != null ? c15447x4ebc90c2.W6() : false;
        r45.dm2 m76806xdef68064 = v76.getFeedObject().getFeedObject().m76806xdef68064();
        boolean z19 = ((m76806xdef68064 != null ? m76806xdef68064.m75942xfb822ef2(30) : 0L) & 128) == 0;
        boolean z27 = z17 && z18 && al2Var != null && !contains && !W6 && z19;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isNeedShowSurvey ret=");
        sb6.append(z27);
        sb6.append(" isSupport=");
        sb6.append(z17);
        sb6.append(" isSameFeed=");
        sb6.append(z18);
        sb6.append(" isMatchedConfig=");
        sb6.append(al2Var != null);
        sb6.append(" shown=");
        sb6.append(contains);
        sb6.append(" isDescPanelShown=");
        sb6.append(W6);
        sb6.append(" canShow=");
        sb6.append(z19);
        sb6.append(" mediaType=");
        sb6.append(v76.getFeedObject().getMediaType());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", sb6.toString());
        return z27;
    }

    public static void Z6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs hsVar, in5.s0 s0Var, boolean z17, yz5.a aVar, int i17, java.lang.Object obj) {
        android.view.ViewPropertyAnimator translationY;
        android.view.ViewPropertyAnimator listener;
        if ((i17 & 4) != 0) {
            aVar = null;
        }
        hsVar.getClass();
        s0Var.o().setDescendantFocusability(393216);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) s0Var.p(com.p314xaae8f345.mm.R.id.rol);
        if (frameLayout == null || frameLayout.getVisibility() == 8) {
            return;
        }
        java.lang.Object parent = frameLayout.getParent();
        if ((parent instanceof android.view.View ? (android.view.View) parent : null) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "hideFlutterLayout");
            float f17 = com.p314xaae8f345.mm.ui.bh.a(hsVar.m80379x76847179()).f278669b;
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lq lqVar = hsVar.f216189i;
                if (lqVar != null) {
                    lqVar.a(true);
                }
                android.view.ViewPropertyAnimator animate = frameLayout.animate();
                animate.setUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.cr(hsVar));
                android.view.ViewPropertyAnimator duration = animate.setDuration(300L);
                if (duration == null || (translationY = duration.translationY(f17)) == null || (listener = translationY.setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.dr(hsVar, frameLayout, s0Var, aVar))) == null) {
                    return;
                }
                listener.start();
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lq lqVar2 = hsVar.f216189i;
            if (lqVar2 != null) {
                lqVar2.a(true);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lq lqVar3 = hsVar.f216189i;
            if (lqVar3 != null) {
                lqVar3.c(1.0f);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lq lqVar4 = hsVar.f216189i;
            if (lqVar4 != null) {
                lqVar4.a(false);
            }
            frameLayout.setVisibility(8);
            hsVar.y7(s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rq.f217356d);
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
            pi0.n1 n1Var = hsVar.f216187g;
            if (n1Var != null) {
                n1Var.a();
            }
            hsVar.f216187g = null;
            hsVar.f216188h = null;
        }
    }

    public static void o7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs hsVar, android.view.View view, in5.s0 s0Var, float f17, long j17, yz5.a aVar, int i17, java.lang.Object obj) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator translationYBy;
        android.view.ViewPropertyAnimator duration;
        hsVar.getClass();
        s0Var.p(com.p314xaae8f345.mm.R.id.g1y);
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.dq6);
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, -((int) f17));
        ofInt.setDuration(j17);
        ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
        ofInt.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nr(view, s0Var));
        ofInt.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.or(view));
        ofInt.start();
        hsVar.f216198u = ofInt;
        if (p17 == null || (animate = p17.animate()) == null || (translationYBy = animate.translationYBy(f17)) == null || (duration = translationYBy.setDuration(j17)) == null) {
            return;
        }
        duration.start();
    }

    public static r45.yk2 w7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs hsVar, in5.s0 s0Var, yz5.l lVar, int i17, java.lang.Object obj) {
        r45.yk2 yk2Var = null;
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 v76 = hsVar.v7(s0Var, null);
        if (v76 != null && (yk2Var = (r45.yk2) B.get(java.lang.Long.valueOf(v76.mo2128x1ed62e84()))) != null && lVar != null) {
            lVar.mo146xb9724478(yk2Var);
        }
        return yk2Var;
    }

    public final void A7() {
        in5.s0 s0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 v76;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "triggerRealPopupFlutterSurvey");
        java.lang.ref.WeakReference weakReference = this.f216184d;
        if (weakReference == null || (s0Var = (in5.s0) weakReference.get()) == null || (v76 = v7(s0Var, null)) == null) {
            return;
        }
        long mo2128x1ed62e84 = v76.mo2128x1ed62e84();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("triggerRealPopupFlutterSurvey-1, feedId = ");
        sb6.append(T6(mo2128x1ed62e84));
        sb6.append(", holder=");
        sb6.append(V6(s0Var));
        sb6.append(", itemView=");
        android.view.View itemView = s0Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        sb6.append(W6(itemView));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", sb6.toString());
        if (this.f216192o == mo2128x1ed62e84) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("triggerRealPopupFlutterSurvey-2, feedId = ");
            sb7.append(T6(mo2128x1ed62e84));
            sb7.append(", holder=");
            sb7.append(V6(s0Var));
            sb7.append(", itemView=");
            android.view.View itemView2 = s0Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
            sb7.append(W6(itemView2));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", sb7.toString());
            r45.zk2 zk2Var = z7(s0Var).f217124k;
            if (zk2Var != null) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("triggerRealPopupFlutterSurvey-3, feedId = ");
                sb8.append(T6(mo2128x1ed62e84));
                sb8.append(", holder=");
                sb8.append(V6(s0Var));
                sb8.append(", itemView=");
                android.view.View itemView3 = s0Var.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView3, "itemView");
                sb8.append(W6(itemView3));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", sb8.toString());
                q7(s0Var, zk2Var, null);
            }
        }
    }

    public final void B7(in5.s0 s0Var, r45.zk2 zk2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qq qqVar) {
        v7(s0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gs(this, zk2Var, qqVar));
    }

    public final void C7(android.view.View view, boolean z17, java.lang.String str, boolean z18) {
        android.content.Context context = view.getContext();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(z18 ? com.p314xaae8f345.mm.R.id.g3i : com.p314xaae8f345.mm.R.id.g3h);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(z18 ? com.p314xaae8f345.mm.R.id.g3l : com.p314xaae8f345.mm.R.id.g3k);
        d92.f fVar = d92.f.f309003a;
        d92.f.o(fVar, view, false, false, false, 7, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22699x3dcdb352);
        d92.f.o(fVar, c22699x3dcdb352, false, false, false, 7, null);
        textView.setTextSize(1, 12.0f);
        if (z17) {
            c22699x3dcdb352.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30));
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30));
            view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563163yi);
        } else {
            c22699x3dcdb352.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77678x8113c22e));
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77678x8113c22e));
            view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563162yh);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        textView.setText(str);
    }

    public final void P6(in5.s0 s0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 v76 = v7(s0Var, null);
        if (v76 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clearPrepareLayout, feedId = ");
            sb6.append(T6(v76.mo2128x1ed62e84()));
            sb6.append(", holder=");
            sb6.append(V6(s0Var));
            sb6.append(", itemView=");
            android.view.View itemView = s0Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            sb6.append(W6(itemView));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", sb6.toString());
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nq nqVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nq) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nq.class);
            if (nqVar != null) {
                nqVar.m63196x5a5b64d();
            }
        }
    }

    public final android.view.View Q6(in5.s0 s0Var) {
        android.view.View inflate;
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.f566432fv2);
        if (p17 != null) {
            return p17;
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) s0Var.p(com.p314xaae8f345.mm.R.id.f566433fv3);
        if (viewStub == null || (inflate = viewStub.inflate()) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "contentLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "contentLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13778xe5c0d44a c13778xe5c0d44a = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13778xe5c0d44a) inflate.findViewById(com.p314xaae8f345.mm.R.id.nso);
        if (c13778xe5c0d44a == null) {
            return inflate;
        }
        c13778xe5c0d44a.m56013x9bb105c7(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hr(s0Var, c13778xe5c0d44a, this));
        return inflate;
    }

    public final void R6(in5.s0 s0Var, r45.zk2 zk2Var, r45.xk2 xk2Var, java.lang.String str) {
        java.lang.Object obj;
        r45.zk2 zk2Var2;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator animate2;
        android.view.ViewPropertyAnimator alpha2;
        android.view.ViewPropertyAnimator duration2;
        so2.j5 j5Var = (so2.j5) s0Var.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pq z76 = z7(s0Var);
        java.lang.Long valueOf = java.lang.Long.valueOf(xk2Var.m75942xfb822ef2(0));
        java.util.List list = z76.f217119f;
        if (!list.contains(valueOf)) {
            list.add(java.lang.Long.valueOf(xk2Var.m75942xfb822ef2(0)));
        }
        D.put(java.lang.Long.valueOf(j5Var.mo2128x1ed62e84()), z76);
        B7(s0Var, zk2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qq.f217263e);
        int m75939xb282bd08 = xk2Var.m75939xb282bd08(5);
        if (m75939xb282bd08 == 1) {
            S6(s0Var, zk2Var);
            return;
        }
        if (m75939xb282bd08 != 2) {
            return;
        }
        long m75942xfb822ef2 = xk2Var.m75942xfb822ef2(6);
        r45.yk2 w76 = w7(this, s0Var, null, 2, null);
        if (w76 == null) {
            zk2Var2 = null;
        } else {
            java.util.LinkedList m75941xfb821914 = w76.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getQuestions(...)");
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.zk2) obj).m75942xfb822ef2(0) == m75942xfb822ef2) {
                        break;
                    }
                }
            }
            zk2Var2 = (r45.zk2) obj;
        }
        if (zk2Var2 == null) {
            S6(s0Var, zk2Var);
            return;
        }
        if (g7(s0Var)) {
            k7(s0Var, zk2Var2, null);
            return;
        }
        int m75939xb282bd082 = zk2Var.m75939xb282bd08(3);
        int m75939xb282bd083 = zk2Var2.m75939xb282bd08(3);
        if (m75939xb282bd082 != 1 || m75939xb282bd083 != 2) {
            c7(s0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.vq(this, s0Var, zk2Var2));
            return;
        }
        android.view.View X6 = X6(s0Var);
        if (X6 != null) {
            android.widget.TextView textView = (android.widget.TextView) X6.findViewById(com.p314xaae8f345.mm.R.id.g3t);
            android.view.View findViewById = X6.findViewById(com.p314xaae8f345.mm.R.id.g3o);
            android.view.View findViewById2 = X6.findViewById(com.p314xaae8f345.mm.R.id.g3r);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uq uqVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uq(findViewById, findViewById2, textView, zk2Var2, str);
            android.view.View Q6 = Q6(s0Var);
            if (Q6 != null) {
                r7(s0Var, zk2Var2);
                s7(Q6, zk2Var2);
                java.util.Iterator it6 = zk2Var2.m75941xfb821914(2).iterator();
                while (it6.hasNext()) {
                    B7(s0Var, zk2Var2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qq.f217262d);
                }
                java.lang.Object parent = Q6.getParent();
                if ((parent instanceof android.view.View ? (android.view.View) parent : null) != null) {
                    Q6.animate().cancel();
                    int U6 = U6(Q6);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "popupContentLayout height: " + U6);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(Q6, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupContentLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    Q6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(Q6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupContentLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(Q6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupContentLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    Q6.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(Q6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupContentLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    p7(Q6, s0Var, U6, 300L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.jr(this, s0Var, uqVar));
                    if (findViewById != null && (animate2 = findViewById.animate()) != null && (alpha2 = animate2.alpha(0.0f)) != null && (duration2 = alpha2.setDuration(300L)) != null) {
                        duration2.start();
                    }
                    if (findViewById2 == null || (animate = findViewById2.animate()) == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(300L)) == null) {
                        return;
                    }
                    duration.start();
                }
            }
        }
    }

    public final void S6(in5.s0 s0Var, r45.zk2 zk2Var) {
        boolean g76 = g7(s0Var);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f216185e;
        if (!g76) {
            int m75939xb282bd08 = zk2Var.m75939xb282bd08(3);
            if (m75939xb282bd08 == 1) {
                n3Var.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.yq(this, s0Var), 1000L);
                return;
            }
            if (m75939xb282bd08 != 2) {
                return;
            }
            int m75939xb282bd082 = zk2Var.m75939xb282bd08(4);
            if (m75939xb282bd082 == 1) {
                n3Var.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zq(this, s0Var), 1000L);
                return;
            } else {
                if (m75939xb282bd082 != 2) {
                    return;
                }
                n3Var.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ar(this, s0Var), 1000L);
                return;
            }
        }
        n3Var.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xq(this, s0Var), 1000L);
        android.app.Activity m80379x76847179 = m80379x76847179();
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m80379x76847179);
        e4Var.f293309c = s0Var.f374654e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573487mr1);
        e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
        e4Var.c();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = s0Var.o().getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
        int w17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager).w() + 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "[smoothScrollToNextPosition] nextPosition=" + w17);
        s0Var.o().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bs(s0Var, w17));
    }

    @Override // kr2.k
    public void T(r45.zk2 question, r45.xk2 answer, java.lang.String inputText, java.util.List mutliAnswerIDs) {
        in5.s0 s0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(question, "question");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(answer, "answer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputText, "inputText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mutliAnswerIDs, "mutliAnswerIDs");
        java.lang.ref.WeakReference weakReference = this.f216184d;
        if (weakReference == null || (s0Var = (in5.s0) weakReference.get()) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pq z76 = z7(s0Var);
        z76.f217121h = inputText;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = mutliAnswerIDs.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            java.lang.String obj = next != null ? next.toString() : null;
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        z76.f217120g = kz5.z.C0(arrayList.toArray(new java.lang.String[0]));
        R6(s0Var, question, answer, "");
    }

    public final java.lang.String T6(long j17) {
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String q17 = b52.b.q(j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q17);
        return q17;
    }

    public final int U6(android.view.View view) {
        int height = view.getHeight();
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (height > 0 || view2 == null) {
            return height;
        }
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(view2.getWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(view2.getHeight(), 0));
        return new android.graphics.Point(view.getMeasuredWidth(), view.getMeasuredHeight()).y;
    }

    public final java.lang.String V6(in5.s0 s0Var) {
        java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(s0Var));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hexString);
        return hexString;
    }

    public final java.lang.String W6(android.view.View view) {
        java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(view));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hexString);
        return hexString;
    }

    public final android.view.View X6(in5.s0 s0Var) {
        android.view.View view;
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.f566435fv4);
        if (p17 != null) {
            return p17;
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) s0Var.p(com.p314xaae8f345.mm.R.id.f566436fv5);
        if (viewStub == null || (view = viewStub.inflate()) == null) {
            view = null;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "headerLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "headerLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.g3t);
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.g3o);
            android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.g3r);
            textView.setTextSize(1, 15.0f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
            D7(this, findViewById, false, null, false, 4, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById2);
            D7(this, findViewById2, false, null, true, 4, null);
        }
        return view;
    }

    public final void Y6(in5.s0 s0Var, yz5.a aVar) {
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator alpha2;
        android.view.ViewPropertyAnimator duration2;
        android.view.ViewPropertyAnimator listener;
        android.view.View X6 = X6(s0Var);
        android.view.View Q6 = Q6(s0Var);
        if (X6 == null || Q6 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(X6.getParent(), Q6.getParent())) {
            return;
        }
        java.lang.Object parent = X6.getParent();
        if ((parent instanceof android.view.View ? (android.view.View) parent : null) != null) {
            int U6 = U6(X6);
            int U62 = U6(Q6);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "hideContentLayout headerHeight: " + U6 + ", contentHeight: " + U62);
            o7(this, Q6, s0Var, (float) (U6 + U62), 300L, null, 16, null);
            android.view.ViewPropertyAnimator animate = X6.animate();
            if (animate != null && (alpha2 = animate.alpha(0.0f)) != null && (duration2 = alpha2.setDuration(300L)) != null && (listener = duration2.setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.br(Q6, X6, this, s0Var, aVar))) != null) {
                listener.start();
            }
            android.view.ViewPropertyAnimator animate2 = Q6.animate();
            if (animate2 == null || (alpha = animate2.alpha(0.0f)) == null || (duration = alpha.setDuration(300L)) == null) {
                return;
            }
            duration.start();
        }
    }

    public final void a7(in5.s0 s0Var, yz5.a aVar) {
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator listener;
        android.view.View X6 = X6(s0Var);
        if (X6 != null) {
            java.lang.Object parent = X6.getParent();
            if ((parent instanceof android.view.View ? (android.view.View) parent : null) != null) {
                int U6 = U6(X6);
                o7(this, X6, s0Var, U6, 300L, null, 16, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "hideHeaderLayout height: " + U6);
                android.view.ViewPropertyAnimator animate = X6.animate();
                if (animate == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(300L)) == null || (listener = duration.setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.er(X6, this, s0Var, aVar))) == null) {
                    return;
                }
                listener.start();
            }
        }
    }

    public final void b7(in5.s0 s0Var, yz5.a aVar) {
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator listener;
        android.view.View x76 = x7(s0Var);
        if (x76 != null) {
            java.lang.Object parent = x76.getParent();
            if ((parent instanceof android.view.View ? (android.view.View) parent : null) != null) {
                int U6 = U6(x76);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "hideScoreLayout height: " + U6);
                o7(this, x76, s0Var, (float) U6, 300L, null, 16, null);
                android.view.ViewPropertyAnimator animate = x76.animate();
                if (animate == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(300L)) == null || (listener = duration.setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fr(x76, this, s0Var, aVar))) == null) {
                    return;
                }
                listener.start();
            }
        }
    }

    public final void c7(in5.s0 s0Var, yz5.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "hideSurveyLayout showState=" + z7(s0Var).f217114a);
        int ordinal = z7(s0Var).f217114a.ordinal();
        if (ordinal == 2) {
            a7(s0Var, aVar);
        } else if (ordinal == 3) {
            Y6(s0Var, aVar);
        } else {
            if (ordinal != 4) {
                return;
            }
            b7(s0Var, aVar);
        }
    }

    public final void d7(in5.s0 s0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 v76;
        y7(s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rq.f217356d);
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.g1y);
        if (p17 != null) {
            p17.setTranslationY(0.0f);
        }
        android.view.View p18 = s0Var.p(com.p314xaae8f345.mm.R.id.dq6);
        if (p18 != null) {
            p18.setTranslationY(0.0f);
        }
        android.view.View p19 = s0Var.p(com.p314xaae8f345.mm.R.id.f566019ee3);
        if (p19 != null) {
            p19.setTranslationY(0.0f);
        }
        android.view.View p27 = s0Var.p(com.p314xaae8f345.mm.R.id.fv6);
        if (p27 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p27, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "hideSurveyLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "hideSurveyLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.ui.kk.d(p27, 0);
        }
        android.view.View p28 = s0Var.p(com.p314xaae8f345.mm.R.id.f566435fv4);
        if (p28 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p28, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "hideSurveyLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "hideSurveyLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.ui.kk.d(p28, 0);
        }
        android.view.View p29 = s0Var.p(com.p314xaae8f345.mm.R.id.f566432fv2);
        if (p29 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p29, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "hideSurveyLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p29.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p29, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "hideSurveyLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.ui.kk.d(p29, 0);
        }
        android.view.View p37 = s0Var.p(com.p314xaae8f345.mm.R.id.rol);
        if (p37 == null || (v76 = v7(s0Var, null)) == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hideFlutterSurveyLayout, feedId = ");
        sb6.append(T6(v76.mo2128x1ed62e84()));
        sb6.append(", holder=");
        sb6.append(V6(s0Var));
        sb6.append(", itemView=");
        android.view.View itemView = s0Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        sb6.append(W6(itemView));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", sb6.toString());
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(p37, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "hideSurveyLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p37.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(p37, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "hideSurveyLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.ui.kk.d(p37, 0);
    }

    public final boolean e7(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pq z76 = z7(holder);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "isShowingNpsSurvey, showInfo.showState=" + z76.f217114a);
        return z76.f217114a != com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rq.f217356d;
    }

    public final long f7(int i17) {
        if (i17 != 2) {
            if (i17 != 4) {
                if (i17 == 9) {
                    return 4L;
                }
                if (i17 != 3001) {
                    if (i17 != 3002) {
                        return 0L;
                    }
                }
            }
            return 2L;
        }
        return 1L;
    }

    public final boolean g7(in5.s0 s0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 v76 = v7(s0Var, null);
        if (v76 == null) {
            return false;
        }
        r45.al2 al2Var = (r45.al2) C.get(java.lang.Long.valueOf(v76.mo2128x1ed62e84()));
        return al2Var != null && al2Var.m75939xb282bd08(14) == 1;
    }

    public final void h7(in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        so2.j5 j5Var = (so2.j5) holder.f374658i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFeedActionHappen, feedId = ");
        sb6.append(T6(j5Var.mo2128x1ed62e84()));
        sb6.append(", holder=");
        sb6.append(V6(holder));
        sb6.append(", itemView=");
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        sb6.append(W6(itemView));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", sb6.toString());
        v7(holder, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fs(this, holder, i17, false));
    }

    public final void i7(in5.s0 holder, boolean z17) {
        r45.al2 al2Var;
        java.lang.Object putIfAbsent;
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23890x9b353789 c23890x9b353789;
        in5.s0 s0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        so2.j5 j5Var = (so2.j5) holder.f374658i;
        java.lang.ref.WeakReference weakReference = this.f216184d;
        if (weakReference != null && (s0Var = (in5.s0) weakReference.get()) != null) {
            T6(j5Var.mo2128x1ed62e84());
            V6(holder);
            android.view.View itemView = s0Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            W6(itemView);
            if (z7(s0Var).f217114a == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rq.f217357e) {
                P6(s0Var);
            }
            Z6(this, s0Var, false, null, 4, null);
        }
        this.f216184d = new java.lang.ref.WeakReference(holder);
        T6(j5Var.mo2128x1ed62e84());
        V6(holder);
        android.view.View itemView2 = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
        W6(itemView2);
        pf5.u uVar = pf5.u.f435469a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca c15456x2c452bca = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) uVar.b(m80379x76847179()).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class);
        int S6 = c15456x2c452bca != null ? c15456x2c452bca.S6() : -1;
        if (S6 == 3 && !this.f216193p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "onFeedFocused returned because follow disable");
            return;
        }
        if (S6 == 1 && !this.f216194q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "onFeedFocused returned because friend disable");
            return;
        }
        if (S6 == 4 && !this.f216195r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "onFeedFocused returned because machine disable");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFeedFocused-1, feedId = ");
        sb6.append(T6(j5Var.mo2128x1ed62e84()));
        sb6.append(", holder=");
        sb6.append(V6(holder));
        sb6.append(", itemView=");
        android.view.View itemView3 = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView3, "itemView");
        sb6.append(W6(itemView3));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", sb6.toString());
        if (z17) {
            kr2.j jVar = this.f216188h;
            if (jVar != null && (c23890x9b353789 = jVar.f392845e) != null) {
                c23890x9b353789.m88515x84b5e33d(kr2.i.f392843d);
            }
            this.f216192o = j5Var.mo2128x1ed62e84();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onFeedFocused-2, focusingFeedId = ");
            sb7.append(T6(this.f216192o));
            sb7.append(", holder=");
            sb7.append(V6(holder));
            sb7.append(", itemView=");
            android.view.View itemView4 = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView4, "itemView");
            sb7.append(W6(itemView4));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", sb7.toString());
            java.lang.System.currentTimeMillis();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f216196s;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(S6);
            java.lang.Object obj = concurrentHashMap.get(valueOf);
            if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = java.lang.Integer.valueOf(holder.m8183xf806b362())))) != null) {
                obj = putIfAbsent;
            }
            java.lang.Integer num = (java.lang.Integer) obj;
            int m8183xf806b362 = holder.m8183xf806b362();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            this.f216191n = m8183xf806b362 - num.intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "onFeedFocused removeCallbackAndMessages");
            this.f216185e.mo50302x6b17ad39(null);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f216186f;
            n3Var.mo50302x6b17ad39(null);
            this.f216199v = false;
            this.f216200w = 0L;
            so2.j5 j5Var2 = (so2.j5) holder.f374658i;
            p012xc85e97e9.p093xedfae76a.k0 k0Var = this.f216202y;
            if (k0Var != null) {
                ((xc2.k0) uVar.e(zy2.b6.class).a(xc2.k0.class)).Y6(this.f216192o).mo522xb5bdeb7a(k0Var);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tq tqVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tq(j5Var2, this, holder);
            this.f216202y = tqVar;
            android.app.Activity m80379x76847179 = m80379x76847179();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m80379x76847179 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m80379x76847179 : null;
            if (abstractActivityC21394xb3d2c0cf != null) {
                pm0.v.y(((xc2.k0) uVar.e(zy2.b6.class).a(xc2.k0.class)).Y6(j5Var2.mo2128x1ed62e84()), abstractActivityC21394xb3d2c0cf, tqVar);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 o17 = holder.o();
                if (o17 != null) {
                    o17.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sq(this));
                }
            }
            so2.j5 j5Var3 = (so2.j5) holder.f374658i;
            if (e7(holder) && (al2Var = (r45.al2) C.get(java.lang.Long.valueOf(j5Var3.mo2128x1ed62e84()))) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.P9).mo141623x754a37bb()).r()).intValue();
                long m75938x746dc8a6 = intValue == 0 ? al2Var.m75938x746dc8a6(9) * 1000 : intValue * 1000;
                if (m75938x746dc8a6 > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "showSurveyLayoutWithoutAnimate timerHandler.postDelayed " + m75938x746dc8a6 + " ms");
                    n3Var.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.wq(this, holder), m75938x746dc8a6);
                }
            }
            h7(holder, 1);
        }
    }

    public final void k7(in5.s0 s0Var, r45.zk2 zk2Var, yz5.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pq z76 = z7(s0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "popupFlutterSurvey, showInfo=" + z76);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 v76 = v7(s0Var, null);
        if (v76 != null) {
            long mo2128x1ed62e84 = v76.mo2128x1ed62e84();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("popupFlutterSurvey, feedId = ");
            sb6.append(T6(mo2128x1ed62e84));
            sb6.append(", holder=");
            sb6.append(V6(s0Var));
            sb6.append(", itemView=");
            android.view.View itemView = s0Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            sb6.append(W6(itemView));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", sb6.toString());
            if (z76.f217123j != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "popupFlutterSurvey, showingQuestion is exist");
                q7(s0Var, zk2Var, aVar);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "popupFlutterSurvey, showingQuestion is null");
            z76.f217124k = zk2Var;
            z76.f217125l = aVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "preparePopupFlutterSurvey");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 v77 = v7(s0Var, null);
            if (v77 != null) {
                long mo2128x1ed62e842 = v77.mo2128x1ed62e84();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("preparePopupFlutterSurvey, feedId = ");
                sb7.append(T6(mo2128x1ed62e842));
                sb7.append(", holder=");
                sb7.append(V6(s0Var));
                sb7.append(", itemView=");
                android.view.View itemView2 = s0Var.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
                sb7.append(W6(itemView2));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", sb7.toString());
            }
            this.f216187g = null;
            y7(s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rq.f217357e);
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nq nqVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nq) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nq.class);
            if (nqVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsScrollUIC", "onBindView");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea c13728x20aad6ea = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea) s0Var.o();
                nqVar.f216876e = c13728x20aad6ea;
                if (c13728x20aad6ea != null) {
                    nqVar.O6(true);
                    c13728x20aad6ea.m55761xe02f1f0f(nqVar.f216879h);
                }
            }
        }
    }

    public final void l7(in5.s0 s0Var, r45.zk2 zk2Var, yz5.a aVar) {
        java.lang.Object obj;
        java.lang.Object obj2;
        y7(s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rq.f217358f);
        android.view.View X6 = X6(s0Var);
        if (X6 != null) {
            r7(s0Var, zk2Var);
            t7(s0Var, zk2Var, X6);
            java.util.LinkedList m75941xfb821914 = zk2Var.m75941xfb821914(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getAnswers(...)");
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.xk2) obj).m75939xb282bd08(2) == 2) {
                        break;
                    }
                }
            }
            r45.xk2 xk2Var = (r45.xk2) obj;
            java.util.LinkedList m75941xfb8219142 = zk2Var.m75941xfb821914(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getAnswers(...)");
            java.util.Iterator it6 = m75941xfb8219142.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it6.next();
                    if (((r45.xk2) obj2).m75939xb282bd08(2) == 3) {
                        break;
                    }
                }
            }
            r45.xk2 xk2Var2 = (r45.xk2) obj2;
            if (xk2Var != null) {
                B7(s0Var, zk2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qq.f217262d);
            }
            if (xk2Var2 != null) {
                B7(s0Var, zk2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qq.f217262d);
            }
            java.lang.Object parent = X6.getParent();
            if ((parent instanceof android.view.View ? (android.view.View) parent : null) != null) {
                X6.animate().cancel();
                int U6 = U6(X6);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "popupHeaderLayout height: " + U6);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(X6, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                X6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(X6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(X6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                X6.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(X6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                p7(X6, s0Var, U6, 300L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.kr(aVar));
            }
        }
    }

    public final void m7(in5.s0 s0Var, r45.zk2 zk2Var, yz5.a aVar) {
        y7(s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rq.f217360h);
        android.view.View x76 = x7(s0Var);
        if (x76 != null) {
            r7(s0Var, zk2Var);
            u7(s0Var, zk2Var, x76);
            java.util.LinkedList<r45.xk2> m75941xfb821914 = zk2Var.m75941xfb821914(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getAnswers(...)");
            for (r45.xk2 xk2Var : m75941xfb821914) {
                B7(s0Var, zk2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qq.f217262d);
            }
            java.lang.Object parent = x76.getParent();
            if ((parent instanceof android.view.View ? (android.view.View) parent : null) != null) {
                x76.animate().cancel();
                int U6 = U6(x76);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "popupScoreSurvey height: " + U6);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(x76, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupScoreSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                x76.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(x76, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupScoreSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p7(x76, s0Var, U6, 300L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lr(aVar));
            }
        }
    }

    public final void n7(in5.s0 s0Var, r45.zk2 zk2Var, yz5.a aVar) {
        android.view.View X6 = X6(s0Var);
        android.view.View Q6 = Q6(s0Var);
        if (X6 == null || Q6 == null) {
            return;
        }
        r7(s0Var, zk2Var);
        t7(s0Var, zk2Var, X6);
        s7(Q6, zk2Var);
        java.util.Iterator it = zk2Var.m75941xfb821914(2).iterator();
        while (it.hasNext()) {
            B7(s0Var, zk2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qq.f217262d);
        }
        java.lang.Object parent = Q6.getParent();
        if ((parent instanceof android.view.View ? (android.view.View) parent : null) != null) {
            X6.animate().cancel();
            Q6.animate().cancel();
            int U6 = U6(X6);
            int U62 = U6(Q6);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "popupWholeSurvey headerHeight: " + U6 + ", contentHeight: " + U62);
            int i17 = U6 + U62;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(X6, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupWholeSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            X6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(X6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupWholeSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(X6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupWholeSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            X6.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(X6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupWholeSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(Q6, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupWholeSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Q6.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(Q6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupWholeSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(Q6, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupWholeSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            Q6.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(Q6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupWholeSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p7(Q6, s0Var, i17, 300L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mr(this, s0Var, aVar));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        java.lang.ref.WeakReference weakReference;
        in5.s0 s0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 v76;
        super.mo2273x9d4787cb(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "onActivityResult: " + i17 + ' ' + i18);
        if (i17 != 7701 || (weakReference = this.f216184d) == null || (s0Var = (in5.s0) weakReference.get()) == null || (v76 = v7(s0Var, null)) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = v76.getFeedObject();
        if (f7(feedObject != null ? feedObject.getMediaType() : -1) == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "onActivityResult call triggerRealPopupFlutterSurvey now");
            this.f216185e.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ir(this), 1000L);
        }
    }

    @Override // kr2.k
    /* renamed from: onCloseNPS */
    public void mo62280xe63d10d8() {
        in5.s0 s0Var;
        java.lang.ref.WeakReference weakReference = this.f216184d;
        if (weakReference == null || (s0Var = (in5.s0) weakReference.get()) == null) {
            return;
        }
        Z6(this, s0Var, true, null, 4, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        in5.s0 s0Var;
        this.f216185e.mo50302x6b17ad39(null);
        android.animation.ValueAnimator valueAnimator = this.f216198u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimator2 = this.f216197t;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        java.lang.ref.WeakReference weakReference = this.f216184d;
        if (weakReference == null || (s0Var = (in5.s0) weakReference.get()) == null) {
            return;
        }
        Z6(this, s0Var, false, null, 4, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        in5.s0 s0Var;
        java.lang.ref.WeakReference weakReference = this.f216184d;
        if (weakReference == null || (s0Var = (in5.s0) weakReference.get()) == null || e7(s0Var)) {
            return;
        }
        if (z7(s0Var).f217114a == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rq.f217357e) {
            P6(s0Var);
        } else {
            d7(s0Var);
        }
    }

    public final void p7(android.view.View view, in5.s0 s0Var, float f17, long j17, yz5.a aVar) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator translationYBy;
        android.view.ViewPropertyAnimator duration;
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.dq6);
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(-((int) f17), 0);
        ofInt.setDuration(j17);
        ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
        ofInt.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pr(view, s0Var));
        ofInt.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qr(aVar, view));
        ofInt.start();
        this.f216197t = ofInt;
        if (p17 == null || (animate = p17.animate()) == null || (translationYBy = animate.translationYBy(-f17)) == null || (duration = translationYBy.setDuration(j17)) == null) {
            return;
        }
        duration.start();
    }

    public final void q7(in5.s0 holder, r45.zk2 question, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(question, "question");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "realPopupFlutterSurvey, question = " + question);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.p(com.p314xaae8f345.mm.R.id.rol);
        if (frameLayout != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "realPopupFlutterSurvey, in flutterLayout let");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 v76 = v7(holder, null);
            if (v76 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "realPopupFlutterSurvey, in safeGetFeedObj let");
                long mo2128x1ed62e84 = v76.mo2128x1ed62e84();
                r45.al2 al2Var = (r45.al2) C.get(java.lang.Long.valueOf(mo2128x1ed62e84));
                if (al2Var == null) {
                    return;
                }
                boolean z17 = this.f216187g != null;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                byte[] mo14344x5f01b1f6 = al2Var.mo14344x5f01b1f6();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
                linkedHashMap.put("taskConfBuffer", mo14344x5f01b1f6);
                byte[] mo14344x5f01b1f62 = question.mo14344x5f01b1f6();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f62, "toByteArray(...)");
                linkedHashMap.put("surveyQuestionBuffer", mo14344x5f01b1f62);
                linkedHashMap.put("needFullScreen", java.lang.Boolean.valueOf(z17));
                linkedHashMap.put("needTransparent", java.lang.Boolean.FALSE);
                linkedHashMap.put("tid", pm0.v.u(mo2128x1ed62e84));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "realPopupFlutterSurvey, tid = ".concat(T6(mo2128x1ed62e84)));
                r7(holder, question);
                B7(holder, question, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qq.f217262d);
                y7(holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rq.f217361i);
                this.f216188h = new kr2.j(new java.lang.ref.WeakReference(new java.lang.ref.WeakReference(this).get()));
                android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(m80379x76847179());
                frameLayout2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ur(this, holder, frameLayout2, linkedHashMap, z17, frameLayout, mo2128x1ed62e84, null), 3, null);
            }
        }
    }

    public final void r7(in5.s0 s0Var, r45.zk2 zk2Var) {
        so2.j5 j5Var = (so2.j5) s0Var.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pq z76 = z7(s0Var);
        z76.f217123j = zk2Var;
        java.lang.Long valueOf = java.lang.Long.valueOf(zk2Var.m75942xfb822ef2(0));
        java.util.List list = z76.f217118e;
        if (!list.contains(valueOf)) {
            list.add(java.lang.Long.valueOf(zk2Var.m75942xfb822ef2(0)));
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (z76.f217115b == 0) {
            z76.f217115b = currentTimeMillis;
        }
        z76.f217122i.put(java.lang.Long.valueOf(zk2Var.m75942xfb822ef2(0)), java.lang.Long.valueOf(currentTimeMillis));
        z76.f217116c++;
        D.put(java.lang.Long.valueOf(j5Var.mo2128x1ed62e84()), z76);
    }

    public final void s7(android.view.View view, r45.zk2 zk2Var) {
        java.util.LinkedList<r45.xk2> m75941xfb821914 = zk2Var.m75941xfb821914(2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshContentData", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshContentData", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75941xfb821914);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        for (r45.xk2 xk2Var : m75941xfb821914) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(xk2Var);
            arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e5(zk2Var, xk2Var));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "refreshContentData answerList = ".concat(kz5.n0.g0(arrayList2, null, null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.vr.f217799d, 31, null)));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13778xe5c0d44a) view.findViewById(com.p314xaae8f345.mm.R.id.nso)).m56012x55915b7e(arrayList2);
    }

    public final void t7(in5.s0 s0Var, r45.zk2 zk2Var, android.view.View view) {
        java.lang.Object obj;
        jz5.f0 f0Var;
        java.lang.Object obj2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.g3t);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.g3o);
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.g3r);
        java.util.LinkedList m75941xfb821914 = zk2Var.m75941xfb821914(2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getAnswers(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.xk2) obj).m75939xb282bd08(2) == 2) {
                    break;
                }
            }
        }
        r45.xk2 xk2Var = (r45.xk2) obj;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (xk2Var != null) {
            java.lang.String m75945x2fec8307 = xk2Var.m75945x2fec8307(1);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573628f63);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75945x2fec8307);
            findViewById.setEnabled(true);
            C7(findViewById, false, m75945x2fec8307, false);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.wr(this, findViewById, findViewById2, s0Var, zk2Var, xk2Var));
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.util.LinkedList m75941xfb8219142 = zk2Var.m75941xfb821914(2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getAnswers(...)");
        java.util.Iterator it6 = m75941xfb8219142.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it6.next();
                if (((r45.xk2) obj2).m75939xb282bd08(2) == 3) {
                    break;
                }
            }
        }
        r45.xk2 xk2Var2 = (r45.xk2) obj2;
        if (xk2Var2 != null) {
            java.lang.String m75945x2fec83072 = xk2Var2.m75945x2fec8307(1);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573629f64);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75945x2fec83072);
            findViewById2.setEnabled(true);
            C7(findViewById2, false, m75945x2fec83072, true);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById2.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById2, arrayList6.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xr(this, findViewById2, findViewById, s0Var, zk2Var, xk2Var2));
        } else {
            f0Var2 = null;
        }
        if (f0Var2 == null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(findViewById2, arrayList7.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.String m75945x2fec83073 = zk2Var.m75945x2fec8307(1);
        if (m75945x2fec83073 == null) {
            m75945x2fec83073 = s0Var.f374654e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bqf);
        }
        textView.setText(m75945x2fec83073);
    }

    public final void u7(in5.s0 s0Var, r45.zk2 zk2Var, android.view.View view) {
        in5.s0 s0Var2 = s0Var;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.g3t);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.g3s);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        linearLayout.removeAllViews();
        java.util.LinkedList m75941xfb821914 = zk2Var.m75941xfb821914(2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getAnswers(...)");
        int i17 = 0;
        for (java.lang.Object obj : m75941xfb821914) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.xk2 xk2Var = (r45.xk2) obj;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(s0Var2.f374654e);
            android.content.Context context = s0Var2.f374654e;
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(dimensionPixelOffset, dimensionPixelOffset);
            marginLayoutParams.rightMargin = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
            c22699x3dcdb352.setLayoutParams(marginLayoutParams);
            c22699x3dcdb352.setImageDrawable(m95.a.e(context.getResources(), com.p314xaae8f345.mm.R.raw.f79908xc853f96a, 0.0f));
            c22699x3dcdb352.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560032j));
            c22699x3dcdb352.setTag(xk2Var);
            c22699x3dcdb352.setClickable(true);
            c22699x3dcdb352.setFocusable(true);
            c22699x3dcdb352.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.yr(c22699x3dcdb352, arrayList, this, s0Var, zk2Var, xk2Var, i17));
            linearLayout.addView(c22699x3dcdb352);
            arrayList.add(c22699x3dcdb352);
            s0Var2 = s0Var;
            i17 = i18;
        }
        java.lang.String m75945x2fec8307 = zk2Var.m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        textView.setText(m75945x2fec8307);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 v7(in5.s0 s0Var, yz5.l lVar) {
        java.lang.Object obj = s0Var.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
        if (abstractC14490x69736cb5 == null) {
            return null;
        }
        if (lVar != null) {
            lVar.mo146xb9724478(abstractC14490x69736cb5);
        }
        return abstractC14490x69736cb5;
    }

    public final android.view.View x7(in5.s0 s0Var) {
        android.view.View inflate;
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.fv6);
        if (p17 != null) {
            return p17;
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) s0Var.p(com.p314xaae8f345.mm.R.id.fv7);
        if (viewStub == null || (inflate = viewStub.inflate()) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "scoreLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "scoreLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return inflate;
    }

    public final void y7(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rq rqVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setShowState, showState=");
        sb6.append(rqVar);
        sb6.append(", holder=");
        sb6.append(V6(s0Var));
        sb6.append(", itemView=");
        android.view.View itemView = s0Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        sb6.append(W6(itemView));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", sb6.toString());
        so2.j5 j5Var = (so2.j5) s0Var.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pq z76 = z7(s0Var);
        if (rqVar == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rq.f217356d && z76.f217114a == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rq.f217361i) {
            r45.zk2 zk2Var = z76.f217123j;
            if (zk2Var != null) {
                B7(s0Var, zk2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qq.f217264f);
            }
            z76.f217123j = null;
            z76.f217124k = null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rqVar, "<set-?>");
        z76.f217114a = rqVar;
        D.put(java.lang.Long.valueOf(j5Var.mo2128x1ed62e84()), z76);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pq z7(in5.s0 s0Var) {
        so2.j5 j5Var = (so2.j5) s0Var.f374658i;
        java.lang.Object obj = D.get(java.lang.Long.valueOf(j5Var.mo2128x1ed62e84()));
        if (obj == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "showInfo not found feedId = " + T6(j5Var.mo2128x1ed62e84()) + " return empty object");
            obj = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rq.f217356d, 0L, 0, this.f216191n, null, null, null, null, null, null, null, null, 4086, null);
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pq) obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f216185e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f216186f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f216193p = true;
        this.f216194q = true;
        this.f216195r = true;
        this.f216196s = new java.util.concurrent.ConcurrentHashMap();
    }
}
