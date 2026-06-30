package com.tencent.mm.plugin.finder.ext;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/finder/ext/FinderEventExtKt$createListenerEventFlow$1$listener$1", "Lcom/tencent/mm/sdk/event/IListener;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FinderEventExtKt$createListenerEventFlow$1$listener$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.sdk.event.IEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u26.r0 f105320d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderEventExtKt$createListenerEventFlow$1$listener$1(u26.r0 r0Var, com.tencent.mm.app.a0 a0Var) {
        super(a0Var);
        this.f105320d = r0Var;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.sdk.event.IEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        ((u26.x) this.f105320d).e(event);
        return true;
    }
}
