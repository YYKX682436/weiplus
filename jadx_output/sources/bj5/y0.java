package bj5;

/* loaded from: classes.dex */
public final class y0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.d1 f21255d;

    public y0(int i17, bj5.d1 d1Var, int i18) {
        this.f21255d = d1Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        android.view.Window window;
        int itemId = menuItem.getItemId();
        bj5.d1 d1Var = this.f21255d;
        if (itemId != 1) {
            if (itemId == 2) {
                d1Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.SelectLabelActionBarUIC", "showDeleteTipsBottomSheet() called");
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) d1Var.getContext(), 1, true);
                k0Var.f211872n = new bj5.v0(1, d1Var);
                k0Var.q(d1Var.getContext().getResources().getString(com.tencent.mm.R.string.mb9), 17);
                k0Var.f211881s = new bj5.w0(1, d1Var);
                k0Var.v();
                return;
            }
            return;
        }
        d1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.SelectLabelActionBarUIC", "showRenameBottomSheet() called");
        androidx.appcompat.app.AppCompatActivity activity = d1Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        j93.x0 x0Var = (j93.x0) pf5.z.f353948a.a(activity).a(j93.x0.class);
        db5.f3 f3Var = new db5.f3(x0Var.getActivity(), false);
        com.tencent.mm.ui.widget.dialog.a4 a4Var = f3Var.f212055d;
        if (a4Var != null && (window = a4Var.getWindow()) != null) {
            gh5.g.a(window);
        }
        f3Var.l(new j93.t0(x0Var));
        f3Var.L.setText(x0Var.getString(com.tencent.mm.R.string.mbd));
        java.lang.String string = x0Var.getString(com.tencent.mm.R.string.mbd);
        android.widget.EditText editText = f3Var.M;
        editText.setHint(string);
        f3Var.N.setOnClickListener(new db5.c3(f3Var, new j93.u0(x0Var, f3Var)));
        f3Var.C();
        editText.postDelayed(new j93.v0(f3Var, x0Var), 100L);
    }
}
