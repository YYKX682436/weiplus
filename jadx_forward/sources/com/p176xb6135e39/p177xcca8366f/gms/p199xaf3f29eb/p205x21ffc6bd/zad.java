package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* loaded from: classes13.dex */
final class zad extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zag {
    final /* synthetic */ android.content.Intent zaa;
    final /* synthetic */ android.app.Activity zab;
    final /* synthetic */ int zac;

    public zad(android.content.Intent intent, android.app.Activity activity, int i17) {
        this.zaa = intent;
        this.zab = activity;
        this.zac = i17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zag
    public final void zaa() {
        android.content.Intent intent = this.zaa;
        if (intent != null) {
            android.app.Activity activity = this.zab;
            int i17 = this.zac;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/google/android/gms/common/internal/zad", "zaa", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
    }
}
