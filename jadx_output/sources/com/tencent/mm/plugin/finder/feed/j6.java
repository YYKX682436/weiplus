package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class j6 implements com.tencent.mm.plugin.finder.view.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f107088a;

    public j6(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        this.f107088a = a7Var;
    }

    @Override // com.tencent.mm.plugin.finder.view.p0
    public void a(so2.y0 commentItem, boolean z17) {
        kotlin.jvm.internal.o.g(commentItem, "commentItem");
        this.f107088a.E0(commentItem, z17);
    }

    @Override // com.tencent.mm.plugin.finder.view.p0
    public void b(so2.y0 commentItem, boolean z17) {
        kotlin.jvm.internal.o.g(commentItem, "commentItem");
        this.f107088a.D(commentItem, z17);
    }

    @Override // com.tencent.mm.plugin.finder.view.p0
    public void c(so2.y0 commentItem) {
        kotlin.jvm.internal.o.g(commentItem, "commentItem");
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f107088a;
        db5.e1.n(a7Var.f106207d, com.tencent.mm.R.string.eyd, 0, new com.tencent.mm.plugin.finder.feed.g3(a7Var, commentItem), null);
    }

    @Override // com.tencent.mm.plugin.finder.view.p0
    public void d(so2.y0 commentItem, boolean z17) {
        kotlin.jvm.internal.o.g(commentItem, "commentItem");
        this.f107088a.I0(commentItem, z17);
    }

    @Override // com.tencent.mm.plugin.finder.view.p0
    public void e(so2.y0 commentItem) {
        kotlin.jvm.internal.o.g(commentItem, "commentItem");
        this.f107088a.r0(commentItem);
    }

    @Override // com.tencent.mm.plugin.finder.view.p0
    public void f(so2.y0 commentItem) {
        kotlin.jvm.internal.o.g(commentItem, "commentItem");
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f107088a;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = a7Var.f106214m;
        if (baseFinderFeed != null) {
            a7Var.G0(baseFinderFeed, commentItem.getItemId(), commentItem);
        } else {
            kotlin.jvm.internal.o.o("finderFeed");
            throw null;
        }
    }
}
