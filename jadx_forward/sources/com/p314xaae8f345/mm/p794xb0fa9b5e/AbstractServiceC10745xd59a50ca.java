package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* renamed from: com.tencent.mm.ipcinvoker.BaseIPCService */
/* loaded from: classes7.dex */
public abstract class AbstractServiceC10745xd59a50ca extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public final lk0.b f149858d = new com.p314xaae8f345.mm.p794xb0fa9b5e.b(this);

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        rk0.c.c("IPC.BaseIPCService", "onBind(%s), killSelf(%s)", intent, java.lang.Boolean.FALSE);
        if (intent != null) {
            rk0.c.c("MicoMsg.proc.ServiceConnection", "#tagOfServiceIntent: " + intent.getStringExtra("ams_pull_service_proc") + ", caller=" + intent.getStringExtra("ams_pull_service_from") + ", id=" + intent.getIntExtra("ams_pull_service_id", -1), new java.lang.Object[0]);
        }
        if (com.p314xaae8f345.mm.p794xb0fa9b5e.j0.f149891b == null) {
            synchronized (com.p314xaae8f345.mm.p794xb0fa9b5e.j0.class) {
                if (com.p314xaae8f345.mm.p794xb0fa9b5e.j0.f149891b == null) {
                    com.p314xaae8f345.mm.p794xb0fa9b5e.j0.f149891b = new com.p314xaae8f345.mm.p794xb0fa9b5e.j0();
                }
            }
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.j0 j0Var = com.p314xaae8f345.mm.p794xb0fa9b5e.j0.f149891b;
        java.lang.String a17 = com.p314xaae8f345.mm.p794xb0fa9b5e.y.a();
        j0Var.getClass();
        if (a17 != null && a17.length() != 0) {
            ((java.util.HashMap) j0Var.f149892a).put(a17, this);
        }
        return this.f149858d;
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        rk0.c.c("IPC.BaseIPCService", "onUnbind(%s)", intent);
        return super.onUnbind(intent);
    }
}
