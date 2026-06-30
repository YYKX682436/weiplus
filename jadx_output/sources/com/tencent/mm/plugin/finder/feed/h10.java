package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class h10 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.r10 f106876a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f106877b;

    public h10(com.tencent.mm.plugin.finder.feed.r10 r10Var, int i17) {
        this.f106876a = r10Var;
        this.f106877b = i17;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.plugin.finder.feed.r10 r10Var = this.f106876a;
            java.util.List<E> listOfType = r10Var.f107156e.getListOfType(com.tencent.mm.plugin.finder.model.BaseFinderFeed.class);
            int i17 = this.f106877b;
            if (i17 < 0 || i17 >= listOfType.size()) {
                return;
            }
            mu2.b.f331394a.a(r10Var.f107155d, "video_card", 0, ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) listOfType.get(i17)).getFeedObject().getId(), r10Var.f108867n, r10Var.f108868o);
        }
    }
}
