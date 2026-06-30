package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class f8 implements com.tencent.mm.plugin.finder.feed.x20, in5.x, in5.y, im5.b {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f106710d;

    /* renamed from: e, reason: collision with root package name */
    public final int f106711e;

    /* renamed from: f, reason: collision with root package name */
    public volatile com.tencent.mm.protobuf.g f106712f;

    /* renamed from: g, reason: collision with root package name */
    public int f106713g;

    /* renamed from: h, reason: collision with root package name */
    public int f106714h;

    /* renamed from: i, reason: collision with root package name */
    public int f106715i;

    /* renamed from: m, reason: collision with root package name */
    public int f106716m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.storage.FinderItem f106717n;

    /* renamed from: o, reason: collision with root package name */
    public fp0.t f106718o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f106719p;

    /* renamed from: q, reason: collision with root package name */
    public yw2.f f106720q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f106721r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f106722s;

    /* renamed from: t, reason: collision with root package name */
    public r45.ri0 f106723t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f106724u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f106725v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.FinderFavListDrawerPresenter$thanksUpdateListener$1 f106726w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.n7 f106727x;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.feed.FinderFavListDrawerPresenter$thanksUpdateListener$1] */
    public f8(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f106710d = context;
        this.f106711e = (int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        this.f106719p = new java.util.ArrayList();
        c01.z1.r();
        this.f106721r = new java.util.concurrent.CopyOnWriteArraySet();
        this.f106725v = true;
        this.f106726w = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderThanksUpdateEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.finder.feed.FinderFavListDrawerPresenter$thanksUpdateListener$1
            {
                this.__eventId = 1097932050;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderThanksUpdateEvent finderThanksUpdateEvent) {
                com.tencent.mm.autogen.events.FinderThanksUpdateEvent event = finderThanksUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.md mdVar = event.f54333g;
                if (mdVar != null && mdVar.f7340d == 3) {
                    pm0.v.X(new com.tencent.mm.plugin.finder.feed.e8(mdVar != null ? jz5.x.a(mdVar.f7337a) : null, mdVar != null ? mdVar.f7339c : null, com.tencent.mm.plugin.finder.feed.f8.this, event));
                }
                return false;
            }
        };
        this.f106727x = new com.tencent.mm.plugin.finder.feed.n7(this);
    }

    public static void d(com.tencent.mm.plugin.finder.feed.f8 f8Var, boolean z17, yz5.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        fp0.t tVar = f8Var.f106718o;
        if (tVar != null) {
            tVar.b(new fp0.r(new com.tencent.mm.plugin.finder.feed.y7(z17, f8Var, lVar), null, 2, null));
        }
    }

    public final com.tencent.mm.plugin.finder.storage.FinderItem a() {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f106717n;
        if (finderItem != null) {
            return finderItem;
        }
        kotlin.jvm.internal.o.o("feedObj");
        throw null;
    }

    public void b() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        if (!this.f106722s) {
            com.tencent.mars.xlog.Log.i("Finder.FavListDrawerPresenter", "onDetach: cannot detach when have not attached");
            return;
        }
        android.content.Context context = this.f106710d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.uo) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.uo.class)).P6();
        this.f106722s = false;
        fp0.t tVar = this.f106718o;
        if (tVar != null) {
            tVar.f();
        }
        this.f106718o = null;
        dead();
        java.util.Iterator it = this.f106721r.iterator();
        while (it.hasNext()) {
            ((im5.a) it.next()).dead();
        }
        this.f106721r.clear();
        this.f106719p.clear();
        this.f106712f = null;
        this.f106724u = false;
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "set upContinue false");
        f(true);
        yw2.f fVar = this.f106720q;
        com.tencent.mm.view.RefreshLoadMoreLayout n17 = fVar != null ? fVar.n() : null;
        if (n17 != null) {
            n17.setHasBottomMore(true);
        }
        yw2.f fVar2 = this.f106720q;
        if (fVar2 != null && (recyclerView = fVar2.n().getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        yw2.f fVar3 = this.f106720q;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = fVar3 != null ? fVar3.n().getRecyclerView() : null;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutFrozen(true);
        }
        yw2.f fVar4 = this.f106720q;
        com.tencent.mm.view.RefreshLoadMoreLayout n18 = fVar4 != null ? fVar4.n() : null;
        if (n18 != null) {
            n18.setActionCallback(null);
        }
        this.f106720q = null;
    }

    @Override // in5.y
    public boolean c(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        return false;
    }

    public final void e(java.lang.String str, android.widget.TextView textView, int i17, int i18) {
        android.content.Context context = this.f106710d;
        int i19 = this.f106711e;
        java.lang.CharSequence k17 = hc2.x0.k(str, context, '#', i17, i18, i19, i19, 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        if (textView == null) {
            return;
        }
        textView.setText(k17);
    }

    public final void f(boolean z17) {
        this.f106725v = z17;
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "set downContinue " + z17);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.f8.g():void");
    }

    public final void h(java.lang.String str, int i17, java.lang.String str2, android.widget.TextView textView, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("Finder.FavListDrawerPresenter", "loadHighLightIcon: iconUrl" + str + " highLightColor:" + i17);
        mn2.g1 g1Var = mn2.g1.f329975a;
        wo0.c b17 = g1Var.e().b(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128355e), g1Var.h(mn2.f1.A));
        com.tencent.mm.plugin.finder.feed.a8 a8Var = new com.tencent.mm.plugin.finder.feed.a8(this, str2, textView, i18, i19, str);
        b17.getClass();
        b17.f447873d = a8Var;
        b17.f447879j = new com.tencent.mm.plugin.finder.feed.c8(str, this, str2, textView, i18, i19);
        b17.f447878i = new com.tencent.mm.plugin.finder.feed.d8(this, str2, textView, i18, i19);
        b17.f();
    }

    @Override // im5.b
    public void keep(im5.a aVar) {
        this.f106721r.add(aVar);
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        so2.c1 c1Var = (so2.c1) holder.f293125i;
        r45.s21 s21Var = c1Var != null ? c1Var.f410288d : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click likeInfo:");
        sb6.append(s21Var != null ? s21Var.f385429g : null);
        com.tencent.mars.xlog.Log.i("Finder.FavListDrawerPresenter", sb6.toString());
        if (s21Var != null) {
            java.lang.String str = s21Var.f385429g;
            java.lang.String str2 = str == null ? "" : str;
            long id6 = a().getId();
            java.lang.String dupFlag = a().getDupFlag();
            java.lang.String nonceId = a().getObjectNonceId();
            java.lang.String str3 = s21Var.f385428f;
            java.lang.String str4 = str3 != null ? str3 : "";
            kotlin.jvm.internal.o.g(nonceId, "nonceId");
            android.content.Intent intent = new android.content.Intent();
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str2);
            android.content.Context context = holder.f293121e;
            if (!K0) {
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                if (kotlin.jvm.internal.o.b(str2, xy2.c.e(context))) {
                    intent.putExtra("IsPoster", true);
                    intent.putExtra("feedUser", str2);
                    intent.putExtra("Action", 1);
                    intent.putExtra("Avatar", s21Var.f385427e);
                    intent.putExtra("Nickname", s21Var.f385426d);
                    intent.putExtra("FeedId", id6);
                    intent.putExtra("DupFlag", dupFlag);
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    intent.putExtra("feedUser", xy2.c.e(context));
                    intent.putExtra("FeedNonceId", nonceId);
                    intent.putExtra("FavId", str4);
                    intent.putExtra("IsPoster", true);
                    intent.putExtra("V5UserName", s21Var.f385429g);
                    intent.putExtra("isFingerLike", true);
                    i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    com.tencent.mm.plugin.finder.assist.i0.sl((com.tencent.mm.plugin.finder.assist.i0) c17, context, str2, intent, 8, null, 16, null);
                }
            }
            intent.putExtra("IsPoster", false);
            intent.putExtra("Action", 1);
            intent.putExtra("Avatar", s21Var.f385427e);
            intent.putExtra("Nickname", s21Var.f385426d);
            intent.putExtra("FeedId", id6);
            intent.putExtra("DupFlag", dupFlag);
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            intent.putExtra("feedUser", xy2.c.e(context));
            intent.putExtra("FeedNonceId", nonceId);
            intent.putExtra("FavId", str4);
            intent.putExtra("IsPoster", true);
            intent.putExtra("V5UserName", s21Var.f385429g);
            intent.putExtra("isFingerLike", true);
            i95.m c172 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            kotlin.jvm.internal.o.f(c172, "getService(...)");
            com.tencent.mm.plugin.finder.assist.i0.sl((com.tencent.mm.plugin.finder.assist.i0) c172, context, str2, intent, 8, null, 16, null);
        }
    }
}
