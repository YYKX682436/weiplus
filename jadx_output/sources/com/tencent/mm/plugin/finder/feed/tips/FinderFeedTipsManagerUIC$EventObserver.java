package com.tencent.mm.plugin.finder.feed.tips;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/tencent/mm/plugin/finder/feed/tips/FinderFeedTipsManagerUIC$EventObserver", "Landroidx/lifecycle/v;", "Led2/a;", "key", "<init>", "(Led2/i;Led2/a;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFeedTipsManagerUIC$EventObserver implements androidx.lifecycle.v {

    /* renamed from: d, reason: collision with root package name */
    public final ed2.a f109062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ed2.i f109063e;

    public FinderFeedTipsManagerUIC$EventObserver(ed2.i iVar, ed2.a key) {
        kotlin.jvm.internal.o.g(key, "key");
        this.f109063e = iVar;
        this.f109062d = key;
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
        if (event == androidx.lifecycle.m.ON_DESTROY) {
            ed2.i iVar = this.f109063e;
            iVar.getLifecycle().c(this);
            iVar.f251268d.remove(this.f109062d);
        }
    }
}
