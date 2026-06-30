package com.p314xaae8f345.mm.p819xedfae76a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/lifecycle/MMLifecycleExtensionKt$addOnDestroyObserver$1", "Landroidx/lifecycle/v;", "wechat-internal-support_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.lifecycle.MMLifecycleExtensionKt$addOnDestroyObserver$1 */
/* loaded from: classes4.dex */
public final class C10825x73454863 implements p012xc85e97e9.p093xedfae76a.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f150067d;

    public C10825x73454863(yz5.a aVar) {
        this.f150067d = aVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (event == p012xc85e97e9.p093xedfae76a.m.ON_DESTROY) {
            source.mo273xed6858b4().c(this);
            this.f150067d.mo152xb9724478();
        }
    }
}
