package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036;

/* loaded from: classes.dex */
public class y implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f221568a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f221569b;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.a0 a0Var, android.content.Context context, android.content.Intent intent) {
        this.f221568a = context;
        this.f221569b = intent;
    }

    @Override // wd0.p1
    public void a() {
    }

    @Override // wd0.p1
    /* renamed from: onSuccess */
    public void mo977xe05b4124() {
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(c01.z1.j() & (-8388609)));
        android.content.Context context = this.f221568a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f221569b);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/game/luggage/LuggageGameInterceptor$1", "onSuccess", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/game/luggage/LuggageGameInterceptor$1", "onSuccess", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
