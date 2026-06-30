package cb;

/* loaded from: classes13.dex */
public final class w extends android.os.Binder {

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p271xde6bf207.iid.zzb f121723d;

    public w(com.p176xb6135e39.p271xde6bf207.iid.zzb zzbVar) {
        this.f121723d = zzbVar;
    }

    public final void a(cb.u uVar) {
        if (android.os.Binder.getCallingUid() != android.os.Process.myUid()) {
            throw new java.lang.SecurityException("Binding only allowed within app");
        }
        android.util.Log.isLoggable("EnhancedIntentService", 3);
        android.content.Intent intent = uVar.f121717a;
        com.p176xb6135e39.p271xde6bf207.iid.zzb zzbVar = this.f121723d;
        if (zzbVar.c(intent)) {
            uVar.a();
        } else {
            android.util.Log.isLoggable("EnhancedIntentService", 3);
            zzbVar.f126190d.execute(new cb.x(this, uVar));
        }
    }
}
