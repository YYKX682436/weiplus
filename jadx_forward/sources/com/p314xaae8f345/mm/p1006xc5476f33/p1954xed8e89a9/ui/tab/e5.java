package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes11.dex */
public final class e5 extends p012xc85e97e9.p114xa324943e.p115xd1075a44.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 f235834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f235835e;

    public e5(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 c16892x4a36dc90, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f235834d = c16892x4a36dc90;
        this.f235835e = h0Var;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.p, p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        zy2.hb hbVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 c16892x4a36dc90 = this.f235834d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activity = c16892x4a36dc90.f235731d;
        gr3.c cVar = gr3.c.f356381a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String str = gr3.c.f356381a.b(activity) + "_tab_" + i17;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = gr3.c.f356383c;
        java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(str);
        if (l17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizProfileMonitor", "recordTabSwitchEnd: startTime is null for " + str);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(2127L, 20L, java.lang.System.currentTimeMillis() - l17.longValue(), false);
            concurrentHashMap.remove(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16916xb2db4a89 c16916xb2db4a89 = c16892x4a36dc90.C;
        if (c16916xb2db4a89 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("menuTabLayout");
            throw null;
        }
        c16916xb2db4a89.C(i17);
        if (c16892x4a36dc90.f235737l1 == null || this.f235835e.f391656d == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetTabBizInfo", "bobkw onPageSelected position " + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.t4 t4Var = c16892x4a36dc90.B;
        if (t4Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pagerAdapter");
            throw null;
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) kz5.n0.a0(t4Var.f236131i, i17);
        if (componentCallbacksC1101xa17d4670 != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(componentCallbacksC1101xa17d4670, c16892x4a36dc90.f235737l1)) {
                p012xc85e97e9.p093xedfae76a.m1 m1Var = c16892x4a36dc90.f235737l1;
                hbVar = m1Var instanceof zy2.hb ? (zy2.hb) m1Var : null;
                if (hbVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13680xb1b3046c) hbVar).Q0();
                    return;
                }
                return;
            }
            p012xc85e97e9.p093xedfae76a.m1 m1Var2 = c16892x4a36dc90.f235737l1;
            hbVar = m1Var2 instanceof zy2.hb ? (zy2.hb) m1Var2 : null;
            if (hbVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13680xb1b3046c) hbVar).P0();
            }
        }
    }
}
