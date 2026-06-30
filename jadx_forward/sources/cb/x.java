package cb;

/* loaded from: classes13.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cb.u f121724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cb.w f121725e;

    public x(cb.w wVar, cb.u uVar) {
        this.f121725e = wVar;
        this.f121724d = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.util.Log.isLoggable("EnhancedIntentService", 3);
        com.p176xb6135e39.p271xde6bf207.iid.zzb zzbVar = this.f121725e.f121723d;
        cb.u uVar = this.f121724d;
        zzbVar.d(uVar.f121717a);
        uVar.a();
    }
}
