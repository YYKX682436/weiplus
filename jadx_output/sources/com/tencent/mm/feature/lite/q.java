package com.tencent.mm.feature.lite;

/* loaded from: classes8.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.r f67254d;

    public q(com.tencent.mm.feature.lite.r rVar) {
        this.f67254d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.feature.lite.r rVar = this.f67254d;
        q80.f0 f0Var = rVar.f67258d;
        if (f0Var != null) {
            f0Var.fail();
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://www.wechat.com"));
        android.content.Context context = rVar.f67259e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/lite/LiteAppFeatureService$17$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/lite/LiteAppFeatureService$17$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
