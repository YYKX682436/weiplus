package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1436xaf3f8342.p1437x2e06d1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/config/base/FinderSvrConfigMonitor;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/ConfigUpdatedEvent;", "<init>", "()V", "plugin-finder-config_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.config.base.FinderSvrConfigMonitor */
/* loaded from: classes5.dex */
public final class C13687xc737fdef extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5281xaccc9f21> {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1436xaf3f8342.p1437x2e06d1.C13687xc737fdef f184352d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f184353e;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1436xaf3f8342.p1437x2e06d1.C13687xc737fdef c13687xc737fdef = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1436xaf3f8342.p1437x2e06d1.C13687xc737fdef();
        f184352d = c13687xc737fdef;
        c13687xc737fdef.mo48813x58998cd();
        f184353e = new java.util.concurrent.ConcurrentHashMap(512);
    }

    private C13687xc737fdef() {
        super(com.p314xaae8f345.mm.app.a0.f134821d);
        this.f39173x3fe91575 = 320120113;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5281xaccc9f21 c5281xaccc9f21) {
        java.lang.ref.WeakReference weakReference;
        mb2.e eVar;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5281xaccc9f21 event = c5281xaccc9f21;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f184353e;
        if (concurrentHashMap != null) {
            am.k3 k3Var = event.f135605g;
            java.lang.String str = k3Var.f88659a;
            if (!(str == null || str.length() == 0) && (weakReference = (java.lang.ref.WeakReference) concurrentHashMap.get(k3Var.f88659a)) != null && (eVar = (mb2.e) weakReference.get()) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSvrConfigMonitor", "config: " + k3Var.f88659a + " has update");
                eVar.a();
                yz5.a aVar = ((mb2.a) eVar).f406868c;
                if (aVar != null) {
                    aVar.mo152xb9724478();
                }
            }
        }
        return false;
    }
}
