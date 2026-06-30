package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public class vl implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17459xab65a958 f243204d;

    public vl(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17459xab65a958 activityC17459xab65a958) {
        this.f243204d = activityC17459xab65a958;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17459xab65a958 activityC17459xab65a958 = this.f243204d;
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17459xab65a958.T6(activityC17459xab65a958, -2);
            activityC17459xab65a958.f242188e.q();
            if (!activityC17459xab65a958.f242192i) {
                activityC17459xab65a958.setResult(-1);
                activityC17459xab65a958.finish();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17459xab65a958.T6(activityC17459xab65a958, 0);
            activityC17459xab65a958.f242188e.q();
            if (!activityC17459xab65a958.f242192i) {
                activityC17459xab65a958.setResult(-1);
                activityC17459xab65a958.finish();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (!gm0.j1.u().l()) {
            dp.a.m125853x26a183b(activityC17459xab65a958, com.p314xaae8f345.mm.R.C30867xcad56011.f574618iy3, 1).show();
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        f21.i0 i0Var = (f21.i0) adapterView.getItemAtPosition(i17 - 2);
        if (i0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsSelectBgUI", "onItemClick fail, info is null, position = " + i17);
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        int i18 = i0Var.f340451f;
        if (i18 == 1 || i18 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17459xab65a958.T6(activityC17459xab65a958, i0Var.f340446a);
            if (activityC17459xab65a958.f242192i) {
                i0Var.f340451f = 1;
                ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
                f21.j0 Bi = f21.r0.Bi();
                Bi.getClass();
                Bi.m0(i0Var.f340452g);
                i0Var.f340451f = 1;
                Bi.P0(i0Var);
            } else {
                activityC17459xab65a958.f242188e.q();
            }
            if (!activityC17459xab65a958.f242192i) {
                activityC17459xab65a958.setResult(-1);
                activityC17459xab65a958.finish();
            }
        } else if (i18 == 3) {
            rz.o oVar = activityC17459xab65a958.f242190g;
            if (oVar != null && ((f21.f0) oVar).f340428f == i0Var.f340446a) {
                gm0.j1.d().d((com.p314xaae8f345.mm.p944x882e457a.m1) activityC17459xab65a958.f242190g);
                ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
                f21.r0.Bi().L0(((f21.f0) activityC17459xab65a958.f242190g).f340428f, 1);
                activityC17459xab65a958.U6(activityC17459xab65a958.f242191h);
            }
            int i19 = i0Var.f340446a;
            java.util.List list = activityC17459xab65a958.f242191h;
            activityC17459xab65a958.getClass();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
            java.util.Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                rz.o oVar2 = (rz.o) it.next();
                f21.f0 f0Var = (f21.f0) oVar2;
                if (f0Var.f340428f == i19) {
                    ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
                    f21.r0.Bi().L0(f0Var.f340428f, 1);
                    arrayList2.remove(oVar2);
                    break;
                }
            }
            ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
            f21.j0 Bi2 = f21.r0.Bi();
            i0Var.f340451f = 4;
            Bi2.P0(i0Var);
            new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ul(this, Bi2, i0Var.f340446a).mo50307xb9e94560(0, 1000L);
        } else if (i18 == 4) {
            ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
            f21.r0.Bi().L0(i0Var.f340446a, 1);
        } else if (i18 == 5) {
            if (activityC17459xab65a958.f242190g == null) {
                rz.n nVar = (rz.n) i95.n0.c(rz.n.class);
                int i27 = i0Var.f340446a;
                ((qz.c) nVar).getClass();
                activityC17459xab65a958.f242190g = new f21.f0(i27, 1);
                gm0.j1.d().g((com.p314xaae8f345.mm.p944x882e457a.m1) activityC17459xab65a958.f242190g);
            } else {
                java.util.List list2 = activityC17459xab65a958.f242191h;
                rz.n nVar2 = (rz.n) i95.n0.c(rz.n.class);
                int i28 = i0Var.f340446a;
                ((qz.c) nVar2).getClass();
                ((java.util.ArrayList) list2).add(new f21.f0(i28, 1));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
