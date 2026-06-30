package cb;

/* loaded from: classes13.dex */
public final class w extends android.os.Binder {

    /* renamed from: d, reason: collision with root package name */
    public final com.google.firebase.iid.zzb f40190d;

    public w(com.google.firebase.iid.zzb zzbVar) {
        this.f40190d = zzbVar;
    }

    public final void a(cb.u uVar) {
        if (android.os.Binder.getCallingUid() != android.os.Process.myUid()) {
            throw new java.lang.SecurityException("Binding only allowed within app");
        }
        android.util.Log.isLoggable("EnhancedIntentService", 3);
        android.content.Intent intent = uVar.f40184a;
        com.google.firebase.iid.zzb zzbVar = this.f40190d;
        if (zzbVar.c(intent)) {
            uVar.a();
        } else {
            android.util.Log.isLoggable("EnhancedIntentService", 3);
            zzbVar.f44657d.execute(new cb.x(this, uVar));
        }
    }
}
