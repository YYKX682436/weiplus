package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class q3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t4 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f168555d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f168556e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd f168557f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 f168558g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 f168559h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ li1.a f168560i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f168561m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 f168562n;

    public q3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var2, li1.a aVar, long j17) {
        this.f168562n = i3Var;
        this.f168557f = wdVar;
        this.f168558g = w2Var;
        this.f168559h = w2Var2;
        this.f168560i = aVar;
        this.f168561m = j17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t4
    public void Z5(boolean z17) {
        this.f168556e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37;
        if (this.f168555d || this.f168562n.f168234d) {
            return;
        }
        this.f168555d = true;
        if (this.f168562n.m52173x328fb10a() == 0) {
            return;
        }
        synchronized (this.f168562n.f168242o) {
            w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2) this.f168562n.f168243p.peekFirst();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar = this.f168557f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.SWITCH_TAB;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.RE_LAUNCH;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.AUTO_RE_LAUNCH;
        java.lang.Object obj = null;
        if (yo.a.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd[]{wdVar2, wdVar3, wdVar4}, wdVar)) {
            this.f168562n.i(w2Var, null);
        }
        boolean z17 = !this.f168556e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar5 = this.f168557f;
        boolean z18 = wdVar5 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.REDIRECT_TO || wdVar5 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.REWRITE_ROUTE || wdVar5 == wdVar2 || wdVar5 == wdVar3 || wdVar5 == wdVar4;
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = this.f168562n.m52168x74292566();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var2 = this.f168558g;
        objArr[1] = w2Var2 == null ? null : nf.z.a(w2Var2.mo14683xad58292c());
        objArr[2] = nf.z.a(this.f168559h.mo14683xad58292c());
        objArr[3] = java.lang.Boolean.valueOf(z17);
        objArr[4] = java.lang.Boolean.valueOf(z18);
        objArr[5] = this.f168557f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainer", "navigateToNext$navigateTask.run(), before switch page, appId[%s], out[%s] in[%s] animate[%b] close[%b] type[%s]", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var = this.f168562n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var3 = this.f168558g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var4 = this.f168559h;
        i3Var.getClass();
        if ((w2Var3 != null && w2Var3.B() && w2Var4.B() && w2Var3.getWindowId() == w2Var4.getWindowId()) && z18 && (mo14682x9dee9c37 = this.f168558g.mo14682x9dee9c37()) != null) {
            mo14682x9dee9c37.W2();
        }
        java.lang.Object k07 = this.f168562n.k0(w2Var, z17, z18, this.f168560i);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var2 = this.f168562n;
        final long j17 = this.f168561m;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var5 = this.f168559h;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar6 = this.f168557f;
        li1.a aVar = this.f168560i;
        if (w2Var5 == null) {
            i3Var2.getClass();
        } else {
            synchronized (i3Var2.f168242o) {
                i3Var2.f168243p.remove(w2Var5);
                i3Var2.f168243p.push(w2Var5);
                i3Var2.f168244q.remove(w2Var5);
            }
            w2Var5.bringToFront();
            i3Var2.requestLayout();
            i3Var2.invalidate();
            if (w2Var5.B() && !i3Var2.mo52154x9a3f0ba2().V) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainer", "skip page performForeground because runtime isn;t resumed ");
            } else if (w2Var5.I) {
                w2Var5.I = false;
                w2Var5.f168725J = false;
                w2Var5.G();
            }
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.i3$$i
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.LinkedList linkedList;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3.this;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var6 = w2Var5;
                    long j18 = j17;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar7 = wdVar6;
                    i3Var3.getClass();
                    w2Var6.s(j18, wdVar7);
                    synchronized (i3Var3.f168242o) {
                        linkedList = new java.util.LinkedList(i3Var3.f168246s);
                        i3Var3.f168246s.clear();
                    }
                    java.util.Iterator descendingIterator = linkedList.descendingIterator();
                    while (descendingIterator.hasNext()) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t4) descendingIterator.next()).run();
                        descendingIterator.remove();
                    }
                }
            };
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t4 n07 = i3Var2.n0(runnable);
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
        this.f168562n.Q(this.f168557f, w2Var, this.f168559h, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.z4(obj, k07));
        this.f168562n.F(w2Var, this.f168559h, this.f168557f);
    }
}
