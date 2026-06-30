package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class s3 extends fc2.d implements im5.b, zy2.h8 {

    /* renamed from: y, reason: collision with root package name */
    public static long f108312y = -1;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f108313g;

    /* renamed from: h, reason: collision with root package name */
    public final int f108314h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f108315i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.p f108316m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Vector f108317n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Vector f108318o;

    /* renamed from: p, reason: collision with root package name */
    public android.app.Activity f108319p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.fragment.app.Fragment f108320q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.q9 f108321r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashMap f108322s;

    /* renamed from: t, reason: collision with root package name */
    public final int f108323t;

    /* renamed from: u, reason: collision with root package name */
    public final int f108324u;

    /* renamed from: v, reason: collision with root package name */
    public final int f108325v;

    /* renamed from: w, reason: collision with root package name */
    public final int f108326w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f108327x;

    public s3(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f108313g = "FinderLiveNoticePreLoader";
        this.f108314h = 5;
        this.f108315i = new java.util.concurrent.CopyOnWriteArraySet();
        this.f108317n = new java.util.Vector();
        this.f108318o = new java.util.Vector();
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f108322s = hashMap;
        this.f108323t = 1;
        this.f108324u = 2;
        this.f108325v = 3;
        this.f108326w = 4;
        this.f108327x = jz5.h.b(new com.tencent.mm.plugin.finder.feed.model.o3(this));
        this.f108319p = activity;
        pf5.b a17 = pf5.u.f353936a.a(zy2.r5.class);
        ((com.tencent.mm.plugin.finder.feed.model.m) ((zy2.r5) a17)).f108163g = activity;
        hashMap.put(2, (com.tencent.mm.plugin.finder.feed.model.o9) a17);
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
            this.f108321r = new com.tencent.mm.plugin.finder.feed.us(mMActivity);
        }
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        fc2.t tVar;
        int i17;
        kotlin.jvm.internal.o.g(ev6, "ev");
        if ((ev6 instanceof fc2.t) && (i17 = (tVar = (fc2.t) ev6).f260985d) != 9) {
            if (i17 == 1) {
                f108312y = -1L;
            }
            long j17 = f108312y;
            java.lang.String str = this.f108313g;
            if (j17 != -1) {
                com.tencent.mars.xlog.Log.w(str, "isIgnorePreloadForFeedId");
                return;
            }
            int i18 = tVar.f260987f;
            int i19 = this.f108314h + i18;
            com.tencent.mars.xlog.Log.i(str, "onEventHappen :" + ev6 + " firstItemPos:" + i18 + " lastItemPos:" + i19);
            if (i18 > i19) {
                return;
            } else {
                pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.q3(this, i18, i19, ev6));
            }
        }
    }

    public com.tencent.mm.plugin.finder.feed.model.p9 I0(long j17, int i17) {
        com.tencent.mm.plugin.finder.feed.model.o9 o9Var;
        com.tencent.mm.plugin.finder.feed.model.internal.a c17;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.HashMap hashMap = this.f108322s;
        if (!hashMap.containsKey(valueOf) || (o9Var = (com.tencent.mm.plugin.finder.feed.model.o9) hashMap.get(java.lang.Integer.valueOf(i17))) == null) {
            return null;
        }
        com.tencent.mm.plugin.finder.feed.model.m mVar = (com.tencent.mm.plugin.finder.feed.model.m) o9Var;
        long longValue = java.lang.Long.valueOf(j17).longValue();
        if (i17 == 1) {
            c17 = mVar.f108161e.c(longValue);
        } else {
            if (i17 != 2) {
                return null;
            }
            c17 = mVar.f108162f.c(longValue);
        }
        return c17;
    }

    public final com.tencent.mm.sdk.platformtools.n3 J0() {
        return (com.tencent.mm.sdk.platformtools.n3) this.f108327x.getValue();
    }

    public void L0(java.lang.String finderUsername) {
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        com.tencent.mars.xlog.Log.i(this.f108313g, "notifyLiveEnd: finderUsername=".concat(finderUsername));
        dk2.sg f17 = com.tencent.mm.plugin.finder.feed.model.i1.f107930a.f(finderUsername);
        if (f17 != null) {
            f17.f234084c = true;
            O0(kz5.b0.c(finderUsername));
        }
    }

    public void M0(java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.sdk.platformtools.n3 J0 = J0();
        int i17 = this.f108325v;
        J0.removeMessages(i17);
        J0().sendMessage(J0().obtainMessage(i17, userName));
    }

    public void N0(yz5.p pVar, androidx.recyclerview.widget.RecyclerView recyclerView) {
        com.tencent.mars.xlog.Log.i(this.f108313g, "onAttach");
        this.f108316m = pVar;
        for (java.util.Map.Entry entry : this.f108322s.entrySet()) {
            com.tencent.mm.plugin.finder.feed.model.o9 o9Var = (com.tencent.mm.plugin.finder.feed.model.o9) entry.getValue();
            int intValue = ((java.lang.Number) entry.getKey()).intValue();
            com.tencent.mm.plugin.finder.feed.model.m mVar = (com.tencent.mm.plugin.finder.feed.model.m) o9Var;
            mVar.getClass();
            com.tencent.mars.xlog.Log.i("Finder.AdInfoPreLoader", "onAttach");
            mVar.f108168o = intValue;
        }
        com.tencent.mm.plugin.finder.feed.q9 q9Var = this.f108321r;
        if (q9Var != null) {
            q9Var.a(recyclerView);
        }
    }

    public final void O0(java.util.List nameList) {
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
        kotlin.jvm.internal.o.g(nameList, "nameList");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.util.Iterator it = nameList.iterator();
        while (it.hasNext()) {
            sb6.append((java.lang.String) it.next());
            sb6.append(",");
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        java.lang.String Z = r26.n0.Z(sb7, ",");
        am.ia iaVar = feedUpdateEvent.f54252g;
        iaVar.f6924g = Z;
        iaVar.f6919b = 11;
        feedUpdateEvent.e();
    }

    @Override // im5.b
    public void keep(im5.a aVar) {
        this.f108315i.add(aVar);
    }

    public void onDetach() {
        com.tencent.mars.xlog.Log.i(this.f108313g, "onDetach");
        this.f108316m = null;
        java.util.Iterator it = this.f108322s.entrySet().iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.feed.model.m mVar = (com.tencent.mm.plugin.finder.feed.model.m) ((com.tencent.mm.plugin.finder.feed.model.o9) ((java.util.Map.Entry) it.next()).getValue());
            mVar.getClass();
            com.tencent.mars.xlog.Log.i("Finder.AdInfoPreLoader", "onDetach");
            mVar.f().removeCallbacksAndMessages(null);
            mVar.f108166m.clear();
            mVar.f108167n.clear();
            az2.j jVar = mVar.f108169p;
            if (jVar != null) {
                jVar.j();
            }
            mVar.f108163g = null;
            mVar.f108164h = null;
        }
        com.tencent.mm.plugin.finder.feed.q9 q9Var = this.f108321r;
        if (q9Var != null) {
            q9Var.c();
        }
        this.f108321r = null;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f108315i;
        java.util.Iterator it6 = copyOnWriteArraySet.iterator();
        while (it6.hasNext()) {
            ((im5.a) it6.next()).dead();
        }
        copyOnWriteArraySet.clear();
        this.f108317n.clear();
        J0().removeMessages(this.f108323t);
        J0().removeMessages(this.f108324u);
        J0().removeMessages(this.f108326w);
        this.f108318o.clear();
        this.f108320q = null;
        this.f108319p = null;
    }

    public s3(androidx.fragment.app.Fragment fragment) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f108313g = "FinderLiveNoticePreLoader";
        this.f108314h = 5;
        this.f108315i = new java.util.concurrent.CopyOnWriteArraySet();
        this.f108317n = new java.util.Vector();
        this.f108318o = new java.util.Vector();
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f108322s = hashMap;
        this.f108323t = 1;
        this.f108324u = 2;
        this.f108325v = 3;
        this.f108326w = 4;
        this.f108327x = jz5.h.b(new com.tencent.mm.plugin.finder.feed.model.o3(this));
        this.f108320q = fragment;
        pf5.b a17 = pf5.u.f353936a.a(zy2.r5.class);
        ((com.tencent.mm.plugin.finder.feed.model.m) ((zy2.r5) a17)).f108164h = fragment;
        hashMap.put(2, (com.tencent.mm.plugin.finder.feed.model.o9) a17);
        androidx.fragment.app.FragmentActivity activity = fragment.getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
            this.f108321r = new com.tencent.mm.plugin.finder.feed.us(mMActivity);
        }
    }
}
