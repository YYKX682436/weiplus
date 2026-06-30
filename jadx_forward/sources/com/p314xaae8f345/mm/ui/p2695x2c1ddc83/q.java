package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class q implements kv.e0, l75.z0, c01.y8, s72.q0 {

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p971x6de15a2e.s0 f289515i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f289516m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f289517n;

    /* renamed from: o, reason: collision with root package name */
    public android.content.Context f289518o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ListView f289519p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f289520q;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f289510d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f289511e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f289512f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f289513g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f289514h = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public boolean f289521r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f289522s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f289523t = false;

    @Override // kv.e0
    public void U(java.lang.String str) {
        if (!gm0.j1.a() || gm0.m.r()) {
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((str == null ? "" : str).length() <= 0 || !str.equals(c01.z1.r())) {
            return;
        }
        h();
    }

    public final void a(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((s35.b) it.next()).a();
        }
        list.clear();
    }

    @Override // c01.y8
    public void a0() {
        h();
    }

    public final void b(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((s35.b) it.next()).d();
        }
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BannerHelper", "releaseBanner");
        if (this.f289523t) {
            this.f289523t = false;
            e(this.f289510d);
            e(this.f289511e);
            e(this.f289512f);
            e(this.f289513g);
            if (gm0.j1.a()) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().f152112a.j(this);
            }
            if (gm0.j1.a()) {
                c01.d9.b().p().e(this);
            }
        }
    }

    public final boolean d(java.util.List list, boolean z17) {
        java.util.Iterator it = list.iterator();
        boolean z18 = false;
        while (it.hasNext()) {
            s35.b bVar = (s35.b) it.next();
            if (bVar.i()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BannerHelper", "refreshAndReturnIsVisible[true] :%s, checkAll:%b, isVisible:%b, hc:%d", bVar, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(bVar.g()), java.lang.Integer.valueOf(hashCode()));
                z18 = true;
                if (!z17) {
                    return true;
                }
            } else if (bVar.g()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BannerHelper", "refreshAndReturnIsVisible[false] but visible :%s, checkAll:%b, hc:%d", bVar, java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(hashCode()));
            }
        }
        return z18;
    }

    public final void e(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((s35.b) it.next()).j();
        }
    }

    public final void f(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.widget.LinearLayout linearLayout = ((s35.b) it.next()).f484376h;
            if (linearLayout != null) {
                this.f289519p.removeHeaderView(linearLayout);
            }
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (gm0.j1.a() && a1Var == c01.d9.b().p()) {
            int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(obj, 0);
            if (8193 == o17) {
                h();
            }
            if (42 == o17) {
                h();
            }
        }
    }

    public void h() {
        if (this.f289521r && this.f289518o != null && gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BannerHelper", "updateBanner, :%d", java.lang.Integer.valueOf(hashCode()));
            boolean d17 = d(this.f289510d, true);
            boolean d18 = d(this.f289511e, true);
            java.util.List list = this.f289512f;
            boolean d19 = d(list, true);
            java.util.List list2 = this.f289513g;
            boolean z17 = d17 || d18 || d19 || d(list2, true);
            if (d18) {
                b(list);
                b(list2);
            } else if (d19) {
                b(list2);
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (s35.b bVar : this.f289514h) {
                if (bVar != null && bVar.g()) {
                    bVar.f484372d = false;
                    bVar.f484373e = false;
                    linkedList.add(bVar);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BannerHelper", "visibleList.size() = %s", java.lang.Integer.valueOf(linkedList.size()));
            if (linkedList.size() > 0) {
                ((s35.b) linkedList.getFirst()).f484372d = true;
                ((s35.b) linkedList.getLast()).f484373e = true;
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((s35.b) it.next()).i();
                }
            }
            if (!z17 || this.f289519p.getVisibility() == 0) {
                return;
            }
            this.f289519p.setVisibility(0);
            android.view.View view = this.f289520q;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/BannerHelper", "updateBanner", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/conversation/BannerHelper", "updateBanner", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
