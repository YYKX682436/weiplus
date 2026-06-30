package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class m implements com.tencent.mm.plugin.finder.feed.model.o9, zy2.r5 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f108160d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.f f108161e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.f f108162f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Activity f108163g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.fragment.app.Fragment f108164h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f108165i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f108166m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Set f108167n;

    /* renamed from: o, reason: collision with root package name */
    public int f108168o;

    /* renamed from: p, reason: collision with root package name */
    public az2.j f108169p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f108170q;

    public m() {
        this.f108160d = jz5.h.b(com.tencent.mm.plugin.finder.feed.model.j.f108077d);
        com.tencent.mm.plugin.finder.feed.model.f fVar = com.tencent.mm.plugin.finder.feed.model.p.f108235a;
        this.f108161e = com.tencent.mm.plugin.finder.feed.model.p.f108235a;
        this.f108162f = com.tencent.mm.plugin.finder.feed.model.p.f108236b;
        this.f108165i = "";
        this.f108166m = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f108167n = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.f108170q = jz5.h.b(new com.tencent.mm.plugin.finder.feed.model.i(this));
    }

    public static final void a(com.tencent.mm.plugin.finder.feed.model.m mVar, android.os.Message message) {
        mVar.getClass();
        java.lang.Object obj = message.obj;
        java.util.List list = obj instanceof java.util.List ? (java.util.List) obj : null;
        if (list == null) {
            com.tencent.mars.xlog.Log.i("Finder.AdInfoPreLoader", "type error: not list");
            return;
        }
        synchronized (mVar) {
            com.tencent.mars.xlog.Log.i("Finder.AdInfoPreLoader", "batchLoad request ids size = " + list.size());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (true) {
                boolean z17 = true;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                jz5.l lVar = (jz5.l) next;
                boolean contains = mVar.f108167n.contains(java.lang.Long.valueOf(((java.lang.Number) lVar.f302833d).longValue()));
                boolean contains2 = mVar.f108166m.contains(lVar.f302833d);
                com.tencent.mars.xlog.Log.i("Finder.AdInfoPreLoader", "id: " + pm0.v.u(((java.lang.Number) lVar.f302833d).longValue()) + " isInCache " + contains + " isInLoading:" + contains2);
                if (contains2 || contains) {
                    z17 = false;
                }
                if (z17) {
                    arrayList.add(next);
                }
            }
            java.util.LinkedList linkedList = new java.util.LinkedList(arrayList);
            com.tencent.mars.xlog.Log.i("Finder.AdInfoPreLoader", "filteredIds size = " + linkedList.size());
            if (!linkedList.isEmpty()) {
                java.util.List list2 = mVar.f108166m;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    arrayList2.add(java.lang.Long.valueOf(((java.lang.Number) ((jz5.l) it6.next()).f302833d).longValue()));
                }
                list2.addAll(arrayList2);
                android.content.Context context = mVar.f108163g;
                if (context == null) {
                    androidx.fragment.app.Fragment fragment = mVar.f108164h;
                    context = fragment != null ? fragment.getActivity() : null;
                }
                com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
                android.content.Context context2 = mVar.f108163g;
                if (context2 == null) {
                    androidx.fragment.app.Fragment fragment2 = mVar.f108164h;
                    context2 = fragment2 != null ? fragment2.getActivity() : null;
                }
                if (mMActivity != null && !mMActivity.isFinishing()) {
                    c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
                    int i17 = mVar.f108168o;
                    int i18 = i17 != 1 ? i17 != 2 ? -1 : 4 : 2;
                    int e17 = mVar.e();
                    java.lang.String finderUserName = xy2.c.e(mMActivity);
                    java.lang.String g17 = mVar.g();
                    if (g17 == null) {
                        g17 = "";
                    }
                    r45.qt2 wi6 = context2 != null ? ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).wi(context2) : null;
                    ((b92.d1) zbVar).getClass();
                    kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
                    db2.u uVar = new db2.u(linkedList, i18, e17, finderUserName, g17, wi6);
                    uVar.l().q(new com.tencent.mm.plugin.finder.feed.model.g(mVar)).f(mMActivity);
                    mVar.f108169p = uVar;
                }
            }
        }
    }

    public static final void b(com.tencent.mm.plugin.finder.feed.model.m mVar, java.util.ArrayList arrayList, int i17) {
        mVar.getClass();
        if (arrayList != null) {
            if (!(!arrayList.isEmpty())) {
                arrayList = null;
            }
            if (arrayList != null) {
                com.tencent.mars.xlog.Log.i("Finder.AdInfoPreLoader", "type: " + i17 + ", publishEvent size:" + arrayList.size());
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    long longValue = ((java.lang.Number) it.next()).longValue();
                    com.tencent.mars.xlog.Log.i("Finder.AdInfoPreLoader", "type: " + i17 + " publishEvent id :" + longValue);
                    com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
                    am.ia iaVar = feedUpdateEvent.f54252g;
                    iaVar.f6918a = longValue;
                    iaVar.f6919b = i17;
                    feedUpdateEvent.e();
                }
            }
        }
    }

    public final void c(r45.dl2 dl2Var, java.util.ArrayList arrayList) {
        java.util.LinkedList<java.lang.String> list = dl2Var.getList(2);
        com.tencent.mm.plugin.finder.feed.model.a aVar = null;
        if (list != null) {
            for (java.lang.String str : list) {
                if (kotlin.jvm.internal.o.b("{}", str)) {
                    com.tencent.mars.xlog.Log.i("Finder.AdInfoPreLoader", "mutual info is empty return");
                    return;
                }
                cl0.g gVar = new cl0.g(str);
                if (!kotlin.jvm.internal.o.b("3021461725186497", gVar.opt("ad_posid"))) {
                    com.tencent.mars.xlog.Log.i("Finder.AdInfoPreLoader", "not h5 type pos id");
                }
                aVar = new com.tencent.mm.plugin.finder.feed.model.a(dl2Var.getLong(0), gVar);
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.AdInfoPreLoader", "save mutual cache and notify adCache:" + aVar);
        if (aVar != null) {
            long j17 = dl2Var.getLong(0);
            com.tencent.mm.plugin.finder.feed.model.f fVar = this.f108161e;
            if (fVar.b(j17)) {
                fVar.d(j17);
            }
            fVar.a(aVar);
            arrayList.add(java.lang.Long.valueOf(j17));
        }
    }

    public final void d(r45.dl2 dl2Var, java.util.ArrayList arrayList) {
        java.util.LinkedList<java.lang.String> list = dl2Var.getList(3);
        com.tencent.mm.plugin.finder.feed.model.b bVar = null;
        if (list != null) {
            for (java.lang.String str : list) {
                if (kotlin.jvm.internal.o.b("{}", str)) {
                    com.tencent.mars.xlog.Log.i("Finder.AdInfoPreLoader", "sns info is empty return");
                    return;
                }
                bVar = new com.tencent.mm.plugin.finder.feed.model.b(dl2Var.getLong(0), new cl0.g(str));
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.AdInfoPreLoader", "save sns cache and notify " + bVar);
        if (bVar != null) {
            long j17 = dl2Var.getLong(0);
            com.tencent.mm.plugin.finder.feed.model.f fVar = this.f108162f;
            if (fVar.b(j17)) {
                fVar.d(j17);
            }
            fVar.a(bVar);
            arrayList.add(java.lang.Long.valueOf(j17));
        }
    }

    public final int e() {
        android.content.Context context = this.f108163g;
        if (context == null) {
            androidx.fragment.app.Fragment fragment = this.f108164h;
            context = (fragment == null || fragment == null) ? null : fragment.getActivity();
        }
        int i17 = 0;
        if (context != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar != null) {
                i17 = nyVar.V6().getInteger(5);
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.AdInfoPreLoader", "commentScene: " + i17);
        return i17;
    }

    public final com.tencent.mm.sdk.platformtools.n3 f() {
        return (com.tencent.mm.sdk.platformtools.n3) this.f108170q.getValue();
    }

    public final java.lang.String g() {
        android.app.Activity activity = this.f108163g;
        java.lang.String str = "";
        if (activity != null) {
            try {
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                java.lang.String X6 = nyVar != null ? nyVar.X6() : null;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(X6)) {
                    cl0.g b17 = new cl0.g(X6).b("sns_ad");
                    java.lang.String optString = b17 != null ? b17.optString("uxinfo") : null;
                    if (optString != null) {
                        str = optString;
                    }
                }
            } catch (cl0.f e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Finder.AdInfoPreLoader", e17, "parse json error", new java.lang.Object[0]);
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.AdInfoPreLoader", "getUxInfo: ".concat(str));
        return !com.tencent.mm.sdk.platformtools.t8.K0(str) ? str : this.f108165i;
    }

    public final void h(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        f().removeMessages(1001);
        f().sendMessage(f().obtainMessage(1001, new jz5.l(arrayList, arrayList2)));
    }

    public m(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f108160d = jz5.h.b(com.tencent.mm.plugin.finder.feed.model.j.f108077d);
        com.tencent.mm.plugin.finder.feed.model.f fVar = com.tencent.mm.plugin.finder.feed.model.p.f108235a;
        this.f108161e = com.tencent.mm.plugin.finder.feed.model.p.f108235a;
        this.f108162f = com.tencent.mm.plugin.finder.feed.model.p.f108236b;
        this.f108165i = "";
        this.f108166m = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f108167n = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.f108170q = jz5.h.b(new com.tencent.mm.plugin.finder.feed.model.i(this));
        this.f108163g = activity;
    }

    public m(androidx.fragment.app.Fragment fragment) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f108160d = jz5.h.b(com.tencent.mm.plugin.finder.feed.model.j.f108077d);
        com.tencent.mm.plugin.finder.feed.model.f fVar = com.tencent.mm.plugin.finder.feed.model.p.f108235a;
        this.f108161e = com.tencent.mm.plugin.finder.feed.model.p.f108235a;
        this.f108162f = com.tencent.mm.plugin.finder.feed.model.p.f108236b;
        this.f108165i = "";
        this.f108166m = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f108167n = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.f108170q = jz5.h.b(new com.tencent.mm.plugin.finder.feed.model.i(this));
        this.f108164h = fragment;
    }
}
