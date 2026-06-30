package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/tencent/mm/plugin/finder/convert/BaseFinderColumnCardLayoutHelper$FeedChangeListener", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedUpdateEvent;", "Ljava/lang/ref/WeakReference;", "Lcom/tencent/mm/plugin/finder/convert/d;", "helperRef", "<init>", "(Ljava/lang/ref/WeakReference;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.convert.BaseFinderColumnCardLayoutHelper$FeedChangeListener */
/* loaded from: classes2.dex */
public final class C13688x80228571 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3> {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f184354d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13688x80228571(java.lang.ref.WeakReference<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.d> helperRef) {
        super(com.p314xaae8f345.mm.app.a0.f134821d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helperRef, "helperRef");
        this.f184354d = helperRef;
        this.f39173x3fe91575 = 439877283;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 event = c5445x963cab3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.d dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.d) this.f184354d.get();
        if (dVar == null) {
            return false;
        }
        pm0.v.V(0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.a(event, dVar));
        return true;
    }
}
