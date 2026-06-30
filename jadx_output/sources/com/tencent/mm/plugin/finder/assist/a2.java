package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes8.dex */
public final class a2 {
    public a2(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Context context, cl0.g gVar, boolean z17, zy2.i5 i5Var) {
        java.lang.String str;
        android.app.Activity Ui;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.assist.b2.f102021e = i5Var;
        if (!(context instanceof android.app.Activity) && (Ui = ((com.tencent.mm.plugin.finder.service.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Ui()) != null) {
            context = Ui;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.finder.feed.ui.FinderCreateAccountStarterActivity.class);
        if (gVar == null || (str = gVar.toString()) == null) {
            str = "";
        }
        intent.putExtra("param_extra_info", str);
        if (z17) {
            intent.putExtra("create_account_style", 1);
        }
        intent.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/FinderCreateAccountStarter$Companion", "showDialog", "(Landroid/content/Context;Lcom/tencent/mm/json/JSONObject;ZLcom/tencent/mm/plugin/findersdk/api/ICallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/FinderCreateAccountStarter$Companion", "showDialog", "(Landroid/content/Context;Lcom/tencent/mm/json/JSONObject;ZLcom/tencent/mm/plugin/findersdk/api/ICallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
