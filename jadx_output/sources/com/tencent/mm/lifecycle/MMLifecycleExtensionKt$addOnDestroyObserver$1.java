package com.tencent.mm.lifecycle;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/lifecycle/MMLifecycleExtensionKt$addOnDestroyObserver$1", "Landroidx/lifecycle/v;", "wechat-internal-support_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MMLifecycleExtensionKt$addOnDestroyObserver$1 implements androidx.lifecycle.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f68534d;

    public MMLifecycleExtensionKt$addOnDestroyObserver$1(yz5.a aVar) {
        this.f68534d = aVar;
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
        if (event == androidx.lifecycle.m.ON_DESTROY) {
            source.mo133getLifecycle().c(this);
            this.f68534d.invoke();
        }
    }
}
