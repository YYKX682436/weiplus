package co2;

/* loaded from: classes2.dex */
public final class d implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ co2.k f43785a;

    public d(co2.k kVar) {
        this.f43785a = kVar;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        this.f43785a.O6().requestRefresh();
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        return com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(this.f43785a.O6(), false, 1, null);
    }
}
