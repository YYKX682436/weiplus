package com.tencent.mm.plugin.backup.backuppcmove;

/* loaded from: classes8.dex */
public class BackupPcService extends com.tencent.mm.service.MMService {

    /* renamed from: i, reason: collision with root package name */
    public boolean f92527i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f92528m = false;

    @Override // com.tencent.mm.service.MMService
    public java.lang.String b() {
        return "MicroMsg.BackupPcService";
    }

    @Override // com.tencent.mm.service.MMService
    public android.os.IBinder c(android.content.Intent intent) {
        return null;
    }

    @Override // com.tencent.mm.service.MMService
    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcService", "onCreate.");
        super.d();
    }

    @Override // com.tencent.mm.service.MMService
    public void e() {
        super.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcService", "onDestroy thread:" + java.lang.Thread.currentThread().getName());
    }

    @Override // com.tencent.mm.service.MMService
    public int g(android.content.Intent intent, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcService", "onStartCommand.");
        if (intent == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BackupPcService", "onStartCommand intent is null");
            return 2;
        }
        java.lang.String stringExtra = intent.getStringExtra("url");
        java.lang.String stringExtra2 = intent.getStringExtra("deviceName");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupPcService", "onStartCommand url is null");
            stopSelf();
            return 2;
        }
        this.f92527i = intent.getBooleanExtra("isFromWifi", false);
        this.f92528m = intent.getBooleanExtra("isMove", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcService", "onStartCommand Broadcast url:%s, isFromWifi:%b, isMove:%b", stringExtra, java.lang.Boolean.valueOf(this.f92527i), java.lang.Boolean.valueOf(this.f92528m));
        if (this.f92528m || c01.d9.h()) {
            com.tencent.mm.sdk.platformtools.u3.h(new qn1.d0(this, stringExtra, stringExtra2));
            return 2;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.BackupPcService", "onStartCommand onStartCommand not in Login state");
        android.content.Intent className = new android.content.Intent().setClassName(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.mm.ui.LauncherUI");
        className.addFlags(335544320);
        className.putExtra("nofification_type", "back_to_pcmgr_notification");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(className);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/backup/backuppcmove/BackupPcService", "onStartCommand", "(Landroid/content/Intent;II)I", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        android.content.Intent intent2 = (android.content.Intent) arrayList.get(0);
        android.app.Service service = this.f193206f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(service, arrayList2.toArray(), "com/tencent/mm/service/MMService", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        service.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(service, "com/tencent/mm/service/MMService", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.f(this, "com/tencent/mm/plugin/backup/backuppcmove/BackupPcService", "onStartCommand", "(Landroid/content/Intent;II)I", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return 2;
    }
}
