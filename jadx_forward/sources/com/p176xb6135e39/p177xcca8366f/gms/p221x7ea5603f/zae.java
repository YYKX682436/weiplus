package com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f;

/* loaded from: classes.dex */
final class zae implements android.view.View.OnClickListener {

    /* renamed from: _hellAccFlag_ */
    private byte f6012x7f11beae;
    final /* synthetic */ android.content.Context zaa;
    final /* synthetic */ android.content.Intent zab;

    public zae(android.content.Context context, android.content.Intent intent) {
        this.zaa = context;
        this.zab = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        try {
            android.content.Context context = this.zaa;
            android.content.Intent intent = this.zab;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/google/android/gms/dynamic/zae", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/google/android/gms/dynamic/zae", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (android.content.ActivityNotFoundException unused) {
        }
    }
}
