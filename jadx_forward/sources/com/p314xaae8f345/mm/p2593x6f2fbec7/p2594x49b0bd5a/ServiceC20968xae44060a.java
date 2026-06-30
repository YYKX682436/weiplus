package com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a;

/* renamed from: com.tencent.mm.sandbox.monitor.ExceptionMonitorService */
/* loaded from: classes11.dex */
public class ServiceC20968xae44060a extends android.app.Service implements com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.j {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.k f273817d = null;

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExceptionMonitorService", "onCreate()");
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.k kVar = new com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.k(1);
        this.f273817d = kVar;
        kVar.b(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExceptionMonitorService", "onDestroy()");
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.k kVar = this.f273817d;
        if (kVar != null) {
            q65.d.b(kVar.hashCode(), kVar);
            com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.k.f273826b.mo50300x3fa464aa(com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.k.f273827c);
            com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.k.f273828d = false;
            com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.k.f273825a = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExceptionMonitor", "onDestroy");
            this.f273817d = null;
        }
    }

    @Override // android.app.Service
    public void onStart(android.content.Intent intent, int i17) {
        super.onStart(intent, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExceptionMonitorService", "onStart()");
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.k kVar = this.f273817d;
        if (kVar != null) {
            kVar.a(intent);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExceptionMonitorService", "onStartCommand()");
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.k kVar = this.f273817d;
        if (kVar == null) {
            return 1;
        }
        kVar.a(intent);
        return 1;
    }
}
