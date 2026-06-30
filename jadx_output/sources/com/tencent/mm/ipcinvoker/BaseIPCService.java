package com.tencent.mm.ipcinvoker;

/* loaded from: classes7.dex */
public abstract class BaseIPCService extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public final lk0.b f68325d = new com.tencent.mm.ipcinvoker.b(this);

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        rk0.c.c("IPC.BaseIPCService", "onBind(%s), killSelf(%s)", intent, java.lang.Boolean.FALSE);
        if (intent != null) {
            rk0.c.c("MicoMsg.proc.ServiceConnection", "#tagOfServiceIntent: " + intent.getStringExtra("ams_pull_service_proc") + ", caller=" + intent.getStringExtra("ams_pull_service_from") + ", id=" + intent.getIntExtra("ams_pull_service_id", -1), new java.lang.Object[0]);
        }
        if (com.tencent.mm.ipcinvoker.j0.f68358b == null) {
            synchronized (com.tencent.mm.ipcinvoker.j0.class) {
                if (com.tencent.mm.ipcinvoker.j0.f68358b == null) {
                    com.tencent.mm.ipcinvoker.j0.f68358b = new com.tencent.mm.ipcinvoker.j0();
                }
            }
        }
        com.tencent.mm.ipcinvoker.j0 j0Var = com.tencent.mm.ipcinvoker.j0.f68358b;
        java.lang.String a17 = com.tencent.mm.ipcinvoker.y.a();
        j0Var.getClass();
        if (a17 != null && a17.length() != 0) {
            ((java.util.HashMap) j0Var.f68359a).put(a17, this);
        }
        return this.f68325d;
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        rk0.c.c("IPC.BaseIPCService", "onUnbind(%s)", intent);
        return super.onUnbind(intent);
    }
}
