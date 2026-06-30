package com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d;

/* loaded from: classes.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f129209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f129210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.x f129211f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s f129212g;

    public p(android.content.Context context, android.content.Intent intent, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.x xVar, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar) {
        this.f129209d = context;
        this.f129210e = intent;
        this.f129211f = xVar;
        this.f129212g = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f129209d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f129210e);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/luggage/sdk/processes/LuggageMiniProgramProcessManager$onStartWxaApp$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/luggage/sdk/processes/LuggageMiniProgramProcessManager$onStartWxaApp$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageMiniProgramProcessManager", "onStartWxaApp--END-- strategy:" + this.f129211f + ", app:" + this.f129212g);
    }
}
