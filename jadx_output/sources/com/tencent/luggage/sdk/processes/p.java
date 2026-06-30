package com.tencent.luggage.sdk.processes;

/* loaded from: classes.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f47676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f47677e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.processes.x f47678f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.processes.s f47679g;

    public p(android.content.Context context, android.content.Intent intent, com.tencent.luggage.sdk.processes.x xVar, com.tencent.luggage.sdk.processes.s sVar) {
        this.f47676d = context;
        this.f47677e = intent;
        this.f47678f = xVar;
        this.f47679g = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f47676d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f47677e);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/luggage/sdk/processes/LuggageMiniProgramProcessManager$onStartWxaApp$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/luggage/sdk/processes/LuggageMiniProgramProcessManager$onStartWxaApp$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mars.xlog.Log.i("Luggage.LuggageMiniProgramProcessManager", "onStartWxaApp--END-- strategy:" + this.f47678f + ", app:" + this.f47679g);
    }
}
