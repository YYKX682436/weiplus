package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1436xaf3f8342.p1437x2e06d1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/config/base/FinderDynConfigMonitor;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/DynamicConfigUpdatedEvent;", "<init>", "()V", "plugin-finder-config_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.config.base.FinderDynConfigMonitor */
/* loaded from: classes5.dex */
public final class C13686x15c71625 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5313xa7be6d80> {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1436xaf3f8342.p1437x2e06d1.C13686x15c71625 f184350d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f184351e;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1436xaf3f8342.p1437x2e06d1.C13686x15c71625 c13686x15c71625 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1436xaf3f8342.p1437x2e06d1.C13686x15c71625();
        f184350d = c13686x15c71625;
        c13686x15c71625.mo48813x58998cd();
        f184351e = new java.util.concurrent.ConcurrentHashMap();
    }

    private C13686x15c71625() {
        super(com.p314xaae8f345.mm.app.a0.f134821d);
        this.f39173x3fe91575 = -443124368;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5313xa7be6d80 c5313xa7be6d80) {
        yz5.a aVar;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5313xa7be6d80 event = c5313xa7be6d80;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        for (java.util.Map.Entry entry : f184351e.entrySet()) {
            mb2.e eVar = (mb2.e) ((java.lang.ref.WeakReference) entry.getValue()).get();
            if (eVar != null) {
                eVar.a();
            }
            mb2.e eVar2 = (mb2.e) ((java.lang.ref.WeakReference) entry.getValue()).get();
            if (eVar2 != null && (aVar = ((mb2.a) eVar2).f406868c) != null) {
                aVar.mo152xb9724478();
            }
        }
        return false;
    }
}
