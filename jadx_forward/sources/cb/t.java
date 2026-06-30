package cb;

/* loaded from: classes13.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f121714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f121715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p271xde6bf207.iid.zzb f121716f;

    public t(com.p176xb6135e39.p271xde6bf207.iid.zzb zzbVar, android.content.Intent intent, android.content.Intent intent2) {
        this.f121716f = zzbVar;
        this.f121714d = intent;
        this.f121715e = intent2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Intent intent = this.f121714d;
        com.p176xb6135e39.p271xde6bf207.iid.zzb zzbVar = this.f121716f;
        zzbVar.d(intent);
        zzbVar.a(this.f121715e);
    }
}
