package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class s4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f102524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f102525e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102526f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.xa5 f102527g;

    public s4(boolean z17, android.app.Activity activity, java.lang.String str, r45.xa5 xa5Var) {
        this.f102524d = z17;
        this.f102525e = activity;
        this.f102526f = str;
        this.f102527g = xa5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dialog ok isInstall:");
        boolean z17 = this.f102524d;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("FinderMenuUtil", sb6.toString());
        r45.xa5 xa5Var = this.f102527g;
        android.app.Activity context = this.f102525e;
        if (z17) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.i1 i1Var = ya2.i1.f460495a;
            java.lang.String string = xa5Var.getString(9);
            i1Var.c(context, this.f102526f, string != null ? string : "", 3);
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.o3.ij(o3Var, 1, "miaojian_createsame_tips", "{\"if_has_set\": 1}", nyVar != null ? nyVar.V6() : null, null, 16, null);
            return;
        }
        ci0.s sVar = (ci0.s) i95.n0.c(ci0.s.class);
        java.lang.String string2 = xa5Var.getString(8);
        java.lang.String str = string2 != null ? string2 : "";
        java.lang.String string3 = xa5Var.getString(4);
        kotlin.jvm.internal.o.d(string3);
        ((pc0.k) sVar).Ai(context, str, string3);
        i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3 o3Var2 = (com.tencent.mm.plugin.finder.report.o3) c18;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.o3.ij(o3Var2, 1, "miaojian_createsame_tips", "{\"if_has_set\": 0}", nyVar2 != null ? nyVar2.V6() : null, null, 16, null);
    }
}
