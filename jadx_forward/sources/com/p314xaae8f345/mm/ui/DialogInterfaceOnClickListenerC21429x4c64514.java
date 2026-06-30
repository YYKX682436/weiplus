package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.NoRomSpaceDexUI */
/* loaded from: classes3.dex */
public class DialogInterfaceOnClickListenerC21429x4c64514 extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public android.app.PendingIntent f278569d;

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.app.ActivityManager activityManager;
        java.util.List<android.app.ActivityManager.AppTask> appTasks;
        android.app.PendingIntent pendingIntent = this.f278569d;
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (android.app.PendingIntent.CanceledException unused) {
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 29 && (activityManager = (android.app.ActivityManager) getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)) != null && (appTasks = activityManager.getAppTasks()) != null) {
            java.util.Iterator<android.app.ActivityManager.AppTask> it = appTasks.iterator();
            while (it.hasNext()) {
                it.next().finishAndRemoveTask();
            }
        }
        finish();
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/NoRomSpaceDexUI", "onClick", "(Landroid/content/DialogInterface;I)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/ui/NoRomSpaceDexUI", "onClick", "(Landroid/content/DialogInterface;I)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.c7z);
        android.content.Intent intent = getIntent();
        this.f278569d = (android.app.PendingIntent) intent.getParcelableExtra("action");
        com.p314xaae8f345.mm.ui.i9 i9Var = new com.p314xaae8f345.mm.ui.i9(this);
        if (intent.hasExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28)) {
            i9Var.setTitle(intent.getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28));
        } else {
            i9Var.setTitle(intent.getIntExtra("titleRes", com.p314xaae8f345.mm.R.C30867xcad56011.f572430b72));
        }
        if (intent.hasExtra(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)) {
            java.lang.String stringExtra = intent.getStringExtra(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
            i9Var.f290446i.setVisibility(0);
            i9Var.f290444g.setVisibility(0);
            i9Var.f290444g.setText(stringExtra);
        } else {
            int intExtra = intent.getIntExtra("messageRes", com.p314xaae8f345.mm.R.C30867xcad56011.f572429b71);
            i9Var.f290446i.setVisibility(0);
            i9Var.f290444g.setVisibility(0);
            i9Var.f290444g.setText(intExtra);
        }
        if (intent.hasExtra("button")) {
            java.lang.String stringExtra2 = intent.getStringExtra(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
            i9Var.f290446i.setVisibility(0);
            i9Var.f290444g.setVisibility(0);
            i9Var.f290444g.setText(stringExtra2);
        } else {
            java.lang.String string = getString(intent.getIntExtra("buttonRes", com.p314xaae8f345.mm.R.C30867xcad56011.f572428b70));
            android.widget.Button button = i9Var.f290442e;
            if (button != null) {
                button.setVisibility(0);
                i9Var.f290442e.setText(string);
                i9Var.f290442e.setOnClickListener(new com.p314xaae8f345.mm.ui.g9(i9Var, this, true));
            }
        }
        i9Var.setCancelable(false);
        i9Var.c(false);
        i9Var.show();
    }
}
