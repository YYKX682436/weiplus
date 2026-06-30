package du3;

/* loaded from: classes3.dex */
public final class q1 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f325217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ du3.g2 f325218e;

    public q1(android.view.View view, du3.g2 g2Var) {
        this.f325217d = view;
        this.f325218e = g2Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f325217d.getViewTreeObserver().removeOnPreDrawListener(this);
        du3.g2 g2Var = this.f325218e;
        g2Var.getClass();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_ai_tips_show_count, 1);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("improve_photo_edit", gm0.j1.b().h(), 1);
        int o17 = J2.o("image_ai_tips_show_count", 0);
        if (o17 >= Ni) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImproveEditPhotoFuncPlugin", "show tips trigger limit");
        } else {
            J2.A("image_ai_tips_show_count", o17 + 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.C17033xf5f867fb c17033xf5f867fb = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.C17033xf5f867fb(g2Var.f325120f.getContext(), null);
            android.widget.PopupWindow popupWindow = new android.widget.PopupWindow((android.view.View) c17033xf5f867fb, -2, -2, true);
            popupWindow.setFocusable(false);
            popupWindow.setOutsideTouchable(true);
            c17033xf5f867fb.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            int[] iArr = new int[2];
            g2Var.A().getLocationOnScreen(iArr);
            popupWindow.showAtLocation(g2Var.A(), 0, (iArr[0] + (g2Var.A().getWidth() / 2)) - (c17033xf5f867fb.getMeasuredWidth() / 2), (iArr[1] - c17033xf5f867fb.getMeasuredHeight()) - i65.a.h(g2Var.f325120f.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.aih));
            g2Var.f325133v = popupWindow;
            ku5.u0 u0Var = ku5.t0.f394148d;
            du3.d2 d2Var = new du3.d2(g2Var);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(d2Var, 5000L, false);
        }
        return true;
    }
}
