package com.p314xaae8f345.mm.p2494xed8d1e6f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/process/KillProcessHelperActivity;", "Landroid/app/Activity;", "<init>", "()V", "m45/a", "plugin-comm_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.process.KillProcessHelperActivity */
/* loaded from: classes7.dex */
public final class ActivityC19773xfc12304e extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c {

    /* renamed from: d, reason: collision with root package name */
    public static final m45.a f273682d = new m45.a(null);

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KillProcessHelperActivity", "onCreate() called with: savedInstanceState = " + bundle);
        super.onCreate(bundle);
        android.app.ActivityManager activityManager = (android.app.ActivityManager) getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        int myPid = android.os.Process.myPid();
        int myUid = android.os.Process.myUid();
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.uid == myUid && (i17 = runningAppProcessInfo.pid) != myPid) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/process/ProcessOperator", "killOtherProcessExceptSelf", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(obj, "com/tencent/mm/process/ProcessOperator", "killOtherProcessExceptSelf", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            }
        }
        android.content.Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (launchIntentForPackage == null) {
            launchIntentForPackage = new android.content.Intent();
            launchIntentForPackage.setComponent(new android.content.ComponentName(this, "com.tencent.mm.ui.LauncherUI"));
        }
        launchIntentForPackage.putExtra("Intro_Need_Clear_Top ", true);
        launchIntentForPackage.addFlags(67108864);
        launchIntentForPackage.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
        launchIntentForPackage.addFlags(268468224);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(launchIntentForPackage);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/process/KillProcessHelperActivity", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(this, "com/tencent/mm/process/KillProcessHelperActivity", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
        int myPid2 = android.os.Process.myPid();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(java.lang.Integer.valueOf(myPid2));
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj2, arrayList3.toArray(), "com/tencent/mm/process/ProcessOperator", "killSelfProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(obj2, "com/tencent/mm/process/ProcessOperator", "killSelfProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }
}
