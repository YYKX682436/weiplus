package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1253x3112b486;

/* renamed from: com.tencent.mm.plugin.backup.backuppcmove.BackupPcService */
/* loaded from: classes8.dex */
public class C12833x7b210580 extends com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5 {

    /* renamed from: i, reason: collision with root package name */
    public boolean f174060i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f174061m = false;

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public java.lang.String b() {
        return "MicroMsg.BackupPcService";
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public android.os.IBinder c(android.content.Intent intent) {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcService", "onCreate.");
        super.d();
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public void e() {
        super.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcService", "onDestroy thread:" + java.lang.Thread.currentThread().getName());
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public int g(android.content.Intent intent, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcService", "onStartCommand.");
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BackupPcService", "onStartCommand intent is null");
            return 2;
        }
        java.lang.String stringExtra = intent.getStringExtra("url");
        java.lang.String stringExtra2 = intent.getStringExtra("deviceName");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPcService", "onStartCommand url is null");
            m77854x66357a6e();
            return 2;
        }
        this.f174060i = intent.getBooleanExtra("isFromWifi", false);
        this.f174061m = intent.getBooleanExtra("isMove", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcService", "onStartCommand Broadcast url:%s, isFromWifi:%b, isMove:%b", stringExtra, java.lang.Boolean.valueOf(this.f174060i), java.lang.Boolean.valueOf(this.f174061m));
        if (this.f174061m || c01.d9.h()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new qn1.d0(this, stringExtra, stringExtra2));
            return 2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPcService", "onStartCommand onStartCommand not in Login state");
        android.content.Intent className = new android.content.Intent().setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "com.tencent.mm.ui.LauncherUI");
        className.addFlags(335544320);
        className.putExtra("nofification_type", "back_to_pcmgr_notification");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(className);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/backup/backuppcmove/BackupPcService", "onStartCommand", "(Landroid/content/Intent;II)I", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        android.content.Intent intent2 = (android.content.Intent) arrayList.get(0);
        android.app.Service service = this.f274739f;
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
