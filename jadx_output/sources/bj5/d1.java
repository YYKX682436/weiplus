package bj5;

/* loaded from: classes.dex */
public final class d1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.f4 f21178d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        jz5.h.b(new bj5.c1(this));
    }

    public static final void T6(bj5.d1 d1Var) {
        d1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.SelectLabelActionBarUIC", "showListMenu() called");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) d1Var.getContext(), 1, true);
        k0Var.f211872n = new bj5.x0(1, d1Var, 2);
        k0Var.f211881s = new bj5.y0(1, d1Var, 2);
        k0Var.v();
    }

    public final void U6() {
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        com.tencent.mm.ui.widget.dialog.f4 f4Var = this.f21178d;
        java.lang.String string = getActivity().getString(com.tencent.mm.R.string.f491043bo5);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        kotlin.jvm.internal.o.g(context, "context");
        if (f4Var != null) {
            com.tencent.mm.ui.widget.dialog.e4 e4Var = f4Var.f211791d;
            e4Var.getClass();
            e4Var.f211776c = string;
            e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var.e();
        } else {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var2.f211776c = string;
            e4Var2.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var2.c();
        }
        getActivity().setResult(-1);
        getActivity().finish();
    }

    public final void V6() {
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        com.tencent.mm.ui.widget.dialog.f4 f4Var = this.f21178d;
        java.lang.String string = getActivity().getString(com.tencent.mm.R.string.mb8);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        kotlin.jvm.internal.o.g(context, "context");
        if (f4Var != null) {
            com.tencent.mm.ui.widget.dialog.e4 e4Var = f4Var.f211791d;
            e4Var.getClass();
            e4Var.f211776c = string;
            e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var.e();
        } else {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var2.f211776c = string;
            e4Var2.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var2.c();
        }
        getActivity().setResult(-1);
        getActivity().finish();
    }

    public final void W6() {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new bj5.a1(this));
            P6.setBackBtn(new bj5.b1(P6), com.tencent.mm.R.raw.actionbar_icon_dark_back);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.setActionbarColor(getResources().getColor(com.tencent.mm.R.color.BW_93));
        }
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new bj5.u0(this));
        }
    }
}
