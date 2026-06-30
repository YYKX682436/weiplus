package zh1;

/* loaded from: classes8.dex */
public final class g0 implements db5.l4 {

    /* renamed from: a, reason: collision with root package name */
    public static final zh1.g0 f554418a = new zh1.g0();

    @Override // db5.l4
    public final void a(android.widget.TextView textView, android.view.MenuItem menuItem) {
        java.util.Objects.toString(menuItem);
        android.view.ContextMenu.ContextMenuInfo menuInfo = menuItem.getMenuInfo();
        zh1.f1 f1Var = menuInfo instanceof zh1.f1 ? (zh1.f1) menuInfo : null;
        if (f1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "onAttach, menuInfo is not RawFunctionName2Show");
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        if (f1Var.f554415c) {
            textView.post(new zh1.s0(textView, f1Var));
        } else {
            textView.setText(f1Var.f554416d);
        }
    }
}
