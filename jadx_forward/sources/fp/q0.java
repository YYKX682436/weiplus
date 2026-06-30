package fp;

/* loaded from: classes.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f346764d;

    public q0(android.app.Activity activity) {
        this.f346764d = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageName(), "com.tencent.mm.plugin.clean.ui.fileindexui.StorageDisableAlertUI"));
        android.app.Activity activity = this.f346764d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/compatible/util/StorageDisableAlert$showStorageDisableAlert$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/compatible/util/StorageDisableAlert$showStorageDisableAlert$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f346764d.overridePendingTransition(0, 0);
    }
}
