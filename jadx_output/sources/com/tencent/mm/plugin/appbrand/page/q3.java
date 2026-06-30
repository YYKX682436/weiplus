package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class q3 implements com.tencent.mm.plugin.appbrand.page.t4 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f87022d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f87023e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.wd f87024f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w2 f87025g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w2 f87026h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ li1.a f87027i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f87028m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f87029n;

    public q3(com.tencent.mm.plugin.appbrand.page.i3 i3Var, com.tencent.mm.plugin.appbrand.page.wd wdVar, com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2, li1.a aVar, long j17) {
        this.f87029n = i3Var;
        this.f87024f = wdVar;
        this.f87025g = w2Var;
        this.f87026h = w2Var2;
        this.f87027i = aVar;
        this.f87028m = j17;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.t4
    public void Z5(boolean z17) {
        this.f87023e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.w2 w2Var;
        com.tencent.mm.plugin.appbrand.page.v5 currentPageView;
        if (this.f87022d || this.f87029n.f86701d) {
            return;
        }
        this.f87022d = true;
        if (this.f87029n.getPageCount() == 0) {
            return;
        }
        synchronized (this.f87029n.f86709o) {
            w2Var = (com.tencent.mm.plugin.appbrand.page.w2) this.f87029n.f86710p.peekFirst();
        }
        com.tencent.mm.plugin.appbrand.page.wd wdVar = this.f87024f;
        com.tencent.mm.plugin.appbrand.page.wd wdVar2 = com.tencent.mm.plugin.appbrand.page.wd.SWITCH_TAB;
        com.tencent.mm.plugin.appbrand.page.wd wdVar3 = com.tencent.mm.plugin.appbrand.page.wd.RE_LAUNCH;
        com.tencent.mm.plugin.appbrand.page.wd wdVar4 = com.tencent.mm.plugin.appbrand.page.wd.AUTO_RE_LAUNCH;
        java.lang.Object obj = null;
        if (yo.a.b(new com.tencent.mm.plugin.appbrand.page.wd[]{wdVar2, wdVar3, wdVar4}, wdVar)) {
            this.f87029n.i(w2Var, null);
        }
        boolean z17 = !this.f87023e;
        com.tencent.mm.plugin.appbrand.page.wd wdVar5 = this.f87024f;
        boolean z18 = wdVar5 == com.tencent.mm.plugin.appbrand.page.wd.REDIRECT_TO || wdVar5 == com.tencent.mm.plugin.appbrand.page.wd.REWRITE_ROUTE || wdVar5 == wdVar2 || wdVar5 == wdVar3 || wdVar5 == wdVar4;
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = this.f87029n.getAppId();
        com.tencent.mm.plugin.appbrand.page.w2 w2Var2 = this.f87025g;
        objArr[1] = w2Var2 == null ? null : nf.z.a(w2Var2.getCurrentUrl());
        objArr[2] = nf.z.a(this.f87026h.getCurrentUrl());
        objArr[3] = java.lang.Boolean.valueOf(z17);
        objArr[4] = java.lang.Boolean.valueOf(z18);
        objArr[5] = this.f87024f;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "navigateToNext$navigateTask.run(), before switch page, appId[%s], out[%s] in[%s] animate[%b] close[%b] type[%s]", objArr);
        com.tencent.mm.plugin.appbrand.page.i3 i3Var = this.f87029n;
        com.tencent.mm.plugin.appbrand.page.w2 w2Var3 = this.f87025g;
        com.tencent.mm.plugin.appbrand.page.w2 w2Var4 = this.f87026h;
        i3Var.getClass();
        if ((w2Var3 != null && w2Var3.B() && w2Var4.B() && w2Var3.getWindowId() == w2Var4.getWindowId()) && z18 && (currentPageView = this.f87025g.getCurrentPageView()) != null) {
            currentPageView.W2();
        }
        java.lang.Object k07 = this.f87029n.k0(w2Var, z17, z18, this.f87027i);
        final com.tencent.mm.plugin.appbrand.page.i3 i3Var2 = this.f87029n;
        final long j17 = this.f87028m;
        final com.tencent.mm.plugin.appbrand.page.w2 w2Var5 = this.f87026h;
        final com.tencent.mm.plugin.appbrand.page.wd wdVar6 = this.f87024f;
        li1.a aVar = this.f87027i;
        if (w2Var5 == null) {
            i3Var2.getClass();
        } else {
            synchronized (i3Var2.f86709o) {
                i3Var2.f86710p.remove(w2Var5);
                i3Var2.f86710p.push(w2Var5);
                i3Var2.f86711q.remove(w2Var5);
            }
            w2Var5.bringToFront();
            i3Var2.requestLayout();
            i3Var2.invalidate();
            if (w2Var5.B() && !i3Var2.getRuntime().V) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "skip page performForeground because runtime isn;t resumed ");
            } else if (w2Var5.I) {
                w2Var5.I = false;
                w2Var5.f87192J = false;
                w2Var5.G();
            }
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.i3$$i
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.LinkedList linkedList;
                    com.tencent.mm.plugin.appbrand.page.i3 i3Var3 = com.tencent.mm.plugin.appbrand.page.i3.this;
                    com.tencent.mm.plugin.appbrand.page.w2 w2Var6 = w2Var5;
                    long j18 = j17;
                    com.tencent.mm.plugin.appbrand.page.wd wdVar7 = wdVar6;
                    i3Var3.getClass();
                    w2Var6.s(j18, wdVar7);
                    synchronized (i3Var3.f86709o) {
                        linkedList = new java.util.LinkedList(i3Var3.f86713s);
                        i3Var3.f86713s.clear();
                    }
                    java.util.Iterator descendingIterator = linkedList.descendingIterator();
                    while (descendingIterator.hasNext()) {
                        ((com.tencent.mm.plugin.appbrand.page.t4) descendingIterator.next()).run();
                        descendingIterator.remove();
                    }
                }
            };
            if (z17) {
                com.tencent.mm.plugin.appbrand.page.t4 n07 = i3Var2.n0(runnable);
                if (aVar != null) {
                    i3Var2.i0(w2Var5, aVar, n07);
                    obj = aVar;
                } else {
                    obj = i3Var2.V(w2Var5);
                    i3Var2.i0(w2Var5, obj, n07);
                }
            } else {
                i3Var2.g(w2Var5);
                runnable.run();
            }
        }
        this.f87029n.Q(this.f87024f, w2Var, this.f87026h, new com.tencent.mm.plugin.appbrand.page.z4(obj, k07));
        this.f87029n.F(w2Var, this.f87026h, this.f87024f);
    }
}
