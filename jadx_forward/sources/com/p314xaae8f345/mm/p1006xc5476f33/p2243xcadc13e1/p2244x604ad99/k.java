package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99;

/* loaded from: classes8.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.o f253656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.l f253657e;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.o oVar) {
        this.f253657e = lVar;
        this.f253656d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.l lVar = this.f253657e;
        lVar.getClass();
        int intValue = ((java.lang.Integer) c01.d9.b().p().l(15, 0)).intValue();
        boolean z17 = c01.d9.e().f152304n;
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.o oVar = this.f253656d;
        if (!z17 || 1 != intValue) {
            java.lang.String Bi = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Bi(oVar.f253679o, 4);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.WXWebPage.f32847x4430964b, oVar.f253666b);
            bundle.putString("jump_url", Bi);
            ((c01.v8) c01.d9.f()).b(37, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572064xr), oVar.f253675k, Bi, "bizjd", bundle);
            lVar.f253658d.mo48813x58998cd();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11178, Bi, com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Zi().f253666b, 4);
            return;
        }
        java.lang.String Bi2 = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Bi(oVar.f253679o, 5);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String str = oVar.f253676l;
        java.lang.String str2 = oVar.f253677m;
        java.lang.String str3 = oVar.f253678n;
        java.lang.String str4 = oVar.f253666b;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.ActivityC18501x74118907.f253645f;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.ActivityC18501x74118907.class);
        intent.putExtra("alertcontent", str);
        intent.putExtra("alertconfirm", str2);
        intent.putExtra("alert_cancel", str3);
        intent.putExtra("alertjumpurl", Bi2);
        intent.putExtra("alert_activityid", str4);
        intent.addFlags(805306368);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/subapp/jdbiz/JDRemindDialog", "showAlert", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/subapp/jdbiz/JDRemindDialog", "showAlert", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11178, Bi2, com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Zi().f253666b, 5);
    }
}
