package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class o1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f74072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f74073e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f74074f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f74075g;

    public o1(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f74072d = context;
        this.f74073e = str;
        this.f74074f = str2;
        this.f74075g = str3;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        int itemId = menuItem.getItemId();
        android.content.Context context = this.f74072d;
        if (itemId == 1) {
            n71.a.e("F100_100_QQ");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(context.getClass().getName());
            sb6.append(",F100_100_QQ,");
            gm0.j1.b();
            sb6.append(gm0.m.f("F100_100_QQ"));
            sb6.append(",1");
            n71.a.c(10645, true, sb6.toString());
            com.tencent.mm.plugin.account.ui.p1.a(context, context.getString(com.tencent.mm.R.string.k4i));
            return;
        }
        if (itemId == 2) {
            n71.a.e("F100_100_Email");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb7.append(gm0.m.e());
            sb7.append(",");
            sb7.append(context.getClass().getName());
            sb7.append(",F100_100_Email,");
            gm0.j1.b();
            sb7.append(gm0.m.f("F100_100_Email"));
            sb7.append(",1");
            n71.a.c(10645, true, sb7.toString());
            com.tencent.mm.plugin.account.ui.p1.a(context, context.getString(com.tencent.mm.R.string.f492405gi2) + com.tencent.mm.sdk.platformtools.m2.d());
            return;
        }
        if (itemId != 4) {
            if (itemId != 8) {
                return;
            }
            java.lang.String string = context.getString(com.tencent.mm.R.string.l8n);
            if (com.tencent.mm.sdk.platformtools.m2.d().equals("zh_CN")) {
                str = string + "zh_CN";
            } else {
                str = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxz) + "/cgi-bin/newreadtemplate?t=help_center/w_index&Channel=Client&lang=";
            }
            com.tencent.mm.plugin.account.ui.p1.a(context, str);
            return;
        }
        n71.a.e("F100_100_phone");
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb8.append(gm0.m.e());
        sb8.append(",");
        sb8.append(context.getClass().getName());
        sb8.append(",F100_100_phone,");
        gm0.j1.b();
        sb8.append(gm0.m.f("F100_100_phone"));
        sb8.append(",1");
        n71.a.c(10645, true, sb8.toString());
        if (o45.wf.f343033k) {
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f489997hz), 0).show();
            return;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MobileInputUI.class);
        java.lang.String str2 = this.f74074f;
        if (str2 != null) {
            int indexOf = str2.indexOf("+");
            if (indexOf != -1 && str2.length() > 0) {
                str2 = str2.substring(indexOf + 1);
            }
            intent.putExtra("couttry_code", str2);
        }
        java.lang.String str3 = this.f74073e;
        if (str3 != null) {
            intent.putExtra("country_name", str3);
        }
        java.lang.String str4 = this.f74075g;
        if (str4 != null) {
            intent.putExtra("bindmcontact_shortmobile", str4);
        }
        intent.putExtra("mobile_input_purpose", 1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/ForgotPwdMenu", "loginBySMS", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/account/ui/ForgotPwdMenu", "loginBySMS", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
