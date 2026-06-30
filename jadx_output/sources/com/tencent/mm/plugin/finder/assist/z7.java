package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes.dex */
public final class z7 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f102759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102760e;

    public z7(androidx.appcompat.app.AppCompatActivity appCompatActivity, java.lang.String str) {
        this.f102759d = appCompatActivity;
        this.f102760e = str;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[4];
        androidx.appcompat.app.AppCompatActivity context = this.f102759d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        objArr[0] = nyVar != null ? nyVar.f135382p : null;
        objArr[1] = this.f102760e;
        objArr[2] = 0;
        objArr[3] = ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).wi();
        g0Var.d(21180, objArr);
        com.tencent.mars.xlog.Log.i("Finder.FinderUIUtil", "[checkShowShareSnsLayout] click cancel");
    }
}
