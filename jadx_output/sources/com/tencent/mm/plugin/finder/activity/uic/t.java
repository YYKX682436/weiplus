package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC f101948d;

    public t(com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC finderActivityParticipateUIC) {
        this.f101948d = finderActivityParticipateUIC;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        r45.e21 e21Var;
        r45.e21 e21Var2;
        java.lang.String string;
        r45.e21 e21Var3;
        r45.e21 e21Var4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityParticipateUIC$setViewStyle$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC finderActivityParticipateUIC = this.f101948d;
        finderActivityParticipateUIC.getClass();
        int i17 = 0;
        com.tencent.mm.plugin.finder.activity.uic.y1 y1Var = new com.tencent.mm.plugin.finder.activity.uic.y1(0, 0, 3, null);
        android.app.Activity context = finderActivityParticipateUIC.getContext();
        i95.m c17 = i95.n0.c(l40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        switch (l40.e.dh((l40.e) c17, context, null, 2, null)) {
            case 1:
                com.tencent.mm.plugin.finder.activity.uic.x1[] x1VarArr = com.tencent.mm.plugin.finder.activity.uic.x1.f101972d;
                y1Var.f101976b = 2;
                db5.t7.makeText(context, com.tencent.mm.R.string.erh, 0).show();
                y1Var.f101975a = 1;
                z17 = true;
                break;
            case 2:
                com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(context);
                e3Var.f(com.tencent.mm.R.layout.f488818aj2);
                e3Var.f131959f.findViewById(com.tencent.mm.R.id.b5d).setOnClickListener(new com.tencent.mm.plugin.finder.activity.uic.u(e3Var));
                e3Var.f131959f.findViewById(com.tencent.mm.R.id.f483977cm1).setOnClickListener(new com.tencent.mm.plugin.finder.activity.uic.v(context, e3Var));
                e3Var.i();
                y1Var.f101975a = 1;
                z17 = true;
                break;
            case 3:
                z17 = false;
                break;
            case 4:
                db5.t7.makeText(context, com.tencent.mm.R.string.chi, 0).show();
                y1Var.f101975a = 1;
                z17 = true;
                break;
            case 5:
                db5.t7.makeText(context, com.tencent.mm.R.string.f3m, 0).show();
                y1Var.f101975a = 1;
                z17 = true;
                break;
            case 6:
                com.tencent.mm.plugin.finder.activity.uic.x1[] x1VarArr2 = com.tencent.mm.plugin.finder.activity.uic.x1.f101972d;
                y1Var.f101976b = 3;
                z17 = false;
                break;
            default:
                y1Var.f101975a = 1;
                z17 = true;
                break;
        }
        if (z17) {
            finderActivityParticipateUIC.b7(y1Var);
        } else {
            r45.r03 r03Var = (r45.r03) finderActivityParticipateUIC.f452719d;
            if ((r03Var == null || (e21Var4 = (r45.e21) r03Var.getCustom(16)) == null || e21Var4.getInteger(27) != 1) ? false : true) {
                y1Var.f101975a = 1;
                com.tencent.mm.plugin.finder.activity.uic.x1[] x1VarArr3 = com.tencent.mm.plugin.finder.activity.uic.x1.f101972d;
                y1Var.f101976b = 5;
                finderActivityParticipateUIC.b7(y1Var);
                r45.r03 r03Var2 = (r45.r03) finderActivityParticipateUIC.f452719d;
                if (r03Var2 == null || (e21Var3 = (r45.e21) r03Var2.getCustom(16)) == null || (string = e21Var3.getString(28)) == null) {
                    string = finderActivityParticipateUIC.getContext().getResources().getString(com.tencent.mm.R.string.cia);
                }
                kotlin.jvm.internal.o.d(string);
                db5.t7.m(finderActivityParticipateUIC.getContext(), string);
            } else {
                r45.r03 r03Var3 = (r45.r03) finderActivityParticipateUIC.f452719d;
                if (r03Var3 != null && (e21Var2 = (r45.e21) r03Var3.getCustom(16)) != null) {
                    i17 = e21Var2.getInteger(12);
                }
                r45.r03 r03Var4 = (r45.r03) finderActivityParticipateUIC.f452719d;
                boolean W6 = finderActivityParticipateUIC.W6(i17, (r03Var4 == null || (e21Var = (r45.e21) r03Var4.getCustom(16)) == null) ? 0L : e21Var.getLong(13));
                com.tencent.mars.xlog.Log.i("FinderActivityParticipateUIC", "participateBtn onClick isFinished : " + W6);
                if (W6) {
                    y1Var.f101975a = 1;
                    com.tencent.mm.plugin.finder.activity.uic.x1[] x1VarArr4 = com.tencent.mm.plugin.finder.activity.uic.x1.f101972d;
                    y1Var.f101976b = 6;
                    finderActivityParticipateUIC.b7(y1Var);
                } else {
                    finderActivityParticipateUIC.b7(y1Var);
                    sr2.c cVar = finderActivityParticipateUIC.f101823t;
                    if (cVar == null) {
                        finderActivityParticipateUIC.Z6();
                    } else if (cVar.f411523e) {
                        yz5.a aVar = cVar.f411525g;
                        if (aVar != null) {
                            aVar.invoke();
                        }
                    } else {
                        if (cVar.f411524f == null) {
                            cVar.f411524f = com.tencent.mm.ui.widget.dialog.u3.f(cVar.getContext(), cVar.getContext().getString(com.tencent.mm.R.string.cxo), true, 2, null);
                        } else if ((!r10.isShowing()) && (u3Var = cVar.f411524f) != null) {
                            u3Var.show();
                        }
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityParticipateUIC$setViewStyle$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
