package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class f0 implements com.tencent.shadow.core.common.IWVAComponentDelegateV2, ce.y {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.minigame.f0 f69068a = new com.tencent.mm.minigame.f0();

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.tencent.mm.plugin.appbrand.o6 f69069b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile android.content.Intent f69070c;

    public static final void a(com.tencent.mm.minigame.f0 f0Var, android.content.Context context, android.content.Intent intent, boolean z17) {
        pa1.t b17 = f0Var.b();
        if (b17 == null) {
            return;
        }
        ym5.a1.f(new com.tencent.mm.minigame.c0(f0Var));
        com.tencent.mm.minigame.y.f69161i = true;
        b17.Z(z17);
        lk5.s.e(intent, true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/minigame/WVAActivityDelegate", "startActivityImpl", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/minigame/WVAActivityDelegate", "startActivityImpl", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final pa1.t b() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = f69069b;
        if (o6Var == null || o6Var.L0() || o6Var.S) {
            com.tencent.mars.xlog.Log.w("WVA.WVAActivityDelegate", "getRenderer but runtime is finishing");
            return null;
        }
        com.tencent.mm.plugin.appbrand.page.n7 N2 = o6Var.N2();
        kotlin.jvm.internal.o.e(N2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.game.page.WAGamePageView");
        return ((pa1.o) N2).o4();
    }

    @Override // com.tencent.shadow.core.common.IWVAComponentDelegateV2
    public void moveToForeground() {
        pa1.t b17 = b();
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("WVA.WVAActivityDelegate", "moveToForeground, getRenderer is null");
        } else {
            b17.Z(false);
        }
    }

    @Override // com.tencent.shadow.core.common.IWVAComponentDelegateV2
    public void startActivity(android.content.Intent intent, boolean z17) {
        kotlin.jvm.internal.o.g(intent, "intent");
        com.tencent.mars.xlog.Log.i("WVA.WVAActivityDelegate", "WVA.startActivity() called with: intent = [" + intent + "], runInBackground=[" + z17 + ']');
        ym5.a1.f(new com.tencent.mm.minigame.e0(intent, z17));
    }

    @Override // com.tencent.shadow.core.common.IWVAComponentDelegateV2
    public boolean supportRunInBackground() {
        return true;
    }
}
