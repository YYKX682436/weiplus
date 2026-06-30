package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class u implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.c0 f109119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f109120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f109121f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f109122g;

    public u(com.tencent.mm.plugin.finder.feed.c0 c0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.ui.widget.dialog.k0 k0Var, in5.s0 s0Var) {
        this.f109119d = c0Var;
        this.f109120e = baseFinderFeed;
        this.f109121f = k0Var;
        this.f109122g = s0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        kotlin.jvm.internal.o.d(g4Var);
        this.f109119d.m(this.f109120e, g4Var, this.f109121f, this.f109122g);
        com.tencent.mm.plugin.finder.report.x3.f125432a.b(g4Var);
    }
}
