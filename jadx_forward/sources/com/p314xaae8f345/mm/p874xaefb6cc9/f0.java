package com.p314xaae8f345.mm.p874xaefb6cc9;

/* loaded from: classes7.dex */
public final class f0 implements com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25500xaecc0aa5, ce.y {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p874xaefb6cc9.f0 f150601a = new com.p314xaae8f345.mm.p874xaefb6cc9.f0();

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f150602b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile android.content.Intent f150603c;

    public static final void a(com.p314xaae8f345.mm.p874xaefb6cc9.f0 f0Var, android.content.Context context, android.content.Intent intent, boolean z17) {
        pa1.t b17 = f0Var.b();
        if (b17 == null) {
            return;
        }
        ym5.a1.f(new com.p314xaae8f345.mm.p874xaefb6cc9.c0(f0Var));
        com.p314xaae8f345.mm.p874xaefb6cc9.y.f150694i = true;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = f150602b;
        if (o6Var == null || o6Var.L0() || o6Var.S) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WVA.WVAActivityDelegate", "getRenderer but runtime is finishing");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 N2 = o6Var.N2();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(N2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.game.page.WAGamePageView");
        return ((pa1.o) N2).o4();
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25500xaecc0aa5
    /* renamed from: moveToForeground */
    public void mo46919x39b9148f() {
        pa1.t b17 = b();
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WVA.WVAActivityDelegate", "moveToForeground, getRenderer is null");
        } else {
            b17.Z(false);
        }
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25500xaecc0aa5
    /* renamed from: startActivity */
    public void mo46920xa4df9991(android.content.Intent intent, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVA.WVAActivityDelegate", "WVA.startActivity() called with: intent = [" + intent + "], runInBackground=[" + z17 + ']');
        ym5.a1.f(new com.p314xaae8f345.mm.p874xaefb6cc9.e0(intent, z17));
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25500xaecc0aa5
    /* renamed from: supportRunInBackground */
    public boolean mo46921xb09b2a8f() {
        return true;
    }
}
