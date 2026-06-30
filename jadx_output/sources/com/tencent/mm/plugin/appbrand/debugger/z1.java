package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f77854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.l2 f77855e;

    public z1(com.tencent.mm.plugin.appbrand.debugger.l2 l2Var, java.lang.String str) {
        this.f77855e = l2Var;
        this.f77854d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.debugger.l2 l2Var = this.f77855e;
        android.content.Context context = l2Var.getContext();
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211709a = "";
        aVar.f211729s = context.getString(com.tencent.mm.R.string.f490269q9, this.f77854d);
        aVar.f211732v = of5.b.a(context).getString(com.tencent.mm.R.string.apu);
        aVar.E = new com.tencent.mm.plugin.appbrand.debugger.a2(l2Var);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.setCancelable(true);
        j0Var.show();
    }
}
