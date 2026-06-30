package cb;

/* loaded from: classes13.dex */
public final class s extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public cb.r f40180a;

    public s(cb.r rVar) {
        this.f40180a = rVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        cb.r rVar = this.f40180a;
        if (rVar != null && rVar.c()) {
            com.google.firebase.iid.FirebaseInstanceId.m();
            cb.r rVar2 = this.f40180a;
            synchronized (com.google.firebase.iid.FirebaseInstanceId.class) {
                if (com.google.firebase.iid.FirebaseInstanceId.f44648i == null) {
                    com.google.firebase.iid.FirebaseInstanceId.f44648i = new java.util.concurrent.ScheduledThreadPoolExecutor(1);
                }
                com.google.firebase.iid.FirebaseInstanceId.f44648i.schedule(rVar2, 0L, java.util.concurrent.TimeUnit.SECONDS);
            }
            xa.b bVar = this.f40180a.f40178f.f44649a;
            bVar.d();
            bVar.f452752a.unregisterReceiver(this);
            this.f40180a = null;
        }
    }
}
