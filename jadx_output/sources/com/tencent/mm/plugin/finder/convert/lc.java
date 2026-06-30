package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class lc implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f103913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f103914c;

    public lc(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, java.lang.String str) {
        this.f103912a = s0Var;
        this.f103913b = baseFinderFeed;
        this.f103914c = str;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        android.content.Context context = this.f103912a.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.util.Map c17 = d2Var.c(context);
        c17.putAll(kz5.c1.k(new jz5.l("feed_id", pm0.v.u(this.f103913b.getItemId())), new jz5.l("bubble_text", this.f103914c)));
        return c17;
    }
}
