package com.tencent.mm.plugin.clean.ui.fileindexui;

@db5.a(35)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/clean/ui/fileindexui/StorageDisableAlertUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes11.dex */
public final class StorageDisableAlertUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f95799h = 0;

    /* renamed from: d, reason: collision with root package name */
    public double f95800d = -1.0d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f95801e = true;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f95802f = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y1 f95803g;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        setActionbarColor(0);
        setMMTitle("");
        hideActionbarLine();
        hideActionBarOperationArea();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StorageDisableAlertUI", "onCreate");
        boolean z17 = l75.d1.f316945a;
        if (l75.d1.f316949e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StorageDisableAlertUI", "dialogShowing return");
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).q(new cw1.m7(this));
        if (l75.d1.f316948d) {
            this.f95802f = "start";
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        boolean z17 = l75.d1.f316945a;
        if (l75.d1.f316949e && j62.e.g().l("clicfg_clean_no_space_alert_warm_launch", true, true, true)) {
            l75.d1.f316949e = false;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.StorageDisableAlertUI", "onResume, fistResume = " + this.f95801e);
        if (this.f95801e) {
            this.f95801e = false;
            return;
        }
        if (fp.r0.f265232a.e() || lp.l.b(this)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StorageDisableAlertUI", "onResume, storage is still not sufficient");
            jx3.f.INSTANCE.g(25984, true, true, false, 204, this.f95802f);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StorageDisableAlertUI", "onResume, storage is sufficient");
        jx3.f.INSTANCE.g(25984, true, true, false, 205, this.f95802f);
        boolean z17 = l75.d1.f316945a;
        if (!l75.d1.f316948d) {
            l75.d1.f316949e = false;
            finish();
            return;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, 0, new android.content.Intent(), 335544320);
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) context.getSystemService("alarm");
        long currentTimeMillis = java.lang.System.currentTimeMillis() + 100;
        zj0.a aVar = new zj0.a();
        aVar.c(activity);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        aVar.c(java.lang.Long.valueOf(currentTimeMillis));
        aVar.c(1);
        yj0.a.d(alarmManager, aVar.b(), "com/tencent/mm/ui/MMAppMgr", "restartApp", "()V", "android/app/AlarmManager_EXEC_", "set", "(IJLandroid/app/PendingIntent;)V");
        int intValue = ((java.lang.Integer) aVar.a(0)).intValue();
        zj0.c.f473285a.set(aVar);
        alarmManager.set(intValue, ((java.lang.Long) aVar.a(1)).longValue(), (android.app.PendingIntent) zj0.c.a().a(2));
        yj0.a.f(alarmManager, "com/tencent/mm/ui/MMAppMgr", "restartApp", "()V", "android/app/AlarmManager_EXEC_", "set", "(IJLandroid/app/PendingIntent;)V");
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/MMAppMgr", "restartApp", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/ui/MMAppMgr", "restartApp", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/ui/MMAppMgr", "restartApp", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
        java.lang.System.exit(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(obj2, "com/tencent/mm/ui/MMAppMgr", "restartApp", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
    }
}
