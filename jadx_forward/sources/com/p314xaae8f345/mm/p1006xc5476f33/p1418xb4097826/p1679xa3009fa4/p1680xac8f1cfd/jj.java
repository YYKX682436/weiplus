package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class jj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl f216401d;

    public jj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar) {
        this.f216401d = blVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa;
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        in5.s0 s0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar = this.f216401d;
        android.widget.LinearLayout W6 = blVar.W6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(W6, "access$getBackBtn(...)");
        android.widget.LinearLayout W62 = blVar.W6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(W62, "access$getBackBtn(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.k(d2Var, W6, "finder_return", "view_clk", true, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl.i7(blVar, W62), null, 32, null);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = blVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e90 e90Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e90) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e90.class);
        e90Var.getClass();
        r45.cx2 cx2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e90.f215763p;
        boolean z18 = (cx2Var != null && cx2Var.m75933x41a8a7f2(0)) || (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Vb).mo141623x754a37bb()).r()).intValue() == 1);
        boolean O6 = e90Var.O6();
        boolean z19 = e90Var.f215764d ? true : z18 && O6;
        if (z19) {
            e90Var.f215764d = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e90.f215763p = null;
            java.lang.ref.WeakReference weakReference = e90Var.f215766f;
            if (weakReference == null || (s0Var = (in5.s0) weakReference.get()) == null || (abstractC14490x69736cb5 = e90Var.f215765e) == null) {
                str = "Finder.FinderTingEntryUIC";
                str2 = ", allowShow: ";
                abstractActivityC15087xee12defa = null;
                z17 = O6;
            } else {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(e90Var.m158354x19263085(), 1, 0, true);
                z2Var.m(e90Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o2t), e90Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o2v));
                android.view.View inflate = android.view.LayoutInflater.from(e90Var.m80379x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eet, (android.view.ViewGroup) null, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
                z2Var.v(e90Var.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
                z2Var.o(0);
                int color = e90Var.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560296gj);
                android.widget.Button button = z2Var.f293602u;
                if (button != null) {
                    button.setTextColor(color);
                }
                z2Var.j(inflate);
                z2Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.b90(abstractC14490x69736cb5, inflate, e90Var));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.c90 c90Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.c90(z2Var, e90Var, s0Var, abstractC14490x69736cb5);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d90 d90Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d90(z2Var, e90Var, s0Var, abstractC14490x69736cb5);
                z2Var.D = c90Var;
                z2Var.E = d90Var;
                z2Var.C();
                java.util.Map Q6 = e90Var.Q6(abstractC14490x69736cb5);
                str = "Finder.FinderTingEntryUIC";
                str2 = ", allowShow: ";
                abstractActivityC15087xee12defa = null;
                z17 = O6;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.k(d2Var, inflate, "findersleephalfpage", "view_exp", true, Q6, null, 32, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "showGuide, feedId = " + abstractC14490x69736cb5.mo2128x1ed62e84());
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27311x43a2d090.m112842x9cf0d20b().m112849xba8311b6(bw5.ms0.emFinderNewbieGuideType_TingEntryGuide);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkCanShowGuide succ, isInSleepTime: " + z18 + str2 + z17);
        } else {
            abstractActivityC15087xee12defa = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTingEntryUIC", "checkCanShowGuide fail, isInSleepTime: " + z18 + ", allowShow: " + O6);
        }
        if (!z19) {
            if (blVar.m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = blVar.m158354x19263085();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa2 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) m158354x19263085 : abstractActivityC15087xee12defa;
                if (abstractActivityC15087xee12defa2 != null) {
                    abstractActivityC15087xee12defa2.f210347p = false;
                    abstractActivityC15087xee12defa2.onBackPressed();
                    abstractActivityC15087xee12defa2.f210347p = true;
                }
            } else {
                blVar.m158354x19263085().onBackPressed();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
