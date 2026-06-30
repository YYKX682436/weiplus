package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes.dex */
public class k1 implements j35.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f270502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f270503b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j35.d f270504c;

    public k1(android.content.Context context, android.content.Intent intent, j35.d dVar) {
        this.f270502a = context;
        this.f270503b = intent;
        this.f270504c = dVar;
    }

    @Override // j35.g0
    public void a(int i17, int i18, android.content.Intent intent) {
        android.content.Intent intent2 = this.f270503b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApplicationUtil", "onRequestPermissionsResult, resultCode = %d", java.lang.Integer.valueOf(i18));
        j35.d dVar = this.f270504c;
        if (i18 != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ApplicationUtil", "no get!!!");
            dp.a.m125853x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.h9z, 1).show();
            if (dVar != null) {
                dVar.a(false);
                return;
            }
            return;
        }
        try {
            android.content.Context context = this.f270502a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/model/app/ApplicationUtil$1", "onRequestPermissionsResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/pluginsdk/model/app/ApplicationUtil$1", "onRequestPermissionsResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ApplicationUtil", e17, "install app failed! %s", intent2);
        }
        if (dVar != null) {
            dVar.a(true);
        }
    }
}
