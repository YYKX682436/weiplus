package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes5.dex */
public abstract class m1 {
    public static com.tencent.mm.ui.widget.dialog.j0 a(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.DialogInterface.OnClickListener onClickListener) {
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211709a = str;
        aVar.f211732v = str2;
        aVar.E = onClickListener;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
        return j0Var;
    }

    public static com.tencent.mm.ui.widget.dialog.j0 b(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, android.content.DialogInterface.OnClickListener onClickListener) {
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211709a = str2;
        aVar.f211729s = str;
        aVar.f211732v = of5.b.a(context).getString(com.tencent.mm.R.string.gpa);
        aVar.E = onClickListener;
        aVar.A = z17;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
        return j0Var;
    }
}
