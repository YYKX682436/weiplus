package com.tencent.mm.plugin.downloader_app.ui;

/* loaded from: classes8.dex */
public class TaskListView extends com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView implements xn5.a0 {

    /* renamed from: s2, reason: collision with root package name */
    public static final /* synthetic */ int f97417s2 = 0;

    /* renamed from: f2, reason: collision with root package name */
    public r02.r0 f97418f2;

    /* renamed from: g2, reason: collision with root package name */
    public final java.util.Map f97419g2;

    /* renamed from: h2, reason: collision with root package name */
    public r02.w f97420h2;

    /* renamed from: i2, reason: collision with root package name */
    public r02.v f97421i2;

    /* renamed from: j2, reason: collision with root package name */
    public boolean f97422j2;

    /* renamed from: k2, reason: collision with root package name */
    public r02.m0 f97423k2;

    /* renamed from: l2, reason: collision with root package name */
    public final com.tencent.mm.plugin.downloader_app.model.s f97424l2;

    /* renamed from: m2, reason: collision with root package name */
    public final com.tencent.mm.plugin.downloader_app.model.p f97425m2;

    /* renamed from: n2, reason: collision with root package name */
    public final com.tencent.mm.plugin.downloader_app.model.q f97426n2;

    /* renamed from: o2, reason: collision with root package name */
    public final com.tencent.mm.plugin.downloader_app.model.v f97427o2;

    /* renamed from: p2, reason: collision with root package name */
    public final com.tencent.mm.plugin.downloader_app.model.t f97428p2;

    /* renamed from: q2, reason: collision with root package name */
    public final com.tencent.mm.plugin.downloader_app.model.w f97429q2;

    /* renamed from: r2, reason: collision with root package name */
    public boolean f97430r2;

    public TaskListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f97419g2 = new java.util.HashMap();
        this.f97424l2 = new r02.t0(this);
        this.f97425m2 = new r02.u0(this);
        this.f97426n2 = new r02.v0(this);
        this.f97427o2 = new r02.w0(this);
        this.f97428p2 = new r02.x0(this);
        this.f97429q2 = new r02.y0(this);
        this.f97430r2 = true;
    }

    public int getSize() {
        return this.f97418f2.f368324d.size();
    }

    public void l1() {
        this.f97422j2 = false;
        r02.w wVar = this.f97420h2;
        if (wVar != null) {
            ((r02.m) wVar).a(false);
        }
        this.f97418f2.getClass();
        if (this.f97418f2.f368324d.size() <= 5) {
            ((com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI) getContext()).W6(true);
            return;
        }
        for (com.tencent.mm.plugin.downloader_app.model.r0 r0Var : ((java.util.HashMap) this.f97419g2).values()) {
            r0Var.f97312a = false;
            r0Var.f97313b = false;
        }
        r02.r0 r0Var2 = this.f97418f2;
        r0Var2.f368330m = true;
        r0Var2.notifyDataSetChanged();
        this.f97430r2 = true;
    }

    public final void m1(com.tencent.mm.plugin.downloader_app.model.r0 r0Var) {
        r02.r0 r0Var2 = this.f97418f2;
        r0Var2.f368324d.remove(r0Var);
        m43.e eVar = r0Var2.f368324d;
        synchronized (eVar.f323457d) {
            boolean z17 = false;
            int i17 = 0;
            while (true) {
                try {
                    if (i17 >= eVar.size()) {
                        i17 = 0;
                        break;
                    }
                    if (java.lang.Integer.compare(r0Var.f97314c, java.lang.Integer.valueOf(((com.tencent.mm.plugin.downloader_app.model.r0) ((m43.d) eVar.get(i17))).f97314c).intValue()) <= 0) {
                        z17 = true;
                        break;
                    }
                    i17++;
                } catch (java.lang.Throwable th6) {
                    throw th6;
                }
            }
            if (!z17) {
                i17 = eVar.size();
            }
            eVar.add(i17, r0Var);
        }
        com.tencent.mm.ipcinvoker.w0.c(true, new r02.n0(r0Var2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mm.plugin.downloader_app.model.s sVar = this.f97424l2;
        java.util.LinkedList linkedList = com.tencent.mm.plugin.downloader_app.model.x.f97337f;
        if (!linkedList.contains(sVar)) {
            linkedList.add(sVar);
        }
        com.tencent.mm.plugin.downloader_app.model.x.f97332a.add(this.f97425m2);
        com.tencent.mm.plugin.downloader_app.model.x.f97333b.add(this.f97426n2);
        com.tencent.mm.plugin.downloader_app.model.x.f97335d.add(this.f97427o2);
        com.tencent.mm.plugin.downloader_app.model.t tVar = this.f97428p2;
        java.util.LinkedList linkedList2 = com.tencent.mm.plugin.downloader_app.model.x.f97336e;
        if (!linkedList2.contains(tVar)) {
            linkedList2.add(tVar);
        }
        com.tencent.mm.plugin.downloader_app.model.w wVar = this.f97429q2;
        java.util.LinkedList linkedList3 = com.tencent.mm.plugin.downloader_app.model.x.f97338g;
        if (linkedList3.contains(wVar)) {
            return;
        }
        linkedList3.add(wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mm.plugin.downloader_app.model.x.f97337f.remove(this.f97424l2);
        com.tencent.mm.plugin.downloader_app.model.x.f97332a.remove(this.f97425m2);
        com.tencent.mm.plugin.downloader_app.model.x.f97333b.remove(this.f97426n2);
        com.tencent.mm.plugin.downloader_app.model.x.f97335d.remove(this.f97427o2);
        com.tencent.mm.plugin.downloader_app.model.x.f97336e.remove(this.f97428p2);
        com.tencent.mm.plugin.downloader_app.model.x.f97338g.remove(this.f97429q2);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        r02.r0 r0Var = new r02.r0(getContext());
        this.f97418f2 = r0Var;
        r0Var.f368331n = this.f97423k2;
        setAdapter(r0Var);
        N(new r02.z(getResources()));
        setOnItemLongClickListener(new r02.z0(this));
        setOnItemClickListener(new r02.a1(this));
    }

    public void setData(java.util.LinkedList<com.tencent.mm.plugin.downloader_app.model.r0> linkedList) {
        java.util.Iterator<com.tencent.mm.plugin.downloader_app.model.r0> it = linkedList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.downloader_app.model.r0 next = it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(next.f97317f)) {
                ((java.util.HashMap) this.f97419g2).put(next.f97317f, next);
            }
        }
        r02.r0 r0Var = this.f97418f2;
        m43.e eVar = r0Var.f368324d;
        eVar.clear();
        java.util.Iterator<com.tencent.mm.plugin.downloader_app.model.r0> it6 = linkedList.iterator();
        while (it6.hasNext()) {
            eVar.e(it6.next());
        }
        eVar.e(new com.tencent.mm.plugin.downloader_app.model.r0(1));
        eVar.e(new com.tencent.mm.plugin.downloader_app.model.r0(3));
        eVar.e(new com.tencent.mm.plugin.downloader_app.model.r0(5));
        eVar.e(new com.tencent.mm.plugin.downloader_app.model.r0(7));
        r0Var.notifyDataSetChanged();
    }

    public void setOnItemButtonClickListener(r02.m0 m0Var) {
        this.f97423k2 = m0Var;
        r02.r0 r0Var = this.f97418f2;
        if (r0Var != null) {
            r0Var.f368331n = m0Var;
        }
    }
}
