package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderConversationFragment;", "Lcom/tencent/mm/plugin/finder/ui/FinderBaseConversationFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationFragment */
/* loaded from: classes10.dex */
public final class C15018xc6f0a959 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15012x2d1e2eca {
    public static final /* synthetic */ int I = 0;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g6 E;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15019xe8b65737 H;
    public final jz5.g C = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.x2(this));
    public final qb2.t D = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t80.f209599e.a();
    public final int[] F = {4};
    public final int G = 1;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.ui.FinderConversationFragment$notificationListener$1] */
    public C15018xc6f0a959() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.H = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5537xd455e288>(a0Var) { // from class: com.tencent.mm.plugin.finder.ui.FinderConversationFragment$notificationListener$1
            {
                this.f39173x3fe91575 = 1367267480;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5537xd455e288 c5537xd455e288) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5537xd455e288 event = c5537xd455e288;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.hd hdVar = event.f135861g;
                if (hdVar == null) {
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBaseConversationFragment", "[notificationListener] brief:" + hdVar.f88364a + ", time:" + hdVar.f88365b);
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15018xc6f0a959.I;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15018xc6f0a959 c15018xc6f0a959 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15018xc6f0a959.this;
                c15018xc6f0a959.N0();
                android.view.View view = c15018xc6f0a959.f287834h;
                if (view == null) {
                    return true;
                }
                view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.s2(c15018xc6f0a959));
                return true;
            }
        };
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15012x2d1e2eca
    public void L0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g6 g6Var = this.E;
        boolean z17 = false;
        if (g6Var != null && g6Var.a()) {
            z17 = true;
        }
        if (z17) {
            M0();
        }
    }

    public final void M0() {
        java.lang.String str;
        android.content.Intent intent;
        r45.qt2 qt2Var = null;
        m92.b I1 = g92.a.I1(g92.b.f351302e, false, 1, null);
        int i17 = I1 != null ? I1.f68721x6e5f342 : 0;
        if (i17 > 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Ej(i17, 1L);
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
            if (mo7430x19263085 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = mo7430x19263085 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x19263085).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                if (nyVar != null) {
                    qt2Var = nyVar.V6();
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.uj(o3Var, "11", 4, 1, 5, 0, i17, null, null, 0L, qt2Var, 0, 0, 3520, null);
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Ej(0, 1L);
        }
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630852 = mo7430x19263085();
        if (mo7430x192630852 == null || (intent = mo7430x192630852.getIntent()) == null || (str = intent.getStringExtra("key_context_id")) == null) {
            str = "";
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Xk(str, 0);
    }

    public final void N0() {
        java.util.List b17;
        boolean b18 = bq.q0.f105046t.b();
        qb2.t tVar = this.D;
        if (b18) {
            tVar.f65871xa783a79b = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LATEST_NOTIFICATION_TIME_LONG_SYNC, 0L) * 1000;
            tVar.f65853xf66fcca9 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LATEST_NOTIFICATION_BRIEF_STRING_SYNC, "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBaseConversationFragment", "newSysMsg, digest: " + tVar.f65853xf66fcca9);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            cu2.a0 a0Var = cu2.b0.f303904a;
            b17 = a0Var.b(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, 1, (r18 & 4) != 0 ? new int[0] : this.F, this.G, (java.lang.String) ((jz5.n) this.f210043w).mo141623x754a37bb(), (r18 & 32) != 0 ? 0 : 0);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = b17.iterator();
            while (it.hasNext()) {
                so2.i j17 = a0Var.j((dm.pd) it.next());
                if (j17 != null) {
                    arrayList2.add(j17);
                }
            }
            arrayList.addAll(arrayList2);
            if (!arrayList.isEmpty()) {
                r45.rk2 rk2Var = ((so2.i) arrayList.get(0)).f491944d.f66107x7dac62e;
                tVar.f65871xa783a79b = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LATEST_NOTIFICATION_TIME_LONG_SYNC, ((so2.i) arrayList.get(0)).f491944d.f66080xac3be4e) * 1000;
                tVar.f65853xf66fcca9 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LATEST_NOTIFICATION_BRIEF_STRING_SYNC, rk2Var.m75945x2fec8307(0));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBaseConversationFragment", "sysMsg, digest: " + tVar.f65853xf66fcca9);
            }
        }
        m92.b I1 = g92.a.I1(g92.b.f351302e, false, 1, null);
        tVar.f65870xa35b5abb = I1 != null ? I1.f68721x6e5f342 : 0;
        tVar.f65861x9b4f418d = 0;
    }

    @Override // com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public java.util.Set l0() {
        return kz5.o1.c(dv2.h.class);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15012x2d1e2eca, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityResult */
    public void mo7496x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == 1) {
            wn.a w07 = w0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(w07, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversationAdapter");
            ((qb2.b0) w07).J("findersayhisessionholder");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15012x2d1e2eca, com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        zy2.z8 S = ((c61.l7) i95.n0.c(c61.l7.class)).nk().S();
        android.content.Context mo7438x76847179 = mo7438x76847179();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.e1) S).h(mo7438x76847179 != null ? xy2.c.e(mo7438x76847179) : null, zy2.y8.f559151n);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g6 g6Var = this.E;
        if (g6Var != null) {
            g6Var.f206532d = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b bVar = g6Var.f206535g;
            if (bVar != null) {
                bVar.f206489a = false;
                bVar.f206490b = null;
            }
            g6Var.f206588h = null;
        }
        mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15012x2d1e2eca, com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        android.view.View view = this.f287834h;
        if (view != null) {
            view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.w2(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15012x2d1e2eca, com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (w0() instanceof qb2.i0) {
            java.lang.String m7467x2fec8307 = m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.cqn);
            qb2.t tVar = this.D;
            tVar.F1 = m7467x2fec8307;
            tVar.f65866xbed8694c = "finder_system_message";
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.String str = tVar.F1;
            if (str == null) {
                str = "";
            }
            ((ke0.e) xVar).getClass();
            tVar.E1 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str);
            N0();
            wn.a w07 = w0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(w07, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversationFirstFixAdapter");
            ((qb2.i0) w07).f442755t.add(tVar);
        }
        super.mo7518x594b1124(view, bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g6 g6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b bVar = g6Var.f206535g;
        if (bVar != null) {
            bVar.f206490b = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.r2(this);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 conversationRecyclerView = ((vb2.g) ((jz5.n) this.C).mo141623x754a37bb()).f516139b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(conversationRecyclerView, "conversationRecyclerView");
        g6Var.f206532d = conversationRecyclerView;
        conversationRecyclerView.i(g6Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b bVar2 = g6Var.f206535g;
        if (bVar2 != null) {
            bVar2.f206489a = true;
        }
        if (conversationRecyclerView.mo7946xf939df19() instanceof qb2.i0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = conversationRecyclerView.mo7946xf939df19();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df19, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversationFirstFixAdapter");
            g6Var.f206588h = (qb2.i0) mo7946xf939df19;
        }
        this.E = g6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15012x2d1e2eca, com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public wn.a t0() {
        qb2.i0 i0Var = new qb2.i0(this);
        i0Var.f442710s = new qb2.l0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o2.f211100d);
        i0Var.f442709r = new qb2.g0(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p2(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.q2(this));
        return i0Var;
    }
}
