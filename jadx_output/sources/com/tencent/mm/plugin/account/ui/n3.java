package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public final class n3 extends com.tencent.mm.app.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.o3 f74055d;

    public n3(com.tencent.mm.plugin.account.ui.o3 o3Var) {
        this.f74055d = o3Var;
    }

    @Override // com.tencent.mm.app.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity a17) {
        kotlin.jvm.internal.o.g(a17, "a");
        com.tencent.mm.plugin.account.ui.o3 o3Var = this.f74055d;
        android.app.Activity activity = (android.app.Activity) o3Var.f74080g.get();
        if (activity != null && activity == a17) {
            com.tencent.mm.plugin.account.ui.q3.f74128a.a(o3Var, o3Var.f74078e);
        } else if (activity == null) {
            a17.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }
}
