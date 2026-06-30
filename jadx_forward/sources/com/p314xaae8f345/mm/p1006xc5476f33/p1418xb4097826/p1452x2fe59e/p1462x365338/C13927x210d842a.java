package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1462x365338;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/tencent/mm/plugin/finder/feed/tips/FinderFeedTipsManagerUIC$EventObserver", "Landroidx/lifecycle/v;", "Led2/a;", "key", "<init>", "(Led2/i;Led2/a;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.tips.FinderFeedTipsManagerUIC$EventObserver */
/* loaded from: classes2.dex */
public final class C13927x210d842a implements p012xc85e97e9.p093xedfae76a.v {

    /* renamed from: d, reason: collision with root package name */
    public final ed2.a f190595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ed2.i f190596e;

    public C13927x210d842a(ed2.i iVar, ed2.a key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f190596e = iVar;
        this.f190595d = key;
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (event == p012xc85e97e9.p093xedfae76a.m.ON_DESTROY) {
            ed2.i iVar = this.f190596e;
            iVar.m158360xed6858b4().c(this);
            iVar.f332801d.remove(this.f190595d);
        }
    }
}
