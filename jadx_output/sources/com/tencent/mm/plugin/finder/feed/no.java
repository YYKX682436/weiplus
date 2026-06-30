package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class no implements fs2.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader f108587d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.to f108588e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.mo f108589f;

    public no(com.tencent.mm.ui.MMActivity context, com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader feedLoader) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feedLoader, "feedLoader");
        this.f108587d = feedLoader;
        this.f108589f = new com.tencent.mm.plugin.finder.feed.mo(this);
    }

    @Override // fs2.a
    public void onDetach() {
        this.f108587d.unregister(this.f108589f);
    }
}
