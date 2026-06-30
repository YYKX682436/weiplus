package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ac implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f102867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f102868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f102869f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f102870g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f102871h;

    public ac(android.view.View view, in5.s0 s0Var, int i17, int i18, com.tencent.mm.plugin.finder.convert.qe qeVar) {
        this.f102867d = view;
        this.f102868e = s0Var;
        this.f102869f = i17;
        this.f102870g = i18;
        this.f102871h = qeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int height = this.f102867d.getHeight();
        in5.s0 s0Var = this.f102868e;
        int a17 = (com.tencent.mm.sdk.platformtools.d2.a(s0Var.f293121e) - this.f102869f) + height;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[openCommentDrawer] offset=");
        sb6.append(a17);
        sb6.append(" itemBottom=");
        sb6.append(this.f102870g);
        sb6.append(" recyclerViewBottom=");
        com.tencent.mm.plugin.finder.convert.qe qeVar = this.f102871h;
        sb6.append(qeVar.N.bottom);
        sb6.append(" editLayoutHeight=");
        sb6.append(height);
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", sb6.toString());
        if (a17 > 0) {
            dw2.c0 c0Var = qeVar.f104358f.getS().f223703n;
            if (c0Var != null) {
                dw2.c0.h(c0Var, "openCommentDrawer", true, false, 4, null);
            }
            s0Var.o().smoothScrollBy(0, a17);
        }
    }
}
