package cb;

/* loaded from: classes13.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f40181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f40182e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.iid.zzb f40183f;

    public t(com.google.firebase.iid.zzb zzbVar, android.content.Intent intent, android.content.Intent intent2) {
        this.f40183f = zzbVar;
        this.f40181d = intent;
        this.f40182e = intent2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Intent intent = this.f40181d;
        com.google.firebase.iid.zzb zzbVar = this.f40183f;
        zzbVar.d(intent);
        zzbVar.a(this.f40182e);
    }
}
