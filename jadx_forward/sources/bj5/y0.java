package bj5;

/* loaded from: classes.dex */
public final class y0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.d1 f102788d;

    public y0(int i17, bj5.d1 d1Var, int i18) {
        this.f102788d = d1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        android.view.Window window;
        int itemId = menuItem.getItemId();
        bj5.d1 d1Var = this.f102788d;
        if (itemId != 1) {
            if (itemId == 2) {
                d1Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.SelectLabelActionBarUIC", "showDeleteTipsBottomSheet() called");
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) d1Var.m80379x76847179(), 1, true);
                k0Var.f293405n = new bj5.v0(1, d1Var);
                k0Var.q(d1Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mb9), 17);
                k0Var.f293414s = new bj5.w0(1, d1Var);
                k0Var.v();
                return;
            }
            return;
        }
        d1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.SelectLabelActionBarUIC", "showRenameBottomSheet() called");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = d1Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        j93.x0 x0Var = (j93.x0) pf5.z.f435481a.a(activity).a(j93.x0.class);
        db5.f3 f3Var = new db5.f3(x0Var.m158354x19263085(), false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a4 a4Var = f3Var.f293588d;
        if (a4Var != null && (window = a4Var.getWindow()) != null) {
            gh5.g.a(window);
        }
        f3Var.l(new j93.t0(x0Var));
        f3Var.L.setText(x0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.mbd));
        java.lang.String m158362x2fec8307 = x0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.mbd);
        android.widget.EditText editText = f3Var.M;
        editText.setHint(m158362x2fec8307);
        f3Var.N.setOnClickListener(new db5.c3(f3Var, new j93.u0(x0Var, f3Var)));
        f3Var.C();
        editText.postDelayed(new j93.v0(f3Var, x0Var), 100L);
    }
}
