package av1;

/* loaded from: classes3.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui.ActivityC13090x679cb21a f95719d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui.ActivityC13090x679cb21a activityC13090x679cb21a) {
        this.f95719d = activityC13090x679cb21a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/cast/ui/ScreenCastActivity$initBtnListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (nu1.n.f421703e == null) {
            nu1.n.f421703e = new tu1.o();
        }
        tu1.o oVar = nu1.n.f421703e;
        if (oVar != null) {
            xu1.c cVar = oVar.f503660r;
            int i17 = cVar == null ? -1 : av1.l.f95718a[cVar.ordinal()];
            boolean z17 = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui.ActivityC13090x679cb21a activityC13090x679cb21a = this.f95719d;
            if (i17 == 1) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC13090x679cb21a, 1, true);
                k0Var.f293405n = new av1.h(activityC13090x679cb21a);
                k0Var.f293414s = new av1.i(activityC13090x679cb21a);
                k0Var.v();
            } else if (i17 != 2) {
                if (i17 == 3) {
                    android.widget.Button button = activityC13090x679cb21a.f177021d;
                    if (button != null) {
                        button.setText(activityC13090x679cb21a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i2a));
                    }
                    android.widget.Button button2 = activityC13090x679cb21a.f177021d;
                    if (button2 != null) {
                        button2.setOnClickListener(new av1.j(activityC13090x679cb21a));
                    }
                } else if (i17 == 4 || i17 == 5) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CastReportHelper", "markClickStartScreenCastRetry");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1634L, 5L, 1L);
                    int i18 = activityC13090x679cb21a.f177028n + 1;
                    activityC13090x679cb21a.f177028n = i18;
                    if (i18 < 5) {
                        if (nu1.n.f421703e == null) {
                            nu1.n.f421703e = new tu1.o();
                        }
                        tu1.o oVar2 = nu1.n.f421703e;
                        if (oVar2 != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastManager", "retryConnect " + oVar2.f503643a);
                            oVar2.b();
                        }
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastActivity", "error happened");
                    } else {
                        android.widget.Button button3 = activityC13090x679cb21a.f177021d;
                        if (button3 != null) {
                            button3.setText(activityC13090x679cb21a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i2a));
                        }
                        android.widget.Button button4 = activityC13090x679cb21a.f177021d;
                        if (button4 != null) {
                            button4.setOnClickListener(new av1.k(activityC13090x679cb21a));
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CastReportHelper", "markClickStartScreenCastBtnReport");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1634L, 4L, 1L);
                    int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui.ActivityC13090x679cb21a.f177020q;
                    activityC13090x679cb21a.V6();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$initBtnListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
