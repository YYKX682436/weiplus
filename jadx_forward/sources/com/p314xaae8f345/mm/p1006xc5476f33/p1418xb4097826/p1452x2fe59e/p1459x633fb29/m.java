package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class m implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o9, zy2.r5 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f189693d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f f189694e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f f189695f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Activity f189696g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f189697h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f189698i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f189699m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Set f189700n;

    /* renamed from: o, reason: collision with root package name */
    public int f189701o;

    /* renamed from: p, reason: collision with root package name */
    public az2.j f189702p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f189703q;

    public m() {
        this.f189693d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.j.f189610d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f fVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p.f189768a;
        this.f189694e = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p.f189768a;
        this.f189695f = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p.f189769b;
        this.f189698i = "";
        this.f189699m = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f189700n = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.f189703q = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i(this));
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.m mVar, android.os.Message message) {
        mVar.getClass();
        java.lang.Object obj = message.obj;
        java.util.List list = obj instanceof java.util.List ? (java.util.List) obj : null;
        if (list == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdInfoPreLoader", "type error: not list");
            return;
        }
        synchronized (mVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdInfoPreLoader", "batchLoad request ids size = " + list.size());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (true) {
                boolean z17 = true;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                jz5.l lVar = (jz5.l) next;
                boolean contains = mVar.f189700n.contains(java.lang.Long.valueOf(((java.lang.Number) lVar.f384366d).longValue()));
                boolean contains2 = mVar.f189699m.contains(lVar.f384366d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdInfoPreLoader", "id: " + pm0.v.u(((java.lang.Number) lVar.f384366d).longValue()) + " isInCache " + contains + " isInLoading:" + contains2);
                if (contains2 || contains) {
                    z17 = false;
                }
                if (z17) {
                    arrayList.add(next);
                }
            }
            java.util.LinkedList linkedList = new java.util.LinkedList(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdInfoPreLoader", "filteredIds size = " + linkedList.size());
            if (!linkedList.isEmpty()) {
                java.util.List list2 = mVar.f189699m;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    arrayList2.add(java.lang.Long.valueOf(((java.lang.Number) ((jz5.l) it6.next()).f384366d).longValue()));
                }
                list2.addAll(arrayList2);
                android.content.Context context = mVar.f189696g;
                if (context == null) {
                    p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = mVar.f189697h;
                    context = componentCallbacksC1101xa17d4670 != null ? componentCallbacksC1101xa17d4670.mo7430x19263085() : null;
                }
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
                android.content.Context context2 = mVar.f189696g;
                if (context2 == null) {
                    p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = mVar.f189697h;
                    context2 = componentCallbacksC1101xa17d46702 != null ? componentCallbacksC1101xa17d46702.mo7430x19263085() : null;
                }
                if (abstractActivityC21394xb3d2c0cf != null && !abstractActivityC21394xb3d2c0cf.isFinishing()) {
                    c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
                    int i17 = mVar.f189701o;
                    int i18 = i17 != 1 ? i17 != 2 ? -1 : 4 : 2;
                    int e17 = mVar.e();
                    java.lang.String finderUserName = xy2.c.e(abstractActivityC21394xb3d2c0cf);
                    java.lang.String g17 = mVar.g();
                    if (g17 == null) {
                        g17 = "";
                    }
                    r45.qt2 wi6 = context2 != null ? ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).wi(context2) : null;
                    ((b92.d1) zbVar).getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
                    db2.u uVar = new db2.u(linkedList, i18, e17, finderUserName, g17, wi6);
                    uVar.l().q(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.g(mVar)).f(abstractActivityC21394xb3d2c0cf);
                    mVar.f189702p = uVar;
                }
            }
        }
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.m mVar, java.util.ArrayList arrayList, int i17) {
        mVar.getClass();
        if (arrayList != null) {
            if (!(!arrayList.isEmpty())) {
                arrayList = null;
            }
            if (arrayList != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdInfoPreLoader", "type: " + i17 + ", publishEvent size:" + arrayList.size());
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    long longValue = ((java.lang.Number) it.next()).longValue();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdInfoPreLoader", "type: " + i17 + " publishEvent id :" + longValue);
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
                    am.ia iaVar = c5445x963cab3.f135785g;
                    iaVar.f88451a = longValue;
                    iaVar.f88452b = i17;
                    c5445x963cab3.e();
                }
            }
        }
    }

    public final void c(r45.dl2 dl2Var, java.util.ArrayList arrayList) {
        java.util.LinkedList<java.lang.String> m75941xfb821914 = dl2Var.m75941xfb821914(2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.a aVar = null;
        if (m75941xfb821914 != null) {
            for (java.lang.String str : m75941xfb821914) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("{}", str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdInfoPreLoader", "mutual info is empty return");
                    return;
                }
                cl0.g gVar = new cl0.g(str);
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("3021461725186497", gVar.opt("ad_posid"))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdInfoPreLoader", "not h5 type pos id");
                }
                aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.a(dl2Var.m75942xfb822ef2(0), gVar);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdInfoPreLoader", "save mutual cache and notify adCache:" + aVar);
        if (aVar != null) {
            long m75942xfb822ef2 = dl2Var.m75942xfb822ef2(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f fVar = this.f189694e;
            if (fVar.b(m75942xfb822ef2)) {
                fVar.d(m75942xfb822ef2);
            }
            fVar.a(aVar);
            arrayList.add(java.lang.Long.valueOf(m75942xfb822ef2));
        }
    }

    public final void d(r45.dl2 dl2Var, java.util.ArrayList arrayList) {
        java.util.LinkedList<java.lang.String> m75941xfb821914 = dl2Var.m75941xfb821914(3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.b bVar = null;
        if (m75941xfb821914 != null) {
            for (java.lang.String str : m75941xfb821914) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("{}", str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdInfoPreLoader", "sns info is empty return");
                    return;
                }
                bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.b(dl2Var.m75942xfb822ef2(0), new cl0.g(str));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdInfoPreLoader", "save sns cache and notify " + bVar);
        if (bVar != null) {
            long m75942xfb822ef2 = dl2Var.m75942xfb822ef2(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f fVar = this.f189695f;
            if (fVar.b(m75942xfb822ef2)) {
                fVar.d(m75942xfb822ef2);
            }
            fVar.a(bVar);
            arrayList.add(java.lang.Long.valueOf(m75942xfb822ef2));
        }
    }

    public final int e() {
        android.content.Context context = this.f189696g;
        if (context == null) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f189697h;
            context = (componentCallbacksC1101xa17d4670 == null || componentCallbacksC1101xa17d4670 == null) ? null : componentCallbacksC1101xa17d4670.mo7430x19263085();
        }
        int i17 = 0;
        if (context != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            if (nyVar != null) {
                i17 = nyVar.V6().m75939xb282bd08(5);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdInfoPreLoader", "commentScene: " + i17);
        return i17;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) this.f189703q.mo141623x754a37bb();
    }

    public final java.lang.String g() {
        android.app.Activity activity = this.f189696g;
        java.lang.String str = "";
        if (activity != null) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = activity instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                java.lang.String X6 = nyVar != null ? nyVar.X6() : null;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(X6)) {
                    cl0.g b17 = new cl0.g(X6).b("sns_ad");
                    java.lang.String mo15082x48bce8a4 = b17 != null ? b17.mo15082x48bce8a4("uxinfo") : null;
                    if (mo15082x48bce8a4 != null) {
                        str = mo15082x48bce8a4;
                    }
                }
            } catch (cl0.f e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.AdInfoPreLoader", e17, "parse json error", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdInfoPreLoader", "getUxInfo: ".concat(str));
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? str : this.f189698i;
    }

    public final void h(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        f().mo50303x856b99f0(1001);
        f().mo50308x2936bf5f(f().mo50292x733c63a2(1001, new jz5.l(arrayList, arrayList2)));
    }

    public m(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f189693d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.j.f189610d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f fVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p.f189768a;
        this.f189694e = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p.f189768a;
        this.f189695f = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p.f189769b;
        this.f189698i = "";
        this.f189699m = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f189700n = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.f189703q = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i(this));
        this.f189696g = activity;
    }

    public m(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f189693d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.j.f189610d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f fVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p.f189768a;
        this.f189694e = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p.f189768a;
        this.f189695f = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p.f189769b;
        this.f189698i = "";
        this.f189699m = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f189700n = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.f189703q = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i(this));
        this.f189697h = fragment;
    }
}
