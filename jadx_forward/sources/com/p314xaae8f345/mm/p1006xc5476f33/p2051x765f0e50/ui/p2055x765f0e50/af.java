package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes14.dex */
public final class af implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891 f242364d;

    public af(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891 activityC17429xf3011891) {
        this.f242364d = activityC17429xf3011891;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780 c17422xce8bd780;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$setContinueBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891.L;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891 activityC17429xf3011891 = this.f242364d;
        activityC17429xf3011891.Z6();
        if (!activityC17429xf3011891.G) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC17429xf3011891.mo55332x76847179();
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.p1i);
            e4Var.c();
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$setContinueBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (activityC17429xf3011891.f242009y) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17423x715c600d c17423x715c600d = activityC17429xf3011891.f241993f;
            if (c17423x715c600d == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardManager");
                throw null;
            }
            c17423x715c600d.m68983xcc520c05(true);
            if (activityC17429xf3011891.A) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780 c17422xce8bd7802 = activityC17429xf3011891.f241994g;
                if (c17422xce8bd7802 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardView1");
                    throw null;
                }
                activityC17429xf3011891.W6("select_mode_result", 0, c17422xce8bd7802.getYa.b.SOURCE java.lang.String(), false);
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780 c17422xce8bd7803 = activityC17429xf3011891.f241996i;
                if (c17422xce8bd7803 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardView3");
                    throw null;
                }
                int i19 = activityC17429xf3011891.f241990J;
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xd xdVar = i19 != 1 ? i19 != 2 ? i19 != 3 ? com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xd.f243278r : com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xd.f243285y : com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xd.f243282v : com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xd.f243279s;
                c17422xce8bd7803.m68975x519d2773(xdVar);
                c17422xce8bd7803.m68980x22dcbf1d(xdVar.h());
                java.util.Objects.toString(c17422xce8bd7803.getModeInfo());
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17423x715c600d c17423x715c600d2 = activityC17429xf3011891.f241993f;
                if (c17423x715c600d2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardManager");
                    throw null;
                }
                c17423x715c600d2.d(true);
                activityC17429xf3011891.X6(false);
                activityC17429xf3011891.a7(false);
                activityC17429xf3011891.E = 1;
                activityC17429xf3011891.V6(0);
            } else if (activityC17429xf3011891.B) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780 c17422xce8bd7804 = activityC17429xf3011891.f241995h;
                if (c17422xce8bd7804 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardView2");
                    throw null;
                }
                activityC17429xf3011891.W6("select_mode_result", 0, c17422xce8bd7804.getYa.b.SOURCE java.lang.String(), false);
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780 c17422xce8bd7805 = activityC17429xf3011891.f241996i;
                if (c17422xce8bd7805 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardView3");
                    throw null;
                }
                int i27 = activityC17429xf3011891.f241990J;
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xd xdVar2 = i27 != 1 ? i27 != 2 ? i27 != 3 ? com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xd.f243278r : com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xd.f243286z : com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xd.f243283w : com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xd.f243280t;
                c17422xce8bd7805.m68975x519d2773(xdVar2);
                c17422xce8bd7805.m68980x22dcbf1d(xdVar2.h());
                java.util.Objects.toString(c17422xce8bd7805.getModeInfo());
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17423x715c600d c17423x715c600d3 = activityC17429xf3011891.f241993f;
                if (c17423x715c600d3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardManager");
                    throw null;
                }
                c17423x715c600d3.d(true);
                activityC17429xf3011891.X6(false);
                activityC17429xf3011891.E = 2;
                activityC17429xf3011891.a7(false);
                activityC17429xf3011891.V6(0);
            } else {
                boolean z17 = activityC17429xf3011891.C;
                if (z17 || activityC17429xf3011891.D) {
                    if (z17) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780 c17422xce8bd7806 = activityC17429xf3011891.f241996i;
                        if (c17422xce8bd7806 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardView3");
                            throw null;
                        }
                        activityC17429xf3011891.W6("select_mode_result", 1, c17422xce8bd7806.getYa.b.SOURCE java.lang.String(), false);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780 c17422xce8bd7807 = activityC17429xf3011891.f241997m;
                        if (c17422xce8bd7807 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardView4");
                            throw null;
                        }
                        activityC17429xf3011891.W6("select_mode_result", 1, c17422xce8bd7807.getYa.b.SOURCE java.lang.String(), false);
                    }
                    if (activityC17429xf3011891.C) {
                        c17422xce8bd780 = activityC17429xf3011891.f241996i;
                        if (c17422xce8bd780 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardView3");
                            throw null;
                        }
                    } else {
                        c17422xce8bd780 = activityC17429xf3011891.f241997m;
                        if (c17422xce8bd780 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardView4");
                            throw null;
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xd modeInfo = c17422xce8bd780.getModeInfo();
                    java.util.Objects.toString(modeInfo);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891.U6(activityC17429xf3011891, modeInfo);
                    activityC17429xf3011891.E = 0;
                } else {
                    android.widget.TextView textView = activityC17429xf3011891.f241992e;
                    if (textView == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tipsInfo");
                        throw null;
                    }
                    textView.removeCallbacks(activityC17429xf3011891.f242008x);
                    android.widget.TextView textView2 = activityC17429xf3011891.f241992e;
                    if (textView2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tipsInfo");
                        throw null;
                    }
                    textView2.setText(activityC17429xf3011891.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o5e));
                    android.widget.TextView textView3 = activityC17429xf3011891.f241992e;
                    if (textView3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tipsInfo");
                        throw null;
                    }
                    textView3.setVisibility(0);
                    android.widget.TextView textView4 = activityC17429xf3011891.f241992e;
                    if (textView4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tipsInfo");
                        throw null;
                    }
                    textView4.postDelayed(activityC17429xf3011891.f242008x, 3000L);
                }
            }
        } else {
            android.widget.TextView textView5 = activityC17429xf3011891.f241992e;
            if (textView5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tipsInfo");
                throw null;
            }
            textView5.removeCallbacks(activityC17429xf3011891.f242008x);
            android.widget.TextView textView6 = activityC17429xf3011891.f241992e;
            if (textView6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tipsInfo");
                throw null;
            }
            textView6.setText(activityC17429xf3011891.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o5w));
            android.widget.TextView textView7 = activityC17429xf3011891.f241992e;
            if (textView7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tipsInfo");
                throw null;
            }
            textView7.setVisibility(0);
            android.widget.TextView textView8 = activityC17429xf3011891.f241992e;
            if (textView8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tipsInfo");
                throw null;
            }
            textView8.postDelayed(activityC17429xf3011891.f242008x, 3000L);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$setContinueBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
