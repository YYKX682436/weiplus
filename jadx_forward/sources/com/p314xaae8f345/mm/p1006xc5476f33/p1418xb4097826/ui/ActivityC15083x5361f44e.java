package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderWxMsgUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderWxMsgUI */
/* loaded from: classes10.dex */
public final class ActivityC15083x5361f44e extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa {

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.ArrayList f210329u = kz5.c0.d(new int[]{7, 2, 8, 18, 25, 35, 36, 39}, new int[]{3, 5, 40});

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f210330v = {7, 8};

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyPresenter f210331t = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyPresenter(2, f210330v, f210329u);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: W6 */
    public int getD() {
        return 117;
    }

    public final boolean c7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.R6).mo141623x754a37bb()).r()).intValue() == 1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return !c7() ? kz5.z.D0(new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.cb0.class, hy2.f.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uo.class}) : kz5.z.D0(new java.lang.Class[]{hy2.f.class, vy2.e.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uo.class});
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        if (c7()) {
            mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.uk(this));
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.fsn);
        findViewById.setContentDescription(getString(com.p314xaae8f345.mm.R.C30867xcad56011.enf));
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.vk(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14770x86109c20 c14770x86109c20;
        super.onActivityResult(i17, i18, intent);
        if (!c7() || (c14770x86109c20 = this.f210331t.f204546p) == null) {
            return;
        }
        c14770x86109c20.e(i17, i17, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (c7()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut) ((zy2.k9) pf5.z.f435481a.a(this).c(zy2.k9.class))).f217710i = true;
            mo43517x10010bd5();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_MENTION_COMMENT_INT_SYNC, 0);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_MENTION_LIKE_INT_SYNC, 0);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_MENTION_OBJECT_LIEK_LIKE_INT_SYNC, 0);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_MENTION_OBJECT_RECOMMEND_LIKE_INT_SYNC, 0);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_MENTION_FOLLOW_ACCEPT_INT_SYNC, 0);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_MENTION_FRIEND_RECOMMEND_INT_SYNC, 0);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("TLWxBubble");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyPresenter notifyPresenter = this.f210331t;
            notifyPresenter.f204550t.mo48813x58998cd();
            notifyPresenter.f204552v.mo48813x58998cd();
            notifyPresenter.f204551u.mo48813x58998cd();
            int i17 = notifyPresenter.f204537d;
            if (i17 == 1 || i17 == 2) {
                java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
                if (Ri == null) {
                    Ri = "";
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6544xa7bd9d01 c6544xa7bd9d01 = notifyPresenter.f204548r;
                c6544xa7bd9d01.f138960d = c6544xa7bd9d01.b("SessionId", Ri, true);
                c6544xa7bd9d01.f138974r = 2L;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        t70Var.j2().l();
        t70Var.U1().l();
        t70Var.S0().l();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.fsn);
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.E3).mo141623x754a37bb()).r()).intValue() == 1) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderWxMsgUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/ui/FinderWxMsgUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderWxMsgUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/ui/FinderWxMsgUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderWxMsgUI)).Rj(this, iy1.a.Finder);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uo) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uo.class)).f217685h = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        char c17;
        super.onDestroy();
        if (c7()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyPresenter notifyPresenter = this.f210331t;
            notifyPresenter.f204550t.mo48814x2efc64();
            notifyPresenter.f204552v.mo48814x2efc64();
            notifyPresenter.f204551u.mo48814x2efc64();
            java.util.ArrayList arrayList = notifyPresenter.f204545o;
            boolean z17 = true;
            char c18 = 2;
            int i17 = notifyPresenter.f204537d;
            if (i17 == 1 || i17 == 2) {
                java.util.Iterator it = arrayList.iterator();
                int i18 = 0;
                while (true) {
                    boolean hasNext = it.hasNext();
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6544xa7bd9d01 c6544xa7bd9d01 = notifyPresenter.f204548r;
                    if (!hasNext) {
                        c6544xa7bd9d01.k();
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zk(c6544xa7bd9d01);
                        break;
                    }
                    java.lang.Object next = it.next();
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyViewCallback notifyViewCallback = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyViewCallback) next;
                    java.util.List list = notifyPresenter.f204541h;
                    if (!((i18 < 0 || i18 >= ((java.util.ArrayList) list).size()) ? false : z17)) {
                        list = null;
                    }
                    if (list != null ? ((java.lang.Boolean) list.get(i18)).booleanValue() : false) {
                        java.lang.Long l17 = (java.lang.Long) notifyPresenter.f204542i.get(java.lang.Integer.valueOf(i18));
                        long longValue = l17 == null ? 0L : l17.longValue();
                        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = notifyViewCallback.f204618m;
                        android.util.LongSparseArray longSparseArray = c22848x6ddd90cf != null ? c22848x6ddd90cf.C : null;
                        if (longSparseArray != null) {
                            int size = longSparseArray.size();
                            int i27 = 0;
                            while (i27 < size) {
                                longSparseArray.keyAt(i27);
                                in5.c cVar = ((in5.x0) longSparseArray.valueAt(i27)).f374691a;
                                if (cVar instanceof so2.i) {
                                    if (cVar.mo2128x1ed62e84() < longValue || longValue == 0) {
                                        int i28 = ((so2.i) cVar).f491944d.f66129x2262335f;
                                        if (i28 != 1) {
                                            c17 = 2;
                                            if (i28 == 2) {
                                                c6544xa7bd9d01.f138970n++;
                                            } else if (i28 == 3) {
                                                c6544xa7bd9d01.f138971o++;
                                            } else if (i28 == 5) {
                                                c6544xa7bd9d01.f138972p++;
                                            }
                                        } else {
                                            c17 = 2;
                                            c6544xa7bd9d01.f138969m++;
                                        }
                                        c6544xa7bd9d01.f138964h++;
                                    } else {
                                        int i29 = ((so2.i) cVar).f491944d.f66129x2262335f;
                                        if (i29 == 1) {
                                            c6544xa7bd9d01.f138965i++;
                                        } else if (i29 == 2) {
                                            c6544xa7bd9d01.f138966j++;
                                        } else if (i29 == 3) {
                                            c6544xa7bd9d01.f138967k++;
                                        } else if (i29 == 5) {
                                            c6544xa7bd9d01.f138968l++;
                                        }
                                        c6544xa7bd9d01.f138963g++;
                                        c17 = 2;
                                    }
                                    c6544xa7bd9d01.f138962f++;
                                } else {
                                    c17 = 2;
                                }
                                i27++;
                                c18 = c17;
                            }
                        }
                    }
                    c18 = c18;
                    i18 = i19;
                    z17 = true;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(notifyPresenter.f204540g, "onDetach " + notifyPresenter.f204538e);
            arrayList.clear();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyViewCallback notifyViewCallback;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf;
        super.onResume();
        if (c7()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyPresenter notifyPresenter = this.f210331t;
            notifyPresenter.getClass();
            notifyPresenter.f204544n = java.lang.System.currentTimeMillis();
            if (!notifyPresenter.f204553w) {
                java.util.Iterator it = notifyPresenter.f204547q.iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.util.ArrayList arrayList = (java.util.ArrayList) next;
                    if (arrayList.size() > 0 && (notifyViewCallback = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyViewCallback) kz5.n0.a0(notifyPresenter.f204545o, i17)) != null && (c22848x6ddd90cf = notifyViewCallback.f204618m) != null) {
                        c22848x6ddd90cf.m8152xc67946d3(0, arrayList.size(), 3);
                    }
                    i17 = i18;
                }
            }
            notifyPresenter.f204553w = false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        if (c7()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyPresenter notifyPresenter = this.f210331t;
            notifyPresenter.getClass();
            notifyPresenter.f204548r.f138973q = java.lang.System.currentTimeMillis() - notifyPresenter.f204544n;
            pf5.u uVar = pf5.u.f435469a;
            int X6 = ((vy2.e) uVar.c(this).a(vy2.e.class)).X6();
            ey2.w2 w2Var = (ey2.w2) uVar.e(c61.l7.class).a(ey2.w2.class);
            java.lang.String r17 = c01.z1.r();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
            w2Var.S6(1, X6, r17);
        }
    }
}
