package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* loaded from: classes8.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.r f148787d;

    public q(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.r rVar) {
        this.f148787d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.r rVar = this.f148787d;
        q80.f0 f0Var = rVar.f148791d;
        if (f0Var != null) {
            f0Var.mo555x2fd71e();
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://www.wechat.com"));
        android.content.Context context = rVar.f148792e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/lite/LiteAppFeatureService$17$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/lite/LiteAppFeatureService$17$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
