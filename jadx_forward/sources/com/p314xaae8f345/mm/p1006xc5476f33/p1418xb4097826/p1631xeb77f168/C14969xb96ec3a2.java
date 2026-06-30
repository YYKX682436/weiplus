package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/shopping/MiniProgramHalfScreenStatusChangeListener;", "Lcom/tencent/mm/plugin/appbrand/config/WeAppHalfScreenStatusChangeListener;", "Lzy2/ec;", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.shopping.MiniProgramHalfScreenStatusChangeListener */
/* loaded from: classes3.dex */
public class C14969xb96ec3a2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368 implements zy2.ec {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f207810f;

    /* renamed from: g, reason: collision with root package name */
    public int f207811g;

    public C14969xb96ec3a2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var, boolean z17) {
        super(z17);
        this.f207810f = new java.lang.ref.WeakReference(k0Var);
    }

    @Override // zy2.ec
    public void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("exitMiniPro style:");
        sb6.append(this.f207811g);
        sb6.append("! monitorHeightChanged: ");
        boolean z17 = this.f158929d;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramHalfScreenStatusChangeListener", sb6.toString());
        if (this.f207811g == 1 || z17) {
            m();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368
    public void c() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        dt2.a0 a0Var;
        this.f207811g = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) this.f207810f.get();
        if (k0Var instanceof fm2.c) {
            fm2.c cVar = (fm2.c) k0Var;
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m57689x106f9289 = cVar.m57689x106f9289();
            if (m57689x106f9289 != null) {
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = m57689x106f9289.m7481x7a6e8df6() ? m57689x106f9289 : null;
                if (componentCallbacksC1101xa17d4670 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3) pf5.z.f435481a.b(componentCallbacksC1101xa17d4670).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3.class)).U6();
                    um2.x5 m129745xca56ce03 = cVar.m129745xca56ce03();
                    if (m129745xca56ce03 != null) {
                        m129745xca56ce03.d0();
                    }
                }
            }
        } else if (k0Var instanceof fm2.a) {
            fm2.a aVar = (fm2.a) k0Var;
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m57689x106f92892 = aVar.m57689x106f9289();
            if (m57689x106f92892 != null) {
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = m57689x106f92892.m7481x7a6e8df6() ? m57689x106f92892 : null;
                if (componentCallbacksC1101xa17d46702 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1483xac8f1cfd.C14186x18d3b328) pf5.z.f435481a.b(componentCallbacksC1101xa17d46702).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1483xac8f1cfd.C14186x18d3b328.class)).S6();
                    sm2.o4 m129724xca56ce03 = aVar.m129724xca56ce03();
                    if (m129724xca56ce03 != null) {
                        m129724xca56ce03.Q();
                    }
                }
            }
        } else if (k0Var instanceof fm2.b) {
            fm2.b bVar = (fm2.b) k0Var;
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m57689x106f92893 = bVar.m57689x106f9289();
            if (m57689x106f92893 != null) {
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46703 = m57689x106f92893.m7481x7a6e8df6() ? m57689x106f92893 : null;
                if (componentCallbacksC1101xa17d46703 != null) {
                    ((te2.v1) pf5.z.f435481a.b(componentCallbacksC1101xa17d46703).a(te2.v1.class)).S6();
                    tm2.s2 m129734xca56ce03 = bVar.m129734xca56ce03();
                    if (m129734xca56ce03 != null) {
                        m129734xca56ce03.o();
                    }
                }
            }
        } else if (k0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1620xeb77f168.C14937x9aaf713e) {
            ws2.o m11220x7f570b99 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1620xeb77f168.C14937x9aaf713e) k0Var).m11220x7f570b99();
            m11220x7f570b99.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayBaseUIC", "pause");
            at2.u1 u1Var = m11220x7f570b99.f530642e;
            if (u1Var != null && (a0Var = u1Var.f95295q) != null) {
                a0Var.d();
            }
            at2.y1 y1Var = m11220x7f570b99.f530644g;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = m11220x7f570b99.f530625b;
            if (y1Var != null && (c22699x3dcdb352 = y1Var.f95315r) != null) {
                android.graphics.drawable.Drawable drawable = activityC0065xcd7aa112.getDrawable(com.p314xaae8f345.mm.R.raw.f79865xc8527e4c);
                com.p314xaae8f345.mm.ui.uk.f(drawable, -1);
                c22699x3dcdb352.setImageDrawable(drawable);
            }
            at2.y1 y1Var2 = m11220x7f570b99.f530644g;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = y1Var2 != null ? y1Var2.f95315r : null;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setContentDescription(activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.eau));
            }
            m11220x7f570b99.f530645h = true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onEnterFullScreen baseLivePluginLayout:");
        sb6.append(k0Var != null ? k0Var.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramHalfScreenStatusChangeListener", sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368
    public void d() {
        this.f207811g = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramHalfScreenStatusChangeListener", "onEnterHalfScreen!");
        m();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368
    public void i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11817xcfa25a95 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramHalfScreenStatusChangeListener", "onHeightChanged info:" + info + '!');
    }

    public final void m() {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m57689x106f9289;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) this.f207810f.get();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("exitMiniWindow baseLivePluginLayout:");
        sb6.append(k0Var != null ? k0Var.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramHalfScreenStatusChangeListener", sb6.toString());
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
