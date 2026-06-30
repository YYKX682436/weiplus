package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class s implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.c0 f108954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f108955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f108956f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f108957g;

    public s(com.tencent.mm.plugin.finder.feed.c0 c0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.ui.widget.dialog.k0 k0Var, int i17) {
        this.f108954d = c0Var;
        this.f108955e = baseFinderFeed;
        this.f108956f = k0Var;
        this.f108957g = i17;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        kotlin.jvm.internal.o.d(g4Var);
        this.f108954d.i(this.f108955e, g4Var, this.f108956f, this.f108957g);
    }
}
