package com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3218xed8d1e6f;

/* renamed from: com.tencent.xweb.pinus.sdk.process.ContentChildProcessService */
/* loaded from: classes13.dex */
public class ServiceC27855x63099869 extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public vx5.a f301997d;

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        if (this.f301997d == null) {
            vx5.a aVar = new vx5.a(intent, this, getApplicationContext());
            this.f301997d = aVar;
            try {
                by5.c4.f("ChildProcessServiceWrapper", "onCreate, call");
                aVar.d().getMethod("onCreate", new java.lang.Class[0]).invoke(aVar.f522858f, new java.lang.Object[0]);
            } catch (java.lang.Throwable th6) {
                java.lang.String stackTraceString = android.util.Log.getStackTraceString(th6);
                by5.c4.d("ChildProcessServiceWrapper", "onCreate, error", th6);
                xx5.e.a(aVar.b(), aVar.f522857e, aVar.f522855c, 1, aVar.e(), stackTraceString);
            }
        }
        vx5.a aVar2 = this.f301997d;
        aVar2.getClass();
        try {
            by5.c4.f("ChildProcessServiceWrapper", "onBind, call");
            return (android.os.IBinder) aVar2.d().getMethod("onBind", android.content.Intent.class).invoke(aVar2.f522858f, intent);
        } catch (java.lang.Throwable th7) {
            java.lang.String stackTraceString2 = android.util.Log.getStackTraceString(th7);
            by5.c4.d("ChildProcessServiceWrapper", "onBind, error", th7);
            xx5.e.a(aVar2.b(), aVar2.f522857e, aVar2.f522855c, 2, aVar2.e(), stackTraceString2);
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        vx5.a aVar = this.f301997d;
        aVar.getClass();
        try {
            by5.c4.f("ChildProcessServiceWrapper", "onDestroy, call");
            aVar.d().getMethod("onDestroy", new java.lang.Class[0]).invoke(aVar.f522858f, new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(th6);
            by5.c4.d("ChildProcessServiceWrapper", "onDestroy, error", th6);
            xx5.e.a(aVar.b(), aVar.f522857e, aVar.f522855c, 3, aVar.e(), stackTraceString);
        }
        this.f301997d = null;
    }
}
