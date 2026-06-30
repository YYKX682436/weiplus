package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class s3 extends fc2.d implements im5.b, zy2.h8 {

    /* renamed from: y, reason: collision with root package name */
    public static long f189845y = -1;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f189846g;

    /* renamed from: h, reason: collision with root package name */
    public final int f189847h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f189848i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.p f189849m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Vector f189850n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Vector f189851o;

    /* renamed from: p, reason: collision with root package name */
    public android.app.Activity f189852p;

    /* renamed from: q, reason: collision with root package name */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f189853q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q9 f189854r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashMap f189855s;

    /* renamed from: t, reason: collision with root package name */
    public final int f189856t;

    /* renamed from: u, reason: collision with root package name */
    public final int f189857u;

    /* renamed from: v, reason: collision with root package name */
    public final int f189858v;

    /* renamed from: w, reason: collision with root package name */
    public final int f189859w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f189860x;

    public s3(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f189846g = "FinderLiveNoticePreLoader";
        this.f189847h = 5;
        this.f189848i = new java.util.concurrent.CopyOnWriteArraySet();
        this.f189850n = new java.util.Vector();
        this.f189851o = new java.util.Vector();
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f189855s = hashMap;
        this.f189856t = 1;
        this.f189857u = 2;
        this.f189858v = 3;
        this.f189859w = 4;
        this.f189860x = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o3(this));
        this.f189852p = activity;
        pf5.b a17 = pf5.u.f435469a.a(zy2.r5.class);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.m) ((zy2.r5) a17)).f189696g = activity;
        hashMap.put(2, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o9) a17);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
            this.f189854r = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.us(abstractActivityC21394xb3d2c0cf);
        }
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        fc2.t tVar;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if ((ev6 instanceof fc2.t) && (i17 = (tVar = (fc2.t) ev6).f342518d) != 9) {
            if (i17 == 1) {
                f189845y = -1L;
            }
            long j17 = f189845y;
            java.lang.String str = this.f189846g;
            if (j17 != -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "isIgnorePreloadForFeedId");
                return;
            }
            int i18 = tVar.f342520f;
            int i19 = this.f189847h + i18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onEventHappen :" + ev6 + " firstItemPos:" + i18 + " lastItemPos:" + i19);
            if (i18 > i19) {
                return;
            } else {
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.q3(this, i18, i19, ev6));
            }
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p9 I0(long j17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o9 o9Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a c17;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.HashMap hashMap = this.f189855s;
        if (!hashMap.containsKey(valueOf) || (o9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o9) hashMap.get(java.lang.Integer.valueOf(i17))) == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.m mVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.m) o9Var;
        long longValue = java.lang.Long.valueOf(j17).longValue();
        if (i17 == 1) {
            c17 = mVar.f189694e.c(longValue);
        } else {
            if (i17 != 2) {
                return null;
            }
            c17 = mVar.f189695f.c(longValue);
        }
        return c17;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 J0() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) this.f189860x.mo141623x754a37bb();
    }

    public void L0(java.lang.String finderUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f189846g, "notifyLiveEnd: finderUsername=".concat(finderUsername));
        dk2.sg f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189463a.f(finderUsername);
        if (f17 != null) {
            f17.f315617c = true;
            O0(kz5.b0.c(finderUsername));
        }
    }

    public void M0(java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 J0 = J0();
        int i17 = this.f189858v;
        J0.mo50303x856b99f0(i17);
        J0().mo50308x2936bf5f(J0().mo50292x733c63a2(i17, userName));
    }

    public void N0(yz5.p pVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f189846g, "onAttach");
        this.f189849m = pVar;
        for (java.util.Map.Entry entry : this.f189855s.entrySet()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o9 o9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o9) entry.getValue();
            int intValue = ((java.lang.Number) entry.getKey()).intValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.m mVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.m) o9Var;
            mVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdInfoPreLoader", "onAttach");
            mVar.f189701o = intValue;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q9 q9Var = this.f189854r;
        if (q9Var != null) {
            q9Var.a(c1163xf1deaba4);
        }
    }

    public final void O0(java.util.List nameList) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameList, "nameList");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.util.Iterator it = nameList.iterator();
        while (it.hasNext()) {
            sb6.append((java.lang.String) it.next());
            sb6.append(",");
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        java.lang.String Z = r26.n0.Z(sb7, ",");
        am.ia iaVar = c5445x963cab3.f135785g;
        iaVar.f88457g = Z;
        iaVar.f88452b = 11;
        c5445x963cab3.e();
    }

    @Override // im5.b
    /* renamed from: keep */
    public void mo46316x322b85(im5.a aVar) {
        this.f189848i.add(aVar);
    }

    /* renamed from: onDetach */
    public void m56497x3f5eee52() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f189846g, "onDetach");
        this.f189849m = null;
        java.util.Iterator it = this.f189855s.entrySet().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.m mVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.m) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o9) ((java.util.Map.Entry) it.next()).getValue());
            mVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdInfoPreLoader", "onDetach");
            mVar.f().mo50302x6b17ad39(null);
            mVar.f189699m.clear();
            mVar.f189700n.clear();
            az2.j jVar = mVar.f189702p;
            if (jVar != null) {
                jVar.j();
            }
            mVar.f189696g = null;
            mVar.f189697h = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q9 q9Var = this.f189854r;
        if (q9Var != null) {
            q9Var.c();
        }
        this.f189854r = null;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f189848i;
        java.util.Iterator it6 = copyOnWriteArraySet.iterator();
        while (it6.hasNext()) {
            ((im5.a) it6.next()).mo10668x2efc64();
        }
        copyOnWriteArraySet.clear();
        this.f189850n.clear();
        J0().mo50303x856b99f0(this.f189856t);
        J0().mo50303x856b99f0(this.f189857u);
        J0().mo50303x856b99f0(this.f189859w);
        this.f189851o.clear();
        this.f189853q = null;
        this.f189852p = null;
    }

    public s3(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f189846g = "FinderLiveNoticePreLoader";
        this.f189847h = 5;
        this.f189848i = new java.util.concurrent.CopyOnWriteArraySet();
        this.f189850n = new java.util.Vector();
        this.f189851o = new java.util.Vector();
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f189855s = hashMap;
        this.f189856t = 1;
        this.f189857u = 2;
        this.f189858v = 3;
        this.f189859w = 4;
        this.f189860x = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o3(this));
        this.f189853q = fragment;
        pf5.b a17 = pf5.u.f435469a.a(zy2.r5.class);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.m) ((zy2.r5) a17)).f189697h = fragment;
        hashMap.put(2, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o9) a17);
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = fragment.mo7430x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = mo7430x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo7430x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
            this.f189854r = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.us(abstractActivityC21394xb3d2c0cf);
        }
    }
}
