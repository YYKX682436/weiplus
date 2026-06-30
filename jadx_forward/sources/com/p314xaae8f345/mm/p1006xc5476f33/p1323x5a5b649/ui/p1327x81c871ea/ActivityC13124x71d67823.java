package com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea;

@db5.a(m123858x6ac9171 = 35)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/clean/ui/fileindexui/StorageDisableAlertUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.clean.ui.fileindexui.StorageDisableAlertUI */
/* loaded from: classes11.dex */
public final class ActivityC13124x71d67823 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f177332h = 0;

    /* renamed from: d, reason: collision with root package name */
    public double f177333d = -1.0d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f177334e = true;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f177335f = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f177336g;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        mo64405x4dab7448(0);
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo78529xe76c1b79();
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StorageDisableAlertUI", "onCreate");
        boolean z17 = l75.d1.f398478a;
        if (l75.d1.f398482e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StorageDisableAlertUI", "dialogShowing return");
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).q(new cw1.m7(this));
        if (l75.d1.f398481d) {
            this.f177335f = "start";
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        boolean z17 = l75.d1.f398478a;
        if (l75.d1.f398482e && j62.e.g().l("clicfg_clean_no_space_alert_warm_launch", true, true, true)) {
            l75.d1.f398482e = false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StorageDisableAlertUI", "onResume, fistResume = " + this.f177334e);
        if (this.f177334e) {
            this.f177334e = false;
            return;
        }
        if (fp.r0.f346765a.e() || lp.l.b(this)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StorageDisableAlertUI", "onResume, storage is still not sufficient");
            jx3.f.INSTANCE.g(25984, true, true, false, 204, this.f177335f);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StorageDisableAlertUI", "onResume, storage is sufficient");
        jx3.f.INSTANCE.g(25984, true, true, false, 205, this.f177335f);
        boolean z17 = l75.d1.f398478a;
        if (!l75.d1.f398481d) {
            l75.d1.f398482e = false;
            finish();
            return;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, 0, new android.content.Intent(), 335544320);
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) context.getSystemService("alarm");
        long currentTimeMillis = java.lang.System.currentTimeMillis() + 100;
        zj0.a aVar = new zj0.a();
        aVar.c(activity);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        aVar.c(java.lang.Long.valueOf(currentTimeMillis));
        aVar.c(1);
        yj0.a.d(alarmManager, aVar.b(), "com/tencent/mm/ui/MMAppMgr", "restartApp", "()V", "android/app/AlarmManager_EXEC_", "set", "(IJLandroid/app/PendingIntent;)V");
        int intValue = ((java.lang.Integer) aVar.a(0)).intValue();
        zj0.c.f554818a.set(aVar);
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
