package av1;

/* loaded from: classes3.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cast.ui.ScreenCastActivity f14186d;

    public m(com.tencent.mm.plugin.cast.ui.ScreenCastActivity screenCastActivity) {
        this.f14186d = screenCastActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/cast/ui/ScreenCastActivity$initBtnListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (nu1.n.f340170e == null) {
            nu1.n.f340170e = new tu1.o();
        }
        tu1.o oVar = nu1.n.f340170e;
        if (oVar != null) {
            xu1.c cVar = oVar.f422127r;
            int i17 = cVar == null ? -1 : av1.l.f14185a[cVar.ordinal()];
            boolean z17 = true;
            com.tencent.mm.plugin.cast.ui.ScreenCastActivity screenCastActivity = this.f14186d;
            if (i17 == 1) {
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) screenCastActivity, 1, true);
                k0Var.f211872n = new av1.h(screenCastActivity);
                k0Var.f211881s = new av1.i(screenCastActivity);
                k0Var.v();
            } else if (i17 != 2) {
                if (i17 == 3) {
                    android.widget.Button button = screenCastActivity.f95488d;
                    if (button != null) {
                        button.setText(screenCastActivity.getString(com.tencent.mm.R.string.i2a));
                    }
                    android.widget.Button button2 = screenCastActivity.f95488d;
                    if (button2 != null) {
                        button2.setOnClickListener(new av1.j(screenCastActivity));
                    }
                } else if (i17 == 4 || i17 == 5) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CastReportHelper", "markClickStartScreenCastRetry");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1634L, 5L, 1L);
                    int i18 = screenCastActivity.f95495n + 1;
                    screenCastActivity.f95495n = i18;
                    if (i18 < 5) {
                        if (nu1.n.f340170e == null) {
                            nu1.n.f340170e = new tu1.o();
                        }
                        tu1.o oVar2 = nu1.n.f340170e;
                        if (oVar2 != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastManager", "retryConnect " + oVar2.f422110a);
                            oVar2.b();
                        }
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastActivity", "error happened");
                    } else {
                        android.widget.Button button3 = screenCastActivity.f95488d;
                        if (button3 != null) {
                            button3.setText(screenCastActivity.getString(com.tencent.mm.R.string.i2a));
                        }
                        android.widget.Button button4 = screenCastActivity.f95488d;
                        if (button4 != null) {
                            button4.setOnClickListener(new av1.k(screenCastActivity));
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CastReportHelper", "markClickStartScreenCastBtnReport");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1634L, 4L, 1L);
                    int i19 = com.tencent.mm.plugin.cast.ui.ScreenCastActivity.f95487q;
                    screenCastActivity.V6();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$initBtnListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
