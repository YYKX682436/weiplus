package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/shopping/MiniProgramFullScreenStatusChangeListener;", "Lcom/tencent/mm/plugin/appbrand/config/WeAppHalfScreenStatusChangeListener;", "Lzy2/ec;", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.shopping.MiniProgramFullScreenStatusChangeListener */
/* loaded from: classes3.dex */
public final class C14968x4a39aafe extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368 implements zy2.ec {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f207809f;

    public C14968x4a39aafe(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var) {
        super(false, 1, null);
        this.f207809f = new java.lang.ref.WeakReference(k0Var);
    }

    @Override // zy2.ec
    public void a() {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m57689x106f9289;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramFullScreenStatusChangeListener", "exitMiniPro");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) this.f207809f.get();
        if (k0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramFullScreenStatusChangeListener", "exitMiniWindow baseLivePluginLayout:0, router is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramFullScreenStatusChangeListener", "exitMiniWindow baseLivePluginLayout:" + k0Var.hashCode());
        if (k0Var instanceof fm2.c) {
            fm2.c cVar = (fm2.c) k0Var;
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m57689x106f92892 = cVar.m57689x106f9289();
            if (m57689x106f92892 != null) {
                componentCallbacksC1101xa17d4670 = m57689x106f92892.m7481x7a6e8df6() ? m57689x106f92892 : null;
                if (componentCallbacksC1101xa17d4670 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3) pf5.z.f435481a.b(componentCallbacksC1101xa17d4670).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3.class)).T6();
                    dk2.ef.f314905a.o();
                    um2.x5 m129745xca56ce03 = cVar.m129745xca56ce03();
                    if (m129745xca56ce03 != null) {
                        m129745xca56ce03.b0();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!(k0Var instanceof fm2.a)) {
            if (!(k0Var instanceof fm2.b) || (m57689x106f9289 = ((fm2.b) k0Var).m57689x106f9289()) == null) {
                return;
            }
            componentCallbacksC1101xa17d4670 = m57689x106f9289.m7481x7a6e8df6() ? m57689x106f9289 : null;
            if (componentCallbacksC1101xa17d4670 != null) {
                ((te2.v1) pf5.z.f435481a.b(componentCallbacksC1101xa17d4670).a(te2.v1.class)).R6();
                dk2.ef.f314905a.o();
                return;
            }
            return;
        }
        fm2.a aVar = (fm2.a) k0Var;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m57689x106f92893 = aVar.m57689x106f9289();
        if (m57689x106f92893 != null) {
            componentCallbacksC1101xa17d4670 = m57689x106f92893.m7481x7a6e8df6() ? m57689x106f92893 : null;
            if (componentCallbacksC1101xa17d4670 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1483xac8f1cfd.C14186x18d3b328) pf5.z.f435481a.b(componentCallbacksC1101xa17d4670).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1483xac8f1cfd.C14186x18d3b328.class)).R6();
                sm2.o4 m129724xca56ce03 = aVar.m129724xca56ce03();
                if (m129724xca56ce03 != null) {
                    m129724xca56ce03.O(true);
                }
            }
        }
    }
}
