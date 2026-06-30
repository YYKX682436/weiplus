package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ac implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184401e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f184402f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f184403g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f184404h;

    public ac(android.view.View view, in5.s0 s0Var, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar) {
        this.f184400d = view;
        this.f184401e = s0Var;
        this.f184402f = i17;
        this.f184403g = i18;
        this.f184404h = qeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int height = this.f184400d.getHeight();
        in5.s0 s0Var = this.f184401e;
        int a17 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.a(s0Var.f374654e) - this.f184402f) + height;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[openCommentDrawer] offset=");
        sb6.append(a17);
        sb6.append(" itemBottom=");
        sb6.append(this.f184403g);
        sb6.append(" recyclerViewBottom=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = this.f184404h;
        sb6.append(qeVar.N.bottom);
        sb6.append(" editLayoutHeight=");
        sb6.append(height);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullConvert", sb6.toString());
        if (a17 > 0) {
            dw2.c0 c0Var = qeVar.f185891f.getS().f305236n;
            if (c0Var != null) {
                dw2.c0.h(c0Var, "openCommentDrawer", true, false, 4, null);
            }
            s0Var.o().mo7976xc291bbd2(0, a17);
        }
    }
}
